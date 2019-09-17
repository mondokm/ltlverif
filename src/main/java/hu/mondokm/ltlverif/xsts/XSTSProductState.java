package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.mondokm.ltlverif.abstractor.ProductState;

import java.util.HashSet;

public class XSTSProductState extends ProductState {
    @Override
    public ExprAction getPrevAction() {
        return null;
    }

    @Override
    public HashSet<ProductState> getNextStates(PredPrec prec) {
        return null;
    }
}
