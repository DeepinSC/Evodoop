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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            java.lang.Object obj2 = vectorGenome0.getGene((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            int int2 = vectorGenome0.compareTo((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
            java.lang.Object obj7 = vectorGenome2.getGene((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            vectorGenome0.setGene((int) (short) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.compareTo((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        try {
            vectorGenome2.setGene(0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        java.lang.Object obj3 = null;
        try {
            int int4 = vectorGenome0.compareTo(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        try {
            java.lang.Object obj9 = vectorGenome2.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        int int6 = vectorGenome5.getGenesCount();
        int int7 = vectorGenome5.getGenesCount();
        java.lang.Class<?> wildcardClass8 = vectorGenome5.getClass();
        try {
            vectorGenome0.setGene((int) '4', (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        int int7 = vectorGenome6.getGenesCount();
        try {
            vectorGenome0.setGene(100, (java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator7 = vectorGenome6.getEvaluator();
        int int8 = vectorGenome6.getGenesCount();
        java.lang.Class<?> wildcardClass9 = vectorGenome6.getClass();
        int int10 = vectorGenome6.getGenesCount();
        try {
            int int11 = vectorGenome0.compareTo((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        int int5 = vectorGenome0.getGenesCount();
        try {
            vectorGenome0.setGene((int) (short) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        try {
            int int8 = vectorGenome2.compareTo((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        vectorGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        brain.ga.VectorGenome vectorGenome8 = new brain.ga.VectorGenome();
        vectorGenome8.initialize();
        try {
            int int10 = vectorGenome2.compareTo((java.lang.Object) vectorGenome8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        try {
            vectorGenome0.setGene((int) (byte) -1, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        vectorGenome5.initialize();
        try {
            vectorGenome0.setGene((int) 'a', (java.lang.Object) vectorGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        int int7 = vectorGenome6.getGenesCount();
        int int8 = vectorGenome6.getGenesCount();
        java.lang.Class<?> wildcardClass9 = vectorGenome6.getClass();
        try {
            vectorGenome0.setGene((int) (short) 0, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorGenome0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator5 = vectorGenome4.getEvaluator();
        int int6 = vectorGenome4.getGenesCount();
        java.lang.Class<?> wildcardClass7 = vectorGenome4.getClass();
        try {
            vectorGenome0.setGene(0, (java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        try {
            vectorGenome0.setGene(1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        int int6 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        brain.ga.VectorGenome vectorGenome9 = new brain.ga.VectorGenome();
        vectorGenome9.initialize();
        brain.ga.Evaluator evaluator11 = vectorGenome9.getEvaluator();
        brain.ga.Evaluator evaluator12 = vectorGenome9.getEvaluator();
        vectorGenome9.initialize();
        java.lang.Class<?> wildcardClass14 = vectorGenome9.getClass();
        try {
            vectorGenome2.setGene((int) (byte) 1, (java.lang.Object) vectorGenome9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(evaluator11);
        org.junit.Assert.assertNull(evaluator12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            int int6 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        java.lang.Class<?> wildcardClass3 = vectorGenome2.getClass();
        java.lang.Class<?> wildcardClass4 = vectorGenome2.getClass();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        try {
            double double5 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            vectorGenome0.setGene((int) (byte) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator6 = vectorGenome0.getEvaluator();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        try {
            double double8 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        int int3 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        brain.ga.Evaluator evaluator6 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        try {
            int int6 = vectorGenome0.compareTo((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        vectorGenome6.initialize();
        brain.ga.Evaluator evaluator8 = vectorGenome6.getEvaluator();
        brain.ga.Evaluator evaluator9 = vectorGenome6.getEvaluator();
        brain.ga.Evaluator evaluator10 = vectorGenome6.getEvaluator();
        try {
            int int11 = vectorGenome2.compareTo((java.lang.Object) evaluator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        java.util.Vector vector4 = null;
        brain.ga.Evaluator evaluator5 = null;
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome(vector4, evaluator5);
        brain.ga.Evaluator evaluator7 = vectorGenome6.getEvaluator();
        java.lang.Class<?> wildcardClass8 = vectorGenome6.getClass();
        brain.ga.Evaluator evaluator9 = vectorGenome6.getEvaluator();
        brain.ga.Evaluator evaluator10 = vectorGenome6.getEvaluator();
        java.lang.Class<?> wildcardClass11 = vectorGenome6.getClass();
        try {
            vectorGenome0.setGene((int) '#', (java.lang.Object) vectorGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(evaluator9);
        org.junit.Assert.assertNull(evaluator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        java.lang.Class<?> wildcardClass2 = vectorGenome0.getClass();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        int int5 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj4 = vectorGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        brain.ga.Evaluator evaluator6 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome8 = new brain.ga.VectorGenome();
        vectorGenome8.initialize();
        int int10 = vectorGenome8.getGenesCount();
        int int11 = vectorGenome8.getGenesCount();
        int int12 = vectorGenome8.getGenesCount();
        int int13 = vectorGenome8.getGenesCount();
        try {
            vectorGenome0.setGene((int) 'a', (java.lang.Object) int13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        try {
            vectorGenome0.setGene(10, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        java.lang.Object obj7 = null;
        try {
            vectorGenome2.setGene((int) (short) -1, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass3 = vectorGenome0.getClass();
        int int4 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        try {
            java.lang.Object obj6 = vectorGenome2.getGene((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator5 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj7 = vectorGenome0.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNull(evaluator5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        int int7 = vectorGenome6.getGenesCount();
        int int8 = vectorGenome6.getGenesCount();
        vectorGenome6.initialize();
        brain.ga.Evaluator evaluator10 = vectorGenome6.getEvaluator();
        try {
            vectorGenome0.setGene((int) (short) 100, (java.lang.Object) vectorGenome6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        vectorGenome2.initialize();
        brain.ga.Evaluator evaluator7 = vectorGenome2.getEvaluator();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(evaluator7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        vectorGenome4.initialize();
        brain.ga.Evaluator evaluator6 = vectorGenome4.getEvaluator();
        brain.ga.Evaluator evaluator7 = vectorGenome4.getEvaluator();
        vectorGenome4.initialize();
        java.lang.Class<?> wildcardClass9 = vectorGenome4.getClass();
        brain.ga.Evaluator evaluator10 = vectorGenome4.getEvaluator();
        try {
            vectorGenome0.setGene((int) (short) 10, (java.lang.Object) vectorGenome4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(evaluator10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        int int5 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.VectorGenome vectorGenome4 = new brain.ga.VectorGenome();
        int int5 = vectorGenome4.getGenesCount();
        brain.ga.Evaluator evaluator6 = vectorGenome4.getEvaluator();
        vectorGenome4.initialize();
        brain.ga.Evaluator evaluator8 = vectorGenome4.getEvaluator();
        try {
            vectorGenome0.setGene((int) '4', (java.lang.Object) vectorGenome4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        java.lang.Class<?> wildcardClass3 = vectorGenome2.getClass();
        java.lang.Class<?> wildcardClass4 = vectorGenome2.getClass();
        vectorGenome2.initialize();
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator7 = vectorGenome6.getEvaluator();
        int int8 = vectorGenome6.getGenesCount();
        int int9 = vectorGenome6.getGenesCount();
        vectorGenome6.initialize();
        int int11 = vectorGenome6.getGenesCount();
        try {
            int int12 = vectorGenome2.compareTo((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        vectorGenome5.initialize();
        vectorGenome5.initialize();
        try {
            vectorGenome0.setGene((int) 'a', (java.lang.Object) vectorGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass4 = vectorGenome0.getClass();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.VectorGenome vectorGenome5 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator6 = vectorGenome5.getEvaluator();
        brain.ga.Evaluator evaluator7 = vectorGenome5.getEvaluator();
        int int8 = vectorGenome5.getGenesCount();
        int int9 = vectorGenome5.getGenesCount();
        vectorGenome5.initialize();
        try {
            vectorGenome0.setGene(0, (java.lang.Object) vectorGenome5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator6);
        org.junit.Assert.assertNull(evaluator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        int int5 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator3 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        vectorGenome0.initialize();
        java.util.Vector vector6 = null;
        brain.ga.Evaluator evaluator7 = null;
        brain.ga.VectorGenome vectorGenome8 = new brain.ga.VectorGenome(vector6, evaluator7);
        vectorGenome8.initialize();
        vectorGenome8.initialize();
        java.lang.Class<?> wildcardClass11 = vectorGenome8.getClass();
        java.lang.Class<?> wildcardClass12 = vectorGenome8.getClass();
        try {
            int int13 = vectorGenome0.compareTo((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        java.util.Vector vector4 = null;
        brain.ga.Evaluator evaluator5 = null;
        brain.ga.VectorGenome vectorGenome6 = new brain.ga.VectorGenome(vector4, evaluator5);
        try {
            vectorGenome0.setGene((int) (byte) 10, (java.lang.Object) vector4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass7 = vectorGenome2.getClass();
        try {
            int int8 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass6 = vectorGenome2.getClass();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        int int5 = vectorGenome0.getGenesCount();
        int int6 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        brain.ga.Evaluator evaluator3 = vectorGenome2.getEvaluator();
        java.lang.Class<?> wildcardClass4 = vectorGenome2.getClass();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        org.junit.Assert.assertNull(evaluator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        java.lang.Class<?> wildcardClass3 = vectorGenome2.getClass();
        try {
            double double4 = vectorGenome2.getScore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        int int5 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        java.util.Vector vector5 = null;
        brain.ga.Evaluator evaluator6 = null;
        brain.ga.VectorGenome vectorGenome7 = new brain.ga.VectorGenome(vector5, evaluator6);
        java.lang.Class<?> wildcardClass8 = vectorGenome7.getClass();
        try {
            int int9 = vectorGenome0.compareTo((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to brain.ga.Genome");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        int int1 = vectorGenome0.getGenesCount();
        int int2 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        try {
            java.lang.Object obj5 = vectorGenome0.getGene((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        vectorGenome0.initialize();
        int int2 = vectorGenome0.getGenesCount();
        int int3 = vectorGenome0.getGenesCount();
        int int4 = vectorGenome0.getGenesCount();
        java.lang.Class<?> wildcardClass5 = vectorGenome0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Vector vector0 = null;
        brain.ga.Evaluator evaluator1 = null;
        brain.ga.VectorGenome vectorGenome2 = new brain.ga.VectorGenome(vector0, evaluator1);
        vectorGenome2.initialize();
        vectorGenome2.initialize();
        java.lang.Class<?> wildcardClass5 = vectorGenome2.getClass();
        try {
            int int6 = vectorGenome2.getGenesCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        vectorGenome0.initialize();
        int int5 = vectorGenome0.getGenesCount();
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        brain.ga.VectorGenome vectorGenome0 = new brain.ga.VectorGenome();
        brain.ga.Evaluator evaluator1 = vectorGenome0.getEvaluator();
        brain.ga.Evaluator evaluator2 = vectorGenome0.getEvaluator();
        int int3 = vectorGenome0.getGenesCount();
        brain.ga.Evaluator evaluator4 = vectorGenome0.getEvaluator();
        try {
            java.lang.Object obj6 = vectorGenome0.getGene((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(evaluator1);
        org.junit.Assert.assertNull(evaluator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(evaluator4);
    }
}

