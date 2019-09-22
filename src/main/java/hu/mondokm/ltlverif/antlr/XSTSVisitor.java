package hu.mondokm.ltlverif.antlr;

import hu.bme.mit.theta.core.decl.Decls;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.stmt.Stmts;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.Type;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.xsts.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static hu.bme.mit.theta.core.type.abstracttype.AbstractExprs.*;
import static hu.bme.mit.theta.core.type.anytype.Exprs.Prime;
import static hu.bme.mit.theta.core.type.booltype.BoolExprs.*;
import static hu.bme.mit.theta.core.type.booltype.BoolExprs.Not;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Mod;

public class XSTSVisitor extends XSTSGrammarBaseVisitor<Expr> {

    XSTS xsts;
    HashMap<String,Integer> literalToIntMap=new HashMap<String,Integer>();

    public HashMap<String, Integer> getLiteralToIntMap() {
        return literalToIntMap;
    }

    HashMap<String,VarDecl> nameToDeclMap=new HashMap<String, VarDecl>();

    public XSTS getXsts(){
        return xsts;
    }

    @Override
    public Expr visitXsts(XSTSGrammarParser.XstsContext ctx) {
        xsts=new XSTS();
        for(XSTSGrammarParser.TypeDeclarationContext typeDecl: ctx.typeDeclarations){
            visitTypeDeclaration(typeDecl);
        }
        for(TypeDecl decl:xsts.getTypes()){
            for(int i=0;i<decl.getLiterals().size();i++) if(!literalToIntMap.containsKey(decl.getLiterals().get(i)))literalToIntMap.put(decl.getLiterals().get(i),i);
        }
        for(XSTSGrammarParser.VariableDeclarationContext varDecl: ctx.variableDeclarations){
            visitVariableDeclaration(varDecl);
        }
        xsts.setTransitions(processNonDetAction(ctx.transitions));
        xsts.setInitAction(processNonDetAction(ctx.initAction));
        System.out.println(xsts.getVars());
        for(TypeDecl typeDecl:xsts.getTypes()){
            System.out.println(typeDecl);
            for(String literal:typeDecl.getLiterals()){
                System.out.println(literal+" "+literalToIntMap.get(literal));
            }
        }
        for(List<Stmt> stmts: xsts.getTransitions().getStmts()){
            System.out.println(stmts);
        }
        return null;
    }

    @Override
    public Expr visitTypeDeclaration(XSTSGrammarParser.TypeDeclarationContext ctx) {
        List<String> literals=new ArrayList<String>();
        for(XSTSGrammarParser.TypeLiteralContext literal:ctx.literals){
            literals.add(literal.name.getText());
        }
        TypeDecl decl=new TypeDecl(ctx.name.getText(),literals);
        xsts.getTypes().add(decl);
        return null;
    }

    @Override
    public Expr visitVariableDeclaration(XSTSGrammarParser.VariableDeclarationContext ctx) {
        Type type;
        if(ctx.type.BOOL()!=null) type= BoolType.getInstance();
        else if(ctx.type.INT()!=null) type= IntType.getInstance();
        else type=IntType.getInstance();
        VarDecl decl=Decls.Var(ctx.name.getText(),type);
        if(nameToDeclMap.containsKey(ctx.name.getText())){
            System.out.println("Variable ["+ctx.name.getText()+"] already exists.");
        }else {
            xsts.getVars().add(decl);
            nameToDeclMap.put(decl.getName(), decl);
        }
        return null;
    }

    @Override
    public Expr visitImplyExpression(XSTSGrammarParser.ImplyExpressionContext ctx) {
        if(ctx.ops.size()>1){
            return Imply(visitOrExpr(ctx.ops.get(0)),visitOrExpr(ctx.ops.get(1)));
        }else return visitOrExpr(ctx.ops.get(0));
    }

    @Override
    public Expr visitOrExpr(XSTSGrammarParser.OrExprContext ctx) {
        if(ctx.ops.size()==1) return visitAndExpr(ctx.ops.get(0));
        List<Expr<BoolType>> ops=new ArrayList<Expr<BoolType>>();
        for(XSTSGrammarParser.AndExprContext child: ctx.ops){
            ops.add(visitAndExpr(child));
        }
        return Or(ops);
    }

