package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.mondokm.ltlverif.InfTrace;

public interface LtlAbstractor {

    public InfTrace check(PredPrec precision);

}
