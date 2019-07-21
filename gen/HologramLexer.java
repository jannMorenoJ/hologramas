// Generated from /home/jann/Documents/UN/algoritmos/prueba/Hologram.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HologramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, D3=2, D2=3, SOLIDO=4, FIGURA=5, NUM=6, ARISTA=7, AMARILLO=8, ROJO=9, 
		BLANCO=10, AZUL=11, ESPACIO=12, ID=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEW", "D3", "D2", "SOLIDO", "FIGURA", "NUM", "ARISTA", "AMARILLO", "ROJO", 
			"BLANCO", "AZUL", "ESPACIO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'amarillo'", "'rojo'", 
			"'blanco'", "'azul'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW", "D3", "D2", "SOLIDO", "FIGURA", "NUM", "ARISTA", "AMARILLO", 
			"ROJO", "BLANCO", "AZUL", "ESPACIO", "ID"
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


	public HologramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hologram.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6~\n\6\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\b\6\b\u0086\n\b\r\b"+
		"\16\b\u0087\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u00a5\n"+
		"\r\r\r\16\r\u00a6\3\r\3\r\3\16\6\16\u00ac\n\16\r\16\16\16\u00ad\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5"+
		"\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\3#\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\tI\3\2\2\2\13}\3\2\2\2\r\u0080\3\2\2"+
		"\2\17\u0085\3\2\2\2\21\u0089\3\2\2\2\23\u0092\3\2\2\2\25\u0097\3\2\2\2"+
		"\27\u009e\3\2\2\2\31\u00a4\3\2\2\2\33\u00ab\3\2\2\2\35\36\7P\2\2\36\37"+
		"\7G\2\2\37$\7Y\2\2 !\7p\2\2!\"\7g\2\2\"$\7y\2\2#\35\3\2\2\2# \3\2\2\2"+
		"$\4\3\2\2\2%&\7\65\2\2&*\7f\2\2\'(\7\65\2\2(*\7F\2\2)%\3\2\2\2)\'\3\2"+
		"\2\2*\6\3\2\2\2+,\7\64\2\2,\60\7F\2\2-.\7\64\2\2.\60\7f\2\2/+\3\2\2\2"+
		"/-\3\2\2\2\60\b\3\2\2\2\61\62\7e\2\2\62\63\7w\2\2\63\64\7d\2\2\64J\7q"+
		"\2\2\65\66\7E\2\2\66\67\7W\2\2\678\7D\2\28J\7Q\2\29:\7R\2\2:;\7K\2\2;"+
		"<\7T\2\2<=\7C\2\2=>\7O\2\2>?\7K\2\2?@\7F\2\2@J\7G\2\2AB\7r\2\2BC\7k\2"+
		"\2CD\7t\2\2DE\7c\2\2EF\7o\2\2FG\7k\2\2GH\7f\2\2HJ\7g\2\2I\61\3\2\2\2I"+
		"\65\3\2\2\2I9\3\2\2\2IA\3\2\2\2J\n\3\2\2\2KL\7E\2\2LM\7W\2\2MN\7C\2\2"+
		"NO\7F\2\2OP\7T\2\2PQ\7C\2\2QR\7F\2\2R~\7Q\2\2ST\7e\2\2TU\7w\2\2UV\7c\2"+
		"\2VW\7f\2\2WX\7t\2\2XY\7c\2\2YZ\7f\2\2Z~\7q\2\2[\\\7t\2\2\\]\7g\2\2]^"+
		"\7e\2\2^_\7v\2\2_`\7c\2\2`a\7p\2\2ab\7i\2\2bc\7w\2\2cd\7n\2\2d~\7q\2\2"+
		"ef\7T\2\2fg\7G\2\2gh\7E\2\2hi\7V\2\2ij\7C\2\2jk\7P\2\2kl\7I\2\2lm\7W\2"+
		"\2mn\7N\2\2n~\7Q\2\2op\7E\2\2pq\7K\2\2qr\7T\2\2rs\7E\2\2st\7W\2\2tu\7"+
		"N\2\2u~\7Q\2\2vw\7e\2\2wx\7k\2\2xy\7t\2\2yz\7e\2\2z{\7w\2\2{|\7n\2\2|"+
		"~\7q\2\2}K\3\2\2\2}S\3\2\2\2}[\3\2\2\2}e\3\2\2\2}o\3\2\2\2}v\3\2\2\2~"+
		"\f\3\2\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\16\3\2\2\2\u0084\u0086\t\2\2"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\20\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7o\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7n\2\2"+
		"\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091\22\3\2\2\2\u0092\u0093\7"+
		"t\2\2\u0093\u0094\7q\2\2\u0094\u0095\7l\2\2\u0095\u0096\7q\2\2\u0096\24"+
		"\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7n\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7q\2\2\u009d\26\3\2\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7|\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\30\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\r\2\2\u00a9\32\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\34"+
		"\3\2\2\2\f\2#)/I}\u0082\u0087\u00a6\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}