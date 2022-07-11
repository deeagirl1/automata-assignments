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
		IS_EQUAL=1, MUL=2, DIV=3, ADD=4, SUB=5, POW=6, FACT=7, PARANL=8, PARANR=9, 
		DOT=10, ADD_INCREMENT=11, SUB_INCREMENT=12, INCREMENT=13, DECREMENT=14, 
		OPEN_CURLY_BRACKET=15, CLOSE_CURLY_BRACKET=16, AND=17, OR=18, GREATER_OR_EQUAL=19, 
		SMALLER_OR_EQUAL=20, GREATHER_THAN=21, SMALLER_THAN=22, EQUAL=23, NOT_EQUAL=24, 
		IntType=25, BoolType=26, StringType=27, WHILE=28, COMMA=29, SEMICOLON=30, 
		IF=31, ELSE=32, FOR=33, VOID=34, RETURN=35, FUNCTION=36, Print=37, INT=38, 
		BOOLEAN=39, ID=40, STRING=41, COMMENT=42, WS=43;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_print_func = 2, RULE_variables = 3, 
		RULE_returnStat = 4, RULE_variables_type = 5, RULE_parameters_funcDec = 6, 
		RULE_parameters_funcCall = 7, RULE_function_declaration = 8, RULE_function_block = 9, 
		RULE_function_call = 10, RULE_if_statement = 11, RULE_while_statement = 12, 
		RULE_for_statement = 13, RULE_for_block = 14, RULE_condition_block = 15, 
		RULE_code_block = 16, RULE_string_variable = 17, RULE_bool_variable = 18, 
		RULE_int_variable = 19, RULE_expression = 20, RULE_mathExpression = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "print_func", "variables", "returnStat", "variables_type", 
			"parameters_funcDec", "parameters_funcCall", "function_declaration", 
			"function_block", "function_call", "if_statement", "while_statement", 
			"for_statement", "for_block", "condition_block", "code_block", "string_variable", 
			"bool_variable", "int_variable", "expression", "mathExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", 
			"'.'", "'+='", "'-='", "'++'", "'--'", "'{'", "'}'", "'and'", "'or'", 
			"'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'int'", "'bool'", "'string'", 
			"'while'", "','", "';'", "'if'", "'else'", "'for'", "'void'", "'return'", 
			"'function'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IS_EQUAL", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", "PARANL", 
			"PARANR", "DOT", "ADD_INCREMENT", "SUB_INCREMENT", "INCREMENT", "DECREMENT", 
			"OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "AND", "OR", "GREATER_OR_EQUAL", 
			"SMALLER_OR_EQUAL", "GREATHER_THAN", "SMALLER_THAN", "EQUAL", "NOT_EQUAL", 
			"IntType", "BoolType", "StringType", "WHILE", "COMMA", "SEMICOLON", "IF", 
			"ELSE", "FOR", "VOID", "RETURN", "FUNCTION", "Print", "INT", "BOOLEAN", 
			"ID", "STRING", "COMMENT", "WS"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << FUNCTION) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				print_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				returnStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				if_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				function_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				function_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				variables();
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

	public static class Print_funcContext extends ParserRuleContext {
		public Print_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_func; }
	 
		public Print_funcContext() { }
		public void copyFrom(Print_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintVarContext extends Print_funcContext {
		public Token op;
		public TerminalNode Print() { return getToken(Example2Parser.Print, 0); }
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public PrintVarContext(Print_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends Print_funcContext {
		public TerminalNode Print() { return getToken(Example2Parser.Print, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public PrintExprContext(Print_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_funcContext print_func() throws RecognitionException {
		Print_funcContext _localctx = new Print_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print_func);
		int _la;
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(Print);
				setState(64);
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
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(Print);
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

	public static class VariablesContext extends ParserRuleContext {
		public Int_variableContext int_variable() {
			return getRuleContext(Int_variableContext.class,0);
		}
		public Bool_variableContext bool_variable() {
			return getRuleContext(Bool_variableContext.class,0);
		}
		public String_variableContext string_variable() {
			return getRuleContext(String_variableContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				string_variable();
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Example2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(RETURN);
			setState(75);
			expression(0);
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

	public static class Variables_typeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(Example2Parser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(Example2Parser.BoolType, 0); }
		public TerminalNode StringType() { return getToken(Example2Parser.StringType, 0); }
		public Variables_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitVariables_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_typeContext variables_type() throws RecognitionException {
		Variables_typeContext _localctx = new Variables_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variables_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << StringType))) != 0)) ) {
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

	public static class Parameters_funcDecContext extends ParserRuleContext {
		public List<Variables_typeContext> variables_type() {
			return getRuleContexts(Variables_typeContext.class);
		}
		public Variables_typeContext variables_type(int i) {
			return getRuleContext(Variables_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(Example2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Example2Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public Parameters_funcDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_funcDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParameters_funcDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_funcDecContext parameters_funcDec() throws RecognitionException {
		Parameters_funcDecContext _localctx = new Parameters_funcDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << StringType))) != 0)) {
				{
				setState(79);
				variables_type();
				setState(80);
				match(ID);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(81);
					match(COMMA);
					setState(82);
					variables_type();
					setState(83);
					match(ID);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Parameters_funcCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Example2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Example2Parser.COMMA, i);
		}
		public Parameters_funcCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParameters_funcCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_funcCallContext parameters_funcCall() throws RecognitionException {
		Parameters_funcCallContext _localctx = new Parameters_funcCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(92);
				expression(0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					expression(0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Example2Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FUNCTION);
			setState(103);
			match(ID);
			setState(104);
			function_block();
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

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public Parameters_funcDecContext parameters_funcDec() {
			return getRuleContext(Parameters_funcDecContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PARANL);
			setState(107);
			parameters_funcDec();
			setState(108);
			match(PARANR);
			setState(109);
			code_block();
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public Parameters_funcCallContext parameters_funcCall() {
			return getRuleContext(Parameters_funcCallContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(PARANL);
			setState(113);
			parameters_funcCall();
			setState(114);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Example2Parser.IF, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(Example2Parser.ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			condition_block();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(118);
				match(ELSE);
				setState(119);
				code_block();
				}
				break;
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Example2Parser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WHILE);
			setState(123);
			condition_block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Example2Parser.FOR, 0); }
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR);
			setState(126);
			for_block();
			setState(127);
			code_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Example2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Example2Parser.SEMICOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFor_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PARANL);
			setState(130);
			variables();
			setState(131);
			match(SEMICOLON);
			setState(132);
			expression(0);
			setState(133);
			match(SEMICOLON);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134);
				expression(0);
				}
				break;
			case 2:
				{
				setState(135);
				variables();
				}
				break;
			}
			setState(138);
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PARANL);
			setState(141);
			expression(0);
			setState(142);
			match(PARANR);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				code_block();
				}
				break;
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Example2Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Example2Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_code_block);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(OPEN_CURLY_BRACKET);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << FUNCTION) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(147);
					statement();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case PARANL:
			case IntType:
			case BoolType:
			case StringType:
			case WHILE:
			case IF:
			case FOR:
			case RETURN:
			case FUNCTION:
			case Print:
			case INT:
			case BOOLEAN:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				statement();
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

	public static class String_variableContext extends ParserRuleContext {
		public String_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_variable; }
	 
		public String_variableContext() { }
		public void copyFrom(String_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringAssignValueContext extends String_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringAssignValueContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignContext extends String_variableContext {
		public TerminalNode StringType() { return getToken(Example2Parser.StringType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringAssignContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_variableContext string_variable() throws RecognitionException {
		String_variableContext _localctx = new String_variableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string_variable);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringType:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(StringType);
				setState(158);
				match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(159);
					match(IS_EQUAL);
					setState(160);
					expression(0);
					}
				}

				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(ID);
				setState(164);
				match(IS_EQUAL);
				setState(165);
				expression(0);
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

	public static class Bool_variableContext extends ParserRuleContext {
		public Bool_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_variable; }
	 
		public Bool_variableContext() { }
		public void copyFrom(Bool_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolAssignContext extends Bool_variableContext {
		public TerminalNode BoolType() { return getToken(Example2Parser.BoolType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolAssignContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAssignValueContext extends Bool_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolAssignValueContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_variableContext bool_variable() throws RecognitionException {
		Bool_variableContext _localctx = new Bool_variableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool_variable);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(BoolType);
				setState(169);
				match(ID);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(170);
					match(IS_EQUAL);
					setState(171);
					expression(0);
					}
				}

				}
				break;
			case ID:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(ID);
				setState(175);
				match(IS_EQUAL);
				setState(176);
				expression(0);
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

	public static class Int_variableContext extends ParserRuleContext {
		public Int_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_variable; }
	 
		public Int_variableContext() { }
		public void copyFrom(Int_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAssignContext extends Int_variableContext {
		public TerminalNode IntType() { return getToken(Example2Parser.IntType, 0); }
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementAndDecrementIntContext extends Int_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode ADD_INCREMENT() { return getToken(Example2Parser.ADD_INCREMENT, 0); }
		public TerminalNode SUB_INCREMENT() { return getToken(Example2Parser.SUB_INCREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(Example2Parser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(Example2Parser.DECREMENT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IncrementAndDecrementIntContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIncrementAndDecrementInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAssignValueContext extends Int_variableContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public TerminalNode IS_EQUAL() { return getToken(Example2Parser.IS_EQUAL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public IntAssignValueContext(Int_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIntAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_variableContext int_variable() throws RecognitionException {
		Int_variableContext _localctx = new Int_variableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_int_variable);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IntAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(IntType);
				setState(180);
				match(ID);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(181);
					match(IS_EQUAL);
					setState(182);
					mathExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(ID);
				setState(186);
				match(IS_EQUAL);
				setState(187);
				mathExpression(0);
				}
				break;
			case 3:
				_localctx = new IncrementAndDecrementIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(ID);
				setState(189);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_INCREMENT) | (1L << SUB_INCREMENT) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(190);
					mathExpression(0);
					}
					break;
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
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_OR_EQUAL() { return getToken(Example2Parser.GREATER_OR_EQUAL, 0); }
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(Example2Parser.SMALLER_OR_EQUAL, 0); }
		public TerminalNode GREATHER_THAN() { return getToken(Example2Parser.GREATHER_THAN, 0); }
		public TerminalNode SMALLER_THAN() { return getToken(Example2Parser.SMALLER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(Example2Parser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Example2Parser.NOT_EQUAL, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(Example2Parser.AND, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueBooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public ValueBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(Example2Parser.OR, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONExprContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FUNCTIONExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFUNCTIONExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathExpContext extends ExpressionContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public MathExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMathExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public ValueStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueString(this);
			else return visitor.visitChildren(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new MathExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				mathExpression(0);
				}
				break;
			case 3:
				{
				_localctx = new ValueBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				_localctx = new ValueStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_OR_EQUAL) | (1L << SMALLER_OR_EQUAL) | (1L << GREATHER_THAN) | (1L << SMALLER_THAN) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						match(AND);
						setState(207);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						match(OR);
						setState(210);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		public TerminalNode DIV() { return getToken(Example2Parser.DIV, 0); }
		public DivContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode ADD() { return getToken(Example2Parser.ADD, 0); }
		public AddContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SUB() { return getToken(Example2Parser.SUB, 0); }
		public SubContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends MathExpressionContext {
		public TerminalNode PARANL() { return getToken(Example2Parser.PARANL, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode PARANR() { return getToken(Example2Parser.PARANR, 0); }
		public ParensContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueVariableContext extends MathExpressionContext {
		public TerminalNode ID() { return getToken(Example2Parser.ID, 0); }
		public ValueVariableContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueVariable(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode MUL() { return getToken(Example2Parser.MUL, 0); }
		public MulContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONMathExprContext extends MathExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FUNCTIONMathExprContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFUNCTIONMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueNumberContext extends MathExpressionContext {
		public TerminalNode INT() { return getToken(Example2Parser.INT, 0); }
		public ValueNumberContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode POW() { return getToken(Example2Parser.POW, 0); }
		public PowContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactContext extends MathExpressionContext {
		public Token op;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode FACT() { return getToken(Example2Parser.FACT, 0); }
		public FactContext(MathExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONMathExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(217);
				function_call();
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(PARANL);
				setState(219);
				mathExpression(0);
				setState(220);
				match(PARANR);
				}
				break;
			case 3:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(226);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(227);
						((MulContext)_localctx).op = match(MUL);
						setState(228);
						mathExpression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(229);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(230);
						((DivContext)_localctx).op = match(DIV);
						setState(231);
						mathExpression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(232);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(233);
						((AddContext)_localctx).op = match(ADD);
						setState(234);
						mathExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(235);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(236);
						((SubContext)_localctx).op = match(SUB);
						setState(237);
						mathExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(238);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(239);
						((PowContext)_localctx).op = match(POW);
						setState(240);
						mathExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new FactContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(242);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 21:
			return mathExpression_sempred((MathExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mathExpression_sempred(MathExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006V\b\u0006"+
		"\n\u0006\f\u0006Y\t\u0006\u0003\u0006[\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007\u0003\u0007"+
		"e\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000by\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0089\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0091\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0095\b\u0010"+
		"\n\u0010\f\u0010\u0098\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u009c"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a2"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a7\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ad\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00b2\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b8\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00c0\b\u0013\u0003\u0013\u00c2\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c9\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00d4\b\u0014\n\u0014\f\u0014\u00d7\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00e1\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f4\b\u0015\n\u0015"+
		"\f\u0015\u00f7\t\u0015\u0001\u0015\u0000\u0002(*\u0016\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*\u0000\u0004\u0001\u0000&)\u0001\u0000\u0019\u001b\u0001\u0000\u000b"+
		"\u000e\u0001\u0000\u0013\u0018\u010e\u0000/\u0001\u0000\u0000\u0000\u0002"+
		"=\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000"+
		"\fZ\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010f\u0001"+
		"\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014o\u0001\u0000\u0000"+
		"\u0000\u0016t\u0001\u0000\u0000\u0000\u0018z\u0001\u0000\u0000\u0000\u001a"+
		"}\u0001\u0000\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000\u001e\u008c"+
		"\u0001\u0000\u0000\u0000 \u009b\u0001\u0000\u0000\u0000\"\u00a6\u0001"+
		"\u0000\u0000\u0000$\u00b1\u0001\u0000\u0000\u0000&\u00c1\u0001\u0000\u0000"+
		"\u0000(\u00c8\u0001\u0000\u0000\u0000*\u00e0\u0001\u0000\u0000\u0000,"+
		".\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0000\u0000\u00013\u0001"+
		"\u0001\u0000\u0000\u00004>\u0003\u0004\u0002\u00005>\u0003\u0018\f\u0000"+
		"6>\u0003\u001a\r\u00007>\u0003\b\u0004\u00008>\u0003\u0016\u000b\u0000"+
		"9>\u0003\u0010\b\u0000:>\u0003\u0014\n\u0000;>\u0003(\u0014\u0000<>\u0003"+
		"\u0006\u0003\u0000=4\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000"+
		"=6\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000=8\u0001\u0000\u0000"+
		"\u0000=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000"+
		"?@\u0005%\u0000\u0000@D\u0007\u0000\u0000\u0000AB\u0005%\u0000\u0000B"+
		"D\u0003*\u0015\u0000C?\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EI\u0003&\u0013\u0000FI\u0003$\u0012\u0000"+
		"GI\u0003\"\u0011\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HG\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005#\u0000"+
		"\u0000KL\u0003(\u0014\u0000L\t\u0001\u0000\u0000\u0000MN\u0007\u0001\u0000"+
		"\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0003\n\u0005\u0000PW\u0005(\u0000"+
		"\u0000QR\u0005\u001d\u0000\u0000RS\u0003\n\u0005\u0000ST\u0005(\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000ZO\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\r\u0001\u0000\u0000\u0000\\a\u0003(\u0014"+
		"\u0000]^\u0005\u001d\u0000\u0000^`\u0003(\u0014\u0000_]\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d\\\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000f\u0001\u0000\u0000"+
		"\u0000fg\u0005$\u0000\u0000gh\u0005(\u0000\u0000hi\u0003\u0012\t\u0000"+
		"i\u0011\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000kl\u0003\f\u0006"+
		"\u0000lm\u0005\t\u0000\u0000mn\u0003 \u0010\u0000n\u0013\u0001\u0000\u0000"+
		"\u0000op\u0005(\u0000\u0000pq\u0005\b\u0000\u0000qr\u0003\u000e\u0007"+
		"\u0000rs\u0005\t\u0000\u0000s\u0015\u0001\u0000\u0000\u0000tu\u0005\u001f"+
		"\u0000\u0000ux\u0003\u001e\u000f\u0000vw\u0005 \u0000\u0000wy\u0003 \u0010"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0017\u0001"+
		"\u0000\u0000\u0000z{\u0005\u001c\u0000\u0000{|\u0003\u001e\u000f\u0000"+
		"|\u0019\u0001\u0000\u0000\u0000}~\u0005!\u0000\u0000~\u007f\u0003\u001c"+
		"\u000e\u0000\u007f\u0080\u0003 \u0010\u0000\u0080\u001b\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0003\u0006\u0003\u0000"+
		"\u0083\u0084\u0005\u001e\u0000\u0000\u0084\u0085\u0003(\u0014\u0000\u0085"+
		"\u0088\u0005\u001e\u0000\u0000\u0086\u0089\u0003(\u0014\u0000\u0087\u0089"+
		"\u0003\u0006\u0003\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\t\u0000\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\b\u0000\u0000\u008d\u008e\u0003(\u0014\u0000\u008e\u0090\u0005\t\u0000"+
		"\u0000\u008f\u0091\u0003 \u0010\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000"+
		"\u0092\u0096\u0005\u000f\u0000\u0000\u0093\u0095\u0003\u0002\u0001\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0005\u0010\u0000\u0000\u009a\u009c\u0003\u0002\u0001\u0000"+
		"\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c!\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001b\u0000\u0000\u009e"+
		"\u00a1\u0005(\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a2"+
		"\u0003(\u0014\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a7\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"(\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000\u0000\u00a5\u00a7\u0003(\u0014"+
		"\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a7#\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001a\u0000\u0000"+
		"\u00a9\u00ac\u0005(\u0000\u0000\u00aa\u00ab\u0005\u0001\u0000\u0000\u00ab"+
		"\u00ad\u0003(\u0014\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b2\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005(\u0000\u0000\u00af\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b2\u0003"+
		"(\u0014\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2%\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0019\u0000"+
		"\u0000\u00b4\u00b7\u0005(\u0000\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000"+
		"\u00b6\u00b8\u0003*\u0015\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00c2\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005(\u0000\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00c2"+
		"\u0003*\u0015\u0000\u00bc\u00bd\u0005(\u0000\u0000\u00bd\u00bf\u0007\u0002"+
		"\u0000\u0000\u00be\u00c0\u0003*\u0015\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00b3\u0001\u0000\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c2\'\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0006\u0014\uffff\uffff\u0000\u00c4\u00c9\u0003\u0014\n\u0000"+
		"\u00c5\u00c9\u0003*\u0015\u0000\u00c6\u00c9\u0005\'\u0000\u0000\u00c7"+
		"\u00c9\u0005)\u0000\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00d5\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\n\u0003\u0000\u0000\u00cb\u00cc\u0007\u0003\u0000\u0000\u00cc\u00d4\u0003"+
		"(\u0014\u0004\u00cd\u00ce\n\u0002\u0000\u0000\u00ce\u00cf\u0005\u0011"+
		"\u0000\u0000\u00cf\u00d4\u0003(\u0014\u0003\u00d0\u00d1\n\u0001\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0012\u0000\u0000\u00d2\u00d4\u0003(\u0014\u0002"+
		"\u00d3\u00ca\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6)\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0006\u0015\uffff\uffff\u0000\u00d9\u00e1\u0003\u0014\n\u0000\u00da"+
		"\u00db\u0005\b\u0000\u0000\u00db\u00dc\u0003*\u0015\u0000\u00dc\u00dd"+
		"\u0005\t\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00e1\u0005"+
		"&\u0000\u0000\u00df\u00e1\u0005(\u0000\u0000\u00e0\u00d8\u0001\u0000\u0000"+
		"\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00f5\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\n\t\u0000\u0000\u00e3\u00e4\u0005\u0002\u0000\u0000"+
		"\u00e4\u00f4\u0003*\u0015\n\u00e5\u00e6\n\b\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0003\u0000\u0000\u00e7\u00f4\u0003*\u0015\t\u00e8\u00e9\n\u0007\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0004\u0000\u0000\u00ea\u00f4\u0003*\u0015\b"+
		"\u00eb\u00ec\n\u0006\u0000\u0000\u00ec\u00ed\u0005\u0005\u0000\u0000\u00ed"+
		"\u00f4\u0003*\u0015\u0007\u00ee\u00ef\n\u0005\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0006\u0000\u0000\u00f0\u00f4\u0003*\u0015\u0006\u00f1\u00f2\n"+
		"\u0004\u0000\u0000\u00f2\u00f4\u0005\u0007\u0000\u0000\u00f3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00f3\u00e5\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001"+
		"\u0000\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6+\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u001a/=CHWZadx\u0088\u0090\u0096\u009b\u00a1\u00a6\u00ac"+
		"\u00b1\u00b7\u00bf\u00c1\u00c8\u00d3\u00d5\u00e0\u00f3\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}