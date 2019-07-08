package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.pred.PredPrec;

public interface LtlAbstractor {

    public InfTrace check(PredPrec precision);

}
