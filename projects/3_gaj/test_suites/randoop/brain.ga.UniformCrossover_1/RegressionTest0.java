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
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        brain.ga.Genome genome1 = null;
        brain.ga.Genome genome2 = null;
        try {
            brain.ga.Genome genome3 = uniformCrossover0.cross(genome1, genome2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        brain.ga.Genome genome2 = null;
        brain.ga.Genome genome3 = null;
        try {
            brain.ga.Genome genome4 = uniformCrossover0.cross(genome2, genome3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        brain.ga.Genome genome3 = null;
        brain.ga.Genome genome4 = null;
        try {
            brain.ga.Genome genome5 = uniformCrossover0.cross(genome3, genome4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        brain.ga.Genome genome5 = null;
        brain.ga.Genome genome6 = null;
        try {
            brain.ga.Genome genome7 = uniformCrossover0.cross(genome5, genome6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        brain.ga.Genome genome4 = null;
        brain.ga.Genome genome5 = null;
        try {
            brain.ga.Genome genome6 = uniformCrossover0.cross(genome4, genome5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        brain.ga.Genome genome6 = null;
        brain.ga.Genome genome7 = null;
        try {
            brain.ga.Genome genome8 = uniformCrossover0.cross(genome6, genome7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        brain.ga.Genome genome8 = null;
        brain.ga.Genome genome9 = null;
        try {
            brain.ga.Genome genome10 = uniformCrossover0.cross(genome8, genome9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        brain.ga.Genome genome7 = null;
        brain.ga.Genome genome8 = null;
        try {
            brain.ga.Genome genome9 = uniformCrossover0.cross(genome7, genome8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        brain.ga.Genome genome9 = null;
        brain.ga.Genome genome10 = null;
        try {
            brain.ga.Genome genome11 = uniformCrossover0.cross(genome9, genome10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        brain.ga.Genome genome10 = null;
        brain.ga.Genome genome11 = null;
        try {
            brain.ga.Genome genome12 = uniformCrossover0.cross(genome10, genome11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        brain.ga.Genome genome11 = null;
        brain.ga.Genome genome12 = null;
        try {
            brain.ga.Genome genome13 = uniformCrossover0.cross(genome11, genome12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        brain.ga.Genome genome12 = null;
        brain.ga.Genome genome13 = null;
        try {
            brain.ga.Genome genome14 = uniformCrossover0.cross(genome12, genome13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass12 = uniformCrossover0.getClass();
        brain.ga.Genome genome13 = null;
        brain.ga.Genome genome14 = null;
        try {
            brain.ga.Genome genome15 = uniformCrossover0.cross(genome13, genome14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass12 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass13 = uniformCrossover0.getClass();
        brain.ga.Genome genome14 = null;
        brain.ga.Genome genome15 = null;
        try {
            brain.ga.Genome genome16 = uniformCrossover0.cross(genome14, genome15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass12 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass13 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass14 = uniformCrossover0.getClass();
        brain.ga.Genome genome15 = null;
        brain.ga.Genome genome16 = null;
        try {
            brain.ga.Genome genome17 = uniformCrossover0.cross(genome15, genome16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass12 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass13 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass14 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass15 = uniformCrossover0.getClass();
        brain.ga.Genome genome16 = null;
        brain.ga.Genome genome17 = null;
        try {
            brain.ga.Genome genome18 = uniformCrossover0.cross(genome16, genome17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Class<?> wildcardClass7 = obj0.getClass();
        java.lang.Class<?> wildcardClass8 = obj0.getClass();
        java.lang.Class<?> wildcardClass9 = obj0.getClass();
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        java.lang.Class<?> wildcardClass14 = obj0.getClass();
        java.lang.Class<?> wildcardClass15 = obj0.getClass();
        java.lang.Class<?> wildcardClass16 = obj0.getClass();
        java.lang.Class<?> wildcardClass17 = obj0.getClass();
        java.lang.Class<?> wildcardClass18 = obj0.getClass();
        java.lang.Class<?> wildcardClass19 = obj0.getClass();
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        java.lang.Class<?> wildcardClass21 = obj0.getClass();
        java.lang.Class<?> wildcardClass22 = obj0.getClass();
        java.lang.Class<?> wildcardClass23 = obj0.getClass();
        java.lang.Class<?> wildcardClass24 = obj0.getClass();
        java.lang.Class<?> wildcardClass25 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        brain.ga.UniformCrossover uniformCrossover0 = new brain.ga.UniformCrossover();
        java.lang.Class<?> wildcardClass1 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass2 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass3 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass4 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass5 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass6 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass7 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass8 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass9 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass10 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass11 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass12 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass13 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass14 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass15 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass16 = uniformCrossover0.getClass();
        brain.ga.Genome genome17 = null;
        brain.ga.Genome genome18 = null;
        try {
            brain.ga.Genome genome19 = uniformCrossover0.cross(genome17, genome18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

