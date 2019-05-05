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
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        try {
            boolean boolean2 = execution0.equals((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.ib.client.Execution");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        java.lang.String str2 = execution0.m_side;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_exchange = "";
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        execution13.m_acctNumber = "hi!";
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_clientId = '4';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        double double2 = execution0.m_avgPrice;
        com.ib.client.Execution execution3 = new com.ib.client.Execution();
        execution3.m_price = (byte) -1;
        execution3.m_acctNumber = "";
        java.lang.Class<?> wildcardClass8 = execution3.getClass();
        try {
            boolean boolean9 = execution0.equals((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.Execution");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_permId;
        execution0.m_execId = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        double double6 = execution0.m_avgPrice;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        double double7 = execution0.m_avgPrice;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_clientId = (byte) 10;
        int int9 = execution0.m_orderId;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_side = "";
        java.lang.String str7 = execution0.m_exchange;
        execution0.m_time = "";
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        java.lang.String str8 = execution0.m_acctNumber;
        java.lang.String str9 = execution0.m_side;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        double double14 = execution13.m_avgPrice;
        execution13.m_exchange = "";
        execution13.m_cumQty = (byte) 10;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        java.lang.String str2 = execution0.m_time;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        double double14 = execution13.m_avgPrice;
        execution13.m_exchange = "";
        execution13.m_cumQty = (byte) 100;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        int int16 = execution13.m_cumQty;
        execution13.m_shares = (byte) 100;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        execution0.m_avgPrice = (byte) -1;
        java.lang.String str8 = execution0.m_side;
        int int9 = execution0.m_orderId;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        execution0.m_exchange = "hi!";
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.Class<?> wildcardClass14 = execution13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_acctNumber = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        java.lang.String str5 = execution0.m_acctNumber;
        execution0.m_cumQty = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        int int7 = execution0.m_cumQty;
        execution0.m_acctNumber = "";
        java.lang.String str10 = execution0.m_exchange;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        execution0.m_orderId = (byte) 100;
        execution0.m_orderId = (short) -1;
        java.lang.String str8 = execution0.m_acctNumber;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        double double3 = execution0.m_price;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) (short) 100, 1, "", "", "", "", "hi!", 0, (double) 0L, (int) (short) 10, (int) (byte) -1, (int) (short) 1, (double) (-1));
        execution13.m_permId = 1;
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_liquidation = 'a';
        execution0.m_side = "hi!";
        execution0.m_clientId = 'a';
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.Execution execution13 = new com.ib.client.Execution(0, (int) (short) 0, "hi!", "", "hi!", "", "hi!", (int) '4', (double) (-1L), 10, (int) (byte) -1, (int) (short) -1, 1.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        java.lang.String str15 = execution13.m_acctNumber;
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_side;
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_price = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        execution13.m_side = "hi!";
        int int18 = execution13.m_permId;
        try {
            boolean boolean20 = execution13.equals((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.ib.client.Execution");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_acctNumber = "";
        int int9 = execution0.m_cumQty;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        execution0.m_exchange = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        int int16 = execution13.m_permId;
        execution13.m_acctNumber = "";
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) (byte) -1, 0, "hi!", "", "hi!", "", "", 0, (double) '#', (int) (short) 100, (int) ' ', 100, 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        execution0.m_execId = "";
        int int8 = execution0.m_liquidation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_clientId = (byte) 10;
        execution0.m_time = "";
        java.lang.String str11 = execution0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        int int3 = execution0.m_cumQty;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        execution13.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        int int10 = execution0.m_liquidation;
        execution0.m_permId = 'a';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_shares = (byte) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_acctNumber = "";
        execution0.m_permId = (short) 1;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_exchange = "";
        int int7 = execution0.m_cumQty;
        execution0.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '4', (int) (byte) 10, "hi!", "hi!", "hi!", "", "", 0, (double) 0.0f, (int) (short) 100, 52, 52, (double) ' ');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        java.lang.String str3 = execution0.m_execId;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        java.lang.String str3 = execution0.m_exchange;
        int int4 = execution0.m_liquidation;
        execution0.m_side = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((-1), 52, "", "", "hi!", "", "hi!", 100, 10.0d, (int) (short) -1, 97, (int) (byte) 10, (double) 10L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        execution0.m_execId = "";
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_shares = (byte) 1;
        execution0.m_price = (byte) 10;
        execution0.m_time = "";
        execution0.m_shares = (byte) 1;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.Execution execution13 = new com.ib.client.Execution(97, 97, "hi!", "", "", "", "hi!", (int) (short) 100, (double) (byte) -1, 1, (int) 'a', 0, (double) '#');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        double double14 = execution13.m_price;
        execution13.m_orderId = (byte) 1;
        execution13.m_side = "hi!";
        int int19 = execution13.m_shares;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_orderId;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        int int10 = execution0.m_permId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_liquidation = (-1);
        execution13.m_permId = 0;
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_liquidation = (-1);
        int int16 = execution13.m_orderId;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_clientId = ' ';
        int int7 = execution0.m_orderId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_liquidation = 'a';
        execution0.m_side = "hi!";
        execution0.m_cumQty = (short) 0;
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        execution0.m_price = (short) -1;
        execution0.m_acctNumber = "hi!";
        execution0.m_execId = "";
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        double double5 = execution0.m_price;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        java.lang.String str7 = execution0.m_acctNumber;
        execution0.m_acctNumber = "";
        java.lang.String str10 = execution0.m_acctNumber;
        execution0.m_time = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        double double2 = execution0.m_avgPrice;
        int int3 = execution0.m_cumQty;
        java.lang.String str4 = execution0.m_execId;
        int int5 = execution0.m_permId;
        execution0.m_orderId = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_liquidation;
        int int8 = execution0.m_orderId;
        execution0.m_execId = "";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        java.lang.String str7 = execution0.m_side;
        execution0.m_clientId = (short) -1;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_liquidation = 'a';
        execution0.m_side = "hi!";
        execution0.m_execId = "hi!";
        double double11 = execution0.m_price;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        java.lang.String str16 = execution13.m_execId;
        execution13.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        execution13.m_side = "hi!";
        execution13.m_time = "";
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        execution0.m_price = (short) -1;
        execution0.m_acctNumber = "hi!";
        java.lang.String str7 = execution0.m_execId;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_liquidation;
        execution0.m_side = "hi!";
        java.lang.String str10 = execution0.m_execId;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        java.lang.String str7 = execution0.m_acctNumber;
        execution0.m_acctNumber = "hi!";
        java.lang.String str10 = execution0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        int int10 = execution0.m_liquidation;
        java.lang.Class<?> wildcardClass11 = execution0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        java.lang.String str5 = execution0.m_acctNumber;
        java.lang.String str6 = execution0.m_execId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        execution0.m_shares = 0;
        java.lang.String str6 = execution0.m_exchange;
        int int7 = execution0.m_shares;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        execution0.m_avgPrice = (byte) -1;
        java.lang.String str8 = execution0.m_side;
        execution0.m_acctNumber = "";
        double double11 = execution0.m_price;
        execution0.m_price = (byte) -1;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        java.lang.String str7 = execution0.m_acctNumber;
        execution0.m_execId = "";
        execution0.m_liquidation = 52;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        java.lang.String str7 = execution0.m_exchange;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        int int14 = execution13.m_shares;
        execution13.m_orderId = 'a';
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        execution0.m_orderId = (short) 100;
        int int8 = execution0.m_liquidation;
        execution0.m_shares = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_acctNumber = "hi!";
        execution0.m_clientId = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        int int1 = execution0.m_clientId;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        java.lang.String str15 = execution13.m_time;
        execution13.m_exchange = "";
        execution13.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_execId;
        execution0.m_exchange = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_side = "";
        execution0.m_side = "";
        int int9 = execution0.m_shares;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        int int10 = execution0.m_shares;
        execution0.m_side = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_liquidation = 'a';
        execution0.m_price = 1L;
        int int9 = execution0.m_liquidation;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        int int3 = execution0.m_shares;
        execution0.m_acctNumber = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        execution13.m_clientId = 0;
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_orderId = (short) 0;
        java.lang.String str9 = execution0.m_acctNumber;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_shares = (byte) 1;
        execution0.m_price = 1L;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_clientId = (byte) 10;
        int int9 = execution0.m_liquidation;
        double double10 = execution0.m_avgPrice;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_liquidation;
        execution0.m_side = "";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        double double14 = execution13.m_avgPrice;
        execution13.m_exchange = "";
        java.lang.String str17 = execution13.m_side;
        int int18 = execution13.m_shares;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_orderId = (short) 0;
        double double9 = execution0.m_price;
        execution0.m_price = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        execution13.m_time = "hi!";
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_orderId = 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_execId;
        java.lang.String str5 = execution0.m_time;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_avgPrice = (byte) 10;
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        execution0.m_orderId = (byte) 100;
        double double6 = execution0.m_price;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        execution0.m_orderId = (short) 100;
        int int8 = execution0.m_liquidation;
        java.lang.String str9 = execution0.m_side;
        int int10 = execution0.m_liquidation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        java.lang.Class<?> wildcardClass5 = execution0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        java.lang.String str15 = execution13.m_time;
        int int16 = execution13.m_liquidation;
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_clientId = 10;
        java.lang.String str7 = execution0.m_exchange;
        int int8 = execution0.m_shares;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_orderId = (short) 0;
        int int9 = execution0.m_orderId;
        int int10 = execution0.m_liquidation;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_orderId = (short) 0;
        double double9 = execution0.m_price;
        execution0.m_time = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        execution0.m_price = (byte) -1;
        int int4 = execution0.m_liquidation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.Execution execution13 = new com.ib.client.Execution(10, (int) (byte) 10, "hi!", "", "", "hi!", "hi!", (int) (short) 1, (double) 0, (int) 'a', 35, 0, (double) 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_acctNumber = "";
        execution0.m_shares = 'a';
        int int11 = execution0.m_shares;
        java.lang.Class<?> wildcardClass12 = execution0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_side = "";
        execution0.m_side = "";
        execution0.m_clientId = 0;
        execution0.m_side = "";
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        execution0.m_orderId = (short) 100;
        int int8 = execution0.m_liquidation;
        java.lang.String str9 = execution0.m_side;
        int int10 = execution0.m_shares;
        execution0.m_orderId = (byte) 10;
        execution0.m_shares = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        double double14 = execution13.m_price;
        execution13.m_avgPrice = (short) -1;
        execution13.m_cumQty = (byte) 10;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_time = "";
        execution0.m_price = '#';
        execution0.m_cumQty = (-1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        int int14 = execution13.m_orderId;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        int int7 = execution0.m_cumQty;
        execution0.m_acctNumber = "";
        java.lang.String str10 = execution0.m_time;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        execution0.m_shares = (short) 0;
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        execution13.m_clientId = (byte) 0;
        execution13.m_side = "hi!";
        int int18 = execution13.m_permId;
        execution13.m_exchange = "hi!";
        execution13.m_orderId = (short) -1;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        java.lang.String str14 = execution13.m_execId;
        java.lang.String str15 = execution13.m_time;
        execution13.m_permId = 100;
        int int18 = execution13.m_shares;
        int int19 = execution13.m_cumQty;
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_liquidation;
        java.lang.String str8 = execution0.m_execId;
        execution0.m_liquidation = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        execution0.m_time = "hi!";
        execution0.m_liquidation = (short) 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        java.lang.String str7 = execution0.m_acctNumber;
        execution0.m_shares = (short) 1;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        execution0.m_price = (short) -1;
        execution0.m_acctNumber = "hi!";
        int int7 = execution0.m_liquidation;
        double double8 = execution0.m_avgPrice;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_price = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        java.lang.String str8 = execution0.m_acctNumber;
        java.lang.String str9 = execution0.m_acctNumber;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_permId = (byte) 100;
        int int9 = execution0.m_orderId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', (int) (byte) 10, "", "", "hi!", "", "hi!", (int) (short) -1, (double) 100.0f, (int) 'a', (int) 'a', (int) 'a', (-1.0d));
        double double14 = execution13.m_price;
        execution13.m_orderId = (byte) 1;
        execution13.m_side = "hi!";
        java.lang.String str19 = execution13.m_acctNumber;
        execution13.m_avgPrice = 97;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_price = (-1L);
        java.lang.String str4 = execution0.m_exchange;
        execution0.m_acctNumber = "hi!";
        java.lang.String str7 = execution0.m_side;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_permId;
        execution0.m_exchange = "hi!";
        execution0.m_avgPrice = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_side = "";
        execution0.m_avgPrice = 100;
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        int int4 = execution0.m_orderId;
        int int5 = execution0.m_clientId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        execution0.m_avgPrice = (byte) -1;
        execution0.m_side = "hi!";
        execution0.m_acctNumber = "hi!";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_clientId = 10;
        java.lang.String str7 = execution0.m_exchange;
        int int8 = execution0.m_orderId;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_liquidation = 'a';
        execution0.m_side = "hi!";
        int int9 = execution0.m_permId;
        execution0.m_execId = "hi!";
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        execution0.m_orderId = 'a';
        int int7 = execution0.m_liquidation;
        java.lang.String str8 = execution0.m_execId;
        java.lang.String str9 = execution0.m_time;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        execution0.m_orderId = (byte) 100;
        execution0.m_orderId = 1;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        execution0.m_orderId = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.Execution execution13 = new com.ib.client.Execution((int) '#', 1, "hi!", "", "hi!", "hi!", "hi!", (int) (short) -1, (double) 0.0f, (int) ' ', (int) '4', (int) (short) -1, (double) 10L);
        double double14 = execution13.m_avgPrice;
        execution13.m_exchange = "";
        java.lang.String str17 = execution13.m_execId;
        execution13.m_exchange = "hi!";
        java.lang.String str20 = execution13.m_exchange;
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_liquidation = (short) 1;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_clientId = (byte) 10;
        int int9 = execution0.m_liquidation;
        execution0.m_clientId = (byte) 1;
        int int12 = execution0.m_shares;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        java.lang.String str6 = execution0.m_execId;
        execution0.m_clientId = (byte) 10;
        execution0.m_time = "";
        execution0.m_time = "";
        int int13 = execution0.m_liquidation;
        java.lang.String str14 = execution0.m_time;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_acctNumber = "";
        int int3 = execution0.m_liquidation;
        execution0.m_liquidation = (short) 10;
        int int6 = execution0.m_shares;
        execution0.m_liquidation = (byte) 0;
        execution0.m_side = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_exchange = "hi!";
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_clientId = 97;
        execution0.m_side = "";
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.String str5 = execution0.m_time;
        execution0.m_avgPrice = (byte) -1;
        java.lang.String str8 = execution0.m_side;
        execution0.m_acctNumber = "";
        double double11 = execution0.m_price;
        java.lang.String str12 = execution0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_cumQty = '4';
        execution0.m_liquidation = (byte) 1;
        execution0.m_exchange = "";
        int int7 = execution0.m_cumQty;
        execution0.m_acctNumber = "hi!";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        execution0.m_price = (byte) -1;
        java.lang.Class<?> wildcardClass4 = execution0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_side;
        double double2 = execution0.m_avgPrice;
        execution0.m_time = "";
        double double5 = execution0.m_avgPrice;
        execution0.m_clientId = (byte) 10;
        execution0.m_liquidation = (short) -1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }
}

