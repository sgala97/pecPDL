// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica3/pecPDL/pec3/Pec3/src\pseint_grammar.g4 by ANTLR 4.9.2

    package gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pseint_grammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FINALGORITMO=2, PROCESO=3, FINPROCESO=4, FUNCION=5, FINFUNCION=6, 
		SUBPROCESO=7, FINSUBPROCESO=8, SUBALGORITMO=9, FINSUBALGORITMO=10, TIPOVARIABLE=11, 
		DEFINIR=12, COMO=13, LEER=14, ESCRIBIR=15, MIENTRAS=16, FINMIENTRAS=17, 
		PARA=18, FINPARA=19, CONPASO=20, DIMENSION=21, SI=22, FINSI=23, ENTONCES=24, 
		SINO=25, SEGUN=26, HACER=27, DEOTROMODO=28, FINSEGUN=29, REPETIR=30, HASTAQUE=31, 
		HASTA=32, ASIGNACION=33, APARENTESIS=34, CPARENTESIS=35, ACORCHETE=36, 
		CCORCHETE=37, PUNTOCOMA=38, SALTOLINEA=39, COMA=40, DOSPUNTOS=41, MAYOR=42, 
		MENOR=43, IGUAL=44, DISTINTO=45, MENORIGUAL=46, MAYORIGUAL=47, CONJUNCION=48, 
		DISYUNCION=49, NEGACION=50, POTENCIACION=51, MODULO=52, MULTIPLICACION=53, 
		DIVISION=54, SUMA=55, RESTA=56, NOMBRE=57, ENTERO=58, REAL=59, LOGICO=60, 
		CADENA=61, COMENTARIOLINEA=62, COMENTARIOMULTILINEA=63, WS=64;
	public static final int
		RULE_pseint = 0, RULE_funcion = 1, RULE_algoritmo = 2, RULE_bloque = 3, 
		RULE_definicion = 4, RULE_asignacion = 5, RULE_escribir = 6, RULE_leer = 7, 
		RULE_bloquesi = 8, RULE_bloqueno = 9, RULE_sientonces = 10, RULE_segun = 11, 
		RULE_caso = 12, RULE_mientras = 13, RULE_repetir = 14, RULE_para = 15, 
		RULE_lineavacia = 16, RULE_fininstruccion = 17, RULE_operacion = 18, RULE_usofuncion = 19, 
		RULE_usodimension = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"pseint", "funcion", "algoritmo", "bloque", "definicion", "asignacion", 
			"escribir", "leer", "bloquesi", "bloqueno", "sientonces", "segun", "caso", 
			"mientras", "repetir", "para", "lineavacia", "fininstruccion", "operacion", 
			"usofuncion", "usodimension"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'<-'", "'('", 
			"')'", "'['", "']'", "';'", "'\n'", "','", "':'", "'>'", "'<'", "'='", 
			null, "'<='", "'>='", null, null, null, "'^'", null, "'*'", "'/'", "'+'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FINALGORITMO", "PROCESO", "FINPROCESO", "FUNCION", 
			"FINFUNCION", "SUBPROCESO", "FINSUBPROCESO", "SUBALGORITMO", "FINSUBALGORITMO", 
			"TIPOVARIABLE", "DEFINIR", "COMO", "LEER", "ESCRIBIR", "MIENTRAS", "FINMIENTRAS", 
			"PARA", "FINPARA", "CONPASO", "DIMENSION", "SI", "FINSI", "ENTONCES", 
			"SINO", "SEGUN", "HACER", "DEOTROMODO", "FINSEGUN", "REPETIR", "HASTAQUE", 
			"HASTA", "ASIGNACION", "APARENTESIS", "CPARENTESIS", "ACORCHETE", "CCORCHETE", 
			"PUNTOCOMA", "SALTOLINEA", "COMA", "DOSPUNTOS", "MAYOR", "MENOR", "IGUAL", 
			"DISTINTO", "MENORIGUAL", "MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", 
			"POTENCIACION", "MODULO", "MULTIPLICACION", "DIVISION", "SUMA", "RESTA", 
			"NOMBRE", "ENTERO", "REAL", "LOGICO", "CADENA", "COMENTARIOLINEA", "COMENTARIOMULTILINEA", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pseint_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pseint_grammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PseintContext extends ParserRuleContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pseint_grammar.EOF, 0); }
		public List<LineavaciaContext> lineavacia() {
			return getRuleContexts(LineavaciaContext.class);
		}
		public LineavaciaContext lineavacia(int i) {
			return getRuleContext(LineavaciaContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public PseintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterPseint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitPseint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitPseint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseintContext pseint() throws RecognitionException {
		PseintContext _localctx = new PseintContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pseint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(42);
				lineavacia();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) {
				{
				{
				setState(48);
				funcion();
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					lineavacia();
					}
					}
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			algoritmo();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(60);
						lineavacia();
						}
						}
						setState(63); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SALTOLINEA );
					setState(65);
					funcion();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(72);
				lineavacia();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public List<TerminalNode> NOMBRE() { return getTokens(pseint_grammar.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(pseint_grammar.NOMBRE, i);
		}
		public TerminalNode ASIGNACION() { return getToken(pseint_grammar.ASIGNACION, 0); }
		public TerminalNode APARENTESIS() { return getToken(pseint_grammar.APARENTESIS, 0); }
		public TerminalNode CPARENTESIS() { return getToken(pseint_grammar.CPARENTESIS, 0); }
		public TerminalNode SALTOLINEA() { return getToken(pseint_grammar.SALTOLINEA, 0); }
		public TerminalNode FUNCION() { return getToken(pseint_grammar.FUNCION, 0); }
		public TerminalNode SUBPROCESO() { return getToken(pseint_grammar.SUBPROCESO, 0); }
		public TerminalNode SUBALGORITMO() { return getToken(pseint_grammar.SUBALGORITMO, 0); }
		public TerminalNode FINFUNCION() { return getToken(pseint_grammar.FINFUNCION, 0); }
		public TerminalNode FINSUBPROCESO() { return getToken(pseint_grammar.FINSUBPROCESO, 0); }
		public TerminalNode FINSUBALGORITMO() { return getToken(pseint_grammar.FINSUBALGORITMO, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(NOMBRE);
			setState(82);
			match(ASIGNACION);
			setState(83);
			match(NOMBRE);
			setState(84);
			match(APARENTESIS);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(85);
				match(NOMBRE);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(86);
					match(COMA);
					setState(87);
					match(NOMBRE);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95);
			match(CPARENTESIS);
			setState(96);
			match(SALTOLINEA);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(97);
				bloque();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINFUNCION) | (1L << FINSUBPROCESO) | (1L << FINSUBALGORITMO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode SALTOLINEA() { return getToken(pseint_grammar.SALTOLINEA, 0); }
		public TerminalNode ALGORITMO() { return getToken(pseint_grammar.ALGORITMO, 0); }
		public TerminalNode PROCESO() { return getToken(pseint_grammar.PROCESO, 0); }
		public TerminalNode FINALGORITMO() { return getToken(pseint_grammar.FINALGORITMO, 0); }
		public TerminalNode FINPROCESO() { return getToken(pseint_grammar.FINPROCESO, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(NOMBRE);
			setState(107);
			match(SALTOLINEA);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(108);
				bloque();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==FINALGORITMO || _la==FINPROCESO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloqueContext extends ParserRuleContext {
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public SientoncesContext sientonces() {
			return getRuleContext(SientoncesContext.class,0);
		}
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public LineavaciaContext lineavacia() {
			return getRuleContext(LineavaciaContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
			case DIMENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				definicion();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				asignacion();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				escribir();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				leer();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				sientonces();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				segun();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				repetir();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				para();
				}
				break;
			case SALTOLINEA:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				lineavacia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionContext extends ParserRuleContext {
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public TerminalNode DEFINIR() { return getToken(pseint_grammar.DEFINIR, 0); }
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode COMO() { return getToken(pseint_grammar.COMO, 0); }
		public TerminalNode TIPOVARIABLE() { return getToken(pseint_grammar.TIPOVARIABLE, 0); }
		public TerminalNode DIMENSION() { return getToken(pseint_grammar.DIMENSION, 0); }
		public TerminalNode ACORCHETE() { return getToken(pseint_grammar.ACORCHETE, 0); }
		public TerminalNode CCORCHETE() { return getToken(pseint_grammar.CCORCHETE, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitDefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				{
				{
				setState(128);
				match(DEFINIR);
				setState(129);
				match(NOMBRE);
				setState(130);
				match(COMO);
				setState(131);
				match(TIPOVARIABLE);
				}
				}
				break;
			case DIMENSION:
				{
				{
				setState(132);
				match(DIMENSION);
				setState(133);
				match(NOMBRE);
				setState(134);
				match(ACORCHETE);
				{
				setState(135);
				operacion(0);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(136);
					match(COMA);
					setState(137);
					operacion(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(143);
				match(CCORCHETE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode ASIGNACION() { return getToken(pseint_grammar.ASIGNACION, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public TerminalNode ACORCHETE() { return getToken(pseint_grammar.ACORCHETE, 0); }
		public TerminalNode CCORCHETE() { return getToken(pseint_grammar.CCORCHETE, 0); }
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(NOMBRE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACORCHETE) {
				{
				setState(150);
				match(ACORCHETE);
				{
				setState(151);
				operacion(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(152);
					match(COMA);
					setState(153);
					operacion(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(159);
				match(CCORCHETE);
				}
			}

			setState(163);
			match(ASIGNACION);
			setState(164);
			operacion(0);
			setState(165);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(pseint_grammar.ESCRIBIR, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ESCRIBIR);
			setState(168);
			operacion(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(169);
				match(COMA);
				setState(170);
				operacion(0);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(pseint_grammar.LEER, 0); }
		public List<TerminalNode> NOMBRE() { return getTokens(pseint_grammar.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(pseint_grammar.NOMBRE, i);
		}
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(LEER);
			setState(179);
			match(NOMBRE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(180);
				match(COMA);
				setState(181);
				match(NOMBRE);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloquesiContext extends ParserRuleContext {
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public BloquesiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquesi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloquesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloquesi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloquesi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloquesiContext bloquesi() throws RecognitionException {
		BloquesiContext _localctx = new BloquesiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloquesi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				bloque();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BloquenoContext extends ParserRuleContext {
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public BloquenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloqueno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloqueno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloqueno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloquenoContext bloqueno() throws RecognitionException {
		BloquenoContext _localctx = new BloquenoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				bloque();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SientoncesContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(pseint_grammar.SI, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(pseint_grammar.ENTONCES, 0); }
		public List<FininstruccionContext> fininstruccion() {
			return getRuleContexts(FininstruccionContext.class);
		}
		public FininstruccionContext fininstruccion(int i) {
			return getRuleContext(FininstruccionContext.class,i);
		}
		public BloquesiContext bloquesi() {
			return getRuleContext(BloquesiContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(pseint_grammar.FINSI, 0); }
		public TerminalNode SINO() { return getToken(pseint_grammar.SINO, 0); }
		public BloquenoContext bloqueno() {
			return getRuleContext(BloquenoContext.class,0);
		}
		public SientoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sientonces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterSientonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitSientonces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitSientonces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SientoncesContext sientonces() throws RecognitionException {
		SientoncesContext _localctx = new SientoncesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sientonces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(SI);
			setState(200);
			operacion(0);
			setState(201);
			match(ENTONCES);
			setState(202);
			fininstruccion();
			setState(203);
			bloquesi();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(204);
				match(SINO);
				setState(205);
				fininstruccion();
				setState(206);
				bloqueno();
				}
			}

			setState(210);
			match(FINSI);
			setState(211);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(pseint_grammar.SEGUN, 0); }
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode HACER() { return getToken(pseint_grammar.HACER, 0); }
		public List<FininstruccionContext> fininstruccion() {
			return getRuleContexts(FininstruccionContext.class);
		}
		public FininstruccionContext fininstruccion(int i) {
			return getRuleContext(FininstruccionContext.class,i);
		}
		public TerminalNode FINSEGUN() { return getToken(pseint_grammar.FINSEGUN, 0); }
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public TerminalNode DEOTROMODO() { return getToken(pseint_grammar.DEOTROMODO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(pseint_grammar.DOSPUNTOS, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitSegun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitSegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SEGUN);
			setState(214);
			match(NOMBRE);
			setState(215);
			match(HACER);
			setState(216);
			fininstruccion();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				{
				setState(217);
				caso();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEOTROMODO) {
				{
				setState(223);
				match(DEOTROMODO);
				setState(224);
				match(DOSPUNTOS);
				setState(225);
				fininstruccion();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
					{
					{
					setState(226);
					bloque();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(234);
			match(FINSEGUN);
			setState(235);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode DOSPUNTOS() { return getToken(pseint_grammar.DOSPUNTOS, 0); }
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			operacion(0);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(238);
				match(COMA);
				setState(239);
				operacion(0);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(DOSPUNTOS);
			setState(246);
			fininstruccion();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					bloque();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(pseint_grammar.MIENTRAS, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(pseint_grammar.HACER, 0); }
		public List<FininstruccionContext> fininstruccion() {
			return getRuleContexts(FininstruccionContext.class);
		}
		public FininstruccionContext fininstruccion(int i) {
			return getRuleContext(FininstruccionContext.class,i);
		}
		public TerminalNode FINMIENTRAS() { return getToken(pseint_grammar.FINMIENTRAS, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(MIENTRAS);
			setState(254);
			operacion(0);
			setState(255);
			match(HACER);
			setState(256);
			fininstruccion();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(257);
				bloque();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(FINMIENTRAS);
			setState(264);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(pseint_grammar.REPETIR, 0); }
		public List<FininstruccionContext> fininstruccion() {
			return getRuleContexts(FininstruccionContext.class);
		}
		public FininstruccionContext fininstruccion(int i) {
			return getRuleContext(FininstruccionContext.class,i);
		}
		public TerminalNode HASTAQUE() { return getToken(pseint_grammar.HASTAQUE, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(REPETIR);
			setState(267);
			fininstruccion();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(268);
				bloque();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(HASTAQUE);
			setState(275);
			operacion(0);
			setState(276);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(pseint_grammar.PARA, 0); }
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode ASIGNACION() { return getToken(pseint_grammar.ASIGNACION, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(pseint_grammar.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(pseint_grammar.ENTERO, i);
		}
		public TerminalNode HASTA() { return getToken(pseint_grammar.HASTA, 0); }
		public TerminalNode HACER() { return getToken(pseint_grammar.HACER, 0); }
		public List<FininstruccionContext> fininstruccion() {
			return getRuleContexts(FininstruccionContext.class);
		}
		public FininstruccionContext fininstruccion(int i) {
			return getRuleContext(FininstruccionContext.class,i);
		}
		public TerminalNode FINPARA() { return getToken(pseint_grammar.FINPARA, 0); }
		public TerminalNode CONPASO() { return getToken(pseint_grammar.CONPASO, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(PARA);
			setState(279);
			match(NOMBRE);
			setState(280);
			match(ASIGNACION);
			setState(281);
			match(ENTERO);
			setState(282);
			match(HASTA);
			setState(283);
			match(ENTERO);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONPASO) {
				{
				setState(284);
				match(CONPASO);
				setState(285);
				match(ENTERO);
				}
			}

			setState(288);
			match(HACER);
			setState(289);
			fininstruccion();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(290);
				bloque();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(FINPARA);
			setState(297);
			fininstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineavaciaContext extends ParserRuleContext {
		public TerminalNode SALTOLINEA() { return getToken(pseint_grammar.SALTOLINEA, 0); }
		public LineavaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineavacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterLineavacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitLineavacia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitLineavacia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineavaciaContext lineavacia() throws RecognitionException {
		LineavaciaContext _localctx = new LineavaciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lineavacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(SALTOLINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FininstruccionContext extends ParserRuleContext {
		public TerminalNode SALTOLINEA() { return getToken(pseint_grammar.SALTOLINEA, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pseint_grammar.PUNTOCOMA, 0); }
		public FininstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fininstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterFininstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitFininstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitFininstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FininstruccionContext fininstruccion() throws RecognitionException {
		FininstruccionContext _localctx = new FininstruccionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fininstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNTOCOMA:
				{
				{
				setState(301);
				match(PUNTOCOMA);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(302);
					match(SALTOLINEA);
					}
					break;
				}
				}
				}
				break;
			case SALTOLINEA:
				{
				setState(305);
				match(SALTOLINEA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SinOperadoresContext extends OperacionContext {
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode ENTERO() { return getToken(pseint_grammar.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(pseint_grammar.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(pseint_grammar.LOGICO, 0); }
		public TerminalNode CADENA() { return getToken(pseint_grammar.CADENA, 0); }
		public UsodimensionContext usodimension() {
			return getRuleContext(UsodimensionContext.class,0);
		}
		public UsofuncionContext usofuncion() {
			return getRuleContext(UsofuncionContext.class,0);
		}
		public TerminalNode APARENTESIS() { return getToken(pseint_grammar.APARENTESIS, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode CPARENTESIS() { return getToken(pseint_grammar.CPARENTESIS, 0); }
		public SinOperadoresContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterSinOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitSinOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitSinOperadores(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConOperadoresContext extends OperacionContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(pseint_grammar.RESTA, 0); }
		public TerminalNode SUMA() { return getToken(pseint_grammar.SUMA, 0); }
		public TerminalNode NEGACION() { return getToken(pseint_grammar.NEGACION, 0); }
		public TerminalNode POTENCIACION() { return getToken(pseint_grammar.POTENCIACION, 0); }
		public TerminalNode MODULO() { return getToken(pseint_grammar.MODULO, 0); }
		public TerminalNode DIVISION() { return getToken(pseint_grammar.DIVISION, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(pseint_grammar.MULTIPLICACION, 0); }
		public TerminalNode MAYOR() { return getToken(pseint_grammar.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(pseint_grammar.IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(pseint_grammar.MENOR, 0); }
		public TerminalNode DISTINTO() { return getToken(pseint_grammar.DISTINTO, 0); }
		public TerminalNode MENORIGUAL() { return getToken(pseint_grammar.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(pseint_grammar.MAYORIGUAL, 0); }
		public TerminalNode CONJUNCION() { return getToken(pseint_grammar.CONJUNCION, 0); }
		public TerminalNode DISYUNCION() { return getToken(pseint_grammar.DISYUNCION, 0); }
		public ConOperadoresContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterConOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitConOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitConOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_operacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(309);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				operacion(8);
				}
				break;
			case NEGACION:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(NEGACION);
				setState(312);
				operacion(3);
				}
				break;
			case APARENTESIS:
			case NOMBRE:
			case ENTERO:
			case REAL:
			case LOGICO:
			case CADENA:
				{
				_localctx = new SinOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(313);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(314);
					match(ENTERO);
					}
					break;
				case 3:
					{
					setState(315);
					match(REAL);
					}
					break;
				case 4:
					{
					setState(316);
					match(LOGICO);
					}
					break;
				case 5:
					{
					setState(317);
					match(CADENA);
					}
					break;
				case 6:
					{
					setState(318);
					usodimension();
					}
					break;
				case 7:
					{
					setState(319);
					usofuncion();
					}
					break;
				case 8:
					{
					{
					setState(320);
					match(APARENTESIS);
					setState(321);
					operacion(0);
					setState(322);
					match(CPARENTESIS);
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(328);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(329);
						match(POTENCIACION);
						}
						setState(330);
						operacion(8);
						}
						break;
					case 2:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(331);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(332);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						operacion(7);
						}
						break;
					case 3:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(334);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(335);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						operacion(6);
						}
						break;
					case 4:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << DISTINTO) | (1L << MENORIGUAL) | (1L << MAYORIGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						operacion(5);
						}
						break;
					case 5:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(340);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(341);
						_la = _input.LA(1);
						if ( !(_la==CONJUNCION || _la==DISYUNCION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						operacion(3);
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UsofuncionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode APARENTESIS() { return getToken(pseint_grammar.APARENTESIS, 0); }
		public TerminalNode CPARENTESIS() { return getToken(pseint_grammar.CPARENTESIS, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public UsofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterUsofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitUsofuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitUsofuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsofuncionContext usofuncion() throws RecognitionException {
		UsofuncionContext _localctx = new UsofuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_usofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(NOMBRE);
			setState(349);
			match(APARENTESIS);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				setState(350);
				operacion(0);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(351);
					match(COMA);
					setState(352);
					operacion(0);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(360);
			match(CPARENTESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsodimensionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(pseint_grammar.NOMBRE, 0); }
		public TerminalNode ACORCHETE() { return getToken(pseint_grammar.ACORCHETE, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(pseint_grammar.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(pseint_grammar.ENTERO, i);
		}
		public TerminalNode CCORCHETE() { return getToken(pseint_grammar.CCORCHETE, 0); }
		public List<TerminalNode> COMA() { return getTokens(pseint_grammar.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pseint_grammar.COMA, i);
		}
		public UsodimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usodimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterUsodimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitUsodimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitUsodimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsodimensionContext usodimension() throws RecognitionException {
		UsodimensionContext _localctx = new UsodimensionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_usodimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(NOMBRE);
			setState(363);
			match(ACORCHETE);
			setState(364);
			match(ENTERO);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(365);
				match(COMA);
				setState(366);
				match(ENTERO);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CCORCHETE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\5\3"+
		"`\n\3\3\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4"+
		"p\n\4\f\4\16\4s\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6"+
		"\16\6\u0090\13\6\3\6\3\6\5\6\u0094\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u009d\n\7\f\7\16\7\u00a0\13\7\3\7\3\7\5\7\u00a4\n\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\t\u00b9\n\t\f\t\16\t\u00bc\13\t\3\t\3\t\3\n\6\n\u00c1\n\n\r\n\16"+
		"\n\u00c2\3\13\6\13\u00c6\n\13\r\13\16\13\u00c7\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00dd\n"+
		"\r\f\r\16\r\u00e0\13\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13"+
		"\r\5\r\u00eb\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00f3\n\16\f\16\16\16"+
		"\u00f6\13\16\3\16\3\16\3\16\7\16\u00fb\n\16\f\16\16\16\u00fe\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0105\n\17\f\17\16\17\u0108\13\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\7\20\u0110\n\20\f\20\16\20\u0113\13\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0121\n\21\3\21"+
		"\3\21\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\5\23\u0132\n\23\3\23\5\23\u0135\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0147"+
		"\n\24\5\24\u0149\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u015a\n\24\f\24\16\24\u015d\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0164\n\25\f\25\16\25\u0167\13\25\5\25\u0169"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0172\n\26\f\26\16\26\u0175"+
		"\13\26\3\26\3\26\3\26\2\3&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*\2\n\5\2\7\7\t\t\13\13\5\2\b\b\n\n\f\f\4\2\3\3\5\5\4\2\4\4\6\6\3"+
		"\29:\3\2\668\3\2,\61\3\2\62\63\2\u019b\2/\3\2\2\2\4R\3\2\2\2\6k\3\2\2"+
		"\2\b\u0080\3\2\2\2\n\u0093\3\2\2\2\f\u0097\3\2\2\2\16\u00a9\3\2\2\2\20"+
		"\u00b4\3\2\2\2\22\u00c0\3\2\2\2\24\u00c5\3\2\2\2\26\u00c9\3\2\2\2\30\u00d7"+
		"\3\2\2\2\32\u00ef\3\2\2\2\34\u00ff\3\2\2\2\36\u010c\3\2\2\2 \u0118\3\2"+
		"\2\2\"\u012d\3\2\2\2$\u0134\3\2\2\2&\u0148\3\2\2\2(\u015e\3\2\2\2*\u016c"+
		"\3\2\2\2,.\5\"\22\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60:\3"+
		"\2\2\2\61/\3\2\2\2\62\64\5\4\3\2\63\65\5\"\22\2\64\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\62\3\2\2\29<\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=G\5\6\4\2>@\5\"\22\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\4\3\2DF\3\2\2\2E?\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\"\22\2KJ\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2"+
		"\2\2RS\t\2\2\2ST\7;\2\2TU\7#\2\2UV\7;\2\2V_\7$\2\2W\\\7;\2\2XY\7*\2\2"+
		"Y[\7;\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2_W\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7%\2\2bf\7)\2\2ce\5\b\5\2dc\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\t\3\2\2j\5\3\2\2"+
		"\2kl\t\4\2\2lm\7;\2\2mq\7)\2\2np\5\b\5\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\t\5\2\2u\7\3\2\2\2v\u0081\5\n\6\2w\u0081"+
		"\5\f\7\2x\u0081\5\16\b\2y\u0081\5\20\t\2z\u0081\5\26\f\2{\u0081\5\30\r"+
		"\2|\u0081\5\34\17\2}\u0081\5\36\20\2~\u0081\5 \21\2\177\u0081\5\"\22\2"+
		"\u0080v\3\2\2\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080y\3\2\2\2\u0080z\3"+
		"\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7\16\2\2\u0083\u0084\7;\2\2\u0084"+
		"\u0085\7\17\2\2\u0085\u0094\7\r\2\2\u0086\u0087\7\27\2\2\u0087\u0088\7"+
		";\2\2\u0088\u0089\7&\2\2\u0089\u008e\5&\24\2\u008a\u008b\7*\2\2\u008b"+
		"\u008d\5&\24\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\'\2\2\u0092\u0094\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u0086\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5$\23\2\u0096\13\3\2\2\2\u0097\u00a3"+
		"\7;\2\2\u0098\u0099\7&\2\2\u0099\u009e\5&\24\2\u009a\u009b\7*\2\2\u009b"+
		"\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\'\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\5&\24\2\u00a7"+
		"\u00a8\5$\23\2\u00a8\r\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00af\5&\24"+
		"\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\5&\24\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\5$\23\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\20\2"+
		"\2\u00b5\u00ba\7;\2\2\u00b6\u00b7\7*\2\2\u00b7\u00b9\7;\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5$\23\2\u00be\21\3\2\2"+
		"\2\u00bf\u00c1\5\b\5\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\23\3\2\2\2\u00c4\u00c6\5\b\5\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\25\3\2\2\2\u00c9\u00ca\7\30\2\2\u00ca\u00cb\5&\24\2\u00cb\u00cc"+
		"\7\32\2\2\u00cc\u00cd\5$\23\2\u00cd\u00d2\5\22\n\2\u00ce\u00cf\7\33\2"+
		"\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\5\24\13\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\31"+
		"\2\2\u00d5\u00d6\5$\23\2\u00d6\27\3\2\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00d9"+
		"\7;\2\2\u00d9\u00da\7\35\2\2\u00da\u00de\5$\23\2\u00db\u00dd\5\32\16\2"+
		"\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00ea\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\36\2\2"+
		"\u00e2\u00e3\7+\2\2\u00e3\u00e7\5$\23\2\u00e4\u00e6\5\b\5\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee\5$\23\2\u00ee"+
		"\31\3\2\2\2\u00ef\u00f4\5&\24\2\u00f0\u00f1\7*\2\2\u00f1\u00f3\5&\24\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8"+
		"\u00fc\5$\23\2\u00f9\u00fb\5\b\5\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\7\22\2\2\u0100\u0101\5&\24\2\u0101\u0102\7\35\2\2"+
		"\u0102\u0106\5$\23\2\u0103\u0105\5\b\5\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\23\2\2\u010a\u010b\5$\23\2\u010b\35\3\2\2"+
		"\2\u010c\u010d\7 \2\2\u010d\u0111\5$\23\2\u010e\u0110\5\b\5\2\u010f\u010e"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7!\2\2\u0115\u0116\5&\24"+
		"\2\u0116\u0117\5$\23\2\u0117\37\3\2\2\2\u0118\u0119\7\24\2\2\u0119\u011a"+
		"\7;\2\2\u011a\u011b\7#\2\2\u011b\u011c\7<\2\2\u011c\u011d\7\"\2\2\u011d"+
		"\u0120\7<\2\2\u011e\u011f\7\26\2\2\u011f\u0121\7<\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\35\2\2\u0123"+
		"\u0127\5$\23\2\u0124\u0126\5\b\5\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\7\25\2\2\u012b\u012c\5$\23\2\u012c!\3\2\2\2"+
		"\u012d\u012e\7)\2\2\u012e#\3\2\2\2\u012f\u0131\7(\2\2\u0130\u0132\7)\2"+
		"\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0135"+
		"\7)\2\2\u0134\u012f\3\2\2\2\u0134\u0133\3\2\2\2\u0135%\3\2\2\2\u0136\u0137"+
		"\b\24\1\2\u0137\u0138\t\6\2\2\u0138\u0149\5&\24\n\u0139\u013a\7\64\2\2"+
		"\u013a\u0149\5&\24\5\u013b\u0147\7;\2\2\u013c\u0147\7<\2\2\u013d\u0147"+
		"\7=\2\2\u013e\u0147\7>\2\2\u013f\u0147\7?\2\2\u0140\u0147\5*\26\2\u0141"+
		"\u0147\5(\25\2\u0142\u0143\7$\2\2\u0143\u0144\5&\24\2\u0144\u0145\7%\2"+
		"\2\u0145\u0147\3\2\2\2\u0146\u013b\3\2\2\2\u0146\u013c\3\2\2\2\u0146\u013d"+
		"\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146"+
		"\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0136\3\2"+
		"\2\2\u0148\u0139\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u015b\3\2\2\2\u014a"+
		"\u014b\f\t\2\2\u014b\u014c\7\65\2\2\u014c\u015a\5&\24\n\u014d\u014e\f"+
		"\b\2\2\u014e\u014f\t\7\2\2\u014f\u015a\5&\24\t\u0150\u0151\f\7\2\2\u0151"+
		"\u0152\t\6\2\2\u0152\u015a\5&\24\b\u0153\u0154\f\6\2\2\u0154\u0155\t\b"+
		"\2\2\u0155\u015a\5&\24\7\u0156\u0157\f\4\2\2\u0157\u0158\t\t\2\2\u0158"+
		"\u015a\5&\24\5\u0159\u014a\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u0150\3\2"+
		"\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\'\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e\u015f\7;\2\2\u015f\u0168\7$\2\2\u0160\u0165\5&\24\2\u0161\u0162"+
		"\7*\2\2\u0162\u0164\5&\24\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u0160\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\7%\2\2\u016b)\3\2\2\2\u016c\u016d\7;\2\2\u016d\u016e\7&\2\2\u016e"+
		"\u0173\7<\2\2\u016f\u0170\7*\2\2\u0170\u0172\7<\2\2\u0171\u016f\3\2\2"+
		"\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\'\2\2\u0177+\3\2\2\2(/\66:"+
		"AGM\\_fq\u0080\u008e\u0093\u009e\u00a3\u00af\u00ba\u00c2\u00c7\u00d2\u00de"+
		"\u00e7\u00ea\u00f4\u00fc\u0106\u0111\u0120\u0127\u0131\u0134\u0146\u0148"+
		"\u0159\u015b\u0165\u0168\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}