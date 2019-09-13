package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.ArrayList;
import java.util.List;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.And;

public class SequentialAction implements Action {

    private List<Action> actions;

    @Override
    public List<Expr<BoolType>> toExpr() {
        List<Expr<BoolType>> running=new ArrayList<Expr<BoolType>>();
        for(Action action:actions){
            List<Expr<BoolType>> newList=new ArrayList<Expr<BoolType>>();
            for(Expr<BoolType> runningExpr: running){
                for(Expr<BoolType> newExpr: action.toExpr()){
                    newList.add(And(runningExpr,newExpr));
                }
            }
            running=newList;
        }
        return running;
    }
}
