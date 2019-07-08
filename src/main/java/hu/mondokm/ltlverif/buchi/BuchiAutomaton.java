package hu.mondokm.ltlverif.buchi;

import java.util.HashSet;

import hu.bme.mit.theta.core.model.Valuation;

public class BuchiAutomaton {

    public BuchiState getInitial() {
        return initial;
    }

    public void setInitial(BuchiState initial) {
        this.initial = initial;
        current.clear();
        current.add(initial);
    }

    private BuchiState initial;

    public boolean isAccepting() {
        return false;
    }

    private HashSet<BuchiState> current=new HashSet<BuchiState>();

    public void step(Valuation valuation){
    	HashSet<BuchiState> newCurrent = new HashSet<BuchiState>();
    	for(BuchiState s: current) {
    		newCurrent.addAll(s.nextState(valuation));
    	}
        current=newCurrent;
    }

    public void reset(){
    	current.clear();
        current.add(initial);
    }

}
