package hu.mondokm.ltlverif;

import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.model.ImmutableValuation;
import hu.bme.mit.theta.core.model.MutableValuation;
import hu.bme.mit.theta.core.stmt.AssignStmt;
import hu.bme.mit.theta.core.stmt.AssumeStmt;
import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolLitExpr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import hu.mondokm.ltlverif.buchi.State;

import java.util.HashMap;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.*;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Eq;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;

public class Tester {

    private static int NSTEPS=10000;

    private CFA cfa;
    private BuchiAutomaton automaton;
    private MutableValuation vars=new MutableValuation();
    public Tester(CFA cfa, BuchiAutomaton automaton){
        this.cfa=cfa;
        this.automaton=automaton;


        //FG(x==5)
//        State state0=new State();
//        state0.setAccepting(false);
//
//        State state1=new State();
//        state1.setAccepting(true);
//
//        State state2=new State();
//        state2.setAccepting(false);
//
//        Expr<BoolType> B=Eq(Int(5),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef());
//
//        state0.addTransition(Not(B),state0);
//        state0.addTransition(B,state1);
//        state1.addTransition(Not(B),state2);
//        state1.addTransition(B,state1);
//        state2.addTransition(True(),state2);
//
//        automaton.setInitial(state0);

    }
    public void test(){
        for(VarDecl var :cfa.getVars()){
            vars.put(var,Int(0));
        }
        CFA.Loc loc=cfa.getInitLoc();
        for(int i=0;i<NSTEPS;i++){
            for(CFA.Edge edge:loc.getOutEdges()){
                if(edge.getStmt() instanceof AssumeStmt){
                    AssumeStmt stmt=(AssumeStmt) edge.getStmt();
                    System.out.println(edge.getTarget().getName()+" "+stmt.toString());
                    if(!((BoolLitExpr) stmt.getCond().eval(vars)).getValue()) continue;
                }
                if(edge.getStmt() instanceof AssignStmt){
                    AssignStmt stmt=(AssignStmt) edge.getStmt();
                    System.out.println(edge.getTarget().getName()+" "+stmt.toString());
                    vars.put(stmt.getVarDecl(),stmt.getExpr().eval(vars));
                }
                loc=edge.getTarget();
            }
            System.out.println(loc.getName()+" "+vars.toMap());
            automaton.step(vars);
            System.out.println(automaton.isAccepting());
        }
    }

}
