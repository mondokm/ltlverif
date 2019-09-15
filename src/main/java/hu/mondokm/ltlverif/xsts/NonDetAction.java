package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

public class NonDetAction implements Action {

    private List<Action> choices=new ArrayList<Action>();

    @Override
    public List<List<Stmt>> getStmts() {
        List<List<Stmt>> stmtList=new ArrayList<List<Stmt>>();
        for (Action action: choices){
            stmtList.addAll(action.getStmts());
        }
        return stmtList;
    }

    public void addChoice(Action action){
        choices.add(action);
    }

    public List<Action> getChoices() {
        return choices;
    }
}
