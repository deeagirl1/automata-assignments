// Generated from Example2.g4 by ANTLR 4.10.1
package gen;
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
	 * Visit a parse tree produced by the {@code otherExpr}
	 * labeled alternative in {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherExpr(Example2Parser.OtherExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Example2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Example2Parser.PrintContext ctx);
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
	 * Visit a parse tree produced by {@link Example2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Example2Parser.VariableContext ctx);
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
	 * Visit a parse tree produced by the {@code MathExp}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExp(Example2Parser.MathExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link Example2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(Example2Parser.ValueBooleanContext ctx);
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