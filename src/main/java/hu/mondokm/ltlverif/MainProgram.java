package hu.mondokm.ltlverif;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import hu.bme.mit.theta.analysis.pred.PredPrec;
import hu.bme.mit.theta.cfa.CFA;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarLexer;
import hu.bme.mit.theta.ltlverif.dsl.gen.LTLGrammarParser;
import hu.mondokm.ltlverif.antlr.APGeneratorVisitor;
import hu.mondokm.ltlverif.antlr.ToStringVisitor;
import hu.mondokm.ltlverif.buchi.AutomatonBuilder;
import hu.mondokm.ltlverif.buchi.BuchiAutomaton;
import hu.mondokm.ltlverif.cfa.CfaSUT;

public class MainProgram {

    public static void main(String[] args){
        try {
            long startTime = System.currentTimeMillis();
            long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            InputStream inputStream = new FileInputStream("src/main/resources/cfa/counter5_true.cfa");
            CFA cfa = CfaDslManager.createCfa(inputStream);
            HashMap<String,VarDecl<?>> vars=new HashMap<>();
            for(VarDecl<?> decl:cfa.getVars()){
                vars.put(decl.getName(),decl);
            }
            HashMap<String,Integer> literalToIntMap = new HashMap<String, Integer>();

            String text="G (x>50)";
            LTLGrammarLexer ltlLexer=new LTLGrammarLexer(CharStreams.fromString(text));
            CommonTokenStream ltlTokenStream=new CommonTokenStream(ltlLexer);
            LTLGrammarParser ltlParser=new LTLGrammarParser(ltlTokenStream);
            LTLGrammarParser.ModelContext ltlModel =ltlParser.model();
            ToStringVisitor toStringVisitor=new ToStringVisitor(new APGeneratorVisitor(vars, literalToIntMap));
            System.out.println();
            String ltlExpr=toStringVisitor.visitModel(ltlModel);
            System.out.println(ltlExpr);
            System.out.println(toStringVisitor.getAps().values());

            ProcessBuilder processBuilder=new ProcessBuilder("/usr/bin/ltl2tgba","!("+ltlExpr+")", "-CB");
            processBuilder.redirectError(new File("error.txt"));
            Process process=processBuilder.start();
            process.waitFor();

            AutomatonBuilder builder=new AutomatonBuilder();
            builder.setAps(toStringVisitor.getAps());
            BuchiAutomaton automaton=builder.parseAutomaton(process.getInputStream());

            boolean result=CegarVerifier.verifySUT(new CfaSUT(cfa),automaton, PredPrec.of(toStringVisitor.getAps().values())).isSafe();

            long stopTime = System.currentTimeMillis();
            long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            long elapsedTime = stopTime - startTime;
            long actualMemUsed=afterUsedMem-beforeUsedMem;

            System.out.println();
            System.out.println(result?"Ltl expression holds":"Ltl expression does not hold");
            System.out.println(elapsedTime/1000f + " s");
            System.out.println(actualMemUsed/1000000f+" MB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
