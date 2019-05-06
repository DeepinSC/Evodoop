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
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        try {
            boolean boolean4 = executionFilter0.equals((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        java.lang.Class<?> wildcardClass1 = executionFilter0.getClass();
        try {
            boolean boolean3 = executionFilter0.equals((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) 'a', "", "hi!", "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_clientId = (byte) 1;
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        java.lang.String str3 = executionFilter0.m_exchange;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.String str6 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        java.lang.String str8 = executionFilter0.m_symbol;
        executionFilter0.m_clientId = '#';
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        java.lang.String str8 = executionFilter0.m_symbol;
        executionFilter0.m_acctCode = "";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_side = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        java.lang.Class<?> wildcardClass9 = executionFilter7.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        java.lang.String str11 = executionFilter0.m_side;
        java.lang.String str12 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        executionFilter7.m_secType = "hi!";
        java.lang.String str12 = executionFilter7.m_time;
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        executionFilter0.m_acctCode = "";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_acctCode;
        executionFilter7.m_side = "";
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        java.lang.Object obj8 = new java.lang.Object();
        try {
            boolean boolean9 = executionFilter0.equals(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) ' ', "", "", "", "hi!", "hi!", "hi!");
        executionFilter7.m_symbol = "";
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_exchange = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        java.lang.String str3 = executionFilter0.m_acctCode;
        java.lang.String str4 = executionFilter0.m_exchange;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass8 = executionFilter7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        int int5 = executionFilter0.m_clientId;
        java.lang.String str6 = executionFilter0.m_acctCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_clientId = '#';
        java.lang.String str10 = executionFilter0.m_acctCode;
        try {
            boolean boolean12 = executionFilter0.equals((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        java.lang.String str6 = executionFilter0.m_time;
        executionFilter0.m_time = "";
        executionFilter0.m_symbol = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (byte) -1, "hi!", "hi!", "", "hi!", "", "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        java.lang.String str6 = executionFilter0.m_time;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        java.lang.String str6 = executionFilter0.m_time;
        executionFilter0.m_time = "";
        try {
            boolean boolean10 = executionFilter0.equals((java.lang.Object) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "";
        java.lang.String str8 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "hi!";
        java.lang.String str3 = executionFilter0.m_symbol;
        java.lang.String str4 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_symbol = "";
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_symbol = "hi!";
        java.lang.String str5 = executionFilter0.m_symbol;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "", "hi!", "hi!", "");
        java.lang.String str8 = executionFilter7.m_symbol;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str7 = executionFilter0.m_exchange;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) ' ', "", "", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_symbol;
        executionFilter7.m_clientId = 0;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_clientId = (byte) 100;
        java.lang.String str10 = executionFilter0.m_side;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (short) -1, "", "", "", "", "", "");
        executionFilter7.m_clientId = (byte) 10;
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_time;
        java.lang.String str6 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        java.lang.String str6 = executionFilter0.m_time;
        java.lang.String str7 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        executionFilter7.m_time = "";
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        int int5 = executionFilter0.m_clientId;
        java.lang.String str6 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_clientId = '#';
        java.lang.String str10 = executionFilter0.m_acctCode;
        java.lang.String str11 = executionFilter0.m_time;
        java.lang.String str12 = executionFilter0.m_exchange;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) ' ', "", "", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_symbol;
        executionFilter7.m_secType = "";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.Class<?> wildcardClass13 = executionFilter0.getClass();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_clientId = 0;
        java.lang.String str8 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        java.lang.String str3 = executionFilter0.m_acctCode;
        java.lang.String str4 = executionFilter0.m_secType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        executionFilter0.m_acctCode = "hi!";
        com.ib.client.ExecutionFilter executionFilter16 = new com.ib.client.ExecutionFilter();
        executionFilter16.m_clientId = '#';
        executionFilter16.m_side = "";
        try {
            boolean boolean21 = executionFilter0.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        java.lang.String str11 = executionFilter0.m_side;
        java.lang.String str12 = executionFilter0.m_side;
        java.lang.String str13 = executionFilter0.m_acctCode;
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_time;
        executionFilter0.m_clientId = (short) 1;
        try {
            boolean boolean11 = executionFilter0.equals((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_symbol = "hi!";
        java.lang.String str8 = executionFilter0.m_acctCode;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (byte) 10, "hi!", "hi!", "hi!", "", "", "hi!");
        java.lang.String str8 = executionFilter7.m_side;
        com.ib.client.ExecutionFilter executionFilter9 = new com.ib.client.ExecutionFilter();
        executionFilter9.m_secType = "";
        executionFilter9.m_exchange = "";
        executionFilter9.m_acctCode = "hi!";
        java.lang.String str16 = executionFilter9.m_secType;
        boolean boolean17 = executionFilter7.equals((java.lang.Object) executionFilter9);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_secType;
        java.lang.String str6 = executionFilter0.m_acctCode;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        int int5 = executionFilter0.m_clientId;
        int int6 = executionFilter0.m_clientId;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (short) -1, "", "", "", "", "", "");
        java.lang.Class<?> wildcardClass8 = executionFilter7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_side = "";
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "hi!";
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str7 = executionFilter0.m_exchange;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str10 = executionFilter0.m_acctCode;
        executionFilter0.m_time = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_exchange;
        executionFilter7.m_time = "hi!";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_secType = "hi!";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_secType = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        int int7 = executionFilter0.m_clientId;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        java.lang.String str11 = executionFilter0.m_side;
        executionFilter0.m_time = "";
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        executionFilter0.m_acctCode = "hi!";
        com.ib.client.ExecutionFilter executionFilter14 = new com.ib.client.ExecutionFilter((int) ' ', "hi!", "hi!", "", "hi!", "hi!", "");
        try {
            boolean boolean15 = executionFilter0.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (byte) 10, "hi!", "hi!", "hi!", "", "", "hi!");
        executionFilter7.m_time = "hi!";
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_side;
        java.lang.String str11 = executionFilter7.m_secType;
        java.lang.String str12 = executionFilter7.m_secType;
        executionFilter7.m_time = "hi!";
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(1, "", "hi!", "", "", "", "hi!");
        executionFilter7.m_acctCode = "hi!";
        java.lang.String str10 = executionFilter7.m_secType;
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_side;
        java.lang.String str11 = executionFilter7.m_acctCode;
        int int12 = executionFilter7.m_clientId;
        java.lang.Object obj13 = null;
        boolean boolean14 = executionFilter7.equals(obj13);
        java.lang.String str15 = executionFilter7.m_acctCode;
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "hi!", "", "", "hi!", "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) '#', "", "", "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        java.lang.String str8 = executionFilter7.m_symbol;
        executionFilter7.m_time = "";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        executionFilter0.m_symbol = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "hi!";
        java.lang.String str8 = executionFilter0.m_acctCode;
        executionFilter0.m_symbol = "";
        java.lang.String str11 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_acctCode;
        java.lang.String str11 = executionFilter7.m_time;
        java.lang.String str12 = executionFilter7.m_acctCode;
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_acctCode = "";
        executionFilter0.m_clientId = (byte) 100;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        java.lang.String str1 = executionFilter0.m_acctCode;
        java.lang.String str2 = executionFilter0.m_secType;
        com.ib.client.ExecutionFilter executionFilter10 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter10.m_time = "";
        java.lang.String str13 = executionFilter10.m_side;
        java.lang.String str14 = executionFilter10.m_acctCode;
        try {
            boolean boolean15 = executionFilter0.equals((java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        executionFilter0.m_side = "";
        executionFilter0.m_acctCode = "";
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        executionFilter0.m_side = "";
        executionFilter0.m_acctCode = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (byte) 10, "hi!", "hi!", "hi!", "", "", "hi!");
        executionFilter7.m_exchange = "hi!";
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_time = "hi!";
        executionFilter0.m_symbol = "";
        java.lang.String str7 = executionFilter0.m_time;
        java.lang.String str8 = executionFilter0.m_exchange;
        java.lang.String str9 = executionFilter0.m_time;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        com.ib.client.ExecutionFilter executionFilter9 = new com.ib.client.ExecutionFilter();
        executionFilter9.m_secType = "";
        executionFilter9.m_exchange = "";
        java.lang.String str14 = executionFilter9.m_time;
        boolean boolean15 = executionFilter7.equals((java.lang.Object) str14);
        int int16 = executionFilter7.m_clientId;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        executionFilter0.m_acctCode = "hi!";
        java.lang.Class<?> wildcardClass16 = executionFilter0.getClass();
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        executionFilter0.m_exchange = "";
        int int9 = executionFilter0.m_clientId;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) '4', "", "", "", "hi!", "", "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "hi!";
        java.lang.String str3 = executionFilter0.m_acctCode;
        executionFilter0.m_symbol = "";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_side;
        java.lang.String str7 = executionFilter0.m_symbol;
        executionFilter0.m_clientId = (short) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        java.lang.String str8 = executionFilter0.m_secType;
        java.lang.String str9 = executionFilter0.m_time;
        executionFilter0.m_symbol = "";
        executionFilter0.m_clientId = (byte) -1;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_time = "";
        executionFilter0.m_symbol = "";
        java.lang.String str10 = executionFilter0.m_time;
        executionFilter0.m_time = "";
        java.lang.Object obj13 = null;
        boolean boolean14 = executionFilter0.equals(obj13);
        java.lang.String str15 = executionFilter0.m_secType;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_clientId = (-1);
        java.lang.String str15 = executionFilter0.m_secType;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_time;
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_time = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        int int11 = executionFilter0.m_clientId;
        com.ib.client.ExecutionFilter executionFilter12 = new com.ib.client.ExecutionFilter();
        executionFilter12.m_secType = "";
        executionFilter12.m_time = "hi!";
        int int17 = executionFilter12.m_clientId;
        boolean boolean18 = executionFilter0.equals((java.lang.Object) executionFilter12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_time;
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_secType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_symbol = "hi!";
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_acctCode;
        java.lang.String str11 = executionFilter7.m_time;
        java.lang.String str12 = executionFilter7.m_exchange;
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        java.lang.String str14 = executionFilter0.m_side;
        int int15 = executionFilter0.m_clientId;
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str7 = executionFilter0.m_exchange;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_time = "";
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        java.lang.String str13 = executionFilter0.m_secType;
        executionFilter0.m_side = "";
        executionFilter0.m_symbol = "";
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "hi!";
        java.lang.String str8 = executionFilter0.m_acctCode;
        java.lang.String str9 = executionFilter0.m_secType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "hi!";
        java.lang.String str8 = executionFilter0.m_acctCode;
        java.lang.String str9 = executionFilter0.m_acctCode;
        int int10 = executionFilter0.m_clientId;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        java.lang.String str8 = executionFilter0.m_secType;
        executionFilter0.m_secType = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (short) -1, "", "", "hi!", "", "", "hi!");
        java.lang.String str8 = executionFilter7.m_time;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_secType = "";
        executionFilter0.m_clientId = (short) -1;
        executionFilter0.m_exchange = "";
        java.lang.String str14 = executionFilter0.m_side;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        com.ib.client.ExecutionFilter executionFilter8 = new com.ib.client.ExecutionFilter();
        executionFilter8.m_secType = "";
        executionFilter8.m_exchange = "";
        int int13 = executionFilter8.m_clientId;
        executionFilter8.m_time = "";
        try {
            boolean boolean16 = executionFilter7.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_acctCode;
        java.lang.String str4 = executionFilter0.m_side;
        java.lang.String str5 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        java.lang.String str1 = executionFilter0.m_acctCode;
        java.lang.String str2 = executionFilter0.m_side;
        executionFilter0.m_acctCode = "";
        java.lang.String str5 = executionFilter0.m_secType;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_secType = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (byte) 10, "hi!", "hi!", "", "", "", "");
        int int8 = executionFilter7.m_clientId;
        com.ib.client.ExecutionFilter executionFilter16 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        java.lang.String str17 = executionFilter16.m_symbol;
        boolean boolean18 = executionFilter7.equals((java.lang.Object) executionFilter16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "";
        java.lang.String str8 = executionFilter0.m_time;
        executionFilter0.m_secType = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_secType = "hi!";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_symbol = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_symbol = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        int int8 = executionFilter0.m_clientId;
        java.lang.String str9 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "hi!", "", "hi!", "", "", "hi!");
        executionFilter7.m_time = "";
        java.lang.Class<?> wildcardClass10 = executionFilter7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (short) 1, "", "", "", "", "hi!", "hi!");
        executionFilter7.m_time = "hi!";
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        executionFilter0.m_secType = "";
        executionFilter0.m_clientId = (short) -1;
        java.lang.String str9 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_side = "hi!";
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_exchange = "";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        java.lang.String str8 = executionFilter0.m_exchange;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_time;
        executionFilter0.m_symbol = "hi!";
        java.lang.String str10 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_time = "hi!";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_clientId = 0;
        java.lang.String str8 = executionFilter0.m_time;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_side = "hi!";
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_exchange = "hi!";
        executionFilter0.m_clientId = (byte) 10;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        int int8 = executionFilter0.m_clientId;
        java.lang.String str9 = executionFilter0.m_secType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        executionFilter0.m_side = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_secType = "hi!";
        executionFilter0.m_time = "hi!";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_time = "hi!";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_secType = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_acctCode;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "hi!", "", "hi!", "", "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        executionFilter7.m_symbol = "";
        executionFilter7.m_symbol = "hi!";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        executionFilter0.m_clientId = 10;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "hi!", "", "hi!", "", "", "hi!");
        executionFilter7.m_time = "";
        executionFilter7.m_symbol = "hi!";
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_exchange;
        executionFilter0.m_clientId = (short) -1;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.String str6 = executionFilter0.m_time;
        executionFilter0.m_acctCode = "";
        executionFilter0.m_time = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_side;
        java.lang.String str7 = executionFilter0.m_symbol;
        executionFilter0.m_clientId = 'a';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_symbol = "hi!";
        java.lang.String str8 = executionFilter0.m_exchange;
        java.lang.String str9 = executionFilter0.m_exchange;
        java.lang.String str10 = executionFilter0.m_symbol;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_clientId = '#';
        java.lang.String str10 = executionFilter0.m_acctCode;
        java.lang.String str11 = executionFilter0.m_time;
        java.lang.Class<?> wildcardClass12 = executionFilter0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_side = "hi!";
        int int8 = executionFilter0.m_clientId;
        java.lang.Class<?> wildcardClass9 = executionFilter0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        executionFilter0.m_symbol = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str8 = executionFilter0.m_time;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_clientId = 35;
        int int8 = executionFilter0.m_clientId;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) '4', "", "", "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        executionFilter0.m_side = "";
        executionFilter0.m_clientId = (short) -1;
        executionFilter0.m_time = "";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "hi!";
        int int10 = executionFilter0.m_clientId;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_side = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "hi!";
        executionFilter0.m_symbol = "";
        executionFilter0.m_time = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        executionFilter7.m_side = "";
        java.lang.Class<?> wildcardClass11 = executionFilter7.getClass();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "hi!", "", "hi!", "", "", "hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_secType = "hi!";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_symbol = "";
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str10 = executionFilter0.m_side;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_time;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        executionFilter7.m_symbol = "";
        java.lang.String str11 = executionFilter7.m_side;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        java.lang.String str6 = executionFilter0.m_side;
        executionFilter0.m_clientId = (short) 0;
        java.lang.String str9 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.String str6 = executionFilter0.m_time;
        java.lang.String str7 = executionFilter0.m_secType;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "hi!", "", "hi!", "", "", "hi!");
        executionFilter7.m_time = "";
        int int10 = executionFilter7.m_clientId;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_side = "hi!";
        executionFilter0.m_symbol = "";
        java.lang.String str10 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.String str6 = executionFilter0.m_time;
        executionFilter0.m_clientId = (byte) -1;
        int int9 = executionFilter0.m_clientId;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        executionFilter7.m_symbol = "hi!";
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_acctCode;
        executionFilter0.m_exchange = "hi!";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_time = "hi!";
        executionFilter0.m_symbol = "";
        java.lang.String str7 = executionFilter0.m_time;
        java.lang.String str8 = executionFilter0.m_exchange;
        java.lang.Class<?> wildcardClass9 = executionFilter0.getClass();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        java.lang.String str6 = executionFilter0.m_time;
        executionFilter0.m_acctCode = "";
        int int9 = executionFilter0.m_clientId;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_time = "hi!";
        executionFilter0.m_acctCode = "hi!";
        java.lang.String str7 = executionFilter0.m_exchange;
        executionFilter0.m_time = "hi!";
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        executionFilter0.m_clientId = '#';
        java.lang.String str10 = executionFilter0.m_acctCode;
        executionFilter0.m_symbol = "";
        java.lang.String str13 = executionFilter0.m_time;
        executionFilter0.m_exchange = "hi!";
        java.lang.String str16 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((-1), "", "hi!", "", "hi!", "hi!", "hi!");
        java.lang.String str8 = executionFilter7.m_exchange;
        java.lang.String str9 = executionFilter7.m_exchange;
        executionFilter7.m_acctCode = "";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        executionFilter0.m_secType = "";
        java.lang.String str5 = executionFilter0.m_time;
        executionFilter0.m_clientId = 100;
        int int8 = executionFilter0.m_clientId;
        executionFilter0.m_secType = "";
        java.lang.String str11 = executionFilter0.m_acctCode;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "hi!", "", "", "", "hi!", "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        java.lang.String str3 = executionFilter0.m_acctCode;
        com.ib.client.ExecutionFilter executionFilter4 = new com.ib.client.ExecutionFilter();
        executionFilter4.m_secType = "";
        executionFilter4.m_exchange = "";
        java.lang.String str9 = executionFilter4.m_symbol;
        java.lang.String str10 = executionFilter4.m_secType;
        java.lang.String str11 = executionFilter4.m_exchange;
        try {
            boolean boolean12 = executionFilter0.equals((java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.ExecutionFilter");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_clientId = (short) 10;
        executionFilter0.m_clientId = 35;
        java.lang.Class<?> wildcardClass7 = executionFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) ' ', "hi!", "hi!", "", "", "", "hi!");
        java.lang.String str8 = executionFilter7.m_acctCode;
        java.lang.String str9 = executionFilter7.m_exchange;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        java.lang.String str3 = executionFilter0.m_acctCode;
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_clientId = ' ';
        java.lang.String str8 = executionFilter0.m_exchange;
        java.lang.String str9 = executionFilter0.m_symbol;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        executionFilter0.m_acctCode = "hi!";
        executionFilter0.m_clientId = 0;
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        java.lang.String str8 = executionFilter0.m_secType;
        executionFilter0.m_clientId = 0;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_side = "hi!";
        int int8 = executionFilter0.m_clientId;
        java.lang.String str9 = executionFilter0.m_side;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        java.lang.String str4 = executionFilter0.m_acctCode;
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_exchange = "";
        java.lang.String str8 = executionFilter0.m_time;
        executionFilter0.m_secType = "hi!";
        java.lang.String str11 = executionFilter0.m_symbol;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter(0, "", "", "hi!", "hi!", "", "");
        executionFilter7.m_time = "";
        java.lang.String str10 = executionFilter7.m_side;
        java.lang.String str11 = executionFilter7.m_secType;
        executionFilter7.m_side = "hi!";
        executionFilter7.m_side = "hi!";
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.ib.client.ExecutionFilter executionFilter7 = new com.ib.client.ExecutionFilter((int) (short) 0, "", "hi!", "hi!", "hi!", "", "");
        java.lang.String str8 = executionFilter7.m_acctCode;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_exchange;
        executionFilter0.m_time = "";
        executionFilter0.m_symbol = "";
        java.lang.String str10 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_clientId = (short) 1;
    }
}