    @Override
    public Expr<BoolType> visitAndExpr(XSTSGrammarParser.AndExprContext ctx) {
        if(ctx.ops.size()==1) return visitNotExpr(ctx.ops.get(0));
        List<Expr<BoolType>> ops=new ArrayList<Expr<BoolType>>();
        for(XSTSGrammarParser.NotExprContext child: ctx.ops){
            ops.add(visitNotExpr(child));
        }
        return And(ops);
    }

    @Override
    public Expr<BoolType> visitNotExpr(XSTSGrammarParser.NotExprContext ctx) {
        if(ctx.ops.size()>0) return Not(visitNotExpr(ctx.ops.get(0)));
        else return visitEqExpr(ctx.eqExpr());
    }

    @Override
    public Expr visitEqExpr(XSTSGrammarParser.EqExprContext ctx) {
        if(ctx.ops.size()>1){
            if(ctx.oper.EQ()!=null) return Eq(visitRelationExpr(ctx.ops.get(0)),visitRelationExpr(ctx.ops.get(1)));
            else return Neq(visitRelationExpr(ctx.ops.get(0)),visitRelationExpr(ctx.ops.get(1)));
        }else return visitRelationExpr(ctx.ops.get(0));
    }

    @Override
    public Expr visitEqOperator(XSTSGrammarParser.EqOperatorContext ctx) {
        return super.visitEqOperator(ctx);
    }

    @Override
    public Expr visitRelationExpr(XSTSGrammarParser.RelationExprContext ctx) {
        if(ctx.ops.size()>1){
            if(ctx.oper.LEQ()!=null){
                return Leq(visitAdditiveExpr(ctx.ops.get(0)),visitAdditiveExpr(ctx.ops.get(1)));
            }else if(ctx.oper.GEQ()!=null){
                return Geq(visitAdditiveExpr(ctx.ops.get(0)),visitAdditiveExpr(ctx.ops.get(1)));
            }else if(ctx.oper.LT()!=null){
                return Lt(visitAdditiveExpr(ctx.ops.get(0)),visitAdditiveExpr(ctx.ops.get(1)));
            }else return Gt(visitAdditiveExpr(ctx.ops.get(0)),visitAdditiveExpr(ctx.ops.get(1)));
        }else return visitAdditiveExpr(ctx.ops.get(0));
    }

    @Override
    public Expr visitRelationOperator(XSTSGrammarParser.RelationOperatorContext ctx) {
        return super.visitRelationOperator(ctx);
    }

    @Override
    public Expr visitAdditiveExpr(XSTSGrammarParser.AdditiveExprContext ctx) {
        Expr res=visitMultiplicativeExpr(ctx.ops.get(0));
        for(int i=1;i<ctx.ops.size();i++){
            if(ctx.opers.get(i-1).PLUS()!=null){
                res=Add(res,visitMultiplicativeExpr(ctx.ops.get(i)));
            }else{
                res=Sub(res,visitMultiplicativeExpr(ctx.ops.get(i)));
            }
        }
        return res;

    }

    @Override
    public Expr visitAdditiveOperator(XSTSGrammarParser.AdditiveOperatorContext ctx) {
        return super.visitAdditiveOperator(ctx);
    }

    @Override
    public Expr visitMultiplicativeExpr(XSTSGrammarParser.MultiplicativeExprContext ctx) {
        Expr res=visitNegExpr(ctx.ops.get(0));
        for(int i=1;i<ctx.ops.size();i++){
            if(ctx.opers.get(i-1).DIV()!=null){
                res=Div(res,visitNegExpr(ctx.ops.get(i)));
            }else if(ctx.opers.get(i-1).MOD()!=null){
                res=Mod(res,visitNegExpr(ctx.ops.get(i)));
            }else{
                res=Mul(res,visitNegExpr(ctx.ops.get(i)));
            }
        }
        return res;
    }

    @Override
    public Expr visitMultiplicativeOperator(XSTSGrammarParser.MultiplicativeOperatorContext ctx) {
        return super.visitMultiplicativeOperator(ctx);
    }

