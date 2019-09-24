package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.analysis.expr.StmtAction;
import hu.bme.mit.theta.core.stmt.Stmt;

import java.util.List;

public class Transition extends StmtAction {

    List<Stmt> stmts;

    public Transition(List<Stmt> stmts) {
        this.stmts = stmts;
        System.out.println(this.toExpr());
        System.out.println(this.nextIndexing());
    }

    @Override
    public List<Stmt> getStmts() {
        return stmts;
    }

    @Override
    public String toString() {
        return getStmts().toString();
    }
}
