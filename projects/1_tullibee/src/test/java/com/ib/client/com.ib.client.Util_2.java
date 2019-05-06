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
        java.lang.String str1 = com.ib.client.Util.IntMaxString(100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Vector vector0 = null;
        java.util.Vector vector1 = null;
        boolean boolean2 = com.ib.client.Util.VectorEqualsUnordered(vector0, vector1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1.0", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int2 = com.ib.client.Util.StringCompare("100", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-1.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int2 = com.ib.client.Util.StringCompare("hi!", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 3);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3.0" + "'", str1.equals("3.0"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = com.ib.client.Util.StringCompare("-1.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("3.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3.0" + "'", str1.equals("3.0"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52" + "'", str1.equals("52"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int2 = com.ib.client.Util.StringCompareIgnCase("3.0", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString(0.0d);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int2 = com.ib.client.Util.StringCompare("0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("3.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0.0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1.0", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0.0", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 10.0f);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 4);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4.0" + "'", str1.equals("4.0"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100" + "'", str1.equals("100"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int2 = com.ib.client.Util.StringCompareIgnCase("hi!", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString(1.0d);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString(100.0d);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("1.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 100L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int2 = com.ib.client.Util.StringCompareIgnCase("hi!", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int2 = com.ib.client.Util.StringCompare("100", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int2 = com.ib.client.Util.StringCompare("-1", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1.0", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 0L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0.0", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56) + "'", int2 == (-56));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0.0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4.0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(55);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "55" + "'", str1.equals("55"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(4);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int2 = com.ib.client.Util.StringCompare("100", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-1));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4", "97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int2 = com.ib.client.Util.StringCompare("-1.0", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 1.0f);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52.0" + "'", str1.equals("52.0"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int int2 = com.ib.client.Util.StringCompare("4", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int2 = com.ib.client.Util.StringCompareIgnCase("10.0", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int2 = com.ib.client.Util.StringCompare("3.0", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-56));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-56.0" + "'", str1.equals("-56.0"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("0.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int2 = com.ib.client.Util.StringCompare("0", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-1");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1" + "'", str1.equals("-1"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int2 = com.ib.client.Util.StringCompare("4.0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-56.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-56.0" + "'", str1.equals("-56.0"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("4.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4.0" + "'", str1.equals("4.0"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int2 = com.ib.client.Util.StringCompare("-56.0", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4.0", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int int2 = com.ib.client.Util.StringCompare("0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-1L));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int2 = com.ib.client.Util.StringCompare("4.0", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-2));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-2.0" + "'", str1.equals("-2.0"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int2 = com.ib.client.Util.StringCompare("97", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int2 = com.ib.client.Util.StringCompare("hi!", "52.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((-1.0d));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int2 = com.ib.client.Util.StringCompare("1", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 51);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "51.0" + "'", str1.equals("51.0"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int2 = com.ib.client.Util.StringCompareIgnCase("hi!", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int2 = com.ib.client.Util.StringCompare("97", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int2 = com.ib.client.Util.StringCompare("51.0", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4.0", "10.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("4.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("55");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "55" + "'", str1.equals("55"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52.0", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int2 = com.ib.client.Util.StringCompare("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-53));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-53.0" + "'", str1.equals("-53.0"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int int2 = com.ib.client.Util.StringCompareIgnCase("51.0", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int int2 = com.ib.client.Util.StringCompare("hi!", "-56.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32" + "'", str1.equals("32"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int2 = com.ib.client.Util.StringCompare("1", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-4));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-4" + "'", str1.equals("-4"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-4");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-4" + "'", str1.equals("-4"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("4");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "4" + "'", str1.equals("4"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int2 = com.ib.client.Util.StringCompare("10", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int2 = com.ib.client.Util.StringCompareIgnCase("1", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int2 = com.ib.client.Util.StringCompare("", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52.0", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("1");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("52.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52.0" + "'", str1.equals("52.0"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-56.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35.0" + "'", str1.equals("35.0"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int2 = com.ib.client.Util.StringCompare("-56.0", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int int2 = com.ib.client.Util.StringCompareIgnCase("35.0", "-4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int int2 = com.ib.client.Util.StringCompare("3.0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int int2 = com.ib.client.Util.StringCompare("-4", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32.0" + "'", str1.equals("32.0"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 12);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "12.0" + "'", str1.equals("12.0"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int int2 = com.ib.client.Util.StringCompare("1.0", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int int2 = com.ib.client.Util.StringCompare("35.0", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int2 = com.ib.client.Util.StringCompare("52.0", "51.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1", "32.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-4", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("100.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7" + "'", str1.equals("7"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(51);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "51" + "'", str1.equals("51"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int2 = com.ib.client.Util.StringCompare("10.0", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int int2 = com.ib.client.Util.StringCompare("51", "32.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 10L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-1));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-1.0" + "'", str1.equals("-1.0"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int int2 = com.ib.client.Util.StringCompare("52", "51");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55) + "'", int2 == (-55));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 59);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "59.0" + "'", str1.equals("59.0"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int int2 = com.ib.client.Util.StringCompareIgnCase("10", "51");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int int2 = com.ib.client.Util.StringCompare("1.0", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int int2 = com.ib.client.Util.StringCompare("32", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-3));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-3.0" + "'", str1.equals("-3.0"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "-3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2.0" + "'", str1.equals("2.0"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52.0", "32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-2.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int2 = com.ib.client.Util.StringCompareIgnCase("32", "10.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("7");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int int2 = com.ib.client.Util.StringCompare("-56.0", "51");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int2 = com.ib.client.Util.StringCompare("32", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int2 = com.ib.client.Util.StringCompare("1", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "59.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = com.ib.client.Util.StringCompareIgnCase("35.0", "32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int int2 = com.ib.client.Util.StringCompare("-1.0", "12.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100", "32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-53.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int int2 = com.ib.client.Util.StringCompareIgnCase("51.0", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("35.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35.0" + "'", str1.equals("35.0"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("51");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        int int2 = com.ib.client.Util.StringCompare("-56.0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-5));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5" + "'", str1.equals("-5"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("51");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "51" + "'", str1.equals("51"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-7));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-7" + "'", str1.equals("-7"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2" + "'", str1.equals("2"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("55");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "4.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int int2 = com.ib.client.Util.StringCompare("-4", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int2 = com.ib.client.Util.StringCompareIgnCase("32.0", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-56));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-56" + "'", str1.equals("-56"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int2 = com.ib.client.Util.StringCompare("10", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-56");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-56" + "'", str1.equals("-56"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int int2 = com.ib.client.Util.StringCompare("55", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int2 = com.ib.client.Util.StringCompare("10.0", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 55);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "55.0" + "'", str1.equals("55.0"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35" + "'", str1.equals("35"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int int2 = com.ib.client.Util.StringCompare("52.0", "2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-8));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-8" + "'", str1.equals("-8"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int int2 = com.ib.client.Util.StringCompare("59.0", "10.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int int2 = com.ib.client.Util.StringCompare("59.0", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("35");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int int2 = com.ib.client.Util.StringCompare("1.0", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-53));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-53" + "'", str1.equals("-53"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int int2 = com.ib.client.Util.StringCompareIgnCase("2.0", "-7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("2.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int2 = com.ib.client.Util.StringCompareIgnCase("4.0", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int int2 = com.ib.client.Util.StringCompare("32.0", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int2 = com.ib.client.Util.StringCompareIgnCase("2.0", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int2 = com.ib.client.Util.StringCompare("", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("52");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52" + "'", str1.equals("52"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int int2 = com.ib.client.Util.StringCompareIgnCase("7", "-5");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int int2 = com.ib.client.Util.StringCompare("100", "-53");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-5", "2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int int2 = com.ib.client.Util.StringCompareIgnCase("55", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int2 = com.ib.client.Util.StringCompareIgnCase("0.0", "35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("2");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2" + "'", str1.equals("2"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int int2 = com.ib.client.Util.StringCompare("10", "-7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97.0" + "'", str1.equals("97.0"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(59);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "59" + "'", str1.equals("59"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int int2 = com.ib.client.Util.StringCompare("10.0", "32.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 5);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5.0" + "'", str1.equals("5.0"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int int2 = com.ib.client.Util.StringCompare("12.0", "0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-53.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-53.0" + "'", str1.equals("-53.0"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        int int2 = com.ib.client.Util.StringCompare("2.0", "12.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int int2 = com.ib.client.Util.StringCompare("12.0", "55.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-7");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int2 = com.ib.client.Util.StringCompare("51", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int int2 = com.ib.client.Util.StringCompare("0", "-1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int int2 = com.ib.client.Util.StringCompare("100.0", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        int int2 = com.ib.client.Util.StringCompare("10", "-2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int int2 = com.ib.client.Util.StringCompare("52", "-7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int2 = com.ib.client.Util.StringCompare("5.0", "-3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int int2 = com.ib.client.Util.StringCompare("0", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int int2 = com.ib.client.Util.StringCompareIgnCase("32", "51.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("10");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "35.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int int2 = com.ib.client.Util.StringCompare("10", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-56.0", "55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-3.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-3.0" + "'", str1.equals("-3.0"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-7", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int2 = com.ib.client.Util.StringCompare("32.0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int int2 = com.ib.client.Util.StringCompareIgnCase("35", "35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int2 = com.ib.client.Util.StringCompare("0", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 1L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1.0" + "'", str1.equals("1.0"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int int2 = com.ib.client.Util.StringCompare("52.0", "-7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-55));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-55" + "'", str1.equals("-55"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("59.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "59.0" + "'", str1.equals("59.0"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-2));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-2" + "'", str1.equals("-2"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int int2 = com.ib.client.Util.StringCompare("52.0", "-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("55.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("59");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("59");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "59" + "'", str1.equals("59"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int int2 = com.ib.client.Util.StringCompareIgnCase("3.0", "52.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("7");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7" + "'", str1.equals("7"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int2 = com.ib.client.Util.StringCompareIgnCase("2", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int int2 = com.ib.client.Util.StringCompare("4", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1", "51.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int int2 = com.ib.client.Util.StringCompare("2", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("97.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-56.0", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int int2 = com.ib.client.Util.StringCompareIgnCase("7", "52.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.String str1 = com.ib.client.Util.IntMaxString(3);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3" + "'", str1.equals("3"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-55));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-55.0" + "'", str1.equals("-55.0"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int2 = com.ib.client.Util.StringCompare("", "-55.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-5));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-5.0" + "'", str1.equals("-5.0"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int2 = com.ib.client.Util.StringCompareIgnCase("32", "-56");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        int int2 = com.ib.client.Util.StringCompare("-56", "51.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100.0", "97.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-56.0", "2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int int2 = com.ib.client.Util.StringCompareIgnCase("52", "7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("97.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97.0" + "'", str1.equals("97.0"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (-8));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-8.0" + "'", str1.equals("-8.0"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int int2 = com.ib.client.Util.StringCompareIgnCase("100", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int int2 = com.ib.client.Util.StringCompareIgnCase("", "-2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int int2 = com.ib.client.Util.StringCompareIgnCase("35.0", "10.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int int2 = com.ib.client.Util.StringCompare("hi!", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int int2 = com.ib.client.Util.StringCompare("-5.0", "-55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int int2 = com.ib.client.Util.StringCompare("3.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int int2 = com.ib.client.Util.StringCompare("35.0", "-5.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-53.0", "-3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int int2 = com.ib.client.Util.StringCompare("-2", "32.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        int int2 = com.ib.client.Util.StringCompareIgnCase("7", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("32.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int2 = com.ib.client.Util.StringCompare("52", "-1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int int2 = com.ib.client.Util.StringCompare("59", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int int2 = com.ib.client.Util.StringCompare("0", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int int2 = com.ib.client.Util.StringCompare("", "-8.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-55", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int2 = com.ib.client.Util.StringCompare("-55", "-5.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "100.0" + "'", str1.equals("100.0"));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int int2 = com.ib.client.Util.StringCompare("-1.0", "-55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10.0" + "'", str1.equals("10.0"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int int2 = com.ib.client.Util.StringCompareIgnCase("1", "-56.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("5.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "5.0" + "'", str1.equals("5.0"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-55.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-1", "7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7.0" + "'", str1.equals("7.0"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("12.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int int2 = com.ib.client.Util.StringCompare("-7", "3");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int2 = com.ib.client.Util.StringCompareIgnCase("97.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int int2 = com.ib.client.Util.StringCompareIgnCase("59", "-2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-6));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-6" + "'", str1.equals("-6"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-53");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int int2 = com.ib.client.Util.StringCompare("35.0", "-2.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str1 = com.ib.client.Util.NormalizeString("-2.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-2.0" + "'", str1.equals("-2.0"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int int2 = com.ib.client.Util.StringCompare("10", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int int2 = com.ib.client.Util.StringCompare("52.0", "-3.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-56", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int int2 = com.ib.client.Util.StringCompare("-6", "59");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int int2 = com.ib.client.Util.StringCompare("-2.0", "1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int int2 = com.ib.client.Util.StringCompareIgnCase("5.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("59.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-5.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.ib.client.Util util0 = new com.ib.client.Util();
        java.lang.Class<?> wildcardClass1 = util0.getClass();
        java.lang.Class<?> wildcardClass2 = util0.getClass();
        java.lang.Class<?> wildcardClass3 = util0.getClass();
        java.lang.Class<?> wildcardClass4 = util0.getClass();
        java.lang.Class<?> wildcardClass5 = util0.getClass();
        java.lang.Class<?> wildcardClass6 = util0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-2.0", "-53");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str1 = com.ib.client.Util.DoubleMaxString((double) 8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "8.0" + "'", str1.equals("8.0"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        int int2 = com.ib.client.Util.StringCompare("97", "32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-3));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-3" + "'", str1.equals("-3"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int int2 = com.ib.client.Util.StringCompare("-1.0", "-7");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int int2 = com.ib.client.Util.StringCompare("0.0", "5.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-8.0", "-53.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("-3.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int int2 = com.ib.client.Util.StringCompareIgnCase("12.0", "32.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        boolean boolean1 = com.ib.client.Util.StringIsEmpty("51.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int int2 = com.ib.client.Util.StringCompareIgnCase("10.0", "32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int int2 = com.ib.client.Util.StringCompare("4.0", "-8.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int int2 = com.ib.client.Util.StringCompareIgnCase("3", "100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.String str1 = com.ib.client.Util.IntMaxString((-10));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "-10" + "'", str1.equals("-10"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = com.ib.client.Util.StringCompareIgnCase("55.0", "52");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        int int2 = com.ib.client.Util.StringCompareIgnCase("-6", "12.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int int2 = com.ib.client.Util.StringCompare("hi!", "-55");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int int2 = com.ib.client.Util.StringCompare("10.0", "35.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int int2 = com.ib.client.Util.StringCompare("52", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51) + "'", int2 == (-51));
    }
}

