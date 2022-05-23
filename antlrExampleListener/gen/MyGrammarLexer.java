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
		IntType=1, BoolType=2, StringType=3, Print=4, MUL=5, Is=6, COMMA=7, SEMICOLON=8, 
		StringParen=9, DIV=10, ADD=11, SUB=12, POW=13, FACT=14, PARANL=15, PARANR=16, 
		INT=17, BOOLEAN=18, ID=19, COMMENT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntType", "BoolType", "StringType", "Print", "MUL", "Is", "COMMA", "SEMICOLON", 
			"StringParen", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", "PARANR", 
			"INT", "BOOLEAN", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'string'", "'print'", "'*'", "'='", "','", 
			"';'", "'\"'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntType", "BoolType", "StringType", "Print", "MUL", "Is", "COMMA", 
			"SEMICOLON", "StringParen", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", 
			"PARANR", "INT", "BOOLEAN", "ID", "COMMENT", "WS"
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
		"\u0004\u0000\u0015\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010[\b\u0010\u000b\u0010\f\u0010\\\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011h\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012l\b\u0012\n\u0012\f\u0012o\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013u\b\u0013\u000b\u0013\f\u0013v\u0001"+
		"\u0013\u0003\u0013z\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004"+
		"\u0014\u007f\b\u0014\u000b\u0014\f\u0014\u0080\u0001\u0014\u0001\u0014"+
		"\u0001v\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015\u0001\u0000\u0005\u0001\u000009\u0003\u0000AZ__az\u0006\u0000"+
		"!!..09AZ__az\u0001\u0001\n\n\u0003\u0000\t\n\r\r  \u0088\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000"+
		"\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000"+
		"\u0007;\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000"+
		"\u0000\u0011I\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000\u0015"+
		"M\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001"+
		"\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dU\u0001\u0000\u0000"+
		"\u0000\u001fW\u0001\u0000\u0000\u0000!Z\u0001\u0000\u0000\u0000#g\u0001"+
		"\u0000\u0000\u0000%i\u0001\u0000\u0000\u0000\'p\u0001\u0000\u0000\u0000"+
		")~\u0001\u0000\u0000\u0000+,\u0005i\u0000\u0000,-\u0005n\u0000\u0000-"+
		".\u0005t\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005b\u0000\u0000"+
		"01\u0005o\u0000\u000012\u0005o\u0000\u000023\u0005l\u0000\u00003\u0004"+
		"\u0001\u0000\u0000\u000045\u0005s\u0000\u000056\u0005t\u0000\u000067\u0005"+
		"r\u0000\u000078\u0005i\u0000\u000089\u0005n\u0000\u00009:\u0005g\u0000"+
		"\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005p\u0000\u0000<=\u0005r\u0000"+
		"\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?@\u0005t\u0000\u0000"+
		"@\b\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000B\n\u0001\u0000\u0000"+
		"\u0000CD\u0005=\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005,\u0000"+
		"\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005;\u0000\u0000H\u0010\u0001"+
		"\u0000\u0000\u0000IJ\u0005\"\u0000\u0000J\u0012\u0001\u0000\u0000\u0000"+
		"KL\u0005/\u0000\u0000L\u0014\u0001\u0000\u0000\u0000MN\u0005+\u0000\u0000"+
		"N\u0016\u0001\u0000\u0000\u0000OP\u0005-\u0000\u0000P\u0018\u0001\u0000"+
		"\u0000\u0000QR\u0005^\u0000\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005"+
		"!\u0000\u0000T\u001c\u0001\u0000\u0000\u0000UV\u0005(\u0000\u0000V\u001e"+
		"\u0001\u0000\u0000\u0000WX\u0005)\u0000\u0000X \u0001\u0000\u0000\u0000"+
		"Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\"\u0001"+
		"\u0000\u0000\u0000^_\u0005t\u0000\u0000_`\u0005r\u0000\u0000`a\u0005u"+
		"\u0000\u0000ah\u0005e\u0000\u0000bc\u0005f\u0000\u0000cd\u0005a\u0000"+
		"\u0000de\u0005l\u0000\u0000ef\u0005s\u0000\u0000fh\u0005e\u0000\u0000"+
		"g^\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000h$\u0001\u0000\u0000"+
		"\u0000im\u0007\u0001\u0000\u0000jl\u0007\u0002\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n&\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pq\u0005/\u0000\u0000qr\u0005/\u0000\u0000rt\u0001\u0000\u0000\u0000s"+
		"u\t\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xz\u0007\u0003\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0006\u0013\u0000\u0000|(\u0001\u0000\u0000\u0000}\u007f"+
		"\u0007\u0004\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0006\u0014\u0000"+
		"\u0000\u0083*\u0001\u0000\u0000\u0000\u0007\u0000\\gmvy\u0080\u0001\u0006"+
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