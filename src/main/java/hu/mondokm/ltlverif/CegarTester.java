package hu.mondokm.ltlverif;

import hu.bme.mit.theta.analysis.Trace;
import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.expr.ExprState;
import hu.bme.mit.theta.analysis.expr.ExprTraceUtils;
import hu.bme.mit.theta.analysis.expr.refinement.*;
import hu.bme.mit.theta.analysis.pred.*;
import hu.bme.mit.theta.analysis.unit.UnitState;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.CFA.Loc;
import hu.bme.mit.theta.cfa.analysis.CfaAction;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.core.type.inttype.IntType;
import hu.bme.mit.theta.solver.z3.Z3SolverFactory;
import hu.mondokm.ltlverif.abstractor.NDFSAbstractor;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import hu.mondokm.ltlverif.buchi.BuchiState;
import hu.mondokm.ltlverif.refiner.TraceChecker;

import java.util.*;

import static hu.bme.mit.theta.core.type.abstracttype.AbstractExprs.Eq;
import static hu.bme.mit.theta.core.type.booltype.BoolExprs.True;
import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;

public class CegarTester {

    private CFA cfa;
    private BuchiAutomaton automaton;

    private HashMap<ProductState, TarjanData> lowkeys=new HashMap<ProductState, TarjanData>();
    private HashMap<ProductState, NDFSAbstractor.NDFSData> redblue=new HashMap<ProductState, NDFSAbstractor.NDFSData>();
    private Stack<ProductState> stack=new Stack<ProductState>();
    private Stack<ProductState> cycle=new Stack<ProductState>();
    private ProductState sccStart=null;
    private PredTransFunc predTransFunc=PredTransFunc.create(PredAbstractors.booleanSplitAbstractor(Z3SolverFactory.getInstace().createSolver()));
    TraceChecker checker=TraceChecker.create(True(),True(),Z3SolverFactory.getInstace().createItpSolver());
    JoiningPrecRefiner<ExprState,ExprAction,PredPrec,ItpRefutation> refiner=JoiningPrecRefiner.create(new ItpRefToPredPrec(ExprSplitters.atoms()));


    private PredPrec precision=null;

    private int counter=0;
    private boolean abstractionPassed=false;
    private boolean cexFeasible=false;

    private class ProductState{
    	private Loc loc;
    	private CFA.Edge toEdge;
        private PredState predState;
    	private BuchiState buchiState;
    	private BuchiAction cond;

		public ProductState(CFA.Edge toEdge, Loc loc, PredState predState, BuchiState buchiState, BuchiAction cond) {
			this.toEdge=toEdge;
		    this.loc = loc;
			this.predState = predState;
			this.buchiState = buchiState;
			this.cond=cond;
		}

		public String toString() {
			return loc.getName()+" "+predState.toString()+" "+ buchiState.getId();
		}

