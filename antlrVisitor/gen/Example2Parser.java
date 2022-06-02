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
		NEWLINE=1, IS_EQUAL=2, MUL=3, DIV=4, ADD=5, SUB=6, POW=7, FACT=8, PARANL=9, 
		PARANR=10, DOT=11, ADD_INCREMENT=12, SUB_INCREMENT=13, INCREMENT=14, DECREMENT=15, 
		OPEN_CURLY_BRACKET=16, CLOSE_CURLY_BRACKET=17, AND=18, OR=19, GREATER_OR_EQUAL=20, 
		SMALLER_OR_EQUAL=21, GREATHER_THAN=22, SMALLER_THAN=23, EQUAL=24, NOT_EQUAL=25, 
		IntType=26, BoolType=27, StringType=28, WHILE=29, COMMA=30, SEMICOLON=31, 
		IF=32, ELSE=33, FOR=34, Print=35, INT=36, BOOLEAN=37, ID=38, STRING=39, 
		COMMENT=40, WS=41;
	public static final int
		RULE_start2 = 0, RULE_statement = 1, RULE_print_func = 2, RULE_value = 3, 
		RULE_if_statement = 4, RULE_while_statement = 5, RULE_condition_block = 6, 
		RULE_code_block = 7, RULE_string_variable = 8, RULE_bool_variable = 9, 
		RULE_int_variable = 10, RULE_expression = 11, RULE_mathExpression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start2", "statement", "print_func", "value", "if_statement", "while_statement", 
			"condition_block", "code_block", "string_variable", "bool_variable", 
			"int_variable", "expression", "mathExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'('", "')'", 
			"'.'", "'+='", "'-='", "'++'", "'--'", "'{'", "'}'", "'and'", "'or'", 
			"'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'int'", "'bool'", "'string'", 
			"'while'", "','", "';'", "'if'", "'else'", "'for'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "IS_EQUAL", "MUL", "DIV", "ADD", "SUB", "POW", "FACT", 
			"PARANL", "PARANR", "DOT", "ADD_INCREMENT", "SUB_INCREMENT", "INCREMENT", 
			"DECREMENT", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "AND", "OR", 
			"GREATER_OR_EQUAL", "SMALLER_OR_EQUAL", "GREATHER_THAN", "SMALLER_THAN", 
			"EQUAL", "NOT_EQUAL", "IntType", "BoolType", "StringType", "WHILE", "COMMA", 
			"SEMICOLON", "IF", "ELSE", "FOR", "Print", "INT", "BOOLEAN", "ID", "STRING", 
			"COMMENT", "WS"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Example2Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Example2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Example2Parser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					match(NEWLINE);
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
			statement();
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(33);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(36); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(38);
					statement();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44);
				match(NEWLINE);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatementContext {
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewLineContext extends StatementContext {
		public TerminalNode NEWLINE() { return getToken(Example2Parser.NEWLINE, 0); }
		public NewLineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statContext extends StatementContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public While_statContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OtherExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitOtherExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statContext extends StatementContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_statContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new OtherExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				expression(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				value();
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				print_func();
				}
				break;
			case 4:
				_localctx = new While_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				while_statement();
				}
				break;
			case 5:
				_localctx = new If_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				if_statement();
				}
				break;
			case 6:
				_localctx = new NewLineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(NEWLINE);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(Print);
				setState(61);
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
				setState(62);
				match(Print);
				setState(63);
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

	public static class ValueContext extends ParserRuleContext {
		public Int_variableContext int_variable() {
			return getRuleContext(Int_variableContext.class,0);
		}
		public Bool_variableContext bool_variable() {
			return getRuleContext(Bool_variableContext.class,0);
		}
		public String_variableContext string_variable() {
			return getRuleContext(String_variableContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				int_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				bool_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(Example2Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(Example2Parser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(Example2Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(Example2Parser.ELSE, i);
		}
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
		enterRule(_localctx, 8, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IF);
			setState(72);
			condition_block();
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(ELSE);
					setState(74);
					match(IF);
					setState(75);
					condition_block();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(81);
				match(ELSE);
				setState(82);
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
		enterRule(_localctx, 10, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
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
		enterRule(_localctx, 12, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PARANL);
			setState(89);
			expression(0);
			setState(90);
			match(PARANR);
			setState(91);
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(Example2Parser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(Example2Parser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Example2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Example2Parser.NEWLINE, i);
		}
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
		enterRule(_localctx, 14, RULE_code_block);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(93);
					match(NEWLINE);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(OPEN_CURLY_BRACKET);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(100);
						match(NEWLINE);
						}
						}
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << PARANL) | (1L << IntType) | (1L << BoolType) | (1L << StringType) | (1L << WHILE) | (1L << IF) | (1L << Print) | (1L << INT) | (1L << BOOLEAN) | (1L << ID) | (1L << STRING))) != 0)) {
						{
						{
						setState(106);
						statement();
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(114);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(115);
					match(NEWLINE);
					}
					break;
				}
				setState(118);
				statement();
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
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
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
		public TerminalNode STRING() { return getToken(Example2Parser.STRING, 0); }
		public StringAssignContext(String_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitStringAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_variableContext string_variable() throws RecognitionException {
		String_variableContext _localctx = new String_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_variable);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringType:
				_localctx = new StringAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(StringType);
				setState(122);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(123);
					match(IS_EQUAL);
					setState(124);
					match(STRING);
					}
				}

				}
				break;
			case ID:
				_localctx = new StringAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				setState(128);
				match(IS_EQUAL);
				setState(129);
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
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
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
		public TerminalNode BOOLEAN() { return getToken(Example2Parser.BOOLEAN, 0); }
		public BoolAssignValueContext(Bool_variableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example2Visitor ) return ((Example2Visitor<? extends T>)visitor).visitBoolAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_variableContext bool_variable() throws RecognitionException {
		Bool_variableContext _localctx = new Bool_variableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_variable);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				_localctx = new BoolAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(BoolType);
				setState(133);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(134);
					match(IS_EQUAL);
					setState(135);
					match(BOOLEAN);
					}
				}

				}
				break;
			case ID:
				_localctx = new BoolAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ID);
				setState(139);
				match(IS_EQUAL);
				setState(140);
				match(BOOLEAN);
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
		enterRule(_localctx, 20, RULE_int_variable);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new IntAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(IntType);
				setState(144);
				match(ID);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS_EQUAL) {
					{
					setState(145);
					match(IS_EQUAL);
					setState(146);
					mathExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new IntAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				setState(150);
				match(IS_EQUAL);
				setState(151);
				mathExpression(0);
				}
				break;
			case 3:
				_localctx = new IncrementAndDecrementIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(ID);
				setState(153);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_INCREMENT) | (1L << SUB_INCREMENT) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(154);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
			case INT:
			case ID:
				{
				_localctx = new MathExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				mathExpression(0);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ValueBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				_localctx = new ValueStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_OR_EQUAL) | (1L << SMALLER_OR_EQUAL) | (1L << GREATHER_THAN) | (1L << SMALLER_THAN) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						match(AND);
						setState(170);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(172);
						match(OR);
						setState(173);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_mathExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARANL:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				match(PARANL);
				setState(181);
				mathExpression(0);
				setState(182);
				match(PARANR);
				}
				break;
			case INT:
				{
				_localctx = new ValueNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ValueVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(188);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(189);
						((MulContext)_localctx).op = match(MUL);
						setState(190);
						mathExpression(10);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						((DivContext)_localctx).op = match(DIV);
						setState(193);
						mathExpression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(194);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(195);
						((AddContext)_localctx).op = match(ADD);
						setState(196);
						mathExpression(8);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						((SubContext)_localctx).op = match(SUB);
						setState(199);
						mathExpression(7);
						}
						break;
					case 5:
						{
						_localctx = new PowContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						((PowContext)_localctx).op = match(POW);
						setState(202);
						mathExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new FactContext(new MathExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpression);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						((FactContext)_localctx).op = match(FACT);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
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
		"\u0004\u0001)\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"F\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004T\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007"+
		"_\b\u0007\n\u0007\f\u0007b\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"f\b\u0007\n\u0007\f\u0007i\t\u0007\u0001\u0007\u0005\u0007l\b\u0007\n"+
		"\u0007\f\u0007o\t\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007u\b\u0007\u0001\u0007\u0003\u0007x\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b~\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u008e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0094\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0003\n\u009e"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a4"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00af\b\u000b\n"+
		"\u000b\f\u000b\u00b2\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00bb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1\t\f\u0001\f\u0000\u0002"+
		"\u0016\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0003\u0001\u0000$\'\u0001\u0000\f\u000f\u0001\u0000\u0014"+
		"\u0019\u00ee\u0000\u001d\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\b"+
		"G\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000"+
		"\u0000\u000ew\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000\u0000\u0000"+
		"\u0012\u008d\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000"+
		"\u0016\u00a3\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0005\u0001\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 )\u0003\u0002\u0001\u0000!#\u0005\u0001"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'\"\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*/\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0005\u0001\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000023\u0005\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u00004;\u0003"+
		"\u0016\u000b\u00005;\u0003\u0006\u0003\u00006;\u0003\u0004\u0002\u0000"+
		"7;\u0003\n\u0005\u00008;\u0003\b\u0004\u00009;\u0005\u0001\u0000\u0000"+
		":4\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000"+
		"\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0005#\u0000\u0000=A\u0007"+
		"\u0000\u0000\u0000>?\u0005#\u0000\u0000?A\u0003\u0018\f\u0000@<\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000BF\u0003\u0014\n\u0000CF\u0003\u0012\t\u0000DF\u0003\u0010\b\u0000"+
		"EB\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005 \u0000\u0000HN\u0003\f\u0006"+
		"\u0000IJ\u0005!\u0000\u0000JK\u0005 \u0000\u0000KM\u0003\f\u0006\u0000"+
		"LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OS\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000QR\u0005!\u0000\u0000RT\u0003\u000e\u0007\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005"+
		"\u001d\u0000\u0000VW\u0003\f\u0006\u0000W\u000b\u0001\u0000\u0000\u0000"+
		"XY\u0005\t\u0000\u0000YZ\u0003\u0016\u000b\u0000Z[\u0005\n\u0000\u0000"+
		"[\\\u0003\u000e\u0007\u0000\\\r\u0001\u0000\u0000\u0000]_\u0005\u0001"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cp\u0005\u0010\u0000\u0000df\u0005\u0001\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hq\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pg\u0001\u0000"+
		"\u0000\u0000pm\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rx\u0005"+
		"\u0011\u0000\u0000su\u0005\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0003\u0002\u0001"+
		"\u0000w`\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000x\u000f\u0001"+
		"\u0000\u0000\u0000yz\u0005\u001c\u0000\u0000z}\u0005&\u0000\u0000{|\u0005"+
		"\u0002\u0000\u0000|~\u0005\'\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0083\u0001\u0000\u0000\u0000\u007f\u0080\u0005&\u0000"+
		"\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0083\u0005\'\u0000\u0000"+
		"\u0082y\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083"+
		"\u0011\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001b\u0000\u0000\u0085"+
		"\u0088\u0005&\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u0089"+
		"\u0005%\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u008e\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"&\u0000\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u008e\u0005%\u0000"+
		"\u0000\u008d\u0084\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008e\u0013\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001a\u0000"+
		"\u0000\u0090\u0093\u0005&\u0000\u0000\u0091\u0092\u0005\u0002\u0000\u0000"+
		"\u0092\u0094\u0003\u0018\f\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u009e\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005&\u0000\u0000\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u009e"+
		"\u0003\u0018\f\u0000\u0098\u0099\u0005&\u0000\u0000\u0099\u009b\u0007"+
		"\u0001\u0000\u0000\u009a\u009c\u0003\u0018\f\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u008f\u0001\u0000\u0000\u0000\u009d\u0095\u0001\u0000"+
		"\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009e\u0015\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0006\u000b\uffff\uffff\u0000\u00a0\u00a4\u0003"+
		"\u0018\f\u0000\u00a1\u00a4\u0005%\u0000\u0000\u00a2\u00a4\u0005\'\u0000"+
		"\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00b0\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\n\u0003\u0000\u0000\u00a6\u00a7\u0007\u0002\u0000\u0000"+
		"\u00a7\u00af\u0003\u0016\u000b\u0004\u00a8\u00a9\n\u0002\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0012\u0000\u0000\u00aa\u00af\u0003\u0016\u000b\u0003\u00ab"+
		"\u00ac\n\u0001\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad\u00af"+
		"\u0003\u0016\u000b\u0002\u00ae\u00a5\u0001\u0000\u0000\u0000\u00ae\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00af\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\f\uffff\uffff\u0000\u00b4\u00b5"+
		"\u0005\t\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000\u00b6\u00b7\u0005"+
		"\n\u0000\u0000\u00b7\u00bb\u0001\u0000\u0000\u0000\u00b8\u00bb\u0005$"+
		"\u0000\u0000\u00b9\u00bb\u0005&\u0000\u0000\u00ba\u00b3\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00cf\u0001\u0000\u0000\u0000\u00bc\u00bd\n\t\u0000\u0000"+
		"\u00bd\u00be\u0005\u0003\u0000\u0000\u00be\u00ce\u0003\u0018\f\n\u00bf"+
		"\u00c0\n\b\u0000\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00ce"+
		"\u0003\u0018\f\t\u00c2\u00c3\n\u0007\u0000\u0000\u00c3\u00c4\u0005\u0005"+
		"\u0000\u0000\u00c4\u00ce\u0003\u0018\f\b\u00c5\u00c6\n\u0006\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0006\u0000\u0000\u00c7\u00ce\u0003\u0018\f\u0007\u00c8"+
		"\u00c9\n\u0005\u0000\u0000\u00c9\u00ca\u0005\u0007\u0000\u0000\u00ca\u00ce"+
		"\u0003\u0018\f\u0006\u00cb\u00cc\n\u0004\u0000\u0000\u00cc\u00ce\u0005"+
		"\b\u0000\u0000\u00cd\u00bc\u0001\u0000\u0000\u0000\u00cd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c2\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u0019\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u001c\u001d$)/:@ENS`"+
		"gmptw}\u0082\u0088\u008d\u0093\u009b\u009d\u00a3\u00ae\u00b0\u00ba\u00cd"+
		"\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}