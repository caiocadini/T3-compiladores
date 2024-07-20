package br.ufscar.dc.compiladores.la.semantico;

import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String args[]) throws IOException {
        // Verifica se o número de argumentos está correto
        if (args.length < 2) {
            System.err.println("Uso: java -jar meu-compilador.jar <arquivo de entrada> <arquivo de saída>");
            System.exit(1);
        }

        // Lê o arquivo de entrada
        CharStream cs = CharStreams.fromFileName(args[0]);
        LaSemanticLexer lexer = new LaSemanticLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaSemanticParser parser = new LaSemanticParser(tokens);

        // Executa o analisador
        LaSemantico laSemantico = new LaSemantico();
        laSemantico.visitPrograma(parser.programa());

        // Escreve a saída no arquivo especificado
        try (PrintWriter writer = new PrintWriter(args[1])) {
            for (String erro : LaSemanticoUtils.errosSemanticos) {
                writer.println(erro);
            }
            writer.println("Fim da compilacao");
        }
    }
}
