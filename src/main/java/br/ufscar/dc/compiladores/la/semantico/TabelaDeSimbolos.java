package  br.ufscar.dc.compiladores.la.semantico;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {

    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    public enum TipoLa {
        INT,
        REAL,
        INVALIDO
    }

    public enum TipoEntrada {
        VARIAVEL, 
        PROCEDIMENTO,
        FUNCAO
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        TipoLa tipo;
        private EntradaTabelaDeSimbolos(String nome, TipoLa tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoLa tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoLa verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}