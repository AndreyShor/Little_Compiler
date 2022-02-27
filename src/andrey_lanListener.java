// Generated from C:/Users/andre/Desktop/Projects/LC_assigment_1/src\andrey_lan.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link andrey_lanParser}.
 */
public interface andrey_lanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link andrey_lanParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(andrey_lanParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link andrey_lanParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(andrey_lanParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(andrey_lanParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(andrey_lanParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(andrey_lanParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(andrey_lanParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(andrey_lanParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link andrey_lanParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(andrey_lanParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(andrey_lanParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(andrey_lanParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(andrey_lanParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(andrey_lanParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(andrey_lanParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(andrey_lanParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(andrey_lanParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(andrey_lanParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(andrey_lanParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(andrey_lanParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(andrey_lanParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link andrey_lanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(andrey_lanParser.MulDivContext ctx);
}