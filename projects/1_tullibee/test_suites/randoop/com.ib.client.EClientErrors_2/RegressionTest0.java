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
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '#', "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.EClientErrors eClientErrors0 = new com.ib.client.EClientErrors();
        java.lang.Class<?> wildcardClass1 = eClientErrors0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 1, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) ' ', "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((-1), "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.String str8 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 0, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        int int9 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '#', "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 10, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(35, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 100, "");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "hi!");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '#', "hi!");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 10, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        java.lang.String str10 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 10, "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '#', "");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(10, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(52, "hi!");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        java.lang.String str7 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        int int7 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        java.lang.String str9 = codeMsgPair2.msg();
        int int10 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 100, "");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 10, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        java.lang.String str10 = codeMsgPair2.msg();
        int int11 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.String str8 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        java.lang.String str8 = codeMsgPair2.msg();
        java.lang.String str9 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 1, "");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.String str7 = codeMsgPair2.msg();
        java.lang.String str8 = codeMsgPair2.msg();
        java.lang.String str9 = codeMsgPair2.msg();
        int int10 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.String str6 = codeMsgPair2.msg();
        int int7 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        int int10 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass11 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.String str7 = codeMsgPair2.msg();
        int int8 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(10, "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        int int7 = codeMsgPair2.code();
        java.lang.String str8 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(97, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 0, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        int int9 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(10, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(35, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        int int9 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 1, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 10, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.String str7 = codeMsgPair2.msg();
        int int8 = codeMsgPair2.code();
        int int9 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 10, "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) 100, "hi!");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass9 = codeMsgPair2.getClass();
        java.lang.String str10 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        java.lang.String str9 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(35, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (short) -1, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((-1), "");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(97, "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 0, "");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        java.lang.String str5 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        int int5 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        int int7 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        java.lang.String str9 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(97, "");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 1, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(10, "");
        int int3 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass9 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        int int9 = codeMsgPair2.code();
        int int10 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass11 = codeMsgPair2.getClass();
        java.lang.String str12 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass13 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        java.lang.String str7 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 0, "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass6 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(0, "");
        java.lang.String str3 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 1, "hi!");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "");
        int int3 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        int int7 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass9 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(35, "hi!");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(35, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.String str5 = codeMsgPair2.msg();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.String str4 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '#', "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.String str5 = codeMsgPair2.msg();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        int int8 = codeMsgPair2.code();
        java.lang.String str9 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 0, "hi!");
        java.lang.String str3 = codeMsgPair2.msg();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) 'a', "");
        int int3 = codeMsgPair2.code();
        int int4 = codeMsgPair2.code();
        java.lang.String str5 = codeMsgPair2.msg();
        java.lang.String str6 = codeMsgPair2.msg();
        java.lang.String str7 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) '4', "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        int int4 = codeMsgPair2.code();
        int int5 = codeMsgPair2.code();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair((int) (byte) -1, "hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        int int3 = codeMsgPair2.code();
        java.lang.String str4 = codeMsgPair2.msg();
        int int5 = codeMsgPair2.code();
        java.lang.String str6 = codeMsgPair2.msg();
        int int7 = codeMsgPair2.code();
        java.lang.String str8 = codeMsgPair2.msg();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair2 = new com.ib.client.EClientErrors.CodeMsgPair(100, "hi!");
        java.lang.Class<?> wildcardClass3 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass4 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass5 = codeMsgPair2.getClass();
        int int6 = codeMsgPair2.code();
        java.lang.Class<?> wildcardClass7 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass8 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass9 = codeMsgPair2.getClass();
        java.lang.Class<?> wildcardClass10 = codeMsgPair2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

