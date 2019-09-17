package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.analysis.pred.PredState;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiState;

import java.util.HashSet;

public abstract class ProductState{

    protected PredState predState;
    protected BuchiState buchiState;
    protected BuchiAction buchiAction;

    public abstract ExprAction getPrevAction();

    public PredState getPredState() {
        return predState;
    }

    public void setPredState(PredState predState) {
        this.predState = predState;
    }

    public BuchiState getBuchiState() {
        return buchiState;
    }

    public void setBuchiState(BuchiState buchiState) {
        this.buchiState = buchiState;
    }

    public BuchiAction getBuchiAction() {
        return buchiAction;
    }

    public void setBuchiAction(BuchiAction buchiAction) {
        this.buchiAction = buchiAction;
    }

    protected ProductState(PredState predState, BuchiState buchiState, BuchiAction buchiAction) {
        this.predState = predState;
        this.buchiState = buchiState;
        this.buchiAction = buchiAction;
    }

    public abstract HashSet<ProductState> getNextStates(PredPrec prec);

}
