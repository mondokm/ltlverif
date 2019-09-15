package hu.mondokm.ltlverif.xsts;

import hu.bme.mit.theta.core.stmt.Stmt;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;

import java.util.List;

public interface Action {

    List<List<Stmt>> getStmts();

}
