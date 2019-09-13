package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

public class NonDetAction implements Action {

    private List<Action> choices;

    @Override
    public List<Expr<BoolType>> toExpr() {
        List<Expr<BoolType>> exprs=new ArrayList<Expr<BoolType>>();
        for (Action action: choices){
            exprs.addAll(action.toExpr());
        }
        return exprs;
    }
}
