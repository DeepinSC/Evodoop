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
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        java.lang.Object obj2 = new java.lang.Object();
        try {
            int int3 = genome0.compareTo(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        try {
            int int4 = genome0.compareTo((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        java.lang.Class<?> wildcardClass4 = obj1.getClass();
        try {
            int int5 = genome0.compareTo((java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Genome genome4 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass5 = genome4.getClass();
        genome4.initialize();
        brain.ga.Evaluator evaluator7 = genome4.getEvaluator();
        try {
            int int8 = genome0.compareTo((java.lang.Object) evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        try {
            int int7 = genome0.compareTo((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        java.lang.Object obj3 = null;
        try {
            int int4 = genome0.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        try {
            int int3 = genome0.compareTo((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Class<?> wildcardClass4 = obj2.getClass();
        java.lang.Class<?> wildcardClass5 = obj2.getClass();
        try {
            int int6 = genome0.compareTo(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        try {
            int int4 = genome0.compareTo((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        java.lang.Object obj2 = null;
        try {
            int int3 = genome0.compareTo(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        try {
            int int6 = genome0.compareTo((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Genome genome4 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator5 = genome4.getEvaluator();
        genome4.initialize();
        java.lang.Class<?> wildcardClass7 = genome4.getClass();
        brain.ga.Evaluator evaluator8 = genome4.getEvaluator();
        try {
            int int9 = genome0.compareTo((java.lang.Object) evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        try {
            int int6 = genome0.compareTo((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        try {
            int int6 = genome0.compareTo((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Genome genome5 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass6 = genome5.getClass();
        try {
            int int7 = genome0.compareTo((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        try {
            int int8 = genome0.compareTo((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        try {
            int int3 = genome0.compareTo((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        try {
            int int5 = genome0.compareTo((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        try {
            int int5 = genome0.compareTo((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        try {
            int int3 = genome0.compareTo((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass3 = evaluator2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        java.lang.Class<?> wildcardClass6 = obj4.getClass();
        try {
            int int7 = genome0.compareTo(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        try {
            int int5 = genome0.compareTo((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass5 = evaluator4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        genome0.initialize();
        try {
            int int4 = genome0.compareTo((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass8 = evaluator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Object obj3 = null;
        try {
            int int4 = genome0.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        try {
            int int3 = genome0.compareTo((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Genome genome4 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass5 = genome4.getClass();
        genome4.initialize();
        genome4.initialize();
        genome4.initialize();
        genome4.initialize();
        genome4.initialize();
        java.lang.Class<?> wildcardClass11 = genome4.getClass();
        try {
            int int12 = genome0.compareTo((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        try {
            int int6 = genome0.compareTo((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        try {
            int int3 = genome0.compareTo((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Genome genome5 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass6 = genome5.getClass();
        try {
            int int7 = genome0.compareTo((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Genome genome2 = new brain.ga.Genome();
        genome2.initialize();
        brain.ga.Evaluator evaluator4 = genome2.getEvaluator();
        brain.ga.Evaluator evaluator5 = genome2.getEvaluator();
        try {
            int int6 = genome0.compareTo((java.lang.Object) evaluator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        java.lang.Class<?> wildcardClass5 = obj3.getClass();
        java.lang.Class<?> wildcardClass6 = obj3.getClass();
        java.lang.Class<?> wildcardClass7 = obj3.getClass();
        try {
            int int8 = genome0.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Genome genome9 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass10 = genome9.getClass();
        genome9.initialize();
        genome9.initialize();
        genome9.initialize();
        genome9.initialize();
        java.lang.Class<?> wildcardClass15 = genome9.getClass();
        java.lang.Class<?> wildcardClass16 = genome9.getClass();
        try {
            int int17 = genome0.compareTo((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        try {
            int int5 = genome0.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Object obj4 = null;
        try {
            int int5 = genome0.compareTo(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Genome genome5 = new brain.ga.Genome();
        genome5.initialize();
        genome5.initialize();
        brain.ga.Evaluator evaluator8 = genome5.getEvaluator();
        try {
            int int9 = genome0.compareTo((java.lang.Object) evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        genome0.initialize();
        brain.ga.Genome genome6 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass7 = genome6.getClass();
        java.lang.Class<?> wildcardClass8 = genome6.getClass();
        brain.ga.Evaluator evaluator9 = genome6.getEvaluator();
        brain.ga.Evaluator evaluator10 = genome6.getEvaluator();
        try {
            int int11 = genome0.compareTo((java.lang.Object) evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Genome genome3 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass4 = genome3.getClass();
        genome3.initialize();
        genome3.initialize();
        genome3.initialize();
        genome3.initialize();
        java.lang.Class<?> wildcardClass9 = genome3.getClass();
        brain.ga.Evaluator evaluator10 = genome3.getEvaluator();
        brain.ga.Evaluator evaluator11 = genome3.getEvaluator();
        try {
            int int12 = genome0.compareTo((java.lang.Object) evaluator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        try {
            int int8 = genome0.compareTo((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        try {
            int int7 = genome0.compareTo((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Genome genome4 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass5 = genome4.getClass();
        java.lang.Class<?> wildcardClass6 = genome4.getClass();
        brain.ga.Evaluator evaluator7 = genome4.getEvaluator();
        genome4.initialize();
        java.lang.Class<?> wildcardClass9 = genome4.getClass();
        try {
            int int10 = genome0.compareTo((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        try {
            int int7 = genome0.compareTo((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        try {
            int int9 = genome0.compareTo((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Genome genome9 = new brain.ga.Genome();
        genome9.initialize();
        brain.ga.Evaluator evaluator11 = genome9.getEvaluator();
        java.lang.Class<?> wildcardClass12 = genome9.getClass();
        java.lang.Class<?> wildcardClass13 = genome9.getClass();
        java.lang.Class<?> wildcardClass14 = genome9.getClass();
        try {
            int int15 = genome0.compareTo((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Genome genome6 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator7 = genome6.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome6.getClass();
        try {
            int int9 = genome0.compareTo((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass9 = evaluator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        genome0.initialize();
        try {
            int int8 = genome0.compareTo((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Object obj9 = null;
        try {
            int int10 = genome0.compareTo(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        java.lang.Object obj5 = null;
        try {
            int int6 = genome0.compareTo(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        genome0.initialize();
        try {
            int int10 = genome0.compareTo((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass8 = evaluator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        try {
            int int8 = genome0.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass8 = evaluator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        brain.ga.Genome genome7 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass8 = genome7.getClass();
        brain.ga.Evaluator evaluator9 = genome7.getEvaluator();
        genome7.initialize();
        genome7.initialize();
        java.lang.Class<?> wildcardClass12 = genome7.getClass();
        java.lang.Class<?> wildcardClass13 = genome7.getClass();
        java.lang.Class<?> wildcardClass14 = genome7.getClass();
        try {
            int int15 = genome0.compareTo((java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass9 = evaluator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        genome0.initialize();
        brain.ga.Genome genome5 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass6 = genome5.getClass();
        java.lang.Class<?> wildcardClass7 = genome5.getClass();
        brain.ga.Evaluator evaluator8 = genome5.getEvaluator();
        brain.ga.Evaluator evaluator9 = genome5.getEvaluator();
        genome5.initialize();
        java.lang.Class<?> wildcardClass11 = genome5.getClass();
        try {
            int int12 = genome0.compareTo((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        try {
            int int4 = genome0.compareTo((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator10 = genome0.getEvaluator();
        brain.ga.Genome genome11 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator12 = genome11.getEvaluator();
        brain.ga.Evaluator evaluator13 = genome11.getEvaluator();
        genome11.initialize();
        brain.ga.Evaluator evaluator15 = genome11.getEvaluator();
        genome11.initialize();
        brain.ga.Evaluator evaluator17 = genome11.getEvaluator();
        brain.ga.Evaluator evaluator18 = genome11.getEvaluator();
        try {
            int int19 = genome0.compareTo((java.lang.Object) evaluator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNull(evaluator13);
        org.junit.Assert.assertNull(evaluator15);
        org.junit.Assert.assertNull(evaluator17);
        org.junit.Assert.assertNull(evaluator18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        brain.ga.Genome genome5 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator6 = genome5.getEvaluator();
        brain.ga.Evaluator evaluator7 = genome5.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome5.getEvaluator();
        java.lang.Class<?> wildcardClass9 = genome5.getClass();
        java.lang.Class<?> wildcardClass10 = genome5.getClass();
        try {
            int int11 = genome0.compareTo((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Genome genome6 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass7 = genome6.getClass();
        genome6.initialize();
        genome6.initialize();
        genome6.initialize();
        genome6.initialize();
        genome6.initialize();
        java.lang.Class<?> wildcardClass13 = genome6.getClass();
        try {
            int int14 = genome0.compareTo((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        try {
            int int6 = genome0.compareTo(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass10 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Genome genome8 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass9 = genome8.getClass();
        genome8.initialize();
        genome8.initialize();
        genome8.initialize();
        genome8.initialize();
        java.lang.Class<?> wildcardClass14 = genome8.getClass();
        brain.ga.Evaluator evaluator15 = genome8.getEvaluator();
        genome8.initialize();
        brain.ga.Evaluator evaluator17 = genome8.getEvaluator();
        try {
            int int18 = genome0.compareTo((java.lang.Object) evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(evaluator15);
        org.junit.Assert.assertNull(evaluator17);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator10 = genome0.getEvaluator();
        brain.ga.Genome genome11 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass12 = genome11.getClass();
        java.lang.Class<?> wildcardClass13 = genome11.getClass();
        java.lang.Class<?> wildcardClass14 = genome11.getClass();
        genome11.initialize();
        java.lang.Class<?> wildcardClass16 = genome11.getClass();
        brain.ga.Evaluator evaluator17 = genome11.getEvaluator();
        try {
            int int18 = genome0.compareTo((java.lang.Object) evaluator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(evaluator17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        brain.ga.Evaluator evaluator10 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        try {
            int int6 = genome0.compareTo((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        java.lang.Class<?> wildcardClass10 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass9 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator10 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator11 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator12 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(evaluator12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass10 = genome0.getClass();
        brain.ga.Evaluator evaluator11 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(evaluator11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        brain.ga.Genome genome9 = new brain.ga.Genome();
        genome9.initialize();
        brain.ga.Evaluator evaluator11 = genome9.getEvaluator();
        java.lang.Class<?> wildcardClass12 = genome9.getClass();
        java.lang.Class<?> wildcardClass13 = genome9.getClass();
        try {
            int int14 = genome0.compareTo((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass10 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }
}

