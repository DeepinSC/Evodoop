import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        double double2 = vectorGenome0.getScore();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        double double1 = vectorGenome0.getScore();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        double double3 = vectorGenome0.getScore();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        double double4 = vectorGenome0.getScore();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        int int5 = vectorGenome4.getGenesCount();
        int int6 = vectorGenome4.getGenesCount();
        vectorGenome4.initialize();
        brain.ga.Evaluator evaluator8 = vectorGenome4.getEvaluator();
        int int9 = vectorGenome0.compareTo((java.lang.Object) vectorGenome4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        double double4 = vectorGenome0.getScore();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        double double3 = vectorGenome0.getScore();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        int int4 = vectorGenome2.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        int int6 = vectorGenome0.compareTo((java.lang.Object) vectorGenome2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        double double5 = vectorGenome0.getScore();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        double double4 = vectorGenome0.getScore();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator5 = vectorGenome4.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorGenome4.getEvaluator();
        int int7 = vectorGenome4.getGenesCount();
        brain.ga.Evaluator evaluator8 = vectorGenome4.getEvaluator();
        int int9 = vectorGenome0.compareTo((java.lang.Object) vectorGenome4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        double double5 = vectorGenome0.getScore();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        int int5 = vectorGenome0.compareTo((java.lang.Object) vectorGenome2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        double double6 = vectorGenome0.getScore();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome3 = new brain.ga.VectorGenome();
        vectorGenome3.initialize();
        brain.ga.Evaluator evaluator5 = vectorGenome3.getEvaluator();
        int int6 = vectorGenome3.getGenesCount();
        brain.ga.Evaluator evaluator7 = vectorGenome3.getEvaluator();
        int int8 = vectorGenome0.compareTo((java.lang.Object) vectorGenome3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        double double6 = vectorGenome0.getScore();
    }
}

