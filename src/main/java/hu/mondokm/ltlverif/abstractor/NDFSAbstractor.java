package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.Trace;
import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.expr.ExprState;
import hu.bme.mit.theta.analysis.expr.refinement.ExprTraceStatus;
import hu.bme.mit.theta.analysis.expr.refinement.ItpRefutation;
import hu.bme.mit.theta.analysis.pred.PredAbstractors;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.analysis.pred.PredTransFunc;
import hu.bme.mit.theta.analysis.unit.UnitState;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.analysis.CfaAction;
import hu.bme.mit.theta.solver.z3.Z3SolverFactory;
import hu.mondokm.ltlverif.CegarTester;
import hu.mondokm.ltlverif.CfaBuchiTransFunc;
import hu.mondokm.ltlverif.InfTrace;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.True;

public class NDFSAbstractor implements LtlAbstractor {

    private CFA cfa;
    private BuchiAutomaton automaton;

    private HashMap<ProductState, NDFSData> redblue=new HashMap<ProductState, NDFSData>();
    private Stack<ProductState> stack=new Stack<ProductState>();
    private Stack<ProductState> cycle=new Stack<ProductState>();
    private ProductState sccStart=null;
    private PredPrec precision;

    public class NDFSData{
        private boolean blue=false,red=false;
        public NDFSData(boolean blue, boolean red){
            this.red=red;
            this.blue=blue;
        }
    }

    public InfTrace check(PredPrec precision) {
        this.precision=precision;
        return null;
    }

    public void dfs_blue(ProductState curr){
        stack.push(curr);
        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(true,false));
        else redblue.get(curr).blue=true;
        for(ProductState next: CfaBuchiTransFunc.nextStates(curr,precision)){
            if(redblue.get(next)==null || redblue.get(next).blue==false) dfs_blue(next);
        }
        if(curr.getBuchiState().isAccepting()){
            sccStart=curr;
            dfs_red(curr);
        }
        stack.pop();
    }

    public void dfs_red(ProductState curr){
        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(false,true));
        else redblue.get(curr).red=true;
        for(ProductState next:CfaBuchiTransFunc.nextStates(curr,precision)){
            cycle.push(next);
            if(redblue.get(next)==null || redblue.get(next).red==false) dfs_red(next);
            if (next.equals(sccStart)) {
                List<ExprAction> edges=new ArrayList<ExprAction>();
                List<ExprState> states=new ArrayList<ExprState>();
                states.add(UnitState.getInstance());
                for(ProductState prod: stack) {
                    if(prod.getToEdge()!=null) edges.add(CfaAction.create(prod.getToEdge())); else edges.add(new BuchiAction(True(),null));
                    if(prod.getCond()!=null) edges.add(prod.getCond()); else edges.add(new BuchiAction(True(),null));
                    states.add(prod.getPredState());
                    states.add(prod.getPredState());
                }

                int cycleStart=states.size()-1;

                for(ProductState prod: cycle) {
                    if(prod.getToEdge()!=null) edges.add(CfaAction.create(prod.getToEdge())); else edges.add(new BuchiAction(True(),null));
                    if(prod.getCond()!=null) edges.add(prod.getCond()); else edges.add(new BuchiAction(True(),null));
                    states.add(prod.getPredState());
                    states.add(prod.getPredState());
                }

//                Trace<ExprState,ExprAction> trace= ExprTraceUtils.traceFrom(edges);
                Trace<ExprState,ExprAction> trace=Trace.of(states,edges);
                ExprTraceStatus<ItpRefutation> status=checker.check(InfTrace.create(trace,cycleStart));

                abstractionPassed=false;
                if(status.isInfeasible()){
                    PredPrec prec=refiner.refine(precision,trace,status.asInfeasible().getRefutation());
                    precision=precision.join(prec);
                }
                if(status.isFeasible()){
                    System.out.println(status.asFeasible().getValuations());
                    cexFeasible=true;
                }
            }
            cycle.pop();


        }
    }
}
