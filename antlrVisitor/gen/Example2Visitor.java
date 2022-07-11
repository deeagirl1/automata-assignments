// Generated from Example2.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example2Parser#start2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart2(Example2Parser.Start2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Example2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVar}
	 * labeled alternative in {@link Example2Parser#print_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(Example2Parser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link Example2Parser#print_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(Example2Parser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Example2Parser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(Example2Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#variables_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_type(Example2Parser.Variables_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#parameters_funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_funcDec(Example2Parser.Parameters_funcDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#parameters_funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_funcCall(Example2Parser.Parameters_funcCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(Example2Parser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(Example2Parser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(Example2Parser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Example2Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(Example2Parser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(Example2Parser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(Example2Parser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssign}
	 * labeled alternative in {@link Example2Parser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssign(Example2Parser.StringAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAssignValue}
	 * labeled alternative in {@link Example2Parser#string_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignValue(Example2Parser.StringAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssign}
	 * labeled alternative in {@link Example2Parser#bool_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssign(Example2Parser.BoolAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolAssignValue}
	 * labeled alternative in {@link Example2Parser#bool_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAssignValue(Example2Parser.BoolAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssign}
	 * labeled alternative in {@link Example2Parser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssign(Example2Parser.IntAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAssignValue}
	 * labeled alternative in {@link Example2Parser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignValue(Example2Parser.IntAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementAndDecrementInt}
	 * labeled alternative in {@link Example2Parser#int_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementAndDecrementInt(Example2Parser.IncrementAndDecrementIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(Example2Parser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Example2Parser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(Example2Parser.ValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(Example2Parser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONExpr}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONExpr(Example2Parser.FUNCTIONExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExp(Example2Parser.MathExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueString(Example2Parser.ValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(Example2Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Example2Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(Example2Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(Example2Parser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariable(Example2Parser.ValueVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(Example2Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONMathExpr}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONMathExpr(Example2Parser.FUNCTIONMathExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(Example2Parser.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(Example2Parser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link Example2Parser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(Example2Parser.FactContext ctx);
}