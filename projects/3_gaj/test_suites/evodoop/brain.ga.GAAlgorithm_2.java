import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator2 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Mutator mutator4 = null;
        gAAlgorithm0.setMutator(mutator4);
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.Selector selector15 = null;
        try {
            gAAlgorithm0.setSelector(selector15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = null;
        try {
            gAAlgorithm0.setSelector(selector1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector2 = null;
        try {
            gAAlgorithm0.setSelector(selector2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass4 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        java.lang.Class<?> wildcardClass1 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        org.junit.Assert.assertNull(mutator1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator18 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(mutator16);
        org.junit.Assert.assertNull(mutator18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(selector1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator4 = null;
        gAAlgorithm0.setMutator(mutator4);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator2 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator16 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        brain.ga.Selector selector17 = null;
        try {
            gAAlgorithm0.setSelector(selector17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(sexualCrossover4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.Selector selector18 = null;
        try {
            gAAlgorithm0.setSelector(selector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector4 = null;
        try {
            gAAlgorithm0.setSelector(selector4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator2 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        brain.ga.Selector selector4 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover17 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(mutator16);
        org.junit.Assert.assertNull(sexualCrossover17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator17 = null;
        gAAlgorithm0.setMutator(mutator17);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass11 = evaluator10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator17 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass6 = mutator5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(mutator2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(mutator3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        brain.ga.Mutator mutator4 = null;
        gAAlgorithm0.setMutator(mutator4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass17 = mutator16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        brain.ga.Selector selector4 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector16 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator17 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator15);
        org.junit.Assert.assertNull(selector16);
        org.junit.Assert.assertNull(evaluator17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass18 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(mutator16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(mutator4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass15 = evaluator14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

