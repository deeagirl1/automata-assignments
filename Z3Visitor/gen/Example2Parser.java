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
		MODEL=1, ITE=2, AND=3, EQUAL=4, INT=5, NUMBER=6, TEXT=7, UNSAT=8, SAT=9, 
		DEFINE_FUN=10, ID=11, PARANL=12, PARANR=13, NEWLINE=14;
	public static final int
		RULE_start2 = 0, RULE_checkSatResponse = 1, RULE_checkModelResponse = 2, 
		RULE_model = 3, RULE_checkOut = 4, RULE_output = 5, RULE_define = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "checkSatResponse", "checkModelResponse", "model", "checkOut", 
			"output", "define"
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
			setState(14);
			checkSatResponse();
			setState(15);
			checkModelResponse();
			setState(16);
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
			setState(18);
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
			setState(20);
			match(PARANL);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(21);
				model();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class ModelBContext extends ModelContext {
		public List<TerminalNode> PARANL() { return getTokens(Example2Parser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(Example2Parser.PARANL, i);
		}
		public TerminalNode DEFINE_FUN() { return getToken(Example2Parser.DEFINE_FUN, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public List<CheckOutContext> checkOut() {
			return getRuleContexts(CheckOutContext.class);
		}
		public CheckOutContext checkOut(int i) {
			return getRuleContext(CheckOutContext.class,i);
		}
		public ModelBContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitModelB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_model);
		try {
			int _alt;
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ModelRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(29);
				match(PARANL);
				setState(30);
				match(DEFINE_FUN);
				setState(31);
				match(ID);
				setState(32);
				match(PARANL);
				setState(33);
				match(PARANR);
				setState(34);
				match(INT);
				setState(35);
				match(NUMBER);
				setState(36);
				match(PARANR);
				}
				}
				break;
			case 2:
				_localctx = new ModelBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(37);
				match(PARANL);
				setState(38);
				match(DEFINE_FUN);
				setState(39);
				match(ID);
				setState(40);
				match(PARANL);
				setState(41);
				define();
				setState(42);
				define();
				setState(43);
				match(PARANR);
				setState(44);
				match(INT);
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(46);
						checkOut();
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
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

	public static class CheckOutContext extends ParserRuleContext {
		public List<TerminalNode> PARANL() { return getTokens(Example2Parser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(Example2Parser.PARANL, i);
		}
		public TerminalNode ITE() { return getToken(Example2Parser.ITE, 0); }
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<TerminalNode> PARANR() { return getTokens(Example2Parser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(Example2Parser.PARANR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Example2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Example2Parser.NUMBER, i);
		}
		public CheckOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOut; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCheckOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckOutContext checkOut() throws RecognitionException {
		CheckOutContext _localctx = new CheckOutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_checkOut);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			match(PARANL);
			setState(55);
			match(ITE);
			setState(56);
			match(PARANL);
			setState(57);
			match(AND);
			setState(58);
			output();
			setState(59);
			output();
			setState(60);
			match(PARANR);
			setState(61);
			match(NUMBER);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(63);
				match(NUMBER);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(PARANR);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PARANL);
			setState(73);
			match(EQUAL);
			setState(74);
			match(ID);
			setState(75);
			match(NUMBER);
			setState(76);
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PARANL);
			setState(79);
			match(ID);
			setState(80);
			match(INT);
			setState(81);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000eT\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0017\b\u0002\n\u0002\f\u0002\u001a\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00030\b\u0003\n\u0003\f\u00033\t\u0003\u0003\u00035\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001"+
		"\u0004\u0005\u0004D\b\u0004\n\u0004\f\u0004G\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007"+
		"\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\b\tQ\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0014"+
		"\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\nH\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010"+
		"\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0007\u0000\u0000\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014"+
		"\u0018\u0005\f\u0000\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\r\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\f\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f \u0005\u000b\u0000"+
		"\u0000 !\u0005\f\u0000\u0000!\"\u0005\r\u0000\u0000\"#\u0005\u0005\u0000"+
		"\u0000#$\u0005\u0006\u0000\u0000$5\u0005\r\u0000\u0000%&\u0005\f\u0000"+
		"\u0000&\'\u0005\n\u0000\u0000\'(\u0005\u000b\u0000\u0000()\u0005\f\u0000"+
		"\u0000)*\u0003\f\u0006\u0000*+\u0003\f\u0006\u0000+,\u0005\r\u0000\u0000"+
		",-\u0005\u0005\u0000\u0000-1\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u00004\u001d\u0001\u0000\u0000\u00004%\u0001\u0000\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000067\u0005\f\u0000\u000078\u0005\u0002\u0000"+
		"\u000089\u0005\f\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\n\u0005"+
		"\u0000;<\u0003\n\u0005\u0000<=\u0005\r\u0000\u0000=>\u0005\u0006\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\u0005\u0006\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AE\u0001\u0000\u0000\u0000BD\u0005"+
		"\r\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000HI\u0005\f\u0000\u0000IJ\u0005\u0004\u0000\u0000"+
		"JK\u0005\u000b\u0000\u0000KL\u0005\u0006\u0000\u0000LM\u0005\r\u0000\u0000"+
		"M\u000b\u0001\u0000\u0000\u0000NO\u0005\f\u0000\u0000OP\u0005\u000b\u0000"+
		"\u0000PQ\u0005\u0005\u0000\u0000QR\u0005\r\u0000\u0000R\r\u0001\u0000"+
		"\u0000\u0000\u0005\u001814@E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}