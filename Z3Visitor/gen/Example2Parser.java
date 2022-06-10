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
		RULE_start2 = 0, RULE_statement = 1, RULE_checkSatResponse = 2, RULE_checkModelResponse = 3, 
		RULE_model = 4, RULE_ite = 5, RULE_get_assignment = 6, RULE_global_declarations = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "checkSatResponse", "checkModelResponse", "model", 
			"ite", "get_assignment", "global_declarations"
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
		public TerminalNode EOF() { return getToken(Example2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNSAT) | (1L << SAT) | (1L << PARANL))) != 0)) {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class StatementContext extends ParserRuleContext {
		public CheckSatResponseContext checkSatResponse() {
			return getRuleContext(CheckSatResponseContext.class,0);
		}
		public CheckModelResponseContext checkModelResponse() {
			return getRuleContext(CheckModelResponseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNSAT:
			case SAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				checkSatResponse();
				}
				break;
			case PARANL:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				checkModelResponse();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 4, RULE_checkSatResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
		enterRule(_localctx, 6, RULE_checkModelResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PARANL);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(31);
				model();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public IteContext ite() {
			return getRuleContext(IteContext.class,0);
		}
		public List<Global_declarationsContext> global_declarations() {
			return getRuleContexts(Global_declarationsContext.class);
		}
		public Global_declarationsContext global_declarations(int i) {
			return getRuleContext(Global_declarationsContext.class,i);
		}
		public ModelRContext(ModelContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitModelR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_model);
		int _la;
		try {
			_localctx = new ModelRContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			match(PARANL);
			setState(40);
			match(DEFINE_FUN);
			setState(41);
			match(ID);
			setState(42);
			match(PARANL);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(43);
				global_declarations();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(PARANR);
			setState(50);
			match(INT);
			}
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(52);
				match(NUMBER);
				}
				break;
			case PARANL:
				{
				setState(53);
				ite();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
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
		public List<Get_assignmentContext> get_assignment() {
			return getRuleContexts(Get_assignmentContext.class);
		}
		public Get_assignmentContext get_assignment(int i) {
			return getRuleContext(Get_assignmentContext.class,i);
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
		enterRule(_localctx, 10, RULE_ite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PARANL);
			setState(59);
			match(ITE);
			setState(60);
			match(PARANL);
			setState(61);
			match(AND);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(62);
				get_assignment();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(PARANR);
			setState(69);
			match(NUMBER);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==PARANL) {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(70);
					match(NUMBER);
					}
					break;
				case PARANL:
					{
					setState(71);
					ite();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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

	public static class Get_assignmentContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(Example2Parser.NUMBER, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Get_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitGet_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_assignmentContext get_assignment() throws RecognitionException {
		Get_assignmentContext _localctx = new Get_assignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_get_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PARANL);
			setState(80);
			match(EQUAL);
			setState(81);
			match(ID);
			setState(82);
			match(NUMBER);
			setState(83);
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

	public static class Global_declarationsContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Global_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitGlobal_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declarationsContext global_declarations() throws RecognitionException {
		Global_declarationsContext _localctx = new Global_declarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(PARANL);
			setState(86);
			match(ID);
			setState(87);
			match(INT);
			setState(88);
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
		"\u0004\u0001\u000e[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003!\b\u0003\n\u0003\f\u0003"+
		"$\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004-\b\u0004\n\u0004\f\u00040\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"7\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005"+
		"\n\u0005\f\u0005L\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\b\tZ\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001"+
		"\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b\'\u0001\u0000"+
		"\u0000\u0000\n:\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000e"+
		"U\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u001b"+
		"\u0003\u0004\u0002\u0000\u0019\u001b\u0003\u0006\u0003\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d\u0005"+
		"\u0001\u0000\u0000\u0000\u001e\"\u0005\f\u0000\u0000\u001f!\u0003\b\u0004"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000%&\u0005\r\u0000\u0000&\u0007\u0001\u0000\u0000"+
		"\u0000\'(\u0005\f\u0000\u0000()\u0005\n\u0000\u0000)*\u0005\u000b\u0000"+
		"\u0000*.\u0005\f\u0000\u0000+-\u0003\u000e\u0007\u0000,+\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005"+
		"\r\u0000\u000023\u0005\u0005\u0000\u000036\u0001\u0000\u0000\u000047\u0005"+
		"\u0006\u0000\u000057\u0003\n\u0005\u000064\u0001\u0000\u0000\u000065\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\r\u0000\u00009\t"+
		"\u0001\u0000\u0000\u0000:;\u0005\f\u0000\u0000;<\u0005\u0002\u0000\u0000"+
		"<=\u0005\f\u0000\u0000=A\u0005\u0003\u0000\u0000>@\u0003\f\u0006\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0005\r\u0000\u0000EJ\u0005\u0006\u0000\u0000FI\u0005\u0006"+
		"\u0000\u0000GI\u0003\n\u0005\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005\r\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\f\u0000"+
		"\u0000PQ\u0005\u0004\u0000\u0000QR\u0005\u000b\u0000\u0000RS\u0005\u0006"+
		"\u0000\u0000ST\u0005\r\u0000\u0000T\r\u0001\u0000\u0000\u0000UV\u0005"+
		"\f\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0005\u0005\u0000\u0000XY\u0005"+
		"\r\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000\b\u0013\u001a\".6AHJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}