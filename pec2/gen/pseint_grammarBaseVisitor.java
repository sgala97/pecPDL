// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3� TERCERO/Procesardores del Lenguaje/Practica2/pecPDL/pec2/src\pseint_grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link pseint_grammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class pseint_grammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements pseint_grammarVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPseint(pseint_grammar.PseintContext ctx) { return visitChildren(ctx); }
}