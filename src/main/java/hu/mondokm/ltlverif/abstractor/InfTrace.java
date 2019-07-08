package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.Trace;
import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.expr.ExprState;

public class InfTrace {

    private Trace<ExprState, ExprAction> trace;

    private InfTrace(Trace<ExprState, ExprAction> trace, int cycleStart) {
        this.trace = trace;
        this.cycleStart = cycleStart;
    }

    public static InfTrace create(Trace<ExprState, ExprAction> trace, int cycleStart){
        return new InfTrace(trace,cycleStart);
    }

    public int getCycleStart() {
        return cycleStart;
    }

    public void setCycleStart(int cycleStart) {
        this.cycleStart = cycleStart;
    }

    private int cycleStart;

    public Trace getTrace() {
        return trace;
    }

    public void setTrace(Trace trace) {
        this.trace = trace;
    }
}
