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
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        try {
            java.lang.Object obj21 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_exchange;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        try {
            java.lang.Object obj22 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_primaryExch = "";
        java.lang.String str21 = contract15.m_expiry;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.Class<?> wildcardClass19 = contract15.getClass();
        try {
            java.lang.Object obj20 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_multiplier = "hi!";
        contract15.m_secType = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_expiry;
        contract15.m_right = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        double double17 = contract15.m_strike;
        java.util.Vector vector18 = contract15.m_comboLegs;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNull(vector18);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_expiry;
        java.util.Vector vector24 = contract15.m_comboLegs;
        java.lang.String str25 = contract15.m_primaryExch;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(vector24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_expiry;
        java.util.Vector vector24 = contract15.m_comboLegs;
        contract15.m_symbol = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(vector24);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        java.lang.Class<?> wildcardClass20 = contract15.getClass();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_secIdType;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_expiry;
        contract15.m_strike = 0;
        contract15.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_primaryExch = "";
        java.lang.String str21 = contract15.m_right;
        java.util.Vector vector32 = null;
        com.ib.client.Contract contract37 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector32, "", false, "hi!", "hi!");
        java.lang.String str38 = contract37.m_comboLegsDescrip;
        boolean boolean39 = contract15.equals((java.lang.Object) str38);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_primaryExch;
        java.lang.String str23 = contract15.m_symbol;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_multiplier;
        boolean boolean18 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_right;
        contract15.m_secType = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        java.lang.String str21 = contract15.m_secType;
        java.lang.String str22 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_multiplier;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        contract15.m_multiplier = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        java.lang.String str19 = contract15.m_currency;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        boolean boolean21 = contract15.m_includeExpired;
        contract15.m_strike = (-1.0d);
        java.lang.String str24 = contract15.m_right;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.Class<?> wildcardClass19 = contract15.getClass();
        java.lang.String str20 = contract15.m_expiry;
        java.lang.String str21 = contract15.m_symbol;
        java.lang.Class<?> wildcardClass22 = contract15.getClass();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        java.lang.String str17 = contract15.m_currency;
        java.lang.String str18 = contract15.m_symbol;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        java.lang.String str19 = contract15.m_currency;
        try {
            java.lang.Object obj20 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        java.lang.String str19 = contract15.m_right;
        contract15.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_symbol;
        java.lang.String str23 = contract15.m_exchange;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        java.util.Vector vector24 = contract15.m_comboLegs;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(vector24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        java.lang.String str20 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        java.lang.String str19 = contract15.m_currency;
        java.lang.String str20 = contract15.m_right;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_primaryExch;
        java.lang.String str23 = contract15.m_comboLegsDescrip;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        contract15.m_symbol = "";
        java.lang.String str22 = contract15.m_localSymbol;
        contract15.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        java.lang.String str17 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_multiplier = "";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        boolean boolean21 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) (short) -1, "hi!", "hi!", "", (double) (short) -1, "hi!", "", "hi!", "hi!", "", vector10, "", true, "hi!", "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.lang.String str21 = contract15.m_comboLegsDescrip;
        contract15.m_secId = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        contract15.m_symbol = "";
        java.lang.String str22 = contract15.m_right;
        java.lang.String str23 = contract15.m_expiry;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_primaryExch = "";
        java.lang.String str21 = contract15.m_right;
        com.ib.client.UnderComp underComp22 = contract15.m_underComp;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(underComp22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_multiplier = "hi!";
        java.lang.Class<?> wildcardClass21 = contract15.getClass();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        java.lang.String str19 = contract15.m_localSymbol;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        contract15.m_currency = "";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        java.lang.String str19 = contract15.m_localSymbol;
        contract15.m_primaryExch = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        java.lang.String str19 = contract15.m_secIdType;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        java.lang.String str17 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_secIdType = "hi!";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_comboLegsDescrip = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        contract15.m_primaryExch = "";
        java.lang.String str23 = contract15.m_currency;
        double double24 = contract15.m_strike;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_localSymbol;
        contract15.m_secId = "";
        contract15.m_symbol = "";
        com.ib.client.UnderComp underComp27 = contract15.m_underComp;
        contract15.m_currency = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(underComp27);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        java.lang.String str23 = contract15.m_expiry;
        java.lang.String str24 = contract15.m_multiplier;
        com.ib.client.UnderComp underComp25 = null;
        contract15.m_underComp = underComp25;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_primaryExch;
        boolean boolean23 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_comboLegsDescrip;
        java.lang.String str24 = contract15.m_primaryExch;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_multiplier = "hi!";
        com.ib.client.UnderComp underComp23 = null;
        contract15.m_underComp = underComp23;
        int int25 = contract15.m_conId;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        java.lang.Class<?> wildcardClass24 = contract15.getClass();
        contract15.m_expiry = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.Class<?> wildcardClass19 = contract15.getClass();
        java.lang.String str20 = contract15.m_expiry;
        java.lang.String str21 = contract15.m_symbol;
        com.ib.client.UnderComp underComp22 = null;
        contract15.m_underComp = underComp22;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) (short) 1, "", "hi!", "hi!", (double) (short) 0, "", "", "hi!", "hi!", "", vector10, "hi!", false, "hi!", "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        java.lang.String str23 = contract15.m_expiry;
        java.lang.String str24 = contract15.m_multiplier;
        contract15.m_includeExpired = true;
        java.lang.String str27 = contract15.m_expiry;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_expiry;
        contract15.m_multiplier = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        contract15.m_exchange = "";
        java.lang.String str26 = contract15.m_secType;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        contract15.m_conId = (-1);
        contract15.m_expiry = "hi!";
        java.lang.String str23 = contract15.m_secType;
        contract15.m_strike = (byte) 100;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean17 = contract15.m_includeExpired;
        contract15.m_primaryExch = "hi!";
        contract15.m_strike = 100L;
        java.lang.String str22 = contract15.m_expiry;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_multiplier;
        java.util.Vector vector18 = contract15.m_comboLegs;
        contract15.m_secId = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(vector18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        contract15.m_exchange = "";
        java.util.Vector vector26 = contract15.m_comboLegs;
        contract15.m_secId = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
        org.junit.Assert.assertNull(vector26);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        contract15.m_secType = "hi!";
        contract15.m_strike = ' ';
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_localSymbol;
        contract15.m_secId = "";
        contract15.m_symbol = "";
        java.lang.String str27 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean17 = contract15.m_includeExpired;
        contract15.m_primaryExch = "hi!";
        contract15.m_strike = 100L;
        contract15.m_primaryExch = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secId = "";
        java.lang.String str19 = contract15.m_secId;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        contract15.m_symbol = "";
        java.lang.String str22 = contract15.m_right;
        java.lang.String str23 = contract15.m_comboLegsDescrip;
        boolean boolean24 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        contract15.m_symbol = "";
        java.lang.String str22 = contract15.m_right;
        int int23 = contract15.m_conId;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        contract15.m_multiplier = "hi!";
        java.lang.String str21 = contract15.m_secType;
        java.lang.String str22 = contract15.m_right;
        contract15.m_primaryExch = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_right;
        java.util.Vector vector24 = contract15.m_comboLegs;
        java.lang.String str25 = contract15.m_comboLegsDescrip;
        contract15.m_strike = 1;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNull(vector24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.util.Vector vector22 = null;
        contract15.m_comboLegs = vector22;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_primaryExch = "";
        contract15.m_primaryExch = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        contract15.m_comboLegsDescrip = "";
        contract15.m_symbol = "";
        contract15.m_primaryExch = "hi!";
        java.lang.String str25 = contract15.m_symbol;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        contract15.m_primaryExch = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        java.util.Vector vector34 = null;
        com.ib.client.Contract contract39 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector34, "", false, "hi!", "hi!");
        contract39.m_comboLegsDescrip = "";
        java.lang.String str42 = contract39.m_right;
        contract39.m_conId = (-1);
        contract39.m_expiry = "hi!";
        contract39.m_secId = "";
        boolean boolean49 = contract15.equals((java.lang.Object) contract39);
        try {
            java.lang.Object obj50 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        contract15.m_localSymbol = "";
        contract15.m_symbol = "";
        java.lang.String str22 = contract15.m_right;
        contract15.m_currency = "";
        contract15.m_secIdType = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.lang.String str21 = contract15.m_symbol;
        java.util.Vector vector32 = null;
        com.ib.client.Contract contract37 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector32, "", false, "hi!", "hi!");
        java.lang.String str38 = contract37.m_currency;
        java.lang.String str39 = contract37.m_right;
        contract37.m_localSymbol = "";
        boolean boolean42 = contract15.equals((java.lang.Object) contract37);
        java.util.Vector vector43 = null;
        contract37.m_comboLegs = vector43;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_multiplier;
        contract15.m_comboLegsDescrip = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.util.Vector vector21 = null;
        contract15.m_comboLegs = vector21;
        java.lang.Class<?> wildcardClass23 = contract15.getClass();
        java.lang.String str24 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        boolean boolean17 = contract15.equals((java.lang.Object) (short) 1);
        java.util.Vector vector18 = null;
        contract15.m_comboLegs = vector18;
        contract15.m_expiry = "";
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        contract15.m_conId = (-1);
        contract15.m_expiry = "hi!";
        contract15.m_secId = "";
        java.lang.String str25 = contract15.m_secId;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        java.lang.String str23 = contract15.m_expiry;
        java.lang.String str24 = contract15.m_multiplier;
        contract15.m_right = "";
        contract15.m_includeExpired = false;
        com.ib.client.UnderComp underComp29 = null;
        contract15.m_underComp = underComp29;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        try {
            java.lang.Object obj24 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        boolean boolean17 = contract15.equals((java.lang.Object) (short) 1);
        contract15.m_strike = (short) -1;
        com.ib.client.UnderComp underComp20 = contract15.m_underComp;
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(underComp20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        contract15.m_primaryExch = "";
        java.lang.String str23 = contract15.m_currency;
        contract15.m_secIdType = "";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        java.lang.String str19 = contract15.m_secIdType;
        contract15.m_localSymbol = "hi!";
        contract15.m_right = "";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        contract15.m_primaryExch = "";
        com.ib.client.UnderComp underComp23 = contract15.m_underComp;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(underComp23);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        java.lang.String str19 = contract15.m_right;
        java.lang.String str20 = contract15.m_symbol;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        contract15.m_exchange = "hi!";
        contract15.m_multiplier = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        java.lang.String str20 = contract15.m_localSymbol;
        java.util.Vector vector21 = null;
        contract15.m_comboLegs = vector21;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_expiry;
        contract15.m_strike = 0;
        contract15.m_expiry = "hi!";
        java.lang.String str27 = contract15.m_expiry;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        java.lang.String str19 = contract15.m_symbol;
        java.lang.String str20 = contract15.m_symbol;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) (short) 10, "", "", "hi!", (double) 100.0f, "", "", "hi!", "hi!", "", vector10, "", false, "", "hi!");
        contract15.m_expiry = "hi!";
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        contract15.m_secId = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        java.lang.String str20 = contract15.m_localSymbol;
        contract15.m_includeExpired = true;
        contract15.m_secType = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_expiry;
        java.lang.String str23 = contract15.m_localSymbol;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        contract15.m_multiplier = "";
        java.lang.String str21 = contract15.m_primaryExch;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        java.util.Vector vector34 = null;
        com.ib.client.Contract contract39 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector34, "", false, "hi!", "hi!");
        contract39.m_comboLegsDescrip = "";
        java.lang.String str42 = contract39.m_right;
        boolean boolean43 = contract15.equals((java.lang.Object) str42);
        java.lang.Class<?> wildcardClass44 = contract15.getClass();
        java.lang.String str45 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        boolean boolean18 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        java.lang.String str23 = contract15.m_expiry;
        java.lang.String str24 = contract15.m_multiplier;
        contract15.m_right = "";
        contract15.m_currency = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        java.lang.String str21 = contract15.m_secType;
        java.lang.String str22 = contract15.m_exchange;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        com.ib.client.UnderComp underComp19 = contract15.m_underComp;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNull(underComp19);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_multiplier = "hi!";
        int int21 = contract15.m_conId;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        java.lang.String str17 = contract15.m_primaryExch;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        int int21 = contract15.m_conId;
        contract15.m_primaryExch = "hi!";
        contract15.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) 'a', "", "hi!", "", (double) (short) 1, "", "", "hi!", "", "", vector10, "hi!", false, "", "");
        com.ib.client.UnderComp underComp16 = contract15.m_underComp;
        java.lang.String str17 = contract15.m_symbol;
        org.junit.Assert.assertNull(underComp16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        contract15.m_comboLegsDescrip = "";
        com.ib.client.UnderComp underComp25 = contract15.m_underComp;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(underComp25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        int int21 = contract15.m_conId;
        contract15.m_primaryExch = "hi!";
        contract15.m_secId = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean17 = contract15.m_includeExpired;
        contract15.m_primaryExch = "hi!";
        contract15.m_strike = 100L;
        java.lang.String str22 = contract15.m_multiplier;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.lang.String str21 = contract15.m_symbol;
        java.util.Vector vector32 = null;
        com.ib.client.Contract contract37 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector32, "", false, "hi!", "hi!");
        java.lang.String str38 = contract37.m_currency;
        java.lang.String str39 = contract37.m_right;
        contract37.m_localSymbol = "";
        boolean boolean42 = contract15.equals((java.lang.Object) contract37);
        java.lang.String str43 = contract15.m_right;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_right;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        boolean boolean17 = contract15.equals((java.lang.Object) (short) 1);
        contract15.m_primaryExch = "";
        java.lang.Class<?> wildcardClass20 = contract15.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "";
        contract15.m_primaryExch = "";
        java.lang.String str21 = contract15.m_right;
        contract15.m_expiry = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        java.lang.String str20 = contract15.m_localSymbol;
        java.lang.String str21 = contract15.m_primaryExch;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        java.lang.String str21 = contract15.m_secType;
        java.lang.Class<?> wildcardClass22 = contract15.getClass();
        java.util.Vector vector23 = null;
        contract15.m_comboLegs = vector23;
        java.util.Vector vector25 = null;
        contract15.m_comboLegs = vector25;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_secType;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.lang.String str21 = contract15.m_symbol;
        java.util.Vector vector32 = null;
        com.ib.client.Contract contract37 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector32, "", false, "hi!", "hi!");
        java.lang.String str38 = contract37.m_currency;
        java.lang.String str39 = contract37.m_right;
        contract37.m_localSymbol = "";
        boolean boolean42 = contract15.equals((java.lang.Object) contract37);
        java.lang.String str43 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        boolean boolean21 = contract15.m_includeExpired;
        contract15.m_strike = (-1.0d);
        contract15.m_expiry = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        contract15.m_multiplier = "hi!";
        contract15.m_currency = "hi!";
        contract15.m_includeExpired = false;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        java.lang.String str19 = contract15.m_localSymbol;
        contract15.m_multiplier = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        contract15.m_multiplier = "hi!";
        contract15.m_multiplier = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_multiplier;
        contract15.m_conId = '#';
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        contract15.m_exchange = "";
        contract15.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        contract15.m_multiplier = "hi!";
        java.lang.String str21 = contract15.m_symbol;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        boolean boolean21 = contract15.m_includeExpired;
        int int22 = contract15.m_conId;
        boolean boolean23 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        java.lang.String str20 = contract15.m_localSymbol;
        contract15.m_includeExpired = true;
        java.lang.String str23 = contract15.m_secType;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_comboLegsDescrip;
        java.lang.String str24 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        contract15.m_multiplier = "";
        contract15.m_includeExpired = false;
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        java.lang.String str19 = contract15.m_symbol;
        java.lang.String str20 = contract15.m_expiry;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        contract15.m_exchange = "";
        java.util.Vector vector26 = contract15.m_comboLegs;
        java.lang.String str27 = contract15.m_exchange;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
        org.junit.Assert.assertNull(vector26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_multiplier;
        java.util.Vector vector18 = contract15.m_comboLegs;
        int int19 = contract15.m_conId;
        contract15.m_expiry = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(vector18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.String str22 = contract15.m_primaryExch;
        java.lang.String str23 = contract15.m_secIdType;
        contract15.m_localSymbol = "hi!";
        int int26 = contract15.m_conId;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        contract15.m_secId = "hi!";
        double double21 = contract15.m_strike;
        java.lang.Class<?> wildcardClass22 = contract15.getClass();
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.Class<?> wildcardClass19 = contract15.getClass();
        java.lang.String str20 = contract15.m_expiry;
        java.lang.String str21 = contract15.m_symbol;
        contract15.m_currency = "hi!";
        java.lang.String str24 = contract15.m_comboLegsDescrip;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        java.lang.String str24 = contract15.m_primaryExch;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        com.ib.client.UnderComp underComp20 = null;
        contract15.m_underComp = underComp20;
        java.lang.String str22 = contract15.m_exchange;
        java.lang.String str23 = contract15.m_expiry;
        java.lang.String str24 = contract15.m_multiplier;
        contract15.m_right = "";
        contract15.m_includeExpired = false;
        java.lang.String str29 = contract15.m_primaryExch;
        java.lang.String str30 = contract15.m_localSymbol;
        boolean boolean31 = contract15.m_includeExpired;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        contract15.m_includeExpired = true;
        java.lang.String str21 = contract15.m_symbol;
        java.util.Vector vector32 = null;
        com.ib.client.Contract contract37 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector32, "", false, "hi!", "hi!");
        java.lang.String str38 = contract37.m_currency;
        java.lang.String str39 = contract37.m_right;
        contract37.m_localSymbol = "";
        boolean boolean42 = contract15.equals((java.lang.Object) contract37);
        com.ib.client.UnderComp underComp43 = null;
        contract15.m_underComp = underComp43;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        boolean boolean18 = contract15.equals((java.lang.Object) false);
        java.lang.String str19 = contract15.m_expiry;
        java.lang.String str20 = contract15.m_secType;
        com.ib.client.UnderComp underComp21 = contract15.m_underComp;
        contract15.m_secId = "hi!";
        contract15.m_exchange = "";
        java.lang.String str26 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNull(underComp21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        boolean boolean17 = contract15.equals((java.lang.Object) (short) 1);
        contract15.m_strike = (short) -1;
        java.util.Vector vector30 = null;
        com.ib.client.Contract contract35 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector30, "", false, "hi!", "hi!");
        java.lang.String str36 = contract35.m_currency;
        boolean boolean38 = contract35.equals((java.lang.Object) false);
        java.lang.String str39 = contract35.m_expiry;
        boolean boolean40 = contract15.equals((java.lang.Object) str39);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_comboLegsDescrip;
        contract15.m_primaryExch = "";
        java.lang.String str19 = contract15.m_symbol;
        contract15.m_secIdType = "";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) (short) 10, "", "", "hi!", (double) 100.0f, "", "", "hi!", "hi!", "", vector10, "", false, "", "hi!");
        java.lang.String str16 = contract15.m_currency;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_multiplier = "hi!";
        java.lang.String str18 = contract15.m_expiry;
        java.lang.String str19 = contract15.m_secIdType;
        contract15.m_multiplier = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        java.lang.String str17 = contract15.m_right;
        java.lang.String str18 = contract15.m_secId;
        java.lang.String str19 = contract15.m_exchange;
        java.lang.String str20 = contract15.m_localSymbol;
        contract15.m_includeExpired = true;
        double double23 = contract15.m_strike;
        java.util.Vector vector24 = null;
        contract15.m_comboLegs = vector24;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract((int) 'a', "", "hi!", "", (double) (short) 1, "", "", "hi!", "", "", vector10, "hi!", false, "", "");
        com.ib.client.UnderComp underComp16 = contract15.m_underComp;
        java.lang.String str17 = contract15.m_secIdType;
        java.lang.String str18 = contract15.m_multiplier;
        org.junit.Assert.assertNull(underComp16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        java.lang.String str16 = contract15.m_currency;
        contract15.m_secIdType = "hi!";
        com.ib.client.UnderComp underComp19 = null;
        contract15.m_underComp = underComp19;
        contract15.m_exchange = "hi!";
        java.lang.String str23 = contract15.m_symbol;
        java.util.Vector vector34 = null;
        com.ib.client.Contract contract39 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector34, "", false, "hi!", "hi!");
        contract39.m_comboLegsDescrip = "";
        java.lang.String str42 = contract39.m_right;
        boolean boolean43 = contract15.equals((java.lang.Object) str42);
        try {
            java.lang.Object obj44 = contract15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Vector vector10 = null;
        com.ib.client.Contract contract15 = new com.ib.client.Contract(0, "hi!", "hi!", "", (double) (short) 10, "hi!", "", "", "hi!", "", vector10, "", false, "hi!", "hi!");
        contract15.m_comboLegsDescrip = "";
        java.lang.String str18 = contract15.m_right;
        java.lang.String str19 = contract15.m_currency;
        java.lang.String str20 = contract15.m_comboLegsDescrip;
        contract15.m_secId = "";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }
}

