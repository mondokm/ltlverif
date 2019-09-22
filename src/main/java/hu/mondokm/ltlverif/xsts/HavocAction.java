package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.HavocStmt;
import hu.bme.mit.theta.core.stmt.Stmt;

import java.util.ArrayList;
import java.util.List;

public class HavocAction implements Action{

    public HavocStmt getStmt() {
        return stmt;
    }

    public HavocAction(HavocStmt stmt) {
        this.stmt = stmt;
    }

    private HavocStmt stmt;

    @Override
    public List<List<Stmt>> getStmts() {
        List<Stmt> inner=new ArrayList<Stmt>();
        List<List<Stmt>> outer=new ArrayList<List<Stmt>>();
        inner.add(stmt);
        outer.add(inner);
        return outer;
    }
}
