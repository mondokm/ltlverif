package hu.mondokm.ltlverif.xsts;

import hu.mondokm.ltlverif.abstractor.ProductState;
import hu.mondokm.ltlverif.abstractor.SUT;
import hu.mondokm.ltlverif.buchi.BuchiState;

public class XSTSSUT implements SUT {

    private XSTS xsts;

    @Override
    public ProductState getInitialState(BuchiState starting) {
        return null;
    }

    @Override
    public boolean isFinalState(ProductState prod) {
        return false;
    }
}
