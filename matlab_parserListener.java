// Generated from matlab_parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link matlab_parserParser}.
 */
public interface matlab_parserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(matlab_parserParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(matlab_parserParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(matlab_parserParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(matlab_parserParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(matlab_parserParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(matlab_parserParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#elseifstatment}.
	 * @param ctx the parse tree
	 */
	void enterElseifstatment(matlab_parserParser.ElseifstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#elseifstatment}.
	 * @param ctx the parse tree
	 */
	void exitElseifstatment(matlab_parserParser.ElseifstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#elsestatment}.
	 * @param ctx the parse tree
	 */
	void enterElsestatment(matlab_parserParser.ElsestatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#elsestatment}.
	 * @param ctx the parse tree
	 */
	void exitElsestatment(matlab_parserParser.ElsestatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#ifstatment}.
	 * @param ctx the parse tree
	 */
	void enterIfstatment(matlab_parserParser.IfstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#ifstatment}.
	 * @param ctx the parse tree
	 */
	void exitIfstatment(matlab_parserParser.IfstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#forstatment}.
	 * @param ctx the parse tree
	 */
	void enterForstatment(matlab_parserParser.ForstatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#forstatment}.
	 * @param ctx the parse tree
	 */
	void exitForstatment(matlab_parserParser.ForstatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(matlab_parserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(matlab_parserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#relationalC}.
	 * @param ctx the parse tree
	 */
	void enterRelationalC(matlab_parserParser.RelationalCContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#relationalC}.
	 * @param ctx the parse tree
	 */
	void exitRelationalC(matlab_parserParser.RelationalCContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(matlab_parserParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(matlab_parserParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(matlab_parserParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(matlab_parserParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(matlab_parserParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(matlab_parserParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link matlab_parserParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(matlab_parserParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link matlab_parserParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(matlab_parserParser.ColContext ctx);
}