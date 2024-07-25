package br.ufscar.dc.compiladores.la.semantico;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoLa {
        INVALIDO,
        INT,
        REAL,
        LIT,
        LOG,
        REG
        // Add other types as needed
    }

    private Map<String, TipoLa> tabela;

    public TabelaDeSimbolos() {
        tabela = new HashMap<>();
    }

    public void adicionar(String nome, TipoLa tipo) {
        tabela.put(nome, tipo);
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public TipoLa verificar(String nome) {
        return tabela.get(nome);
    }

    public Map<String, TipoLa> obterTodosSimbolos() {
        return tabela;
    }
}
