package hu.mondokm.ltlverif;

import hu.bme.mit.theta.cfa.*;
import hu.bme.mit.theta.cfa.dsl.CfaDslManager;
import hu.bme.mit.theta.core.decl.VarDecl;
import hu.bme.mit.theta.core.stmt.*;
import hu.bme.mit.theta.core.type.Type;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainProgram {

    public static void main(String[] args){
        try {
            final InputStream inputStream = new FileInputStream("src/main/resources/counter5_true.cfa");
            final CFA cfa = CfaDslManager.createCfa(inputStream);
            Tester tester=new Tester(cfa);
            tester.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
