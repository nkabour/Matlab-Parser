// Generated from matlab_parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class matlab_parserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, ELSE=6, ELSEIF=7, FOR=8, END=9, 
		CR=10, CL=11, NEGATE=12, ASSIGN=13, COMMA=14, SEMICOLON=15, COLON=16, 
		VARNAME=17, INT=18, WS=19, NL=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "I", "F", "E", "L", "S", "N", "D", "O", 
		"R", "IF", "ELSE", "ELSEIF", "FOR", "END", "LE", "GE", "LT", "GT", "EQ", 
		"NE", "AND", "OR", "CR", "CL", "NEGATE", "ASSIGN", "COMMA", "SEMICOLON", 
		"COLON", "LOWER", "UPPER", "VARNAME", "Digit", "INT", "WS", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'['", "']'", null, null, null, null, null, null, 
		null, "'~'", "'='", "','", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "ELSE", "ELSEIF", "FOR", "END", "CR", 
		"CL", "NEGATE", "ASSIGN", "COMMA", "SEMICOLON", "COLON", "VARNAME", "INT", 
		"WS", "NL"
	};
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


	public matlab_parserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "matlab_parser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00d0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u00a1\n\34\3\35\3\35\5\35\u00a5\n\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\6%\u00b7\n%\r%\16%\u00b8\3&\3&\3"+
		"\'\6\'\u00be\n\'\r\'\16\'\u00bf\3(\3(\3(\3(\3)\5)\u00c7\n)\3)\3)\6)\u00cb"+
		"\n)\r)\16)\u00cc\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\7\37\b!\t#\n%\13\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\f9\r;\16=\17?\20A\21C\22E\2G\2I\23K\2M\24O\25Q\26\3\2\6\3\2c|\3\2C\\"+
		"\3\2\62;\4\2\13\13\"\"\2\u00c7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2I\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2"+
		"\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2"+
		"\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3"+
		"\2\2\2\37p\3\2\2\2!u\3\2\2\2#|\3\2\2\2%\u0080\3\2\2\2\'\u0084\3\2\2\2"+
		")\u0087\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0091"+
		"\3\2\2\2\63\u0094\3\2\2\2\65\u0097\3\2\2\2\67\u00a0\3\2\2\29\u00a4\3\2"+
		"\2\2;\u00a6\3\2\2\2=\u00a8\3\2\2\2?\u00aa\3\2\2\2A\u00ac\3\2\2\2C\u00ae"+
		"\3\2\2\2E\u00b0\3\2\2\2G\u00b2\3\2\2\2I\u00b6\3\2\2\2K\u00ba\3\2\2\2M"+
		"\u00bd\3\2\2\2O\u00c1\3\2\2\2Q\u00ca\3\2\2\2ST\7*\2\2T\4\3\2\2\2UV\7+"+
		"\2\2V\6\3\2\2\2WX\7]\2\2X\b\3\2\2\2YZ\7_\2\2Z\n\3\2\2\2[\\\7k\2\2\\\f"+
		"\3\2\2\2]^\7h\2\2^\16\3\2\2\2_`\7g\2\2`\20\3\2\2\2ab\7n\2\2b\22\3\2\2"+
		"\2cd\7u\2\2d\24\3\2\2\2ef\7p\2\2f\26\3\2\2\2gh\7f\2\2h\30\3\2\2\2ij\7"+
		"q\2\2j\32\3\2\2\2kl\7t\2\2l\34\3\2\2\2mn\5\13\6\2no\5\r\7\2o\36\3\2\2"+
		"\2pq\5\17\b\2qr\5\21\t\2rs\5\23\n\2st\5\17\b\2t \3\2\2\2uv\5\17\b\2vw"+
		"\5\21\t\2wx\5\23\n\2xy\5\17\b\2yz\5\13\6\2z{\5\r\7\2{\"\3\2\2\2|}\5\r"+
		"\7\2}~\5\31\r\2~\177\5\33\16\2\177$\3\2\2\2\u0080\u0081\5\17\b\2\u0081"+
		"\u0082\5\25\13\2\u0082\u0083\5\27\f\2\u0083&\3\2\2\2\u0084\u0085\7>\2"+
		"\2\u0085\u0086\7?\2\2\u0086(\3\2\2\2\u0087\u0088\7@\2\2\u0088\u0089\7"+
		"?\2\2\u0089*\3\2\2\2\u008a\u008b\7>\2\2\u008b,\3\2\2\2\u008c\u008d\7@"+
		"\2\2\u008d.\3\2\2\2\u008e\u008f\7?\2\2\u008f\u0090\7?\2\2\u0090\60\3\2"+
		"\2\2\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\62\3\2\2\2\u0094\u0095"+
		"\7(\2\2\u0095\u0096\7(\2\2\u0096\64\3\2\2\2\u0097\u0098\7~\2\2\u0098\u0099"+
		"\7~\2\2\u0099\66\3\2\2\2\u009a\u00a1\5\'\24\2\u009b\u00a1\5)\25\2\u009c"+
		"\u00a1\5+\26\2\u009d\u00a1\5-\27\2\u009e\u00a1\5/\30\2\u009f\u00a1\5\61"+
		"\31\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a18\3\2\2\2"+
		"\u00a2\u00a5\5\63\32\2\u00a3\u00a5\5\65\33\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7\u0080\2\2\u00a7<\3\2\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9>\3\2\2\2\u00aa\u00ab\7.\2\2\u00ab@\3\2\2\2\u00ac\u00ad"+
		"\7=\2\2\u00adB\3\2\2\2\u00ae\u00af\7<\2\2\u00afD\3\2\2\2\u00b0\u00b1\t"+
		"\2\2\2\u00b1F\3\2\2\2\u00b2\u00b3\t\3\2\2\u00b3H\3\2\2\2\u00b4\u00b7\5"+
		"E#\2\u00b5\u00b7\5G$\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9J\3\2\2\2\u00ba"+
		"\u00bb\t\4\2\2\u00bbL\3\2\2\2\u00bc\u00be\5K&\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0N\3\2\2\2"+
		"\u00c1\u00c2\t\5\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b(\2\2\u00c4P\3\2"+
		"\2\2\u00c5\u00c7\7\17\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cb\7\f\2\2\u00c9\u00cb\7\17\2\2\u00ca\u00c6\3"+
		"\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b)\2\2\u00cfR\3\2\2\2\13"+
		"\2\u00a0\u00a4\u00b6\u00b8\u00bf\u00c6\u00ca\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}