// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Example2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, INT=2, NUMBER=3, TEXT=4, UNSAT=5, SAT=6, DEFINE_FUN=7, ID=8, 
		PARANL=9, PARANR=10, NEWLINE=11;
	public static final int
		RULE_start2 = 0, RULE_checkSatResponse = 1, RULE_checkModelResponse = 2, 
		RULE_model = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "checkSatResponse", "checkModelResponse", "model"
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

	@Override
	public String getGrammarFileName() { return "Example2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start2Context extends ParserRuleContext {
		public CheckSatResponseContext checkSatResponse() {
			return getRuleContext(CheckSatResponseContext.class,0);
		}
		public CheckModelResponseContext checkModelResponse() {
			return getRuleContext(CheckModelResponseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Example2Parser.EOF, 0); }
		public Start2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start2Context start2() throws RecognitionException {
		Start2Context _localctx = new Start2Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			checkSatResponse();
			setState(9);
			checkModelResponse();
			setState(10);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckSatResponseContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(Example2Parser.SAT, 0); }
		public TerminalNode UNSAT() { return getToken(Example2Parser.UNSAT, 0); }
		public CheckSatResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSatResponse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCheckSatResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckSatResponseContext checkSatResponse() throws RecognitionException {
		CheckSatResponseContext _localctx = new CheckSatResponseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_checkSatResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_la = _input.LA(1);
			if ( !(_la==UNSAT || _la==SAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckModelResponseContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public List<ModelContext> model() {
			return getRuleContexts(ModelContext.class);
		}
		public ModelContext model(int i) {
			return getRuleContext(ModelContext.class,i);
		}
		public CheckModelResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkModelResponse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCheckModelResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckModelResponseContext checkModelResponse() throws RecognitionException {
		CheckModelResponseContext _localctx = new CheckModelResponseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_checkModelResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(PARANL);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(15);
				model();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(PARANR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelContext extends ParserRuleContext {
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	 
		public ModelContext() { }
		public void copyFrom(ModelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModelRContext extends ModelContext {
		public List<TerminalNode> PARANL() { return getTokens(Example2Parser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(Example2Parser.PARANL, i);
		}
		public TerminalNode DEFINE_FUN() { return getToken(Example2Parser.DEFINE_FUN, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public List<TerminalNode> PARANR() { return getTokens(Example2Parser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(Example2Parser.PARANR, i);
		}
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public ModelRContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitModelR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_model);
		try {
			_localctx = new ModelRContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(23);
			match(PARANL);
			setState(24);
			match(DEFINE_FUN);
			setState(25);
			match(ID);
			setState(26);
			match(PARANL);
			setState(27);
			match(PARANR);
			setState(28);
			match(INT);
			setState(29);
			match(NUMBER);
			setState(30);
			match(PARANR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b!\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0011\b\u0002\n\u0002\f\u0002\u0014\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u0005\u0006\u001d\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u000e\u0001\u0000"+
		"\u0000\u0000\u0006\u0017\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001"+
		"\u0000\t\n\u0003\u0004\u0002\u0000\n\u000b\u0005\u0000\u0000\u0001\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\r\u0007\u0000\u0000\u0000\r\u0003\u0001"+
		"\u0000\u0000\u0000\u000e\u0012\u0005\t\u0000\u0000\u000f\u0011\u0003\u0006"+
		"\u0003\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000"+
		"\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0005\n\u0000\u0000\u0016\u0005\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0005\t\u0000\u0000\u0018\u0019\u0005\u0007\u0000\u0000"+
		"\u0019\u001a\u0005\b\u0000\u0000\u001a\u001b\u0005\t\u0000\u0000\u001b"+
		"\u001c\u0005\n\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e"+
		"\u0005\u0003\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f\u0007\u0001"+
		"\u0000\u0000\u0000\u0001\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}