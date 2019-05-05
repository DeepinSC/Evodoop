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
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        java.lang.Class<?> wildcardClass4 = tagValue2.getClass();
        try {
            boolean boolean6 = tagValue2.equals((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        try {
            boolean boolean8 = tagValue2.equals((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        try {
            boolean boolean6 = tagValue2.equals((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        try {
            boolean boolean6 = tagValue2.equals((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.Class<?> wildcardClass1 = tagValue0.getClass();
        try {
            boolean boolean3 = tagValue0.equals((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        try {
            boolean boolean8 = tagValue2.equals((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        java.lang.Class<?> wildcardClass7 = tagValue2.getClass();
        com.ib.client.TagValue tagValue10 = new com.ib.client.TagValue("hi!", "");
        tagValue10.m_value = "";
        tagValue10.m_tag = "hi!";
        java.lang.Class<?> wildcardClass15 = tagValue10.getClass();
        try {
            boolean boolean16 = tagValue2.equals((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        tagValue2.m_value = "hi!";
        com.ib.client.TagValue tagValue12 = new com.ib.client.TagValue("hi!", "");
        tagValue12.m_value = "";
        try {
            boolean boolean15 = tagValue2.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        java.lang.String str12 = tagValue6.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "hi!");
        try {
            boolean boolean4 = tagValue2.equals((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        tagValue2.m_tag = "";
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue();
        java.lang.Class<?> wildcardClass7 = tagValue6.getClass();
        try {
            boolean boolean8 = tagValue2.equals((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "hi!");
        try {
            boolean boolean4 = tagValue2.equals((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("", "hi!");
        tagValue7.m_value = "";
        java.lang.Class<?> wildcardClass10 = tagValue7.getClass();
        try {
            boolean boolean11 = tagValue2.equals((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        try {
            boolean boolean2 = tagValue0.equals((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue3 = new com.ib.client.TagValue();
        tagValue3.m_tag = "hi!";
        java.lang.String str6 = tagValue3.m_tag;
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue("hi!", "");
        tagValue9.m_value = "";
        tagValue9.m_tag = "hi!";
        boolean boolean14 = tagValue3.equals((java.lang.Object) tagValue9);
        boolean boolean15 = tagValue2.equals((java.lang.Object) tagValue9);
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue19 = new com.ib.client.TagValue();
        tagValue19.m_tag = "hi!";
        java.lang.String str22 = tagValue19.m_tag;
        com.ib.client.TagValue tagValue25 = new com.ib.client.TagValue("hi!", "");
        tagValue25.m_value = "";
        tagValue25.m_tag = "hi!";
        boolean boolean30 = tagValue19.equals((java.lang.Object) tagValue25);
        boolean boolean31 = tagValue18.equals((java.lang.Object) tagValue25);
        try {
            boolean boolean32 = tagValue9.equals((java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.Class<?> wildcardClass3 = tagValue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        java.lang.Object obj7 = new java.lang.Object();
        try {
            boolean boolean8 = tagValue0.equals(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        java.lang.Class<?> wildcardClass4 = tagValue2.getClass();
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue();
        tagValue5.m_tag = "hi!";
        java.lang.String str8 = tagValue5.m_tag;
        com.ib.client.TagValue tagValue11 = new com.ib.client.TagValue("hi!", "");
        tagValue11.m_value = "";
        tagValue11.m_tag = "hi!";
        boolean boolean16 = tagValue5.equals((java.lang.Object) tagValue11);
        try {
            boolean boolean17 = tagValue2.equals((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        java.lang.String str4 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_tag = "hi!";
        java.lang.String str11 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        try {
            boolean boolean5 = tagValue2.equals((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        java.lang.String str5 = tagValue2.m_value;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue();
        java.lang.String str7 = tagValue6.m_value;
        java.lang.Class<?> wildcardClass8 = tagValue6.getClass();
        try {
            boolean boolean9 = tagValue2.equals((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "");
        tagValue7.m_value = "";
        tagValue7.m_tag = "hi!";
        tagValue7.m_value = "";
        java.lang.String str14 = tagValue7.m_tag;
        java.lang.Class<?> wildcardClass15 = tagValue7.getClass();
        try {
            boolean boolean16 = tagValue0.equals((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        tagValue0.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        tagValue0.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        java.lang.String str11 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        java.lang.String str5 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        java.lang.String str8 = tagValue2.m_value;
        tagValue2.m_value = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue5.m_tag = "";
        java.lang.String str8 = tagValue5.m_tag;
        boolean boolean9 = tagValue0.equals((java.lang.Object) tagValue5);
        java.lang.String str10 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        java.lang.String str5 = tagValue0.m_tag;
        java.lang.String str6 = tagValue0.m_tag;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "hi!");
        java.lang.String str3 = tagValue2.m_tag;
        java.lang.String str4 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        java.lang.String str5 = tagValue2.m_value;
        try {
            boolean boolean7 = tagValue2.equals((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "hi!");
        tagValue2.m_value = "";
        java.lang.String str5 = tagValue2.m_value;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue();
        java.lang.String str7 = tagValue6.m_value;
        java.lang.String str8 = tagValue6.m_tag;
        java.lang.String str9 = tagValue6.m_value;
        java.lang.String str10 = tagValue6.m_value;
        tagValue6.m_value = "hi!";
        tagValue6.m_value = "";
        java.lang.Class<?> wildcardClass15 = tagValue6.getClass();
        try {
            boolean boolean16 = tagValue2.equals((java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        java.lang.String str5 = tagValue2.m_tag;
        java.lang.String str6 = tagValue2.m_value;
        java.lang.String str7 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        tagValue2.m_value = "";
        java.lang.String str12 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_tag = "hi!";
        tagValue0.m_value = "";
        java.lang.String str13 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        java.lang.String str5 = tagValue2.m_value;
        tagValue2.m_tag = "";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        java.lang.String str5 = tagValue2.m_tag;
        java.lang.String str6 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        com.ib.client.TagValue tagValue11 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue11.m_tag = "hi!";
        tagValue11.m_tag = "hi!";
        tagValue11.m_value = "hi!";
        java.lang.Class<?> wildcardClass18 = tagValue11.getClass();
        try {
            boolean boolean19 = tagValue2.equals((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        java.lang.Class<?> wildcardClass9 = tagValue0.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        java.lang.String str10 = tagValue2.m_value;
        tagValue2.m_value = "";
        tagValue2.m_tag = "";
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "");
        tagValue5.m_value = "";
        tagValue5.m_tag = "hi!";
        try {
            boolean boolean10 = tagValue0.equals((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        com.ib.client.TagValue tagValue12 = new com.ib.client.TagValue();
        java.lang.String str13 = tagValue12.m_value;
        java.lang.String str14 = tagValue12.m_tag;
        java.lang.String str15 = tagValue12.m_value;
        java.lang.String str16 = tagValue12.m_value;
        tagValue12.m_value = "hi!";
        tagValue12.m_value = "";
        tagValue12.m_tag = "hi!";
        tagValue12.m_value = "";
        java.lang.String str25 = tagValue12.m_value;
        java.lang.String str26 = tagValue12.m_tag;
        try {
            boolean boolean27 = tagValue0.equals((java.lang.Object) str26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        tagValue2.m_tag = "";
        com.ib.client.TagValue tagValue8 = new com.ib.client.TagValue();
        java.lang.String str9 = tagValue8.m_value;
        java.lang.String str10 = tagValue8.m_tag;
        java.lang.String str11 = tagValue8.m_value;
        java.lang.String str12 = tagValue8.m_value;
        tagValue8.m_value = "hi!";
        tagValue8.m_value = "";
        tagValue8.m_value = "hi!";
        boolean boolean19 = tagValue2.equals((java.lang.Object) tagValue8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str5 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue10 = new com.ib.client.TagValue();
        tagValue10.m_tag = "hi!";
        java.lang.String str13 = tagValue10.m_tag;
        tagValue10.m_tag = "";
        java.lang.String str16 = tagValue10.m_tag;
        try {
            boolean boolean17 = tagValue0.equals((java.lang.Object) str16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue();
        tagValue5.m_tag = "hi!";
        java.lang.String str8 = tagValue5.m_tag;
        com.ib.client.TagValue tagValue11 = new com.ib.client.TagValue("hi!", "");
        tagValue11.m_value = "";
        tagValue11.m_tag = "hi!";
        boolean boolean16 = tagValue5.equals((java.lang.Object) tagValue11);
        tagValue5.m_value = "";
        java.lang.String str19 = tagValue5.m_value;
        java.lang.String str20 = tagValue5.m_value;
        tagValue5.m_tag = "";
        try {
            boolean boolean23 = tagValue2.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "hi!";
        java.lang.String str9 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.Class<?> wildcardClass3 = tagValue2.getClass();
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue("", "");
        boolean boolean10 = tagValue6.equals((java.lang.Object) tagValue9);
        try {
            boolean boolean11 = tagValue2.equals((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        java.lang.String str5 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        java.lang.String str11 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        tagValue0.m_tag = "hi!";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "");
        tagValue7.m_value = "";
        tagValue7.m_tag = "hi!";
        tagValue7.m_value = "";
        java.lang.String str14 = tagValue7.m_tag;
        java.lang.String str15 = tagValue7.m_value;
        tagValue7.m_value = "";
        boolean boolean18 = tagValue0.equals((java.lang.Object) tagValue7);
        com.ib.client.TagValue tagValue21 = new com.ib.client.TagValue("", "hi!");
        tagValue21.m_tag = "";
        try {
            boolean boolean24 = tagValue0.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        java.lang.String str6 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "hi!");
        tagValue2.m_value = "";
        java.lang.String str5 = tagValue2.m_value;
        com.ib.client.TagValue tagValue8 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue();
        tagValue9.m_tag = "hi!";
        java.lang.String str12 = tagValue9.m_tag;
        com.ib.client.TagValue tagValue15 = new com.ib.client.TagValue("hi!", "");
        tagValue15.m_value = "";
        tagValue15.m_tag = "hi!";
        boolean boolean20 = tagValue9.equals((java.lang.Object) tagValue15);
        boolean boolean21 = tagValue8.equals((java.lang.Object) tagValue15);
        try {
            boolean boolean22 = tagValue2.equals((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue();
        boolean boolean3 = tagValue0.equals((java.lang.Object) tagValue2);
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_tag = "";
        java.lang.String str7 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "hi!";
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        java.lang.String str16 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue();
        boolean boolean3 = tagValue0.equals((java.lang.Object) tagValue2);
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_tag = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        tagValue2.m_tag = "hi!";
        java.lang.String str7 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "";
        tagValue0.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        java.lang.String str5 = tagValue0.m_tag;
        java.lang.String str6 = tagValue0.m_tag;
        java.lang.String str7 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        tagValue0.m_tag = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        java.lang.Class<?> wildcardClass9 = tagValue2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue();
        boolean boolean3 = tagValue0.equals((java.lang.Object) tagValue2);
        java.lang.String str4 = tagValue0.m_value;
        try {
            boolean boolean6 = tagValue0.equals((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        java.lang.String str18 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue6.m_tag = "hi!";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        java.lang.String str8 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        tagValue0.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_tag = "hi!";
        tagValue0.m_value = "";
        java.lang.String str13 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        boolean boolean6 = tagValue0.equals((java.lang.Object) tagValue5);
        tagValue0.m_value = "";
        tagValue0.m_value = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_tag = "hi!";
        java.lang.String str5 = tagValue2.m_value;
        tagValue2.m_value = "hi!";
        java.lang.String str8 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        boolean boolean6 = tagValue0.equals((java.lang.Object) tagValue5);
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_value;
        java.lang.String str10 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "";
        java.lang.String str7 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.Object obj10 = null;
        boolean boolean11 = tagValue0.equals(obj10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_tag;
        tagValue0.m_tag = "hi!";
        com.ib.client.TagValue tagValue14 = new com.ib.client.TagValue("hi!", "");
        tagValue14.m_value = "";
        tagValue14.m_tag = "hi!";
        tagValue14.m_value = "";
        java.lang.String str21 = tagValue14.m_tag;
        try {
            boolean boolean22 = tagValue0.equals((java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        tagValue2.m_value = "hi!";
        java.lang.String str10 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_value = "";
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        java.lang.String str7 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_tag;
        java.lang.String str10 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue();
        boolean boolean3 = tagValue0.equals((java.lang.Object) tagValue2);
        tagValue0.m_value = "hi!";
        tagValue0.m_tag = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        java.lang.Object obj7 = null;
        boolean boolean8 = tagValue0.equals(obj7);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        com.ib.client.TagValue tagValue3 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str4 = tagValue3.m_tag;
        tagValue3.m_tag = "hi!";
        java.lang.Object obj7 = null;
        boolean boolean8 = tagValue3.equals(obj7);
        boolean boolean9 = tagValue0.equals(obj7);
        java.lang.String str10 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        java.lang.String str12 = tagValue2.m_tag;
        com.ib.client.TagValue tagValue15 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str16 = tagValue15.m_tag;
        tagValue15.m_tag = "hi!";
        java.lang.Object obj19 = null;
        boolean boolean20 = tagValue15.equals(obj19);
        java.lang.String str21 = tagValue15.m_tag;
        java.lang.String str22 = tagValue15.m_tag;
        boolean boolean23 = tagValue2.equals((java.lang.Object) tagValue15);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_value = "hi!";
        java.lang.String str6 = tagValue0.m_tag;
        tagValue0.m_value = "hi!";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.String str4 = tagValue0.m_tag;
        java.lang.String str5 = tagValue0.m_value;
        tagValue0.m_value = "";
        com.ib.client.TagValue tagValue8 = new com.ib.client.TagValue();
        java.lang.String str9 = tagValue8.m_value;
        java.lang.String str10 = tagValue8.m_tag;
        java.lang.String str11 = tagValue8.m_value;
        java.lang.String str12 = tagValue8.m_value;
        tagValue8.m_value = "hi!";
        tagValue8.m_value = "";
        tagValue8.m_tag = "hi!";
        tagValue8.m_value = "";
        boolean boolean21 = tagValue0.equals((java.lang.Object) tagValue8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.String str4 = tagValue0.m_tag;
        java.lang.String str5 = tagValue0.m_value;
        java.lang.String str6 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.String str4 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        com.ib.client.TagValue tagValue24 = new com.ib.client.TagValue();
        tagValue24.m_tag = "hi!";
        java.lang.String str27 = tagValue24.m_tag;
        tagValue24.m_tag = "";
        java.lang.String str30 = tagValue24.m_tag;
        try {
            boolean boolean31 = tagValue18.equals((java.lang.Object) str30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        java.lang.String str12 = tagValue2.m_tag;
        java.lang.String str13 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_value = "";
        java.lang.String str7 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        tagValue2.m_value = "hi!";
        tagValue2.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue();
        java.lang.String str6 = tagValue5.m_tag;
        tagValue5.m_value = "";
        tagValue5.m_value = "";
        try {
            boolean boolean11 = tagValue2.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        tagValue2.m_value = "";
        java.lang.String str12 = tagValue2.m_tag;
        java.lang.String str13 = tagValue2.m_value;
        tagValue2.m_tag = "hi!";
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue3 = new com.ib.client.TagValue();
        tagValue3.m_tag = "hi!";
        java.lang.String str6 = tagValue3.m_tag;
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue("hi!", "");
        tagValue9.m_value = "";
        tagValue9.m_tag = "hi!";
        boolean boolean14 = tagValue3.equals((java.lang.Object) tagValue9);
        boolean boolean15 = tagValue2.equals((java.lang.Object) tagValue9);
        tagValue9.m_tag = "";
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        com.ib.client.TagValue tagValue8 = new com.ib.client.TagValue();
        java.lang.String str9 = tagValue8.m_value;
        java.lang.String str10 = tagValue8.m_tag;
        java.lang.String str11 = tagValue8.m_value;
        java.lang.String str12 = tagValue8.m_value;
        java.lang.String str13 = tagValue8.m_tag;
        java.lang.String str14 = tagValue8.m_tag;
        boolean boolean15 = tagValue0.equals((java.lang.Object) str14);
        tagValue0.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.Class<?> wildcardClass4 = tagValue0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.Class<?> wildcardClass2 = tagValue0.getClass();
        com.ib.client.TagValue tagValue3 = new com.ib.client.TagValue();
        tagValue3.m_tag = "hi!";
        java.lang.String str6 = tagValue3.m_tag;
        tagValue3.m_tag = "";
        tagValue3.m_tag = "";
        try {
            boolean boolean11 = tagValue0.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        tagValue2.m_tag = "";
        tagValue2.m_tag = "hi!";
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_tag = "";
        tagValue0.m_value = "hi!";
        java.lang.String str9 = tagValue0.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        com.ib.client.TagValue tagValue4 = new com.ib.client.TagValue();
        tagValue4.m_tag = "hi!";
        java.lang.String str7 = tagValue4.m_tag;
        tagValue4.m_tag = "";
        java.lang.String str10 = tagValue4.m_value;
        boolean boolean11 = tagValue0.equals((java.lang.Object) str10);
        java.lang.String str12 = tagValue0.m_tag;
        tagValue0.m_value = "hi!";
        java.lang.String str15 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.String str6 = tagValue2.m_value;
        java.lang.String str7 = tagValue2.m_value;
        java.lang.String str8 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "hi!";
        java.lang.String str9 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        tagValue0.m_tag = "";
        java.lang.String str9 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        java.lang.String str6 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        tagValue0.m_tag = "hi!";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "");
        tagValue7.m_value = "";
        tagValue7.m_tag = "hi!";
        tagValue7.m_value = "";
        java.lang.String str14 = tagValue7.m_tag;
        java.lang.String str15 = tagValue7.m_value;
        tagValue7.m_value = "";
        boolean boolean18 = tagValue0.equals((java.lang.Object) tagValue7);
        java.lang.String str19 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue20 = new com.ib.client.TagValue();
        tagValue20.m_tag = "hi!";
        java.lang.String str23 = tagValue20.m_tag;
        com.ib.client.TagValue tagValue26 = new com.ib.client.TagValue("hi!", "");
        tagValue26.m_value = "";
        tagValue26.m_tag = "hi!";
        boolean boolean31 = tagValue20.equals((java.lang.Object) tagValue26);
        try {
            boolean boolean32 = tagValue0.equals((java.lang.Object) boolean31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "";
        java.lang.String str7 = tagValue0.m_tag;
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        tagValue0.m_tag = "hi!";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "");
        tagValue7.m_value = "";
        tagValue7.m_tag = "hi!";
        tagValue7.m_value = "";
        java.lang.String str14 = tagValue7.m_tag;
        java.lang.String str15 = tagValue7.m_value;
        tagValue7.m_value = "";
        boolean boolean18 = tagValue0.equals((java.lang.Object) tagValue7);
        java.lang.String str19 = tagValue0.m_tag;
        java.lang.String str20 = tagValue0.m_value;
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_value = "";
        try {
            boolean boolean8 = tagValue2.equals((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        java.lang.String str5 = tagValue2.m_value;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue();
        tagValue6.m_tag = "hi!";
        java.lang.String str9 = tagValue6.m_tag;
        com.ib.client.TagValue tagValue12 = new com.ib.client.TagValue("hi!", "");
        tagValue12.m_value = "";
        tagValue12.m_tag = "hi!";
        boolean boolean17 = tagValue6.equals((java.lang.Object) tagValue12);
        tagValue6.m_value = "";
        java.lang.String str20 = tagValue6.m_value;
        java.lang.String str21 = tagValue6.m_value;
        com.ib.client.TagValue tagValue24 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue24.m_tag = "";
        java.lang.String str27 = tagValue24.m_tag;
        java.lang.String str28 = tagValue24.m_tag;
        boolean boolean29 = tagValue6.equals((java.lang.Object) tagValue24);
        java.lang.String str30 = tagValue6.m_tag;
        boolean boolean31 = tagValue2.equals((java.lang.Object) tagValue6);
        com.ib.client.TagValue tagValue34 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue37 = new com.ib.client.TagValue("", "");
        boolean boolean38 = tagValue34.equals((java.lang.Object) tagValue37);
        java.lang.String str39 = tagValue34.m_value;
        try {
            boolean boolean40 = tagValue2.equals((java.lang.Object) str39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        tagValue0.m_value = "";
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "hi!";
        java.lang.Class<?> wildcardClass5 = tagValue2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("", "");
        boolean boolean6 = tagValue2.equals((java.lang.Object) tagValue5);
        tagValue5.m_value = "";
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        tagValue2.m_value = "hi!";
        tagValue2.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        java.lang.String str11 = tagValue0.m_tag;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "";
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "";
        java.lang.String str7 = tagValue0.m_tag;
        tagValue0.m_value = "";
        java.lang.String str10 = tagValue0.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        java.lang.String str5 = tagValue2.m_value;
        java.lang.String str6 = tagValue2.m_tag;
        java.lang.String str7 = tagValue2.m_tag;
        com.ib.client.TagValue tagValue10 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str11 = tagValue10.m_tag;
        tagValue10.m_tag = "hi!";
        java.lang.Object obj14 = null;
        boolean boolean15 = tagValue10.equals(obj14);
        java.lang.Class<?> wildcardClass16 = tagValue10.getClass();
        try {
            boolean boolean17 = tagValue2.equals((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        tagValue0.m_tag = "";
        tagValue0.m_tag = "hi!";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        tagValue0.m_tag = "";
        java.lang.String str6 = tagValue0.m_value;
        tagValue0.m_tag = "";
        com.ib.client.TagValue tagValue11 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str12 = tagValue11.m_tag;
        tagValue11.m_tag = "";
        tagValue11.m_tag = "";
        try {
            boolean boolean17 = tagValue0.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "";
        java.lang.String str5 = tagValue2.m_tag;
        tagValue2.m_tag = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "hi!";
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        java.lang.String str9 = tagValue2.m_tag;
        java.lang.String str10 = tagValue2.m_value;
        java.lang.String str11 = tagValue2.m_value;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_tag = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        java.lang.String str4 = tagValue0.m_value;
        java.lang.String str5 = tagValue0.m_value;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        com.ib.client.TagValue tagValue13 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str14 = tagValue13.m_tag;
        tagValue13.m_tag = "hi!";
        java.lang.Object obj17 = null;
        boolean boolean18 = tagValue13.equals(obj17);
        java.lang.String str19 = tagValue13.m_tag;
        tagValue13.m_value = "";
        try {
            boolean boolean22 = tagValue2.equals((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to com.ib.client.TagValue");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        tagValue2.m_tag = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        tagValue2.m_tag = "hi!";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        boolean boolean6 = tagValue0.equals((java.lang.Object) tagValue5);
        tagValue0.m_value = "";
        java.lang.String str9 = tagValue0.m_value;
        tagValue0.m_tag = "hi!";
        tagValue0.m_tag = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        java.lang.String str11 = tagValue0.m_value;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_value = "hi!";
        java.lang.String str6 = tagValue2.m_tag;
        java.lang.String str7 = tagValue2.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue5.m_tag = "";
        java.lang.String str8 = tagValue5.m_tag;
        boolean boolean9 = tagValue0.equals((java.lang.Object) tagValue5);
        com.ib.client.TagValue tagValue10 = new com.ib.client.TagValue();
        java.lang.String str11 = tagValue10.m_value;
        java.lang.String str12 = tagValue10.m_value;
        com.ib.client.TagValue tagValue13 = new com.ib.client.TagValue();
        java.lang.String str14 = tagValue13.m_tag;
        tagValue13.m_tag = "hi!";
        boolean boolean17 = tagValue10.equals((java.lang.Object) tagValue13);
        boolean boolean18 = tagValue0.equals((java.lang.Object) tagValue10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        java.lang.String str24 = tagValue0.m_tag;
        java.lang.String str25 = tagValue0.m_tag;
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "hi!";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "");
        tagValue7.m_value = "hi!";
        com.ib.client.TagValue tagValue12 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str13 = tagValue12.m_tag;
        boolean boolean14 = tagValue7.equals((java.lang.Object) tagValue12);
        boolean boolean15 = tagValue2.equals((java.lang.Object) tagValue7);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        java.lang.String str5 = tagValue0.m_tag;
        java.lang.String str6 = tagValue0.m_value;
        tagValue0.m_value = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str3 = tagValue2.m_value;
        java.lang.Class<?> wildcardClass4 = tagValue2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        java.lang.String str3 = tagValue0.m_value;
        java.lang.String str4 = tagValue0.m_value;
        tagValue0.m_value = "hi!";
        tagValue0.m_value = "";
        tagValue0.m_value = "hi!";
        tagValue0.m_tag = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        tagValue2.m_value = "hi!";
        com.ib.client.TagValue tagValue7 = new com.ib.client.TagValue("hi!", "hi!");
        java.lang.String str8 = tagValue7.m_tag;
        boolean boolean9 = tagValue2.equals((java.lang.Object) tagValue7);
        tagValue2.m_tag = "hi!";
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "");
        java.lang.String str3 = tagValue2.m_tag;
        tagValue2.m_tag = "hi!";
        java.lang.Object obj6 = null;
        boolean boolean7 = tagValue2.equals(obj6);
        java.lang.String str8 = tagValue2.m_tag;
        tagValue2.m_value = "";
        tagValue2.m_tag = "hi!";
        tagValue2.m_value = "";
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }
}

