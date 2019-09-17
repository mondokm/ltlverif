package hu.mondokm.ltlverif.cfa;

import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.analysis.pred.PredState;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.analysis.CfaAction;
import hu.mondokm.ltlverif.abstractor.ProductState;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiState;

import java.util.HashSet;

public class CfaProductState extends ProductState{

    private CFA.Edge toEdge;
    private CFA.Loc loc;

    public CFA.Loc getLoc() {
        return loc;
    }

    public CFA.Edge getToEdge() {
        return toEdge;
    }

    public void setToEdge(CFA.Edge toEdge) {
        this.toEdge = toEdge;
    }

    public CfaProductState(CFA.Edge toEdge, PredState predState, BuchiState buchiState, BuchiAction buchiAction) {
        super(predState,buchiState,buchiAction);
        this.toEdge=toEdge;
        this.loc=toEdge.getTarget();
    }

    public CfaProductState(CFA.Loc loc, PredState predState, BuchiState buchiState, BuchiAction buchiAction) {
        super(predState,buchiState,buchiAction);
        this.loc=loc;
    }

    public String toString() {
        return getLoc().getName()+" "+predState.toString()+" "+ buchiState.getId();
    }

    public int hashCode() {
        return getLoc().getName().hashCode()+predState.hashCode()+ buchiState.getId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof CfaProductState) {
            final CfaProductState that = (CfaProductState) obj;
            return this.getLoc().getName().equals(that.getLoc().getName()) &&
                    this.predState.equals(that.predState) &&
                    this.buchiState.getId()==that.buchiState.getId();
        } else {
            return false;
        }
    }

    @Override
    public ExprAction getPrevAction() {
        if(toEdge!=null)return CfaAction.create(toEdge);
        else return null;
    }

    @Override
    public HashSet<ProductState> getNextStates(PredPrec prec) {
        return CfaBuchiTransFunc.nextStates(this,prec);
    }

}
