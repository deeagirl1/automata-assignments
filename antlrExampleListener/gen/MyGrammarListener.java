// Generated from MyGrammar.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherExpression}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpression(MyGrammarParser.OtherExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherExpression}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpression(MyGrammarParser.OtherExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printAssignment}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintAssignment(MyGrammarParser.PrintAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printAssignment}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintAssignment(MyGrammarParser.PrintAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MyGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MyGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MyGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MyGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MyGrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MyGrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(MyGrammarParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(MyGrammarParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(MyGrammarParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(MyGrammarParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MyGrammarParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MyGrammarParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MyGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MyGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(MyGrammarParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(MyGrammarParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MyGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MyGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(MyGrammarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(MyGrammarParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(MyGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(MyGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMul(MyGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational(MyGrammarParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational(MyGrammarParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFact(MyGrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFact(MyGrammarParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(MyGrammarParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(MyGrammarParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MyGrammarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPow(MyGrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPow(MyGrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality(MyGrammarParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality(MyGrammarParser.EqualityContext ctx);
}