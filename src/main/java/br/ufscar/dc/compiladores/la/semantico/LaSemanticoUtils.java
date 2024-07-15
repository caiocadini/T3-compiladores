package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Erro %d:%d - %s", linha, coluna, mensagem));
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;
        for (var termo : ctx.termo()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;

        for (var fator : ctx.fator()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, fator);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;

        for (var parcela : ctx.parcela()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, parcela);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Fator " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ParcelaContext ctx) {
        if (ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoLa.INT;
        }
        if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.TipoLa.REAL;
        }
        if (ctx.IDENT() != null) {
            String nomeVar = ctx.IDENT().getText();
            if (!tabela.existe(nomeVar)) {
                adicionarErroSemantico(ctx.IDENT().getSymbol(), "Variável " + nomeVar + " não foi declarada antes do uso");
                return TabelaDeSimbolos.TipoLa.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        // se não for nenhum dos tipos acima, só pode ser uma expressão
        // entre parêntesis
        if (ctx.expressao() != null) {
            return verificarTipo(tabela, ctx.expressao());
        }
        return TabelaDeSimbolos.TipoLa.INVALIDO;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;

        for (var termo_logico : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo_logico);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;

        for (var fator_logico : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, fator_logico);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Fator_logicoContext ctx) {
        if (ctx.VERDADEIRO() != null || ctx.FALSO() != null) {
            return TabelaDeSimbolos.TipoLa.LOGICO;
        }
        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        }
        return TabelaDeSimbolos.TipoLa.INVALIDO;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;

        for (var exp_aritmetica : ctx.exp_aritmetica()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, exp_aritmetica);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}
