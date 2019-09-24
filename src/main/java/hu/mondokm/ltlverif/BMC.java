//package hu.mondokm.ltlverif;
//
//import hu.bme.mit.theta.cfa.CFA;
//import hu.bme.mit.theta.cfa.CFA.Loc;
//import hu.bme.mit.theta.core.decl.VarDecl;
//import hu.bme.mit.theta.core.model.ImmutableValuation;
//import hu.bme.mit.theta.core.model.MutableValuation;
//import hu.bme.mit.theta.core.model.Valuation;
//import hu.bme.mit.theta.core.stmt.AssignStmt;
//import hu.bme.mit.theta.core.stmt.AssumeStmt;
//import hu.bme.mit.theta.core.stmt.Stmt;
//import hu.bme.mit.theta.core.type.Expr;
//import hu.bme.mit.theta.core.type.booltype.BoolLitExpr;
//import hu.bme.mit.theta.core.type.booltype.BoolType;
//import hu.bme.mit.theta.core.type.inttype.IntType;
//import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
//import hu.mondokm.ltlverif.buchi.BuchiState;
//
//import java.util.ArrayDeque;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Stack;
//
//import static hu.bme.mit.theta.core.type.booltype.BoolExprs.*;
//import static hu.bme.mit.theta.core.type.inttype.IntExprs.Eq;
//import static hu.bme.mit.theta.core.type.inttype.IntExprs.Int;
//
//public class Tester {
//
//    private CFA cfa;
//    private BuchiAutomaton automaton;
//
//    private HashMap<ProductState, TarjanData> lowkeys=new HashMap<ProductState, TarjanData>();
//    private HashMap<ProductState, NDFSData> redblue=new HashMap<ProductState, NDFSData>();
//    private ArrayDeque<ProductState> stack=new ArrayDeque<ProductState>();
//    private ProductState sccStart=null;
//
//    private int counter=0;
//    private boolean passed=true;
//
//    private int bound=10;
//    private int depth=0;
//    private boolean depthEnough=true;
//
//    private class ProductState{
//    	private Loc loc;
//    	private MutableValuation val;
//    	private BuchiState state;
//
//		public ProductState(Loc loc, MutableValuation val, BuchiState state) {
//			this.loc = loc;
//			this.val = val;
//			this.state = state;
//		}
//
//		public String toString() {
//			return loc.getName()+" "+val.toMap()+" "+state.getId();
//		}
//
//		public int hashCode() {
//			return loc.getName().hashCode()+val.hashCode()+state.getId();
//		}
//
//		public boolean equals(Object obj) {
//			if (this == obj) {
//				return true;
//			} else if (obj instanceof ProductState) {
//				final ProductState that = (ProductState) obj;
//				return this.loc.getName().equals(that.loc.getName()) &&
//						this.val.equals(that.val) &&
//						this.state.getId()==that.state.getId();
//			} else {
//				return false;
//			}
//		}
//    }
//
//    private class TarjanData{
//    	private int id, lowkey;
//    	private boolean onStack;
//    	public TarjanData(int id) {
//    		this.id=id;
//    		this.lowkey=id;
//    		this.onStack=true;
//    	}
//
//    }
//
//    private class NDFSData{
//        private boolean blue=false,red=false;
//        public NDFSData(boolean blue, boolean red){
//            this.red=red;
//            this.blue=blue;
//        }
//    }
//
//    public Tester(CFA cfa, BuchiAutomaton automaton){
//        this.cfa=cfa;
//        this.automaton=automaton;
//
//
//        //FG(x==5)
////        BuchiState state0=new BuchiState();
////        state0.setAccepting(false);
////
////        BuchiState state1=new BuchiState();
////        state1.setAccepting(true);
////
////        BuchiState state2=new BuchiState();
////        state2.setAccepting(false);
////
////        Expr<BoolType> B=Eq(Int(5),((VarDecl<IntType>)cfa.getVars().toArray()[0]).getRef());
////
////        state0.addTransition(Not(B),state0);
////        state0.addTransition(B,state1);
////        state1.addTransition(Not(B),state2);
////        state1.addTransition(B,state1);
////        state2.addTransition(True(),state2);
////
////        automaton.setInitial(state0);
//
//    }
//    public boolean testTarjan(){
//    	MutableValuation vars=new MutableValuation();
////        for(VarDecl var :cfa.getVars()){
////            vars.put(var,Int(0));
////        }
//        CFA.Loc loc=cfa.getInitLoc();
//        BuchiState starting=automaton.getInitial();
//        passed=true;
//        bound=10;
//        depthEnough=false;
//        while(passed&& !depthEnough){
//            depthEnough=true;
//            vars=new MutableValuation();
//            counter=0;
//            depth=0;
//            lowkeys.clear();
//            stack.clear();
//            dfs(new ProductState(loc, vars, starting));
//            System.out.println("Bound: "+bound+" Result: "+(passed?"Passed":"Failed"));
//            bound+=10;
//        }
//        System.out.println(passed?"Passed":"Failed");
////        if(passed) {
////        	System.out.println("BuchiState space explored:");
////        	for(ProductState prod: lowkeys.keySet()) System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.state.isAccepting());
////        }
//        return passed;
//    }
//
//    public HashSet<ProductState> getActions(ProductState curr){
//    	HashSet<ProductState> states=new HashSet<ProductState>();
//    	if(depth>=bound){
//    	    depthEnough=false;
//    	    return states;
//        }
//    	for(CFA.Edge edge: curr.loc.getOutEdges()) {
//    		if(edge.getStmt() instanceof AssumeStmt){
//                AssumeStmt stmt=(AssumeStmt) edge.getStmt();
//                if(!((BoolLitExpr) stmt.getCond().eval(curr.val)).getValue()) continue;
//            }
//    		MutableValuation newVal=MutableValuation.copyOf(curr.val);
//            if(edge.getStmt() instanceof AssignStmt){
//                AssignStmt stmt=(AssignStmt) edge.getStmt();
//                newVal.put(stmt.getVarDecl(),stmt.getExpr().eval(newVal));
//            }
//            CFA.Loc newLoc=edge.getTarget();
//            for(BuchiState newState: curr.state.nextState(newVal)) {
//            	states.add(new ProductState(newLoc, newVal, newState));
//            }
//    	}
//    	return states;
//    }
//
//    public void dfs(ProductState curr) {
//        depth++;
//    	stack.push(curr);
//    	lowkeys.put(curr, new TarjanData(counter++));
//        for(ProductState newProd: getActions(curr)) {
//        	if(lowkeys.get(newProd)==null) dfs(newProd);
//        	if(!passed) return;
//        	if(lowkeys.get(newProd)!=null && lowkeys.get(newProd).onStack)
//        		if(lowkeys.get(newProd).lowkey<lowkeys.get(curr).lowkey) {
//        			lowkeys.get(curr).lowkey=lowkeys.get(newProd).lowkey;
//        		}
//    	}
//
//    	if(lowkeys.get(curr).id==lowkeys.get(curr).lowkey) {
//    		boolean accepting=false;
//    		LinkedList<ProductState> scc=new LinkedList<ProductState>();
//    		ProductState prodState=stack.pop();
//    		scc.add(prodState);
//    		while(true) {
//    			lowkeys.get(prodState).onStack=false;
//    			lowkeys.get(prodState).lowkey=lowkeys.get(curr).id;
//    			if(prodState.state.isAccepting()) accepting=true;
//    			if(curr.equals(prodState)) break;
//    			prodState=stack.pop();
//    			scc.add(prodState);
//    		}
//    		if(accepting) {
//        		if(scc.size()!=1 || getActions(curr).contains(curr) || cfa.getFinalLoc().equals(curr.loc)) {
//        			passed=false;
//        			System.out.println("SCC:");
//        			for(ProductState prod: scc) {
//        				System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.state.isAccepting());
//        			}
//        			System.out.println("Path to SCC:");
//        			for(ProductState prod: stack) {
//        				System.out.println(prod+" "+lowkeys.get(prod).lowkey+" "+prod.state.isAccepting());
//        			}
//        		}
//    		}
//
//    	}
//    	depth--;
//    }
//
//    public boolean testNDFS(){
//        MutableValuation vars=new MutableValuation();
//        CFA.Loc loc=cfa.getInitLoc();
//        BuchiState starting=automaton.getInitial();
//        passed=true;
//        dfs_blue(new ProductState(loc, vars, starting));
//        System.out.println(passed?"Passed":"Failed");
//        return passed;
//    }
//
//    public void dfs_blue(ProductState curr){
//        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(true,false));
//        else redblue.get(curr).blue=true;
//        for(ProductState next:getActions(curr)){
//            if(redblue.get(next)==null || redblue.get(next).blue==false) dfs_blue(next);
//            if(!passed){
//                System.out.println(curr);
//                return;
//            }
//        }
//        if(curr.state.isAccepting()){
//            sccStart=curr;
//            dfs_red(curr);
//        }
//    }
//
//    public void dfs_red(ProductState curr){
//        if(redblue.get(curr)==null)redblue.put(curr,new NDFSData(false,true));
//        else redblue.get(curr).red=true;
//        for(ProductState next:getActions(curr)){
//            if(redblue.get(next)==null || redblue.get(next).red==false) dfs_red(next);
//            if(!passed) {
//                System.out.println(curr);
//                return;
//            }
//            if (next.equals(sccStart)) passed=false;
//
//        }
//    }
//
//}
