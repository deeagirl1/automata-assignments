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
	 * Enter a parse tree produced by the {@code otherExpr}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpr(MyGrammarParser.OtherExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherExpr}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpr(MyGrammarParser.OtherExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(MyGrammarParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(MyGrammarParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MyGrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MyGrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDeclaration}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(MyGrammarParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDeclaration}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(MyGrammarParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssign}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStringAssign(MyGrammarParser.StringAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssign}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStringAssign(MyGrammarParser.StringAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAssignValue}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignValue(MyGrammarParser.StringAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAssignValue}
	 * labeled alternative in {@link MyGrammarParser#string_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignValue(MyGrammarParser.StringAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDeclaration}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(MyGrammarParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDeclaration}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(MyGrammarParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssign(MyGrammarParser.BoolAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssign(MyGrammarParser.BoolAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolAssignValue}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignValue(MyGrammarParser.BoolAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolAssignValue}
	 * labeled alternative in {@link MyGrammarParser#bool_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignValue(MyGrammarParser.BoolAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(MyGrammarParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclaration}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(MyGrammarParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAssign}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssign(MyGrammarParser.IntAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAssign}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssign(MyGrammarParser.IntAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAssignValue}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignValue(MyGrammarParser.IntAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAssignValue}
	 * labeled alternative in {@link MyGrammarParser#int_variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignValue(MyGrammarParser.IntAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(MyGrammarParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(MyGrammarParser.MathExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueBoolean(MyGrammarParser.ValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueBoolean(MyGrammarParser.ValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueString(MyGrammarParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueString(MyGrammarParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(MyGrammarParser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(MyGrammarParser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMul(MyGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueNumber(MyGrammarParser.ValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueNumber(MyGrammarParser.ValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterPow(MyGrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitPow(MyGrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterFact(MyGrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitFact(MyGrammarParser.FactContext ctx);
}