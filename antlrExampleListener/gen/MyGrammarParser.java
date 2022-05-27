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
		RULE_bool_variable_assignment = 4, RULE_int_variable_assignment = 5, RULE_expression = 6, 
		RULE_mathExpression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "statement", "variable_declaration", "string_variable_assignment", 
			"bool_variable_assignment", "int_variable_assignment", "expression", 
			"mathExpression"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				statement();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0) );
			setState(21);
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
	public static class PrintVarContext extends StatementContext {
		public Token op;
		public TerminalNode Print() { return getToken(MyGrammarParser.Print, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MyGrammarParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public PrintVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrintVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrintVar(this);
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
		public TerminalNode Print() { return getToken(MyGrammarParser.Print, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
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
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new OtherExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				expression();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				variable_declaration();
				}
				break;
			case 3:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(Print);
				setState(26);
				((PrintVarContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) ) {
					((PrintVarContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(Print);
				setState(28);
				mathExpression(0);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				int_variable_assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				bool_variable_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StringDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(StringType);
				setState(37);
				match(ID);
				}
				break;
			case 2:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(StringType);
				setState(39);
				match(ID);
				setState(40);
				match(Equals);
				setState(41);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(ID);
				setState(43);
				match(Equals);
				setState(44);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(BoolType);
				setState(48);
				match(ID);
				}
				break;
			case 2:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(BoolType);
				setState(50);
				match(ID);
				setState(51);
				match(Equals);
				setState(52);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(ID);
				setState(54);
				match(Equals);
				setState(55);
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
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
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
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(IntType);
				setState(59);
				match(ID);
				}
				break;
			case 2:
				_localctx = new IntAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(IntType);
				setState(61);
				match(ID);
				setState(62);
				match(Equals);
				setState(63);
				mathExpression(0);
				}
				break;
			case 3:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(ID);
				setState(65);
				match(Equals);
				setState(66);
				mathExpression(0);
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
	public static class MathExpContext extends ExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MathExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMathExp(this);
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

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
			case INT:
			case ID:
				_localctx = new MathExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				mathExpression(0);
				}
				break;
			case BOOLEAN:
				_localctx = new ValueBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new ValueStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(STRING);
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

	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	 
		public MathExpressionContext() { }
		public void copyFrom(MathExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public DivContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDiv(this);
		}
	}
	public static class AddContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public AddContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public SubContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSub(this);
		}
	}
	public static class ParensContext extends MathExpressionContext {
		public TerminalNode PARANL() { return getToken(MyGrammarParser.PARANL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(MyGrammarParser.PARANR, 0); }
		public ParensContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitParens(this);
		}
	}
	public static class ValueVariableContext extends MathExpressionContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueVariableContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueVariable(this);
		}
	}
	public static class MulContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MyGrammarParser.MUL, 0); }
		public MulContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMul(this);
		}
	}
	public static class ValueNumberContext extends MathExpressionContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public ValueNumberContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueNumber(this);
		}
	}
	public static class PowContext extends MathExpressionContext {
		public Token op;
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(MyGrammarParser.POW, 0); }
		public PowContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPow(this);
		}
	}
	public static class FactContext extends MathExpressionContext {
		public Token op;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(MyGrammarParser.FACT, 0); }
		public FactContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFact(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		return mathExpression(0);
	}

	private MathExpressionContext mathExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, _parentState);
		MathExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(PARANL);
				setState(76);
				mathExpression(0);
				setState(77);
				match(PARANR);
				}
				break;
			case INT:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(83);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(84);
						((MulContext)_localctx).op = match(MUL);
						setState(85);
						mathExpression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(86);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(87);
						((DivContext)_localctx).op = match(DIV);
						setState(88);
						mathExpression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(89);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(90);
						((AddContext)_localctx).op = match(ADD);
						setState(91);
						mathExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(92);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(93);
						((SubContext)_localctx).op = match(SUB);
						setState(94);
						mathExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(95);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(96);
						((PowContext)_localctx).op = match(POW);
						setState(97);
						mathExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new FactContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(98);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(99);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(104);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		".\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00049\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"R\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007e\b\u0007\n\u0007\f\u0007h\t\u0007\u0001\u0007\u0000\u0001"+
		"\u000e\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u0012"+
		"\u0015w\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000"+
		"\b8\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fH\u0001\u0000"+
		"\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001"+
		"\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000"+
		"\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u001e\u0003\f\u0006\u0000"+
		"\u0018\u001e\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0011\u0000\u0000"+
		"\u001a\u001e\u0007\u0000\u0000\u0000\u001b\u001c\u0005\u0011\u0000\u0000"+
		"\u001c\u001e\u0003\u000e\u0007\u0000\u001d\u0017\u0001\u0000\u0000\u0000"+
		"\u001d\u0018\u0001\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000"+
		"\u001f#\u0003\n\u0005\u0000 #\u0003\b\u0004\u0000!#\u0003\u0006\u0003"+
		"\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001"+
		"\u0000\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0005\f\u0000\u0000"+
		"%.\u0005\u0014\u0000\u0000&\'\u0005\f\u0000\u0000\'(\u0005\u0014\u0000"+
		"\u0000()\u0005\t\u0000\u0000).\u0005\u0015\u0000\u0000*+\u0005\u0014\u0000"+
		"\u0000+,\u0005\t\u0000\u0000,.\u0005\u0015\u0000\u0000-$\u0001\u0000\u0000"+
		"\u0000-&\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.\u0007\u0001"+
		"\u0000\u0000\u0000/0\u0005\u000b\u0000\u000009\u0005\u0014\u0000\u0000"+
		"12\u0005\u000b\u0000\u000023\u0005\u0014\u0000\u000034\u0005\t\u0000\u0000"+
		"49\u0005\u0013\u0000\u000056\u0005\u0014\u0000\u000067\u0005\t\u0000\u0000"+
		"79\u0005\u0013\u0000\u00008/\u0001\u0000\u0000\u000081\u0001\u0000\u0000"+
		"\u000085\u0001\u0000\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\n"+
		"\u0000\u0000;D\u0005\u0014\u0000\u0000<=\u0005\n\u0000\u0000=>\u0005\u0014"+
		"\u0000\u0000>?\u0005\t\u0000\u0000?D\u0003\u000e\u0007\u0000@A\u0005\u0014"+
		"\u0000\u0000AB\u0005\t\u0000\u0000BD\u0003\u000e\u0007\u0000C:\u0001\u0000"+
		"\u0000\u0000C<\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000D\u000b"+
		"\u0001\u0000\u0000\u0000EI\u0003\u000e\u0007\u0000FI\u0005\u0013\u0000"+
		"\u0000GI\u0005\u0015\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000I\r\u0001\u0000\u0000\u0000JK\u0006"+
		"\u0007\uffff\uffff\u0000KL\u0005\u0007\u0000\u0000LM\u0003\u000e\u0007"+
		"\u0000MN\u0005\b\u0000\u0000NR\u0001\u0000\u0000\u0000OR\u0005\u0012\u0000"+
		"\u0000PR\u0005\u0014\u0000\u0000QJ\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000Rf\u0001\u0000\u0000\u0000ST\n\t"+
		"\u0000\u0000TU\u0005\u0001\u0000\u0000Ue\u0003\u000e\u0007\nVW\n\b\u0000"+
		"\u0000WX\u0005\u0002\u0000\u0000Xe\u0003\u000e\u0007\tYZ\n\u0007\u0000"+
		"\u0000Z[\u0005\u0003\u0000\u0000[e\u0003\u000e\u0007\b\\]\n\u0006\u0000"+
		"\u0000]^\u0005\u0004\u0000\u0000^e\u0003\u000e\u0007\u0007_`\n\u0005\u0000"+
		"\u0000`a\u0005\u0005\u0000\u0000ae\u0003\u000e\u0007\u0006bc\n\u0004\u0000"+
		"\u0000ce\u0005\u0006\u0000\u0000dS\u0001\u0000\u0000\u0000dV\u0001\u0000"+
		"\u0000\u0000dY\u0001\u0000\u0000\u0000d\\\u0001\u0000\u0000\u0000d_\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000f\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000\n\u0013\u001d\"-8CHQdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}