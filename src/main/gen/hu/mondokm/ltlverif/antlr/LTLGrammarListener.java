// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/LTLGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LTLGrammarParser}.
 */
public interface LTLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(LTLGrammarParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(LTLGrammarParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LTLGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LTLGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LTLGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LTLGrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LTLGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LTLGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#ltlExpr}.
	 * @param ctx the parse tree
	 */
	void enterLtlExpr(LTLGrammarParser.LtlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#ltlExpr}.
	 * @param ctx the parse tree
	 */
	void exitLtlExpr(LTLGrammarParser.LtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#ltlOp}.
	 * @param ctx the parse tree
	 */
	void enterLtlOp(LTLGrammarParser.LtlOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#ltlOp}.
	 * @param ctx the parse tree
	 */
	void exitLtlOp(LTLGrammarParser.LtlOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(LTLGrammarParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(LTLGrammarParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqOperator(LTLGrammarParser.EqOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqOperator(LTLGrammarParser.EqOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(LTLGrammarParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(LTLGrammarParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperator(LTLGrammarParser.RelationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperator(LTLGrammarParser.RelationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(LTLGrammarParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(LTLGrammarParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#boolLitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#boolLitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(LTLGrammarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(LTLGrammarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#intLitExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpr(LTLGrammarParser.IntLitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#intLitExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LTLGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LTLGrammarParser.VariableContext ctx);
}