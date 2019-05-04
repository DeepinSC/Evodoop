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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator9 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator9);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        genome0.initialize();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
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
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass8 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        genome0.initialize();
        brain.ga.Evaluator evaluator7 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        brain.ga.Evaluator evaluator1 = genome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
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
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
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
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
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
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
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
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        java.lang.Class<?> wildcardClass7 = genome0.getClass();
        brain.ga.Evaluator evaluator8 = genome0.getEvaluator();
        genome0.initialize();
        java.lang.Class<?> wildcardClass10 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        genome0.initialize();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
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
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
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
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        brain.ga.Evaluator evaluator2 = genome0.getEvaluator();
        genome0.initialize();
        brain.ga.Evaluator evaluator4 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass5 = genome0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        java.lang.Class<?> wildcardClass2 = genome0.getClass();
        java.lang.Class<?> wildcardClass3 = genome0.getClass();
        java.lang.Class<?> wildcardClass4 = genome0.getClass();
        brain.ga.Evaluator evaluator5 = genome0.getEvaluator();
        java.lang.Class<?> wildcardClass6 = genome0.getClass();
        genome0.initialize();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        brain.ga.Genome genome0 = new brain.ga.Genome();
        java.lang.Class<?> wildcardClass1 = genome0.getClass();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        genome0.initialize();
        brain.ga.Evaluator evaluator6 = genome0.getEvaluator();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
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
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator9);
    }
}

