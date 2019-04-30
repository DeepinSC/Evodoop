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
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            double double3 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            java.lang.Object obj4 = vectorGenome2.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            int int3 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            vectorGenome2.setGene((int) (short) 0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            java.lang.Object obj4 = vectorGenome2.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            int int5 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            vectorGenome2.setGene((-1), (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            vectorGenome2.setGene(10, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            double double4 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            int int5 = vectorGenome2.compareTo((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            int int4 = vectorGenome2.compareTo((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        try {
            int int4 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            int int4 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            java.lang.Object obj5 = vectorGenome2.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            java.lang.Object obj5 = vectorGenome2.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            int int2 = vectorGenome0.compareTo((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            java.lang.Object obj4 = vectorGenome2.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.compareTo((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj3 = vectorGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.compareTo((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        try {
            vectorGenome2.setGene((int) '4', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            int int4 = vectorGenome2.compareTo((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.compareTo((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        try {
            java.lang.Object obj5 = vectorGenome2.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            double double5 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj3 = vectorGenome0.getGene((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj3 = vectorGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.util.Vector vector7 = null;
        brain.ga.Evaluator evaluator8 = null;
        brain.ga.VectorGenome vectorGenome9 = new brain.ga.VectorGenome(vector7, evaluator8);
        brain.ga.Evaluator evaluator10 = vectorGenome9.getEvaluator();
        vectorGenome9.initialize();
        vectorGenome9.initialize();
        try {
            vectorGenome2.setGene((int) (short) 0, (java.lang.Object) vectorGenome9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            double double6 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj7 = vectorGenome2.getGene((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        java.util.Vector vector4 = null;
        brain.ga.Evaluator evaluator5 = null;
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome(vector4, evaluator5);
        vectorGenome6.initialize();
        vectorGenome6.initialize();
        try {
            int int9 = vectorGenome2.compareTo((java.lang.Object) vectorGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        java.util.Vector vector5 = null;
        brain.ga.Evaluator evaluator6 = null;
        brain.ga.VectorGenome vectorGenome7 = new brain.ga.VectorGenome(vector5, evaluator6);
        vectorGenome7.initialize();
        try {
            int int9 = vectorGenome2.compareTo((java.lang.Object) vectorGenome7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        try {
            int int3 = vectorGenome0.compareTo((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        java.util.Vector vector3 = null;
        brain.ga.Evaluator evaluator4 = null;
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome(vector3, evaluator4);
        brain.ga.Evaluator evaluator6 = vectorGenome5.getEvaluator();
        vectorGenome5.initialize();
        vectorGenome5.initialize();
        try {
            int int9 = vectorGenome0.compareTo((java.lang.Object) vectorGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator5 = vectorGenome4.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorGenome4.getEvaluator();
        try {
            int int7 = vectorGenome0.compareTo((java.lang.Object) evaluator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            int int5 = vectorGenome0.compareTo((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        try {
            vectorGenome0.setGene((int) ' ', obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj3 = vectorGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass3 = evaluator2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.util.Vector vector4 = null;
        brain.ga.Evaluator evaluator5 = null;
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome(vector4, evaluator5);
        brain.ga.Evaluator evaluator7 = vectorGenome6.getEvaluator();
        vectorGenome6.initialize();
        try {
            vectorGenome0.setGene(100, (java.lang.Object) vectorGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            vectorGenome0.setGene(100, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            int int4 = vectorGenome0.compareTo((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            int int5 = vectorGenome0.compareTo((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            int int5 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        brain.ga.VectorGenome vectorGenome3 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator4 = vectorGenome3.getEvaluator();
        int int5 = vectorGenome3.getGenesCount();
        int int6 = vectorGenome3.getGenesCount();
        try {
            int int7 = vectorGenome0.compareTo((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        try {
            int int7 = vectorGenome2.compareTo((java.lang.Object) vectorGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        try {
            vectorGenome0.setGene((int) (short) 1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator6 = vectorGenome5.getEvaluator();
        int int7 = vectorGenome5.getGenesCount();
        java.lang.Class<?> wildcardClass8 = vectorGenome5.getClass();
        try {
            vectorGenome0.setGene((int) (short) 0, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        try {
            double double4 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass5 = evaluator4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        vectorGenome5.initialize();
        brain.ga.Evaluator evaluator7 = vectorGenome5.getEvaluator();
        brain.ga.Evaluator evaluator8 = vectorGenome5.getEvaluator();
        try {
            int int9 = vectorGenome0.compareTo((java.lang.Object) evaluator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        java.util.Vector vector5 = null;
        brain.ga.Evaluator evaluator6 = null;
        brain.ga.VectorGenome vectorGenome7 = new brain.ga.VectorGenome(vector5, evaluator6);
        vectorGenome7.initialize();
        try {
            vectorGenome0.setGene((int) '#', (java.lang.Object) vectorGenome7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        try {
            java.lang.Class<?> wildcardClass4 = evaluator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            vectorGenome0.setGene((int) (short) 10, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        try {
            int int7 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            vectorGenome0.setGene((int) '4', (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        try {
            int int4 = vectorGenome0.compareTo((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        try {
            int int7 = vectorGenome2.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            int int5 = vectorGenome0.compareTo((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            int int2 = vectorGenome0.compareTo((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorGenome2.getClass();
        brain.ga.Evaluator evaluator5 = vectorGenome2.getEvaluator();
        try {
            double double6 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        try {
            java.lang.Object obj7 = vectorGenome2.getGene((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        vectorGenome2.initialize();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        int int6 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        try {
            java.lang.Object obj4 = vectorGenome2.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        java.util.Vector vector2 = null;
        brain.ga.Evaluator evaluator3 = null;
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome(vector2, evaluator3);
        vectorGenome4.initialize();
        vectorGenome4.initialize();
        java.lang.Class<?> wildcardClass7 = vectorGenome4.getClass();
        try {
            int int8 = vectorGenome0.compareTo((java.lang.Object) vectorGenome4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        try {
            int int3 = vectorGenome0.compareTo((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj7 = vectorGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        java.util.Vector vector6 = null;
        brain.ga.Evaluator evaluator7 = null;
        brain.ga.VectorGenome vectorGenome8 = new brain.ga.VectorGenome(vector6, evaluator7);
        java.lang.Class<?> wildcardClass9 = vectorGenome8.getClass();
        try {
            vectorGenome0.setGene((int) (short) 0, (java.lang.Object) vectorGenome8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            vectorGenome0.setGene((int) '#', (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        try {
            java.lang.Object obj7 = vectorGenome0.getGene((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorGenome0.getClass();
        try {
            vectorGenome0.setGene((int) (byte) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            int int4 = vectorGenome0.compareTo((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        int int5 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        try {
            vectorGenome0.setGene(10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        java.lang.Class<?> wildcardClass3 = vectorGenome2.getClass();
        java.util.Vector vector5 = null;
        brain.ga.Evaluator evaluator6 = null;
        brain.ga.VectorGenome vectorGenome7 = new brain.ga.VectorGenome(vector5, evaluator6);
        vectorGenome7.initialize();
        vectorGenome7.initialize();
        java.lang.Class<?> wildcardClass10 = vectorGenome7.getClass();
        java.lang.Class<?> wildcardClass11 = vectorGenome7.getClass();
        try {
            vectorGenome2.setGene((int) (short) -1, (java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        try {
            java.lang.Object obj8 = vectorGenome2.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorGenome2.getClass();
        brain.ga.Evaluator evaluator5 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            vectorGenome0.setGene((int) (short) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        java.util.Vector vector1 = null;
        brain.ga.Evaluator evaluator2 = null;
        brain.ga.VectorGenome vectorGenome3 = new brain.ga.VectorGenome(vector1, evaluator2);
        brain.ga.Evaluator evaluator4 = vectorGenome3.getEvaluator();
        vectorGenome3.initialize();
        java.lang.Class<?> wildcardClass6 = vectorGenome3.getClass();
        brain.ga.Evaluator evaluator7 = vectorGenome3.getEvaluator();
        try {
            int int8 = vectorGenome0.compareTo((java.lang.Object) evaluator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

