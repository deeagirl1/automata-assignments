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
		MUL=1, DIV=2, ADD=3, SUB=4, POW=5, FACT=6, PARANL=7, PARANR=8, Equals=9, 
		IntType=10, BoolType=11, StringType=12, DOT=13, COMMA=14, SEMICOLON=15, 
		StringParen=16, Print=17, INT=18, BOOLEAN=19, ID=20, STRING=21, COMMENT=22, 
		WS=23;
	public static final int
		RULE_myStart = 0, RULE_statement = 1, RULE_variable_declaration = 2, RULE_string_variable_assignment = 3, 
		RULE_bool_variable_assignment = 4, RULE_int_variable_assignment = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "statement", "variable_declaration", "string_variable_assignment", 
			"bool_variable_assignment", "int_variable_assignment", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", "'='", 
			"'int'", "'bool'", "'string'", "'.'", "','", "';'", "'\"'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", "PARANR", 
			"Equals", "IntType", "BoolType", "StringType", "DOT", "COMMA", "SEMICOLON", 
			"StringParen", "Print", "INT", "BOOLEAN", "ID", "STRING", "COMMENT", 
			"WS"
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
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0) );
			setState(19);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OtherExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOtherExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOtherExpr(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssign(this);
		}
	}
	public static class PrintExprContext extends StatementContext {
		public Token op;
		public TerminalNode Print() { return getToken(MyGrammarParser.Print, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public PrintExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintExpr(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new OtherExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				expression(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				variable_declaration();
				}
				break;
			case 3:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(Print);
				setState(24);
				((PrintExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) ) {
					((PrintExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Int_variable_assignmentContext int_variable_assignment() {
			return getRuleContext(Int_variable_assignmentContext.class,0);
		}
		public Bool_variable_assignmentContext bool_variable_assignment() {
			return getRuleContext(Bool_variable_assignmentContext.class,0);
		}
		public String_variable_assignmentContext string_variable_assignment() {
			return getRuleContext(String_variable_assignmentContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_declaration);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				int_variable_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				bool_variable_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				string_variable_assignment();
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

	public static class String_variable_assignmentContext extends ParserRuleContext {
		public String_variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_variable_assignment; }
	 
		public String_variable_assignmentContext() { }
		public void copyFrom(String_variable_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringDeclarationContext extends String_variable_assignmentContext {
		public TerminalNode StringType() { return getToken(MyGrammarParser.StringType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public StringDeclarationContext(String_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringDeclaration(this);
		}
	}
	public static class StringAssignValueContext extends String_variable_assignmentContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StringAssignValueContext(String_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringAssignValue(this);
		}
	}
	public static class StringAssignContext extends String_variable_assignmentContext {
		public TerminalNode StringType() { return getToken(MyGrammarParser.StringType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StringAssignContext(String_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStringAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStringAssign(this);
		}
	}

	public final String_variable_assignmentContext string_variable_assignment() throws RecognitionException {
		String_variable_assignmentContext _localctx = new String_variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_variable_assignment);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(StringType);
				setState(33);
				match(ID);
				}
				break;
			case 2:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(StringType);
				setState(35);
				match(ID);
				setState(36);
				match(Equals);
				setState(37);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(ID);
				setState(39);
				match(Equals);
				setState(40);
				match(STRING);
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

	public static class Bool_variable_assignmentContext extends ParserRuleContext {
		public Bool_variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_variable_assignment; }
	 
		public Bool_variable_assignmentContext() { }
		public void copyFrom(Bool_variable_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDeclarationContext extends Bool_variable_assignmentContext {
		public TerminalNode BoolType() { return getToken(MyGrammarParser.BoolType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public BoolDeclarationContext(Bool_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBoolDeclaration(this);
		}
	}
	public static class BoolAssignContext extends Bool_variable_assignmentContext {
		public TerminalNode BoolType() { return getToken(MyGrammarParser.BoolType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public BoolAssignContext(Bool_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBoolAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBoolAssign(this);
		}
	}
	public static class BoolAssignValueContext extends Bool_variable_assignmentContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public BoolAssignValueContext(Bool_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBoolAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBoolAssignValue(this);
		}
	}

	public final Bool_variable_assignmentContext bool_variable_assignment() throws RecognitionException {
		Bool_variable_assignmentContext _localctx = new Bool_variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool_variable_assignment);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(BoolType);
				setState(44);
				match(ID);
				}
				break;
			case 2:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(BoolType);
				setState(46);
				match(ID);
				setState(47);
				match(Equals);
				setState(48);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(ID);
				setState(50);
				match(Equals);
				setState(51);
				match(BOOLEAN);
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

	public static class Int_variable_assignmentContext extends ParserRuleContext {
		public Int_variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_variable_assignment; }
	 
		public Int_variable_assignmentContext() { }
		public void copyFrom(Int_variable_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAssignContext extends Int_variable_assignmentContext {
		public TerminalNode IntType() { return getToken(MyGrammarParser.IntType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntAssignContext(Int_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntAssign(this);
		}
	}
	public static class IntDeclarationContext extends Int_variable_assignmentContext {
		public TerminalNode IntType() { return getToken(MyGrammarParser.IntType, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public IntDeclarationContext(Int_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntDeclaration(this);
		}
	}
	public static class IntAssignValueContext extends Int_variable_assignmentContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode Equals() { return getToken(MyGrammarParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntAssignValueContext(Int_variable_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntAssignValue(this);
		}
	}

	public final Int_variable_assignmentContext int_variable_assignment() throws RecognitionException {
		Int_variable_assignmentContext _localctx = new Int_variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int_variable_assignment);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(IntType);
				setState(55);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IntAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(IntType);
				setState(57);
				match(ID);
				setState(58);
				match(Equals);
				setState(59);
				expression(0);
				}
				break;
			case 3:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(ID);
				setState(61);
				match(Equals);
				setState(62);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDiv(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public SubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSub(this);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParens(this);
		}
	}
	public static class ValueVariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueVariable(this);
		}
	}
	public static class ValueBooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public ValueBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueBoolean(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MyGrammarParser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMul(this);
		}
	}
	public static class ValueNumberContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public ValueNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueNumber(this);
		}
	}
	public static class PowContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(MyGrammarParser.POW, 0); }
		public PowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPow(this);
		}
	}
	public static class ValueStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public ValueStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueString(this);
		}
	}
	public static class FactContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(MyGrammarParser.FACT, 0); }
		public FactContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFact(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(PARANL);
				setState(67);
				expression(0);
				setState(68);
				match(PARANR);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ValueBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(BOOLEAN);
				}
				break;
			case INT:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new ValueStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(77);
						((MulContext)_localctx).op = match(MUL);
						setState(78);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(80);
						((DivContext)_localctx).op = match(DIV);
						setState(81);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(83);
						((AddContext)_localctx).op = match(ADD);
						setState(84);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(86);
						((SubContext)_localctx).op = match(SUB);
						setState(87);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(89);
						((PowContext)_localctx).op = match(POW);
						setState(90);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new FactContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003*\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00045\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006K\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"^\b\u0006\n\u0006\f\u0006a\t\u0006\u0001\u0006\u0000\u0001\f\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u0012\u0014p\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001e"+
		"\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b4\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e"+
		"\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015"+
		"\u001a\u0003\f\u0006\u0000\u0016\u001a\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005\u0011\u0000\u0000\u0018\u001a\u0007\u0000\u0000\u0000\u0019\u0015"+
		"\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001f"+
		"\u0003\n\u0005\u0000\u001c\u001f\u0003\b\u0004\u0000\u001d\u001f\u0003"+
		"\u0006\u0003\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0005\u0001"+
		"\u0000\u0000\u0000 !\u0005\f\u0000\u0000!*\u0005\u0014\u0000\u0000\"#"+
		"\u0005\f\u0000\u0000#$\u0005\u0014\u0000\u0000$%\u0005\t\u0000\u0000%"+
		"*\u0005\u0015\u0000\u0000&\'\u0005\u0014\u0000\u0000\'(\u0005\t\u0000"+
		"\u0000(*\u0005\u0015\u0000\u0000) \u0001\u0000\u0000\u0000)\"\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000*\u0007\u0001\u0000\u0000\u0000"+
		"+,\u0005\u000b\u0000\u0000,5\u0005\u0014\u0000\u0000-.\u0005\u000b\u0000"+
		"\u0000./\u0005\u0014\u0000\u0000/0\u0005\t\u0000\u000005\u0005\u0013\u0000"+
		"\u000012\u0005\u0014\u0000\u000023\u0005\t\u0000\u000035\u0005\u0013\u0000"+
		"\u00004+\u0001\u0000\u0000\u00004-\u0001\u0000\u0000\u000041\u0001\u0000"+
		"\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\n\u0000\u00007@\u0005"+
		"\u0014\u0000\u000089\u0005\n\u0000\u00009:\u0005\u0014\u0000\u0000:;\u0005"+
		"\t\u0000\u0000;@\u0003\f\u0006\u0000<=\u0005\u0014\u0000\u0000=>\u0005"+
		"\t\u0000\u0000>@\u0003\f\u0006\u0000?6\u0001\u0000\u0000\u0000?8\u0001"+
		"\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000"+
		"\u0000AB\u0006\u0006\uffff\uffff\u0000BC\u0005\u0007\u0000\u0000CD\u0003"+
		"\f\u0006\u0000DE\u0005\b\u0000\u0000EK\u0001\u0000\u0000\u0000FK\u0005"+
		"\u0014\u0000\u0000GK\u0005\u0013\u0000\u0000HK\u0005\u0012\u0000\u0000"+
		"IK\u0005\u0015\u0000\u0000JA\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K_\u0001\u0000\u0000\u0000LM\n\u000b\u0000\u0000MN\u0005\u0001"+
		"\u0000\u0000N^\u0003\f\u0006\fOP\n\n\u0000\u0000PQ\u0005\u0002\u0000\u0000"+
		"Q^\u0003\f\u0006\u000bRS\n\t\u0000\u0000ST\u0005\u0003\u0000\u0000T^\u0003"+
		"\f\u0006\nUV\n\b\u0000\u0000VW\u0005\u0004\u0000\u0000W^\u0003\f\u0006"+
		"\tXY\n\u0007\u0000\u0000YZ\u0005\u0005\u0000\u0000Z^\u0003\f\u0006\b["+
		"\\\n\u0006\u0000\u0000\\^\u0005\u0006\u0000\u0000]L\u0001\u0000\u0000"+
		"\u0000]O\u0001\u0000\u0000\u0000]R\u0001\u0000\u0000\u0000]U\u0001\u0000"+
		"\u0000\u0000]X\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`\r\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000\t\u0011\u0019\u001e"+
		")4?J]_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}