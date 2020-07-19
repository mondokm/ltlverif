package hu.mondokm.ltlverif.ltl;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.type.Expr;
import hu.bme.mit.theta.core.type.booltype.BoolType;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarLexer;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarParser;
import hu.mondokm.ltlverif.antlr.APGeneratorVisitor;
import hu.mondokm.ltlverif.antlr.ToStringVisitor;

public class LTLExpr {
	
	private final Map<String,Integer> literalToIntMap;
	private final Map<String,Expr<BoolType>> aps;
	private final String ltlExpr;
	
	public LTLExpr(Map<String,Integer> literalToIntMap, String ltlExpr, Map<String,Expr<BoolType>> aps) {
		this.literalToIntMap = literalToIntMap;
		this.ltlExpr = ltlExpr;
		this.aps = aps;
	}
	
	public static LTLExpr from(String LTL, Map<String,VarDecl<?>> vars) {
		Map<String,Integer> literalToIntMap = new HashMap<String, Integer>();
		LTLGrammarLexer ltlLexer=new LTLGrammarLexer(CharStreams.fromString(LTL));
        CommonTokenStream ltlTokenStream=new CommonTokenStream(ltlLexer);
        LTLGrammarParser ltlParser=new LTLGrammarParser(ltlTokenStream);
        LTLGrammarParser.ModelContext ltlModel =ltlParser.model();
        ToStringVisitor toStringVisitor=new ToStringVisitor(new APGeneratorVisitor(vars, literalToIntMap));
        String ltlExpr = toStringVisitor.visitModel(ltlModel);
        return new LTLExpr(literalToIntMap, ltlExpr, toStringVisitor.getAps());
	}

	public String getLTLExpr() {
		return ltlExpr;
	}
	
	public Map<String, Expr<BoolType>> getAps() {
		return aps;
	}
}