		public int hashCode() {
			return loc.getName().hashCode()+predState.hashCode()+ buchiState.getId();
		}

		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} else if (obj instanceof ProductState) {
				final ProductState that = (ProductState) obj;
				return this.loc.getName().equals(that.loc.getName()) &&
						this.predState.equals(that.predState) &&
						this.buchiState.getId()==that.buchiState.getId();
			} else {
				return false;
			}
		}
    }

    private class TarjanData{
    	private int id, lowkey;
    	private boolean onStack;
    	public TarjanData(int id) {
    		this.id=id;
    		this.lowkey=id;
    		this.onStack=true;
    	}

    }



    public CegarTester(CFA cfa, BuchiAutomaton automaton){
        this.cfa=cfa;
        this.automaton=automaton;

    }
    public boolean testTarjan(){
        Loc loc=cfa.getInitLoc();
        BuchiState starting=automaton.getInitial();
        abstractionPassed=false;
        cexFeasible=false;
        List<Expr<BoolType>> prec=new ArrayList<Expr<BoolType>>();
        for(int i=0;i<4;i++) prec.add(Eq(Int(i),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef()));
        precision=PredPrec.of(prec);
        while(!abstractionPassed && !cexFeasible){
            abstractionPassed=true;
            cexFeasible=false;
            counter=0;
            lowkeys.clear();
            stack.clear();
            dfs(new ProductState(null,loc, PredState.of(True()), starting, new BuchiAction(True(),null)));
            System.out.println("Result: "+(abstractionPassed?"Passed":"Failed"));
        }
        System.out.println(abstractionPassed?"Passed":"Failed");

        return abstractionPassed;
    }

    public HashSet<ProductState> nextStates(ProductState curr){
    	HashSet<ProductState> states=new HashSet<ProductState>();
    	for(CFA.Edge edge: curr.loc.getOutEdges()) {
    	    for(PredState state:predTransFunc.getSuccStates(curr.predState,CfaAction.create(edge),precision)){
                if(!state.isBottom())for(BuchiAction action: curr.buchiState.nextStates(state)){
                    for(PredState innerState:predTransFunc.getSuccStates(state,action,precision)){
                        if(!innerState.isBottom())states.add(new ProductState(edge,edge.getTarget(), innerState, action.getTarget(),action));
                    }
                }
            }

    	}
    	return states;
    }

    public void dfs(ProductState curr) {
    	stack.push(curr);
    	lowkeys.put(curr, new TarjanData(counter++));
        for(ProductState newProd: nextStates(curr)) {
        	if(lowkeys.get(newProd)==null) dfs(newProd);
        	if(!abstractionPassed) return;
        	if(lowkeys.get(newProd)!=null && lowkeys.get(newProd).onStack)
        		if(lowkeys.get(newProd).lowkey<lowkeys.get(curr).lowkey) {
        			lowkeys.get(curr).lowkey=lowkeys.get(newProd).lowkey;
        		}
    	}

    	if(lowkeys.get(curr).id==lowkeys.get(curr).lowkey) {
    		boolean accepting=false;
    		LinkedList<ProductState> scc=new LinkedList<ProductState>();
    		ProductState prodState=stack.pop();
    		scc.add(prodState);
    		while(true) {
    			lowkeys.get(prodState).onStack=false;
    			lowkeys.get(prodState).lowkey=lowkeys.get(curr).id;
    			if(prodState.buchiState.isAccepting()) accepting=true;
    			if(curr.equals(prodState)) break;
    			prodState=stack.pop();
    			scc.add(prodState);
    		}
    		if(accepting) {
        		if(scc.size()!=1 || nextStates(curr).contains(curr) || cfa.getFinalLoc().equals(curr.loc)) {
        			List<ExprAction> edges=new ArrayList<ExprAction>();
//        			System.out.println("SCC:");
        			for(ProductState prod: scc) {
        			    if(prod.cond!=null) edges.add(prod.cond);
                        if(prod.toEdge!=null)edges.add(CfaAction.create(prod.toEdge));
//        				System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.buchiState.isAccepting());
        			}
//        			System.out.println("Path to SCC:");
        			for(ProductState prod: stack) {
                        if(prod.cond!=null) edges.add(prod.cond);
                        if(prod.toEdge!=null)edges.add(CfaAction.create(prod.toEdge));
//        				System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.buchiState.isAccepting());
        			}
                    Trace<ExprState,ExprAction> trace= ExprTraceUtils.traceFrom(edges).reverse();
                    ExprTraceStatus<ItpRefutation> status=checker.check(InfTrace.create(trace,0));
                    for(ExprAction action:trace.getActions()) System.out.println(action);
                    System.out.println("Feasible: "+status.isFeasible());
                    abstractionPassed=false;
                    if(status.isInfeasible()){
                        PredPrec prec=refiner.refine(precision,trace,status.asInfeasible().getRefutation());
                        System.out.println("Refutation: "+status.asInfeasible().getRefutation());
                        System.out.println("PruneIndex: "+status.asInfeasible().getRefutation().getPruneIndex());
                        System.out.println("Original: "+precision);
                        System.out.println("Refined: "+prec);
                        precision=precision.join(prec);
                    }
                    if(status.isFeasible()){
                        System.out.println(status.asFeasible().getValuations());
                        cexFeasible=true;
                        System.out.println("SCC:");
                        for(ProductState prod: scc) {
                            System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.buchiState.isAccepting());
                        }
                        System.out.println("Path to SCC:");
                        for(ProductState prod: stack) {
                            System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.buchiState.isAccepting());
                        }
                    }
        		}
    		}

    	}
    }

    public boolean testNDFS(){
        Loc loc=cfa.getInitLoc();
        BuchiState starting=automaton.getInitial();
        abstractionPassed=false;
        cexFeasible=false;
        List<Expr<BoolType>> prec=new ArrayList<Expr<BoolType>>();
        for(int i=0;i<=-1;i++) prec.add(Eq(Int(i),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef()));
        precision=PredPrec.of(prec);
        while(!abstractionPassed && !cexFeasible){
            abstractionPassed=true;
            cexFeasible=false;
            counter=0;
            stack.clear();
            cycle.clear();
            redblue.clear();
            System.out.println("Precision: "+precision);
            dfs_blue(new ProductState(null,loc, PredState.of(True()), starting, new BuchiAction(True(),null)));
            System.out.println("Result: "+(abstractionPassed?"Passed":"Failed"));
        }
        System.out.println("Final result: "+(abstractionPassed?"Passed":"Failed"));

        return abstractionPassed;
    }

    public void dfs_blue(ProductState curr){
        stack.push(curr);
        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(true,false));
        else redblue.get(curr).blue=true;
//        System.out.println(curr);
        for(ProductState next:nextStates(curr)){
//            System.out.println("---"+next);
            if(redblue.get(next)==null || redblue.get(next).blue==false) dfs_blue(next);
            if(!abstractionPassed){
                //System.out.println(curr);
                return;
            }
        }
        if(curr.buchiState.isAccepting()){
            sccStart=curr;
            dfs_red(curr);
        }
        stack.pop();
    }

    public void dfs_red(ProductState curr){
        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(false,true));
        else redblue.get(curr).red=true;
        for(ProductState next:nextStates(curr)){
            cycle.push(next);
            if(redblue.get(next)==null || redblue.get(next).red==false) dfs_red(next);
            if(!abstractionPassed) {
                //System.out.println(curr);
                return;
            }
            if (next.equals(sccStart)) {
                List<ExprAction> edges=new ArrayList<ExprAction>();
                List<ExprState> states=new ArrayList<ExprState>();
                states.add(UnitState.getInstance());
                for(ProductState prod: stack) {
                    if(prod.toEdge!=null) edges.add(CfaAction.create(prod.toEdge)); else edges.add(new BuchiAction(True(),null));
                    if(prod.cond!=null) edges.add(prod.cond); else edges.add(new BuchiAction(True(),null));
                    states.add(prod.predState);
                    states.add(prod.predState);
                }

                int cycleStart=states.size()-1;

                for(ProductState prod: cycle) {
                    if(prod.toEdge!=null) edges.add(CfaAction.create(prod.toEdge)); else edges.add(new BuchiAction(True(),null));
                    if(prod.cond!=null) edges.add(prod.cond); else edges.add(new BuchiAction(True(),null));
                    states.add(prod.predState);
                    states.add(prod.predState);
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
