// Generated from MyGrammar.g4 by ANTLR 4.10.1
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
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODEL=1, UNKNOWN=2, ITE=3, GREATER_THAN=4, LESS_THAN=5, GREATER_THAN_OR_EQUAL=6, 
		LESS_THAN_OR_EQUAL=7, PLUS=8, MINUS=9, DIVIDE=10, MULTIPLY=11, STRING=12, 
		BOOL=13, AND=14, OR=15, NOT=16, LET=17, EQUAL=18, INT=19, NUMBER=20, TEXT=21, 
		UNSAT=22, SAT=23, DEFINE_FUN=24, BOOLEAN=25, ID=26, PARANL=27, PARANR=28, 
		NEWLINE=29;
	public static final int
		RULE_myStart = 0, RULE_statement = 1, RULE_checkSatResponse = 2, RULE_checkModelResponse = 3, 
		RULE_declarFun = 4, RULE_parameter = 5, RULE_types = 6, RULE_expr = 7, 
		RULE_func_call = 8, RULE_iteExpr = 9, RULE_letExpr = 10, RULE_logicalExpr = 11, 
		RULE_comparisonExpr = 12, RULE_mathExpr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "statement", "checkSatResponse", "checkModelResponse", "declarFun", 
			"parameter", "types", "expr", "func_call", "iteExpr", "letExpr", "logicalExpr", 
			"comparisonExpr", "mathExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'model'", "'unknown'", "'ite'", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'/'", "'*'", "'String'", "'Bool'", "'and'", "'or'", "'not'", 
			"'let'", "'='", "'Int'", null, null, "'unsat'", "'sat'", "'define-fun'", 
			null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODEL", "UNKNOWN", "ITE", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN_OR_EQUAL", "PLUS", "MINUS", "DIVIDE", "MULTIPLY", "STRING", 
			"BOOL", "AND", "OR", "NOT", "LET", "EQUAL", "INT", "NUMBER", "TEXT", 
			"UNSAT", "SAT", "DEFINE_FUN", "BOOLEAN", "ID", "PARANL", "PARANR", "NEWLINE"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			statement();
			setState(29);
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
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public CheckModelResponseContext checkModelResponse() {
			return getRuleContext(CheckModelResponseContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			checkSatResponse();
			setState(32);
			match(PARANL);
			setState(33);
			checkModelResponse();
			setState(34);
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

	public static class CheckSatResponseContext extends ParserRuleContext {
		public TerminalNode SAT() { return getToken(MyGrammarParser.SAT, 0); }
		public TerminalNode UNSAT() { return getToken(MyGrammarParser.UNSAT, 0); }
		public TerminalNode UNKNOWN() { return getToken(MyGrammarParser.UNKNOWN, 0); }
		public CheckSatResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkSatResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCheckSatResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCheckSatResponse(this);
		}
	}

	public final CheckSatResponseContext checkSatResponse() throws RecognitionException {
		CheckSatResponseContext _localctx = new CheckSatResponseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_checkSatResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNKNOWN) | (1L << UNSAT) | (1L << SAT))) != 0)) ) {
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
		public TerminalNode MODEL() { return getToken(MyGrammarParser.MODEL, 0); }
		public List<DeclarFunContext> declarFun() {
			return getRuleContexts(DeclarFunContext.class);
		}
		public DeclarFunContext declarFun(int i) {
			return getRuleContext(DeclarFunContext.class,i);
		}
		public CheckModelResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkModelResponse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCheckModelResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCheckModelResponse(this);
		}
	}

	public final CheckModelResponseContext checkModelResponse() throws RecognitionException {
		CheckModelResponseContext _localctx = new CheckModelResponseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_checkModelResponse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODEL) {
				{
				setState(38);
				match(MODEL);
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(41);
				declarFun();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclarFunContext extends ParserRuleContext {
		public DeclarFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarFun; }
	 
		public DeclarFunContext() { }
		public void copyFrom(DeclarFunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementFunctionContext extends DeclarFunContext {
		public List<TerminalNode> PARANL() { return getTokens(MyGrammarParser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(MyGrammarParser.PARANL, i);
		}
		public TerminalNode DEFINE_FUN() { return getToken(MyGrammarParser.DEFINE_FUN, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public List<TerminalNode> PARANR() { return getTokens(MyGrammarParser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(MyGrammarParser.PARANR, i);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementFunctionContext(DeclarFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatementFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatementFunction(this);
		}
	}

	public final DeclarFunContext declarFun() throws RecognitionException {
		DeclarFunContext _localctx = new DeclarFunContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarFun);
		int _la;
		try {
			_localctx = new StatementFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PARANL);
			setState(48);
			match(DEFINE_FUN);
			setState(49);
			match(ID);
			setState(50);
			match(PARANL);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARANL) {
				{
				{
				setState(51);
				parameter();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(PARANR);
			setState(58);
			types();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
				{
				{
				setState(59);
				expr();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PARANL);
			setState(68);
			match(ID);
			setState(69);
			types();
			setState(70);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(MyGrammarParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << INT))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueBasicNumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(MyGrammarParser.NUMBER, 0); }
		public ValueBasicNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueBasicNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueBasicNumber(this);
		}
	}
	public static class ValueVariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueVariable(this);
		}
	}
	public static class ValueBooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public ValueBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueBoolean(this);
		}
	}
	public static class ValueFunc_callContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ValueFunc_callContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueFunc_call(this);
		}
	}
	public static class ValueComparisonExpresssionContext extends ExprContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ValueComparisonExpresssionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueComparisonExpresssion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueComparisonExpresssion(this);
		}
	}
	public static class ValueLetExprContext extends ExprContext {
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public ValueLetExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueLetExpr(this);
		}
	}
	public static class ValueStringContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(MyGrammarParser.TEXT, 0); }
		public ValueStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueString(this);
		}
	}
	public static class ValueLogicalExprContext extends ExprContext {
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ValueLogicalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueLogicalExpr(this);
		}
	}
	public static class ValueMathExprContext extends ExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ValueMathExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueMathExpr(this);
		}
	}
	public static class StatementIfElseContext extends ExprContext {
		public IteExprContext iteExpr() {
			return getRuleContext(IteExprContext.class,0);
		}
		public StatementIfElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatementIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatementIfElse(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new ValueBasicNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(TEXT);
				}
				break;
			case 5:
				_localctx = new ValueComparisonExpresssionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				comparisonExpr();
				}
				break;
			case 6:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				iteExpr();
				}
				break;
			case 7:
				_localctx = new ValueLogicalExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(80);
				logicalExpr();
				}
				break;
			case 8:
				_localctx = new ValueLetExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				letExpr();
				}
				break;
			case 9:
				_localctx = new ValueMathExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(82);
				mathExpr();
				}
				break;
			case 10:
				_localctx = new ValueFunc_callContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				func_call();
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode PLUS() { return getToken(MyGrammarParser.PLUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PARANL);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				match(ID);
				setState(88);
				matchWildcard();
				setState(89);
				match(PLUS);
				}
				break;
			case 2:
				{
				setState(90);
				match(ID);
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(93);
					expr();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(99);
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

	public static class IteExprContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode ITE() { return getToken(MyGrammarParser.ITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public IteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIteExpr(this);
		}
	}

	public final IteExprContext iteExpr() throws RecognitionException {
		IteExprContext _localctx = new IteExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iteExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PARANL);
			setState(102);
			match(ITE);
			setState(103);
			expr();
			setState(104);
			expr();
			setState(105);
			expr();
			setState(106);
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

	public static class LetExprContext extends ParserRuleContext {
		public List<TerminalNode> PARANL() { return getTokens(MyGrammarParser.PARANL); }
		public TerminalNode PARANL(int i) {
			return getToken(MyGrammarParser.PARANL, i);
		}
		public TerminalNode LET() { return getToken(MyGrammarParser.LET, 0); }
		public List<TerminalNode> PARANR() { return getTokens(MyGrammarParser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(MyGrammarParser.PARANR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLetExpr(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PARANL);
			setState(109);
			match(LET);
			setState(110);
			match(PARANL);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				expr();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0) );
			setState(116);
			match(PARANR);
			setState(117);
			expr();
			setState(118);
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

	public static class LogicalExprContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public TerminalNode NOT() { return getToken(MyGrammarParser.NOT, 0); }
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLogicalExpr(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalExpr);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(PARANL);
				setState(121);
				match(OR);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(122);
					expr();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(PARANL);
				setState(130);
				match(AND);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(131);
					expr();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(PARANL);
				setState(139);
				match(NOT);
				setState(140);
				expr();
				setState(141);
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

	public static class ComparisonExprContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode LESS_THAN() { return getToken(MyGrammarParser.LESS_THAN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MyGrammarParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(MyGrammarParser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(MyGrammarParser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(MyGrammarParser.EQUAL, 0); }
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonExpr);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(PARANL);
				setState(146);
				match(LESS_THAN);
				setState(147);
				expr();
				setState(148);
				expr();
				setState(149);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(PARANL);
				setState(152);
				match(GREATER_THAN);
				setState(153);
				expr();
				setState(154);
				expr();
				setState(155);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(PARANL);
				setState(158);
				match(GREATER_THAN_OR_EQUAL);
				setState(159);
				expr();
				setState(160);
				expr();
				setState(161);
				match(PARANR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(PARANL);
				setState(164);
				match(LESS_THAN_OR_EQUAL);
				setState(165);
				expr();
				setState(166);
				expr();
				setState(167);
				match(PARANR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(PARANL);
				setState(170);
				match(EQUAL);
				setState(171);
				expr();
				setState(172);
				expr();
				setState(173);
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

	public static class MathExprContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public TerminalNode PLUS() { return getToken(MyGrammarParser.PLUS, 0); }
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(MyGrammarParser.DIVIDE, 0); }
		public TerminalNode MULTIPLY() { return getToken(MyGrammarParser.MULTIPLY, 0); }
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMathExpr(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathExpr);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(PARANL);
				setState(178);
				match(PLUS);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(179);
					expr();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(PARANL);
				setState(187);
				match(MINUS);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(188);
					expr();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(PARANL);
				setState(196);
				match(DIVIDE);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(197);
					expr();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(PARANR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(PARANL);
				setState(205);
				match(MULTIPLY);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(206);
					expr();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003(\b\u0003\u0001\u0003\u0005\u0003+\b\u0003"+
		"\n\u0003\f\u0003.\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u00048\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007U\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\\\b\b\u0001\b\u0005\b_\b\b\n\b\f\bb\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\nq\b\n\u000b\n\f\nr\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b|\b\u000b\n\u000b\f\u000b\u007f"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0085"+
		"\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00b0\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b5"+
		"\b\r\n\r\f\r\u00b8\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00be\b"+
		"\r\n\r\f\r\u00c1\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c7\b\r"+
		"\n\r\f\r\u00ca\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d0\b\r\n"+
		"\r\f\r\u00d3\t\r\u0001\r\u0003\r\u00d6\b\r\u0001\r\u0001`\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0002\u0002\u0000\u0002\u0002\u0016\u0017\u0002\u0000\f\r\u0013"+
		"\u0013\u00e8\u0000\u001c\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000"+
		"\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000"+
		"\u0000\b/\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fH\u0001"+
		"\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000"+
		"\u0000\u0012e\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016"+
		"\u008f\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000\u0000\u0000\u001a"+
		"\u00d5\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d"+
		"\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f"+
		" \u0003\u0004\u0002\u0000 !\u0005\u001b\u0000\u0000!\"\u0003\u0006\u0003"+
		"\u0000\"#\u0005\u001c\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0007"+
		"\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&(\u0005\u0001\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(,\u0001\u0000"+
		"\u0000\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0007"+
		"\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u001b\u0000"+
		"\u000001\u0005\u0018\u0000\u000012\u0005\u001a\u0000\u000026\u0005\u001b"+
		"\u0000\u000035\u0003\n\u0005\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u001c\u0000\u0000"+
		":>\u0003\f\u0006\u0000;=\u0003\u000e\u0007\u0000<;\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u001c"+
		"\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u001b\u0000\u0000DE\u0005"+
		"\u001a\u0000\u0000EF\u0003\f\u0006\u0000FG\u0005\u001c\u0000\u0000G\u000b"+
		"\u0001\u0000\u0000\u0000HI\u0007\u0001\u0000\u0000I\r\u0001\u0000\u0000"+
		"\u0000JU\u0005\u001a\u0000\u0000KU\u0005\u0019\u0000\u0000LU\u0005\u0014"+
		"\u0000\u0000MU\u0005\u0015\u0000\u0000NU\u0003\u0018\f\u0000OU\u0003\u0012"+
		"\t\u0000PU\u0003\u0016\u000b\u0000QU\u0003\u0014\n\u0000RU\u0003\u001a"+
		"\r\u0000SU\u0003\u0010\b\u0000TJ\u0001\u0000\u0000\u0000TK\u0001\u0000"+
		"\u0000\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001"+
		"\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000"+
		"TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u000f\u0001\u0000\u0000\u0000V[\u0005\u001b\u0000\u0000WX\u0005"+
		"\u001a\u0000\u0000XY\t\u0000\u0000\u0000Y\\\u0005\b\u0000\u0000Z\\\u0005"+
		"\u001a\u0000\u0000[W\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\`\u0001\u0000\u0000\u0000]_\u0003\u000e\u0007\u0000^]\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0005"+
		"\u001c\u0000\u0000d\u0011\u0001\u0000\u0000\u0000ef\u0005\u001b\u0000"+
		"\u0000fg\u0005\u0003\u0000\u0000gh\u0003\u000e\u0007\u0000hi\u0003\u000e"+
		"\u0007\u0000ij\u0003\u000e\u0007\u0000jk\u0005\u001c\u0000\u0000k\u0013"+
		"\u0001\u0000\u0000\u0000lm\u0005\u001b\u0000\u0000mn\u0005\u0011\u0000"+
		"\u0000np\u0005\u001b\u0000\u0000oq\u0003\u000e\u0007\u0000po\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\u001c\u0000\u0000"+
		"uv\u0003\u000e\u0007\u0000vw\u0005\u001c\u0000\u0000w\u0015\u0001\u0000"+
		"\u0000\u0000xy\u0005\u001b\u0000\u0000y}\u0005\u000f\u0000\u0000z|\u0003"+
		"\u000e\u0007\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0090\u0005\u001c"+
		"\u0000\u0000\u0081\u0082\u0005\u001b\u0000\u0000\u0082\u0086\u0005\u000e"+
		"\u0000\u0000\u0083\u0085\u0003\u000e\u0007\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u0090\u0005\u001c"+
		"\u0000\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b\u008c\u0005\u0010"+
		"\u0000\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0005\u001c"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008fx\u0001\u0000\u0000"+
		"\u0000\u008f\u0081\u0001\u0000\u0000\u0000\u008f\u008a\u0001\u0000\u0000"+
		"\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001b\u0000"+
		"\u0000\u0092\u0093\u0005\u0005\u0000\u0000\u0093\u0094\u0003\u000e\u0007"+
		"\u0000\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005\u001c\u0000"+
		"\u0000\u0096\u00b0\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u001b\u0000"+
		"\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009a\u0003\u000e\u0007"+
		"\u0000\u009a\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0005\u001c\u0000"+
		"\u0000\u009c\u00b0\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001b\u0000"+
		"\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u00a0\u0003\u000e\u0007"+
		"\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2\u0005\u001c\u0000"+
		"\u0000\u00a2\u00b0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001b\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0007\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007"+
		"\u0000\u00a6\u00a7\u0003\u000e\u0007\u0000\u00a7\u00a8\u0005\u001c\u0000"+
		"\u0000\u00a8\u00b0\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u001b\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0012\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007"+
		"\u0000\u00ac\u00ad\u0003\u000e\u0007\u0000\u00ad\u00ae\u0005\u001c\u0000"+
		"\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u0091\u0001\u0000\u0000"+
		"\u0000\u00af\u0097\u0001\u0000\u0000\u0000\u00af\u009d\u0001\u0000\u0000"+
		"\u0000\u00af\u00a3\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u001b\u0000"+
		"\u0000\u00b2\u00b6\u0005\b\u0000\u0000\u00b3\u00b5\u0003\u000e\u0007\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00d6\u0005\u001c\u0000\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000"+
		"\u00bb\u00bf\u0005\t\u0000\u0000\u00bc\u00be\u0003\u000e\u0007\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00d6\u0005\u001c\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4"+
		"\u00c8\u0005\n\u0000\u0000\u00c5\u00c7\u0003\u000e\u0007\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d6"+
		"\u0005\u001c\u0000\u0000\u00cc\u00cd\u0005\u001b\u0000\u0000\u00cd\u00d1"+
		"\u0005\u000b\u0000\u0000\u00ce\u00d0\u0003\u000e\u0007\u0000\u00cf\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0005\u001c\u0000\u0000\u00d5\u00b1\u0001\u0000\u0000\u0000\u00d5\u00ba"+
		"\u0001\u0000\u0000\u0000\u00d5\u00c3\u0001\u0000\u0000\u0000\u00d5\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d6\u001b\u0001\u0000\u0000\u0000\u0011\',"+
		"6>T[`r}\u0086\u008f\u00af\u00b6\u00bf\u00c8\u00d1\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}