package br.ufscar.dc.compiladores.la.semantico;

import br.ufscar.dc.compiladores.la.semantico.TabelaDeSimbolos.TipoLa;
import java.util.List;

public class LaSemantico extends LaSemanticBaseVisitor<Void> {

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
            for (LaSemanticParser.IdentificadorContext identificador : ctx.variavel().identificador()) {
                String nomeVar = identificador.getText();
                String strTipoVar = ctx.variavel().tipo().getText();
                TipoLa tipoVar = obterTipo(strTipoVar);

                if (tabelaLocal.existe(nomeVar)) {
                    LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                            "identificador " + nomeVar + " ja declarado anteriormente");
                } else if (tipoVar == TipoLa.INVALIDO) {
                    LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                            "tipo " + strTipoVar + " nao declarado");
                } else {
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

        if (tabelaGlobal.existe(nome)) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(),
                    "identificador " + nome + " ja declarado anteriormente");
        } else {
            // Adiciona função ou procedimento
            TipoLa tipo = ctx.tipo_estendido() != null ? obterTipo(ctx.tipo_estendido().getText()) : TipoLa.INVALIDO;
            if (ctx.tipo_estendido() != null && tipo == TipoLa.INVALIDO) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(),
                        "tipo " + ctx.tipo_estendido().getText() + " nao declarado");
            }
            tabelaGlobal.adicionar(nome, tipo);

            escopos.criarNovoEscopo();
            // Adiciona parâmetros da função ou procedimento
            if (ctx.parametros() != null) {
                List<LaSemanticParser.ParametroContext> parametros = ctx.parametros().parametro();
                for (LaSemanticParser.ParametroContext param : parametros) {
                    for (LaSemanticParser.IdentificadorContext identificador : param.identificador()) {
                        String nomeParam = identificador.getText();
                        String tipoParam = param.tipo_estendido().getText();
                        TipoLa tipoParamLa = obterTipo(tipoParam);

                        if (tipoParamLa == TipoLa.INVALIDO) {
                            LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                                    "tipo " + tipoParam + " nao declarado");
                        } else if (escopos.obterEscopoAtual().existe(nomeParam)) {
                            LaSemanticoUtils.adicionarErroSemantico(identificador.getStart(),
                                    "identificador " + nomeParam + " ja declarado anteriormente");
                        } else {
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
        TipoLa tipoExpressao = LaSemanticoUtils.verificarTipo(escopos.obterEscopoAtual(), ctx.expressao());
        String nomeVar = ctx.identificador().getText();
    
        if (!escopos.obterEscopoAtual().existe(nomeVar)) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.identificador().getStart(),
                    "identificador " + nomeVar + " nao declarado");
        } else {
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
        if ((tipoVar == TabelaDeSimbolos.TipoLa.REAL && tipoExpr == TabelaDeSimbolos.TipoLa.INT) ||
            (tipoVar == TabelaDeSimbolos.TipoLa.INT && tipoExpr == TabelaDeSimbolos.TipoLa.REAL)) {
            return true;
        }
        return false;
    }
}
