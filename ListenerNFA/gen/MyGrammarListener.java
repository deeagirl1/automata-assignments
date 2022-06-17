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
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#checkSatResponse}.
	 * @param ctx the parse tree
	 */
	void enterCheckSatResponse(MyGrammarParser.CheckSatResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#checkSatResponse}.
	 * @param ctx the parse tree
	 */
	void exitCheckSatResponse(MyGrammarParser.CheckSatResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#checkModelResponse}.
	 * @param ctx the parse tree
	 */
	void enterCheckModelResponse(MyGrammarParser.CheckModelResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#checkModelResponse}.
	 * @param ctx the parse tree
	 */
	void exitCheckModelResponse(MyGrammarParser.CheckModelResponseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementFunction}
	 * labeled alternative in {@link MyGrammarParser#declarFun}.
	 * @param ctx the parse tree
	 */
	void enterStatementFunction(MyGrammarParser.StatementFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementFunction}
	 * labeled alternative in {@link MyGrammarParser#declarFun}.
	 * @param ctx the parse tree
	 */
	void exitStatementFunction(MyGrammarParser.StatementFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MyGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MyGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(MyGrammarParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(MyGrammarParser.TypesContext ctx);
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
	 * Enter a parse tree produced by the {@code ValueBasicNumber}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueBasicNumber(MyGrammarParser.ValueBasicNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueBasicNumber}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueBasicNumber(MyGrammarParser.ValueBasicNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueString(MyGrammarParser.ValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueString}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueString(MyGrammarParser.ValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueComparisonExpresssion}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueComparisonExpresssion(MyGrammarParser.ValueComparisonExpresssionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueComparisonExpresssion}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueComparisonExpresssion(MyGrammarParser.ValueComparisonExpresssionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIfElse}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStatementIfElse(MyGrammarParser.StatementIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIfElse}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStatementIfElse(MyGrammarParser.StatementIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueLogicalExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueLogicalExpr(MyGrammarParser.ValueLogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueLogicalExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueLogicalExpr(MyGrammarParser.ValueLogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueLetExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueLetExpr(MyGrammarParser.ValueLetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueLetExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueLetExpr(MyGrammarParser.ValueLetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueMathExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueMathExpr(MyGrammarParser.ValueMathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueMathExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueMathExpr(MyGrammarParser.ValueMathExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueFunc_call}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValueFunc_call(MyGrammarParser.ValueFunc_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueFunc_call}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValueFunc_call(MyGrammarParser.ValueFunc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(MyGrammarParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(MyGrammarParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#iteExpr}.
	 * @param ctx the parse tree
	 */
	void enterIteExpr(MyGrammarParser.IteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#iteExpr}.
	 * @param ctx the parse tree
	 */
	void exitIteExpr(MyGrammarParser.IteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(MyGrammarParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(MyGrammarParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(MyGrammarParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(MyGrammarParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(MyGrammarParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(MyGrammarParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(MyGrammarParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(MyGrammarParser.MathExprContext ctx);
}