package hu.mondokm.ltlverif;

import hu.bme.mit.theta.cfa.*;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.stmt.*;
import hu.bme.mit.theta.core.type.Type;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static hu.bme.mit.theta.core.type.abstracttype.AbstractExprs.Eq;
import static hu.bme.mit.theta.core.type.booltype.BoolExprs.True;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;

public class MainProgram {

    public static void main(String[] args){
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/cfa/counter5_true.cfa");
            CFA cfa = CfaDslManager.createCfa(inputStream);
            AutomatonBuilder builder=new AutomatonBuilder();
            builder.addAp(0,Eq(Int(5),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef()));
            BuchiAutomaton automaton=builder.parseAutomaton("src/main/resources/automata/out.hoa");
            CegarTester tester=new CegarTester(cfa,automaton);
            tester.testNDFS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
