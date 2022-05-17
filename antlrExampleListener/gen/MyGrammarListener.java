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
	 * Enter a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyGrammarParser.StatContext ctx);
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
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MyGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MyGrammarParser.AddSubContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
}