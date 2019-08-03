package hu.mondokm.ltlverif.antlr;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.core.type.booltype.ImplyExpr;

import java.util.ArrayList;
import java.util.List;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.*;

public class APGeneratorVisitor extends LTLGrammarBaseVisitor<Expr<BoolType>> {

    @Override
    public Expr<BoolType> visitModel(LTLGrammarParser.ModelContext ctx) {
        return super.visitModel(ctx);
    }

    @Override
    public Expr<BoolType> visitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx) {
        super.visitImplyExpression(ctx);
        if(ctx.ops.size()>1){
            return Imply(visitOrExpr(ctx.ops.get(0)),visitOrExpr(ctx.ops.get(0)));
        }else return visitOrExpr(ctx.ops.get(0));
    }

    @Override
    public Expr<BoolType> visitOrExpr(LTLGrammarParser.OrExprContext ctx) {
        super.visitOrExpr(ctx);
        List<Expr<BoolType>> ops=new ArrayList<Expr<BoolType>>();
        for(LTLGrammarParser.AndExprContext child: ctx.ops){
            ops.add(visitAndExpr(child));
        }
        return Or(ops);
    }

    @Override
    public Expr<BoolType> visitAndExpr(LTLGrammarParser.AndExprContext ctx) {
        super.visitAndExpr(ctx);
        List<Expr<BoolType>> ops=new ArrayList<Expr<BoolType>>();
        for(LTLGrammarParser.NotExprContext child: ctx.ops){
            ops.add(visitNotExpr(child));
        }
        return And(ops);
    }

    @Override
    public Expr<BoolType> visitNotExpr(LTLGrammarParser.NotExprContext ctx) {
        return super.visitNotExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitLtlExpr(LTLGrammarParser.LtlExprContext ctx) {
        return super.visitLtlExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitLtlOp(LTLGrammarParser.LtlOpContext ctx) {
        return super.visitLtlOp(ctx);
    }

    @Override
    public Expr<BoolType> visitEqExpr(LTLGrammarParser.EqExprContext ctx) {
        return super.visitEqExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitEqOperator(LTLGrammarParser.EqOperatorContext ctx) {
        return super.visitEqOperator(ctx);
    }

    @Override
    public Expr<BoolType> visitRelationExpr(LTLGrammarParser.RelationExprContext ctx) {
        return super.visitRelationExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitRelationOperator(LTLGrammarParser.RelationOperatorContext ctx) {
        return super.visitRelationOperator(ctx);
    }

    @Override
    public Expr<BoolType> visitAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx) {
        return super.visitAdditiveExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx) {
        return super.visitAdditiveOperator(ctx);
    }

    @Override
    public Expr<BoolType> visitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx) {
        return super.visitMultiplicativeExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx) {
        return super.visitMultiplicativeOperator(ctx);
    }

    @Override
    public Expr<BoolType> visitNegExpr(LTLGrammarParser.NegExprContext ctx) {
        return super.visitNegExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx) {
        return super.visitPrimaryExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx) {
        return super.visitBoolLitExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitParenExpr(LTLGrammarParser.ParenExprContext ctx) {
        return super.visitParenExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx) {
        return super.visitIntLitExpr(ctx);
    }

    @Override
    public Expr<BoolType> visitVariable(LTLGrammarParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }
}
