package swcs.gof.behavioral.templatemethod;

public abstract class CrossCompiler {

    public final void crossCompile() {
        collectSource();
        compileToTarget();
    }

    // Template methods
    abstract void collectSource();

    abstract void compileToTarget();
}
