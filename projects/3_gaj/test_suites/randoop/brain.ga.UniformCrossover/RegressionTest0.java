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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        brain.ga.Genome genome18 = null;
        brain.ga.Genome genome19 = null;
        try {
            brain.ga.Genome genome20 = uniformCrossover0.cross(genome18, genome19);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        brain.ga.Genome genome19 = null;
        brain.ga.Genome genome20 = null;
        try {
            brain.ga.Genome genome21 = uniformCrossover0.cross(genome19, genome20);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        brain.ga.Genome genome21 = null;
        brain.ga.Genome genome22 = null;
        try {
            brain.ga.Genome genome23 = uniformCrossover0.cross(genome21, genome22);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        brain.ga.Genome genome20 = null;
        brain.ga.Genome genome21 = null;
        try {
            brain.ga.Genome genome22 = uniformCrossover0.cross(genome20, genome21);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        brain.ga.Genome genome22 = null;
        brain.ga.Genome genome23 = null;
        try {
            brain.ga.Genome genome24 = uniformCrossover0.cross(genome22, genome23);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        brain.ga.Genome genome23 = null;
        brain.ga.Genome genome24 = null;
        try {
            brain.ga.Genome genome25 = uniformCrossover0.cross(genome23, genome24);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        brain.ga.Genome genome24 = null;
        brain.ga.Genome genome25 = null;
        try {
            brain.ga.Genome genome26 = uniformCrossover0.cross(genome24, genome25);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        brain.ga.Genome genome25 = null;
        brain.ga.Genome genome26 = null;
        try {
            brain.ga.Genome genome27 = uniformCrossover0.cross(genome25, genome26);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        brain.ga.Genome genome26 = null;
        brain.ga.Genome genome27 = null;
        try {
            brain.ga.Genome genome28 = uniformCrossover0.cross(genome26, genome27);
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        brain.ga.Genome genome27 = null;
        brain.ga.Genome genome28 = null;
        try {
            brain.ga.Genome genome29 = uniformCrossover0.cross(genome27, genome28);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        brain.ga.Genome genome28 = null;
        brain.ga.Genome genome29 = null;
        try {
            brain.ga.Genome genome30 = uniformCrossover0.cross(genome28, genome29);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        brain.ga.Genome genome29 = null;
        brain.ga.Genome genome30 = null;
        try {
            brain.ga.Genome genome31 = uniformCrossover0.cross(genome29, genome30);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        brain.ga.Genome genome30 = null;
        brain.ga.Genome genome31 = null;
        try {
            brain.ga.Genome genome32 = uniformCrossover0.cross(genome30, genome31);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        brain.ga.Genome genome31 = null;
        brain.ga.Genome genome32 = null;
        try {
            brain.ga.Genome genome33 = uniformCrossover0.cross(genome31, genome32);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        brain.ga.Genome genome33 = null;
        brain.ga.Genome genome34 = null;
        try {
            brain.ga.Genome genome35 = uniformCrossover0.cross(genome33, genome34);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        brain.ga.Genome genome34 = null;
        brain.ga.Genome genome35 = null;
        try {
            brain.ga.Genome genome36 = uniformCrossover0.cross(genome34, genome35);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        brain.ga.Genome genome32 = null;
        brain.ga.Genome genome33 = null;
        try {
            brain.ga.Genome genome34 = uniformCrossover0.cross(genome32, genome33);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass34 = uniformCrossover0.getClass();
        brain.ga.Genome genome35 = null;
        brain.ga.Genome genome36 = null;
        try {
            brain.ga.Genome genome37 = uniformCrossover0.cross(genome35, genome36);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass34 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass35 = uniformCrossover0.getClass();
        brain.ga.Genome genome36 = null;
        brain.ga.Genome genome37 = null;
        try {
            brain.ga.Genome genome38 = uniformCrossover0.cross(genome36, genome37);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass34 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass35 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass36 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass37 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass38 = uniformCrossover0.getClass();
        brain.ga.Genome genome39 = null;
        brain.ga.Genome genome40 = null;
        try {
            brain.ga.Genome genome41 = uniformCrossover0.cross(genome39, genome40);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass34 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass35 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass36 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass37 = uniformCrossover0.getClass();
        brain.ga.Genome genome38 = null;
        brain.ga.Genome genome39 = null;
        try {
            brain.ga.Genome genome40 = uniformCrossover0.cross(genome38, genome39);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
        java.lang.Class<?> wildcardClass17 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass18 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass19 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass20 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass21 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass22 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass23 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass24 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass25 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass26 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass27 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass28 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass29 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass30 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass31 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass32 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass33 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass34 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass35 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass36 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass37 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass38 = uniformCrossover0.getClass();
        java.lang.Class<?> wildcardClass39 = uniformCrossover0.getClass();
        brain.ga.Genome genome40 = null;
        brain.ga.Genome genome41 = null;
        try {
            brain.ga.Genome genome42 = uniformCrossover0.cross(genome40, genome41);
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
        java.lang.Class<?> wildcardClass26 = obj0.getClass();
        java.lang.Class<?> wildcardClass27 = obj0.getClass();
        java.lang.Class<?> wildcardClass28 = obj0.getClass();
        java.lang.Class<?> wildcardClass29 = obj0.getClass();
        java.lang.Class<?> wildcardClass30 = obj0.getClass();
        java.lang.Class<?> wildcardClass31 = obj0.getClass();
        java.lang.Class<?> wildcardClass32 = obj0.getClass();
        java.lang.Class<?> wildcardClass33 = obj0.getClass();
        java.lang.Class<?> wildcardClass34 = obj0.getClass();
        java.lang.Class<?> wildcardClass35 = obj0.getClass();
        java.lang.Class<?> wildcardClass36 = obj0.getClass();
        java.lang.Class<?> wildcardClass37 = obj0.getClass();
        java.lang.Class<?> wildcardClass38 = obj0.getClass();
        java.lang.Class<?> wildcardClass39 = obj0.getClass();
        java.lang.Class<?> wildcardClass40 = obj0.getClass();
        java.lang.Class<?> wildcardClass41 = obj0.getClass();
        java.lang.Class<?> wildcardClass42 = obj0.getClass();
        java.lang.Class<?> wildcardClass43 = obj0.getClass();
        java.lang.Class<?> wildcardClass44 = obj0.getClass();
        java.lang.Class<?> wildcardClass45 = obj0.getClass();
        java.lang.Class<?> wildcardClass46 = obj0.getClass();
        java.lang.Class<?> wildcardClass47 = obj0.getClass();
        java.lang.Class<?> wildcardClass48 = obj0.getClass();
        java.lang.Class<?> wildcardClass49 = obj0.getClass();
        java.lang.Class<?> wildcardClass50 = obj0.getClass();
        java.lang.Class<?> wildcardClass51 = obj0.getClass();
        java.lang.Class<?> wildcardClass52 = obj0.getClass();
        java.lang.Class<?> wildcardClass53 = obj0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }
}

