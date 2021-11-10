// Generated from /home/checo/Documentos/asignaturas/tercer curso/compiladores/pecPDL/pec2/src/pseint_lexer.g4 by ANTLR 4.9.2
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
		APARENTESIS=26, CPARENTESIS=27, MAYOR=28, MENOR=29, IGUAL=30, DISTINTO=31, 
		MENORIGUAL=32, MAYORIGUAL=33, CONJUNCION=34, DISYUNCION=35, NEGACION=36, 
		SUMA=37, RESTA=38, MULTIPLICACION=39, DIVISION=40, POTENCIACION=41, MODULO=42, 
		NOMBREVARIABLE=43, ENTERO=44, REAL=45, LOGICO=46, CADENA=47, WS=48;
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
			"CPARENTESIS", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "MENORIGUAL", "MAYORIGUAL", 
			"CONJUNCION", "DISYUNCION", "NEGACION", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "POTENCIACION", "MODULO", "NOMBREVARIABLE", "ENTERO", "REAL", 
			"LOGICO", "CADENA", "WS", "ESCAPAR", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'<-'", "'('", "')'", "'>'", "'<'", "'='", "'><'", "'<='", "'>='", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FINALGORITMO", "FUNCION", "FINFUNCION", "TIPOVARIABLE", 
			"DEFINIR", "COMO", "LEER", "ESCRIBIR", "MIENTRAS", "FINMIENTRAS", "PARA", 
			"FINPARA", "DIMENSION", "SI", "FINSI", "ENTONCES", "SINO", "SEGUN", "HACER", 
			"DEOTROMODO", "FINSEGUN", "REPETIR", "HASTA", "ASIGNACION", "APARENTESIS", 
			"CPARENTESIS", "MAYOR", "MENOR", "IGUAL", "DISTINTO", "MENORIGUAL", "MAYORIGUAL", 
			"CONJUNCION", "DISYUNCION", "NEGACION", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "POTENCIACION", "MODULO", "NOMBREVARIABLE", "ENTERO", "REAL", 
			"LOGICO", "CADENA", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0229\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\5#\u018c\n#\3$"+
		"\3$\5$\u0190\n$\3%\3%\3%\3%\5%\u0196\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3+\3+\3+\5+\u01a7\n+\3,\3,\7,\u01ab\n,\f,\16,\u01ae\13,\3-\5-"+
		"\u01b1\n-\3-\6-\u01b4\n-\r-\16-\u01b5\3.\5.\u01b9\n.\3.\6.\u01bc\n.\r"+
		".\16.\u01bd\3.\3.\6.\u01c2\n.\r.\16.\u01c3\5.\u01c6\n.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01d6\n/\3\60\3\60\3\60\7\60\u01db\n\60"+
		"\f\60\16\60\u01de\13\60\3\60\3\60\3\60\3\60\7\60\u01e4\n\60\f\60\16\60"+
		"\u01e7\13\60\3\60\5\60\u01ea\n\60\3\61\3\61\3\61\5\61\u01ef\n\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\4\u01dc\u01e5"+
		"\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2m\2o"+
		"\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2"+
		"\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\3\2 \4\2C\\c"+
		"|\6\2\62;C\\aac|\3\2\62;\5\2$$))^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2"+
		"GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXx"+
		"x\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0222\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3\u0099\3\2\2\2\5\u00a3"+
		"\3\2\2\2\7\u00b0\3\2\2\2\t\u00b8\3\2\2\2\13\u00df\3\2\2\2\r\u00e1\3\2"+
		"\2\2\17\u00e9\3\2\2\2\21\u00ee\3\2\2\2\23\u00f3\3\2\2\2\25\u00fc\3\2\2"+
		"\2\27\u0105\3\2\2\2\31\u0111\3\2\2\2\33\u0116\3\2\2\2\35\u011e\3\2\2\2"+
		"\37\u0128\3\2\2\2!\u012b\3\2\2\2#\u0131\3\2\2\2%\u013a\3\2\2\2\'\u013f"+
		"\3\2\2\2)\u0145\3\2\2\2+\u014b\3\2\2\2-\u0158\3\2\2\2/\u0161\3\2\2\2\61"+
		"\u0169\3\2\2\2\63\u0173\3\2\2\2\65\u0176\3\2\2\2\67\u0178\3\2\2\29\u017a"+
		"\3\2\2\2;\u017c\3\2\2\2=\u017e\3\2\2\2?\u0180\3\2\2\2A\u0183\3\2\2\2C"+
		"\u0186\3\2\2\2E\u018b\3\2\2\2G\u018f\3\2\2\2I\u0195\3\2\2\2K\u0197\3\2"+
		"\2\2M\u0199\3\2\2\2O\u019b\3\2\2\2Q\u019d\3\2\2\2S\u019f\3\2\2\2U\u01a6"+
		"\3\2\2\2W\u01a8\3\2\2\2Y\u01b0\3\2\2\2[\u01b8\3\2\2\2]\u01d5\3\2\2\2_"+
		"\u01e9\3\2\2\2a\u01ee\3\2\2\2c\u01f2\3\2\2\2e\u01f5\3\2\2\2g\u01f7\3\2"+
		"\2\2i\u01f9\3\2\2\2k\u01fb\3\2\2\2m\u01fd\3\2\2\2o\u01ff\3\2\2\2q\u0201"+
		"\3\2\2\2s\u0203\3\2\2\2u\u0205\3\2\2\2w\u0207\3\2\2\2y\u0209\3\2\2\2{"+
		"\u020b\3\2\2\2}\u020d\3\2\2\2\177\u020f\3\2\2\2\u0081\u0211\3\2\2\2\u0083"+
		"\u0213\3\2\2\2\u0085\u0215\3\2\2\2\u0087\u0217\3\2\2\2\u0089\u0219\3\2"+
		"\2\2\u008b\u021b\3\2\2\2\u008d\u021d\3\2\2\2\u008f\u021f\3\2\2\2\u0091"+
		"\u0221\3\2\2\2\u0093\u0223\3\2\2\2\u0095\u0225\3\2\2\2\u0097\u0227\3\2"+
		"\2\2\u0099\u009a\5e\63\2\u009a\u009b\5{>\2\u009b\u009c\5q9\2\u009c\u009d"+
		"\5\u0081A\2\u009d\u009e\5\u0087D\2\u009e\u009f\5u;\2\u009f\u00a0\5\u008b"+
		"F\2\u00a0\u00a1\5}?\2\u00a1\u00a2\5\u0081A\2\u00a2\4\3\2\2\2\u00a3\u00a4"+
		"\5o8\2\u00a4\u00a5\5u;\2\u00a5\u00a6\5\177@\2\u00a6\u00a7\5e\63\2\u00a7"+
		"\u00a8\5{>\2\u00a8\u00a9\5q9\2\u00a9\u00aa\5\u0081A\2\u00aa\u00ab\5\u0087"+
		"D\2\u00ab\u00ac\5u;\2\u00ac\u00ad\5\u008bF\2\u00ad\u00ae\5}?\2\u00ae\u00af"+
		"\5\u0081A\2\u00af\6\3\2\2\2\u00b0\u00b1\5o8\2\u00b1\u00b2\5\u008dG\2\u00b2"+
		"\u00b3\5\177@\2\u00b3\u00b4\5i\65\2\u00b4\u00b5\5u;\2\u00b5\u00b6\5\u0081"+
		"A\2\u00b6\u00b7\5\177@\2\u00b7\b\3\2\2\2\u00b8\u00b9\5o8\2\u00b9\u00ba"+
		"\5u;\2\u00ba\u00bb\5\177@\2\u00bb\u00bc\5o8\2\u00bc\u00bd\5\u008dG\2\u00bd"+
		"\u00be\5\177@\2\u00be\u00bf\5i\65\2\u00bf\u00c0\5u;\2\u00c0\u00c1\5\u0081"+
		"A\2\u00c1\u00c2\5\177@\2\u00c2\n\3\2\2\2\u00c3\u00c4\5\u0087D\2\u00c4"+
		"\u00c5\5m\67\2\u00c5\u00c6\5e\63\2\u00c6\u00c7\5{>\2\u00c7\u00e0\3\2\2"+
		"\2\u00c8\u00c9\5m\67\2\u00c9\u00ca\5\177@\2\u00ca\u00cb\5\u008bF\2\u00cb"+
		"\u00cc\5m\67\2\u00cc\u00cd\5\u0087D\2\u00cd\u00ce\5\u0081A\2\u00ce\u00e0"+
		"\3\2\2\2\u00cf\u00d0\5{>\2\u00d0\u00d1\5\u0081A\2\u00d1\u00d2\5q9\2\u00d2"+
		"\u00d3\5u;\2\u00d3\u00d4\5i\65\2\u00d4\u00d5\5\u0081A\2\u00d5\u00e0\3"+
		"\2\2\2\u00d6\u00d7\5i\65\2\u00d7\u00d8\5e\63\2\u00d8\u00d9\5\u0087D\2"+
		"\u00d9\u00da\5e\63\2\u00da\u00db\5i\65\2\u00db\u00dc\5\u008bF\2\u00dc"+
		"\u00dd\5m\67\2\u00dd\u00de\5\u0087D\2\u00de\u00e0\3\2\2\2\u00df\u00c3"+
		"\3\2\2\2\u00df\u00c8\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d6\3\2\2\2\u00e0"+
		"\f\3\2\2\2\u00e1\u00e2\5k\66\2\u00e2\u00e3\5m\67\2\u00e3\u00e4\5o8\2\u00e4"+
		"\u00e5\5u;\2\u00e5\u00e6\5\177@\2\u00e6\u00e7\5u;\2\u00e7\u00e8\5\u0087"+
		"D\2\u00e8\16\3\2\2\2\u00e9\u00ea\5i\65\2\u00ea\u00eb\5\u0081A\2\u00eb"+
		"\u00ec\5}?\2\u00ec\u00ed\5\u0081A\2\u00ed\20\3\2\2\2\u00ee\u00ef\5{>\2"+
		"\u00ef\u00f0\5m\67\2\u00f0\u00f1\5m\67\2\u00f1\u00f2\5\u0087D\2\u00f2"+
		"\22\3\2\2\2\u00f3\u00f4\5m\67\2\u00f4\u00f5\5\u0089E\2\u00f5\u00f6\5i"+
		"\65\2\u00f6\u00f7\5\u0087D\2\u00f7\u00f8\5u;\2\u00f8\u00f9\5g\64\2\u00f9"+
		"\u00fa\5u;\2\u00fa\u00fb\5\u0087D\2\u00fb\24\3\2\2\2\u00fc\u00fd\5}?\2"+
		"\u00fd\u00fe\5u;\2\u00fe\u00ff\5m\67\2\u00ff\u0100\5\177@\2\u0100\u0101"+
		"\5\u008bF\2\u0101\u0102\5\u0087D\2\u0102\u0103\5e\63\2\u0103\u0104\5\u0089"+
		"E\2\u0104\26\3\2\2\2\u0105\u0106\5o8\2\u0106\u0107\5u;\2\u0107\u0108\5"+
		"\177@\2\u0108\u0109\5}?\2\u0109\u010a\5u;\2\u010a\u010b\5m\67\2\u010b"+
		"\u010c\5\177@\2\u010c\u010d\5\u008bF\2\u010d\u010e\5\u0087D\2\u010e\u010f"+
		"\5e\63\2\u010f\u0110\5\u0089E\2\u0110\30\3\2\2\2\u0111\u0112\5\u0083B"+
		"\2\u0112\u0113\5e\63\2\u0113\u0114\5\u0087D\2\u0114\u0115\5e\63\2\u0115"+
		"\32\3\2\2\2\u0116\u0117\5o8\2\u0117\u0118\5u;\2\u0118\u0119\5\177@\2\u0119"+
		"\u011a\5\u0083B\2\u011a\u011b\5e\63\2\u011b\u011c\5\u0087D\2\u011c\u011d"+
		"\5e\63\2\u011d\34\3\2\2\2\u011e\u011f\5k\66\2\u011f\u0120\5u;\2\u0120"+
		"\u0121\5}?\2\u0121\u0122\5m\67\2\u0122\u0123\5\177@\2\u0123\u0124\5\u0089"+
		"E\2\u0124\u0125\5u;\2\u0125\u0126\5\u0081A\2\u0126\u0127\5\177@\2\u0127"+
		"\36\3\2\2\2\u0128\u0129\5\u0089E\2\u0129\u012a\5u;\2\u012a \3\2\2\2\u012b"+
		"\u012c\5o8\2\u012c\u012d\5u;\2\u012d\u012e\5\177@\2\u012e\u012f\5\u0089"+
		"E\2\u012f\u0130\5u;\2\u0130\"\3\2\2\2\u0131\u0132\5m\67\2\u0132\u0133"+
		"\5\177@\2\u0133\u0134\5\u008bF\2\u0134\u0135\5\u0081A\2\u0135\u0136\5"+
		"\177@\2\u0136\u0137\5i\65\2\u0137\u0138\5m\67\2\u0138\u0139\5\u0089E\2"+
		"\u0139$\3\2\2\2\u013a\u013b\5\u0089E\2\u013b\u013c\5u;\2\u013c\u013d\5"+
		"\177@\2\u013d\u013e\5\u0081A\2\u013e&\3\2\2\2\u013f\u0140\5\u0089E\2\u0140"+
		"\u0141\5m\67\2\u0141\u0142\5q9\2\u0142\u0143\5\u008dG\2\u0143\u0144\5"+
		"\177@\2\u0144(\3\2\2\2\u0145\u0146\5s:\2\u0146\u0147\5e\63\2\u0147\u0148"+
		"\5i\65\2\u0148\u0149\5m\67\2\u0149\u014a\5\u0087D\2\u014a*\3\2\2\2\u014b"+
		"\u014c\5k\66\2\u014c\u014d\5m\67\2\u014d\u014e\7\"\2\2\u014e\u014f\5\u0081"+
		"A\2\u014f\u0150\5\u008bF\2\u0150\u0151\5\u0087D\2\u0151\u0152\5\u0081"+
		"A\2\u0152\u0153\7\"\2\2\u0153\u0154\5}?\2\u0154\u0155\5\u0081A\2\u0155"+
		"\u0156\5k\66\2\u0156\u0157\5\u0081A\2\u0157,\3\2\2\2\u0158\u0159\5o8\2"+
		"\u0159\u015a\5u;\2\u015a\u015b\5\177@\2\u015b\u015c\5\u0089E\2\u015c\u015d"+
		"\5m\67\2\u015d\u015e\5q9\2\u015e\u015f\5\u008dG\2\u015f\u0160\5\177@\2"+
		"\u0160.\3\2\2\2\u0161\u0162\5\u0087D\2\u0162\u0163\5m\67\2\u0163\u0164"+
		"\5\u0083B\2\u0164\u0165\5m\67\2\u0165\u0166\5\u008bF\2\u0166\u0167\5u"+
		";\2\u0167\u0168\5\u0087D\2\u0168\60\3\2\2\2\u0169\u016a\5s:\2\u016a\u016b"+
		"\5e\63\2\u016b\u016c\5\u0089E\2\u016c\u016d\5\u008bF\2\u016d\u016e\5e"+
		"\63\2\u016e\u016f\7\"\2\2\u016f\u0170\5\u0085C\2\u0170\u0171\5\u008dG"+
		"\2\u0171\u0172\5m\67\2\u0172\62\3\2\2\2\u0173\u0174\7>\2\2\u0174\u0175"+
		"\7/\2\2\u0175\64\3\2\2\2\u0176\u0177\7*\2\2\u0177\66\3\2\2\2\u0178\u0179"+
		"\7+\2\2\u01798\3\2\2\2\u017a\u017b\7@\2\2\u017b:\3\2\2\2\u017c\u017d\7"+
		">\2\2\u017d<\3\2\2\2\u017e\u017f\7?\2\2\u017f>\3\2\2\2\u0180\u0181\7@"+
		"\2\2\u0181\u0182\7>\2\2\u0182@\3\2\2\2\u0183\u0184\7>\2\2\u0184\u0185"+
		"\7?\2\2\u0185B\3\2\2\2\u0186\u0187\7@\2\2\u0187\u0188\7?\2\2\u0188D\3"+
		"\2\2\2\u0189\u018c\7(\2\2\u018a\u018c\5\u0095K\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018cF\3\2\2\2\u018d\u0190\7~\2\2\u018e\u0190\5\u0081A"+
		"\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190H\3\2\2\2\u0191\u0196"+
		"\7\u0080\2\2\u0192\u0193\5\177@\2\u0193\u0194\5\u0081A\2\u0194\u0196\3"+
		"\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2\u0196J\3\2\2\2\u0197\u0198"+
		"\7-\2\2\u0198L\3\2\2\2\u0199\u019a\7/\2\2\u019aN\3\2\2\2\u019b\u019c\7"+
		",\2\2\u019cP\3\2\2\2\u019d\u019e\7\61\2\2\u019eR\3\2\2\2\u019f\u01a0\7"+
		"`\2\2\u01a0T\3\2\2\2\u01a1\u01a7\7\'\2\2\u01a2\u01a3\5}?\2\u01a3\u01a4"+
		"\5\u0081A\2\u01a4\u01a5\5k\66\2\u01a5\u01a7\3\2\2\2\u01a6\u01a1\3\2\2"+
		"\2\u01a6\u01a2\3\2\2\2\u01a7V\3\2\2\2\u01a8\u01ac\t\2\2\2\u01a9\u01ab"+
		"\t\3\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01adX\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\7/\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\t\4"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6Z\3\2\2\2\u01b7\u01b9\7/\2\2\u01b8\u01b7\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01bc\t\4\2\2\u01bb\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c5\3\2\2\2\u01bf\u01c1\7\60\2\2\u01c0\u01c2\t\4\2\2\u01c1\u01c0\3"+
		"\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\\\3\2\2\2"+
		"\u01c7\u01c8\7X\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb"+
		"\7f\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7f\2\2\u01cd\u01ce\7g\2\2\u01ce"+
		"\u01cf\7t\2\2\u01cf\u01d6\7q\2\2\u01d0\u01d1\7H\2\2\u01d1\u01d2\7c\2\2"+
		"\u01d2\u01d3\7n\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d6\7q\2\2\u01d5\u01c7"+
		"\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d6^\3\2\2\2\u01d7\u01dc\7)\2\2\u01d8\u01db"+
		"\5c\62\2\u01d9\u01db\13\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2"+
		"\u01db\u01de\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01ea\7)\2\2\u01e0\u01e5\7$\2\2\u01e1"+
		"\u01e4\5c\62\2\u01e2\u01e4\13\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\7$\2\2\u01e9\u01d7\3\2"+
		"\2\2\u01e9\u01e0\3\2\2\2\u01ea`\3\2\2\2\u01eb\u01ef\7\"\2\2\u01ec\u01ed"+
		"\7^\2\2\u01ed\u01ef\7v\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f1\b\61\2\2\u01f1b\3\2\2\2\u01f2\u01f3\7^\2\2"+
		"\u01f3\u01f4\t\5\2\2\u01f4d\3\2\2\2\u01f5\u01f6\t\6\2\2\u01f6f\3\2\2\2"+
		"\u01f7\u01f8\t\7\2\2\u01f8h\3\2\2\2\u01f9\u01fa\t\b\2\2\u01faj\3\2\2\2"+
		"\u01fb\u01fc\t\t\2\2\u01fcl\3\2\2\2\u01fd\u01fe\t\n\2\2\u01fen\3\2\2\2"+
		"\u01ff\u0200\t\13\2\2\u0200p\3\2\2\2\u0201\u0202\t\f\2\2\u0202r\3\2\2"+
		"\2\u0203\u0204\t\r\2\2\u0204t\3\2\2\2\u0205\u0206\t\16\2\2\u0206v\3\2"+
		"\2\2\u0207\u0208\t\17\2\2\u0208x\3\2\2\2\u0209\u020a\t\20\2\2\u020az\3"+
		"\2\2\2\u020b\u020c\t\21\2\2\u020c|\3\2\2\2\u020d\u020e\t\22\2\2\u020e"+
		"~\3\2\2\2\u020f\u0210\t\23\2\2\u0210\u0080\3\2\2\2\u0211\u0212\t\24\2"+
		"\2\u0212\u0082\3\2\2\2\u0213\u0214\t\25\2\2\u0214\u0084\3\2\2\2\u0215"+
		"\u0216\t\26\2\2\u0216\u0086\3\2\2\2\u0217\u0218\t\27\2\2\u0218\u0088\3"+
		"\2\2\2\u0219\u021a\t\30\2\2\u021a\u008a\3\2\2\2\u021b\u021c\t\31\2\2\u021c"+
		"\u008c\3\2\2\2\u021d\u021e\t\32\2\2\u021e\u008e\3\2\2\2\u021f\u0220\t"+
		"\33\2\2\u0220\u0090\3\2\2\2\u0221\u0222\t\34\2\2\u0222\u0092\3\2\2\2\u0223"+
		"\u0224\t\35\2\2\u0224\u0094\3\2\2\2\u0225\u0226\t\36\2\2\u0226\u0096\3"+
		"\2\2\2\u0227\u0228\t\37\2\2\u0228\u0098\3\2\2\2\26\2\u00df\u018b\u018f"+
		"\u0195\u01a6\u01ac\u01b0\u01b5\u01b8\u01bd\u01c3\u01c5\u01d5\u01da\u01dc"+
		"\u01e3\u01e5\u01e9\u01ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}