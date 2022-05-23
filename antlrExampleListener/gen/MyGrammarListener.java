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
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOtherExpr(MyGrammarParser.OtherExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherExpr}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOtherExpr(MyGrammarParser.OtherExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#value_type}.
	 * @param ctx the parse tree
	 */
	void enterValue_type(MyGrammarParser.Value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#value_type}.
	 * @param ctx the parse tree
	 */
	void exitValue_type(MyGrammarParser.Value_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueVariable(MyGrammarParser.ValueVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueVariable}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueVariable(MyGrammarParser.ValueVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueBoolean(MyGrammarParser.ValueBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBoolean}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueBoolean(MyGrammarParser.ValueBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(MyGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueNumber(MyGrammarParser.ValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueNumber}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueNumber(MyGrammarParser.ValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(MyGrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(MyGrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFact(MyGrammarParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Fact}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFact(MyGrammarParser.FactContext ctx);
}