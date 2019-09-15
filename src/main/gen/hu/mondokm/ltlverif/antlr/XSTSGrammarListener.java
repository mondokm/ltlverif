// Generated from /home/milan/programming/ltlverif/src/main/java/hu/mondokm/ltlverif/antlr/XSTSGrammar.g4 by ANTLR 4.7.2
package hu.mondokm.ltlverif.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XSTSGrammarParser}.
 */
public interface XSTSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#xsts}.
	 * @param ctx the parse tree
	 */
	void enterXsts(XSTSGrammarParser.XstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#xsts}.
	 * @param ctx the parse tree
	 */
	void exitXsts(XSTSGrammarParser.XstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(XSTSGrammarParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(XSTSGrammarParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#nonDetAction}.
	 * @param ctx the parse tree
	 */
	void enterNonDetAction(XSTSGrammarParser.NonDetActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#nonDetAction}.
	 * @param ctx the parse tree
	 */
	void exitNonDetAction(XSTSGrammarParser.NonDetActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#sequentialAction}.
	 * @param ctx the parse tree
	 */
	void enterSequentialAction(XSTSGrammarParser.SequentialActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#sequentialAction}.
	 * @param ctx the parse tree
	 */
	void exitSequentialAction(XSTSGrammarParser.SequentialActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#assumeAction}.
	 * @param ctx the parse tree
	 */
	void enterAssumeAction(XSTSGrammarParser.AssumeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#assumeAction}.
	 * @param ctx the parse tree
	 */
	void exitAssumeAction(XSTSGrammarParser.AssumeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#assignAction}.
	 * @param ctx the parse tree
	 */
	void enterAssignAction(XSTSGrammarParser.AssignActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#assignAction}.
	 * @param ctx the parse tree
	 */
	void exitAssignAction(XSTSGrammarParser.AssignActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplyExpression(XSTSGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#implyExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplyExpression(XSTSGrammarParser.ImplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(XSTSGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(XSTSGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(XSTSGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(XSTSGrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(XSTSGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(XSTSGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(XSTSGrammarParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(XSTSGrammarParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqOperator(XSTSGrammarParser.EqOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#eqOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqOperator(XSTSGrammarParser.EqOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(XSTSGrammarParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(XSTSGrammarParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperator(XSTSGrammarParser.RelationOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#relationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperator(XSTSGrammarParser.RelationOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(XSTSGrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(XSTSGrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(XSTSGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(XSTSGrammarParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(XSTSGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(XSTSGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(XSTSGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(XSTSGrammarParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(XSTSGrammarParser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#negExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(XSTSGrammarParser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(XSTSGrammarParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(XSTSGrammarParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(XSTSGrammarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(XSTSGrammarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#prime}.
	 * @param ctx the parse tree
	 */
	void enterPrime(XSTSGrammarParser.PrimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#prime}.
	 * @param ctx the parse tree
	 */
	void exitPrime(XSTSGrammarParser.PrimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(XSTSGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(XSTSGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(XSTSGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(XSTSGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(XSTSGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(XSTSGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(XSTSGrammarParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(XSTSGrammarParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(XSTSGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(XSTSGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#customType}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(XSTSGrammarParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#customType}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(XSTSGrammarParser.CustomTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(XSTSGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(XSTSGrammarParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSTSGrammarParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTypeLiteral(XSTSGrammarParser.TypeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSTSGrammarParser#typeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTypeLiteral(XSTSGrammarParser.TypeLiteralContext ctx);
}