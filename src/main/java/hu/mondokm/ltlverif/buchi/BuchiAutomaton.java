package hu.mondokm.ltlverif.buchi;

import hu.bme.mit.theta.core.model.Valuation;

public class BuchiAutomaton {

    public State getInitial() {
        return initial;
    }

    public void setInitial(State initial) {
        this.initial = initial;
        current=initial;
    }

    private State initial;

    public boolean isAccepting() {
        return current.isAccepting();
    }

    private State current;

    public void step(Valuation valuation){
        current=current.nextState(valuation);
    }

    public void reset(){
        current=initial;
    }

}
