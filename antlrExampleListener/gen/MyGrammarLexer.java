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
		Print=16, INT=17, BOOLEAN=18, ID=19, STRING=20, COMMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Equals", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", "PARANR", 
			"IntType", "BoolType", "StringType", "DOT", "COMMA", "SEMICOLON", "Print", 
			"INT", "BOOLEAN", "ID", "STRING", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", 
			"'int'", "'bool'", "'string'", "'.'", "','", "';'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Equals", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", 
			"PARANR", "IntType", "BoolType", "StringType", "DOT", "COMMA", "SEMICOLON", 
			"Print", "INT", "BOOLEAN", "ID", "STRING", "COMMENT", "WS"
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
		"\u0004\u0000\u0016\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0003\u0010]\b\u0010\u0001\u0010\u0004\u0010"+
		"`\b\u0010\u000b\u0010\f\u0010a\u0001\u0010\u0001\u0010\u0004\u0010f\b"+
		"\u0010\u000b\u0010\f\u0010g\u0003\u0010j\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011u\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"y\b\u0012\n\u0012\f\u0012|\t\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0080\b\u0013\n\u0013\f\u0013\u0083\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u008b\b\u0014\u000b"+
		"\u0014\f\u0014\u008c\u0001\u0014\u0003\u0014\u0090\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0004\u0015\u0095\b\u0015\u000b\u0015\f\u0015"+
		"\u0096\u0001\u0015\u0001\u0015\u0001\u008c\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0006\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0006\u0000!!..09AZ__az\u0003\u0000\n\n\r\r\"\"\u0001"+
		"\u0001\n\n\u0003\u0000\t\n\r\r  \u00a2\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f"+
		";\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001"+
		"\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000"+
		"\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001d"+
		"S\u0001\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000!\\\u0001\u0000"+
		"\u0000\u0000#t\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000\u0000\'}\u0001"+
		"\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000+\u0094\u0001\u0000\u0000"+
		"\u0000-.\u0005=\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005*\u0000"+
		"\u00000\u0004\u0001\u0000\u0000\u000012\u0005/\u0000\u00002\u0006\u0001"+
		"\u0000\u0000\u000034\u0005+\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005"+
		"-\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005^\u0000\u00008\f\u0001"+
		"\u0000\u0000\u00009:\u0005!\u0000\u0000:\u000e\u0001\u0000\u0000\u0000"+
		";<\u0005(\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000"+
		">\u0012\u0001\u0000\u0000\u0000?@\u0005i\u0000\u0000@A\u0005n\u0000\u0000"+
		"AB\u0005t\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0005b\u0000\u0000"+
		"DE\u0005o\u0000\u0000EF\u0005o\u0000\u0000FG\u0005l\u0000\u0000G\u0016"+
		"\u0001\u0000\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005"+
		"r\u0000\u0000KL\u0005i\u0000\u0000LM\u0005n\u0000\u0000MN\u0005g\u0000"+
		"\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005.\u0000\u0000P\u001a\u0001"+
		"\u0000\u0000\u0000QR\u0005,\u0000\u0000R\u001c\u0001\u0000\u0000\u0000"+
		"ST\u0005;\u0000\u0000T\u001e\u0001\u0000\u0000\u0000UV\u0005p\u0000\u0000"+
		"VW\u0005r\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005"+
		"t\u0000\u0000Z \u0001\u0000\u0000\u0000[]\u0003\t\u0004\u0000\\[\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^`\u0007\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bi\u0001\u0000"+
		"\u0000\u0000ce\u0003\u0019\f\u0000df\u0007\u0000\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005T\u0000\u0000"+
		"lm\u0005r\u0000\u0000mn\u0005u\u0000\u0000nu\u0005e\u0000\u0000op\u0005"+
		"F\u0000\u0000pq\u0005a\u0000\u0000qr\u0005l\u0000\u0000rs\u0005s\u0000"+
		"\u0000su\u0005e\u0000\u0000tk\u0001\u0000\u0000\u0000to\u0001\u0000\u0000"+
		"\u0000u$\u0001\u0000\u0000\u0000vz\u0007\u0001\u0000\u0000wy\u0007\u0002"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{&\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u0081\u0005\"\u0000\u0000~\u0080\b\u0003\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\"\u0000\u0000\u0085(\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005/\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\t\u0000\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u0090\u0007\u0004\u0000\u0000\u008f\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0014"+
		"\u0000\u0000\u0092*\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0005\u0000"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u0015\u0000"+
		"\u0000\u0099,\u0001\u0000\u0000\u0000\u000b\u0000\\agitz\u0081\u008c\u008f"+
		"\u0096\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}