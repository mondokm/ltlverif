package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.List;

public interface Action {

    List<Expr<BoolType>> toExpr();

}
