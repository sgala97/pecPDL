// Generated from /home/checo/asignaturas/pec2/hola.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link holaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface holaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link holaParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(holaParser.RContext ctx);
}