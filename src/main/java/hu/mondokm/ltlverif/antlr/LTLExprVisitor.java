package hu.mondokm.ltlverif.antlr;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarBaseVisitor;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarParser;

public class LTLExprVisitor extends LTLGrammarBaseVisitor<Boolean> {

    private static LTLExprVisitor instance=new LTLExprVisitor();

    private LTLExprVisitor(){};

    public static LTLExprVisitor getInstance(){
        return instance;
    }

    Map<ParserRuleContext,Boolean> ltl=new HashMap<ParserRuleContext, Boolean>();

    @Override
    public Boolean visitModel(LTLGrammarParser.ModelContext ctx) {
        return super.visitModel(ctx);
    }

    @Override
    public Boolean visitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for (LTLGrammarParser.OrExprContext op: ctx.ops){
            if(visitOrExpr(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitAndExpr(LTLGrammarParser.AndExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for (LTLGrammarParser.NotExprContext op: ctx.ops){
            if(visitNotExpr(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitNotExpr(LTLGrammarParser.NotExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for (LTLGrammarParser.NotExprContext op: ctx.ops){
            if(visitNotExpr(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        if(ctx.binaryLtlExpr()!=null && visitBinaryLtlExpr(ctx.binaryLtlExpr())) {
            ltl.put(ctx,true);
            return true;
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitBinaryLtlExpr(LTLGrammarParser.BinaryLtlExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        if(ctx.type!=null){
            ltl.put(ctx,true);
            return true;
        }
        boolean child=visitLtlExpr(ctx.ltlExpr());
        ltl.put(ctx,child);
        return child;
    }

    @Override
    public Boolean visitBinaryLtlOp(LTLGrammarParser.BinaryLtlOpContext ctx) {
        return false;
    }

    @Override
    public Boolean visitLtlExpr(LTLGrammarParser.LtlExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        if(ctx.type!=null){
            ltl.put(ctx,true);
            return true;
        }
        boolean child=visitEqExpr(ctx.eqExpr());
        ltl.put(ctx,child);
        return child;
    }

    @Override
    public Boolean visitLtlOp(LTLGrammarParser.LtlOpContext ctx) {
        return false;
    }

    @Override
    public Boolean visitEqExpr(LTLGrammarParser.EqExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for(LTLGrammarParser.RelationExprContext op:ctx.ops){
            if(visitRelationExpr(op)){
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitEqOperator(LTLGrammarParser.EqOperatorContext ctx) {
        return false;
    }

    @Override
    public Boolean visitRelationExpr(LTLGrammarParser.RelationExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for(LTLGrammarParser.AdditiveExprContext op:ctx.ops){
            if(visitAdditiveExpr(op)){
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitRelationOperator(LTLGrammarParser.RelationOperatorContext ctx) {
        return false;
    }

    @Override
    public Boolean visitAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for(LTLGrammarParser.MultiplicativeExprContext op:ctx.ops){
            if(visitMultiplicativeExpr(op)){
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx) {
        return false;
    }

    @Override
    public Boolean visitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for(LTLGrammarParser.NegExprContext op:ctx.ops){
            if(visitNegExpr(op)){
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx) {
        return false;
    }

    @Override
    public Boolean visitNegExpr(LTLGrammarParser.NegExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for (LTLGrammarParser.NegExprContext op: ctx.ops){
            if(visitNegExpr(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        if(ctx.primaryExpr()!=null && visitPrimaryExpr(ctx.primaryExpr())) {
            ltl.put(ctx,true);
            return true;
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        boolean child=false;
        if(ctx.boolLitExpr()!=null) child=visitBoolLitExpr(ctx.boolLitExpr());
        if(ctx.intLitExpr()!=null) child=visitIntLitExpr(ctx.intLitExpr());
        if(ctx.parenExpr()!=null) child=visitParenExpr(ctx.parenExpr());
        ltl.put(ctx,child);
        return child;
    }

    @Override
    public Boolean visitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx) {
        return false;
    }

    @Override
    public Boolean visitParenExpr(LTLGrammarParser.ParenExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for (LTLGrammarParser.ImplyExpressionContext op: ctx.ops){
            if(visitImplyExpression(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;
    }

    @Override
    public Boolean visitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx) {
        return false;
    }

    @Override
    public Boolean visitVariable(LTLGrammarParser.VariableContext ctx) {
        return false;
    }

    @Override
    public Boolean visitOrExpr(LTLGrammarParser.OrExprContext ctx) {
        if(ltl.get(ctx)!=null) return ltl.get(ctx);
        for(LTLGrammarParser.AndExprContext op:ctx.ops){
            if(visitAndExpr(op)) {
                ltl.put(ctx,true);
                return true;
            }
        }
        ltl.put(ctx,false);
        return false;

    }

}
