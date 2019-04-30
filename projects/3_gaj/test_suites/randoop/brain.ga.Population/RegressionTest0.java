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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        brain.ga.Population population0 = new brain.ga.Population();
        try {
            brain.ga.Genome genome2 = population0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        try {
            brain.ga.Genome genome6 = population0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        java.lang.Class<?> wildcardClass3 = population0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.Selector selector4 = null;
        population0.setSelector(selector4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        brain.ga.Population population0 = new brain.ga.Population();
        try {
            brain.ga.Genome genome2 = population0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        java.util.List list3 = population0.genoms;
        brain.ga.Evaluator evaluator4 = null;
        population0.setEvaluator(evaluator4);
        population0.setGenomeSize(10);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        population0.initialize(gAEnumAllelesSet3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        population0.initialize(gAEnumAllelesSet2);
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.util.List list4 = population0.genoms;
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Selector selector1 = null;
        population0.setSelector(selector1);
        java.lang.Class<?> wildcardClass3 = population0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        try {
            brain.ga.Genome genome3 = population0.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        brain.ga.Selector selector7 = population0.getSelector();
        java.util.List list8 = population0.genoms;
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertNull(selector4);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        brain.ga.Population population0 = new brain.ga.Population();
        population0.sort();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        int int5 = population0.getGenomeSize();
        brain.ga.Selector selector6 = population0.getSelector();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.setGenomeSize((int) (short) 100);
        population0.sort();
        brain.ga.Selector selector5 = population0.getSelector();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(selector5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
        org.junit.Assert.assertNull(selector3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(selector9);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        java.util.List list3 = population0.genoms;
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.sort();
        brain.ga.Selector selector6 = population0.getSelector();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNull(selector6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        population0.setGenomeSize((int) (short) 1);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Evaluator evaluator5 = null;
        population0.setEvaluator(evaluator5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        population0.initialize(gAEnumAllelesSet4);
        java.util.List list6 = population0.genoms;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        population0.sort();
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        int int5 = population0.getGenomeSize();
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        int int2 = population0.getSize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        population0.setGenomeSize(4);
        java.lang.Class<?> wildcardClass5 = population0.getClass();
        int int6 = population0.getSize();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Selector selector8 = population0.getSelector();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(selector8);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        brain.ga.Population population0 = new brain.ga.Population();
        brain.ga.Evaluator evaluator1 = null;
        population0.setEvaluator(evaluator1);
        brain.ga.Selector selector3 = population0.getSelector();
        population0.sort();
        brain.ga.Selector selector5 = null;
        population0.setSelector(selector5);
        org.junit.Assert.assertNull(selector3);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        brain.ga.Selector selector6 = null;
        population0.setSelector(selector6);
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Population population9 = new brain.ga.Population();
        java.util.List list10 = population9.genoms;
        int int11 = population9.getGenomeSize();
        brain.ga.Selector selector12 = null;
        population9.setSelector(selector12);
        population9.sort();
        java.util.List list15 = population9.genoms;
        population0.genoms = list15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(selector7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Evaluator evaluator2 = null;
        population0.setEvaluator(evaluator2);
        population0.setGenomeSize((int) 'a');
        java.lang.Class<?> wildcardClass6 = population0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        int int2 = population0.getGenomeSize();
        brain.ga.Selector selector3 = null;
        population0.setSelector(selector3);
        population0.setGenomeSize(0);
        java.lang.Class<?> wildcardClass7 = population0.getClass();
        brain.ga.Evaluator evaluator8 = population0.getEvaluator();
        brain.ga.Evaluator evaluator9 = population0.getEvaluator();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Selector selector2 = null;
        population0.setSelector(selector2);
        java.lang.Class<?> wildcardClass4 = population0.getClass();
        brain.ga.Selector selector5 = population0.getSelector();
        try {
            brain.ga.Genome genome7 = population0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(selector5);
    }
}

