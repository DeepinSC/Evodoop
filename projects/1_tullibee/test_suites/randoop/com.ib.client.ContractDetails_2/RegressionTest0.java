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
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_industry;
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_contractMonth = "";
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        java.lang.String str17 = contractDetails15.m_validExchanges;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 0.0d, "", "hi!", 10, "hi!", "", "", "hi!", "", "hi!", "hi!", "hi!");
        double double16 = contractDetails15.m_minTick;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        contractDetails0.m_marketName = "hi!";
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        contractDetails15.m_underConId = 100;
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        java.lang.String str20 = contractDetails15.m_nextOptionDate;
        java.lang.String str21 = contractDetails15.m_category;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_maturity;
        contractDetails0.m_timeZoneId = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_maturity = "hi!";
        contractDetails0.m_notes = "";
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        contractDetails15.m_issueDate = "";
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_maturity;
        boolean boolean2 = contractDetails0.m_nextOptionPartial;
        contractDetails0.m_convertible = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        java.lang.String str5 = contractDetails0.m_ratings;
        java.lang.String str6 = contractDetails0.m_industry;
        contractDetails0.m_coupon = '#';
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        java.lang.String str2 = contractDetails0.m_ratings;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        contractDetails0.m_nextOptionPartial = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        contractDetails15.m_nextOptionType = "hi!";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        java.lang.String str4 = contractDetails0.m_industry;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        boolean boolean6 = contractDetails0.m_callable;
        contractDetails0.m_convertible = false;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_underConId = (short) 100;
        double double22 = contractDetails15.m_minTick;
        java.lang.String str23 = contractDetails15.m_tradingClass;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_maturity = "hi!";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_cusip;
        contractDetails15.m_nextOptionPartial = true;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        double double18 = contractDetails15.m_coupon;
        contractDetails15.m_nextOptionType = "";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        boolean boolean18 = contractDetails15.m_putable;
        java.lang.String str19 = contractDetails15.m_subcategory;
        double double20 = contractDetails15.m_minTick;
        java.lang.String str21 = contractDetails15.m_marketName;
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        java.lang.String str3 = contractDetails0.m_bondType;
        contractDetails0.m_callable = false;
        contractDetails0.m_timeZoneId = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        contractDetails0.m_maturity = "";
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        contractDetails15.m_issueDate = "";
        int int22 = contractDetails15.m_underConId;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "hi!", "hi!", (double) 1L, "", "hi!", (-1), "hi!", "", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str16 = contractDetails15.m_validExchanges;
        contractDetails15.m_couponType = "";
        java.lang.String str19 = contractDetails15.m_timeZoneId;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        double double18 = contractDetails15.m_coupon;
        int int19 = contractDetails15.m_underConId;
        contractDetails15.m_cusip = "hi!";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_coupon = 0L;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        java.lang.String str20 = contractDetails15.m_nextOptionDate;
        contractDetails15.m_issueDate = "";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        java.lang.String str20 = contractDetails15.m_ratings;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        double double6 = contractDetails0.m_minTick;
        boolean boolean7 = contractDetails0.m_convertible;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        java.lang.String str5 = contractDetails0.m_ratings;
        java.lang.String str6 = contractDetails0.m_industry;
        java.lang.String str7 = contractDetails0.m_cusip;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_callable = true;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 0.0d, "", "hi!", 10, "hi!", "", "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str16 = contractDetails15.m_issueDate;
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_category;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        double double18 = contractDetails15.m_coupon;
        contractDetails15.m_nextOptionPartial = false;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        double double20 = contractDetails15.m_minTick;
        contractDetails15.m_category = "hi!";
        com.ib.client.Contract contract23 = contractDetails15.m_summary;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNull(contract23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        boolean boolean18 = contractDetails15.m_putable;
        java.lang.Class<?> wildcardClass19 = contractDetails15.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_underConId = (short) 100;
        java.lang.String str22 = contractDetails15.m_descAppend;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_validExchanges = "";
        java.lang.String str4 = contractDetails0.m_tradingHours;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_cusip;
        contractDetails15.m_coupon = (short) 1;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_descAppend = "";
        java.lang.String str20 = contractDetails15.m_cusip;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        double double6 = contractDetails0.m_minTick;
        java.lang.String str7 = contractDetails0.m_tradingHours;
        boolean boolean8 = contractDetails0.m_callable;
        java.lang.String str9 = contractDetails0.m_issueDate;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_validExchanges = "";
        java.lang.String str4 = contractDetails0.m_nextOptionDate;
        boolean boolean5 = contractDetails0.m_convertible;
        java.lang.String str6 = contractDetails0.m_subcategory;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        java.lang.String str18 = contractDetails15.m_bondType;
        contractDetails15.m_putable = true;
        contractDetails15.m_coupon = (byte) 1;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        contractDetails15.m_minTick = 1;
        contractDetails15.m_cusip = "";
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_longName;
        contractDetails0.m_putable = true;
        contractDetails0.m_tradingHours = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        contractDetails15.m_priceMagnifier = 1;
        double double20 = contractDetails15.m_coupon;
        java.lang.String str21 = contractDetails15.m_liquidHours;
        java.lang.String str22 = contractDetails15.m_issueDate;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_nextOptionPartial = true;
        contractDetails15.m_minTick = 0.0f;
        contractDetails15.m_tradingClass = "hi!";
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        com.ib.client.Contract contract19 = contractDetails15.m_summary;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(contract19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        contractDetails15.m_priceMagnifier = 1;
        double double20 = contractDetails15.m_coupon;
        contractDetails15.m_convertible = false;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        contractDetails15.m_priceMagnifier = (short) 1;
        java.lang.String str22 = contractDetails15.m_couponType;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 0.0d, "", "hi!", 10, "hi!", "", "", "hi!", "", "hi!", "hi!", "hi!");
        contractDetails15.m_nextOptionType = "hi!";
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_maturity;
        contractDetails0.m_nextOptionPartial = false;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_validExchanges = "";
        java.lang.String str4 = contractDetails0.m_nextOptionDate;
        java.lang.String str5 = contractDetails0.m_longName;
        int int6 = contractDetails0.m_underConId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        contractDetails15.m_priceMagnifier = (short) 1;
        double double22 = contractDetails15.m_minTick;
        contractDetails15.m_orderTypes = "";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "hi!", "", 0.0d, "", "hi!", (int) '4', "", "hi!", "hi!", "", "hi!", "", "", "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        java.lang.String str18 = contractDetails15.m_bondType;
        contractDetails15.m_nextOptionType = "";
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        contractDetails15.m_priceMagnifier = 1;
        double double20 = contractDetails15.m_coupon;
        com.ib.client.Contract contract21 = contractDetails15.m_summary;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(contract21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        contractDetails0.m_orderTypes = "";
        java.lang.String str4 = contractDetails0.m_contractMonth;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        double double19 = contractDetails15.m_coupon;
        contractDetails15.m_priceMagnifier = (short) 1;
        double double22 = contractDetails15.m_minTick;
        com.ib.client.Contract contract23 = contractDetails15.m_summary;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNull(contract23);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_contractMonth = "";
        contractDetails15.m_couponType = "";
        int int21 = contractDetails15.m_underConId;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        contractDetails0.m_maturity = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        boolean boolean22 = contractDetails15.m_putable;
        contractDetails15.m_nextOptionPartial = true;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_issueDate = "hi!";
        contractDetails15.m_contractMonth = "";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        java.lang.String str18 = contractDetails15.m_descAppend;
        java.lang.String str19 = contractDetails15.m_issueDate;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_longName = "";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        java.lang.String str3 = contractDetails0.m_ratings;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        java.lang.String str19 = contractDetails15.m_nextOptionType;
        contractDetails15.m_nextOptionType = "";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        java.lang.String str19 = contractDetails15.m_orderTypes;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        java.lang.String str19 = contractDetails15.m_nextOptionType;
        contractDetails15.m_longName = "";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_maturity = "hi!";
        java.lang.String str3 = contractDetails0.m_couponType;
        java.lang.String str4 = contractDetails0.m_nextOptionDate;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        contractDetails0.m_longName = "";
        java.lang.String str8 = contractDetails0.m_cusip;
        contractDetails0.m_underConId = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        java.lang.String str18 = contractDetails15.m_descAppend;
        java.lang.String str19 = contractDetails15.m_marketName;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        java.lang.String str19 = contractDetails15.m_ratings;
        contractDetails15.m_putable = false;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_underConId = (short) 100;
        double double22 = contractDetails15.m_minTick;
        contractDetails15.m_nextOptionPartial = true;
        java.lang.String str25 = contractDetails15.m_longName;
        contractDetails15.m_validExchanges = "hi!";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        java.lang.String str18 = contractDetails15.m_marketName;
        java.lang.String str19 = contractDetails15.m_industry;
        double double20 = contractDetails15.m_minTick;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        contractDetails15.m_priceMagnifier = 1;
        contractDetails15.m_cusip = "hi!";
        contractDetails15.m_notes = "";
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_bondType;
        contractDetails0.m_longName = "";
        java.lang.String str7 = contractDetails0.m_longName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        java.lang.String str3 = contractDetails0.m_bondType;
        com.ib.client.Contract contract4 = null;
        contractDetails0.m_summary = contract4;
        int int6 = contractDetails0.m_priceMagnifier;
        java.lang.String str7 = contractDetails0.m_bondType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "hi!", "hi!", (double) 1L, "", "hi!", (-1), "hi!", "", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str16 = contractDetails15.m_validExchanges;
        contractDetails15.m_couponType = "";
        contractDetails15.m_timeZoneId = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        contractDetails15.m_timeZoneId = "hi!";
        int int24 = contractDetails15.m_underConId;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        java.lang.String str19 = contractDetails15.m_ratings;
        contractDetails15.m_longName = "hi!";
        contractDetails15.m_convertible = true;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        java.lang.String str6 = contractDetails0.m_couponType;
        int int7 = contractDetails0.m_underConId;
        contractDetails0.m_underConId = (-1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        boolean boolean19 = contractDetails15.m_callable;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_maturity = "hi!";
        java.lang.String str3 = contractDetails0.m_couponType;
        contractDetails0.m_timeZoneId = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_longName;
        contractDetails0.m_putable = true;
        contractDetails0.m_coupon = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        double double17 = contractDetails15.m_coupon;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        contractDetails15.m_notes = "hi!";
        java.lang.String str21 = contractDetails15.m_nextOptionType;
        double double22 = contractDetails15.m_coupon;
        contractDetails15.m_tradingHours = "hi!";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        java.lang.String str3 = contractDetails0.m_bondType;
        contractDetails0.m_callable = false;
        contractDetails0.m_longName = "";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        contractDetails0.m_timeZoneId = "";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        double double18 = contractDetails15.m_coupon;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        int int20 = contractDetails15.m_priceMagnifier;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        java.lang.String str20 = contractDetails15.m_longName;
        contractDetails15.m_nextOptionPartial = false;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_nextOptionDate = "";
        java.lang.String str22 = contractDetails15.m_longName;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "hi!", "hi!", (double) 1L, "", "hi!", (-1), "hi!", "", "hi!", "", "hi!", "hi!", "hi!", "hi!");
        java.lang.String str16 = contractDetails15.m_validExchanges;
        com.ib.client.Contract contract17 = contractDetails15.m_summary;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNull(contract17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        java.lang.String str6 = contractDetails0.m_couponType;
        int int7 = contractDetails0.m_underConId;
        contractDetails0.m_subcategory = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        boolean boolean22 = contractDetails15.m_putable;
        contractDetails15.m_coupon = 1.0f;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        contractDetails15.m_nextOptionType = "";
        java.lang.String str21 = contractDetails15.m_ratings;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_category;
        com.ib.client.Contract contract17 = null;
        contractDetails15.m_summary = contract17;
        contractDetails15.m_tradingClass = "hi!";
        java.lang.String str21 = contractDetails15.m_validExchanges;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        java.lang.String str5 = contractDetails0.m_maturity;
        java.lang.String str6 = contractDetails0.m_longName;
        java.lang.String str7 = contractDetails0.m_liquidHours;
        double double8 = contractDetails0.m_coupon;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        boolean boolean4 = contractDetails0.m_callable;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_maturity = "hi!";
        java.lang.String str3 = contractDetails0.m_subcategory;
        contractDetails0.m_ratings = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_category;
        com.ib.client.Contract contract17 = null;
        contractDetails15.m_summary = contract17;
        contractDetails15.m_tradingClass = "hi!";
        java.lang.String str21 = contractDetails15.m_contractMonth;
        contractDetails15.m_priceMagnifier = 100;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        double double17 = contractDetails15.m_minTick;
        boolean boolean18 = contractDetails15.m_putable;
        contractDetails15.m_priceMagnifier = (byte) 10;
        java.lang.String str21 = contractDetails15.m_tradingClass;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        contractDetails0.m_priceMagnifier = 0;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        java.lang.String str5 = contractDetails0.m_ratings;
        java.lang.String str6 = contractDetails0.m_industry;
        java.lang.String str7 = contractDetails0.m_notes;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        double double5 = contractDetails0.m_coupon;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_orderTypes = "hi!";
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_liquidHours = "hi!";
        contractDetails15.m_notes = "hi!";
        java.lang.String str21 = contractDetails15.m_nextOptionType;
        double double22 = contractDetails15.m_coupon;
        contractDetails15.m_nextOptionType = "";
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_validExchanges = "";
        java.lang.String str4 = contractDetails0.m_nextOptionDate;
        contractDetails0.m_timeZoneId = "hi!";
        contractDetails0.m_industry = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        contractDetails15.m_validExchanges = "hi!";
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_bondType;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_category;
        com.ib.client.Contract contract17 = null;
        contractDetails15.m_summary = contract17;
        com.ib.client.Contract contract19 = contractDetails15.m_summary;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(contract19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        java.lang.String str6 = contractDetails0.m_tradingHours;
        java.lang.String str7 = contractDetails0.m_timeZoneId;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        boolean boolean16 = contractDetails15.m_callable;
        contractDetails15.m_couponType = "hi!";
        contractDetails15.m_nextOptionType = "";
        java.lang.String str21 = contractDetails15.m_tradingHours;
        contractDetails15.m_callable = false;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass16 = contractDetails15.getClass();
        contractDetails15.m_coupon = 0.0d;
        java.lang.String str19 = contractDetails15.m_couponType;
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        double double6 = contractDetails0.m_coupon;
        contractDetails0.m_industry = "";
        java.lang.String str9 = contractDetails0.m_ratings;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        boolean boolean18 = contractDetails15.m_putable;
        contractDetails15.m_priceMagnifier = 10;
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass16 = contractDetails15.getClass();
        contractDetails15.m_coupon = 0.0d;
        boolean boolean19 = contractDetails15.m_convertible;
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        contractDetails15.m_minTick = 1;
        contractDetails15.m_contractMonth = "hi!";
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_timeZoneId;
        contractDetails15.m_cusip = "hi!";
        contractDetails15.m_ratings = "hi!";
        java.lang.String str22 = contractDetails15.m_category;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        contractDetails15.m_nextOptionType = "";
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        boolean boolean17 = contractDetails15.m_callable;
        contractDetails15.m_category = "";
        contractDetails15.m_underConId = (short) 100;
        double double22 = contractDetails15.m_minTick;
        contractDetails15.m_nextOptionPartial = true;
        java.lang.String str25 = contractDetails15.m_longName;
        java.lang.String str26 = contractDetails15.m_cusip;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        contractDetails0.m_underConId = ' ';
        contractDetails0.m_timeZoneId = "hi!";
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        contractDetails0.m_longName = "";
        java.lang.String str8 = contractDetails0.m_cusip;
        boolean boolean9 = contractDetails0.m_nextOptionPartial;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        double double6 = contractDetails0.m_minTick;
        java.lang.String str7 = contractDetails0.m_tradingHours;
        boolean boolean8 = contractDetails0.m_callable;
        java.lang.String str9 = contractDetails0.m_industry;
        contractDetails0.m_longName = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_nextOptionPartial = true;
        java.lang.String str5 = contractDetails0.m_validExchanges;
        double double6 = contractDetails0.m_minTick;
        java.lang.String str7 = contractDetails0.m_category;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        contractDetails15.m_orderTypes = "";
        contractDetails15.m_minTick = (short) 10;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        contractDetails0.m_issueDate = "hi!";
        java.lang.String str6 = contractDetails0.m_liquidHours;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        contractDetails15.m_maturity = "hi!";
        contractDetails15.m_nextOptionType = "";
        java.lang.String str22 = contractDetails15.m_marketName;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        java.lang.String str19 = contractDetails15.m_tradingHours;
        contractDetails15.m_underConId = (short) 100;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        java.lang.String str18 = contractDetails15.m_timeZoneId;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        contractDetails15.m_orderTypes = "hi!";
        java.lang.String str20 = contractDetails15.m_notes;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_validExchanges = "";
        contractDetails0.m_putable = true;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_orderTypes = "hi!";
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_convertible = true;
        contractDetails0.m_underConId = ' ';
        contractDetails0.m_longName = "hi!";
        double double9 = contractDetails0.m_coupon;
        contractDetails0.m_couponType = "hi!";
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        java.lang.String str5 = contractDetails0.m_category;
        contractDetails0.m_ratings = "";
        boolean boolean8 = contractDetails0.m_putable;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_tradingClass = "hi!";
        contractDetails0.m_tradingClass = "hi!";
        contractDetails0.m_putable = true;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        double double17 = contractDetails15.m_minTick;
        java.lang.String str18 = contractDetails15.m_notes;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_longName;
        contractDetails0.m_industry = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        contractDetails0.m_cusip = "";
        contractDetails0.m_longName = "";
        java.lang.String str8 = contractDetails0.m_cusip;
        contractDetails0.m_subcategory = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        java.lang.String str3 = contractDetails0.m_bondType;
        contractDetails0.m_callable = false;
        contractDetails0.m_convertible = true;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        contractDetails15.m_timeZoneId = "hi!";
        contractDetails15.m_cusip = "hi!";
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_category;
        com.ib.client.Contract contract17 = null;
        contractDetails15.m_summary = contract17;
        java.lang.Class<?> wildcardClass19 = contractDetails15.getClass();
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_longName;
        contractDetails15.m_descAppend = "hi!";
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        contractDetails15.m_orderTypes = "";
        java.lang.String str22 = contractDetails15.m_cusip;
        java.lang.String str23 = contractDetails15.m_subcategory;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_minTick;
        contractDetails15.m_coupon = '#';
        java.lang.String str19 = contractDetails15.m_industry;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_nextOptionPartial = true;
        contractDetails15.m_minTick = 0.0f;
        contractDetails15.m_tradingClass = "";
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        java.lang.String str4 = contractDetails0.m_issueDate;
        contractDetails0.m_bondType = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_nextOptionDate = "";
        java.lang.String str4 = contractDetails0.m_timeZoneId;
        contractDetails0.m_tradingHours = "hi!";
        contractDetails0.m_descAppend = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_industry;
        java.lang.String str20 = contractDetails15.m_orderTypes;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_putable;
        boolean boolean2 = contractDetails0.m_putable;
        java.lang.String str3 = contractDetails0.m_longName;
        java.lang.String str4 = contractDetails0.m_bondType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        contractDetails15.m_underConId = 0;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        java.lang.String str5 = contractDetails0.m_category;
        java.lang.String str6 = contractDetails0.m_nextOptionDate;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        boolean boolean19 = contractDetails15.m_putable;
        java.lang.String str20 = contractDetails15.m_longName;
        java.lang.String str21 = contractDetails15.m_notes;
        contractDetails15.m_orderTypes = "hi!";
        java.lang.String str24 = contractDetails15.m_descAppend;
        java.lang.String str25 = contractDetails15.m_issueDate;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_minTick;
        boolean boolean17 = contractDetails15.m_convertible;
        java.lang.String str18 = contractDetails15.m_timeZoneId;
        boolean boolean19 = contractDetails15.m_convertible;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        contractDetails15.m_priceMagnifier = (short) 0;
        java.lang.String str18 = contractDetails15.m_bondType;
        java.lang.String str19 = contractDetails15.m_tradingHours;
        java.lang.String str20 = contractDetails15.m_ratings;
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_nextOptionDate;
        contractDetails15.m_orderTypes = "hi!";
        java.lang.String str20 = contractDetails15.m_maturity;
        com.ib.client.Contract contract21 = contractDetails15.m_summary;
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(contract21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_orderTypes = "hi!";
        java.lang.String str3 = contractDetails0.m_bondType;
        contractDetails0.m_nextOptionPartial = false;
        java.lang.String str6 = contractDetails0.m_maturity;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        contractDetails0.m_underConId = (short) 1;
        java.lang.String str7 = contractDetails0.m_nextOptionDate;
        contractDetails0.m_tradingHours = "hi!";
        java.lang.String str10 = contractDetails0.m_orderTypes;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_maturity = "hi!";
        java.lang.String str3 = contractDetails0.m_issueDate;
        contractDetails0.m_maturity = "hi!";
        contractDetails0.m_marketName = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        contractDetails0.m_priceMagnifier = (short) -1;
        contractDetails0.m_longName = "";
        java.lang.String str5 = contractDetails0.m_category;
        contractDetails0.m_ratings = "";
        boolean boolean8 = contractDetails0.m_nextOptionPartial;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        double double16 = contractDetails15.m_coupon;
        java.lang.String str17 = contractDetails15.m_cusip;
        contractDetails15.m_subcategory = "";
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_category;
        com.ib.client.Contract contract17 = null;
        contractDetails15.m_summary = contract17;
        contractDetails15.m_tradingClass = "hi!";
        java.lang.String str21 = contractDetails15.m_descAppend;
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        java.lang.String str1 = contractDetails0.m_cusip;
        contractDetails0.m_tradingClass = "hi!";
        java.lang.String str4 = contractDetails0.m_liquidHours;
        contractDetails0.m_minTick = 10L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.ib.client.ContractDetails contractDetails0 = new com.ib.client.ContractDetails();
        boolean boolean1 = contractDetails0.m_callable;
        contractDetails0.m_putable = true;
        java.lang.String str4 = contractDetails0.m_longName;
        contractDetails0.m_putable = true;
        com.ib.client.Contract contract7 = contractDetails0.m_summary;
        com.ib.client.ContractDetails contractDetails22 = new com.ib.client.ContractDetails(contract7, "hi!", "hi!", (double) 0, "hi!", "hi!", 0, "", "", "", "", "", "", "", "");
        java.lang.String str23 = contractDetails22.m_category;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(contract7);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.ib.client.Contract contract0 = null;
        com.ib.client.ContractDetails contractDetails15 = new com.ib.client.ContractDetails(contract0, "", "", 1.0d, "", "", 1, "", "hi!", "", "", "hi!", "hi!", "", "");
        java.lang.String str16 = contractDetails15.m_issueDate;
        contractDetails15.m_maturity = "hi!";
        java.lang.String str19 = contractDetails15.m_maturity;
        contractDetails15.m_couponType = "";
        double double22 = contractDetails15.m_minTick;
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }
}

