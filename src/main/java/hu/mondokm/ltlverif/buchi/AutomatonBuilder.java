package hu.mondokm.ltlverif.buchi;

import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import jhoafparser.ast.AtomAcceptance;
import jhoafparser.ast.AtomLabel;
import jhoafparser.ast.BooleanExpression;
import jhoafparser.consumer.HOAConsumer;
import jhoafparser.consumer.HOAConsumerException;
import jhoafparser.parser.HOAFParser;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;

import static hu.bme.mit.theta.core.type.booltype.BoolExprs.*;

public class AutomatonBuilder implements HOAConsumer {

    BuchiAutomaton automaton;
    HashMap<Integer, BuchiState> states=new HashMap<Integer, BuchiState>();
    HashMap<String,Expr<BoolType>> aps=new HashMap<String, Expr<BoolType>>();
    List<String> apNames;

    public Expr<BoolType> toExpr(BooleanExpression<AtomLabel> expr){
        switch (expr.getType()){
            case EXP_OR: return Or(toExpr(expr.getLeft()),toExpr(expr.getRight()));
            case EXP_AND: return And(toExpr(expr.getLeft()),toExpr(expr.getRight()));
            case EXP_NOT: return Not(toExpr(expr.getLeft()));
            case EXP_FALSE: return False();
            case EXP_TRUE: return True();
            case EXP_ATOM: return aps.get(apNames.get(expr.getAtom().getAPIndex()));
            default: return False();

        }
    }

    public void addAp(String name,Expr<BoolType> expr){
        aps.put(name,expr);
    }

    public void setAps(HashMap<String,Expr<BoolType>> aps){
        this.aps=aps;
    }

    public BuchiAutomaton parseAutomaton(String fileName){
        automaton=new BuchiAutomaton();
        try{
            HOAFParser.parseHOA(new FileInputStream(fileName), this);
        }catch (Exception e){
            e.printStackTrace();
        }
        return automaton;
    }

    @Override
    public boolean parserResolvesAliases() {
        return false;
    }

    @Override
    public void notifyHeaderStart(String s) throws HOAConsumerException {

    }

    @Override
    public void setNumberOfStates(int i) throws HOAConsumerException {

    }

    @Override
    public void addStartStates(List<Integer> list) throws HOAConsumerException {
        int i=list.get(0);
        if(states.get(new Integer(i))==null)states.put(new Integer(i),new BuchiState(i));
        automaton.setInitial(states.get(new Integer(i)));

    }

    @Override
    public void addAlias(String s, BooleanExpression<AtomLabel> booleanExpression) throws HOAConsumerException {

    }

    @Override
    public void setAPs(List<String> list) throws HOAConsumerException {
        apNames=list;
    }

    @Override
    public void setAcceptanceCondition(int i, BooleanExpression<AtomAcceptance> booleanExpression) throws HOAConsumerException {

    }

    @Override
    public void provideAcceptanceName(String s, List<Object> list) throws HOAConsumerException {

    }

    @Override
    public void setName(String s) throws HOAConsumerException {

    }

    @Override
    public void setTool(String s, String s1) throws HOAConsumerException {

    }

    @Override
    public void addProperties(List<String> list) throws HOAConsumerException {

    }

    @Override
    public void addMiscHeader(String s, List<Object> list) throws HOAConsumerException {

    }

    @Override
    public void notifyBodyStart() throws HOAConsumerException {

    }

    @Override
    public void addState(int i, String s, BooleanExpression<AtomLabel> booleanExpression, List<Integer> list) throws HOAConsumerException {
        if(states.get(new Integer(i))==null)states.put(new Integer(i),new BuchiState(i));
        states.get(new Integer(i)).setAccepting(list!=null&&(!list.isEmpty()));
//        System.out.println(i+" "+booleanExpression+", "+list);
    }

    @Override
    public void addEdgeImplicit(int i, List<Integer> list, List<Integer> list1) throws HOAConsumerException {
        /*for(Integer target:list){
            if(states.get(new Integer(target))==null)states.put(new Integer(target),new BuchiState());
            states.get(new Integer(i)).addTransition(True(),states.get(new Integer(target)));
            System.out.println(i+" "+target);
        }*/
    }

    @Override
    public void addEdgeWithLabel(int i, BooleanExpression<AtomLabel> booleanExpression, List<Integer> list, List<Integer> list1) throws HOAConsumerException {
        for(Integer target:list){
            if(states.get(new Integer(target))==null)states.put(new Integer(target),new BuchiState(target));
            states.get(new Integer(i)).addTransition(toExpr(booleanExpression),states.get(new Integer(target)));
            if(i==target && booleanExpression.isTRUE()) states.get(new Integer(i)).setHasLoop(true);
        }
    }

    @Override
    public void notifyEndOfState(int i) throws HOAConsumerException {

    }

    @Override
    public void notifyEnd() throws HOAConsumerException {

    }

    @Override
    public void notifyAbort() {

    }

    @Override
    public void notifyWarning(String s) throws HOAConsumerException {

    }
}
