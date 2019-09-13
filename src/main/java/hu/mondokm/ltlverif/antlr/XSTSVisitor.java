package hu.mondokm.ltlverif.antlr;

import hu.bme.mit.theta.core.decl.Decls;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.type.Type;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.xsts.TypeDecl;
import hu.mondokm.ltlverif.xsts.XSTS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XSTSVisitor extends XSTSGrammarBaseVisitor<Object> {

    XSTS xsts;
    HashMap<String,Integer> literalToIntMap=new HashMap<String,Integer>();

    @Override
    public Object visitXsts(XSTSGrammarParser.XstsContext ctx) {
        xsts=new XSTS();
        for(XSTSGrammarParser.TypeDeclarationContext typeDecl: ctx.typeDeclarations){
            visitTypeDeclaration(typeDecl);
        }
        for(TypeDecl decl:xsts.getTypes()){
            for(int i=0;i<decl.getLiterals().size();i++) literalToIntMap.put(decl.getLiterals().get(i),i);
        }
        for(XSTSGrammarParser.VariableDeclarationContext varDecl: ctx.variableDeclarations){
            visitVariableDeclaration(varDecl);
        }
        System.out.println(xsts.getVars());
        for(TypeDecl typeDecl:xsts.getTypes()){
            System.out.println(typeDecl);
            for(String literal:typeDecl.getLiterals()){
                System.out.println(literal+" "+literalToIntMap.get(literal));
            }
        }
        return null;
    }

    @Override
    public Object visitTypeDeclaration(XSTSGrammarParser.TypeDeclarationContext ctx) {
        List<String> literals=new ArrayList<String>();
        for(XSTSGrammarParser.TypeLiteralContext literal:ctx.literals){
            literals.add(literal.name.getText());
        }
        TypeDecl decl=new TypeDecl(ctx.name.getText(),literals);
        xsts.getTypes().add(decl);
        return null;
    }

    @Override
    public Object visitVariableDeclaration(XSTSGrammarParser.VariableDeclarationContext ctx) {
        Type type;
        if(ctx.type.BOOL()!=null) type= BoolType.getInstance();
        else if(ctx.type.INT()!=null) type= IntType.getInstance();
        else type=IntType.getInstance();
        xsts.getVars().add(Decls.Var(ctx.name.getText(),type));
        return null;
    }
}
