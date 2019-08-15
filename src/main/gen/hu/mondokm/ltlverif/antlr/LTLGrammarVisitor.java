// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/LTLGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LTLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LTLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(LTLGrammarParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LTLGrammarParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LTLGrammarParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(LTLGrammarParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#binaryLtlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLtlExpr(LTLGrammarParser.BinaryLtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#binaryLtlOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLtlOp(LTLGrammarParser.BinaryLtlOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#ltlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlExpr(LTLGrammarParser.LtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#ltlOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtlOp(LTLGrammarParser.LtlOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(LTLGrammarParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOperator(LTLGrammarParser.EqOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(LTLGrammarParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperator(LTLGrammarParser.RelationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(LTLGrammarParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#boolLitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(LTLGrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#intLitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LTLGrammarParser.VariableContext ctx);
}