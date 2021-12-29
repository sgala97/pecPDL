// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica3/pecPDL/pec3/Pec3/src\pseint_grammar.g4 by ANTLR 4.9.2
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
		RULE_bloquesi = 8, RULE_bloqueno = 9, RULE_sientonces = 10, RULE_deotromodo = 11, 
		RULE_segun = 12, RULE_caso = 13, RULE_mientras = 14, RULE_repetir = 15, 
		RULE_para = 16, RULE_lineavacia = 17, RULE_fininstruccion = 18, RULE_operacion = 19, 
		RULE_usofuncion = 20, RULE_usodimension = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"pseint", "funcion", "algoritmo", "bloque", "definicion", "asignacion", 
			"escribir", "leer", "bloquesi", "bloqueno", "sientonces", "deotromodo", 
			"segun", "caso", "mientras", "repetir", "para", "lineavacia", "fininstruccion", 
			"operacion", "usofuncion", "usodimension"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(44);
				lineavacia();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) {
				{
				{
				setState(50);
				funcion();
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					lineavacia();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			algoritmo();
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(62);
						lineavacia();
						}
						}
						setState(65); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SALTOLINEA );
					setState(67);
					funcion();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(74);
				lineavacia();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(NOMBRE);
			setState(84);
			match(ASIGNACION);
			setState(85);
			match(NOMBRE);
			setState(86);
			match(APARENTESIS);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(87);
				match(NOMBRE);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(88);
					match(COMA);
					setState(89);
					match(NOMBRE);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(97);
			match(CPARENTESIS);
			setState(98);
			match(SALTOLINEA);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(99);
				bloque();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(108);
			match(NOMBRE);
			setState(109);
			match(SALTOLINEA);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(110);
				bloque();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	 
		public BloqueContext() { }
		public void copyFrom(BloqueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BloqueFlujoContext extends BloqueContext {
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
		public BloqueFlujoContext(BloqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloqueFlujo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloqueFlujo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloqueFlujo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BloqueVacioContext extends BloqueContext {
		public LineavaciaContext lineavacia() {
			return getRuleContext(LineavaciaContext.class,0);
		}
		public BloqueVacioContext(BloqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloqueVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloqueVacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloqueVacio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BloqueEstandarContext extends BloqueContext {
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
		public BloqueEstandarContext(BloqueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterBloqueEstandar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitBloqueEstandar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitBloqueEstandar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
			case DIMENSION:
				_localctx = new BloqueEstandarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				definicion();
				}
				break;
			case NOMBRE:
				_localctx = new BloqueEstandarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				asignacion();
				}
				break;
			case ESCRIBIR:
				_localctx = new BloqueEstandarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				escribir();
				}
				break;
			case LEER:
				_localctx = new BloqueEstandarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				leer();
				}
				break;
			case SI:
				_localctx = new BloqueFlujoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				sientonces();
				}
				break;
			case SEGUN:
				_localctx = new BloqueFlujoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				segun();
				}
				break;
			case MIENTRAS:
				_localctx = new BloqueFlujoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				mientras();
				}
				break;
			case REPETIR:
				_localctx = new BloqueFlujoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(125);
				repetir();
				}
				break;
			case PARA:
				_localctx = new BloqueFlujoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				para();
				}
				break;
			case SALTOLINEA:
				_localctx = new BloqueVacioContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(127);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				{
				{
				setState(130);
				match(DEFINIR);
				setState(131);
				match(NOMBRE);
				setState(132);
				match(COMO);
				setState(133);
				match(TIPOVARIABLE);
				}
				}
				break;
			case DIMENSION:
				{
				{
				setState(134);
				match(DIMENSION);
				setState(135);
				match(NOMBRE);
				setState(136);
				match(ACORCHETE);
				{
				setState(137);
				operacion(0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(138);
					match(COMA);
					setState(139);
					operacion(0);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(145);
				match(CCORCHETE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
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
			setState(151);
			match(NOMBRE);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACORCHETE) {
				{
				setState(152);
				match(ACORCHETE);
				{
				setState(153);
				operacion(0);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(154);
					match(COMA);
					setState(155);
					operacion(0);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(161);
				match(CCORCHETE);
				}
			}

			setState(165);
			match(ASIGNACION);
			setState(166);
			operacion(0);
			setState(167);
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
			setState(169);
			match(ESCRIBIR);
			setState(170);
			operacion(0);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(171);
				match(COMA);
				setState(172);
				operacion(0);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
			setState(180);
			match(LEER);
			setState(181);
			match(NOMBRE);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(182);
				match(COMA);
				setState(183);
				match(NOMBRE);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				bloque();
				}
				}
				setState(194); 
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
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				bloque();
				}
				}
				setState(199); 
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
			setState(201);
			match(SI);
			setState(202);
			operacion(0);
			setState(203);
			match(ENTONCES);
			setState(204);
			fininstruccion();
			setState(205);
			bloquesi();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(206);
				match(SINO);
				setState(207);
				fininstruccion();
				setState(208);
				bloqueno();
				}
			}

			setState(212);
			match(FINSI);
			setState(213);
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

	public static class DeotromodoContext extends ParserRuleContext {
		public TerminalNode DEOTROMODO() { return getToken(pseint_grammar.DEOTROMODO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(pseint_grammar.DOSPUNTOS, 0); }
		public FininstruccionContext fininstruccion() {
			return getRuleContext(FininstruccionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public DeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).enterDeotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseint_grammarListener ) ((pseint_grammarListener)listener).exitDeotromodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseint_grammarVisitor ) return ((pseint_grammarVisitor<? extends T>)visitor).visitDeotromodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeotromodoContext deotromodo() throws RecognitionException {
		DeotromodoContext _localctx = new DeotromodoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deotromodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(DEOTROMODO);
			setState(216);
			match(DOSPUNTOS);
			setState(217);
			fininstruccion();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(218);
				bloque();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public DeotromodoContext deotromodo() {
			return getRuleContext(DeotromodoContext.class,0);
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
		enterRule(_localctx, 24, RULE_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SEGUN);
			setState(225);
			match(NOMBRE);
			setState(226);
			match(HACER);
			setState(227);
			fininstruccion();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				{
				setState(228);
				caso();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEOTROMODO) {
				{
				setState(234);
				deotromodo();
				}
			}

			setState(237);
			match(FINSEGUN);
			setState(238);
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
		enterRule(_localctx, 26, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			operacion(0);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(241);
				match(COMA);
				setState(242);
				operacion(0);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(DOSPUNTOS);
			setState(249);
			fininstruccion();
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					bloque();
					}
					} 
				}
				setState(255);
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
		enterRule(_localctx, 28, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(MIENTRAS);
			setState(257);
			operacion(0);
			setState(258);
			match(HACER);
			setState(259);
			fininstruccion();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(260);
				bloque();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(FINMIENTRAS);
			setState(267);
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
		enterRule(_localctx, 30, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(REPETIR);
			setState(270);
			fininstruccion();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(271);
				bloque();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(HASTAQUE);
			setState(278);
			operacion(0);
			setState(279);
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
		enterRule(_localctx, 32, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(PARA);
			setState(282);
			match(NOMBRE);
			setState(283);
			match(ASIGNACION);
			setState(284);
			match(ENTERO);
			setState(285);
			match(HASTA);
			setState(286);
			match(ENTERO);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONPASO) {
				{
				setState(287);
				match(CONPASO);
				setState(288);
				match(ENTERO);
				}
			}

			setState(291);
			match(HACER);
			setState(292);
			fininstruccion();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(293);
				bloque();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(FINPARA);
			setState(300);
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
		enterRule(_localctx, 34, RULE_lineavacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 36, RULE_fininstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNTOCOMA:
				{
				{
				setState(304);
				match(PUNTOCOMA);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(305);
					match(SALTOLINEA);
					}
					break;
				}
				}
				}
				break;
			case SALTOLINEA:
				{
				setState(308);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_operacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(312);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				operacion(8);
				}
				break;
			case NEGACION:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(NEGACION);
				setState(315);
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
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(316);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(317);
					match(ENTERO);
					}
					break;
				case 3:
					{
					setState(318);
					match(REAL);
					}
					break;
				case 4:
					{
					setState(319);
					match(LOGICO);
					}
					break;
				case 5:
					{
					setState(320);
					match(CADENA);
					}
					break;
				case 6:
					{
					setState(321);
					usodimension();
					}
					break;
				case 7:
					{
					setState(322);
					usofuncion();
					}
					break;
				case 8:
					{
					{
					setState(323);
					match(APARENTESIS);
					setState(324);
					operacion(0);
					setState(325);
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
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(331);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(332);
						match(POTENCIACION);
						}
						setState(333);
						operacion(8);
						}
						break;
					case 2:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(334);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(335);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						operacion(7);
						}
						break;
					case 3:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(338);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						operacion(6);
						}
						break;
					case 4:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(340);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(341);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << DISTINTO) | (1L << MENORIGUAL) | (1L << MAYORIGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						operacion(5);
						}
						break;
					case 5:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(343);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(344);
						_la = _input.LA(1);
						if ( !(_la==CONJUNCION || _la==DISYUNCION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						operacion(3);
						}
						break;
					}
					} 
				}
				setState(350);
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
		enterRule(_localctx, 40, RULE_usofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(NOMBRE);
			setState(352);
			match(APARENTESIS);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				setState(353);
				operacion(0);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(354);
					match(COMA);
					setState(355);
					operacion(0);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(363);
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
		enterRule(_localctx, 42, RULE_usodimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(NOMBRE);
			setState(366);
			match(ACORCHETE);
			setState(367);
			match(ENTERO);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(368);
				match(COMA);
				setState(369);
				match(ENTERO);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u017c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\6\2\67\n\2\r\2\16\28\7\2;\n\2\f\2\16\2>\13\2\3\2"+
		"\3\2\6\2B\n\2\r\2\16\2C\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\7\2N\n\2\f"+
		"\2\16\2Q\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16"+
		"\3`\13\3\5\3b\n\3\3\3\3\3\3\3\7\3g\n\3\f\3\16\3j\13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f"+
		"\n\6\f\6\16\6\u0092\13\6\3\6\3\6\5\6\u0096\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\3\7\5\7\u00a6\n\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\n\6\n\u00c3\n\n"+
		"\r\n\16\n\u00c4\3\13\6\13\u00c8\n\13\r\13\16\13\u00c9\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00de"+
		"\n\r\f\r\16\r\u00e1\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00e8\n\16\f\16"+
		"\16\16\u00eb\13\16\3\16\5\16\u00ee\n\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u00f6\n\17\f\17\16\17\u00f9\13\17\3\17\3\17\3\17\7\17\u00fe\n\17"+
		"\f\17\16\17\u0101\13\17\3\20\3\20\3\20\3\20\3\20\7\20\u0108\n\20\f\20"+
		"\16\20\u010b\13\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0113\n\21\f\21"+
		"\16\21\u0116\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0124\n\22\3\22\3\22\3\22\7\22\u0129\n\22\f\22\16\22\u012c"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0135\n\24\3\24\5\24\u0138"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u014a\n\25\5\25\u014c\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u015d\n\25"+
		"\f\25\16\25\u0160\13\25\3\26\3\26\3\26\3\26\3\26\7\26\u0167\n\26\f\26"+
		"\16\26\u016a\13\26\5\26\u016c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0175\n\27\f\27\16\27\u0178\13\27\3\27\3\27\3\27\2\3(\30\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\5\2\7\7\t\t\13\13\5\2\b\b"+
		"\n\n\f\f\4\2\3\3\5\5\4\2\4\4\6\6\3\29:\3\2\668\3\2,\61\3\2\62\63\2\u019d"+
		"\2\61\3\2\2\2\4T\3\2\2\2\6m\3\2\2\2\b\u0082\3\2\2\2\n\u0095\3\2\2\2\f"+
		"\u0099\3\2\2\2\16\u00ab\3\2\2\2\20\u00b6\3\2\2\2\22\u00c2\3\2\2\2\24\u00c7"+
		"\3\2\2\2\26\u00cb\3\2\2\2\30\u00d9\3\2\2\2\32\u00e2\3\2\2\2\34\u00f2\3"+
		"\2\2\2\36\u0102\3\2\2\2 \u010f\3\2\2\2\"\u011b\3\2\2\2$\u0130\3\2\2\2"+
		"&\u0137\3\2\2\2(\u014b\3\2\2\2*\u0161\3\2\2\2,\u016f\3\2\2\2.\60\5$\23"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62<\3\2\2\2\63\61"+
		"\3\2\2\2\64\66\5\4\3\2\65\67\5$\23\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2"+
		"\2\289\3\2\2\29;\3\2\2\2:\64\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3"+
		"\2\2\2><\3\2\2\2?I\5\6\4\2@B\5$\23\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EF\5\4\3\2FH\3\2\2\2GA\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3"+
		"\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5$\23\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\t\2\2\2UV\7;\2\2VW\7"+
		"#\2\2WX\7;\2\2Xa\7$\2\2Y^\7;\2\2Z[\7*\2\2[]\7;\2\2\\Z\3\2\2\2]`\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\7%\2\2dh\7)\2\2eg\5\b\5\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\t\3\2\2l\5\3\2\2\2mn\t\4\2\2no\7;\2\2os\7)\2"+
		"\2pr\5\b\5\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2"+
		"\2vw\t\5\2\2w\7\3\2\2\2x\u0083\5\n\6\2y\u0083\5\f\7\2z\u0083\5\16\b\2"+
		"{\u0083\5\20\t\2|\u0083\5\26\f\2}\u0083\5\32\16\2~\u0083\5\36\20\2\177"+
		"\u0083\5 \21\2\u0080\u0083\5\"\22\2\u0081\u0083\5$\23\2\u0082x\3\2\2\2"+
		"\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3"+
		"\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085\7\16\2\2\u0085\u0086\7;\2\2\u0086"+
		"\u0087\7\17\2\2\u0087\u0096\7\r\2\2\u0088\u0089\7\27\2\2\u0089\u008a\7"+
		";\2\2\u008a\u008b\7&\2\2\u008b\u0090\5(\25\2\u008c\u008d\7*\2\2\u008d"+
		"\u008f\5(\25\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\'\2\2\u0094\u0096\3\2\2\2\u0095\u0084\3\2\2\2\u0095\u0088\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5&\24\2\u0098\13\3\2\2\2\u0099\u00a5"+
		"\7;\2\2\u009a\u009b\7&\2\2\u009b\u00a0\5(\25\2\u009c\u009d\7*\2\2\u009d"+
		"\u009f\5(\25\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7\'\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00a9\5(\25\2\u00a9"+
		"\u00aa\5&\24\2\u00aa\r\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00b1\5(\25"+
		"\2\u00ad\u00ae\7*\2\2\u00ae\u00b0\5(\25\2\u00af\u00ad\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\5&\24\2\u00b5\17\3\2\2\2\u00b6\u00b7\7\20\2"+
		"\2\u00b7\u00bc\7;\2\2\u00b8\u00b9\7*\2\2\u00b9\u00bb\7;\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5&\24\2\u00c0\21\3\2\2"+
		"\2\u00c1\u00c3\5\b\5\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c8\5\b\5\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce"+
		"\7\32\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d4\5\22\n\2\u00d0\u00d1\7\33\2"+
		"\2\u00d1\u00d2\5&\24\2\u00d2\u00d3\5\24\13\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\31"+
		"\2\2\u00d7\u00d8\5&\24\2\u00d8\27\3\2\2\2\u00d9\u00da\7\36\2\2\u00da\u00db"+
		"\7+\2\2\u00db\u00df\5&\24\2\u00dc\u00de\5\b\5\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\31\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\34\2\2\u00e3\u00e4\7;\2\2\u00e4\u00e5"+
		"\7\35\2\2\u00e5\u00e9\5&\24\2\u00e6\u00e8\5\34\17\2\u00e7\u00e6\3\2\2"+
		"\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00ec\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\37\2\2\u00f0\u00f1"+
		"\5&\24\2\u00f1\33\3\2\2\2\u00f2\u00f7\5(\25\2\u00f3\u00f4\7*\2\2\u00f4"+
		"\u00f6\5(\25\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fb\u00ff\5&\24\2\u00fc\u00fe\5\b\5\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\35\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\22\2\2\u0103\u0104\5(\25"+
		"\2\u0104\u0105\7\35\2\2\u0105\u0109\5&\24\2\u0106\u0108\5\b\5\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\23\2\2\u010d"+
		"\u010e\5&\24\2\u010e\37\3\2\2\2\u010f\u0110\7 \2\2\u0110\u0114\5&\24\2"+
		"\u0111\u0113\5\b\5\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7!\2\2\u0118\u0119\5(\25\2\u0119\u011a\5&\24\2\u011a!\3\2\2\2\u011b"+
		"\u011c\7\24\2\2\u011c\u011d\7;\2\2\u011d\u011e\7#\2\2\u011e\u011f\7<\2"+
		"\2\u011f\u0120\7\"\2\2\u0120\u0123\7<\2\2\u0121\u0122\7\26\2\2\u0122\u0124"+
		"\7<\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\7\35\2\2\u0126\u012a\5&\24\2\u0127\u0129\5\b\5\2\u0128\u0127\3"+
		"\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\25\2\2\u012e\u012f\5"+
		"&\24\2\u012f#\3\2\2\2\u0130\u0131\7)\2\2\u0131%\3\2\2\2\u0132\u0134\7"+
		"(\2\2\u0133\u0135\7)\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0138\7)\2\2\u0137\u0132\3\2\2\2\u0137\u0136\3\2"+
		"\2\2\u0138\'\3\2\2\2\u0139\u013a\b\25\1\2\u013a\u013b\t\6\2\2\u013b\u014c"+
		"\5(\25\n\u013c\u013d\7\64\2\2\u013d\u014c\5(\25\5\u013e\u014a\7;\2\2\u013f"+
		"\u014a\7<\2\2\u0140\u014a\7=\2\2\u0141\u014a\7>\2\2\u0142\u014a\7?\2\2"+
		"\u0143\u014a\5,\27\2\u0144\u014a\5*\26\2\u0145\u0146\7$\2\2\u0146\u0147"+
		"\5(\25\2\u0147\u0148\7%\2\2\u0148\u014a\3\2\2\2\u0149\u013e\3\2\2\2\u0149"+
		"\u013f\3\2\2\2\u0149\u0140\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u0142\3\2"+
		"\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0139\3\2\2\2\u014b\u013c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u015e\3\2\2\2\u014d\u014e\f\t\2\2\u014e\u014f\7\65\2\2\u014f"+
		"\u015d\5(\25\n\u0150\u0151\f\b\2\2\u0151\u0152\t\7\2\2\u0152\u015d\5("+
		"\25\t\u0153\u0154\f\7\2\2\u0154\u0155\t\6\2\2\u0155\u015d\5(\25\b\u0156"+
		"\u0157\f\6\2\2\u0157\u0158\t\b\2\2\u0158\u015d\5(\25\7\u0159\u015a\f\4"+
		"\2\2\u015a\u015b\t\t\2\2\u015b\u015d\5(\25\5\u015c\u014d\3\2\2\2\u015c"+
		"\u0150\3\2\2\2\u015c\u0153\3\2\2\2\u015c\u0156\3\2\2\2\u015c\u0159\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		")\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7;\2\2\u0162\u016b\7$\2\2\u0163"+
		"\u0168\5(\25\2\u0164\u0165\7*\2\2\u0165\u0167\5(\25\2\u0166\u0164\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0163\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7%\2\2\u016e+\3\2\2\2\u016f\u0170"+
		"\7;\2\2\u0170\u0171\7&\2\2\u0171\u0176\7<\2\2\u0172\u0173\7*\2\2\u0173"+
		"\u0175\7<\2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017a\7\'\2\2\u017a-\3\2\2\2(\618<CIO^ahs\u0082\u0090\u0095\u00a0\u00a5"+
		"\u00b1\u00bc\u00c4\u00c9\u00d4\u00df\u00e9\u00ed\u00f7\u00ff\u0109\u0114"+
		"\u0123\u012a\u0134\u0137\u0149\u014b\u015c\u015e\u0168\u016b\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}