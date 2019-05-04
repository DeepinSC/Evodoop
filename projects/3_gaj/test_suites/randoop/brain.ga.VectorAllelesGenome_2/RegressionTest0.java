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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        try {
            java.lang.Object obj2 = vectorAllelesGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        try {
            int int3 = vectorAllelesGenome0.compareTo((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome4 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome4.initialize();
        int int6 = vectorAllelesGenome4.getGenesCount();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome4.getEvaluator();
        int int8 = vectorAllelesGenome4.getGenesCount();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome4.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 10, (java.lang.Object) evaluator9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome5.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome5.getClass();
        try {
            vectorAllelesGenome0.setGene((int) '#', (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        int int5 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 100, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        try {
            int int6 = vectorAllelesGenome0.compareTo((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj5 = vectorAllelesGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome7.getClass();
        java.lang.Class<?> wildcardClass9 = vectorAllelesGenome7.getClass();
        try {
            int int10 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome2 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome2.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome2.getClass();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome2.getClass();
        vectorAllelesGenome2.initialize();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome2.getClass();
        try {
            int int9 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        java.lang.Class<?> wildcardClass9 = vectorAllelesGenome6.getClass();
        try {
            vectorAllelesGenome0.setGene(10, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        try {
            int int7 = vectorAllelesGenome0.compareTo((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        int int7 = vectorAllelesGenome0.getGenesCount();
        try {
            vectorAllelesGenome0.setGene(10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        int int5 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Object obj3 = new java.lang.Object();
        try {
            int int4 = vectorAllelesGenome0.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        java.lang.Object obj4 = new java.lang.Object();
        try {
            vectorAllelesGenome0.setGene((int) '4', obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj3 = vectorAllelesGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        int int6 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome5 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome5.getClass();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome5.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) (short) 0, (java.lang.Object) vectorAllelesGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome7.initialize();
        int int9 = vectorAllelesGenome7.getGenesCount();
        brain.ga.Evaluator evaluator10 = vectorAllelesGenome7.getEvaluator();
        java.lang.Class<?> wildcardClass11 = vectorAllelesGenome7.getClass();
        int int12 = vectorAllelesGenome7.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (short) 1, (java.lang.Object) vectorAllelesGenome7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        int int9 = vectorAllelesGenome6.getGenesCount();
        int int10 = vectorAllelesGenome6.getGenesCount();
        brain.ga.Evaluator evaluator11 = vectorAllelesGenome6.getEvaluator();
        java.lang.Class<?> wildcardClass12 = vectorAllelesGenome6.getClass();
        try {
            int int13 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        int int5 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Object obj8 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        int int7 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome9 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator10 = vectorAllelesGenome9.getEvaluator();
        brain.ga.Evaluator evaluator11 = vectorAllelesGenome9.getEvaluator();
        int int12 = vectorAllelesGenome9.getGenesCount();
        int int13 = vectorAllelesGenome9.getGenesCount();
        java.lang.Class<?> wildcardClass14 = vectorAllelesGenome9.getClass();
        try {
            vectorAllelesGenome0.setGene(10, (java.lang.Object) vectorAllelesGenome9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        int int9 = vectorAllelesGenome6.getGenesCount();
        int int10 = vectorAllelesGenome6.getGenesCount();
        java.lang.Class<?> wildcardClass11 = vectorAllelesGenome6.getClass();
        int int12 = vectorAllelesGenome6.getGenesCount();
        vectorAllelesGenome6.initialize();
        try {
            vectorAllelesGenome0.setGene((int) (short) 0, (java.lang.Object) vectorAllelesGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass7 = vectorAllelesGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        int int5 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome6.getClass();
        int int9 = vectorAllelesGenome6.getGenesCount();
        java.lang.Class<?> wildcardClass10 = vectorAllelesGenome6.getClass();
        try {
            int int11 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        int int5 = vectorAllelesGenome0.getGenesCount();
        int int6 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass7 = evaluator6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome4 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome4.getClass();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome4.getClass();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome4.getEvaluator();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome4.getClass();
        try {
            int int9 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome6.getEvaluator();
        int int10 = vectorAllelesGenome6.getGenesCount();
        brain.ga.Evaluator evaluator11 = vectorAllelesGenome6.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) '#', (java.lang.Object) vectorAllelesGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome3.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome3.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome3.getEvaluator();
        int int7 = vectorAllelesGenome3.getGenesCount();
        int int8 = vectorAllelesGenome3.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (short) 100, (java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome3 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome3.getClass();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome3.getClass();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome3.getEvaluator();
        vectorAllelesGenome3.initialize();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome3.getEvaluator();
        try {
            vectorAllelesGenome0.setGene((int) '4', (java.lang.Object) vectorAllelesGenome3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        int int7 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        try {
            vectorAllelesGenome0.setGene(100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        int int6 = vectorAllelesGenome0.getGenesCount();
        int int7 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj9 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        brain.ga.VectorAllelesGenome vectorAllelesGenome6 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator7 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome6.getEvaluator();
        brain.ga.Evaluator evaluator10 = vectorAllelesGenome6.getEvaluator();
        int int11 = vectorAllelesGenome6.getGenesCount();
        try {
            vectorAllelesGenome0.setGene((int) (byte) -1, (java.lang.Object) vectorAllelesGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        int int5 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        int int5 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        int int7 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass8 = vectorAllelesGenome7.getClass();
        java.lang.Class<?> wildcardClass9 = vectorAllelesGenome7.getClass();
        brain.ga.Evaluator evaluator10 = vectorAllelesGenome7.getEvaluator();
        vectorAllelesGenome7.initialize();
        try {
            vectorAllelesGenome0.setGene((int) (byte) 0, (java.lang.Object) vectorAllelesGenome7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass5 = evaluator4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        int int3 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        int int6 = vectorAllelesGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        int int2 = vectorAllelesGenome0.getGenesCount();
        int int3 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorAllelesGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass5 = evaluator4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator5 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        int int7 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorAllelesGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        int int1 = vectorAllelesGenome0.getGenesCount();
        int int2 = vectorAllelesGenome0.getGenesCount();
        vectorAllelesGenome0.initialize();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj6 = vectorAllelesGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        java.lang.Class<?> wildcardClass1 = vectorAllelesGenome0.getClass();
        java.lang.Class<?> wildcardClass2 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        try {
            java.lang.Object obj7 = vectorAllelesGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        vectorAllelesGenome0.initialize();
        int int2 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorAllelesGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorAllelesGenome0.getClass();
        vectorAllelesGenome0.initialize();
        java.lang.Class<?> wildcardClass6 = vectorAllelesGenome0.getClass();
        brain.ga.VectorAllelesGenome vectorAllelesGenome7 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome7.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorAllelesGenome7.getEvaluator();
        java.lang.Class<?> wildcardClass10 = vectorAllelesGenome7.getClass();
        java.lang.Class<?> wildcardClass11 = vectorAllelesGenome7.getClass();
        brain.ga.Evaluator evaluator12 = vectorAllelesGenome7.getEvaluator();
        vectorAllelesGenome7.initialize();
        java.lang.Class<?> wildcardClass14 = vectorAllelesGenome7.getClass();
        try {
            int int15 = vectorAllelesGenome0.compareTo((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        brain.ga.VectorAllelesGenome vectorAllelesGenome0 = new brain.ga.VectorAllelesGenome();
        brain.ga.Evaluator evaluator1 = vectorAllelesGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorAllelesGenome0.getEvaluator();
        int int3 = vectorAllelesGenome0.getGenesCount();
        int int4 = vectorAllelesGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorAllelesGenome0.getClass();
        brain.ga.Evaluator evaluator6 = vectorAllelesGenome0.getEvaluator();
        int int7 = vectorAllelesGenome0.getGenesCount();
        brain.ga.Evaluator evaluator8 = vectorAllelesGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(evaluator8);
    }
}

