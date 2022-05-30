// Generated from MyGrammar.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Equals=1, MUL=2, DIV=3, ADD=4, SUB=5, POW=6, FACT=7, PARANL=8, PARANR=9, 
		IntType=10, BoolType=11, StringType=12, DOT=13, COMMA=14, SEMICOLON=15, 
		StringParen=16, Print=17, INT=18, BOOLEAN=19, ID=20, STRING=21, COMMENT=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Equals", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", "PARANR", 
			"IntType", "BoolType", "StringType", "DOT", "COMMA", "SEMICOLON", "StringParen", 
			"Print", "INT", "BOOLEAN", "ID", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", 
			"'int'", "'bool'", "'string'", "'.'", "','", "';'", "'\"'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Equals", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", 
			"PARANR", "IntType", "BoolType", "StringType", "DOT", "COMMA", "SEMICOLON", 
			"StringParen", "Print", "INT", "BOOLEAN", "ID", "STRING", "COMMENT", 
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\u0004\u0000\u0017\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0003\u0011a\b\u0011\u0001\u0011\u0004\u0011d\b\u0011\u000b\u0011"+
		"\f\u0011e\u0001\u0011\u0001\u0011\u0004\u0011j\b\u0011\u000b\u0011\f\u0011"+
		"k\u0003\u0011n\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"y\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013}\b\u0013\n\u0013\f\u0013"+
		"\u0080\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u008a\b\u0015\u000b\u0015"+
		"\f\u0015\u008b\u0001\u0015\u0003\u0015\u008f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u0094\b\u0016\u000b\u0016\f\u0016\u0095"+
		"\u0001\u0016\u0001\u0016\u0001\u008b\u0000\u0017\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0006\u0000!!..09AZ__az\u0001\u0001\n\n\u0003\u0000"+
		"\t\n\r\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005"+
		"3\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013A"+
		"\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017J\u0001\u0000"+
		"\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000"+
		"\u001dU\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!Y\u0001"+
		"\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000\u0000"+
		"\'z\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000\u0000+\u0085\u0001"+
		"\u0000\u0000\u0000-\u0093\u0001\u0000\u0000\u0000/0\u0005=\u0000\u0000"+
		"0\u0002\u0001\u0000\u0000\u000012\u0005*\u0000\u00002\u0004\u0001\u0000"+
		"\u0000\u000034\u0005/\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005"+
		"+\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005-\u0000\u00008\n\u0001"+
		"\u0000\u0000\u00009:\u0005^\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005"+
		"!\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>\u0010"+
		"\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000@\u0012\u0001\u0000\u0000"+
		"\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000\u0000CD\u0005t\u0000\u0000"+
		"D\u0014\u0001\u0000\u0000\u0000EF\u0005b\u0000\u0000FG\u0005o\u0000\u0000"+
		"GH\u0005o\u0000\u0000HI\u0005l\u0000\u0000I\u0016\u0001\u0000\u0000\u0000"+
		"JK\u0005s\u0000\u0000KL\u0005t\u0000\u0000LM\u0005r\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005n\u0000\u0000OP\u0005g\u0000\u0000P\u0018\u0001\u0000"+
		"\u0000\u0000QR\u0005.\u0000\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005"+
		",\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005;\u0000\u0000V\u001e"+
		"\u0001\u0000\u0000\u0000WX\u0005\"\u0000\u0000X \u0001\u0000\u0000\u0000"+
		"YZ\u0005p\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005"+
		"n\u0000\u0000]^\u0005t\u0000\u0000^\"\u0001\u0000\u0000\u0000_a\u0003"+
		"\t\u0004\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001"+
		"\u0000\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fm\u0001\u0000\u0000\u0000gi\u0003\u0019\f\u0000hj\u0007\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mg\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n$\u0001\u0000\u0000\u0000"+
		"op\u0005T\u0000\u0000pq\u0005r\u0000\u0000qr\u0005u\u0000\u0000ry\u0005"+
		"e\u0000\u0000st\u0005F\u0000\u0000tu\u0005a\u0000\u0000uv\u0005l\u0000"+
		"\u0000vw\u0005s\u0000\u0000wy\u0005e\u0000\u0000xo\u0001\u0000\u0000\u0000"+
		"xs\u0001\u0000\u0000\u0000y&\u0001\u0000\u0000\u0000z~\u0007\u0001\u0000"+
		"\u0000{}\u0007\u0002\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f(\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\"\u0000\u0000\u0082\u0083\u0003\'\u0013\u0000\u0083\u0084"+
		"\u0005\"\u0000\u0000\u0084*\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"/\u0000\u0000\u0086\u0087\u0005/\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\t\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0007\u0003\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0015\u0000\u0000"+
		"\u0091,\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0004\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u0016\u0000\u0000\u0098"+
		".\u0001\u0000\u0000\u0000\n\u0000`ekmx~\u008b\u008e\u0095\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}