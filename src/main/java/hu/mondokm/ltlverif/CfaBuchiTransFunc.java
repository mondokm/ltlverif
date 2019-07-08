package hu.mondokm.ltlverif;

import hu.bme.mit.theta.analysis.pred.PredAbstractors;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.analysis.pred.PredState;
import hu.bme.mit.theta.analysis.pred.PredTransFunc;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.analysis.CfaAction;
import hu.bme.mit.theta.solver.z3.Z3SolverFactory;
import hu.mondokm.ltlverif.abstractor.ProductState;
import hu.mondokm.ltlverif.buchi.BuchiAction;

import java.util.HashSet;

public class CfaBuchiTransFunc {

    private static PredTransFunc predTransFunc=PredTransFunc.create(PredAbstractors.booleanSplitAbstractor(Z3SolverFactory.getInstace().createSolver()));

    public static HashSet<ProductState> nextStates(ProductState curr, PredPrec precision){
        HashSet <ProductState> states=new HashSet<ProductState>();
        for(CFA.Edge edge: curr.getLoc().getOutEdges()) {
            for(PredState state:predTransFunc.getSuccStates(curr.getPredState(), CfaAction.create(edge),precision)){
                if(!state.isBottom())for(BuchiAction action: curr.getBuchiState().nextStates(state)){
                    for(PredState innerState:predTransFunc.getSuccStates(state,action,precision)){
                        if(!innerState.isBottom())states.add(new ProductState(edge,edge.getTarget(), innerState, action.getTarget(),action));
                    }
                }
            }

        }
        return states;
    }

}
