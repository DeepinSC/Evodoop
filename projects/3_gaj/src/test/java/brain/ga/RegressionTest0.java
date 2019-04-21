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
        brain.ga.Selector selector1 = null;
        try {
            gAAlgorithm0.setSelector(selector1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Evaluator evaluator3 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass10 = sexualCrossover9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            int int3 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            int int7 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass7 = mutator6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            int int5 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj5 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Evaluator evaluator1 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj3 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            int int11 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj7 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            int int13 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj13 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector2 = null;
        try {
            gAAlgorithm0.setSelector(selector2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass12 = evaluator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator4 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj15 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            int int15 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator4 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj14 = gAEnumAllelesSet0.allele((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            int int9 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass7 = mutator6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj17 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            int int19 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector4 = null;
        try {
            gAAlgorithm0.setSelector(selector4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNull(sexualCrossover3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass10 = mutator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj14 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            int int21 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.Selector selector18 = null;
        try {
            gAAlgorithm0.setSelector(selector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            int int17 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass11 = mutator10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            int int23 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            java.lang.Object obj24 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            java.lang.Object obj24 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            java.lang.Object obj23 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(mutator14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass10 = mutator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator2 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass8 = evaluator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        try {
            java.lang.Class<?> wildcardClass9 = selector8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Selector selector5 = null;
        try {
            gAAlgorithm0.setSelector(selector5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj21 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj19 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            int int25 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.Selector selector17 = null;
        try {
            gAAlgorithm0.setSelector(selector17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
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
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector17 = null;
        try {
            gAAlgorithm0.setSelector(selector17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            java.lang.Object obj24 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass9 = mutator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector15 = null;
        try {
            gAAlgorithm0.setSelector(selector15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Selector selector14 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator15 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator16 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector14);
        org.junit.Assert.assertNull(evaluator15);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj25 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass12 = sexualCrossover11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass15 = mutator14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(mutator14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
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
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass14 = mutator13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Selector selector14 = gAAlgorithm0.getSelector();
        try {
            java.lang.Class<?> wildcardClass15 = selector14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        brain.ga.Evaluator evaluator16 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.SexualCrossover sexualCrossover17 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector18 = null;
        try {
            gAAlgorithm0.setSelector(selector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(sexualCrossover14);
        org.junit.Assert.assertNull(sexualCrossover17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = null;
        try {
            gAAlgorithm0.setSelector(selector7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.Selector selector18 = null;
        try {
            gAAlgorithm0.setSelector(selector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector12 = null;
        try {
            gAAlgorithm0.setSelector(selector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector14 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(selector14);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(selector15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        try {
            int int4 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
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
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        try {
            java.lang.Object obj4 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector14 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator15 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(selector14);
        org.junit.Assert.assertNull(evaluator15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        try {
            java.lang.Class<?> wildcardClass14 = selector13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        try {
            java.lang.Object obj5 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator17 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(mutator15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        try {
            java.lang.Object obj24 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        try {
            java.lang.Object obj22 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator17 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector15);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        try {
            java.lang.Object obj5 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator6 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.SexualCrossover sexualCrossover17 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector18 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(sexualCrossover14);
        org.junit.Assert.assertNull(sexualCrossover17);
        org.junit.Assert.assertNull(selector18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector15 = null;
        try {
            gAAlgorithm0.setSelector(selector15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(sexualCrossover13);
        org.junit.Assert.assertNull(mutator14);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass4 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass16 = mutator15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(mutator15);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.Mutator mutator18 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector19 = null;
        try {
            gAAlgorithm0.setSelector(selector19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(mutator18);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass11 = evaluator10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        try {
            int int9 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        try {
            int int8 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj13 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover16 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator17 = null;
        gAAlgorithm0.setMutator(mutator17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(mutator15);
        org.junit.Assert.assertNull(sexualCrossover16);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(mutator14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.Mutator mutator17 = null;
        gAAlgorithm0.setMutator(mutator17);
        brain.ga.SexualCrossover sexualCrossover19 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            int int10 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = null;
        try {
            gAAlgorithm0.setSelector(selector13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector6 = null;
        try {
            gAAlgorithm0.setSelector(selector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass14 = sexualCrossover13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj14 = gAEnumAllelesSet0.allele(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            int int11 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        java.util.Vector vector25 = null;
        gAEnumAllelesSet0.setAlleles(vector25);
        try {
            int int27 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator15 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover16 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover16);
        brain.ga.Evaluator evaluator18 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(sexualCrossover14);
        org.junit.Assert.assertNull(evaluator15);
        org.junit.Assert.assertNull(evaluator18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            java.lang.Object obj10 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        try {
            java.lang.Object obj5 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        brain.ga.Evaluator evaluator16 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator15 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(evaluator15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.SexualCrossover sexualCrossover17 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover17);
        brain.ga.SexualCrossover sexualCrossover19 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(sexualCrossover19);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        try {
            java.lang.Object obj7 = gAEnumAllelesSet0.allele((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj12 = gAEnumAllelesSet0.allele(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        java.util.Vector vector25 = null;
        gAEnumAllelesSet0.setAlleles(vector25);
        try {
            java.lang.Object obj27 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass3 = mutator2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(sexualCrossover6);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = null;
        try {
            gAAlgorithm0.setSelector(selector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        try {
            java.lang.Class<?> wildcardClass10 = selector9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Selector selector5 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        try {
            java.lang.Class<?> wildcardClass14 = mutator13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Evaluator evaluator5 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(sexualCrossover3);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector12 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(selector12);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj15 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        try {
            int int6 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        try {
            java.lang.Object obj14 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Selector selector14 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator15 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover16 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover16);
        brain.ga.Evaluator evaluator18 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector14);
        org.junit.Assert.assertNull(evaluator15);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        brain.ga.SexualCrossover sexualCrossover16 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover16);
        brain.ga.Evaluator evaluator18 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        try {
            java.lang.Object obj7 = gAEnumAllelesSet0.allele((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
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
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        try {
            java.lang.Object obj11 = gAEnumAllelesSet0.allele();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(mutator14);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator16 = gAAlgorithm0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass17 = evaluator16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(evaluator16);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            int int15 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(sexualCrossover15);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator14 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        java.util.Vector vector10 = null;
        gAEnumAllelesSet0.setAlleles(vector10);
        try {
            int int12 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator4 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass9 = sexualCrossover8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        try {
            java.lang.Object obj8 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        try {
            java.lang.Object obj26 = gAEnumAllelesSet0.allele((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        try {
            java.lang.Object obj16 = gAEnumAllelesSet0.allele((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.SexualCrossover sexualCrossover10 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass4 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector8 = null;
        try {
            gAAlgorithm0.setSelector(selector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        try {
            java.lang.Object obj7 = gAEnumAllelesSet0.allele((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.util.Vector vector7 = null;
        gAEnumAllelesSet0.setAlleles(vector7);
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        java.util.Vector vector21 = null;
        gAEnumAllelesSet0.setAlleles(vector21);
        java.util.Vector vector23 = null;
        gAEnumAllelesSet0.setAlleles(vector23);
        java.util.Vector vector25 = null;
        gAEnumAllelesSet0.setAlleles(vector25);
        try {
            java.lang.Object obj28 = gAEnumAllelesSet0.allele((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator12 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator9 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass8 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector9 = null;
        gAEnumAllelesSet0.setAlleles(vector9);
        java.util.Vector vector11 = null;
        gAEnumAllelesSet0.setAlleles(vector11);
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        try {
            java.lang.Object obj18 = gAEnumAllelesSet0.allele(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.SexualCrossover sexualCrossover7 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover7);
        brain.ga.SexualCrossover sexualCrossover9 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Selector selector10 = null;
        try {
            gAAlgorithm0.setSelector(selector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator4 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(mutator4);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        brain.ga.SexualCrossover sexualCrossover16 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover16);
        brain.ga.Evaluator evaluator18 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover6 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover6);
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator15 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass11 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator13 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(mutator11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(sexualCrossover8);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.util.Vector vector5 = null;
        gAEnumAllelesSet0.setAlleles(vector5);
        java.lang.Class<?> wildcardClass7 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector8 = null;
        gAEnumAllelesSet0.setAlleles(vector8);
        java.util.Vector vector10 = null;
        gAEnumAllelesSet0.setAlleles(vector10);
        try {
            java.lang.Object obj13 = gAEnumAllelesSet0.allele((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.Selector selector11 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(evaluator13);
    }
}

