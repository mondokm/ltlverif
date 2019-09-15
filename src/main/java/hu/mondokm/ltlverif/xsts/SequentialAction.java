package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.And;

public class SequentialAction implements Action {

    private List<Action> actions=new ArrayList<Action>();

    @Override
    public List<List<Stmt>> getStmts() {
        List<List<Stmt>> running=actions.get(0).getStmts();
        for(int i=1;i<actions.size();i++){
            List<List<Stmt>> newList= new ArrayList<List<Stmt>>();
            for(List<Stmt> runningList: running){
                for(List<Stmt> choiceList: actions.get(i).getStmts()){
                    List<Stmt> joined=new ArrayList<Stmt>();
                    joined.addAll(runningList);
                    joined.addAll(choiceList);
                    newList.add(joined);
                }
            }
            running=newList;
        }
        return running;
    }

    public void addAction(Action action){
        actions.add(action);
    }

    public List<Action> getActions() {
        return actions;
    }
}
