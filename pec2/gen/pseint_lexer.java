// Generated from C:/Users/oqueo/GitHub/pecPDL/pec2/src\pseint_lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pseint_lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FINALGORITMO", "PROCESO", "FINPROCESO", "FUNCION", "FINFUNCION", 
			"SUBPROCESO", "FINSUBPROCESO", "SUBALGORITMO", "FINSUBALGORITMO", "TIPOVARIABLE", 
			"DEFINIR", "COMO", "LEER", "ESCRIBIR", "MIENTRAS", "FINMIENTRAS", "PARA", 
			"FINPARA", "CONPASO", "DIMENSION", "SI", "FINSI", "ENTONCES", "SINO", 
			"SEGUN", "HACER", "DEOTROMODO", "FINSEGUN", "REPETIR", "HASTAQUE", "HASTA", 
			"ASIGNACION", "APARENTESIS", "CPARENTESIS", "ACORCHETE", "CCORCHETE", 
			"PUNTOCOMA", "SALTOLINEA", "COMA", "DOSPUNTOS", "MAYOR", "MENOR", "IGUAL", 
			"DISTINTO", "MENORIGUAL", "MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", 
			"POTENCIACION", "MODULO", "MULTIPLICACION", "DIVISION", "SUMA", "RESTA", 
			"NOMBRE", "ENTERO", "REAL", "LOGICO", "CADENA", "COMENTARIOLINEA", "COMENTARIOMULTILINEA", 
			"WS", "ESCAPAR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
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


	public pseint_lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pseint_lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u02fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00c8\n\3\f\3\16\3\u00cb\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\7\5\u00e3\n\5\f\5\16\5\u00e6\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00fc"+
		"\n\7\f\7\16\7\u00ff\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u0118\n\t\f\t\16\t"+
		"\u011b\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0139"+
		"\n\13\f\13\16\13\u013c\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0167\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0191"+
		"\n\22\f\22\16\22\u0194\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u01a8\n\24\f\24"+
		"\16\24\u01ab\13\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\6\25\u01b6"+
		"\n\25\r\25\16\25\u01b7\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01d0"+
		"\n\30\f\30\16\30\u01d3\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\6\35\u01f5\n\35\r\35"+
		"\16\35\u01f6\3\35\3\35\3\35\3\35\3\35\6\35\u01fe\n\35\r\35\16\35\u01ff"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u021e\n"+
		" \f \16 \u0221\13 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3"+
		".\5.\u024a\n.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\5\61\u0254\n\61\3\62\3"+
		"\62\5\62\u0258\n\62\3\63\3\63\3\63\3\63\5\63\u025e\n\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0267\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\7:\u0273\n:\f:\16:\u0276\13:\3;\6;\u0279\n;\r;\16;\u027a\3<\6<\u027e"+
		"\n<\r<\16<\u027f\3<\3<\6<\u0284\n<\r<\16<\u0285\5<\u0288\n<\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u029a\n=\3>\3>\3>\7>\u029f\n"+
		">\f>\16>\u02a2\13>\3>\3>\3?\3?\3?\3?\7?\u02aa\n?\f?\16?\u02ad\13?\3?\3"+
		"?\3@\3@\3@\3@\7@\u02b5\n@\f@\16@\u02b8\13@\3@\3@\3@\3@\3@\3A\6A\u02c0"+
		"\nA\rA\16A\u02c1\3A\3A\3B\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\4\u02a0\u02b6\2]\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d"+
		"\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3\2\u00b5\2\u00b7\2\3\2#\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4\2$$"+
		"))\3\2\f\f\4\2\13\13\"\"\5\2$$))^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u02ff\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\3\u00b9\3\2\2\2\5\u00c3\3\2\2\2\7\u00d6\3\2\2"+
		"\2\t\u00de\3\2\2\2\13\u00ef\3\2\2\2\r\u00f7\3\2\2\2\17\u0108\3\2\2\2\21"+
		"\u0113\3\2\2\2\23\u0127\3\2\2\2\25\u0134\3\2\2\2\27\u0166\3\2\2\2\31\u0168"+
		"\3\2\2\2\33\u0170\3\2\2\2\35\u0175\3\2\2\2\37\u017a\3\2\2\2!\u0183\3\2"+
		"\2\2#\u018c\3\2\2\2%\u019e\3\2\2\2\'\u01a3\3\2\2\2)\u01b1\3\2\2\2+\u01be"+
		"\3\2\2\2-\u01c8\3\2\2\2/\u01cb\3\2\2\2\61\u01d7\3\2\2\2\63\u01e0\3\2\2"+
		"\2\65\u01e5\3\2\2\2\67\u01eb\3\2\2\29\u01f1\3\2\2\2;\u0206\3\2\2\2=\u020f"+
		"\3\2\2\2?\u0217\3\2\2\2A\u0226\3\2\2\2C\u022c\3\2\2\2E\u022f\3\2\2\2G"+
		"\u0231\3\2\2\2I\u0233\3\2\2\2K\u0235\3\2\2\2M\u0237\3\2\2\2O\u0239\3\2"+
		"\2\2Q\u023b\3\2\2\2S\u023d\3\2\2\2U\u023f\3\2\2\2W\u0241\3\2\2\2Y\u0243"+
		"\3\2\2\2[\u0249\3\2\2\2]\u024b\3\2\2\2_\u024e\3\2\2\2a\u0253\3\2\2\2c"+
		"\u0257\3\2\2\2e\u025d\3\2\2\2g\u025f\3\2\2\2i\u0266\3\2\2\2k\u0268\3\2"+
		"\2\2m\u026a\3\2\2\2o\u026c\3\2\2\2q\u026e\3\2\2\2s\u0270\3\2\2\2u\u0278"+
		"\3\2\2\2w\u027d\3\2\2\2y\u0299\3\2\2\2{\u029b\3\2\2\2}\u02a5\3\2\2\2\177"+
		"\u02b0\3\2\2\2\u0081\u02bf\3\2\2\2\u0083\u02c5\3\2\2\2\u0085\u02c8\3\2"+
		"\2\2\u0087\u02ca\3\2\2\2\u0089\u02cc\3\2\2\2\u008b\u02ce\3\2\2\2\u008d"+
		"\u02d0\3\2\2\2\u008f\u02d2\3\2\2\2\u0091\u02d4\3\2\2\2\u0093\u02d6\3\2"+
		"\2\2\u0095\u02d8\3\2\2\2\u0097\u02da\3\2\2\2\u0099\u02dc\3\2\2\2\u009b"+
		"\u02de\3\2\2\2\u009d\u02e0\3\2\2\2\u009f\u02e2\3\2\2\2\u00a1\u02e4\3\2"+
		"\2\2\u00a3\u02e6\3\2\2\2\u00a5\u02e8\3\2\2\2\u00a7\u02ea\3\2\2\2\u00a9"+
		"\u02ec\3\2\2\2\u00ab\u02ee\3\2\2\2\u00ad\u02f0\3\2\2\2\u00af\u02f2\3\2"+
		"\2\2\u00b1\u02f4\3\2\2\2\u00b3\u02f6\3\2\2\2\u00b5\u02f8\3\2\2\2\u00b7"+
		"\u02fa\3\2\2\2\u00b9\u00ba\5\u0085C\2\u00ba\u00bb\5\u009bN\2\u00bb\u00bc"+
		"\5\u0091I\2\u00bc\u00bd\5\u00a1Q\2\u00bd\u00be\5\u00a7T\2\u00be\u00bf"+
		"\5\u0095K\2\u00bf\u00c0\5\u00abV\2\u00c0\u00c1\5\u009dO\2\u00c1\u00c2"+
		"\5\u00a1Q\2\u00c2\4\3\2\2\2\u00c3\u00c4\5\u008fH\2\u00c4\u00c5\5\u0095"+
		"K\2\u00c5\u00c9\5\u009fP\2\u00c6\u00c8\7\"\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5\u0085C\2\u00cd\u00ce\5\u009bN\2"+
		"\u00ce\u00cf\5\u0091I\2\u00cf\u00d0\5\u00a1Q\2\u00d0\u00d1\5\u00a7T\2"+
		"\u00d1\u00d2\5\u0095K\2\u00d2\u00d3\5\u00abV\2\u00d3\u00d4\5\u009dO\2"+
		"\u00d4\u00d5\5\u00a1Q\2\u00d5\6\3\2\2\2\u00d6\u00d7\5\u00a3R\2\u00d7\u00d8"+
		"\5\u00a7T\2\u00d8\u00d9\5\u00a1Q\2\u00d9\u00da\5\u0089E\2\u00da\u00db"+
		"\5\u008dG\2\u00db\u00dc\5\u00a9U\2\u00dc\u00dd\5\u00a1Q\2\u00dd\b\3\2"+
		"\2\2\u00de\u00df\5\u008fH\2\u00df\u00e0\5\u0095K\2\u00e0\u00e4\5\u009f"+
		"P\2\u00e1\u00e3\7\"\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\5\u00a3R\2\u00e8\u00e9\5\u00a7T\2\u00e9\u00ea\5\u00a1"+
		"Q\2\u00ea\u00eb\5\u0089E\2\u00eb\u00ec\5\u008dG\2\u00ec\u00ed\5\u00a9"+
		"U\2\u00ed\u00ee\5\u00a1Q\2\u00ee\n\3\2\2\2\u00ef\u00f0\5\u008fH\2\u00f0"+
		"\u00f1\5\u00adW\2\u00f1\u00f2\5\u009fP\2\u00f2\u00f3\5\u0089E\2\u00f3"+
		"\u00f4\5\u0095K\2\u00f4\u00f5\5\u00a1Q\2\u00f5\u00f6\5\u009fP\2\u00f6"+
		"\f\3\2\2\2\u00f7\u00f8\5\u008fH\2\u00f8\u00f9\5\u0095K\2\u00f9\u00fd\5"+
		"\u009fP\2\u00fa\u00fc\7\"\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\5\u008fH\2\u0101\u0102\5\u00adW\2\u0102\u0103\5\u009f"+
		"P\2\u0103\u0104\5\u0089E\2\u0104\u0105\5\u0095K\2\u0105\u0106\5\u00a1"+
		"Q\2\u0106\u0107\5\u009fP\2\u0107\16\3\2\2\2\u0108\u0109\5\u00a9U\2\u0109"+
		"\u010a\5\u00adW\2\u010a\u010b\5\u0087D\2\u010b\u010c\5\u00a3R\2\u010c"+
		"\u010d\5\u00a7T\2\u010d\u010e\5\u00a1Q\2\u010e\u010f\5\u0089E\2\u010f"+
		"\u0110\5\u008dG\2\u0110\u0111\5\u00a9U\2\u0111\u0112\5\u00a1Q\2\u0112"+
		"\20\3\2\2\2\u0113\u0114\5\u008fH\2\u0114\u0115\5\u0095K\2\u0115\u0119"+
		"\5\u009fP\2\u0116\u0118\7\"\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011d\5\u00a9U\2\u011d\u011e\5\u00adW\2\u011e\u011f\5\u0087"+
		"D\2\u011f\u0120\5\u00a3R\2\u0120\u0121\5\u00a7T\2\u0121\u0122\5\u00a1"+
		"Q\2\u0122\u0123\5\u0089E\2\u0123\u0124\5\u008dG\2\u0124\u0125\5\u00a9"+
		"U\2\u0125\u0126\5\u00a1Q\2\u0126\22\3\2\2\2\u0127\u0128\5\u00a9U\2\u0128"+
		"\u0129\5\u00adW\2\u0129\u012a\5\u0087D\2\u012a\u012b\5\u0085C\2\u012b"+
		"\u012c\5\u009bN\2\u012c\u012d\5\u0091I\2\u012d\u012e\5\u00a1Q\2\u012e"+
		"\u012f\5\u00a7T\2\u012f\u0130\5\u0095K\2\u0130\u0131\5\u00abV\2\u0131"+
		"\u0132\5\u009dO\2\u0132\u0133\5\u00a1Q\2\u0133\24\3\2\2\2\u0134\u0135"+
		"\5\u008fH\2\u0135\u0136\5\u0095K\2\u0136\u013a\5\u009fP\2\u0137\u0139"+
		"\7\"\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\5\u00a9"+
		"U\2\u013e\u013f\5\u00adW\2\u013f\u0140\5\u0087D\2\u0140\u0141\5\u0085"+
		"C\2\u0141\u0142\5\u009bN\2\u0142\u0143\5\u0091I\2\u0143\u0144\5\u00a1"+
		"Q\2\u0144\u0145\5\u00a7T\2\u0145\u0146\5\u0095K\2\u0146\u0147\5\u00ab"+
		"V\2\u0147\u0148\5\u009dO\2\u0148\u0149\5\u00a1Q\2\u0149\26\3\2\2\2\u014a"+
		"\u014b\5\u00a7T\2\u014b\u014c\5\u008dG\2\u014c\u014d\5\u0085C\2\u014d"+
		"\u014e\5\u009bN\2\u014e\u0167\3\2\2\2\u014f\u0150\5\u008dG\2\u0150\u0151"+
		"\5\u009fP\2\u0151\u0152\5\u00abV\2\u0152\u0153\5\u008dG\2\u0153\u0154"+
		"\5\u00a7T\2\u0154\u0155\5\u00a1Q\2\u0155\u0167\3\2\2\2\u0156\u0157\5\u009b"+
		"N\2\u0157\u0158\5\u00a1Q\2\u0158\u0159\5\u0091I\2\u0159\u015a\5\u0095"+
		"K\2\u015a\u015b\5\u0089E\2\u015b\u015c\5\u00a1Q\2\u015c\u0167\3\2\2\2"+
		"\u015d\u015e\5\u0089E\2\u015e\u015f\5\u0085C\2\u015f\u0160\5\u00a7T\2"+
		"\u0160\u0161\5\u0085C\2\u0161\u0162\5\u0089E\2\u0162\u0163\5\u00abV\2"+
		"\u0163\u0164\5\u008dG\2\u0164\u0165\5\u00a7T\2\u0165\u0167\3\2\2\2\u0166"+
		"\u014a\3\2\2\2\u0166\u014f\3\2\2\2\u0166\u0156\3\2\2\2\u0166\u015d\3\2"+
		"\2\2\u0167\30\3\2\2\2\u0168\u0169\5\u008bF\2\u0169\u016a\5\u008dG\2\u016a"+
		"\u016b\5\u008fH\2\u016b\u016c\5\u0095K\2\u016c\u016d\5\u009fP\2\u016d"+
		"\u016e\5\u0095K\2\u016e\u016f\5\u00a7T\2\u016f\32\3\2\2\2\u0170\u0171"+
		"\5\u0089E\2\u0171\u0172\5\u00a1Q\2\u0172\u0173\5\u009dO\2\u0173\u0174"+
		"\5\u00a1Q\2\u0174\34\3\2\2\2\u0175\u0176\5\u009bN\2\u0176\u0177\5\u008d"+
		"G\2\u0177\u0178\5\u008dG\2\u0178\u0179\5\u00a7T\2\u0179\36\3\2\2\2\u017a"+
		"\u017b\5\u008dG\2\u017b\u017c\5\u00a9U\2\u017c\u017d\5\u0089E\2\u017d"+
		"\u017e\5\u00a7T\2\u017e\u017f\5\u0095K\2\u017f\u0180\5\u0087D\2\u0180"+
		"\u0181\5\u0095K\2\u0181\u0182\5\u00a7T\2\u0182 \3\2\2\2\u0183\u0184\5"+
		"\u009dO\2\u0184\u0185\5\u0095K\2\u0185\u0186\5\u008dG\2\u0186\u0187\5"+
		"\u009fP\2\u0187\u0188\5\u00abV\2\u0188\u0189\5\u00a7T\2\u0189\u018a\5"+
		"\u0085C\2\u018a\u018b\5\u00a9U\2\u018b\"\3\2\2\2\u018c\u018d\5\u008fH"+
		"\2\u018d\u018e\5\u0095K\2\u018e\u0192\5\u009fP\2\u018f\u0191\7\"\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\5\u009dO\2\u0196"+
		"\u0197\5\u0095K\2\u0197\u0198\5\u008dG\2\u0198\u0199\5\u009fP\2\u0199"+
		"\u019a\5\u00abV\2\u019a\u019b\5\u00a7T\2\u019b\u019c\5\u0085C\2\u019c"+
		"\u019d\5\u00a9U\2\u019d$\3\2\2\2\u019e\u019f\5\u00a3R\2\u019f\u01a0\5"+
		"\u0085C\2\u01a0\u01a1\5\u00a7T\2\u01a1\u01a2\5\u0085C\2\u01a2&\3\2\2\2"+
		"\u01a3\u01a4\5\u008fH\2\u01a4\u01a5\5\u0095K\2\u01a5\u01a9\5\u009fP\2"+
		"\u01a6\u01a8\7\"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ad\5\u00a3R\2\u01ad\u01ae\5\u0085C\2\u01ae\u01af\5\u00a7T\2\u01af"+
		"\u01b0\5\u0085C\2\u01b0(\3\2\2\2\u01b1\u01b2\5\u0089E\2\u01b2\u01b3\5"+
		"\u00a1Q\2\u01b3\u01b5\5\u009fP\2\u01b4\u01b6\7\"\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01ba\5\u00a3R\2\u01ba\u01bb\5\u0085C\2\u01bb\u01bc\5\u00a9"+
		"U\2\u01bc\u01bd\5\u00a1Q\2\u01bd*\3\2\2\2\u01be\u01bf\5\u008bF\2\u01bf"+
		"\u01c0\5\u0095K\2\u01c0\u01c1\5\u009dO\2\u01c1\u01c2\5\u008dG\2\u01c2"+
		"\u01c3\5\u009fP\2\u01c3\u01c4\5\u00a9U\2\u01c4\u01c5\5\u0095K\2\u01c5"+
		"\u01c6\5\u00a1Q\2\u01c6\u01c7\5\u009fP\2\u01c7,\3\2\2\2\u01c8\u01c9\5"+
		"\u00a9U\2\u01c9\u01ca\5\u0095K\2\u01ca.\3\2\2\2\u01cb\u01cc\5\u008fH\2"+
		"\u01cc\u01cd\5\u0095K\2\u01cd\u01d1\5\u009fP\2\u01ce\u01d0\7\"\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\5\u00a9U\2\u01d5"+
		"\u01d6\5\u0095K\2\u01d6\60\3\2\2\2\u01d7\u01d8\5\u008dG\2\u01d8\u01d9"+
		"\5\u009fP\2\u01d9\u01da\5\u00abV\2\u01da\u01db\5\u00a1Q\2\u01db\u01dc"+
		"\5\u009fP\2\u01dc\u01dd\5\u0089E\2\u01dd\u01de\5\u008dG\2\u01de\u01df"+
		"\5\u00a9U\2\u01df\62\3\2\2\2\u01e0\u01e1\5\u00a9U\2\u01e1\u01e2\5\u0095"+
		"K\2\u01e2\u01e3\5\u009fP\2\u01e3\u01e4\5\u00a1Q\2\u01e4\64\3\2\2\2\u01e5"+
		"\u01e6\5\u00a9U\2\u01e6\u01e7\5\u008dG\2\u01e7\u01e8\5\u0091I\2\u01e8"+
		"\u01e9\5\u00adW\2\u01e9\u01ea\5\u009fP\2\u01ea\66\3\2\2\2\u01eb\u01ec"+
		"\5\u0093J\2\u01ec\u01ed\5\u0085C\2\u01ed\u01ee\5\u0089E\2\u01ee\u01ef"+
		"\5\u008dG\2\u01ef\u01f0\5\u00a7T\2\u01f08\3\2\2\2\u01f1\u01f2\5\u008b"+
		"F\2\u01f2\u01f4\5\u008dG\2\u01f3\u01f5\7\"\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\5\u00a1Q\2\u01f9\u01fa\5\u00abV\2\u01fa\u01fb\5\u00a7"+
		"T\2\u01fb\u01fd\5\u00a1Q\2\u01fc\u01fe\7\"\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0202\5\u009dO\2\u0202\u0203\5\u00a1Q\2\u0203\u0204\5\u008b"+
		"F\2\u0204\u0205\5\u00a1Q\2\u0205:\3\2\2\2\u0206\u0207\5\u008fH\2\u0207"+
		"\u0208\5\u0095K\2\u0208\u0209\5\u009fP\2\u0209\u020a\5\u00a9U\2\u020a"+
		"\u020b\5\u008dG\2\u020b\u020c\5\u0091I\2\u020c\u020d\5\u00adW\2\u020d"+
		"\u020e\5\u009fP\2\u020e<\3\2\2\2\u020f\u0210\5\u00a7T\2\u0210\u0211\5"+
		"\u008dG\2\u0211\u0212\5\u00a3R\2\u0212\u0213\5\u008dG\2\u0213\u0214\5"+
		"\u00abV\2\u0214\u0215\5\u0095K\2\u0215\u0216\5\u00a7T\2\u0216>\3\2\2\2"+
		"\u0217\u0218\5\u0093J\2\u0218\u0219\5\u0085C\2\u0219\u021a\5\u00a9U\2"+
		"\u021a\u021b\5\u00abV\2\u021b\u021f\5\u0085C\2\u021c\u021e\7\"\2\2\u021d"+
		"\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\5\u00a5S\2\u0223"+
		"\u0224\5\u00adW\2\u0224\u0225\5\u008dG\2\u0225@\3\2\2\2\u0226\u0227\5"+
		"\u0093J\2\u0227\u0228\5\u0085C\2\u0228\u0229\5\u00a9U\2\u0229\u022a\5"+
		"\u00abV\2\u022a\u022b\5\u0085C\2\u022bB\3\2\2\2\u022c\u022d\7>\2\2\u022d"+
		"\u022e\7/\2\2\u022eD\3\2\2\2\u022f\u0230\7*\2\2\u0230F\3\2\2\2\u0231\u0232"+
		"\7+\2\2\u0232H\3\2\2\2\u0233\u0234\7]\2\2\u0234J\3\2\2\2\u0235\u0236\7"+
		"_\2\2\u0236L\3\2\2\2\u0237\u0238\7=\2\2\u0238N\3\2\2\2\u0239\u023a\7\f"+
		"\2\2\u023aP\3\2\2\2\u023b\u023c\7.\2\2\u023cR\3\2\2\2\u023d\u023e\7<\2"+
		"\2\u023eT\3\2\2\2\u023f\u0240\7@\2\2\u0240V\3\2\2\2\u0241\u0242\7>\2\2"+
		"\u0242X\3\2\2\2\u0243\u0244\7?\2\2\u0244Z\3\2\2\2\u0245\u0246\7>\2\2\u0246"+
		"\u024a\7@\2\2\u0247\u0248\7#\2\2\u0248\u024a\7?\2\2\u0249\u0245\3\2\2"+
		"\2\u0249\u0247\3\2\2\2\u024a\\\3\2\2\2\u024b\u024c\7>\2\2\u024c\u024d"+
		"\7?\2\2\u024d^\3\2\2\2\u024e\u024f\7@\2\2\u024f\u0250\7?\2\2\u0250`\3"+
		"\2\2\2\u0251\u0254\7(\2\2\u0252\u0254\5\u00b5[\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0252\3\2\2\2\u0254b\3\2\2\2\u0255\u0258\7~\2\2\u0256\u0258\5\u00a1Q"+
		"\2\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258d\3\2\2\2\u0259\u025e"+
		"\7\u0080\2\2\u025a\u025b\5\u009fP\2\u025b\u025c\5\u00a1Q\2\u025c\u025e"+
		"\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025ef\3\2\2\2\u025f"+
		"\u0260\7`\2\2\u0260h\3\2\2\2\u0261\u0267\7\'\2\2\u0262\u0263\5\u009dO"+
		"\2\u0263\u0264\5\u00a1Q\2\u0264\u0265\5\u008bF\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0261\3\2\2\2\u0266\u0262\3\2\2\2\u0267j\3\2\2\2\u0268\u0269\7,\2\2\u0269"+
		"l\3\2\2\2\u026a\u026b\7\61\2\2\u026bn\3\2\2\2\u026c\u026d\7-\2\2\u026d"+
		"p\3\2\2\2\u026e\u026f\7/\2\2\u026fr\3\2\2\2\u0270\u0274\t\2\2\2\u0271"+
		"\u0273\t\3\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275t\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279"+
		"\t\4\2\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027bv\3\2\2\2\u027c\u027e\t\4\2\2\u027d\u027c\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0287"+
		"\3\2\2\2\u0281\u0283\7\60\2\2\u0282\u0284\t\4\2\2\u0283\u0282\3\2\2\2"+
		"\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288"+
		"\3\2\2\2\u0287\u0281\3\2\2\2\u0287\u0288\3\2\2\2\u0288x\3\2\2\2\u0289"+
		"\u028a\5\u00afX\2\u028a\u028b\5\u008dG\2\u028b\u028c\5\u00a7T\2\u028c"+
		"\u028d\5\u008bF\2\u028d\u028e\5\u0085C\2\u028e\u028f\5\u008bF\2\u028f"+
		"\u0290\5\u008dG\2\u0290\u0291\5\u00a7T\2\u0291\u0292\5\u00a1Q\2\u0292"+
		"\u029a\3\2\2\2\u0293\u0294\5\u008fH\2\u0294\u0295\5\u0085C\2\u0295\u0296"+
		"\5\u009bN\2\u0296\u0297\5\u00a9U\2\u0297\u0298\5\u00a1Q\2\u0298\u029a"+
		"\3\2\2\2\u0299\u0289\3\2\2\2\u0299\u0293\3\2\2\2\u029az\3\2\2\2\u029b"+
		"\u02a0\t\5\2\2\u029c\u029f\5\u0083B\2\u029d\u029f\n\5\2\2\u029e\u029c"+
		"\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\t\5"+
		"\2\2\u02a4|\3\2\2\2\u02a5\u02a6\7\61\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02ab"+
		"\3\2\2\2\u02a8\u02aa\n\6\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ae\u02af\b?\2\2\u02af~\3\2\2\2\u02b0\u02b1\7\61\2\2\u02b1\u02b2"+
		"\7,\2\2\u02b2\u02b6\3\2\2\2\u02b3\u02b5\13\2\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b8\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9\3\2"+
		"\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02ba\7,\2\2\u02ba\u02bb\7\61\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bc\u02bd\b@\2\2\u02bd\u0080\3\2\2\2\u02be\u02c0\t\7"+
		"\2\2\u02bf\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\bA\2\2\u02c4\u0082\3\2"+
		"\2\2\u02c5\u02c6\7^\2\2\u02c6\u02c7\t\b\2\2\u02c7\u0084\3\2\2\2\u02c8"+
		"\u02c9\t\t\2\2\u02c9\u0086\3\2\2\2\u02ca\u02cb\t\n\2\2\u02cb\u0088\3\2"+
		"\2\2\u02cc\u02cd\t\13\2\2\u02cd\u008a\3\2\2\2\u02ce\u02cf\t\f\2\2\u02cf"+
		"\u008c\3\2\2\2\u02d0\u02d1\t\r\2\2\u02d1\u008e\3\2\2\2\u02d2\u02d3\t\16"+
		"\2\2\u02d3\u0090\3\2\2\2\u02d4\u02d5\t\17\2\2\u02d5\u0092\3\2\2\2\u02d6"+
		"\u02d7\t\20\2\2\u02d7\u0094\3\2\2\2\u02d8\u02d9\t\21\2\2\u02d9\u0096\3"+
		"\2\2\2\u02da\u02db\t\22\2\2\u02db\u0098\3\2\2\2\u02dc\u02dd\t\23\2\2\u02dd"+
		"\u009a\3\2\2\2\u02de\u02df\t\24\2\2\u02df\u009c\3\2\2\2\u02e0\u02e1\t"+
		"\25\2\2\u02e1\u009e\3\2\2\2\u02e2\u02e3\t\26\2\2\u02e3\u00a0\3\2\2\2\u02e4"+
		"\u02e5\t\27\2\2\u02e5\u00a2\3\2\2\2\u02e6\u02e7\t\30\2\2\u02e7\u00a4\3"+
		"\2\2\2\u02e8\u02e9\t\31\2\2\u02e9\u00a6\3\2\2\2\u02ea\u02eb\t\32\2\2\u02eb"+
		"\u00a8\3\2\2\2\u02ec\u02ed\t\33\2\2\u02ed\u00aa\3\2\2\2\u02ee\u02ef\t"+
		"\34\2\2\u02ef\u00ac\3\2\2\2\u02f0\u02f1\t\35\2\2\u02f1\u00ae\3\2\2\2\u02f2"+
		"\u02f3\t\36\2\2\u02f3\u00b0\3\2\2\2\u02f4\u02f5\t\37\2\2\u02f5\u00b2\3"+
		"\2\2\2\u02f6\u02f7\t \2\2\u02f7\u00b4\3\2\2\2\u02f8\u02f9\t!\2\2\u02f9"+
		"\u00b6\3\2\2\2\u02fa\u02fb\t\"\2\2\u02fb\u00b8\3\2\2\2 \2\u00c9\u00e4"+
		"\u00fd\u0119\u013a\u0166\u0192\u01a9\u01b7\u01d1\u01f6\u01ff\u021f\u0249"+
		"\u0253\u0257\u025d\u0266\u0274\u027a\u027f\u0285\u0287\u0299\u029e\u02a0"+
		"\u02ab\u02b6\u02c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}