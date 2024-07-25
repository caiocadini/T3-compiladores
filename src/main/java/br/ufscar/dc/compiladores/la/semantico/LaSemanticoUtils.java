package br.ufscar.dc.compiladores.la.semantico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;


public class LaSemanticoUtils {
    // Lista para armazenar os erros semânticos encontrados
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        // Obtém a linha do token
        int linha = t.getLine();  
        
        // Adiciona a mensagem de erro formatada
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));  
    }


    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_aritmeticaContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa ret = null;  
        
        // Verifica o tipo de cada termo na expressão aritmética
        for (LaSemanticParser.TermoContext termo : ctx.termo()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo);  
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                // Define como inválido se tipos não coincidem
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;  
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.TermoContext ctx) {
        // Verifica o tipo do primeiro fator
        TabelaDeSimbolos.TipoLa ret = verificarTipo(tabela, ctx.fator().get(0));  
        
        // Verifica o tipo dos fatores adicionais
        for (int i = 1; i < ctx.fator().size(); i++) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, ctx.fator(i));  
            
            if (LaSemantico.tipoCompativel(ret, aux)) {
                if (aux == TabelaDeSimbolos.TipoLa.REAL) {
                    // Define como REAL se compatível
                    ret = TabelaDeSimbolos.TipoLa.REAL;  
                }
            } else {
                ret = aux;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.FatorContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa ret = null;
        
        // Verifica o tipo de cada parcela no fator
        for (LaSemanticParser.ParcelaContext parcela : ctx.parcela()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, parcela);  
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                // Define como inválido se tipos não coincidem
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;  
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            // Verifica o tipo da parcela unária
            return verificarTipo(tabela, ctx.parcela_unario());  
        } else {
            // Verifica o tipo da parcela não unária
            return verificarTipo(tabela, ctx.parcela_nao_unario());  
        }
    }


    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_unarioContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa tipoRetorno = null;  
        String nome;
    
        if (ctx.identificador() != null) {  // Se a parcela contém um identificador
            if (!ctx.identificador().dimensao().exp_aritmetica().isEmpty()) {
                // Obtém o nome do identificador
                nome = ctx.identificador().IDENT().get(0).getText();  
            } else {
                nome = ctx.identificador().getText();
            }
            
            if (tabela.existe(nome)) {  // Verifica se o identificador existe na tabela
                tipoRetorno = tabela.verificar(nome);  // Obtém o tipo do identificador
            } else {
                // Obtém o escopo atual
                TabelaDeSimbolos aux = LaSemantico.escopos.obterEscopoAtual();  
                
                if (!aux.existe(nome)) {  // Verifica se o identificador existe no escopo atual
                    // Adiciona erro se o identificador não existir
                    adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + nome + " nao declarado");  
                    tipoRetorno = TabelaDeSimbolos.TipoLa.INVALIDO;  
                } else {
                    tipoRetorno = aux.verificar(nome);  // Obtém o tipo do identificador do escopo atual
                }
            }
        } else if (ctx.NUM_INT() != null) {
            // Define o tipo como INT se for um número inteiro
            tipoRetorno = TabelaDeSimbolos.TipoLa.INT;  
        } else if (ctx.NUM_REAL() != null) {
            // Define o tipo como REAL se for um número real
            tipoRetorno = TabelaDeSimbolos.TipoLa.REAL;  
        } else {
            // Verifica o tipo da expressão
            tipoRetorno = verificarTipo(tabela, ctx.expressao().get(0));  
        }
        return tipoRetorno;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_nao_unarioContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa tipoRetorno;  
        String nome;

        if (ctx.identificador() != null) {  // Se a parcela contém um identificador
            // Obtém o texto do identificador
            nome = ctx.identificador().getText();  
            
            if (!tabela.existe(nome)) {  // Verifica se o identificador existe na tabela
                // Adiciona erro se o identificador não existir
                adicionarErroSemantico(ctx.identificador().getStart(), "identificador " + nome + " nao declarado");  
                tipoRetorno = TabelaDeSimbolos.TipoLa.INVALIDO;  
            } else {
                tipoRetorno = tabela.verificar(nome);  // Obtém o tipo do identificador
            }
        } else {
            // Define o tipo como LIT (literal) se não for um identificador
            tipoRetorno = TabelaDeSimbolos.TipoLa.LIT;  
        }

        return tipoRetorno;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.ExpressaoContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa ret = null;  
        
        // Verifica o tipo de cada termo lógico
        for (LaSemanticParser.Termo_logicoContext termo : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, termo);  
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                // Define como inválido se tipos não coincidem
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;  
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Termo_logicoContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa ret = null;  
        
        // Verifica o tipo de cada fator lógico
        for (LaSemanticParser.Fator_logicoContext fator : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, fator);  
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                // Define como inválido se tipos não coincidem
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;  
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Fator_logicoContext ctx) {
        // Verifica o tipo da parcela lógica
        return verificarTipo(tabela, ctx.parcela_logica());  
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Parcela_logicaContext ctx) {
        if (ctx.exp_relacional() != null) {
            // Verifica o tipo da expressão relacional
            return verificarTipo(tabela, ctx.exp_relacional());  
        } else {
            // Define como LOG (lógico) se não for uma expressão relacional
            return TabelaDeSimbolos.TipoLa.LOG;  
        }
    }

    public static TabelaDeSimbolos.TipoLa verificarTipo(TabelaDeSimbolos tabela, LaSemanticParser.Exp_relacionalContext ctx) {
        // Tipo de retorno inicializado como null
        TabelaDeSimbolos.TipoLa ret = null;  
        
        // Verifica o tipo de cada expressão aritmética
        for (LaSemanticParser.Exp_aritmeticaContext exp : ctx.exp_aritmetica()) {
            TabelaDeSimbolos.TipoLa aux = verificarTipo(tabela, exp);  
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoLa.INVALIDO) {
                // Define como inválido se tipos não coincidem
                ret = TabelaDeSimbolos.TipoLa.INVALIDO;  
            }
        }
        if (ctx.op_relacional() != null) {
            // Define como LOG (lógico) se houver operador relacional
            return TabelaDeSimbolos.TipoLa.LOG;  
        }
        return ret;
    }
}
