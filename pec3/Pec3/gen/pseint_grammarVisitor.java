// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica3/pecPDL/pec3/Pec3/src\pseint_grammar.g4 by ANTLR 4.9.2
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
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(pseint_grammar.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(pseint_grammar.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueEstandar}
	 * labeled alternative in {@link pseint_grammar#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueEstandar(pseint_grammar.BloqueEstandarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueFlujo}
	 * labeled alternative in {@link pseint_grammar#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueFlujo(pseint_grammar.BloqueFlujoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloqueVacio}
	 * labeled alternative in {@link pseint_grammar#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueVacio(pseint_grammar.BloqueVacioContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(pseint_grammar.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(pseint_grammar.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#escribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir(pseint_grammar.EscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(pseint_grammar.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#bloquesi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloquesi(pseint_grammar.BloquesiContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#bloqueno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueno(pseint_grammar.BloquenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#sientonces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSientonces(pseint_grammar.SientoncesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#deotromodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeotromodo(pseint_grammar.DeotromodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#segun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegun(pseint_grammar.SegunContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(pseint_grammar.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(pseint_grammar.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(pseint_grammar.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(pseint_grammar.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#lineavacia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineavacia(pseint_grammar.LineavaciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#fininstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFininstruccion(pseint_grammar.FininstruccionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sinOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinOperadores(pseint_grammar.SinOperadoresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConOperadores(pseint_grammar.ConOperadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#usofuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsofuncion(pseint_grammar.UsofuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseint_grammar#usodimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsodimension(pseint_grammar.UsodimensionContext ctx);
}