package hu.bme.mondokm.ltlverif;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarLexer;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarParser;
import hu.mondokm.ltlverif.CegarVerifier;
import hu.mondokm.ltlverif.antlr.APGeneratorVisitor;
import hu.mondokm.ltlverif.antlr.ToStringVisitor;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import hu.mondokm.ltlverif.cfa.CfaSUT;

@RunWith(Parameterized.class)
public class FunctionalTest {
	
    @Parameter(0)
    public String filepath;
    
    @Parameter(1)
    public String LTL;
    
    @Parameter(2)
    public boolean safety;
    
    private static final String ERR_CONSTR = "FG (not err)";

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
	
    @Test
	public void test() throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

        InputStream inputStream = new FileInputStream(getClass().getResource(filepath).getFile());
        CFA cfa = CfaDslManager.createCfa(inputStream);
        HashMap<String,VarDecl<?>> vars=new HashMap<>();
        for(VarDecl<?> decl:cfa.getVars()){
            vars.put(decl.getName(),decl);
        }
        HashMap<String,Integer> literalToIntMap = new HashMap<String, Integer>();

        LTLGrammarLexer ltlLexer=new LTLGrammarLexer(CharStreams.fromString(LTL));
        CommonTokenStream ltlTokenStream=new CommonTokenStream(ltlLexer);
        LTLGrammarParser ltlParser=new LTLGrammarParser(ltlTokenStream);
        LTLGrammarParser.ModelContext ltlModel =ltlParser.model();
        ToStringVisitor toStringVisitor=new ToStringVisitor(new APGeneratorVisitor(vars, literalToIntMap));
        System.out.println();
        String ltlExpr=toStringVisitor.visitModel(ltlModel);
        System.out.println(ltlExpr);
        System.out.println(toStringVisitor.getAps().values());

        // TODO append to PATH instead
        ProcessBuilder processBuilder=new ProcessBuilder("/home/user/usr/bin/ltl2tgba","!("+ltlExpr+")", "-CB");
        var processEnv = processBuilder.environment();
        var oldLibPath = processEnv.getOrDefault("LD_LIBRARY_PATH", "");
        processEnv.put("LD_LIBRARY_PATH", oldLibPath + ":" + "/home/user/usr/lib");
        Process process=processBuilder.start();
        process.waitFor();
        
        String errorText = new BufferedReader(new InputStreamReader(process.getErrorStream()))
        		  .lines().collect(Collectors.joining("\n"));
        
        if (!errorText.trim().isEmpty()) {
        	
            System.err.println(errorText);
        	throw new IOException("LTL2TGBA failed:\n" + errorText);
        }

        AutomatonBuilder builder=new AutomatonBuilder();
        builder.setAps(toStringVisitor.getAps());
        BuchiAutomaton automaton=builder.parseAutomaton(process.getInputStream());

        var result = CegarVerifier.verifySUT(new CfaSUT(cfa),automaton, PredPrec.of(toStringVisitor.getAps().values()));
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
