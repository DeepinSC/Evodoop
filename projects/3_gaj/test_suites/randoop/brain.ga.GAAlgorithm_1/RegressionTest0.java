import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Mutator mutator4 = null;
        gAAlgorithm0.setMutator(mutator4);
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = null;
        try {
            gAAlgorithm0.setSelector(selector1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator2 = null;
        gAAlgorithm0.setMutator(mutator2);
        brain.ga.Selector selector4 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        gAAlgorithm0.evolve();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator3 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(mutator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        org.junit.Assert.assertNull(mutator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
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
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
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
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
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
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
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
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover2 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover2);
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
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
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
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
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
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
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
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
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
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
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(mutator9);
    }
}

