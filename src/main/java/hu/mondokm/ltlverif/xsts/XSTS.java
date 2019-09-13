package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.decl.VarDecl;

import java.util.ArrayList;
import java.util.List;

public class XSTS {

    private List<VarDecl> vars=new ArrayList<VarDecl>();
    private List<TypeDecl> types=new ArrayList<TypeDecl>();
    private NonDetAction transitions;
    private NonDetAction initAction;

    public List<VarDecl> getVars() {
        return vars;
    }

    public void setVars(List<VarDecl> vars) {
        this.vars = vars;
    }

    public List<TypeDecl> getTypes() {
        return types;
    }

    public void setTypes(List<TypeDecl> types) {
        this.types = types;
    }

    public NonDetAction getTransitions() {
        return transitions;
    }

    public void setTransitions(NonDetAction transitions) {
        this.transitions = transitions;
    }

    public NonDetAction getInitAction() {
        return initAction;
    }

    public void setInitAction(NonDetAction initAction) {
        this.initAction = initAction;
    }
}
