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
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            java.lang.Object obj2 = vectorAllelesGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            java.lang.Object obj2 = vectorAllelesGenome0.getGene((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            java.lang.Object obj2 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            int int2 = vectorAllelesGenome0.compareTo((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        try {
            int int3 = vectorAllelesGenome0.compareTo((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome5.getEvaluator();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome5.getEvaluator();
        try {
            vectorAllelesGenome0.setGene(0, (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) 'a', (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        java.lang.Object obj2 = null;
        try {
            int int3 = vectorAllelesGenome0.compareTo(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Object obj4 = null;
        try {
            vectorAllelesGenome0.setGene((int) (short) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        java.lang.Object obj5 = new java.lang.Object();
        try {
            vectorAllelesGenome0.setGene((int) (short) 10, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            vectorAllelesGenome0.setGene((int) (short) 10, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome5.getEvaluator();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome5.getEvaluator();
        int int8 = vectorAllelesGenome5.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 0, (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        try {
            int int3 = vectorAllelesGenome0.compareTo((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        try {
            int int4 = vectorAllelesGenome0.compareTo((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            vectorAllelesGenome0.setGene(0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome7.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome7.getEvaluator();
        int int10 = vectorAllelesGenome7.getGenesCount();
        int int11 = vectorAllelesGenome7.getGenesCount();
        java.lang.Class<?> wildcardClass12 = vectorAllelesGenome7.getClass();
        int int13 = vectorAllelesGenome7.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 10, (java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj3 = vectorAllelesGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        try {
            int int4 = vectorAllelesGenome0.compareTo((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        try {
            int int4 = vectorAllelesGenome0.compareTo((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            vectorAllelesGenome0.setGene(0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 10, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome5.getClass();
        try {
            int int7 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome4 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome4.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) 'a', (java.lang.Object) vectorAllelesGenome4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        try {
            int int4 = vectorAllelesGenome0.compareTo((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        try {
            int int8 = vectorAllelesGenome0.compareTo((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            vectorAllelesGenome0.setGene(10, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome4 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome4.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome4.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome4.getClass();
        try {
            int int8 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 100, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj8 = vectorAllelesGenome0.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome3.getEvaluator();
        int int5 = vectorAllelesGenome3.getGenesCount();
        try {
            int int6 = vectorAllelesGenome0.compareTo((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) '#', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) (short) 0, (java.lang.Object) evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome5.getEvaluator();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome5.getEvaluator();
        int int8 = vectorAllelesGenome5.getGenesCount();
        int int9 = vectorAllelesGenome5.getGenesCount();
        java.lang.Class<?> wildcardClass10 = vectorAllelesGenome5.getClass();
        try {
            vectorAllelesGenome0.setGene(1, (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome7.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome7.getEvaluator();
        int int10 = vectorAllelesGenome7.getGenesCount();
        int int11 = vectorAllelesGenome7.getGenesCount();
        java.lang.Class<?> wildcardClass12 = vectorAllelesGenome7.getClass();
        try {
            int int13 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        try {
            int int8 = vectorAllelesGenome0.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        java.lang.Object obj8 = new java.lang.Object();
        try {
            vectorAllelesGenome0.setGene(0, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass3 = evaluator2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        int int5 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass7 = evaluator6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj8 = vectorAllelesGenome0.getGene((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome3.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome3.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome3.getClass();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 0, (java.lang.Object) vectorAllelesGenome3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome8 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass9 = vectorAllelesGenome8.getClass();
        try {
            int int10 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 100, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome5.initialize();
        int int7 = vectorAllelesGenome5.getGenesCount();
        vectorAllelesGenome5.initialize();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 10, (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) '4', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome3.initialize();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome3.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome3.getClass();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome3.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) (short) 100, (java.lang.Object) evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        try {
            int int3 = vectorAllelesGenome0.compareTo((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        java.lang.Object obj3 = null;
        try {
            vectorAllelesGenome0.setGene((int) (byte) 10, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Object obj4 = null;
        try {
            int int5 = vectorAllelesGenome0.compareTo(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome5.getEvaluator();
        int int7 = vectorAllelesGenome5.getGenesCount();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome5.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) '#', (java.lang.Object) evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        int int5 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome3.getClass();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome3.getEvaluator();
        try {
            int int6 = vectorAllelesGenome0.compareTo((java.lang.Object) evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        try {
            vectorAllelesGenome0.setGene((int) (short) -1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome6.getClass();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome6.getClass();
        try {
            vectorAllelesGenome0.setGene((int) (byte) -1, (java.lang.Object) vectorAllelesGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        try {
            int int7 = vectorAllelesGenome0.compareTo((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            java.lang.Object obj2 = vectorAllelesGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        try {
            vectorAllelesGenome0.setGene((int) (short) 1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome7.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome7.getEvaluator();
        int int10 = vectorAllelesGenome7.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (byte) -1, (java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        try {
            int int5 = vectorAllelesGenome0.compareTo((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome7.initialize();
        int int9 = vectorAllelesGenome7.getGenesCount();
        brain.ga.Evaluator evaluator10 = vectorAllelesGenome7.getEvaluator();
        int int11 = vectorAllelesGenome7.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (short) 100, (java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        int int5 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        int int5 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome7.getClass();
        try {
            vectorAllelesGenome0.setGene((int) ' ', (java.lang.Object) vectorAllelesGenome7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }
}

