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
		RULE_model = 3, RULE_ite = 4, RULE_output = 5, RULE_define = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "checkSatResponse", "checkModelResponse", "model", "ite", "output", 
			"define"
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
		public IteContext ite() {
			return getRuleContext(IteContext.class,0);
		}
		public List<TerminalNode> PARANR() { return getTokens(Example2Parser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(Example2Parser.PARANR, i);
		}
		public List<TerminalNode> PARANL() { return getTokens(Example2Parser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(Example2Parser.PARANL, i);
		}
		public TerminalNode DEFINE_FUN() { return getToken(Example2Parser.DEFINE_FUN, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
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
		int _la;
		try {
			setState(53);
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
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PARANL) {
					{
					{
					setState(41);
					define();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				match(PARANR);
				setState(48);
				match(INT);
				}
				setState(50);
				ite();
				setState(51);
				match(PARANR);
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

	public static class IteContext extends ParserRuleContext {
		public List<TerminalNode> PARANL() { return getTokens(Example2Parser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(Example2Parser.PARANL, i);
		}
		public TerminalNode ITE() { return getToken(Example2Parser.ITE, 0); }
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public List<TerminalNode> PARANR() { return getTokens(Example2Parser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(Example2Parser.PARANR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(Example2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(Example2Parser.NUMBER, i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<IteContext> ite() {
			return getRuleContexts(IteContext.class);
		}
		public IteContext ite(int i) {
			return getRuleContext(IteContext.class,i);
		}
		public IteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteContext ite() throws RecognitionException {
		IteContext _localctx = new IteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PARANL);
			setState(56);
			match(ITE);
			setState(57);
			match(PARANL);
			setState(58);
			match(AND);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(59);
				output();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(PARANR);
			setState(66);
			match(NUMBER);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==PARANL) {
				{
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(67);
					match(NUMBER);
					}
					break;
				case PARANL:
					{
					setState(68);
					ite();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
			setState(76);
			match(PARANL);
			setState(77);
			match(EQUAL);
			setState(78);
			match(ID);
			setState(79);
			match(NUMBER);
			setState(80);
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
			setState(82);
			match(PARANL);
			setState(83);
			match(ID);
			setState(84);
			match(INT);
			setState(85);
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
		"\u0004\u0001\u000eX\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u0017\b\u0002\n\u0002\f\u0002\u001a\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0001\u0001\u0000\b\tV\u0000\u000e\u0001\u0000\u0000\u0000\u0002"+
		"\u0012\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006"+
		"5\u0001\u0000\u0000\u0000\b7\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fR\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000"+
		"\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0000\u0000\u0001"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0007\u0000\u0000\u0000"+
		"\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0018\u0005\f\u0000\u0000\u0015"+
		"\u0017\u0003\u0006\u0003\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a"+
		"\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\r\u0000\u0000\u001c\u0005"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005\f\u0000\u0000\u001e\u001f\u0005"+
		"\n\u0000\u0000\u001f \u0005\u000b\u0000\u0000 !\u0005\f\u0000\u0000!\""+
		"\u0005\r\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u0006\u0000\u0000"+
		"$6\u0005\r\u0000\u0000%&\u0005\f\u0000\u0000&\'\u0005\n\u0000\u0000\'"+
		"(\u0005\u000b\u0000\u0000(,\u0005\f\u0000\u0000)+\u0003\f\u0006\u0000"+
		"*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000/0\u0005\r\u0000\u000001\u0005\u0005\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0003\b\u0004\u000034\u0005\r\u0000\u000046\u0001\u0000"+
		"\u0000\u00005\u001d\u0001\u0000\u0000\u00005%\u0001\u0000\u0000\u0000"+
		"6\u0007\u0001\u0000\u0000\u000078\u0005\f\u0000\u000089\u0005\u0002\u0000"+
		"\u00009:\u0005\f\u0000\u0000:>\u0005\u0003\u0000\u0000;=\u0003\n\u0005"+
		"\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AB\u0005\r\u0000\u0000BG\u0005\u0006\u0000\u0000CF\u0005"+
		"\u0006\u0000\u0000DF\u0003\b\u0004\u0000EC\u0001\u0000\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JK\u0005\r\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\f\u0000"+
		"\u0000MN\u0005\u0004\u0000\u0000NO\u0005\u000b\u0000\u0000OP\u0005\u0006"+
		"\u0000\u0000PQ\u0005\r\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005"+
		"\f\u0000\u0000ST\u0005\u000b\u0000\u0000TU\u0005\u0005\u0000\u0000UV\u0005"+
		"\r\u0000\u0000V\r\u0001\u0000\u0000\u0000\u0006\u0018,5>EG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}