    @Override
    public Expr visitNegExpr(XSTSGrammarParser.NegExprContext ctx) {
        if(ctx.ops.size()>0){
            return Neg(visitNegExpr(ctx.ops.get(0)));
        }else return visitPrimaryExpr(ctx.primaryExpr());
    }

    @Override
    public Expr visitPrimaryExpr(XSTSGrammarParser.PrimaryExprContext ctx) {
        if(ctx.value()!=null) return visitValue(ctx.value());
        else return visitParenExpr(ctx.parenExpr());
    }

    @Override
    public Expr visitParenExpr(XSTSGrammarParser.ParenExprContext ctx) {
        if(ctx.prime()!=null) return visitPrime(ctx.prime());
        else return visitImplyExpression(ctx.ops.get(0));
    }

    @Override
    public Expr visitValue(XSTSGrammarParser.ValueContext ctx) {
        if(ctx.literal()!=null) return visitLiteral(ctx.literal());
        else return visitReference(ctx.reference());
    }

    @Override
    public Expr visitLiteral(XSTSGrammarParser.LiteralContext ctx) {
        if(ctx.BOOLLIT()!=null){
            if(ctx.BOOLLIT().getText().equals("true")) return True(); else return False();
        }else{
            return Int(Integer.parseInt(ctx.INTLIT().getText()));
        }
    }

    @Override
    public Expr visitReference(XSTSGrammarParser.ReferenceContext ctx) {
        if(literalToIntMap.containsKey(ctx.name.getText())) return Int(literalToIntMap.get(ctx.name.getText()));
        else return nameToDeclMap.get(ctx.name.getText()).getRef();
    }

    @Override
    public Expr visitPrime(XSTSGrammarParser.PrimeContext ctx) {
        if(ctx.reference()!=null) return visitReference(ctx.reference());
        else return Prime(visitPrime(ctx.prime()));
    }

    public Action processAction(XSTSGrammarParser.ActionContext ctx) {
        if(ctx.assignAction()!=null) return processAssignAction(ctx.assignAction());
        else if(ctx.assumeAction()!=null) return processAssumeAction(ctx.assumeAction());
        else if(ctx.havocAction()!=null) return processHavocAction(ctx.havocAction());
        else return processNonDetAction(ctx.nonDetAction());
    }

    public NonDetAction processNonDetAction(XSTSGrammarParser.NonDetActionContext ctx) {
        NonDetAction action=new NonDetAction();
        for(XSTSGrammarParser.SequentialActionContext seq:ctx.choices){
            action.addChoice(processSequentialAction(seq));
        }
        return action;
    }

    public SequentialAction processSequentialAction(XSTSGrammarParser.SequentialActionContext ctx) {
        SequentialAction sequentialAction=new SequentialAction();
        for(XSTSGrammarParser.ActionContext action:ctx.actions){
            sequentialAction.addAction(processAction(action));
        }
        return sequentialAction;
    }

    public AssumeAction processAssumeAction(XSTSGrammarParser.AssumeActionContext ctx) {
        AssumeAction assumeAction=new AssumeAction();
        assumeAction.setStmt(Stmts.Assume(visitImplyExpression(ctx.cond)));
        System.out.println(assumeAction.getStmt());
        return assumeAction;
    }

    public AssignAction processAssignAction(XSTSGrammarParser.AssignActionContext ctx) {
        AssignAction assignAction=new AssignAction();
        assignAction.setStmt(Stmts.Assign(processAssignLHS(ctx.lhs),visitImplyExpression(ctx.rhs)));
        System.out.println(assignAction.getStmt());
        return assignAction;
    }

    public HavocAction processHavocAction(XSTSGrammarParser.HavocActionContext ctx){
        HavocAction havocAction=new HavocAction(Stmts.Havoc(nameToDeclMap.get(ctx.name.getText())));
        System.out.println(havocAction.getStmt());
        return havocAction;
    }

    public VarDecl processAssignLHS(XSTSGrammarParser.AssignLHSContext ctx){
        return nameToDeclMap.get(ctx.name.getText());
    }
}
