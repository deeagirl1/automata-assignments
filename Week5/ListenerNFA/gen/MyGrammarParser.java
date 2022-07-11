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
			int _alt;
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
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					expr();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(PARANR);
					}
					} 
				}
				setState(70);
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
			setState(71);
			match(PARANL);
			setState(72);
			match(ID);
			setState(73);
			types();
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
			setState(76);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ValueVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new ValueBasicNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(TEXT);
				}
				break;
			case 5:
				_localctx = new ValueComparisonExpresssionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				comparisonExpr();
				}
				break;
			case 6:
				_localctx = new StatementIfElseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				iteExpr();
				}
				break;
			case 7:
				_localctx = new ValueLogicalExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				logicalExpr();
				}
				break;
			case 8:
				_localctx = new ValueLetExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				letExpr();
				}
				break;
			case 9:
				_localctx = new ValueMathExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				mathExpr();
				}
				break;
			case 10:
				_localctx = new ValueFunc_callContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
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
			setState(90);
			match(PARANL);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				match(ID);
				setState(92);
				matchWildcard();
				setState(93);
				match(PLUS);
				}
				break;
			case 2:
				{
				setState(94);
				match(ID);
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(97);
					expr();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(103);
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
			setState(105);
			match(PARANL);
			setState(106);
			match(ITE);
			setState(107);
			expr();
			setState(108);
			expr();
			setState(109);
			expr();
			setState(110);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PARANR() { return getTokens(MyGrammarParser.PARANR); }
		public TerminalNode PARANR(int i) {
			return getToken(MyGrammarParser.PARANR, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PARANL);
			setState(113);
			match(LET);
			setState(114);
			match(PARANL);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					expr();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					match(PARANR);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(PARANL);
				setState(128);
				match(OR);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(129);
					expr();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(PARANL);
				setState(137);
				match(AND);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(138);
					expr();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(PARANL);
				setState(146);
				match(NOT);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(147);
					expr();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
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
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(PARANL);
				setState(157);
				match(LESS_THAN);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(158);
					expr();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(PARANL);
				setState(166);
				match(GREATER_THAN);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(167);
					expr();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(PARANL);
				setState(175);
				match(GREATER_THAN_OR_EQUAL);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(176);
					expr();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(PARANR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(PARANL);
				setState(184);
				match(LESS_THAN_OR_EQUAL);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(185);
					expr();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(PARANR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(PARANL);
				setState(193);
				match(EQUAL);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(194);
					expr();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(PARANL);
				setState(204);
				match(PLUS);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(205);
					expr();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(PARANR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(PARANL);
				setState(213);
				match(MINUS);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(214);
					expr();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(PARANR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(PARANL);
				setState(222);
				match(DIVIDE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(223);
					expr();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(PARANR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(PARANL);
				setState(231);
				match(MULTIPLY);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN) | (1L << ID) | (1L << PARANL))) != 0)) {
					{
					{
					setState(232);
					expr();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
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
		"\u0004\u0001\u001d\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0003\u0003(\b\u0003\u0001\u0003\u0005\u0003+\b\u0003"+
		"\n\u0003\f\u0003.\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u00048\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004@\t\u0004"+
		"\u0001\u0004\u0005\u0004C\b\u0004\n\u0004\f\u0004F\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007Y\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001\b\u0005\b"+
		"c\b\b\n\b\f\bf\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nu\b\n\n\n\f"+
		"\nx\t\n\u0001\n\u0005\n{\b\n\n\n\f\n~\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0083\b\u000b\n\u000b\f\u000b\u0086\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008c\b\u000b\n\u000b"+
		"\f\u000b\u008f\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0095\b\u000b\n\u000b\f\u000b\u0098\t\u000b\u0001\u000b\u0003"+
		"\u000b\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a0\b\f\n\f\f\f"+
		"\u00a3\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a9\b\f\n\f\f\f\u00ac"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b2\b\f\n\f\f\f\u00b5\t"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bb\b\f\n\f\f\f\u00be\t\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c4\b\f\n\f\f\f\u00c7\t\f\u0001"+
		"\f\u0003\f\u00ca\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00cf\b\r\n\r\f\r"+
		"\u00d2\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d8\b\r\n\r\f\r\u00db"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e1\b\r\n\r\f\r\u00e4\t"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ea\b\r\n\r\f\r\u00ed\t\r"+
		"\u0001\r\u0003\r\u00f0\b\r\u0001\r\u0001d\u0000\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0002\u0002"+
		"\u0000\u0002\u0002\u0016\u0017\u0002\u0000\f\r\u0013\u0013\u010a\u0000"+
		"\u001c\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"$\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b/\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000e"+
		"X\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012i\u0001"+
		"\u0000\u0000\u0000\u0014p\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000"+
		"\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000\u001a\u00ef\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0000"+
		"\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002"+
		"\u0000 !\u0005\u001b\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005\u001c"+
		"\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0007\u0000\u0000\u0000"+
		"%\u0005\u0001\u0000\u0000\u0000&(\u0005\u0001\u0000\u0000\'&\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(,\u0001\u0000\u0000\u0000)+\u0003"+
		"\b\u0004\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u001b\u0000\u000001\u0005\u0018"+
		"\u0000\u000012\u0005\u001a\u0000\u000026\u0005\u001b\u0000\u000035\u0003"+
		"\n\u0005\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009:\u0005\u001c\u0000\u0000:>\u0003\f\u0006\u0000"+
		";=\u0003\u000e\u0007\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?D\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AC\u0005\u001c\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000GH\u0005\u001b\u0000\u0000HI\u0005\u001a\u0000\u0000IJ\u0003\f\u0006"+
		"\u0000JK\u0005\u001c\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0007"+
		"\u0001\u0000\u0000M\r\u0001\u0000\u0000\u0000NY\u0005\u001a\u0000\u0000"+
		"OY\u0005\u0019\u0000\u0000PY\u0005\u0014\u0000\u0000QY\u0005\u0015\u0000"+
		"\u0000RY\u0003\u0018\f\u0000SY\u0003\u0012\t\u0000TY\u0003\u0016\u000b"+
		"\u0000UY\u0003\u0014\n\u0000VY\u0003\u001a\r\u0000WY\u0003\u0010\b\u0000"+
		"XN\u0001\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000"+
		"\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000XS\u0001\u0000"+
		"\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u000f\u0001\u0000\u0000"+
		"\u0000Z_\u0005\u001b\u0000\u0000[\\\u0005\u001a\u0000\u0000\\]\t\u0000"+
		"\u0000\u0000]`\u0005\b\u0000\u0000^`\u0005\u001a\u0000\u0000_[\u0001\u0000"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`d\u0001\u0000\u0000\u0000ac\u0003"+
		"\u000e\u0007\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u001c\u0000\u0000h\u0011\u0001"+
		"\u0000\u0000\u0000ij\u0005\u001b\u0000\u0000jk\u0005\u0003\u0000\u0000"+
		"kl\u0003\u000e\u0007\u0000lm\u0003\u000e\u0007\u0000mn\u0003\u000e\u0007"+
		"\u0000no\u0005\u001c\u0000\u0000o\u0013\u0001\u0000\u0000\u0000pq\u0005"+
		"\u001b\u0000\u0000qr\u0005\u0011\u0000\u0000rv\u0005\u001b\u0000\u0000"+
		"su\u0003\u000e\u0007\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w|\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0005\u001c\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0015\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0084\u0005\u000f"+
		"\u0000\u0000\u0081\u0083\u0003\u000e\u0007\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u009b\u0005\u001c"+
		"\u0000\u0000\u0088\u0089\u0005\u001b\u0000\u0000\u0089\u008d\u0005\u000e"+
		"\u0000\u0000\u008a\u008c\u0003\u000e\u0007\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u009b\u0005\u001c"+
		"\u0000\u0000\u0091\u0092\u0005\u001b\u0000\u0000\u0092\u0096\u0005\u0010"+
		"\u0000\u0000\u0093\u0095\u0003\u000e\u0007\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u001c"+
		"\u0000\u0000\u009a\u007f\u0001\u0000\u0000\u0000\u009a\u0088\u0001\u0000"+
		"\u0000\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u001b\u0000\u0000\u009d\u00a1\u0005\u0005"+
		"\u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00ca\u0005\u001c"+
		"\u0000\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00aa\u0005\u0004"+
		"\u0000\u0000\u00a7\u00a9\u0003\u000e\u0007\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ca\u0005\u001c"+
		"\u0000\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00b3\u0005\u0006"+
		"\u0000\u0000\u00b0\u00b2\u0003\u000e\u0007\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ca\u0005\u001c"+
		"\u0000\u0000\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00bc\u0005\u0007"+
		"\u0000\u0000\u00b9\u00bb\u0003\u000e\u0007\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00ca\u0005\u001c"+
		"\u0000\u0000\u00c0\u00c1\u0005\u001b\u0000\u0000\u00c1\u00c5\u0005\u0012"+
		"\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\u001c"+
		"\u0000\u0000\u00c9\u009c\u0001\u0000\u0000\u0000\u00c9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ae\u0001\u0000\u0000\u0000\u00c9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00ca\u0019\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u001b\u0000\u0000\u00cc\u00d0\u0005\b\u0000"+
		"\u0000\u00cd\u00cf\u0003\u000e\u0007\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00f0\u0005\u001c\u0000"+
		"\u0000\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5\u00d9\u0005\t\u0000\u0000"+
		"\u00d6\u00d8\u0003\u000e\u0007\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00f0\u0005\u001c\u0000\u0000"+
		"\u00dd\u00de\u0005\u001b\u0000\u0000\u00de\u00e2\u0005\n\u0000\u0000\u00df"+
		"\u00e1\u0003\u000e\u0007\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00f0\u0005\u001c\u0000\u0000\u00e6"+
		"\u00e7\u0005\u001b\u0000\u0000\u00e7\u00eb\u0005\u000b\u0000\u0000\u00e8"+
		"\u00ea\u0003\u000e\u0007\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005\u001c\u0000\u0000\u00ef"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ef\u00d4\u0001\u0000\u0000\u0000\u00ef"+
		"\u00dd\u0001\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00f0"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\',6>DX_dv|\u0084\u008d\u0096\u009a"+
		"\u00a1\u00aa\u00b3\u00bc\u00c5\u00c9\u00d0\u00d9\u00e2\u00eb\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}