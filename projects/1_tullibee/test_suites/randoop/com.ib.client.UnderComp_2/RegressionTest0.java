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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        double double9 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        boolean boolean10 = underComp0.equals((java.lang.Object) 10);
        underComp0.m_price = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        underComp0.m_price = (byte) 100;
        com.ib.client.UnderComp underComp4 = new com.ib.client.UnderComp();
        underComp4.m_price = (-1.0d);
        com.ib.client.UnderComp underComp7 = new com.ib.client.UnderComp();
        underComp7.m_price = (-1.0d);
        boolean boolean10 = underComp4.equals((java.lang.Object) underComp7);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        int int4 = underComp0.m_conId;
        int int5 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        underComp0.m_price = 10L;
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_conId = 0;
        underComp0.m_price = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp3.m_delta = 10.0f;
        int int9 = underComp3.m_conId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        underComp0.m_price = 0L;
        underComp0.m_price = (byte) 0;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        double double13 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        double double6 = underComp0.m_price;
        java.lang.Class<?> wildcardClass7 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        java.lang.Class<?> wildcardClass7 = underComp0.getClass();
        int int8 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        java.lang.Class<?> wildcardClass7 = underComp0.getClass();
        double double8 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        double double6 = underComp0.m_price;
        underComp0.m_price = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        double double6 = underComp0.m_delta;
        underComp0.m_conId = (short) 1;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        int int10 = underComp6.m_conId;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        underComp0.m_conId = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        underComp5.m_price = (-1.0d);
        underComp5.m_conId = 'a';
        double double10 = underComp5.m_delta;
        underComp5.m_conId = '4';
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class<?> wildcardClass15 = obj13.getClass();
        boolean boolean16 = underComp5.equals((java.lang.Object) wildcardClass15);
        boolean boolean17 = underComp0.equals((java.lang.Object) underComp5);
        underComp0.m_price = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        underComp0.m_conId = (byte) 10;
        underComp0.m_price = 10L;
        double double7 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp0.m_conId = 0;
        underComp0.m_delta = 100.0d;
        double double11 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_delta = (short) 0;
        double double11 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        com.ib.client.UnderComp underComp7 = new com.ib.client.UnderComp();
        double double8 = underComp7.m_price;
        java.lang.Object obj9 = null;
        boolean boolean10 = underComp7.equals(obj9);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp7);
        underComp0.m_delta = 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        underComp0.m_conId = 'a';
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (byte) 1;
        double double6 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        double double7 = underComp0.m_price;
        double double8 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        underComp12.m_conId = 'a';
        double double17 = underComp12.m_delta;
        java.lang.Class<?> wildcardClass18 = underComp12.getClass();
        double double19 = underComp12.m_price;
        boolean boolean20 = underComp5.equals((java.lang.Object) underComp12);
        java.lang.Class<?> wildcardClass21 = underComp12.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_delta = (short) 0;
        int int11 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        underComp12.m_conId = 'a';
        double double17 = underComp12.m_delta;
        double double18 = underComp12.m_price;
        int int19 = underComp12.m_conId;
        boolean boolean20 = underComp0.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_price = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        underComp0.m_price = 0.0f;
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        double double12 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp0.m_conId = 0;
        underComp0.m_delta = 100.0d;
        underComp0.m_delta = (byte) 1;
        double double13 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        underComp5.m_price = (-1.0d);
        underComp5.m_conId = 'a';
        double double10 = underComp5.m_delta;
        java.lang.Class<?> wildcardClass11 = underComp5.getClass();
        underComp5.m_price = (byte) 1;
        underComp5.m_delta = (short) 0;
        boolean boolean16 = underComp0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass2 = underComp0.getClass();
        double double3 = underComp0.m_price;
        com.ib.client.UnderComp underComp4 = new com.ib.client.UnderComp();
        underComp4.m_price = (-1.0d);
        underComp4.m_conId = 'a';
        double double9 = underComp4.m_delta;
        underComp4.m_conId = '4';
        underComp4.m_delta = (-1.0d);
        java.lang.Class<?> wildcardClass14 = underComp4.getClass();
        boolean boolean15 = underComp0.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        java.lang.Class<?> wildcardClass4 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        int int4 = underComp0.m_conId;
        double double5 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = (-1.0d);
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        boolean boolean12 = underComp6.equals((java.lang.Object) underComp9);
        boolean boolean13 = underComp0.equals((java.lang.Object) underComp6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        boolean boolean4 = underComp0.equals((java.lang.Object) 100L);
        double double5 = underComp0.m_delta;
        underComp0.m_delta = 0.0d;
        double double8 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        underComp0.m_delta = (-1.0d);
        java.lang.Class<?> wildcardClass10 = underComp0.getClass();
        java.lang.Object obj11 = null;
        boolean boolean12 = underComp0.equals(obj11);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        double double7 = underComp0.m_price;
        underComp0.m_price = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (byte) 1;
        int int6 = underComp0.m_conId;
        underComp0.m_delta = 10.0d;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        double double6 = underComp0.m_price;
        underComp0.m_conId = 97;
        double double9 = underComp0.m_delta;
        underComp0.m_price = (short) 1;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        double double4 = underComp0.m_delta;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        underComp0.m_delta = 0.0d;
        double double16 = underComp0.m_delta;
        com.ib.client.UnderComp underComp17 = new com.ib.client.UnderComp();
        underComp17.m_price = 100.0d;
        java.lang.Class<?> wildcardClass20 = underComp17.getClass();
        underComp17.m_price = 100L;
        underComp17.m_conId = (byte) 100;
        int int25 = underComp17.m_conId;
        boolean boolean26 = underComp0.equals((java.lang.Object) int25);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        double double6 = underComp0.m_delta;
        underComp0.m_delta = (byte) 1;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_conId = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        double double7 = underComp0.m_price;
        int int8 = underComp0.m_conId;
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        underComp9.m_conId = 'a';
        double double14 = underComp9.m_delta;
        underComp9.m_conId = '4';
        double double17 = underComp9.m_delta;
        boolean boolean18 = underComp0.equals((java.lang.Object) underComp9);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_conId = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        underComp0.m_price = 52;
        java.lang.Class<?> wildcardClass12 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        underComp0.m_price = 100.0d;
        double double7 = underComp0.m_price;
        underComp0.m_conId = 1;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        double double8 = underComp0.m_delta;
        underComp0.m_conId = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        underComp0.m_delta = 0.0d;
        double double16 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_price = 100L;
        underComp0.m_conId = (byte) 100;
        underComp0.m_conId = 'a';
        double double10 = underComp0.m_delta;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        underComp0.m_conId = ' ';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        underComp5.m_price = (-1.0d);
        underComp5.m_conId = 'a';
        double double10 = underComp5.m_delta;
        underComp5.m_conId = '4';
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class<?> wildcardClass15 = obj13.getClass();
        boolean boolean16 = underComp5.equals((java.lang.Object) wildcardClass15);
        boolean boolean17 = underComp0.equals((java.lang.Object) underComp5);
        int int18 = underComp5.m_conId;
        double double19 = underComp5.m_price;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp3.m_delta = 10.0f;
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        underComp9.m_conId = 'a';
        double double14 = underComp9.m_delta;
        underComp9.m_conId = '4';
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Class<?> wildcardClass19 = obj17.getClass();
        boolean boolean20 = underComp9.equals((java.lang.Object) wildcardClass19);
        double double21 = underComp9.m_price;
        underComp9.m_conId = 10;
        boolean boolean24 = underComp3.equals((java.lang.Object) underComp9);
        int int25 = underComp3.m_conId;
        double double26 = underComp3.m_delta;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_price = 100L;
        underComp0.m_conId = (byte) 100;
        underComp0.m_conId = 'a';
        int int10 = underComp0.m_conId;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        boolean boolean10 = underComp0.equals((java.lang.Object) 10);
        double double11 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        underComp6.m_conId = 1;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        boolean boolean6 = underComp0.equals((java.lang.Object) "hi!");
        double double7 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        double double8 = underComp0.m_price;
        underComp0.m_price = (byte) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        double double7 = underComp0.m_price;
        com.ib.client.UnderComp underComp8 = new com.ib.client.UnderComp();
        double double9 = underComp8.m_price;
        java.lang.Object obj10 = null;
        boolean boolean11 = underComp8.equals(obj10);
        underComp8.m_delta = (byte) -1;
        boolean boolean14 = underComp0.equals((java.lang.Object) underComp8);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_delta = (byte) -1;
        double double6 = underComp0.m_price;
        underComp0.m_delta = 1L;
        int int9 = underComp0.m_conId;
        underComp0.m_price = (byte) 100;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        underComp0.m_delta = (-1.0d);
        java.lang.Class<?> wildcardClass10 = underComp0.getClass();
        double double11 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        double double8 = underComp0.m_delta;
        double double9 = underComp0.m_price;
        java.lang.Class<?> wildcardClass10 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        underComp0.m_price = (byte) 100;
        underComp0.m_price = 10.0d;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        underComp0.m_delta = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_delta = 100;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = (-1.0d);
        underComp6.m_conId = 'a';
        double double11 = underComp6.m_delta;
        underComp6.m_conId = '4';
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Class<?> wildcardClass16 = obj14.getClass();
        boolean boolean17 = underComp6.equals((java.lang.Object) wildcardClass16);
        com.ib.client.UnderComp underComp18 = new com.ib.client.UnderComp();
        underComp18.m_price = (-1.0d);
        boolean boolean21 = underComp6.equals((java.lang.Object) underComp18);
        boolean boolean22 = underComp0.equals((java.lang.Object) underComp6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        int int12 = underComp0.m_conId;
        double double13 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        int int14 = underComp0.m_conId;
        int int15 = underComp0.m_conId;
        underComp0.m_conId = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        com.ib.client.UnderComp underComp7 = new com.ib.client.UnderComp();
        double double8 = underComp7.m_price;
        java.lang.Object obj9 = null;
        boolean boolean10 = underComp7.equals(obj9);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp7);
        boolean boolean13 = underComp7.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        underComp0.m_price = 0L;
        java.lang.Class<?> wildcardClass12 = underComp0.getClass();
        double double13 = underComp0.m_delta;
        int int14 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        int int7 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        underComp5.m_price = (-1.0d);
        underComp5.m_conId = 'a';
        double double10 = underComp5.m_delta;
        underComp5.m_conId = '4';
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Class<?> wildcardClass15 = obj13.getClass();
        boolean boolean16 = underComp5.equals((java.lang.Object) wildcardClass15);
        boolean boolean17 = underComp0.equals((java.lang.Object) underComp5);
        double double18 = underComp0.m_delta;
        underComp0.m_price = 0L;
        underComp0.m_delta = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        underComp0.m_price = 10.0f;
        double double4 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        underComp0.m_conId = (short) 100;
        int int14 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp0.m_conId = 0;
        double double9 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_delta = 1.0d;
        underComp0.m_conId = 1;
        boolean boolean14 = underComp0.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        underComp0.m_conId = (short) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        underComp0.m_conId = 10;
        underComp0.m_price = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass2 = underComp0.getClass();
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        int int5 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        underComp0.m_conId = 0;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        double double6 = underComp0.m_delta;
        underComp0.m_delta = 10L;
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        boolean boolean15 = underComp9.equals((java.lang.Object) underComp12);
        java.lang.Class<?> wildcardClass16 = underComp9.getClass();
        java.lang.Class<?> wildcardClass17 = underComp9.getClass();
        boolean boolean18 = underComp0.equals((java.lang.Object) underComp9);
        double double19 = underComp9.m_delta;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        boolean boolean15 = underComp0.equals((java.lang.Object) underComp12);
        underComp12.m_delta = (short) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_delta = (short) 0;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        double double7 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass2 = underComp0.getClass();
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        underComp0.m_price = (short) 10;
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        double double6 = underComp0.m_delta;
        int int7 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        int int14 = underComp0.m_conId;
        underComp0.m_price = '#';
        com.ib.client.UnderComp underComp17 = new com.ib.client.UnderComp();
        underComp17.m_price = 100.0d;
        java.lang.Class<?> wildcardClass20 = underComp17.getClass();
        underComp17.m_price = 100L;
        underComp17.m_conId = (byte) 100;
        boolean boolean25 = underComp0.equals((java.lang.Object) underComp17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = (short) -1;
        underComp0.m_delta = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        underComp0.m_delta = (byte) 100;
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        int int6 = underComp0.m_conId;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        double double6 = underComp0.m_delta;
        underComp0.m_delta = 0.0d;
        double double9 = underComp0.m_delta;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        underComp0.m_conId = (byte) 100;
        underComp0.m_price = (-1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_conId = 97;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = (-1.0d);
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        boolean boolean12 = underComp6.equals((java.lang.Object) underComp9);
        double double13 = underComp6.m_price;
        boolean boolean14 = underComp0.equals((java.lang.Object) underComp6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        underComp12.m_conId = 'a';
        double double17 = underComp12.m_delta;
        java.lang.Class<?> wildcardClass18 = underComp12.getClass();
        double double19 = underComp12.m_price;
        boolean boolean20 = underComp5.equals((java.lang.Object) underComp12);
        int int21 = underComp12.m_conId;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        int int4 = underComp0.m_conId;
        underComp0.m_delta = 1.0d;
        double double7 = underComp0.m_price;
        underComp0.m_delta = 100.0f;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        underComp0.m_conId = (byte) 100;
        underComp0.m_delta = 10.0d;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_price = 100L;
        underComp0.m_conId = (byte) 100;
        underComp0.m_price = (-1L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp3.m_delta = 10.0f;
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        underComp9.m_conId = 'a';
        double double14 = underComp9.m_delta;
        underComp9.m_conId = '4';
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Class<?> wildcardClass19 = obj17.getClass();
        boolean boolean20 = underComp9.equals((java.lang.Object) wildcardClass19);
        double double21 = underComp9.m_price;
        underComp9.m_conId = 10;
        boolean boolean24 = underComp3.equals((java.lang.Object) underComp9);
        java.lang.Class<?> wildcardClass25 = underComp3.getClass();
        double double26 = underComp3.m_price;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        java.lang.Class<?> wildcardClass7 = underComp3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        underComp0.m_delta = 0.0d;
        double double16 = underComp0.m_delta;
        underComp0.m_delta = 52;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp0.m_conId = 0;
        int int9 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        double double4 = underComp0.m_price;
        underComp0.m_delta = (short) 100;
        underComp0.m_delta = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        double double6 = underComp0.m_price;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        underComp12.m_conId = 'a';
        double double17 = underComp12.m_delta;
        java.lang.Class<?> wildcardClass18 = underComp12.getClass();
        double double19 = underComp12.m_price;
        boolean boolean20 = underComp5.equals((java.lang.Object) underComp12);
        underComp5.m_conId = (byte) 100;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_conId = 0;
        underComp0.m_conId = (byte) -1;
        java.lang.Class<?> wildcardClass11 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        boolean boolean15 = underComp0.equals((java.lang.Object) underComp12);
        double double16 = underComp0.m_price;
        underComp0.m_price = 0L;
        java.lang.Class<?> wildcardClass19 = underComp0.getClass();
        double double20 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        double double8 = underComp0.m_delta;
        double double9 = underComp0.m_price;
        underComp0.m_conId = 1;
        underComp0.m_price = ' ';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        underComp0.m_delta = 0.0d;
        com.ib.client.UnderComp underComp16 = new com.ib.client.UnderComp();
        underComp16.m_price = (-1.0d);
        com.ib.client.UnderComp underComp19 = new com.ib.client.UnderComp();
        underComp19.m_price = (-1.0d);
        boolean boolean22 = underComp16.equals((java.lang.Object) underComp19);
        underComp16.m_conId = 0;
        underComp16.m_delta = 100.0d;
        underComp16.m_delta = (byte) 1;
        boolean boolean29 = underComp0.equals((java.lang.Object) underComp16);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass4 = underComp0.getClass();
        boolean boolean6 = underComp0.equals((java.lang.Object) (short) 100);
        underComp0.m_conId = 'a';
        underComp0.m_price = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        boolean boolean10 = underComp0.equals((java.lang.Object) 10);
        underComp0.m_delta = 0L;
        boolean boolean14 = underComp0.equals((java.lang.Object) 0.0f);
        com.ib.client.UnderComp underComp15 = new com.ib.client.UnderComp();
        underComp15.m_price = (-1.0d);
        underComp15.m_conId = 'a';
        double double20 = underComp15.m_delta;
        int int21 = underComp15.m_conId;
        boolean boolean22 = underComp0.equals((java.lang.Object) underComp15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        double double2 = underComp0.m_delta;
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        underComp0.m_delta = (-1.0d);
        com.ib.client.UnderComp underComp10 = new com.ib.client.UnderComp();
        underComp10.m_price = (-1.0d);
        underComp10.m_conId = 'a';
        double double15 = underComp10.m_delta;
        java.lang.Class<?> wildcardClass16 = underComp10.getClass();
        underComp10.m_price = (byte) 1;
        boolean boolean19 = underComp0.equals((java.lang.Object) underComp10);
        underComp10.m_price = 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Class<?> wildcardClass10 = obj8.getClass();
        boolean boolean11 = underComp0.equals((java.lang.Object) wildcardClass10);
        double double12 = underComp0.m_price;
        int int13 = underComp0.m_conId;
        underComp0.m_delta = 0.0d;
        double double16 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass17 = underComp0.getClass();
        int int18 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_delta = 100;
        underComp0.m_delta = 10;
        java.lang.Class<?> wildcardClass8 = underComp0.getClass();
        underComp0.m_delta = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_delta = (short) 0;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        com.ib.client.UnderComp underComp7 = new com.ib.client.UnderComp();
        double double8 = underComp7.m_price;
        java.lang.Object obj9 = null;
        boolean boolean10 = underComp7.equals(obj9);
        underComp7.m_delta = (byte) -1;
        double double13 = underComp7.m_price;
        underComp7.m_price = 1L;
        java.lang.Class<?> wildcardClass16 = underComp7.getClass();
        boolean boolean17 = underComp0.equals((java.lang.Object) underComp7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        int int12 = underComp0.m_conId;
        com.ib.client.UnderComp underComp13 = new com.ib.client.UnderComp();
        underComp13.m_price = (-1.0d);
        underComp13.m_conId = 'a';
        double double18 = underComp13.m_delta;
        double double19 = underComp13.m_delta;
        underComp13.m_delta = 10L;
        boolean boolean22 = underComp0.equals((java.lang.Object) underComp13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass2 = underComp0.getClass();
        double double3 = underComp0.m_price;
        int int4 = underComp0.m_conId;
        double double5 = underComp0.m_delta;
        double double6 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        com.ib.client.UnderComp underComp5 = new com.ib.client.UnderComp();
        double double6 = underComp5.m_price;
        java.lang.Object obj7 = null;
        boolean boolean8 = underComp5.equals(obj7);
        underComp5.m_price = (-1.0f);
        boolean boolean11 = underComp0.equals((java.lang.Object) underComp5);
        com.ib.client.UnderComp underComp12 = new com.ib.client.UnderComp();
        underComp12.m_price = (-1.0d);
        underComp12.m_conId = 'a';
        double double17 = underComp12.m_delta;
        java.lang.Class<?> wildcardClass18 = underComp12.getClass();
        double double19 = underComp12.m_price;
        boolean boolean20 = underComp5.equals((java.lang.Object) underComp12);
        underComp5.m_price = (-1.0d);
        underComp5.m_conId = (short) 100;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}

