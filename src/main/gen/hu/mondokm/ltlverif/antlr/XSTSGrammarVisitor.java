// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/XSTSGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XSTSGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XSTSGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#xsts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXsts(XSTSGrammarParser.XstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(XSTSGrammarParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#nonDetAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDetAction(XSTSGrammarParser.NonDetActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#sequentialAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialAction(XSTSGrammarParser.SequentialActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#assumeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssumeAction(XSTSGrammarParser.AssumeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#assignAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAction(XSTSGrammarParser.AssignActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplyExpression(XSTSGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(XSTSGrammarParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(XSTSGrammarParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(XSTSGrammarParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(XSTSGrammarParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOperator(XSTSGrammarParser.EqOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(XSTSGrammarParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperator(XSTSGrammarParser.RelationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(XSTSGrammarParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(XSTSGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(XSTSGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(XSTSGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(XSTSGrammarParser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(XSTSGrammarParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(XSTSGrammarParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrime(XSTSGrammarParser.PrimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(XSTSGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(XSTSGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(XSTSGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(XSTSGrammarParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(XSTSGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#customType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(XSTSGrammarParser.CustomTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(XSTSGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSTSGrammarParser#typeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLiteral(XSTSGrammarParser.TypeLiteralContext ctx);
}