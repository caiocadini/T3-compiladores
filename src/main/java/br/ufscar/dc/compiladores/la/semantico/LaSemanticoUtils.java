package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;
        for (LaSemanticParser.TermoContext termo : ctx.termo()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoLa ret = verificarTipo(tabela, ctx.fator().get(0));
    
        for (int i = 1; i < ctx.fator().size(); i++) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, ctx.fator(i));
            
            if (LaSemantico.tipoCompativel(ret, aux)) {
                if (aux == TabelaDeSimbolos.TipoLa.REAL) {
                    ret = TabelaDeSimbolos.TipoLa.REAL;
                }
            } else {
                ret = aux;
            }
        }
    
        return ret;
    }
    

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoLa ret = null;
        for (LaSemanticParser.ParcelaContext parcela : ctx.parcela()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, parcela);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_unarioContext ctx) {
        
        TabelaDeSimbolos.TipoLa tipoRetorno = null;
        String nome;

        if (ctx.identificador() != null) {
            if (!ctx.identificador().dimensao().exp_aritmetica().isEmpty()) {
                nome = ctx.identificador().IDENT().get(0).getText();
            } else {
                
                nome = ctx.identificador().getText();
            }
            if (tabela.existe(nome)) {
                tipoRetorno = tabela.verificar(nome);
                
            } else {
                
                adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + nome + " nao declarado");
                tipoRetorno = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        } else if (ctx.IDENT() != null) {
            adicionarErroSemantico(ctx.start, "Funcao ou procedimento " + ctx.IDENT().getText() + " nao declarado");
            tipoRetorno = TabelaDeSimbolos.TipoLa.INVALIDO;
        } else if (ctx.NUM_INT() != null) {
            tipoRetorno = TabelaDeSimbolos.TipoLa.INT;
        } else if (ctx.NUM_REAL() != null) {
            tipoRetorno = TabelaDeSimbolos.TipoLa.REAL;
        } else {
            tipoRetorno = verificarTipo(tabela, ctx.expressao().get(0));
        }
        return tipoRetorno;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_nao_unarioContext ctx) {

        TabelaDeSimbolos.TipoLa tipoRetorno;
        String nome;

        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();
            if (!tabela.existe(nome)) {
                adicionarErroSemantico(ctx.identificador().getStart(), "Identificador " + nome + " nao declarado");
                tipoRetorno = TabelaDeSimbolos.TipoLa.INVALIDO;
            } else {
                tipoRetorno = tabela.verificar(nome);
            }
        } else {
            tipoRetorno = TabelaDeSimbolos.TipoLa.LIT;
        }

        return tipoRetorno;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ExpressaoContext ctx) {

        TabelaDeSimbolos.TipoLa ret = null;
        for (LaSemanticParser.Termo_logicoContext termo : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Termo_logicoContext ctx) {

        TabelaDeSimbolos.TipoLa ret = null;
        for (LaSemanticParser.Fator_logicoContext fator : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, fator);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        return ret;
    }


    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Fator_logicoContext ctx) {

        return verificarTipo(tabela, ctx.parcela_logica());
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_logicaContext ctx) {

        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        } else {
            return TabelaDeSimbolos.TipoLa.LOG;
        }
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_relacionalContext ctx) {

        TabelaDeSimbolos.TipoLa ret = null;
        for (LaSemanticParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, exp);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;
            }
        }
        if (ctx.op_relacional() != null) {
            return TabelaDeSimbolos.TipoLa.LOG;
        }
        return ret;
    }
}
