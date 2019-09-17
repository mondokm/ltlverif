package hu.mondokm.ltlverif.abstractor;

import hu.mondokm.ltlverif.buchi.BuchiState;

public interface SUT {

    ProductState getInitialState(BuchiState starting);

    boolean isFinalState(ProductState prod);


}
