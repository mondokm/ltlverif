package hu.mondokm.ltlverif.antlr;

public class ToStringVisitor extends LTLGrammarBaseVisitor<String> {

    private static ToStringVisitor instance=new ToStringVisitor();
    private ToStringVisitor(){};
    public static ToStringVisitor getInstance(){
        return instance;
    }

    @Override
    public String visitModel(LTLGrammarParser.ModelContext ctx) {
        super.visitModel(ctx);
        return visitImplyExpression(ctx.implyExpression);
    }

    @Override
    public String visitImplyExpression(LTLGrammarParser.ImplyExpressionContext ctx) {
        super.visitImplyExpression(ctx);
        if(!LTLExprVisitor.getInstance().visitImplyExpression(ctx)) return "a";
        if(ctx.ops.size()>1){
            return visitOrExpr(ctx.ops.get(0))+" -> "+visitOrExpr(ctx.ops.get(1));
        }else{
            return visitOrExpr(ctx.ops.get(0));
        }
    }

    @Override
    public String visitOrExpr(LTLGrammarParser.OrExprContext ctx) {
        super.visitOrExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitOrExpr(ctx)) return "a";
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
        super.visitAndExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitAndExpr(ctx)) return "a";
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
        super.visitNotExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitNotExpr(ctx)) return "a";
        if(ctx.ops.size()>0){
            return "! "+visitNotExpr(ctx.ops.get(0));
        }else{
            return visitLtlExpr(ctx.ltlExpr());
        }
    }

    @Override
    public String visitLtlExpr(LTLGrammarParser.LtlExprContext ctx) {
        super.visitLtlExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitLtlExpr(ctx)) return "a";
        if(ctx.ops.size()>0){
            return visitLtlOp(ctx.type)+" "+visitLtlExpr(ctx.ops.get(0));

        }else{
            return visitEqExpr(ctx.eqExpr());
        }
    }

    @Override
    public String visitLtlOp(LTLGrammarParser.LtlOpContext ctx) {
        super.visitLtlOp(ctx);
        if(ctx.F_OP()!=null){
            return "F";
        }else{
            return "G";
        }
    }

    @Override
    public String visitEqExpr(LTLGrammarParser.EqExprContext ctx) {
        super.visitEqExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitEqExpr(ctx)) return "a";
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
        super.visitEqOperator(ctx);
        if(ctx.EQ()!=null){
            return "=";
        }else{
            return "/=";
        }
    }

    @Override
    public String visitRelationExpr(LTLGrammarParser.RelationExprContext ctx) {
        super.visitRelationExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitRelationExpr(ctx)) return "a";
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
        super.visitRelationOperator(ctx);
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
        super.visitAdditiveExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitAdditiveExpr(ctx)) return "a";
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
        super.visitAdditiveOperator(ctx);
        if(ctx.PLUS()!=null){
            return "+";
        }else return "-";
    }

    @Override
    public String visitMultiplicativeExpr(LTLGrammarParser.MultiplicativeExprContext ctx) {
        super.visitMultiplicativeExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitMultiplicativeExpr(ctx)) return "a";
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
        super.visitMultiplicativeOperator(ctx);
        if(ctx.MUL()!=null){
            return "*";
        }else if(ctx.MOD()!=null){
            return "%";
        }else return "/";
    }

    @Override
    public String visitNegExpr(LTLGrammarParser.NegExprContext ctx) {
        super.visitNegExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitNegExpr(ctx)) return "a";
        if(ctx.ops.size()>0){
            return "- "+visitNegExpr(ctx.ops.get(0));
        }else{
            return visitPrimaryExpr(ctx.primaryExpr());
        }
    }

    @Override
    public String visitPrimaryExpr(LTLGrammarParser.PrimaryExprContext ctx) {
        super.visitPrimaryExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitPrimaryExpr(ctx)) return "a";
        if(ctx.parenExpr()!=null){
            return visitParenExpr(ctx.parenExpr());
        }else if(ctx.intLitExpr()!=null){
            return visitIntLitExpr(ctx.intLitExpr());
        }else return visitBoolLitExpr(ctx.boolLitExpr());
    }

    @Override
    public String visitBoolLitExpr(LTLGrammarParser.BoolLitExprContext ctx) {
        super.visitBoolLitExpr(ctx);
        return ctx.value.getText();
    }

    @Override
    public String visitParenExpr(LTLGrammarParser.ParenExprContext ctx) {
        super.visitParenExpr(ctx);
        if(!LTLExprVisitor.getInstance().visitParenExpr(ctx)) return "a";
        if(ctx.variable()!=null){
            return visitVariable(ctx.variable());
        }else{
            return "("+visitImplyExpression(ctx.ops.get(0))+")";
        }
    }

    @Override
    public String visitIntLitExpr(LTLGrammarParser.IntLitExprContext ctx) {
        super.visitIntLitExpr(ctx);
        return ctx.value.getText();
    }

    @Override
    public String visitVariable(LTLGrammarParser.VariableContext ctx) {
        super.visitVariable(ctx);
        return ctx.name.getText();
    }
}
