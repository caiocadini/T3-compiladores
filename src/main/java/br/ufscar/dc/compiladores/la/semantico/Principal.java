package br.ufscar.dc.compiladores.la.semantico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaSemanticLexer lexer = new LaSemanticLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaSemanticParser parser = new LaSemanticParser(tokens);
        int val = parser.programa().val;
        System.out.println("Valor = " + val);

    }
}
