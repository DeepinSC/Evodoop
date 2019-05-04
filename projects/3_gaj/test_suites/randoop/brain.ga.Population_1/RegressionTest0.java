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
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        try {
            brain.ga.Genome genome3 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        try {
            java.lang.Class<?> wildcardClass4 = selector3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.Population population0 = new brain.ga.Population();
        try {
            brain.ga.Genome genome2 = population0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            brain.ga.Genome genome6 = population0.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        try {
            brain.ga.Genome genome5 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        java.lang.Class<?> wildcardClass5 = population0.getClass();
        try {
            brain.ga.Genome genome6 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            brain.ga.Genome genome6 = population0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Population population5 = new brain.ga.Population();
        java.util.List list6 = population5.genoms;
        java.lang.Class<?> wildcardClass7 = list6.getClass();
        population0.genoms = list6;
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.setGenomeSize((int) (short) 100);
        try {
            brain.ga.Genome genome5 = population0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        try {
            brain.ga.Genome genome6 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        try {
            brain.ga.Genome genome7 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.Population population0 = new brain.ga.Population();
        try {
            brain.ga.Genome genome2 = population0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        try {
            brain.ga.Genome genome3 = population0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        try {
            brain.ga.Genome genome8 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            brain.ga.Genome genome6 = population0.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            brain.ga.Genome genome5 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        try {
            brain.ga.Genome genome6 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        try {
            brain.ga.Genome genome3 = population0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        try {
            brain.ga.Genome genome7 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        int int9 = population0.getSize();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        int int6 = population0.getSize();
        brain.ga.Evaluator evaluator7 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        java.util.List list3 = population0.genoms;
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        population0.setGenomeSize(0);
        population0.sort();
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        try {
            brain.ga.Genome genome10 = population0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        try {
            brain.ga.Genome genome6 = population0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 51, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet5 = null;
        population0.initialize(gAEnumAllelesSet5);
        brain.ga.Selector selector7 = null;
        population0.setSelector(selector7);
        brain.ga.Selector selector9 = null;
        population0.setSelector(selector9);
        brain.ga.Evaluator evaluator11 = null;
        population0.setEvaluator(evaluator11);
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        try {
            brain.ga.Genome genome8 = population0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        try {
            brain.ga.Genome genome7 = population0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        brain.ga.Population population4 = new brain.ga.Population();
        brain.ga.Evaluator evaluator5 = null;
        population4.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population4.getSelector();
        brain.ga.Population population8 = new brain.ga.Population();
        java.util.List list9 = population8.genoms;
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        population4.genoms = list9;
        population0.genoms = list9;
        brain.ga.Evaluator evaluator13 = null;
        population0.setEvaluator(evaluator13);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        population0.initialize(gAEnumAllelesSet15);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        population0.sort();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        population0.initialize(gAEnumAllelesSet8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        try {
            brain.ga.Genome genome6 = population0.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        brain.ga.Selector selector6 = population0.getSelector();
        try {
            java.lang.Class<?> wildcardClass7 = selector6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        population0.setEvaluator(evaluator9);
        java.lang.Class<?> wildcardClass11 = population0.getClass();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        try {
            brain.ga.Genome genome6 = population0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Selector selector5 = population0.getSelector();
        try {
            brain.ga.Genome genome7 = population0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        try {
            brain.ga.Genome genome7 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        try {
            brain.ga.Genome genome8 = population0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        int int6 = population0.getSize();
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        brain.ga.Selector selector9 = population0.getSelector();
        try {
            brain.ga.Genome genome11 = population0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        try {
            brain.ga.Genome genome8 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        java.util.List list6 = population0.genoms;
        java.util.List list7 = population0.genoms;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Selector selector5 = population0.getSelector();
        java.util.List list6 = population0.genoms;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        java.util.List list3 = population0.genoms;
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.Selector selector4 = null;
        population0.setSelector(selector4);
        try {
            brain.ga.Genome genome6 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.setGenomeSize(0);
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Evaluator evaluator9 = population0.getEvaluator();
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        population0.initialize(gAEnumAllelesSet9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        population0.setEvaluator(evaluator9);
        brain.ga.Evaluator evaluator11 = null;
        population0.setEvaluator(evaluator11);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        try {
            brain.ga.Genome genome8 = population0.get(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        java.lang.Class<?> wildcardClass3 = population0.getClass();
        int int4 = population0.getSize();
        try {
            brain.ga.Genome genome6 = population0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        population0.sort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.setGenomeSize((int) (short) 100);
        population0.sort();
        brain.ga.Selector selector5 = population0.getSelector();
        try {
            brain.ga.Genome genome7 = population0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = null;
        population0.setSelector(selector8);
        java.lang.Class<?> wildcardClass10 = population0.getClass();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.util.List list3 = population0.genoms;
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        int int6 = population0.getSize();
        java.util.List list7 = population0.genoms;
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        brain.ga.Selector selector7 = population0.getSelector();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        population0.sort();
        java.lang.Class<?> wildcardClass8 = population0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Selector selector5 = population0.getSelector();
        brain.ga.Evaluator evaluator6 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        population0.setGenomeSize((int) (short) 1);
        int int6 = population0.getGenomeSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        population0.setEvaluator(evaluator9);
        try {
            brain.ga.Genome genome12 = population0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 34, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Selector selector8 = population0.getSelector();
        brain.ga.Evaluator evaluator9 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        try {
            brain.ga.Genome genome5 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) '#');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        java.lang.Class<?> wildcardClass8 = population0.getClass();
        try {
            brain.ga.Genome genome10 = population0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        int int6 = population0.getSize();
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        brain.ga.Selector selector9 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector11 = population0.getSelector();
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(selector11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        java.lang.Class<?> wildcardClass3 = population0.getClass();
        try {
            brain.ga.Genome genome4 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        population0.setGenomeSize((int) (short) 1);
        brain.ga.Evaluator evaluator6 = population0.getEvaluator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population0.getSelector();
        population0.setGenomeSize(10);
        brain.ga.Evaluator evaluator10 = null;
        population0.setEvaluator(evaluator10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        population0.sort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.util.List list3 = population0.genoms;
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        population0.setGenomeSize(10);
        try {
            brain.ga.Genome genome8 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        int int3 = population0.getGenomeSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        int int2 = population0.getSize();
        brain.ga.Evaluator evaluator3 = null;
        population0.setEvaluator(evaluator3);
        brain.ga.Selector selector5 = population0.getSelector();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        int int9 = population0.getSize();
        brain.ga.Evaluator evaluator10 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet5 = null;
        population0.initialize(gAEnumAllelesSet5);
        brain.ga.Selector selector7 = null;
        population0.setSelector(selector7);
        brain.ga.Population population9 = new brain.ga.Population();
        brain.ga.Selector selector10 = null;
        population9.setSelector(selector10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        population9.initialize(gAEnumAllelesSet12);
        java.util.List list14 = population9.genoms;
        java.util.List list15 = population9.genoms;
        population0.genoms = list15;
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        brain.ga.Selector selector7 = population0.getSelector();
        java.util.List list8 = population0.genoms;
        int int9 = population0.getSize();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        population0.initialize(gAEnumAllelesSet10);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        int int6 = population0.getSize();
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        int int8 = population0.getGenomeSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet5 = null;
        population0.initialize(gAEnumAllelesSet5);
        brain.ga.Selector selector7 = null;
        population0.setSelector(selector7);
        java.lang.Class<?> wildcardClass9 = population0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.setGenomeSize(0);
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Evaluator evaluator9 = population0.getEvaluator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        population0.initialize(gAEnumAllelesSet10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        population0.initialize(gAEnumAllelesSet3);
        population0.setGenomeSize((int) (short) 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            java.lang.Class<?> wildcardClass5 = selector4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        int int6 = population0.getSize();
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        brain.ga.Selector selector9 = population0.getSelector();
        java.lang.Class<?> wildcardClass10 = population0.getClass();
        brain.ga.Evaluator evaluator11 = population0.getEvaluator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        population0.initialize(gAEnumAllelesSet12);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) '#');
        int int6 = population0.getGenomeSize();
        java.util.List list7 = population0.genoms;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        int int5 = population0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        int int5 = population0.getGenomeSize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Selector selector8 = null;
        population0.setSelector(selector8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        population0.sort();
        brain.ga.Population population5 = new brain.ga.Population();
        brain.ga.Selector selector6 = null;
        population5.setSelector(selector6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        population5.initialize(gAEnumAllelesSet8);
        java.util.List list10 = population5.genoms;
        java.util.List list11 = population5.genoms;
        population0.genoms = list11;
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        try {
            brain.ga.Genome genome7 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        brain.ga.Population population4 = new brain.ga.Population();
        brain.ga.Evaluator evaluator5 = null;
        population4.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population4.getSelector();
        brain.ga.Population population8 = new brain.ga.Population();
        java.util.List list9 = population8.genoms;
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        population4.genoms = list9;
        population0.genoms = list9;
        brain.ga.Evaluator evaluator13 = null;
        population0.setEvaluator(evaluator13);
        try {
            brain.ga.Genome genome15 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        brain.ga.Evaluator evaluator3 = null;
        population0.setEvaluator(evaluator3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        brain.ga.Population population4 = new brain.ga.Population();
        brain.ga.Evaluator evaluator5 = null;
        population4.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population4.getSelector();
        brain.ga.Population population8 = new brain.ga.Population();
        java.util.List list9 = population8.genoms;
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        population4.genoms = list9;
        population0.genoms = list9;
        int int13 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass14 = population0.getClass();
        brain.ga.Evaluator evaluator15 = population0.getEvaluator();
        int int16 = population0.getSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(evaluator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        brain.ga.Selector selector6 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        try {
            brain.ga.Genome genome8 = population0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet7 = null;
        population0.initialize(gAEnumAllelesSet7);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Population population9 = new brain.ga.Population();
        brain.ga.Evaluator evaluator10 = null;
        population9.setEvaluator(evaluator10);
        brain.ga.Selector selector12 = population9.getSelector();
        brain.ga.Selector selector13 = population9.getSelector();
        brain.ga.Selector selector14 = null;
        population9.setSelector(selector14);
        brain.ga.Selector selector16 = population9.getSelector();
        java.util.List list17 = population9.genoms;
        population0.genoms = list17;
        population0.setGenomeSize((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(selector16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        population0.setGenomeSize((int) (short) 1);
        brain.ga.Selector selector8 = null;
        population0.setSelector(selector8);
        population0.sort();
        int int11 = population0.getSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        int int9 = population0.getSize();
        int int10 = population0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        int int2 = population0.getGenomeSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        int int7 = population0.getGenomeSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        population0.sort();
        java.util.List list6 = population0.genoms;
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        try {
            brain.ga.Genome genome9 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = population0.getSelector();
        brain.ga.Evaluator evaluator6 = null;
        population0.setEvaluator(evaluator6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        population0.setGenomeSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) '#');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        int int8 = population0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        brain.ga.Selector selector5 = population0.getSelector();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.util.List list3 = population0.genoms;
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        population0.setGenomeSize(10);
        brain.ga.Population population8 = new brain.ga.Population();
        java.util.List list9 = population8.genoms;
        int int10 = population8.getGenomeSize();
        java.util.List list11 = population8.genoms;
        population0.genoms = list11;
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        int int6 = population0.getSize();
        java.util.List list7 = population0.genoms;
        brain.ga.Selector selector8 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.setGenomeSize(0);
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        population0.initialize(gAEnumAllelesSet8);
        java.util.List list10 = population0.genoms;
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        brain.ga.Population population4 = new brain.ga.Population();
        int int5 = population4.getGenomeSize();
        brain.ga.Selector selector6 = null;
        population4.setSelector(selector6);
        int int8 = population4.getSize();
        int int9 = population4.getGenomeSize();
        int int10 = population4.getSize();
        java.util.List list11 = population4.genoms;
        java.util.List list12 = population4.genoms;
        population0.genoms = list12;
        int int14 = population0.getGenomeSize();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        population0.initialize(gAEnumAllelesSet15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Population population4 = new brain.ga.Population();
        java.util.List list5 = population4.genoms;
        java.lang.Class<?> wildcardClass6 = list5.getClass();
        population0.genoms = list5;
        brain.ga.Selector selector8 = population0.getSelector();
        brain.ga.Evaluator evaluator9 = null;
        population0.setEvaluator(evaluator9);
        brain.ga.Population population11 = new brain.ga.Population();
        java.util.List list12 = population11.genoms;
        population11.sort();
        java.util.List list14 = population11.genoms;
        population0.genoms = list14;
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(selector8);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = population0.getSelector();
        population0.sort();
        int int8 = population0.getGenomeSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.sort();
        brain.ga.Selector selector6 = population0.getSelector();
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.util.List list3 = population0.genoms;
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        brain.ga.Evaluator evaluator6 = null;
        population0.setEvaluator(evaluator6);
        try {
            brain.ga.Genome genome8 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        population0.initialize(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.sort();
        java.util.List list6 = population0.genoms;
        brain.ga.Evaluator evaluator7 = null;
        population0.setEvaluator(evaluator7);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        population0.initialize(gAEnumAllelesSet6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        brain.ga.Evaluator evaluator6 = population0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        int int5 = population0.getGenomeSize();
        brain.ga.Population population6 = new brain.ga.Population();
        int int7 = population6.getGenomeSize();
        brain.ga.Evaluator evaluator8 = null;
        population6.setEvaluator(evaluator8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        population6.initialize(gAEnumAllelesSet10);
        java.util.List list12 = population6.genoms;
        population0.genoms = list12;
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass3 = population0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        brain.ga.Population population7 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass8 = population7.getClass();
        brain.ga.Selector selector9 = null;
        population7.setSelector(selector9);
        java.util.List list11 = population7.genoms;
        population0.genoms = list11;
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        brain.ga.Selector selector6 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.sort();
        brain.ga.Evaluator evaluator6 = population0.getEvaluator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Population population9 = new brain.ga.Population();
        brain.ga.Evaluator evaluator10 = null;
        population9.setEvaluator(evaluator10);
        brain.ga.Selector selector12 = population9.getSelector();
        brain.ga.Selector selector13 = population9.getSelector();
        brain.ga.Selector selector14 = null;
        population9.setSelector(selector14);
        brain.ga.Selector selector16 = population9.getSelector();
        java.util.List list17 = population9.genoms;
        population0.genoms = list17;
        java.util.List list19 = population0.genoms;
        brain.ga.Population population20 = new brain.ga.Population();
        java.util.List list21 = population20.genoms;
        population0.genoms = list21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(selector12);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNull(selector16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population0.getSelector();
        population0.setGenomeSize(10);
        brain.ga.Population population10 = new brain.ga.Population();
        int int11 = population10.getGenomeSize();
        brain.ga.Evaluator evaluator12 = null;
        population10.setEvaluator(evaluator12);
        population10.setGenomeSize((int) 'a');
        brain.ga.Selector selector16 = null;
        population10.setSelector(selector16);
        brain.ga.Evaluator evaluator18 = population10.getEvaluator();
        brain.ga.Population population19 = new brain.ga.Population();
        java.util.List list20 = population19.genoms;
        int int21 = population19.getGenomeSize();
        brain.ga.Selector selector22 = null;
        population19.setSelector(selector22);
        population19.sort();
        java.util.List list25 = population19.genoms;
        population10.genoms = list25;
        population0.genoms = list25;
        java.lang.Class<?> wildcardClass28 = list25.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(evaluator18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        java.util.List list2 = population0.genoms;
        population0.setGenomeSize(1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        population0.initialize(gAEnumAllelesSet3);
        java.util.List list5 = population0.genoms;
        java.util.List list6 = population0.genoms;
        java.util.List list7 = population0.genoms;
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.Population population0 = new brain.ga.Population();
        population0.sort();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        try {
            brain.ga.Genome genome5 = population0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        brain.ga.Population population4 = new brain.ga.Population();
        brain.ga.Evaluator evaluator5 = null;
        population4.setEvaluator(evaluator5);
        brain.ga.Selector selector7 = population4.getSelector();
        brain.ga.Population population8 = new brain.ga.Population();
        java.util.List list9 = population8.genoms;
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        population4.genoms = list9;
        population0.genoms = list9;
        int int13 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass14 = population0.getClass();
        brain.ga.Evaluator evaluator15 = population0.getEvaluator();
        try {
            brain.ga.Genome genome16 = population0.selectNextGenome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(evaluator15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        java.lang.Class<?> wildcardClass5 = population0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        population0.sort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        int int5 = population0.getGenomeSize();
        int int6 = population0.getSize();
        java.util.List list7 = population0.genoms;
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        population0.initialize(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        population0.initialize(gAEnumAllelesSet10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = population0.getSelector();
        population0.sort();
        int int8 = population0.getSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(selector6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        brain.ga.Population population4 = new brain.ga.Population();
        int int5 = population4.getGenomeSize();
        brain.ga.Selector selector6 = null;
        population4.setSelector(selector6);
        int int8 = population4.getSize();
        int int9 = population4.getGenomeSize();
        int int10 = population4.getSize();
        java.util.List list11 = population4.genoms;
        java.util.List list12 = population4.genoms;
        population0.genoms = list12;
        int int14 = population0.getGenomeSize();
        int int15 = population0.getGenomeSize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        brain.ga.Population population0 = new brain.ga.Population();
        population0.sort();
        population0.setGenomeSize(0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        int int4 = population0.getSize();
        java.lang.Class<?> wildcardClass5 = population0.getClass();
        brain.ga.Population population6 = new brain.ga.Population();
        brain.ga.Evaluator evaluator7 = null;
        population6.setEvaluator(evaluator7);
        brain.ga.Selector selector9 = population6.getSelector();
        brain.ga.Selector selector10 = population6.getSelector();
        brain.ga.Selector selector11 = null;
        population6.setSelector(selector11);
        brain.ga.Selector selector13 = population6.getSelector();
        java.util.List list14 = population6.genoms;
        int int15 = population6.getSize();
        brain.ga.Population population16 = new brain.ga.Population();
        java.util.List list17 = population16.genoms;
        java.lang.Class<?> wildcardClass18 = list17.getClass();
        population6.genoms = list17;
        population0.genoms = list17;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(selector9);
        org.junit.Assert.assertNull(selector10);
        org.junit.Assert.assertNull(selector13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        brain.ga.Population population6 = new brain.ga.Population();
        int int7 = population6.getGenomeSize();
        brain.ga.Evaluator evaluator8 = null;
        population6.setEvaluator(evaluator8);
        population6.setGenomeSize((int) 'a');
        brain.ga.Selector selector12 = null;
        population6.setSelector(selector12);
        brain.ga.Evaluator evaluator14 = population6.getEvaluator();
        brain.ga.Population population15 = new brain.ga.Population();
        java.util.List list16 = population15.genoms;
        int int17 = population15.getGenomeSize();
        brain.ga.Selector selector18 = null;
        population15.setSelector(selector18);
        population15.sort();
        java.util.List list21 = population15.genoms;
        population6.genoms = list21;
        population0.genoms = list21;
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet24 = null;
        population0.initialize(gAEnumAllelesSet24);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNull(evaluator14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = population0.getEvaluator();
        brain.ga.Selector selector6 = population0.getSelector();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet7 = null;
        population0.initialize(gAEnumAllelesSet7);
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.setGenomeSize((int) (short) 100);
        population0.sort();
        brain.ga.Selector selector5 = population0.getSelector();
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        population0.initialize(gAEnumAllelesSet8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector8 = null;
        population0.setSelector(selector8);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(selector6);
    }
}

