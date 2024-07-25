package br.ufscar.dc.compiladores.la.semantico;

import br.ufscar.dc.compiladores.la.semantico.TabelaDeSimbolos.TipoLa;
import java.util.List;
import java.util.Map;


public class LaSemantico extends LaSemanticBaseVisitor<Void> {

    // Gerencia os escopos do programa
    public static Escopos escopos = new Escopos();

    @Override
    public Void visitPrograma(LaSemanticParser.ProgramaContext ctx) {
        escopos.criarNovoEscopo();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(LaSemanticParser.Declaracao_localContext ctx) {
        TabelaDeSimbolos tabelaLocal = escopos.obterEscopoAtual();

        if (ctx.variavel() != null) {
            // Itera sobre todos os identificadores na declaração de variável
            for (LaSemanticParser.IdentificadorContext identificador : ctx.variavel().identificador()) {
                String nomeVar = identificador.getText();
                String strTipoVar = ctx.variavel().tipo().getText();
                TipoLa tipoVar = obterTipo(strTipoVar);

                // Verifica se a variável já foi declarada
                if (tabelaLocal.existe(nomeVar)) {
                    LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                            "identificador " + nomeVar + " ja declarado anteriormente");
                } else if (tipoVar == TipoLa.INVALIDO) {
                    // Verifica se o tipo é válido
                    LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                            "tipo " + strTipoVar + " nao declarado");
                    tabelaLocal.adicionar(nomeVar, tipoVar);
                } else {
                    // Adiciona a variável na tabela de símbolos
                    tabelaLocal.adicionar(nomeVar, tipoVar);    
                }
            }
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitDeclaracao_global(LaSemanticParser.Declaracao_globalContext ctx) {
        TabelaDeSimbolos tabelaGlobal = escopos.obterEscopoAtual();
        String nome = ctx.IDENT().getText();

        // Verifica se o identificador já foi declarado
        if (tabelaGlobal.existe(nome)) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(),
                    "identificador " + nome + " ja declarado anteriormente");
        } else {
            // Adiciona função ou procedimento na tabela global
            TipoLa tipo = ctx.tipo_estendido() != null ? obterTipo(ctx.tipo_estendido().getText()) : TipoLa.INVALIDO;
            if (ctx.tipo_estendido() != null && tipo == TipoLa.INVALIDO) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(),
                        "tipo " + ctx.tipo_estendido().getText() + " nao declarado");
            }
            tabelaGlobal.adicionar(nome, tipo);

            // Cria novo escopo para os parâmetros da função ou procedimento
            escopos.criarNovoEscopo();
            if (ctx.parametros() != null) {
                List<LaSemanticParser.ParametroContext> parametros = ctx.parametros().parametro();
                for (LaSemanticParser.ParametroContext param : parametros) {
                    for (LaSemanticParser.IdentificadorContext identificador : param.identificador()) {
                        String nomeParam = identificador.getText();
                        String tipoParam = param.tipo_estendido().getText();
                        TipoLa tipoParamLa = obterTipo(tipoParam);

                        // Verifica se o tipo do parâmetro é válido
                        if (tipoParamLa == TipoLa.INVALIDO) {
                            LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                                    "tipo " + tipoParam + " nao declarado");
                        } else if (escopos.obterEscopoAtual().existe(nomeParam)) {
                            // Verifica se o identificador do parâmetro já foi declarado
                            LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                                    "identificador " + nomeParam + " ja declarado anteriormente");
                        } else {
                            // Adiciona o parâmetro na tabela de símbolos do escopo atual
                            escopos.obterEscopoAtual().adicionar(nomeParam, tipoParamLa);
                        }
                    }
                }
            }
            escopos.abandonarEscopo();
        }
        return super.visitDeclaracao_global(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(LaSemanticParser.CmdAtribuicaoContext ctx) {
        // Verifica o tipo da expressão
        TipoLa tipoExpressao = LaSemanticoUtils.verificarTipo(escopos.obterEscopoAtual(), ctx.expressao());
        String nomeVar = ctx.identificador().getText();

        // Verifica se a variável foi declarada
        if (!escopos.obterEscopoAtual().existe(nomeVar)) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(),
                    "identificador " + nomeVar + " nao declarado");
        } else {
            // Verifica se o tipo da variável é compatível com o tipo da expressão
            TipoLa tipoVariavel = escopos.obterEscopoAtual().verificar(nomeVar);

            if (!tipoCompativel(tipoVariavel, tipoExpressao)) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(),
                        "atribuicao nao compativel para " + nomeVar);
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }

    @Override
    public Void visitCmdEnquanto(LaSemanticParser.CmdEnquantoContext ctx) {
        TabelaDeSimbolos tabelaEnquanto = escopos.obterEscopoAtual();

        // Verifica se a expressão no comando 'enquanto' é do tipo lógico
        TabelaDeSimbolos.TipoLa tipo = LaSemanticoUtils.verificarTipo(tabelaEnquanto,
                ctx.expressao());
        if (tipo != TabelaDeSimbolos.TipoLa.LOG) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.expressao().start,
                    "Expressão no comando 'enquanto' não é do tipo lógico");
        }

        return super.visitCmdEnquanto(ctx);
    }

    @Override
    public Void visitCmdEscreva(LaSemanticParser.CmdEscrevaContext ctx) {
        TabelaDeSimbolos tabelaEscreva = escopos.obterEscopoAtual();

        // Verifica o tipo das expressões nos comandos 'escreva'
        for (LaSemanticParser.ExpressaoContext expressao : ctx.expressao()) {
            TabelaDeSimbolos.TipoLa tipo = LaSemanticoUtils.verificarTipo(tabelaEscreva,
                    expressao);
        }

        return super.visitCmdEscreva(ctx);
    }


    @Override
    public Void visitCmdLeia(LaSemanticParser.CmdLeiaContext ctx) {
        List<LaSemanticParser.IdentificadorContext> identificadores = ctx.identificador();
        for (LaSemanticParser.IdentificadorContext identificador : identificadores) {
            String nomeVar = identificador.getText();
            // Verifica se o identificador foi declarado
            if (!escopos.obterEscopoAtual().existe(nomeVar)) {
                LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                        "identificador " + nomeVar + " nao declarado");
            }
        }
        return super.visitCmdLeia(ctx);
    }
    private TipoLa obterTipo(String strTipo) {
        switch (strTipo) {
            case "inteiro":
                return TipoLa.INT;
            case "real":
                return TipoLa.REAL;
            case "literal":
                return TipoLa.LIT;
            case "logico":
                return TipoLa.LOG;
            default:
                return TipoLa.INVALIDO;
        }
    }

    public static boolean tipoCompativel(TipoLa tipoVar, TipoLa tipoExpr) {
        if (tipoVar == tipoExpr) {
            return true;
        }
        // Inteiros podem ser atribuídos a reais e vice-versa
        if ((tipoVar == TabelaDeSimbolos.TipoLa.REAL && tipoExpr == TabelaDeSimbolos.TipoLa.INT) ||
                (tipoVar == TabelaDeSimbolos.TipoLa.INT && tipoExpr == TabelaDeSimbolos.TipoLa.REAL)) {
            return true;
        }
        return false;
    }
}
