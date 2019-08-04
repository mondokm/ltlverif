package hu.mondokm.ltlverif;

import hu.bme.mit.theta.cfa.*;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.antlr.APGeneratorVisitor;
import hu.mondokm.ltlverif.antlr.LTLGrammarLexer;
import hu.mondokm.ltlverif.antlr.LTLGrammarParser;
import hu.mondokm.ltlverif.antlr.ToStringVisitor;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static hu.bme.mit.theta.core.type.abstracttype.AbstractExprs.Eq;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;

public class MainProgram {

    public static void main(String[] args){
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/cfa/counter5_true.cfa");
            CFA cfa = CfaDslManager.createCfa(inputStream);
            HashMap<String,VarDecl> vars=new HashMap<String, VarDecl>();
            for(VarDecl decl:cfa.getVars()){
                vars.put(decl.getName(),decl);
            }

            String text="G F x>2 -> F x>2";
            LTLGrammarLexer lexer=new LTLGrammarLexer(CharStreams.fromString(text));
            CommonTokenStream tokenStream=new CommonTokenStream(lexer);
            LTLGrammarParser parser=new LTLGrammarParser(tokenStream);
            LTLGrammarParser.ModelContext model =parser.model();
            ToStringVisitor toStringVisitor=new ToStringVisitor(new APGeneratorVisitor(vars));
            System.out.println();
            System.out.println(toStringVisitor.visitModel(model));
            System.out.println(toStringVisitor.getAps().values());

//            AutomatonBuilder builder=new AutomatonBuilder();
//            builder.addAp(0,Eq(Int(5),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef()));
//            BuchiAutomaton automaton=builder.parseAutomaton("src/main/resources/automata/out.hoa");
//            boolean result=CegarVerifier.verifyCFA(cfa,automaton);
//            System.out.println();
//            System.out.println(result?"Ltl expression holds":"Ltl expression does not hold");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
