// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica2/pecPDL/pec2/src\pseint_grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pseint_grammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pseint_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#pseint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseint(pseint_grammar.PseintContext ctx);
}