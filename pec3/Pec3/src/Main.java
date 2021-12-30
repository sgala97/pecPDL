import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception
    {

        InputStream is = new FileInputStream("H:\\OneDrive\\OneDrive - Universidad de Alcala\\3º TERCERO\\Procesardores del Lenguaje\\Practica3\\pecPDL\\pec3\\Pec3\\src\\Programa.pseint");
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
        imprimirHijos(tablaDeSimbolos.getPrograma().getListaHijos(),0);
        Grafo grafo = new Grafo();
        grafo.generarGrafo(tablaDeSimbolos.getPrograma());
           //System.out.println("Nombre Funciones : "+tablaDeSimbolos.getPrograma().getHijos(0).getTipo());
    }


    public static String a(int a){

        return String.valueOf(a);
    }
    public static void imprimirHijos(ArrayList<Bloque> bloques, int n) {
        for (Bloque bloque: bloques)
        {
            System.out.println("\t".repeat(n) + bloque.getTipo());
            if (bloque.getTipo() != TipoBloque.STANDARD)
            {
                imprimirHijos(bloque.getHijos(), n+1);
            }
        }
    }
}