// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica3/pecPDL/pec3/Pec3/src\pseint_grammar.g4 by ANTLR 4.9.2

    package gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pseint_grammar}.
 */
public interface pseint_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#pseint}.
	 * @param ctx the parse tree
	 */
	void enterPseint(pseint_grammar.PseintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#pseint}.
	 * @param ctx the parse tree
	 */
	void exitPseint(pseint_grammar.PseintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(pseint_grammar.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(pseint_grammar.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(pseint_grammar.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(pseint_grammar.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(pseint_grammar.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(pseint_grammar.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(pseint_grammar.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(pseint_grammar.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(pseint_grammar.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(pseint_grammar.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#escribir}.
	 * @param ctx the parse tree
	 */
	void enterEscribir(pseint_grammar.EscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#escribir}.
	 * @param ctx the parse tree
	 */
	void exitEscribir(pseint_grammar.EscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(pseint_grammar.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(pseint_grammar.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#bloquesi}.
	 * @param ctx the parse tree
	 */
	void enterBloquesi(pseint_grammar.BloquesiContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#bloquesi}.
	 * @param ctx the parse tree
	 */
	void exitBloquesi(pseint_grammar.BloquesiContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#bloqueno}.
	 * @param ctx the parse tree
	 */
	void enterBloqueno(pseint_grammar.BloquenoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#bloqueno}.
	 * @param ctx the parse tree
	 */
	void exitBloqueno(pseint_grammar.BloquenoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#sientonces}.
	 * @param ctx the parse tree
	 */
	void enterSientonces(pseint_grammar.SientoncesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#sientonces}.
	 * @param ctx the parse tree
	 */
	void exitSientonces(pseint_grammar.SientoncesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#segun}.
	 * @param ctx the parse tree
	 */
	void enterSegun(pseint_grammar.SegunContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#segun}.
	 * @param ctx the parse tree
	 */
	void exitSegun(pseint_grammar.SegunContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(pseint_grammar.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(pseint_grammar.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(pseint_grammar.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(pseint_grammar.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(pseint_grammar.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(pseint_grammar.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(pseint_grammar.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(pseint_grammar.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#lineavacia}.
	 * @param ctx the parse tree
	 */
	void enterLineavacia(pseint_grammar.LineavaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#lineavacia}.
	 * @param ctx the parse tree
	 */
	void exitLineavacia(pseint_grammar.LineavaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#fininstruccion}.
	 * @param ctx the parse tree
	 */
	void enterFininstruccion(pseint_grammar.FininstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#fininstruccion}.
	 * @param ctx the parse tree
	 */
	void exitFininstruccion(pseint_grammar.FininstruccionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sinOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 */
	void enterSinOperadores(pseint_grammar.SinOperadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 */
	void exitSinOperadores(pseint_grammar.SinOperadoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 */
	void enterConOperadores(pseint_grammar.ConOperadoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conOperadores}
	 * labeled alternative in {@link pseint_grammar#operacion}.
	 * @param ctx the parse tree
	 */
	void exitConOperadores(pseint_grammar.ConOperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#usofuncion}.
	 * @param ctx the parse tree
	 */
	void enterUsofuncion(pseint_grammar.UsofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#usofuncion}.
	 * @param ctx the parse tree
	 */
	void exitUsofuncion(pseint_grammar.UsofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseint_grammar#usodimension}.
	 * @param ctx the parse tree
	 */
	void enterUsodimension(pseint_grammar.UsodimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseint_grammar#usodimension}.
	 * @param ctx the parse tree
	 */
	void exitUsodimension(pseint_grammar.UsodimensionContext ctx);
}