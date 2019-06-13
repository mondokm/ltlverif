package hu.mondokm.ltlverif.buchi;

import hu.bme.mit.theta.core.model.Valuation;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolLitExpr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.HashMap;

public class State {

    public boolean isAccepting() {
        return accepting;
    }

    public void setAccepting(boolean accepting) {
        this.accepting = accepting;
    }

    private boolean accepting;

    public void addTransition(Expr<BoolType> boolTypeExpr, State state) {
        transitions.put(boolTypeExpr, state);
    }

    private HashMap<Expr<BoolType>,State> transitions=new HashMap<Expr<BoolType>,State>();

    public State nextState(Valuation valuation){
        for(Expr<BoolType> cond:transitions.keySet()){
            if(((BoolLitExpr) cond.eval(valuation)).getValue()) return transitions.get(cond);
        }
        return this;
    }

}
