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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        java.lang.Class<?> wildcardClass4 = underComp0.getClass();
        boolean boolean6 = underComp0.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        double double7 = underComp0.m_price;
        int int8 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        underComp0.m_price = 10L;
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        underComp0.m_price = 10.0f;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        underComp0.m_price = 100.0d;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        boolean boolean4 = underComp0.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass5 = underComp0.getClass();
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = (-1.0d);
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        boolean boolean12 = underComp6.equals((java.lang.Object) underComp9);
        underComp6.m_conId = 0;
        boolean boolean15 = underComp0.equals((java.lang.Object) underComp6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        int int1 = underComp0.m_conId;
        double double2 = underComp0.m_delta;
        double double3 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (byte) 1;
        int int6 = underComp0.m_conId;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_conId = (byte) 0;
        double double6 = underComp0.m_delta;
        underComp0.m_delta = 0.0d;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        underComp0.m_price = 52;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        double double8 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        underComp0.m_conId = '4';
        underComp0.m_delta = (-1.0d);
        java.lang.Class<?> wildcardClass10 = underComp0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        int int3 = underComp0.m_conId;
        underComp0.m_delta = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        underComp0.m_conId = 0;
        underComp0.m_delta = 100.0d;
        underComp0.m_delta = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        double double4 = underComp0.m_delta;
        underComp0.m_conId = (byte) 100;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        double double3 = underComp0.m_price;
        double double4 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        double double6 = underComp0.m_price;
        underComp0.m_conId = 97;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_price;
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        double double7 = underComp6.m_price;
        boolean boolean8 = underComp0.equals((java.lang.Object) double7);
        boolean boolean10 = underComp0.equals((java.lang.Object) 10);
        underComp0.m_delta = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        int int3 = underComp0.m_conId;
        underComp0.m_conId = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_delta = (byte) -1;
        double double6 = underComp0.m_price;
        underComp0.m_price = 1L;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        underComp0.m_conId = (byte) 10;
        underComp0.m_price = 10L;
        double double7 = underComp0.m_delta;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_price = 100L;
        underComp0.m_conId = (byte) 100;
        int int8 = underComp0.m_conId;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = 100.0d;
        java.lang.Class<?> wildcardClass3 = underComp0.getClass();
        underComp0.m_price = 100L;
        underComp0.m_conId = (byte) 100;
        underComp0.m_conId = 'a';
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        underComp0.m_conId = 'a';
        double double5 = underComp0.m_delta;
        java.lang.Class<?> wildcardClass6 = underComp0.getClass();
        underComp0.m_price = (byte) 1;
        underComp0.m_delta = (short) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        com.ib.client.UnderComp underComp3 = new com.ib.client.UnderComp();
        underComp3.m_price = (-1.0d);
        boolean boolean6 = underComp0.equals((java.lang.Object) underComp3);
        double double7 = underComp0.m_price;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        boolean boolean4 = underComp0.equals((java.lang.Object) 100L);
        double double5 = underComp0.m_delta;
        underComp0.m_delta = 0.0d;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }
}

