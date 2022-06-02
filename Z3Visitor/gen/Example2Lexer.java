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
		MODEL=1, INT=2, NUMBER=3, TEXT=4, UNSAT=5, SAT=6, DEFINE_FUN=7, ID=8, 
		PARANL=9, PARANR=10, NEWLINE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODEL", "INT", "NUMBER", "TEXT", "UNSAT", "SAT", "DEFINE_FUN", "ID", 
			"PARANL", "PARANR", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'Int'", null, null, "'unsat'", "'sat'", "'define-fun'", 
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODEL", "INT", "NUMBER", "TEXT", "UNSAT", "SAT", "DEFINE_FUN", 
			"ID", "PARANL", "PARANR", "NEWLINE"
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
		"\u0004\u0000\u000bV\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002#\b\u0002"+
		"\u000b\u0002\f\u0002$\u0001\u0003\u0001\u0003\u0005\u0003)\b\u0003\n\u0003"+
		"\f\u0003,\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0005\u0007G\b\u0007\n\u0007\f\u0007J\t"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\nQ\b\n\u000b\n\f"+
		"\nR\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0001\u0000\u0005\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000"+
		"AZ__az\u0006\u0000!!..09AZ__az\u0003\u0000\t\n\r\r  Y\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000"+
		"\u0000\u0005\"\u0001\u0000\u0000\u0000\u0007&\u0001\u0000\u0000\u0000"+
		"\t/\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r9\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000"+
		"\u0013M\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005m\u0000\u0000\u0018\u0019\u0005o\u0000\u0000\u0019\u001a\u0005d"+
		"\u0000\u0000\u001a\u001b\u0005e\u0000\u0000\u001b\u001c\u0005l\u0000\u0000"+
		"\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005I\u0000\u0000\u001e"+
		"\u001f\u0005n\u0000\u0000\u001f \u0005t\u0000\u0000 \u0004\u0001\u0000"+
		"\u0000\u0000!#\u0007\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\u0006\u0001\u0000\u0000\u0000&*\u0005\"\u0000\u0000\')\b\u0001\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-.\u0005\"\u0000\u0000.\b\u0001\u0000\u0000\u0000/0"+
		"\u0005u\u0000\u000001\u0005n\u0000\u000012\u0005s\u0000\u000023\u0005"+
		"a\u0000\u000034\u0005t\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"+
		"s\u0000\u000067\u0005a\u0000\u000078\u0005t\u0000\u00008\f\u0001\u0000"+
		"\u0000\u00009:\u0005d\u0000\u0000:;\u0005e\u0000\u0000;<\u0005f\u0000"+
		"\u0000<=\u0005i\u0000\u0000=>\u0005n\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005-\u0000\u0000@A\u0005f\u0000\u0000AB\u0005u\u0000\u0000BC\u0005"+
		"n\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DH\u0007\u0002\u0000\u0000"+
		"EG\u0007\u0003\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0010\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005(\u0000\u0000L\u0012"+
		"\u0001\u0000\u0000\u0000MN\u0005)\u0000\u0000N\u0014\u0001\u0000\u0000"+
		"\u0000OQ\u0007\u0004\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0006\n\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"\u0005\u0000$*HR\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}