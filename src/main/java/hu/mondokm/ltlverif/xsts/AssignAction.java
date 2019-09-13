package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.AssignStmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

public class AssignAction implements Action {

    private AssignStmt stmt;

    @Override
    public List<Expr<BoolType>> toExpr() {
        List<Expr<BoolType>> exprs=new ArrayList<Expr<BoolType>>();
        exprs.add(stmt.getExpr());
        return exprs;
    }
}
