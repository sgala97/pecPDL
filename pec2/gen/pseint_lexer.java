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
		ENTERO=1, CADENA=2, ALGORITMO=3, FUNCION=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENTERO", "CADENA", "ESCAPAR", "ALGORITMO", "FUNCION", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTERO", "CADENA", "ALGORITMO", "FUNCION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\u00a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2C\n\2\r\2\16\2D\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3\3\3\3"+
		"\3\7\3S\n\3\f\3\16\3V\13\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \4KT\2!\3\3\5\4\7\2\t\5\13\6\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2\3\2\36\3\2\62;\5\2$$))^^\4\2CCcc\4\2DDdd\4\2EEee\4\2FF"+
		"ff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u008d\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\3B\3\2\2\2\5X\3\2\2\2\7Z\3\2\2\2\t]\3\2\2"+
		"\2\13g\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2"+
		"\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2"+
		"\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008b"+
		"\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2"+
		"\63\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u0099\3\2\2\29\u009b\3\2\2\2;\u009d"+
		"\3\2\2\2=\u009f\3\2\2\2?\u00a1\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2D"+
		"B\3\2\2\2DE\3\2\2\2E\4\3\2\2\2FK\7)\2\2GJ\5\7\4\2HJ\13\2\2\2IG\3\2\2\2"+
		"IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NY\7)\2\2"+
		"OT\7$\2\2PS\5\7\4\2QS\13\2\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2"+
		"TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WY\7$\2\2XF\3\2\2\2XO\3\2\2\2Y\6\3\2\2\2"+
		"Z[\7^\2\2[\\\t\3\2\2\\\b\3\2\2\2]^\5\r\7\2^_\5#\22\2_`\5\31\r\2`a\5)\25"+
		"\2ab\5/\30\2bc\5\35\17\2cd\5\63\32\2de\5%\23\2ef\5)\25\2f\n\3\2\2\2gh"+
		"\5\27\f\2hi\5\65\33\2ij\5\'\24\2jk\5\21\t\2kl\5\35\17\2lm\5)\25\2mn\5"+
		"\'\24\2n\f\3\2\2\2op\t\4\2\2p\16\3\2\2\2qr\t\5\2\2r\20\3\2\2\2st\t\6\2"+
		"\2t\22\3\2\2\2uv\t\7\2\2v\24\3\2\2\2wx\t\b\2\2x\26\3\2\2\2yz\t\t\2\2z"+
		"\30\3\2\2\2{|\t\n\2\2|\32\3\2\2\2}~\t\13\2\2~\34\3\2\2\2\177\u0080\t\f"+
		"\2\2\u0080\36\3\2\2\2\u0081\u0082\t\r\2\2\u0082 \3\2\2\2\u0083\u0084\t"+
		"\16\2\2\u0084\"\3\2\2\2\u0085\u0086\t\17\2\2\u0086$\3\2\2\2\u0087\u0088"+
		"\t\20\2\2\u0088&\3\2\2\2\u0089\u008a\t\21\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\t\22\2\2\u008c*\3\2\2\2\u008d\u008e\t\23\2\2\u008e,\3\2\2\2\u008f\u0090"+
		"\t\24\2\2\u0090.\3\2\2\2\u0091\u0092\t\25\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\t\26\2\2\u0094\62\3\2\2\2\u0095\u0096\t\27\2\2\u0096\64\3\2\2\2\u0097"+
		"\u0098\t\30\2\2\u0098\66\3\2\2\2\u0099\u009a\t\31\2\2\u009a8\3\2\2\2\u009b"+
		"\u009c\t\32\2\2\u009c:\3\2\2\2\u009d\u009e\t\33\2\2\u009e<\3\2\2\2\u009f"+
		"\u00a0\t\34\2\2\u00a0>\3\2\2\2\u00a1\u00a2\t\35\2\2\u00a2@\3\2\2\2\t\2"+
		"DIKRTX\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}