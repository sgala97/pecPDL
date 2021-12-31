// Generated from /home/checo/Documentos/asignaturas/tercer curso/compiladores/pecPDL/pec3/Pec3/src/pseint_grammar.g4 by ANTLR 4.9.2
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
		RULE_pseint = 0, RULE_funcion = 1, RULE_algoritmo = 2, RULE_bloqueEstandar = 3, 
		RULE_bloque = 4, RULE_definicion = 5, RULE_asignacion = 6, RULE_escribir = 7, 
		RULE_leer = 8, RULE_bloquesi = 9, RULE_bloqueno = 10, RULE_sientonces = 11, 
		RULE_deotromodo = 12, RULE_segun = 13, RULE_caso = 14, RULE_mientras = 15, 
		RULE_repetir = 16, RULE_para = 17, RULE_lineavacia = 18, RULE_fininstruccion = 19, 
		RULE_operacion = 20, RULE_usofuncion = 21, RULE_usodimension = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"pseint", "funcion", "algoritmo", "bloqueEstandar", "bloque", "definicion", 
			"asignacion", "escribir", "leer", "bloquesi", "bloqueno", "sientonces", 
			"deotromodo", "segun", "caso", "mientras", "repetir", "para", "lineavacia", 
			"fininstruccion", "operacion", "usofuncion", "usodimension"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(46);
				lineavacia();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) {
				{
				{
				setState(52);
				funcion();
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					lineavacia();
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			algoritmo();
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(64);
						lineavacia();
						}
						}
						setState(67); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SALTOLINEA );
					setState(69);
					funcion();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTOLINEA) {
				{
				{
				setState(76);
				lineavacia();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCION) | (1L << SUBPROCESO) | (1L << SUBALGORITMO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			match(NOMBRE);
			setState(86);
			match(ASIGNACION);
			setState(87);
			match(NOMBRE);
			setState(88);
			match(APARENTESIS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOMBRE) {
				{
				setState(89);
				match(NOMBRE);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(90);
					match(COMA);
					setState(91);
					match(NOMBRE);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(CPARENTESIS);
			setState(100);
			match(SALTOLINEA);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(101);
				bloque();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==ALGORITMO || _la==PROCESO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			match(NOMBRE);
			setState(111);
			match(SALTOLINEA);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(112);
				bloque();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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

	public static class BloqueEstandarContext extends ParserRuleContext {
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<EscribirContext> escribir() {
			return getRuleContexts(EscribirContext.class);
		}
		public EscribirContext escribir(int i) {
			return getRuleContext(EscribirContext.class,i);
		}
		public List<LeerContext> leer() {
			return getRuleContexts(LeerContext.class);
		}
		public LeerContext leer(int i) {
			return getRuleContext(LeerContext.class,i);
		}
		public BloqueEstandarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueEstandar; }
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

	public final BloqueEstandarContext bloqueEstandar() throws RecognitionException {
		BloqueEstandarContext _localctx = new BloqueEstandarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloqueEstandar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(124);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEFINIR:
					case DIMENSION:
						{
						setState(120);
						definicion();
						}
						break;
					case NOMBRE:
						{
						setState(121);
						asignacion();
						}
						break;
					case ESCRIBIR:
						{
						setState(122);
						escribir();
						}
						break;
					case LEER:
						{
						setState(123);
						leer();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public BloqueEstandarContext bloqueEstandar() {
			return getRuleContext(BloqueEstandarContext.class,0);
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
		enterRule(_localctx, 8, RULE_bloque);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
			case LEER:
			case ESCRIBIR:
			case DIMENSION:
			case NOMBRE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				bloqueEstandar();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				sientonces();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				segun();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				repetir();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				para();
				}
				break;
			case SALTOLINEA:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
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
		enterRule(_localctx, 10, RULE_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINIR:
				{
				{
				setState(137);
				match(DEFINIR);
				setState(138);
				match(NOMBRE);
				setState(139);
				match(COMO);
				setState(140);
				match(TIPOVARIABLE);
				}
				}
				break;
			case DIMENSION:
				{
				{
				setState(141);
				match(DIMENSION);
				setState(142);
				match(NOMBRE);
				setState(143);
				match(ACORCHETE);
				{
				setState(144);
				operacion(0);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(145);
					match(COMA);
					setState(146);
					operacion(0);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(152);
				match(CCORCHETE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
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
		enterRule(_localctx, 12, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(NOMBRE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACORCHETE) {
				{
				setState(159);
				match(ACORCHETE);
				{
				setState(160);
				operacion(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(161);
					match(COMA);
					setState(162);
					operacion(0);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(168);
				match(CCORCHETE);
				}
			}

			setState(172);
			match(ASIGNACION);
			setState(173);
			operacion(0);
			setState(174);
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
		enterRule(_localctx, 14, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ESCRIBIR);
			setState(177);
			operacion(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(178);
				match(COMA);
				setState(179);
				operacion(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		enterRule(_localctx, 16, RULE_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(LEER);
			setState(188);
			match(NOMBRE);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(189);
				match(COMA);
				setState(190);
				match(NOMBRE);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
		enterRule(_localctx, 18, RULE_bloquesi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				bloque();
				}
				}
				setState(201); 
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
		enterRule(_localctx, 20, RULE_bloqueno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				bloque();
				}
				}
				setState(206); 
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
		enterRule(_localctx, 22, RULE_sientonces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SI);
			setState(209);
			operacion(0);
			setState(210);
			match(ENTONCES);
			setState(211);
			fininstruccion();
			setState(212);
			bloquesi();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(213);
				match(SINO);
				setState(214);
				fininstruccion();
				setState(215);
				bloqueno();
				}
			}

			setState(219);
			match(FINSI);
			setState(220);
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
		enterRule(_localctx, 24, RULE_deotromodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DEOTROMODO);
			setState(223);
			match(DOSPUNTOS);
			setState(224);
			fininstruccion();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(225);
				bloque();
				}
				}
				setState(230);
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
		enterRule(_localctx, 26, RULE_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(SEGUN);
			setState(232);
			match(NOMBRE);
			setState(233);
			match(HACER);
			setState(234);
			fininstruccion();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				{
				setState(235);
				caso();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEOTROMODO) {
				{
				setState(241);
				deotromodo();
				}
			}

			setState(244);
			match(FINSEGUN);
			setState(245);
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
		enterRule(_localctx, 28, RULE_caso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(247);
			operacion(0);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(248);
				match(COMA);
				setState(249);
				operacion(0);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(DOSPUNTOS);
			setState(256);
			fininstruccion();
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					bloque();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 30, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(MIENTRAS);
			setState(264);
			operacion(0);
			setState(265);
			match(HACER);
			setState(266);
			fininstruccion();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(267);
				bloque();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(FINMIENTRAS);
			setState(274);
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
		enterRule(_localctx, 32, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(REPETIR);
			setState(277);
			fininstruccion();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(278);
				bloque();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(HASTAQUE);
			setState(285);
			operacion(0);
			setState(286);
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
		enterRule(_localctx, 34, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(PARA);
			setState(289);
			match(NOMBRE);
			setState(290);
			match(ASIGNACION);
			setState(291);
			match(ENTERO);
			setState(292);
			match(HASTA);
			setState(293);
			match(ENTERO);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONPASO) {
				{
				setState(294);
				match(CONPASO);
				setState(295);
				match(ENTERO);
				}
			}

			setState(298);
			match(HACER);
			setState(299);
			fininstruccion();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << LEER) | (1L << ESCRIBIR) | (1L << MIENTRAS) | (1L << PARA) | (1L << DIMENSION) | (1L << SI) | (1L << SEGUN) | (1L << REPETIR) | (1L << SALTOLINEA) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(300);
				bloque();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(FINPARA);
			setState(307);
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
		enterRule(_localctx, 36, RULE_lineavacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 38, RULE_fininstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNTOCOMA:
				{
				{
				setState(311);
				match(PUNTOCOMA);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(312);
					match(SALTOLINEA);
					}
					break;
				}
				}
				}
				break;
			case SALTOLINEA:
				{
				setState(315);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_operacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
			case RESTA:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(319);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				operacion(8);
				}
				break;
			case NEGACION:
				{
				_localctx = new ConOperadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(NEGACION);
				setState(322);
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
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(323);
					match(NOMBRE);
					}
					break;
				case 2:
					{
					setState(324);
					match(ENTERO);
					}
					break;
				case 3:
					{
					setState(325);
					match(REAL);
					}
					break;
				case 4:
					{
					setState(326);
					match(LOGICO);
					}
					break;
				case 5:
					{
					setState(327);
					match(CADENA);
					}
					break;
				case 6:
					{
					setState(328);
					usodimension();
					}
					break;
				case 7:
					{
					setState(329);
					usofuncion();
					}
					break;
				case 8:
					{
					{
					setState(330);
					match(APARENTESIS);
					setState(331);
					operacion(0);
					setState(332);
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
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(338);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(339);
						match(POTENCIACION);
						}
						setState(340);
						operacion(8);
						}
						break;
					case 2:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(341);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(342);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << MULTIPLICACION) | (1L << DIVISION))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
						operacion(7);
						}
						break;
					case 3:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						_la = _input.LA(1);
						if ( !(_la==SUMA || _la==RESTA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						operacion(6);
						}
						break;
					case 4:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(347);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(348);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << IGUAL) | (1L << DISTINTO) | (1L << MENORIGUAL) | (1L << MAYORIGUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						operacion(5);
						}
						break;
					case 5:
						{
						_localctx = new ConOperadoresContext(new OperacionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(350);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(351);
						_la = _input.LA(1);
						if ( !(_la==CONJUNCION || _la==DISYUNCION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(352);
						operacion(3);
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 42, RULE_usofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(NOMBRE);
			setState(359);
			match(APARENTESIS);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APARENTESIS) | (1L << NEGACION) | (1L << SUMA) | (1L << RESTA) | (1L << NOMBRE) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO) | (1L << CADENA))) != 0)) {
				{
				setState(360);
				operacion(0);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(361);
					match(COMA);
					setState(362);
					operacion(0);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(370);
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
		enterRule(_localctx, 44, RULE_usodimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(NOMBRE);
			setState(373);
			match(ACORCHETE);
			setState(374);
			match(ENTERO);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(375);
				match(COMA);
				setState(376);
				match(ENTERO);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0183\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\6\29\n\2\r\2\16\2:\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\3\2\6\2D\n\2\r\2\16\2E\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2"+
		"P\n\2\f\2\16\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3_\n\3"+
		"\f\3\16\3b\13\3\5\3d\n\3\3\3\3\3\3\3\7\3i\n\3\f\3\16\3l\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\177"+
		"\n\5\r\5\16\5\u0080\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7"+
		"\3\7\5\7\u009d\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b"+
		"\u00a9\13\b\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00c2\n\n\f"+
		"\n\16\n\u00c5\13\n\3\n\3\n\3\13\6\13\u00ca\n\13\r\13\16\13\u00cb\3\f\6"+
		"\f\u00cf\n\f\r\f\16\f\u00d0\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17"+
		"\3\17\5\17\u00f5\n\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00fd\n\20\f"+
		"\20\16\20\u0100\13\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20\16\20\u0108"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\7\21\u010f\n\21\f\21\16\21\u0112\13\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u011a\n\22\f\22\16\22\u011d\13\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012b"+
		"\n\23\3\23\3\23\3\23\7\23\u0130\n\23\f\23\16\23\u0133\13\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\5\25\u013c\n\25\3\25\5\25\u013f\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0151\n\26\5\26\u0153\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0164\n\26\f\26\16\26\u0167"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\7\27\u016e\n\27\f\27\16\27\u0171\13\27"+
		"\5\27\u0173\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u017c\n\30\f"+
		"\30\16\30\u017f\13\30\3\30\3\30\3\30\2\3*\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\n\5\2\7\7\t\t\13\13\5\2\b\b\n\n\f\f\4\2\3\3\5"+
		"\5\4\2\4\4\6\6\3\29:\3\2\668\3\2,\61\3\2\62\63\2\u01a4\2\63\3\2\2\2\4"+
		"V\3\2\2\2\6o\3\2\2\2\b~\3\2\2\2\n\u0089\3\2\2\2\f\u009c\3\2\2\2\16\u00a0"+
		"\3\2\2\2\20\u00b2\3\2\2\2\22\u00bd\3\2\2\2\24\u00c9\3\2\2\2\26\u00ce\3"+
		"\2\2\2\30\u00d2\3\2\2\2\32\u00e0\3\2\2\2\34\u00e9\3\2\2\2\36\u00f9\3\2"+
		"\2\2 \u0109\3\2\2\2\"\u0116\3\2\2\2$\u0122\3\2\2\2&\u0137\3\2\2\2(\u013e"+
		"\3\2\2\2*\u0152\3\2\2\2,\u0168\3\2\2\2.\u0176\3\2\2\2\60\62\5&\24\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64>\3\2\2\2\65\63"+
		"\3\2\2\2\668\5\4\3\2\679\5&\24\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<\66\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AK\5\6\4\2BD\5&\24\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3"+
		"\2\2\2GH\5\4\3\2HJ\3\2\2\2IC\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3"+
		"\2\2\2MK\3\2\2\2NP\5&\24\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2VW\t\2\2\2WX\7;\2\2XY\7#\2\2YZ\7"+
		";\2\2Zc\7$\2\2[`\7;\2\2\\]\7*\2\2]_\7;\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7%"+
		"\2\2fj\7)\2\2gi\5\n\6\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2"+
		"\2\2lj\3\2\2\2mn\t\3\2\2n\5\3\2\2\2op\t\4\2\2pq\7;\2\2qu\7)\2\2rt\5\n"+
		"\6\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\t\5"+
		"\2\2y\7\3\2\2\2z\177\5\f\7\2{\177\5\16\b\2|\177\5\20\t\2}\177\5\22\n\2"+
		"~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082\u008a\5\b\5\2\u0083\u008a"+
		"\5\30\r\2\u0084\u008a\5\34\17\2\u0085\u008a\5 \21\2\u0086\u008a\5\"\22"+
		"\2\u0087\u008a\5$\23\2\u0088\u008a\5&\24\2\u0089\u0082\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\7\16\2"+
		"\2\u008c\u008d\7;\2\2\u008d\u008e\7\17\2\2\u008e\u009d\7\r\2\2\u008f\u0090"+
		"\7\27\2\2\u0090\u0091\7;\2\2\u0091\u0092\7&\2\2\u0092\u0097\5*\26\2\u0093"+
		"\u0094\7*\2\2\u0094\u0096\5*\26\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7\'\2\2\u009b\u009d\3\2\2\2\u009c\u008b\3\2"+
		"\2\2\u009c\u008f\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\5(\25\2\u009f"+
		"\r\3\2\2\2\u00a0\u00ac\7;\2\2\u00a1\u00a2\7&\2\2\u00a2\u00a7\5*\26\2\u00a3"+
		"\u00a4\7*\2\2\u00a4\u00a6\5*\26\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\'\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a1\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7#\2\2\u00af"+
		"\u00b0\5*\26\2\u00b0\u00b1\5(\25\2\u00b1\17\3\2\2\2\u00b2\u00b3\7\21\2"+
		"\2\u00b3\u00b8\5*\26\2\u00b4\u00b5\7*\2\2\u00b5\u00b7\5*\26\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5(\25\2\u00bc\21\3\2\2"+
		"\2\u00bd\u00be\7\20\2\2\u00be\u00c3\7;\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c2"+
		"\7;\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5("+
		"\25\2\u00c7\23\3\2\2\2\u00c8\u00ca\5\n\6\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\25\3\2\2\2\u00cd"+
		"\u00cf\5\n\6\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4"+
		"\5*\26\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\5(\25\2\u00d6\u00db\5\24\13"+
		"\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\5\26\f\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\5(\25\2\u00df\31\3\2\2\2\u00e0\u00e1"+
		"\7\36\2\2\u00e1\u00e2\7+\2\2\u00e2\u00e6\5(\25\2\u00e3\u00e5\5\n\6\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\33\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\34\2\2\u00ea\u00eb"+
		"\7;\2\2\u00eb\u00ec\7\35\2\2\u00ec\u00f0\5(\25\2\u00ed\u00ef\5\36\20\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\5\32\16\2"+
		"\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\7\37\2\2\u00f7\u00f8\5(\25\2\u00f8\35\3\2\2\2\u00f9\u00fe\5*\26\2\u00fa"+
		"\u00fb\7*\2\2\u00fb\u00fd\5*\26\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7+\2\2\u0102\u0106\5(\25\2\u0103\u0105\5\n"+
		"\6\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\37\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\22\2"+
		"\2\u010a\u010b\5*\26\2\u010b\u010c\7\35\2\2\u010c\u0110\5(\25\2\u010d"+
		"\u010f\5\n\6\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0114\7\23\2\2\u0114\u0115\5(\25\2\u0115!\3\2\2\2\u0116\u0117\7 \2\2"+
		"\u0117\u011b\5(\25\2\u0118\u011a\5\n\6\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7!\2\2\u011f\u0120\5*\26\2\u0120\u0121\5(\25"+
		"\2\u0121#\3\2\2\2\u0122\u0123\7\24\2\2\u0123\u0124\7;\2\2\u0124\u0125"+
		"\7#\2\2\u0125\u0126\7<\2\2\u0126\u0127\7\"\2\2\u0127\u012a\7<\2\2\u0128"+
		"\u0129\7\26\2\2\u0129\u012b\7<\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\35\2\2\u012d\u0131\5(\25\2\u012e"+
		"\u0130\5\n\6\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\7\25\2\2\u0135\u0136\5(\25\2\u0136%\3\2\2\2\u0137\u0138\7)\2\2"+
		"\u0138\'\3\2\2\2\u0139\u013b\7(\2\2\u013a\u013c\7)\2\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013f\7)\2\2\u013e"+
		"\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f)\3\2\2\2\u0140\u0141\b\26\1\2"+
		"\u0141\u0142\t\6\2\2\u0142\u0153\5*\26\n\u0143\u0144\7\64\2\2\u0144\u0153"+
		"\5*\26\5\u0145\u0151\7;\2\2\u0146\u0151\7<\2\2\u0147\u0151\7=\2\2\u0148"+
		"\u0151\7>\2\2\u0149\u0151\7?\2\2\u014a\u0151\5.\30\2\u014b\u0151\5,\27"+
		"\2\u014c\u014d\7$\2\2\u014d\u014e\5*\26\2\u014e\u014f\7%\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u0145\3\2\2\2\u0150\u0146\3\2\2\2\u0150\u0147\3\2\2\2\u0150"+
		"\u0148\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014b\3\2"+
		"\2\2\u0150\u014c\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0140\3\2\2\2\u0152"+
		"\u0143\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0165\3\2\2\2\u0154\u0155\f\t"+
		"\2\2\u0155\u0156\7\65\2\2\u0156\u0164\5*\26\n\u0157\u0158\f\b\2\2\u0158"+
		"\u0159\t\7\2\2\u0159\u0164\5*\26\t\u015a\u015b\f\7\2\2\u015b\u015c\t\6"+
		"\2\2\u015c\u0164\5*\26\b\u015d\u015e\f\6\2\2\u015e\u015f\t\b\2\2\u015f"+
		"\u0164\5*\26\7\u0160\u0161\f\4\2\2\u0161\u0162\t\t\2\2\u0162\u0164\5*"+
		"\26\5\u0163\u0154\3\2\2\2\u0163\u0157\3\2\2\2\u0163\u015a\3\2\2\2\u0163"+
		"\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166+\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169"+
		"\7;\2\2\u0169\u0172\7$\2\2\u016a\u016f\5*\26\2\u016b\u016c\7*\2\2\u016c"+
		"\u016e\5*\26\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u016a\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7%"+
		"\2\2\u0175-\3\2\2\2\u0176\u0177\7;\2\2\u0177\u0178\7&\2\2\u0178\u017d"+
		"\7<\2\2\u0179\u017a\7*\2\2\u017a\u017c\7<\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\'\2\2\u0181/\3\2\2\2*\63:>EKQ`"+
		"cju~\u0080\u0089\u0097\u009c\u00a7\u00ac\u00b8\u00c3\u00cb\u00d0\u00db"+
		"\u00e6\u00f0\u00f4\u00fe\u0106\u0110\u011b\u012a\u0131\u013b\u013e\u0150"+
		"\u0152\u0163\u0165\u016f\u0172\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}