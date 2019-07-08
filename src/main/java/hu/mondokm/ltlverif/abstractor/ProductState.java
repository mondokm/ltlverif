package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.pred.PredState;
import hu.bme.mit.theta.cfa.CFA;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiState;

public class ProductState{
    private CFA.Loc loc;
    private CFA.Edge toEdge;
    private PredState predState;
    private BuchiState buchiState;
    private BuchiAction cond;

    public CFA.Loc getLoc() {
        return loc;
    }

    public void setLoc(CFA.Loc loc) {
        this.loc = loc;
    }

    public CFA.Edge getToEdge() {
        return toEdge;
    }

    public void setToEdge(CFA.Edge toEdge) {
        this.toEdge = toEdge;
    }

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

    public BuchiAction getCond() {
        return cond;
    }

    public void setCond(BuchiAction cond) {
        this.cond = cond;
    }

    public ProductState(CFA.Edge toEdge, CFA.Loc loc, PredState predState, BuchiState buchiState, BuchiAction cond) {
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
