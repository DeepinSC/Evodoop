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
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.Genome genome1 = null;
        try {
            int int3 = sectMutator0.mutate(genome1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet1 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet1);
        brain.ga.Genome genome3 = null;
        try {
            int int5 = sectMutator0.mutate(genome3, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.Genome genome7 = null;
        try {
            int int9 = sectMutator0.mutate(genome7, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.Genome genome1 = null;
        try {
            int int3 = sectMutator0.mutate(genome1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.Genome genome1 = null;
        try {
            int int3 = sectMutator0.mutate(genome1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.Genome genome4 = null;
        try {
            int int6 = sectMutator0.mutate(genome4, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        brain.ga.Genome genome5 = null;
        try {
            int int7 = sectMutator0.mutate(genome5, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet1 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet3);
        brain.ga.Genome genome5 = null;
        try {
            int int7 = sectMutator0.mutate(genome5, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet1 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet3);
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet1 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet1);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet3);
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        brain.ga.Genome genome13 = null;
        try {
            int int15 = sectMutator0.mutate(genome13, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.Genome genome6 = null;
        try {
            int int8 = sectMutator0.mutate(genome6, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet1 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet1);
        brain.ga.Genome genome3 = null;
        try {
            int int5 = sectMutator0.mutate(genome3, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.Genome genome4 = null;
        try {
            int int6 = sectMutator0.mutate(genome4, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.Genome genome4 = null;
        try {
            int int6 = sectMutator0.mutate(genome4, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.Genome genome7 = null;
        try {
            int int9 = sectMutator0.mutate(genome7, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        brain.ga.Genome genome5 = null;
        try {
            int int7 = sectMutator0.mutate(genome5, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        brain.ga.Genome genome5 = null;
        try {
            int int7 = sectMutator0.mutate(genome5, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet14 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet14);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet16 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        brain.ga.Genome genome15 = null;
        try {
            int int17 = sectMutator0.mutate(genome15, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet17 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet17);
        brain.ga.Genome genome19 = null;
        try {
            int int21 = sectMutator0.mutate(genome19, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        brain.ga.Genome genome13 = null;
        try {
            int int15 = sectMutator0.mutate(genome13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.Genome genome7 = null;
        try {
            int int9 = sectMutator0.mutate(genome7, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet13 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet17 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet17);
        brain.ga.Genome genome19 = null;
        try {
            int int21 = sectMutator0.mutate(genome19, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet7 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet7);
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.Genome genome8 = null;
        try {
            int int10 = sectMutator0.mutate(genome8, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        brain.ga.Genome genome13 = null;
        try {
            int int15 = sectMutator0.mutate(genome13, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.Genome genome10 = null;
        try {
            int int12 = sectMutator0.mutate(genome10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass2 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet3 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet3);
        brain.ga.Genome genome5 = null;
        try {
            int int7 = sectMutator0.mutate(genome5, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.Genome genome9 = null;
        try {
            int int11 = sectMutator0.mutate(genome9, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.Genome genome2 = null;
        try {
            int int4 = sectMutator0.mutate(genome2, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        brain.ga.Genome genome17 = null;
        try {
            int int19 = sectMutator0.mutate(genome17, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        brain.ga.Genome genome13 = null;
        try {
            int int15 = sectMutator0.mutate(genome13, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet14 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet14);
        java.lang.Class<?> wildcardClass16 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet13 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet13);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.Genome genome11 = null;
        try {
            int int13 = sectMutator0.mutate(genome11, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        brain.ga.Genome genome13 = null;
        try {
            int int15 = sectMutator0.mutate(genome13, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet7 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet7);
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        java.lang.Class<?> wildcardClass11 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet14 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet14);
        java.lang.Class<?> wildcardClass16 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass17 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet18 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass8 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet9 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet9);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        java.lang.Class<?> wildcardClass4 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass5 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass14 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass7 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.Genome genome12 = null;
        try {
            int int14 = sectMutator0.mutate(genome12, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        java.lang.Class<?> wildcardClass10 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet11 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet11);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet13 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet13);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet15 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass2 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass3 = sectMutator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        java.lang.Class<?> wildcardClass6 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet7 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet7);
        java.lang.Class<?> wildcardClass9 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet12 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        brain.ga.SectMutator sectMutator0 = new brain.ga.SectMutator();
        java.lang.Class<?> wildcardClass1 = sectMutator0.getClass();
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet2 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet2);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet4 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet4);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet6 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet6);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet8 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet8);
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet10 = null;
        sectMutator0.setAllelesSet(gAEnumAllelesSet10);
        java.lang.Class<?> wildcardClass12 = sectMutator0.getClass();
        java.lang.Class<?> wildcardClass13 = sectMutator0.getClass();
        brain.ga.Genome genome14 = null;
        try {
            int int16 = sectMutator0.mutate(genome14, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

