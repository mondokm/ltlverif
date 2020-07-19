package hu.mondokm.ltlverif.abstractor;

import hu.bme.mit.theta.analysis.Trace;
import hu.bme.mit.theta.analysis.expr.ExprAction;
import hu.bme.mit.theta.analysis.expr.ExprState;

public class InfTrace {

	// trace contains the cycle's start, so trace[cycleStart] == trace.last() ?
    private Trace<ExprState, ExprAction> trace;
    // can be -1 (if no cycle?)
    private int cycleStart;

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

    public Trace<ExprState, ExprAction> getTrace() {
        return trace;
    }

    public void setTrace(Trace<ExprState, ExprAction> trace) {
        this.trace = trace;
    }
}
