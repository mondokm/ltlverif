package hu.mondokm.ltlverif.cfa;

import hu.bme.mit.theta.analysis.pred.PredState;
import hu.bme.mit.theta.cfa.CFA;
import hu.mondokm.ltlverif.abstractor.ProductState;
import hu.mondokm.ltlverif.abstractor.SUT;
import hu.mondokm.ltlverif.buchi.BuchiAction;
import hu.mondokm.ltlverif.buchi.BuchiState;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.True;

public class CfaSUT implements SUT {

    private CFA cfa;

    public CfaSUT(CFA cfa) {
        this.cfa = cfa;
    }

    @Override
    public ProductState getInitialState(BuchiState starting) {
        return new CfaProductState(cfa.getInitLoc(), PredState.of(True()), starting, new BuchiAction(True(),null));
    }

    @Override
    public boolean isFinalState(ProductState prod) {
        return ((CfaProductState)prod).getLoc().equals(cfa.getFinalLoc());
    }
}
