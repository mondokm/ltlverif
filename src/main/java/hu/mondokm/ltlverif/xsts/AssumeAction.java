package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.AssumeStmt;
import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

public class AssumeAction implements Action {

    private AssumeStmt stmt;

    @Override
    public List<List<Stmt>> getStmts() {
        List<Stmt> inner=new ArrayList<Stmt>();
        List<List<Stmt>> outer=new ArrayList<List<Stmt>>();
        inner.add(stmt);
        outer.add(inner);
        return outer;
    }

    public AssumeStmt getStmt() {
        return stmt;
    }

    public void setStmt(AssumeStmt stmt) {
        this.stmt = stmt;
    }
}
