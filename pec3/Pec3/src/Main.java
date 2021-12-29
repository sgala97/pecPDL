import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        InputStream is = new FileInputStream("src/Programa.pseint");
        CharStream input = CharStreams.fromStream(is);
        pseint_lexer lexer = new pseint_lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pseint_grammar parser = new pseint_grammar(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.pseint();
        TablaDeSimbolos tablaDeSimbolos = new TablaDeSimbolos();
        Listener listener = new Listener(tablaDeSimbolos);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
        System.out.println(tablaDeSimbolos.getNombreFunciones());
    }

}