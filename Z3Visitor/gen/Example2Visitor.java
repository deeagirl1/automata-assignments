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
	 * Visit a parse tree produced by {@link Example2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Example2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#checkSatResponse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckSatResponse(Example2Parser.CheckSatResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#checkModelResponse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckModelResponse(Example2Parser.CheckModelResponseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modelR}
	 * labeled alternative in {@link Example2Parser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelR(Example2Parser.ModelRContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#ite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIte(Example2Parser.IteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#get_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_assignment(Example2Parser.Get_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example2Parser#global_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_declarations(Example2Parser.Global_declarationsContext ctx);
}