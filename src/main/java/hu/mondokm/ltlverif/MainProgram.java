package hu.mondokm.ltlverif;

import hu.bme.mit.theta.cfa.*;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.antlr.LTLAPVisitor;
import hu.mondokm.ltlverif.antlr.LTLGrammarLexer;
import hu.mondokm.ltlverif.antlr.LTLGrammarParser;
import hu.mondokm.ltlverif.antlr.ToStringVisitor;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.InputStream;

import static hu.bme.mit.theta.core.type.abstracttype.AbstractExprs.Eq;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;

public class MainProgram {

    public static void main(String[] args){
        try {

            String text="b > a and F G abc";
            LTLGrammarLexer lexer=new LTLGrammarLexer(CharStreams.fromString(text));
            CommonTokenStream tokenStream=new CommonTokenStream(lexer);
            LTLGrammarParser parser=new LTLGrammarParser(tokenStream);
            LTLGrammarParser.ModelContext model =parser.model();
            System.out.println(ToStringVisitor.getInstance().visitModel(model));

            InputStream inputStream = new FileInputStream("src/main/resources/cfa/counter5_true.cfa");
            CFA cfa = CfaDslManager.createCfa(inputStream);
            AutomatonBuilder builder=new AutomatonBuilder();
            builder.addAp(0,Eq(Int(5),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef()));
            BuchiAutomaton automaton=builder.parseAutomaton("src/main/resources/automata/out.hoa");
            boolean result=CegarVerifier.verifyCFA(cfa,automaton);
            System.out.println();
            System.out.println(result?"Ltl expression holds":"Ltl expression does not hold");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
