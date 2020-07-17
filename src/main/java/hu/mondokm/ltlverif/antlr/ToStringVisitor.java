package hu.mondokm.ltlverif.antlr;

import java.util.HashMap;
import java.util.Map;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarBaseVisitor;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarParser;

public class ToStringVisitor extends LTLGrammarBaseVisitor<String> {

    Map<String,Expr<BoolType>> aps=new HashMap<String, Expr<BoolType>>();
    private int counter=0;
    private APGeneratorVisitor apGeneratorVisitor;

    public ToStringVisitor(APGeneratorVisitor apGeneratorVisitor){
        this.apGeneratorVisitor=apGeneratorVisitor;
    }
    
    public void unsafePut(String name, Expr<?> expr) {
    	aps.put(name, (Expr<BoolType>)expr);
    }

    public Map<String,Expr<BoolType>> getAps(){return aps;}

    @Override
    public String visitModel(LTLGrammarParser.ModelContext ctx) {
        return visitImplyExpression(ctx.implyExpression);
    }

    @Override
    public String visitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx) {
        if(!LTLExprVisitor.getInstance().visitImplyExpression(ctx)){
            String name=generateApName();
            Expr<?> expr=apGeneratorVisitor.visitImplyExpression(ctx);
            unsafePut(name,expr);
            return name;
        }
        if(ctx.ops.size()>1){
            return visitOrExpr(ctx.ops.get(0))+" -> "+visitOrExpr(ctx.ops.get(1));
        }else{
            return visitOrExpr(ctx.ops.get(0));
        }
    }

    @Override
    public String visitOrExpr(LTLGrammarParser.OrExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitOrExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitOrExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitAndExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(" | ");
            builder.append(visitAndExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitAndExpr(LTLGrammarParser.AndExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitAndExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitAndExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitNotExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(" & ");
            builder.append(visitNotExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitNotExpr(LTLGrammarParser.NotExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitNotExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitNotExpr(ctx));
            return name;
        }
        if(ctx.ops.size()>0){
            return "! "+visitNotExpr(ctx.ops.get(0));
        }else{
            return visitBinaryLtlExpr(ctx.binaryLtlExpr());
        }
    }

    @Override
    public String visitBinaryLtlExpr(LTLGrammarParser.BinaryLtlExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitBinaryLtlExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitBinaryLtlExpr(ctx));
            return name;
        }
        if(ctx.type!=null){
            return visitBinaryLtlExpr(ctx.op1)+ " "+ visitBinaryLtlOp(ctx.type)+" "+visitBinaryLtlExpr(ctx.op2);

        }else{
            return visitLtlExpr(ctx.ltlExpr());
        }
    }

    @Override
    public String visitBinaryLtlOp(LTLGrammarParser.BinaryLtlOpContext ctx) {
        if(ctx.U_OP()!=null){
            return "U";
        }else if(ctx.M_OP()!=null){
            return "M";
        }else if(ctx.W_OP()!=null){
            return "W";
        }else{
            return "R";
        }
    }

    @Override
    public String visitLtlExpr(LTLGrammarParser.LtlExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitLtlExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitLtlExpr(ctx));
            return name;
        }
        if(ctx.ops.size()>0){
            return visitLtlOp(ctx.type)+" "+visitLtlExpr(ctx.ops.get(0));

        }else{
            return visitEqExpr(ctx.eqExpr());
        }
    }

    @Override
    public String visitLtlOp(LTLGrammarParser.LtlOpContext ctx) {
        if(ctx.F_OP()!=null){
            return "F";
        }else if(ctx.G_OP()!=null) {
            return "G";
        } else {
            return "X";
        }
    }

    @Override
    public String visitEqExpr(LTLGrammarParser.EqExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitEqExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitEqExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitRelationExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(visitEqOperator(ctx.oper));
            builder.append(visitRelationExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitEqOperator(LTLGrammarParser.EqOperatorContext ctx) {
        if(ctx.EQ()!=null){
            return "=";
        }else{
            return "/=";
        }
    }

    @Override
    public String visitRelationExpr(LTLGrammarParser.RelationExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitRelationExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitRelationExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitAdditiveExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(visitRelationOperator(ctx.oper));
            builder.append(visitAdditiveExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitRelationOperator(LTLGrammarParser.RelationOperatorContext ctx) {
        if(ctx.LT()!=null){
            return "<";
        }else if(ctx.GT()!=null){
            return ">";
        }else if(ctx.LEQ()!=null){
            return "<=";
        }else return ">=";
    }

    @Override
    public String visitAdditiveExpr(LTLGrammarParser.AdditiveExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitAdditiveExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitAdditiveExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitMultiplicativeExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(visitAdditiveOperator(ctx.opers.get(i-1)));
            builder.append(visitMultiplicativeExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitAdditiveOperator(LTLGrammarParser.AdditiveOperatorContext ctx) {
        if(ctx.PLUS()!=null){
            return "+";
        }else return "-";
    }

    @Override
    public String visitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitMultiplicativeExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitMultiplicativeExpr(ctx));
            return name;
        }
        StringBuilder builder=new StringBuilder();
        builder.append(visitNegExpr(ctx.ops.get(0)));
        for(int i=1;i<ctx.ops.size();i++){
            builder.append(visitMultiplicativeOperator(ctx.opers.get(i-1)));
            builder.append(visitNegExpr(ctx.ops.get(i)));
        }
        return builder.toString();
    }

    @Override
    public String visitMultiplicativeOperator(LTLGrammarParser.MultiplicativeOperatorContext ctx) {
        if(ctx.MUL()!=null){
            return "*";
        }else if(ctx.MOD()!=null){
            return "%";
        }else return "/";
    }

    @Override
    public String visitNegExpr(LTLGrammarParser.NegExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitNegExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitNegExpr(ctx));
            return name;
        }
        if(ctx.ops.size()>0){
            return "- "+visitNegExpr(ctx.ops.get(0));
        }else{
            return visitPrimaryExpr(ctx.primaryExpr());
        }
    }

    @Override
    public String visitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitPrimaryExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitPrimaryExpr(ctx));
            return name;
        }
        if(ctx.parenExpr()!=null){
            return visitParenExpr(ctx.parenExpr());
        }else if(ctx.intLitExpr()!=null){
            return visitIntLitExpr(ctx.intLitExpr());
        }else return visitBoolLitExpr(ctx.boolLitExpr());
    }

    @Override
    public String visitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx) {
        return ctx.value.getText();
    }

    @Override
    public String visitParenExpr(LTLGrammarParser.ParenExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitParenExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitParenExpr(ctx));
            return name;
        }
        if(ctx.variable()!=null){
            return visitVariable(ctx.variable());
        }else{
            return "("+visitImplyExpression(ctx.ops.get(0))+")";
        }
    }

    @Override
    public String visitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx) {
        if(!LTLExprVisitor.getInstance().visitIntLitExpr(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitIntLitExpr(ctx));
            return name;
        }
        return ctx.value.getText();
    }

    @Override
    public String visitVariable(LTLGrammarParser.VariableContext ctx) {
        if(!LTLExprVisitor.getInstance().visitVariable(ctx)) {
            String name=generateApName();
            unsafePut(name,apGeneratorVisitor.visitVariable(ctx));
            return name;
        }
        return ctx.name.getText();
    }

    private String generateApName(){
        return "ap"+(counter++);
    }
}
