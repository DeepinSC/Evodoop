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
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 'a');
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int1 = brain.ga.GAUtilities.nextPos((int) 'a');
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 82 + "'", int1 == 82);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int1 = brain.ga.GAUtilities.nextPos((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 82);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        try {
            int int1 = brain.ga.GAUtilities.nextPos(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) ' ');
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = brain.ga.GAUtilities.nextPos((int) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        try {
            int int1 = brain.ga.GAUtilities.nextPos((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (byte) -1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int1 = brain.ga.GAUtilities.nextPos((int) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (short) -1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (-1));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 100L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (byte) 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (short) 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) '4');
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int1 = brain.ga.GAUtilities.nextPos((int) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        try {
            int int1 = brain.ga.GAUtilities.nextPos((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int1 = brain.ga.GAUtilities.nextPos(74);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) '#');
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((-1.0d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin(10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int1 = brain.ga.GAUtilities.nextPos(10);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin(0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int1 = brain.ga.GAUtilities.nextPos(29);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int1 = brain.ga.GAUtilities.nextPos(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        int int1 = brain.ga.GAUtilities.nextPos(24);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin(1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int1 = brain.ga.GAUtilities.nextPos(62);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 24);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 19);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int int1 = brain.ga.GAUtilities.nextPos(19);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        try {
            int int1 = brain.ga.GAUtilities.nextPos((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        int int1 = brain.ga.GAUtilities.nextPos(15);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 0.0f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 62);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int int1 = brain.ga.GAUtilities.nextPos(4);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 15);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        int int1 = brain.ga.GAUtilities.nextPos(49);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 1.0f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int int1 = brain.ga.GAUtilities.nextPos((int) '4');
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 1L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 39);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 74);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        int int1 = brain.ga.GAUtilities.nextPos((int) ' ');
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        try {
            int int1 = brain.ga.GAUtilities.nextPos((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        int int1 = brain.ga.GAUtilities.nextPos((int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 100);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 35);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (-1.0f));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        int int1 = brain.ga.GAUtilities.nextPos(35);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin(100.0d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 49);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        int int1 = brain.ga.GAUtilities.nextPos(82);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 58 + "'", int1 == 58);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 10L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        try {
            int int1 = brain.ga.GAUtilities.nextPos((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        int int1 = brain.ga.GAUtilities.nextPos((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        int int1 = brain.ga.GAUtilities.nextPos(100);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        int int1 = brain.ga.GAUtilities.nextPos(39);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        int int1 = brain.ga.GAUtilities.nextPos((int) '#');
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 29);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 10.0f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 100.0f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        int int1 = brain.ga.GAUtilities.nextPos(27);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (byte) 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        int int1 = brain.ga.GAUtilities.nextPos(14);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (byte) 100);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        int int1 = brain.ga.GAUtilities.nextPos(23);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        int int1 = brain.ga.GAUtilities.nextPos(12);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        int int1 = brain.ga.GAUtilities.nextPos(9);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        int int1 = brain.ga.GAUtilities.nextPos(58);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 0L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 27);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        int int1 = brain.ga.GAUtilities.nextPos(8);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 12);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        int int1 = brain.ga.GAUtilities.nextPos(11);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        int int1 = brain.ga.GAUtilities.nextPos(25);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        int int1 = brain.ga.GAUtilities.nextPos(2);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        int int1 = brain.ga.GAUtilities.nextPos(17);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 2);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        boolean boolean1 = brain.ga.GAUtilities.flipCoin((double) 58);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
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
        java.lang.Class<?> wildcardClass54 = obj0.getClass();
        java.lang.Class<?> wildcardClass55 = obj0.getClass();
        java.lang.Class<?> wildcardClass56 = obj0.getClass();
        java.lang.Class<?> wildcardClass57 = obj0.getClass();
        java.lang.Class<?> wildcardClass58 = obj0.getClass();
        java.lang.Class<?> wildcardClass59 = obj0.getClass();
        java.lang.Class<?> wildcardClass60 = obj0.getClass();
        java.lang.Class<?> wildcardClass61 = obj0.getClass();
        java.lang.Class<?> wildcardClass62 = obj0.getClass();
        java.lang.Class<?> wildcardClass63 = obj0.getClass();
        java.lang.Class<?> wildcardClass64 = obj0.getClass();
        java.lang.Class<?> wildcardClass65 = obj0.getClass();
        java.lang.Class<?> wildcardClass66 = obj0.getClass();
        java.lang.Class<?> wildcardClass67 = obj0.getClass();
        java.lang.Class<?> wildcardClass68 = obj0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        brain.ga.GAUtilities gAUtilities0 = new brain.ga.GAUtilities();
        java.lang.Class<?> wildcardClass1 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass2 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass3 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass4 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass5 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass6 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass7 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass8 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass9 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass10 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass11 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass12 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass13 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass14 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass15 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass16 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass17 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass18 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass19 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass20 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass21 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass22 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass23 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass24 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass25 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass26 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass27 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass28 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass29 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass30 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass31 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass32 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass33 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass34 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass35 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass36 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass37 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass38 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass39 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass40 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass41 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass42 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass43 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass44 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass45 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass46 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass47 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass48 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass49 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass50 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass51 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass52 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass53 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass54 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass55 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass56 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass57 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass58 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass59 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass60 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass61 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass62 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass63 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass64 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass65 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass66 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass67 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass68 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass69 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass70 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass71 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass72 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass73 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass74 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass75 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass76 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass77 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass78 = gAUtilities0.getClass();
        java.lang.Class<?> wildcardClass79 = gAUtilities0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }
}
