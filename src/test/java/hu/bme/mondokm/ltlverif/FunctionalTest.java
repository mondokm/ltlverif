package hu.bme.mondokm.ltlverif;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.mondokm.ltlverif.CegarVerifier;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import hu.mondokm.ltlverif.cfa.CfaSUT;
import hu.mondokm.ltlverif.ltl.LTLExpr;

@RunWith(Parameterized.class)
public class FunctionalTest {
	
    @Parameter(0)
    public String filepath;
    
    @Parameter(1)
    public String LTL;
    
    @Parameter(2)
    public boolean safety;
    
    private static final String ERR_CONSTR = "XG (not err)";

    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            //{"/cfa/counter100_true.cfa","G (x>50)", true},
            {"/cfa/ca-ex_false.cfa",	ERR_CONSTR, false},
            {"/cfa/counter5_true.cfa",	ERR_CONSTR, true},
            {"/cfa/counter5_false.cfa",	ERR_CONSTR, false},
            {"/cfa/gcd_true.cfa",		ERR_CONSTR, true},
            {"/cfa/locking_true.cfa", 	ERR_CONSTR, true},
            {"/cfa/odd_true.cfa", 		ERR_CONSTR, true},
            {"/cfa/afnp2014_true.cfa",	ERR_CONSTR, true},
        });
        // for all paths, globally not error from some point in the future
        // AG F(
    }
    
    InputStream getAutomatonFromLTL(String ltlExpr) throws IOException, InterruptedException {
    	// TODO append to PATH instead
        ProcessBuilder processBuilder=new ProcessBuilder("/home/user/usr/bin/ltl2tgba","!("+ltlExpr+")", "-CB");
        var processEnv = processBuilder.environment();
        var oldLibPath = processEnv.getOrDefault("LD_LIBRARY_PATH", "");
        processEnv.put("LD_LIBRARY_PATH", oldLibPath + ":" + "/home/user/usr/lib");
        Process process=processBuilder.start();
        process.waitFor();
        
        return process.getInputStream();
    }	
	
    private InputStream getAutomatonFromFile() throws IOException, InterruptedException {
        var fis = new FileInputStream("theta/cache/" + filepath.substring(5));
        return fis;
    }
    
    private CFA loadCFA() throws IOException {
    	InputStream inputStream = new FileInputStream(getClass().getResource(filepath).getFile());
        return CfaDslManager.createCfa(inputStream);
    }
	
    @Test
	public void test() throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        CFA cfa = loadCFA();
        
        HashMap<String,VarDecl<?>> vars=new HashMap<>();
        for(VarDecl<?> decl:cfa.getVars()){
            vars.put(decl.getName(),decl);
        }
        
        var ltlExpr = LTLExpr.from(LTL, vars);
        /*LTLGrammarLexer ltlLexer=new LTLGrammarLexer(CharStreams.fromString(LTL));
        CommonTokenStream ltlTokenStream=new CommonTokenStream(ltlLexer);
        LTLGrammarParser ltlParser=new LTLGrammarParser(ltlTokenStream);
        LTLGrammarParser.ModelContext ltlModel =ltlParser.model();
        ToStringVisitor toStringVisitor=new ToStringVisitor(new APGeneratorVisitor(vars, literalToIntMap));
        String ltlExpr=toStringVisitor.visitModel(ltlModel);
        System.out.println(ltlExpr);
        System.out.println(toStringVisitor.getAps().values());*/

        var is = getAutomatonFromLTL(ltlExpr.getLTLExpr());

        AutomatonBuilder builder=new AutomatonBuilder();
        builder.setAps(ltlExpr.getAps());
        BuchiAutomaton automaton=builder.parseAutomaton(is);

        var result = CegarVerifier.verifySUT(new CfaSUT(cfa),automaton, PredPrec.of(ltlExpr.getAps().values()));
        boolean resultSafety = result.isSafe();
        //System.out.println(result.asUnsafe().)
        
        long stopTime = System.currentTimeMillis();
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        long elapsedTime = stopTime - startTime;
        long actualMemUsed=afterUsedMem-beforeUsedMem;

        System.out.println();
        System.out.println(resultSafety?"Ltl expression holds":"Ltl expression does not hold");
        System.out.println(elapsedTime/1000f + " s");
        System.out.println(actualMemUsed/1000000f+" MB");

        Assert.assertEquals("Wrong result", resultSafety, safety);
	}
}
