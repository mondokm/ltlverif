package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.analysis.pred.PredState;
import hu.mondokm.ltlverif.abstractor.ProductState;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiState;
import hu.mondokm.ltlverif.cfa.CfaProductState;

import java.util.HashSet;

public class XSTSProductState extends ProductState {

    private Transition transition;
    private XSTSSUT sut;

    public XSTSProductState(Transition transition, XSTSSUT sut, PredState predState, BuchiState buchiState, BuchiAction buchiAction) {
        super(predState, buchiState, buchiAction);
        this.transition = transition;
        this.sut=sut;
    }

    @Override
    public ExprAction getPrevAction() {
        return transition;
    }

    @Override
    public HashSet<ProductState> getNextStates(PredPrec prec) {
        if(transition==null) return sut.initialTransitionStates(prec);
        return sut.nextStates(this,prec);
    }

    @Override
    public String toString() {
        return (transition!=null?transition.getStmts():"")+" "+(predState!=null?predState:"")+(buchiState!=null?buchiState.getId()+(buchiState.isAccepting()?" accepting":"")+(buchiState.hasLoop()?" has loop":""):"");
    }

    public int hashCode() {
        if(predState==null || buchiState==null) return 0;
        return predState.hashCode()+ buchiState.getId();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof XSTSProductState) {
            final XSTSProductState that = (XSTSProductState) obj;
            return this.predState.equals(that.predState) &&
                    this.buchiState.getId()==that.buchiState.getId();
        } else {
            return false;
        }
    }
}
