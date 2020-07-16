
plugins {
    id("java-common")
    id("antlr-grammar")
    id("cli-tool")
}

dependencies {
    compile(project(":theta-cfa"))
    compile(project(":theta-cfa-analysis"))
    compile(project(":theta-solver-z3"))
    compile(project(":theta-solver"))
    compile(files("lib/jhoafparser-1.1.1.jar"))
    antlr("org.antlr:antlr4:4.1")
}

application {
    mainClassName = "hu.mondokm.ltlverif.LtlVerifCli"
}
/*
run {
    String libPath = "lib"
    environment.put('PATH', libPath)
    environment.put('LD_LIBRARY_PATH', libPath)
}*/