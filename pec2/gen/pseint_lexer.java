// Generated from H:/OneDrive/OneDrive - Universidad de Alcala/3º TERCERO/Procesardores del Lenguaje/Practica2/pecPDL/pec2/src\pseint_lexer.g4 by ANTLR 4.9.2
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
		ALGORITMO=1, FINALGORITMO=2, FUNCION=3, FINFUNCION=4, TIPOVARIABLE=5, 
		DEFINIR=6, COMO=7, LEER=8, ESCRIBIR=9, MIENTRAS=10, FINMIENTRAS=11, PARA=12, 
		FINPARA=13, DIMENSION=14, SI=15, FINSI=16, ENTONCES=17, SINO=18, SEGUN=19, 
		HACER=20, DEOTROMODO=21, FINSEGUN=22, REPETIR=23, HASTA=24, ASIGNACION=25, 
		APARENTESIS=26, CPARENTESIS=27, PUNTOCOMA=28, SALTOLINEA=29, MAYOR=30, 
		MENOR=31, IGUAL=32, DISTINTO=33, MENORIGUAL=34, MAYORIGUAL=35, CONJUNCION=36, 
		DISYUNCION=37, NEGACION=38, SUMA=39, RESTA=40, MULTIPLICACION=41, DIVISION=42, 
		POTENCIACION=43, MODULO=44, NOMBREVARIABLE=45, ENTERO=46, REAL=47, LOGICO=48, 
		CADENA=49, WS=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FINALGORITMO", "FUNCION", "FINFUNCION", "TIPOVARIABLE", 
			"DEFINIR", "COMO", "LEER", "ESCRIBIR", "MIENTRAS", "FINMIENTRAS", "PARA", 
			"FINPARA", "DIMENSION", "SI", "FINSI", "ENTONCES", "SINO", "SEGUN", "HACER", 
			"DEOTROMODO", "FINSEGUN", "REPETIR", "HASTA", "ASIGNACION", "APARENTESIS", 
			"CPARENTESIS", "PUNTOCOMA", "SALTOLINEA", "MAYOR", "MENOR", "IGUAL", 
			"DISTINTO", "MENORIGUAL", "MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIACION", "MODULO", 
			"NOMBREVARIABLE", "ENTERO", "REAL", "LOGICO", "CADENA", "WS", "ESCAPAR", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'<-'", "'('", "')'", "';'", "'//n'", "'>'", "'<'", "'='", "'><'", 
			"'<='", "'>='", null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FINALGORITMO", "FUNCION", "FINFUNCION", "TIPOVARIABLE", 
			"DEFINIR", "COMO", "LEER", "ESCRIBIR", "MIENTRAS", "FINMIENTRAS", "PARA", 
			"FINPARA", "DIMENSION", "SI", "FINSI", "ENTONCES", "SINO", "SEGUN", "HACER", 
			"DEOTROMODO", "FINSEGUN", "REPETIR", "HASTA", "ASIGNACION", "APARENTESIS", 
			"CPARENTESIS", "PUNTOCOMA", "SALTOLINEA", "MAYOR", "MENOR", "IGUAL", 
			"DISTINTO", "MENORIGUAL", "MAYORIGUAL", "CONJUNCION", "DISYUNCION", "NEGACION", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIACION", "MODULO", 
			"NOMBREVARIABLE", "ENTERO", "REAL", "LOGICO", "CADENA", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u022c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e4\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\5%\u0196\n%\3&\3&\5&\u019a\n&\3\'\3\'\3\'\3\'\5\'"+
		"\u01a0\n\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\5-\u01b1\n-\3"+
		".\3.\7.\u01b5\n.\f.\16.\u01b8\13.\3/\5/\u01bb\n/\3/\6/\u01be\n/\r/\16"+
		"/\u01bf\3\60\5\60\u01c3\n\60\3\60\6\60\u01c6\n\60\r\60\16\60\u01c7\3\60"+
		"\3\60\6\60\u01cc\n\60\r\60\16\60\u01cd\5\60\u01d0\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01e0\n\61"+
		"\3\62\3\62\3\62\3\62\7\62\u01e6\n\62\f\62\16\62\u01e9\13\62\3\62\3\62"+
		"\5\62\u01ed\n\62\3\63\3\63\3\63\5\63\u01f2\n\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I"+
		"\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3\u01e7\2O\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\3\2 \4\2C\\c|\6\2\62;C\\aa"+
		"c|\3\2\62;\5\2$$))^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\2\u0224\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u009d\3\2"+
		"\2\2\5\u00a7\3\2\2\2\7\u00b4\3\2\2\2\t\u00bc\3\2\2\2\13\u00e3\3\2\2\2"+
		"\r\u00e5\3\2\2\2\17\u00ed\3\2\2\2\21\u00f2\3\2\2\2\23\u00f7\3\2\2\2\25"+
		"\u0100\3\2\2\2\27\u0109\3\2\2\2\31\u0115\3\2\2\2\33\u011a\3\2\2\2\35\u0122"+
		"\3\2\2\2\37\u012c\3\2\2\2!\u012f\3\2\2\2#\u0135\3\2\2\2%\u013e\3\2\2\2"+
		"\'\u0143\3\2\2\2)\u0149\3\2\2\2+\u014f\3\2\2\2-\u015c\3\2\2\2/\u0165\3"+
		"\2\2\2\61\u016d\3\2\2\2\63\u0177\3\2\2\2\65\u017a\3\2\2\2\67\u017c\3\2"+
		"\2\29\u017e\3\2\2\2;\u0180\3\2\2\2=\u0184\3\2\2\2?\u0186\3\2\2\2A\u0188"+
		"\3\2\2\2C\u018a\3\2\2\2E\u018d\3\2\2\2G\u0190\3\2\2\2I\u0195\3\2\2\2K"+
		"\u0199\3\2\2\2M\u019f\3\2\2\2O\u01a1\3\2\2\2Q\u01a3\3\2\2\2S\u01a5\3\2"+
		"\2\2U\u01a7\3\2\2\2W\u01a9\3\2\2\2Y\u01b0\3\2\2\2[\u01b2\3\2\2\2]\u01ba"+
		"\3\2\2\2_\u01c2\3\2\2\2a\u01df\3\2\2\2c\u01ec\3\2\2\2e\u01f1\3\2\2\2g"+
		"\u01f5\3\2\2\2i\u01f8\3\2\2\2k\u01fa\3\2\2\2m\u01fc\3\2\2\2o\u01fe\3\2"+
		"\2\2q\u0200\3\2\2\2s\u0202\3\2\2\2u\u0204\3\2\2\2w\u0206\3\2\2\2y\u0208"+
		"\3\2\2\2{\u020a\3\2\2\2}\u020c\3\2\2\2\177\u020e\3\2\2\2\u0081\u0210\3"+
		"\2\2\2\u0083\u0212\3\2\2\2\u0085\u0214\3\2\2\2\u0087\u0216\3\2\2\2\u0089"+
		"\u0218\3\2\2\2\u008b\u021a\3\2\2\2\u008d\u021c\3\2\2\2\u008f\u021e\3\2"+
		"\2\2\u0091\u0220\3\2\2\2\u0093\u0222\3\2\2\2\u0095\u0224\3\2\2\2\u0097"+
		"\u0226\3\2\2\2\u0099\u0228\3\2\2\2\u009b\u022a\3\2\2\2\u009d\u009e\5i"+
		"\65\2\u009e\u009f\5\177@\2\u009f\u00a0\5u;\2\u00a0\u00a1\5\u0085C\2\u00a1"+
		"\u00a2\5\u008bF\2\u00a2\u00a3\5y=\2\u00a3\u00a4\5\u008fH\2\u00a4\u00a5"+
		"\5\u0081A\2\u00a5\u00a6\5\u0085C\2\u00a6\4\3\2\2\2\u00a7\u00a8\5s:\2\u00a8"+
		"\u00a9\5y=\2\u00a9\u00aa\5\u0083B\2\u00aa\u00ab\5i\65\2\u00ab\u00ac\5"+
		"\177@\2\u00ac\u00ad\5u;\2\u00ad\u00ae\5\u0085C\2\u00ae\u00af\5\u008bF"+
		"\2\u00af\u00b0\5y=\2\u00b0\u00b1\5\u008fH\2\u00b1\u00b2\5\u0081A\2\u00b2"+
		"\u00b3\5\u0085C\2\u00b3\6\3\2\2\2\u00b4\u00b5\5s:\2\u00b5\u00b6\5\u0091"+
		"I\2\u00b6\u00b7\5\u0083B\2\u00b7\u00b8\5m\67\2\u00b8\u00b9\5y=\2\u00b9"+
		"\u00ba\5\u0085C\2\u00ba\u00bb\5\u0083B\2\u00bb\b\3\2\2\2\u00bc\u00bd\5"+
		"s:\2\u00bd\u00be\5y=\2\u00be\u00bf\5\u0083B\2\u00bf\u00c0\5s:\2\u00c0"+
		"\u00c1\5\u0091I\2\u00c1\u00c2\5\u0083B\2\u00c2\u00c3\5m\67\2\u00c3\u00c4"+
		"\5y=\2\u00c4\u00c5\5\u0085C\2\u00c5\u00c6\5\u0083B\2\u00c6\n\3\2\2\2\u00c7"+
		"\u00c8\5\u008bF\2\u00c8\u00c9\5q9\2\u00c9\u00ca\5i\65\2\u00ca\u00cb\5"+
		"\177@\2\u00cb\u00e4\3\2\2\2\u00cc\u00cd\5q9\2\u00cd\u00ce\5\u0083B\2\u00ce"+
		"\u00cf\5\u008fH\2\u00cf\u00d0\5q9\2\u00d0\u00d1\5\u008bF\2\u00d1\u00d2"+
		"\5\u0085C\2\u00d2\u00e4\3\2\2\2\u00d3\u00d4\5\177@\2\u00d4\u00d5\5\u0085"+
		"C\2\u00d5\u00d6\5u;\2\u00d6\u00d7\5y=\2\u00d7\u00d8\5m\67\2\u00d8\u00d9"+
		"\5\u0085C\2\u00d9\u00e4\3\2\2\2\u00da\u00db\5m\67\2\u00db\u00dc\5i\65"+
		"\2\u00dc\u00dd\5\u008bF\2\u00dd\u00de\5i\65\2\u00de\u00df\5m\67\2\u00df"+
		"\u00e0\5\u008fH\2\u00e0\u00e1\5q9\2\u00e1\u00e2\5\u008bF\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00c7\3\2\2\2\u00e3\u00cc\3\2\2\2\u00e3\u00d3\3\2\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e4\f\3\2\2\2\u00e5\u00e6\5o8\2\u00e6\u00e7\5q9\2\u00e7"+
		"\u00e8\5s:\2\u00e8\u00e9\5y=\2\u00e9\u00ea\5\u0083B\2\u00ea\u00eb\5y="+
		"\2\u00eb\u00ec\5\u008bF\2\u00ec\16\3\2\2\2\u00ed\u00ee\5m\67\2\u00ee\u00ef"+
		"\5\u0085C\2\u00ef\u00f0\5\u0081A\2\u00f0\u00f1\5\u0085C\2\u00f1\20\3\2"+
		"\2\2\u00f2\u00f3\5\177@\2\u00f3\u00f4\5q9\2\u00f4\u00f5\5q9\2\u00f5\u00f6"+
		"\5\u008bF\2\u00f6\22\3\2\2\2\u00f7\u00f8\5q9\2\u00f8\u00f9\5\u008dG\2"+
		"\u00f9\u00fa\5m\67\2\u00fa\u00fb\5\u008bF\2\u00fb\u00fc\5y=\2\u00fc\u00fd"+
		"\5k\66\2\u00fd\u00fe\5y=\2\u00fe\u00ff\5\u008bF\2\u00ff\24\3\2\2\2\u0100"+
		"\u0101\5\u0081A\2\u0101\u0102\5y=\2\u0102\u0103\5q9\2\u0103\u0104\5\u0083"+
		"B\2\u0104\u0105\5\u008fH\2\u0105\u0106\5\u008bF\2\u0106\u0107\5i\65\2"+
		"\u0107\u0108\5\u008dG\2\u0108\26\3\2\2\2\u0109\u010a\5s:\2\u010a\u010b"+
		"\5y=\2\u010b\u010c\5\u0083B\2\u010c\u010d\5\u0081A\2\u010d\u010e\5y=\2"+
		"\u010e\u010f\5q9\2\u010f\u0110\5\u0083B\2\u0110\u0111\5\u008fH\2\u0111"+
		"\u0112\5\u008bF\2\u0112\u0113\5i\65\2\u0113\u0114\5\u008dG\2\u0114\30"+
		"\3\2\2\2\u0115\u0116\5\u0087D\2\u0116\u0117\5i\65\2\u0117\u0118\5\u008b"+
		"F\2\u0118\u0119\5i\65\2\u0119\32\3\2\2\2\u011a\u011b\5s:\2\u011b\u011c"+
		"\5y=\2\u011c\u011d\5\u0083B\2\u011d\u011e\5\u0087D\2\u011e\u011f\5i\65"+
		"\2\u011f\u0120\5\u008bF\2\u0120\u0121\5i\65\2\u0121\34\3\2\2\2\u0122\u0123"+
		"\5o8\2\u0123\u0124\5y=\2\u0124\u0125\5\u0081A\2\u0125\u0126\5q9\2\u0126"+
		"\u0127\5\u0083B\2\u0127\u0128\5\u008dG\2\u0128\u0129\5y=\2\u0129\u012a"+
		"\5\u0085C\2\u012a\u012b\5\u0083B\2\u012b\36\3\2\2\2\u012c\u012d\5\u008d"+
		"G\2\u012d\u012e\5y=\2\u012e \3\2\2\2\u012f\u0130\5s:\2\u0130\u0131\5y"+
		"=\2\u0131\u0132\5\u0083B\2\u0132\u0133\5\u008dG\2\u0133\u0134\5y=\2\u0134"+
		"\"\3\2\2\2\u0135\u0136\5q9\2\u0136\u0137\5\u0083B\2\u0137\u0138\5\u008f"+
		"H\2\u0138\u0139\5\u0085C\2\u0139\u013a\5\u0083B\2\u013a\u013b\5m\67\2"+
		"\u013b\u013c\5q9\2\u013c\u013d\5\u008dG\2\u013d$\3\2\2\2\u013e\u013f\5"+
		"\u008dG\2\u013f\u0140\5y=\2\u0140\u0141\5\u0083B\2\u0141\u0142\5\u0085"+
		"C\2\u0142&\3\2\2\2\u0143\u0144\5\u008dG\2\u0144\u0145\5q9\2\u0145\u0146"+
		"\5u;\2\u0146\u0147\5\u0091I\2\u0147\u0148\5\u0083B\2\u0148(\3\2\2\2\u0149"+
		"\u014a\5w<\2\u014a\u014b\5i\65\2\u014b\u014c\5m\67\2\u014c\u014d\5q9\2"+
		"\u014d\u014e\5\u008bF\2\u014e*\3\2\2\2\u014f\u0150\5o8\2\u0150\u0151\5"+
		"q9\2\u0151\u0152\7\"\2\2\u0152\u0153\5\u0085C\2\u0153\u0154\5\u008fH\2"+
		"\u0154\u0155\5\u008bF\2\u0155\u0156\5\u0085C\2\u0156\u0157\7\"\2\2\u0157"+
		"\u0158\5\u0081A\2\u0158\u0159\5\u0085C\2\u0159\u015a\5o8\2\u015a\u015b"+
		"\5\u0085C\2\u015b,\3\2\2\2\u015c\u015d\5s:\2\u015d\u015e\5y=\2\u015e\u015f"+
		"\5\u0083B\2\u015f\u0160\5\u008dG\2\u0160\u0161\5q9\2\u0161\u0162\5u;\2"+
		"\u0162\u0163\5\u0091I\2\u0163\u0164\5\u0083B\2\u0164.\3\2\2\2\u0165\u0166"+
		"\5\u008bF\2\u0166\u0167\5q9\2\u0167\u0168\5\u0087D\2\u0168\u0169\5q9\2"+
		"\u0169\u016a\5\u008fH\2\u016a\u016b\5y=\2\u016b\u016c\5\u008bF\2\u016c"+
		"\60\3\2\2\2\u016d\u016e\5w<\2\u016e\u016f\5i\65\2\u016f\u0170\5\u008d"+
		"G\2\u0170\u0171\5\u008fH\2\u0171\u0172\5i\65\2\u0172\u0173\7\"\2\2\u0173"+
		"\u0174\5\u0089E\2\u0174\u0175\5\u0091I\2\u0175\u0176\5q9\2\u0176\62\3"+
		"\2\2\2\u0177\u0178\7>\2\2\u0178\u0179\7/\2\2\u0179\64\3\2\2\2\u017a\u017b"+
		"\7*\2\2\u017b\66\3\2\2\2\u017c\u017d\7+\2\2\u017d8\3\2\2\2\u017e\u017f"+
		"\7=\2\2\u017f:\3\2\2\2\u0180\u0181\7\61\2\2\u0181\u0182\7\61\2\2\u0182"+
		"\u0183\7p\2\2\u0183<\3\2\2\2\u0184\u0185\7@\2\2\u0185>\3\2\2\2\u0186\u0187"+
		"\7>\2\2\u0187@\3\2\2\2\u0188\u0189\7?\2\2\u0189B\3\2\2\2\u018a\u018b\7"+
		"@\2\2\u018b\u018c\7>\2\2\u018cD\3\2\2\2\u018d\u018e\7>\2\2\u018e\u018f"+
		"\7?\2\2\u018fF\3\2\2\2\u0190\u0191\7@\2\2\u0191\u0192\7?\2\2\u0192H\3"+
		"\2\2\2\u0193\u0196\7(\2\2\u0194\u0196\5\u0099M\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0194\3\2\2\2\u0196J\3\2\2\2\u0197\u019a\7~\2\2\u0198\u019a\5\u0085C"+
		"\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aL\3\2\2\2\u019b\u01a0"+
		"\7\u0080\2\2\u019c\u019d\5\u0083B\2\u019d\u019e\5\u0085C\2\u019e\u01a0"+
		"\3\2\2\2\u019f\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u01a0N\3\2\2\2\u01a1"+
		"\u01a2\7-\2\2\u01a2P\3\2\2\2\u01a3\u01a4\7/\2\2\u01a4R\3\2\2\2\u01a5\u01a6"+
		"\7,\2\2\u01a6T\3\2\2\2\u01a7\u01a8\7\61\2\2\u01a8V\3\2\2\2\u01a9\u01aa"+
		"\7`\2\2\u01aaX\3\2\2\2\u01ab\u01b1\7\'\2\2\u01ac\u01ad\5\u0081A\2\u01ad"+
		"\u01ae\5\u0085C\2\u01ae\u01af\5o8\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3"+
		"\2\2\2\u01b0\u01ac\3\2\2\2\u01b1Z\3\2\2\2\u01b2\u01b6\t\2\2\2\u01b3\u01b5"+
		"\t\3\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\\\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\7/\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be"+
		"\t\4\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0^\3\2\2\2\u01c1\u01c3\7/\2\2\u01c2\u01c1\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\t\4\2\2\u01c5\u01c4\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cf\3\2\2\2\u01c9\u01cb\7\60\2\2\u01ca\u01cc\t\4\2\2\u01cb\u01ca\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0`\3\2\2\2"+
		"\u01d1\u01d2\7X\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5"+
		"\7f\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7f\2\2\u01d7\u01d8\7g\2\2\u01d8"+
		"\u01d9\7t\2\2\u01d9\u01e0\7q\2\2\u01da\u01db\7H\2\2\u01db\u01dc\7c\2\2"+
		"\u01dc\u01dd\7n\2\2\u01dd\u01de\7u\2\2\u01de\u01e0\7q\2\2\u01df\u01d1"+
		"\3\2\2\2\u01df\u01da\3\2\2\2\u01e0b\3\2\2\2\u01e1\u01ed\7)\2\2\u01e2\u01e7"+
		"\7$\2\2\u01e3\u01e6\5g\64\2\u01e4\u01e6\13\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\7)\2\2\u01eb"+
		"\u01ed\7$\2\2\u01ec\u01e1\3\2\2\2\u01ec\u01e2\3\2\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01edd\3\2\2\2\u01ee\u01f2\7\"\2\2\u01ef\u01f0\7^\2\2\u01f0\u01f2"+
		"\7v\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\b\63\2\2\u01f4f\3\2\2\2\u01f5\u01f6\7^\2\2\u01f6\u01f7\t\5\2\2"+
		"\u01f7h\3\2\2\2\u01f8\u01f9\t\6\2\2\u01f9j\3\2\2\2\u01fa\u01fb\t\7\2\2"+
		"\u01fbl\3\2\2\2\u01fc\u01fd\t\b\2\2\u01fdn\3\2\2\2\u01fe\u01ff\t\t\2\2"+
		"\u01ffp\3\2\2\2\u0200\u0201\t\n\2\2\u0201r\3\2\2\2\u0202\u0203\t\13\2"+
		"\2\u0203t\3\2\2\2\u0204\u0205\t\f\2\2\u0205v\3\2\2\2\u0206\u0207\t\r\2"+
		"\2\u0207x\3\2\2\2\u0208\u0209\t\16\2\2\u0209z\3\2\2\2\u020a\u020b\t\17"+
		"\2\2\u020b|\3\2\2\2\u020c\u020d\t\20\2\2\u020d~\3\2\2\2\u020e\u020f\t"+
		"\21\2\2\u020f\u0080\3\2\2\2\u0210\u0211\t\22\2\2\u0211\u0082\3\2\2\2\u0212"+
		"\u0213\t\23\2\2\u0213\u0084\3\2\2\2\u0214\u0215\t\24\2\2\u0215\u0086\3"+
		"\2\2\2\u0216\u0217\t\25\2\2\u0217\u0088\3\2\2\2\u0218\u0219\t\26\2\2\u0219"+
		"\u008a\3\2\2\2\u021a\u021b\t\27\2\2\u021b\u008c\3\2\2\2\u021c\u021d\t"+
		"\30\2\2\u021d\u008e\3\2\2\2\u021e\u021f\t\31\2\2\u021f\u0090\3\2\2\2\u0220"+
		"\u0221\t\32\2\2\u0221\u0092\3\2\2\2\u0222\u0223\t\33\2\2\u0223\u0094\3"+
		"\2\2\2\u0224\u0225\t\34\2\2\u0225\u0096\3\2\2\2\u0226\u0227\t\35\2\2\u0227"+
		"\u0098\3\2\2\2\u0228\u0229\t\36\2\2\u0229\u009a\3\2\2\2\u022a\u022b\t"+
		"\37\2\2\u022b\u009c\3\2\2\2\24\2\u00e3\u0195\u0199\u019f\u01b0\u01b6\u01ba"+
		"\u01bf\u01c2\u01c7\u01cd\u01cf\u01df\u01e5\u01e7\u01ec\u01f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}