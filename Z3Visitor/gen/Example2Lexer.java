// Generated from Example2.g4 by ANTLR 4.10.1
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
public class Example2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, ITE=2, AND=3, EQUAL=4, INT=5, NUMBER=6, TEXT=7, UNSAT=8, SAT=9, 
		DEFINE_FUN=10, ID=11, PARANL=12, PARANR=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODEL", "ITE", "AND", "EQUAL", "INT", "NUMBER", "TEXT", "UNSAT", "SAT", 
			"DEFINE_FUN", "ID", "PARANL", "PARANR", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'ite'", "'and'", "'='", "'Int'", null, null, "'unsat'", 
			"'sat'", "'define-fun'", null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODEL", "ITE", "AND", "EQUAL", "INT", "NUMBER", "TEXT", "UNSAT", 
			"SAT", "DEFINE_FUN", "ID", "PARANL", "PARANR", "NEWLINE"
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


	public Example2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Example2.g4"; }

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
		"\u0004\u0000\u000ef\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u00053\b\u0005\u000b\u0005\f\u00054\u0001\u0006\u0001\u0006"+
		"\u0005\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\nW\b\n\n\n\f\nZ\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004"+
		"\ra\b\r\u000b\r\f\rb\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0001"+
		"\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000AZ__az\u0006\u0000!!..09A"+
		"Z__az\u0003\u0000\t\n\r\r  i\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003#\u0001\u0000"+
		"\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000"+
		"\u0000\t-\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r6\u0001"+
		"\u0000\u0000\u0000\u000f?\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000"+
		"\u0000\u0013I\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017"+
		"[\u0001\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b`\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005m\u0000\u0000\u001e\u001f\u0005o\u0000"+
		"\u0000\u001f \u0005d\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005l\u0000"+
		"\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005i\u0000\u0000$%\u0005t\u0000"+
		"\u0000%&\u0005e\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005a\u0000"+
		"\u0000()\u0005n\u0000\u0000)*\u0005d\u0000\u0000*\u0006\u0001\u0000\u0000"+
		"\u0000+,\u0005=\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005I\u0000"+
		"\u0000./\u0005n\u0000\u0000/0\u0005t\u0000\u00000\n\u0001\u0000\u0000"+
		"\u000013\u0007\u0000\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\f\u0001"+
		"\u0000\u0000\u00006:\u0005\"\u0000\u000079\b\u0001\u0000\u000087\u0001"+
		"\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000=>\u0005\"\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005u\u0000"+
		"\u0000@A\u0005n\u0000\u0000AB\u0005s\u0000\u0000BC\u0005a\u0000\u0000"+
		"CD\u0005t\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005s\u0000\u0000"+
		"FG\u0005a\u0000\u0000GH\u0005t\u0000\u0000H\u0012\u0001\u0000\u0000\u0000"+
		"IJ\u0005d\u0000\u0000JK\u0005e\u0000\u0000KL\u0005f\u0000\u0000LM\u0005"+
		"i\u0000\u0000MN\u0005n\u0000\u0000NO\u0005e\u0000\u0000OP\u0005-\u0000"+
		"\u0000PQ\u0005f\u0000\u0000QR\u0005u\u0000\u0000RS\u0005n\u0000\u0000"+
		"S\u0014\u0001\u0000\u0000\u0000TX\u0007\u0002\u0000\u0000UW\u0007\u0003"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0016\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005(\u0000\u0000\\\u0018\u0001\u0000"+
		"\u0000\u0000]^\u0005)\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_a\u0007"+
		"\u0004\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0006\r\u0000\u0000e\u001c\u0001\u0000\u0000\u0000\u0005\u0000"+
		"4:Xb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}