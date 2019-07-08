package hu.mondokm.ltlverif.buchi;

import hu.bme.mit.theta.analysis.expr.StmtAction;
import hu.bme.mit.theta.analysis.pred.PredState;
import hu.bme.mit.theta.common.Utils;
import hu.bme.mit.theta.core.stmt.AssumeStmt;
import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

public class BuchiAction extends StmtAction {
    private Expr<BoolType> cond;
    private BuchiState target;

    public PredState getPredState() {
        return predState;
    }

    public void setPredState(PredState predState) {
        this.predState = predState;
    }

    private PredState predState;

    public BuchiAction(Expr<BoolType> cond, BuchiState target) {
        this.cond = cond;
        this.target = target;
    }

    public Expr<BoolType> getCond() {
        return cond;
    }

    public void setCond(Expr<BoolType> cond) {
        this.cond = cond;
    }

    public BuchiState getTarget() {
        return target;
    }

    public void setTarget(BuchiState target) {
        this.target = target;
    }

    @Override
    public List<Stmt> getStmts() {
        List<Stmt> ret=new ArrayList<Stmt>();
        ret.add(AssumeStmt.of(cond));
        return ret;
    }

    public String toString(){
        return Utils.lispStringBuilder(getClass().getSimpleName()).body().add(AssumeStmt.of(cond)).toString();
    }
}
