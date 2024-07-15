package br.ufscar.dc.compiladores.la.semantico;

import br.ufscar.dc.compiladores.la.semantico.TabelaDeSimbolos.TipoLa;

public class LaSemantico extends LaSemanticBaseVisitor<Void> {

    Escopos escopos = new Escopos();

    @Override
    public Void visitPrograma(LaSemanticParser.ProgramaContext ctx) {
        escopos.criarNovoEscopo();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(LaSemanticParser.Declaracao_localContext ctx) {
        TabelaDeSimbolos tabelaLocal = escopos.obterEscopoAtual();

        if (ctx.variavel() != null) {
            for (var identificador : ctx.variavel().identificador()) {
                String nomeVar = identificador.getText();
                String strTipoVar = ctx.variavel().tipo().getText();
                TipoLa tipoVar = obterTipo(strTipoVar);

                if (tabelaLocal.existe(nomeVar)) {
                    LaSemanticoUtils.adicionarErroSemantico(identificador.start, "Identificador " + nomeVar + " já declarado anteriormente");
                } else if (tipoVar == TipoLa.INVALIDO) {
                    LaSemanticoUtils.adicionarErroSemantico(identificador.start, "Tipo " + strTipoVar + " não declarado");
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
            LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Identificador " + nome + " já declarado anteriormente");
        } else {
            // Adiciona função ou procedimento
            TipoLa tipo = ctx.tipo_estendido() != null ? obterTipo(ctx.tipo_estendido().getText()) : TipoLa.INVALIDO;
            if (ctx.tipo_estendido() != null && tipo == TipoLa.INVALIDO) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Tipo " + ctx.tipo_estendido().getText() + " não declarado");
            }
            tabelaGlobal.adicionar(nome, tipo);

            escopos.criarNovoEscopo();
            // Adiciona parâmetros da função ou procedimento
            if (ctx.parametros() != null) {
                for (var param : ctx.parametros().parametro()) {
                    String nomeParam = param.identificador().getText();
                    String tipoParam = param.tipo_estendido().getText();
                    TipoLa tipoParamLa = obterTipo(tipoParam);

                    if (tipoParamLa == TipoLa.INVALIDO) {
                        LaSemanticoUtils.adicionarErroSemantico(param.identificador().start, "Tipo " + tipoParam + " não declarado");
                    } else if (escopos.obterEscopoAtual().existe(nomeParam)) {
                        LaSemanticoUtils.adicionarErroSemantico(param.identificador().start, "Identificador " + nomeParam + " já declarado anteriormente");
                    } else {
                        escopos.obterEscopoAtual().adicionar(nomeParam, tipoParamLa);
                    }
                }
            }
            visitCorpo(ctx.corpo());
            escopos.abandonarEscopo();
        }
        return super.visitDeclaracao_global(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(LaSemanticParser.CmdAtribuicaoContext ctx) {
        TipoLa tipoExpressao = LaSemanticoUtils.verificarTipo(escopos.obterEscopoAtual(), ctx.expressao());
        String nomeVar = ctx.identificador().getText();

        if (!escopos.obterEscopoAtual().existe(nomeVar)) {
            LaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "Identificador " + nomeVar + " não declarado");
        } else {
            TipoLa tipoVariavel = escopos.obterEscopoAtual().verificar(nomeVar);
            if (!tipoCompatível(tipoVariavel, tipoExpressao)) {
                LaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "Atribuição não compatível para " + nomeVar);
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }

    @Override
    public Void visitCmdLeia(LaSemanticParser.CmdLeiaContext ctx) {
        for (var identificador : ctx.identificador()) {
            String nomeVar = identificador.getText();
            if (!escopos.obterEscopoAtual().existe(nomeVar)) {
                LaSemanticoUtils.adicionarErroSemantico(identificador.start, "Identificador " + nomeVar + " não declarado");
            }
        }
        return super.visitCmdLeia(ctx);
    }

    @Override
    public Void visitExpressaoAritmetica(LaSemanticParser.ExpressaoAritmeticaContext ctx) {
        LaSemanticoUtils.verificarTipo(escopos.obterEscopoAtual(), ctx);
        return super.visitExpressaoAritmetica(ctx);
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

    private boolean tipoCompatível(TipoLa tipoVar, TipoLa tipoExpr) {
        return tipoVar == tipoExpr ||
                (tipoVar == TipoLa.INT && tipoExpr == TipoLa.REAL) ||
                (tipoVar == TipoLa.REAL && tipoExpr == TipoLa.INT);
    }
}
