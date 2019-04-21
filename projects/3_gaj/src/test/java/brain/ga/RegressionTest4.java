import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test001");
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
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test002");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test003");
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
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test004");
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
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test005");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover9 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover9);
        brain.ga.Evaluator evaluator11 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test006");
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
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test007");
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
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator13 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test008");
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
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test009");
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
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = null;
        gAAlgorithm0.setMutator(mutator13);
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        brain.ga.Mutator mutator17 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(mutator17);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test010");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test011");
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
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test012");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        java.lang.Class<?> wildcardClass12 = gAAlgorithm0.getClass();
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test013");
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
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(sexualCrossover14);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test014");
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
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test015");
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
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test016");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test017");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass8 = sexualCrossover7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test018");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test019");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test020");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.Evaluator evaluator3 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test021");
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
        java.lang.Class<?> wildcardClass12 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector13 = null;
        gAEnumAllelesSet0.setAlleles(vector13);
        java.util.Vector vector15 = null;
        gAEnumAllelesSet0.setAlleles(vector15);
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        java.util.Vector vector19 = null;
        gAEnumAllelesSet0.setAlleles(vector19);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test022");
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
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(selector15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test023");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator8 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test024");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(mutator7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test025");
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
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector16 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover17 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(selector15);
        org.junit.Assert.assertNull(selector16);
        org.junit.Assert.assertNull(sexualCrossover17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test026");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test027");
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
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator16 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(evaluator16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test028");
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
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.SexualCrossover sexualCrossover18 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover18);
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test029");
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
        try {
            java.lang.Class<?> wildcardClass14 = mutator13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test030");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator9 = null;
        gAAlgorithm0.setMutator(mutator9);
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test031");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test032");
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
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test033");
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
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector15 = null;
        try {
            gAAlgorithm0.setSelector(selector15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(sexualCrossover9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test034");
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
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator16 = null;
        gAAlgorithm0.setMutator(mutator16);
        brain.ga.SexualCrossover sexualCrossover18 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator21 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(sexualCrossover18);
        org.junit.Assert.assertNull(evaluator21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test035");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator10 = null;
        try {
            gAAlgorithm0.setEvaluator(evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(mutator9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test036");
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
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test037");
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
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector17 = null;
        try {
            gAAlgorithm0.setSelector(selector17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test038");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass4 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector9 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test039");
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
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test040");
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
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        java.lang.Class<?> wildcardClass17 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator18 = null;
        gAAlgorithm0.setMutator(mutator18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test041");
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
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test042");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test043");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass7 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator12 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator11);
        org.junit.Assert.assertNull(mutator12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test044");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = null;
        gAAlgorithm0.setMutator(mutator5);
        brain.ga.Mutator mutator7 = null;
        gAAlgorithm0.setMutator(mutator7);
        brain.ga.Mutator mutator9 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover10 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover10);
        brain.ga.SexualCrossover sexualCrossover12 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(sexualCrossover12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test045");
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
        java.util.Vector vector17 = null;
        gAEnumAllelesSet0.setAlleles(vector17);
        try {
            java.lang.Object obj20 = gAEnumAllelesSet0.allele((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test046");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator4 = null;
        gAAlgorithm0.setMutator(mutator4);
        org.junit.Assert.assertNull(sexualCrossover3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test047");
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
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test048");
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
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test049");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test050");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test051");
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
        brain.ga.SexualCrossover sexualCrossover17 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover17);
        java.lang.Class<?> wildcardClass19 = gAAlgorithm0.getClass();
        brain.ga.Selector selector20 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover21 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover21);
        brain.ga.SexualCrossover sexualCrossover23 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover23);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(selector20);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test052");
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
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(sexualCrossover13);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test053");
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
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        brain.ga.SexualCrossover sexualCrossover17 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(sexualCrossover17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test054");
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
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test055");
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
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test056");
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
        brain.ga.Selector selector13 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(selector13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test057");
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
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.SexualCrossover sexualCrossover17 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover17);
        brain.ga.Selector selector19 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover20 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover20);
        brain.ga.Mutator mutator22 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover23 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover23);
        brain.ga.Evaluator evaluator25 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(selector19);
        org.junit.Assert.assertNull(mutator22);
        org.junit.Assert.assertNull(evaluator25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test058");
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
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator15 = null;
        gAAlgorithm0.setMutator(mutator15);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(sexualCrossover11);
        org.junit.Assert.assertNull(evaluator14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test059");
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
        brain.ga.Evaluator evaluator16 = gAAlgorithm0.getEvaluator();
        gAAlgorithm0.evolve();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector14);
        org.junit.Assert.assertNull(evaluator15);
        org.junit.Assert.assertNull(evaluator16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test060");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Evaluator evaluator11 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test061");
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
        java.lang.Class<?> wildcardClass18 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator19 = null;
        gAAlgorithm0.setMutator(mutator19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test062");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover8 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover8);
        brain.ga.Mutator mutator10 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector11 = null;
        try {
            gAAlgorithm0.setSelector(selector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(mutator10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test063");
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
        brain.ga.SexualCrossover sexualCrossover17 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover17);
        brain.ga.SexualCrossover sexualCrossover19 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test064");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator11 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(mutator11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test065");
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
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test066");
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
        java.lang.Class<?> wildcardClass14 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover15 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator17 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator18 = null;
        gAAlgorithm0.setMutator(mutator18);
        brain.ga.SexualCrossover sexualCrossover20 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover20);
        brain.ga.SexualCrossover sexualCrossover22 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover22);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(sexualCrossover15);
        org.junit.Assert.assertNull(mutator16);
        org.junit.Assert.assertNull(mutator17);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test067");
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
        java.lang.Class<?> wildcardClass19 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator20 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator21 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover22 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass23 = sexualCrossover22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(mutator20);
        org.junit.Assert.assertNull(mutator21);
        org.junit.Assert.assertNull(sexualCrossover22);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test068");
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
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        brain.ga.Selector selector16 = null;
        try {
            gAAlgorithm0.setSelector(selector16);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test069");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.util.Vector vector2 = null;
        gAEnumAllelesSet0.setAlleles(vector2);
        java.util.Vector vector4 = null;
        gAEnumAllelesSet0.setAlleles(vector4);
        java.util.Vector vector6 = null;
        gAEnumAllelesSet0.setAlleles(vector6);
        try {
            java.lang.Object obj9 = gAEnumAllelesSet0.allele((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test070");
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
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        gAAlgorithm0.evolve();
        brain.ga.Selector selector16 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover18 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(selector16);
        org.junit.Assert.assertNull(sexualCrossover18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test071");
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
        brain.ga.Mutator mutator10 = null;
        gAAlgorithm0.setMutator(mutator10);
        brain.ga.SexualCrossover sexualCrossover12 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover12);
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector18 = null;
        try {
            gAAlgorithm0.setSelector(selector18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNull(mutator15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test072");
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
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test073");
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
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(mutator9);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test074");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass2 = gAAlgorithm0.getClass();
        brain.ga.Selector selector3 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover4 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover4);
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator8 = null;
        gAAlgorithm0.setMutator(mutator8);
        org.junit.Assert.assertNull(sexualCrossover1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test075");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test076");
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
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.Mutator mutator17 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator18 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(sexualCrossover14);
        org.junit.Assert.assertNull(mutator17);
        org.junit.Assert.assertNull(evaluator18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test077");
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
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator11 = null;
        gAAlgorithm0.setMutator(mutator11);
        java.lang.Class<?> wildcardClass13 = gAAlgorithm0.getClass();
        brain.ga.SexualCrossover sexualCrossover14 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test078");
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
        gAAlgorithm0.evolve();
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test079");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass8 = gAAlgorithm0.getClass();
        brain.ga.Selector selector9 = null;
        try {
            gAAlgorithm0.setSelector(selector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test080");
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
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        gAAlgorithm0.evolve();
        brain.ga.Mutator mutator14 = null;
        gAAlgorithm0.setMutator(mutator14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test081");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover6 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        try {
            java.lang.Class<?> wildcardClass8 = sexualCrossover7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(sexualCrossover6);
        org.junit.Assert.assertNull(sexualCrossover7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test082");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        try {
            java.lang.Object obj6 = gAEnumAllelesSet0.allele((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test083");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.SexualCrossover sexualCrossover5 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator8 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(sexualCrossover5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test084");
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
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.Mutator mutator13 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector14 = null;
        try {
            gAAlgorithm0.setSelector(selector14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(mutator13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test085");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Mutator mutator1 = null;
        gAAlgorithm0.setMutator(mutator1);
        brain.ga.SexualCrossover sexualCrossover3 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover5 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover5);
        brain.ga.Mutator mutator7 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(sexualCrossover3);
        org.junit.Assert.assertNull(mutator7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test086");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector8 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test087");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        brain.ga.SexualCrossover sexualCrossover3 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover3);
        brain.ga.Mutator mutator5 = gAAlgorithm0.getMutator();
        brain.ga.Evaluator evaluator6 = gAAlgorithm0.getEvaluator();
        brain.ga.Selector selector7 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator8 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNull(mutator8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test088");
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
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator15 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator16 = gAAlgorithm0.getMutator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(mutator12);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(mutator15);
        org.junit.Assert.assertNull(mutator16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test089");
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
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator16 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator17 = null;
        gAAlgorithm0.setMutator(mutator17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector15);
        org.junit.Assert.assertNull(evaluator16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test090");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.Selector selector1 = gAAlgorithm0.getSelector();
        brain.ga.Mutator mutator2 = gAAlgorithm0.getMutator();
        brain.ga.Mutator mutator3 = null;
        gAAlgorithm0.setMutator(mutator3);
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Selector selector6 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator7 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(mutator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test091");
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
        java.lang.Class<?> wildcardClass17 = gAEnumAllelesSet0.getClass();
        try {
            java.lang.Object obj19 = gAEnumAllelesSet0.allele((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test092");
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
        brain.ga.Evaluator evaluator10 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover11 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.Mutator mutator12 = null;
        gAAlgorithm0.setMutator(mutator12);
        org.junit.Assert.assertNull(selector1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(sexualCrossover11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test093");
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
        brain.ga.Evaluator evaluator12 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover13 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNull(sexualCrossover13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test094");
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
        java.lang.Class<?> wildcardClass10 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNull(mutator5);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test095");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.util.Vector vector1 = null;
        gAEnumAllelesSet0.setAlleles(vector1);
        java.util.Vector vector3 = null;
        gAEnumAllelesSet0.setAlleles(vector3);
        java.lang.Class<?> wildcardClass5 = gAEnumAllelesSet0.getClass();
        try {
            int int6 = gAEnumAllelesSet0.size();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test096");
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
        brain.ga.Mutator mutator14 = gAAlgorithm0.getMutator();
        java.lang.Class<?> wildcardClass15 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator16 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator8);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(sexualCrossover12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(mutator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(evaluator16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test097");
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
        brain.ga.SexualCrossover sexualCrossover14 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.Mutator mutator17 = gAAlgorithm0.getMutator();
        brain.ga.Selector selector18 = gAAlgorithm0.getSelector();
        brain.ga.Evaluator evaluator19 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(sexualCrossover14);
        org.junit.Assert.assertNull(mutator17);
        org.junit.Assert.assertNull(selector18);
        org.junit.Assert.assertNull(evaluator19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test098");
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
        brain.ga.SexualCrossover sexualCrossover11 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover11);
        brain.ga.SexualCrossover sexualCrossover13 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover13);
        brain.ga.Selector selector15 = gAAlgorithm0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator10);
        org.junit.Assert.assertNull(selector15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test099");
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
        brain.ga.Evaluator evaluator14 = gAAlgorithm0.getEvaluator();
        brain.ga.SexualCrossover sexualCrossover15 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover15);
        brain.ga.SexualCrossover sexualCrossover17 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover17);
        brain.ga.Selector selector19 = gAAlgorithm0.getSelector();
        brain.ga.Selector selector20 = gAAlgorithm0.getSelector();
        brain.ga.SexualCrossover sexualCrossover21 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover21);
        java.lang.Class<?> wildcardClass23 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator24 = gAAlgorithm0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover9);
        org.junit.Assert.assertNull(mutator13);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNull(selector19);
        org.junit.Assert.assertNull(selector20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(evaluator24);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test100");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        gAAlgorithm0.evolve();
        brain.ga.Evaluator evaluator5 = gAAlgorithm0.getEvaluator();
        brain.ga.Mutator mutator6 = null;
        gAAlgorithm0.setMutator(mutator6);
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        java.lang.Class<?> wildcardClass9 = gAAlgorithm0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test101");
        brain.ga.GAAlgorithm gAAlgorithm0 = new brain.ga.GAAlgorithm();
        brain.ga.SexualCrossover sexualCrossover1 = null;
        gAAlgorithm0.setCrossoverOperator(sexualCrossover1);
        java.lang.Class<?> wildcardClass3 = gAAlgorithm0.getClass();
        brain.ga.Evaluator evaluator4 = gAAlgorithm0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = gAAlgorithm0.getClass();
        brain.ga.Mutator mutator6 = gAAlgorithm0.getMutator();
        brain.ga.SexualCrossover sexualCrossover7 = gAAlgorithm0.getCrossoverOperator();
        brain.ga.SexualCrossover sexualCrossover8 = gAAlgorithm0.getCrossoverOperator();
        gAAlgorithm0.evolve();
        brain.ga.Selector selector10 = gAAlgorithm0.getSelector();
        gAAlgorithm0.evolve();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(mutator6);
        org.junit.Assert.assertNull(sexualCrossover7);
        org.junit.Assert.assertNull(sexualCrossover8);
        org.junit.Assert.assertNull(selector10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test102");
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
        gAAlgorithm0.evolve();
        brain.ga.SexualCrossover sexualCrossover16 = gAAlgorithm0.getCrossoverOperator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector11);
        org.junit.Assert.assertNull(selector14);
        org.junit.Assert.assertNull(sexualCrossover16);
    }
}

