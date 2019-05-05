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
        int int0 = com.ib.client.ComboLeg.CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = com.ib.client.ComboLeg.UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Object obj8 = new java.lang.Object();
        try {
            boolean boolean9 = comboLeg7.equals(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        com.ib.client.ComboLeg comboLeg4 = new com.ib.client.ComboLeg();
        comboLeg4.m_conId = 100;
        try {
            boolean boolean7 = comboLeg0.equals((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) 'a', 10, "hi!", "hi!", 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.ib.client.ComboLeg.SAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_action = "hi!";
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, (int) (short) -1, "", "hi!", 100);
        comboLeg5.m_openClose = (short) 100;
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = com.ib.client.ComboLeg.OPEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        java.lang.String str4 = comboLeg0.m_action;
        comboLeg0.m_ratio = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        int int1 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_shortSaleSlot = (byte) 0;
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        int int9 = comboLeg7.m_openClose;
        int int10 = comboLeg7.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_openClose;
        java.lang.String str5 = comboLeg0.m_action;
        comboLeg0.m_conId = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) -1;
        comboLeg0.m_ratio = (byte) 10;
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        java.lang.String str1 = comboLeg0.m_exchange;
        java.lang.Class<?> wildcardClass2 = comboLeg0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_openClose;
        java.lang.String str5 = comboLeg0.m_exchange;
        java.lang.String str6 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        int int8 = comboLeg0.m_conId;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        java.lang.Class<?> wildcardClass9 = comboLeg0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        java.lang.String str11 = comboLeg7.m_action;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_action = "hi!";
        try {
            boolean boolean14 = comboLeg7.equals((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_shortSaleSlot = 32;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_shortSaleSlot = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) 10;
        comboLeg0.m_exchange = "";
        comboLeg0.m_conId = (byte) -1;
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        java.lang.String str3 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        java.lang.String str4 = comboLeg0.m_action;
        comboLeg0.m_openClose = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        java.lang.String str1 = comboLeg0.m_exchange;
        comboLeg0.m_action = "";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_conId;
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg();
        comboLeg5.m_conId = 100;
        comboLeg5.m_openClose = 1;
        comboLeg5.m_ratio = ' ';
        comboLeg5.m_ratio = (byte) 1;
        try {
            boolean boolean14 = comboLeg0.equals((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_openClose = '#';
        int int6 = comboLeg0.m_shortSaleSlot;
        java.lang.String str7 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_openClose = (byte) 0;
        java.lang.String str11 = comboLeg7.m_exchange;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        com.ib.client.ComboLeg comboLeg10 = new com.ib.client.ComboLeg();
        comboLeg10.m_openClose = (short) 0;
        int int13 = comboLeg10.m_shortSaleSlot;
        boolean boolean14 = comboLeg0.equals((java.lang.Object) comboLeg10);
        java.lang.String str15 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 10, 10, "", "hi!", (int) '#', 0, "");
        java.lang.String str8 = comboLeg7.m_designatedLocation;
        java.lang.String str9 = comboLeg7.m_designatedLocation;
        int int10 = comboLeg7.m_ratio;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        comboLeg0.m_action = "";
        comboLeg0.m_conId = (short) 100;
        java.lang.String str9 = comboLeg0.m_action;
        comboLeg0.m_conId = (byte) 0;
        java.lang.String str12 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_exchange = "";
        int int7 = comboLeg0.m_openClose;
        comboLeg0.m_conId = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 10, 10, "", "hi!", (int) '#', 0, "");
        java.lang.String str8 = comboLeg7.m_designatedLocation;
        comboLeg7.m_conId = 'a';
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_action = "";
        comboLeg0.m_designatedLocation = "";
        comboLeg0.m_exchange = "";
        java.lang.String str9 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_openClose = (byte) 0;
        int int11 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_shortSaleSlot = 2;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(3, (int) (byte) 100, "", "hi!", (int) (byte) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_designatedLocation = "";
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        int int10 = comboLeg0.m_shortSaleSlot;
        int int11 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 100, (int) (short) 0, "", "", 100, (int) ' ', "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        java.lang.String str1 = comboLeg0.m_exchange;
        comboLeg0.m_exchange = "";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        int int12 = comboLeg0.m_shortSaleSlot;
        int int13 = comboLeg0.m_conId;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_openClose = '#';
        java.lang.String str6 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((-1), (int) (byte) -1, "hi!", "", (int) (byte) 1, 2, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_openClose = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        comboLeg0.m_conId = 32;
        int int8 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_action = "";
        comboLeg0.m_designatedLocation = "";
        java.lang.String str7 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) (short) 10, 2, "hi!", "hi!", (int) '4');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, 0, "", "", (int) (byte) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) (byte) 1, 100, "", "hi!", 32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_conId = 'a';
        comboLeg0.m_openClose = 0;
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        java.lang.String str5 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        comboLeg0.m_shortSaleSlot = 100;
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        int int9 = comboLeg7.m_openClose;
        comboLeg7.m_openClose = (byte) -1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) 10;
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_ratio = (byte) 1;
        comboLeg0.m_action = "hi!";
        comboLeg0.m_openClose = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(3, (int) (short) -1, "", "hi!", 10, (int) (short) -1, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        comboLeg0.m_conId = 32;
        comboLeg0.m_ratio = (short) 100;
        comboLeg0.m_conId = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((-1), (int) (short) 10, "", "hi!", 0, (int) (byte) 100, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        comboLeg0.m_exchange = "hi!";
        comboLeg0.m_designatedLocation = "";
        comboLeg0.m_conId = 100;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_openClose;
        java.lang.Class<?> wildcardClass6 = comboLeg0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_shortSaleSlot = (byte) 100;
        int int6 = comboLeg0.m_conId;
        java.lang.String str7 = comboLeg0.m_exchange;
        int int8 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "hi!";
        comboLeg0.m_exchange = "hi!";
        comboLeg0.m_designatedLocation = "";
        comboLeg0.m_ratio = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, (int) (byte) 0, "", "", 32);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_shortSaleSlot = '4';
        comboLeg0.m_conId = (-1);
        comboLeg0.m_action = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        comboLeg0.m_conId = 32;
        comboLeg0.m_ratio = (short) 100;
        comboLeg0.m_conId = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_shortSaleSlot = '4';
        java.lang.Object obj8 = null;
        boolean boolean9 = comboLeg0.equals(obj8);
        comboLeg0.m_ratio = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_action = "";
        comboLeg0.m_ratio = (short) -1;
        comboLeg0.m_shortSaleSlot = (byte) 10;
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_conId = 'a';
        comboLeg0.m_ratio = (short) 10;
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_shortSaleSlot = (byte) 100;
        int int6 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) (short) -1, (int) '#', "", "hi!", (int) 'a');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        java.lang.String str3 = comboLeg0.m_action;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) (short) 0, (int) 'a', "hi!", "hi!", 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((int) (byte) 1, 3, "", "hi!", (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        int int11 = comboLeg7.m_openClose;
        comboLeg7.m_openClose = (-1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_openClose = (byte) -1;
        java.lang.Class<?> wildcardClass13 = comboLeg7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_action = "";
        comboLeg0.m_openClose = 10;
        java.lang.String str11 = comboLeg0.m_exchange;
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "hi!";
        int int9 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        comboLeg0.m_conId = 32;
        int int8 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        java.lang.String str7 = comboLeg0.m_action;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        java.lang.String str3 = comboLeg0.m_action;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        com.ib.client.ComboLeg comboLeg8 = new com.ib.client.ComboLeg();
        comboLeg8.m_conId = 100;
        comboLeg8.m_openClose = 1;
        comboLeg8.m_ratio = ' ';
        try {
            boolean boolean15 = comboLeg0.equals((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) -1;
        comboLeg0.m_openClose = 0;
        java.lang.String str7 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_openClose;
        comboLeg0.m_openClose = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_conId = 'a';
        comboLeg0.m_openClose = 100;
        int int9 = comboLeg0.m_ratio;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(100, (int) (byte) 0, "hi!", "", (int) (byte) 0, (int) (byte) 100, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        java.lang.String str1 = comboLeg0.m_exchange;
        com.ib.client.ComboLeg comboLeg2 = new com.ib.client.ComboLeg();
        comboLeg2.m_exchange = "";
        comboLeg2.m_designatedLocation = "hi!";
        comboLeg2.m_exchange = "";
        int int9 = comboLeg2.m_openClose;
        boolean boolean10 = comboLeg0.equals((java.lang.Object) comboLeg2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_openClose = (byte) -1;
        try {
            boolean boolean14 = comboLeg7.equals((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        java.lang.String str12 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "";
        comboLeg0.m_designatedLocation = "hi!";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        int int11 = comboLeg7.m_openClose;
        comboLeg7.m_shortSaleSlot = (byte) 10;
        int int14 = comboLeg7.m_openClose;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_action = "";
        comboLeg0.m_designatedLocation = "";
        comboLeg0.m_action = "";
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        int int3 = comboLeg0.m_ratio;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        int int6 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "";
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        comboLeg0.m_action = "";
        java.lang.String str7 = comboLeg0.m_designatedLocation;
        java.lang.String str8 = comboLeg0.m_designatedLocation;
        int int9 = comboLeg0.m_openClose;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        java.lang.String str12 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "";
        java.lang.String str15 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(97, (int) (short) -1, "hi!", "", 32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        comboLeg0.m_action = "";
        comboLeg0.m_conId = (short) 100;
        java.lang.String str9 = comboLeg0.m_action;
        comboLeg0.m_conId = (byte) 0;
        comboLeg0.m_shortSaleSlot = 2;
        comboLeg0.m_designatedLocation = "hi!";
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((-1), 97, "hi!", "hi!", (int) (byte) 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_exchange = "";
        java.lang.String str7 = comboLeg0.m_action;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        comboLeg0.m_designatedLocation = "hi!";
        java.lang.String str10 = comboLeg0.m_action;
        comboLeg0.m_openClose = (byte) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = '#';
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_conId;
        comboLeg0.m_ratio = 100;
        java.lang.Class<?> wildcardClass7 = comboLeg0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        java.lang.String str5 = comboLeg0.m_exchange;
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(2, (int) (byte) 100, "", "", 1);
        int int6 = comboLeg5.m_ratio;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        int int12 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        java.lang.String str15 = comboLeg0.m_exchange;
        java.lang.String str16 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_designatedLocation = "";
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_openClose;
        java.lang.String str5 = comboLeg0.m_exchange;
        comboLeg0.m_shortSaleSlot = (byte) 10;
        comboLeg0.m_designatedLocation = "hi!";
        java.lang.String str10 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, (int) (short) -1, "", "hi!", 100);
        int int6 = comboLeg5.m_shortSaleSlot;
        int int7 = comboLeg5.m_shortSaleSlot;
        comboLeg5.m_exchange = "hi!";
        com.ib.client.ComboLeg comboLeg10 = new com.ib.client.ComboLeg();
        comboLeg10.m_conId = 100;
        comboLeg10.m_openClose = 1;
        comboLeg10.m_ratio = ' ';
        comboLeg10.m_ratio = (byte) 1;
        int int19 = comboLeg10.m_ratio;
        int int20 = comboLeg10.m_shortSaleSlot;
        comboLeg10.m_designatedLocation = "";
        comboLeg10.m_shortSaleSlot = 100;
        try {
            boolean boolean25 = comboLeg5.equals((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to com.ib.client.ComboLeg");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) 10;
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_ratio = (byte) 1;
        comboLeg0.m_exchange = "";
        comboLeg0.m_ratio = 97;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_exchange = "";
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_exchange = "";
        int int7 = comboLeg0.m_openClose;
        java.lang.String str8 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_ratio;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, (int) (short) -1, "", "hi!", 100);
        int int6 = comboLeg5.m_shortSaleSlot;
        java.lang.String str7 = comboLeg5.m_action;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "hi!";
        comboLeg0.m_exchange = "hi!";
        comboLeg0.m_action = "";
        java.lang.String str13 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        java.lang.String str8 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        int int6 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (byte) 10;
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_ratio = (byte) 1;
        comboLeg0.m_exchange = "";
        comboLeg0.m_openClose = (short) -1;
        int int12 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = (short) 0;
        int int3 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_shortSaleSlot = (byte) 100;
        int int6 = comboLeg0.m_conId;
        java.lang.String str7 = comboLeg0.m_exchange;
        int int8 = comboLeg0.m_shortSaleSlot;
        int int9 = comboLeg0.m_ratio;
        comboLeg0.m_conId = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        java.lang.String str3 = comboLeg0.m_exchange;
        comboLeg0.m_action = "";
        int int6 = comboLeg0.m_openClose;
        comboLeg0.m_openClose = 'a';
        int int9 = comboLeg0.m_openClose;
        int int10 = comboLeg0.m_ratio;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (byte) 1, 97, "hi!", "", (int) (short) 10, (int) (byte) 1, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        int int10 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        int int13 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_ratio;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        comboLeg0.m_exchange = "hi!";
        comboLeg0.m_designatedLocation = "";
        com.ib.client.ComboLeg comboLeg14 = new com.ib.client.ComboLeg();
        comboLeg14.m_conId = 2;
        comboLeg14.m_shortSaleSlot = (byte) 10;
        int int19 = comboLeg14.m_conId;
        comboLeg14.m_ratio = (byte) 1;
        java.lang.String str22 = comboLeg14.m_exchange;
        boolean boolean23 = comboLeg0.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_shortSaleSlot;
        int int6 = comboLeg0.m_conId;
        int int7 = comboLeg0.m_conId;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        comboLeg0.m_action = "";
        comboLeg0.m_conId = (short) 100;
        java.lang.String str9 = comboLeg0.m_action;
        comboLeg0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        java.lang.String str3 = comboLeg0.m_exchange;
        comboLeg0.m_action = "";
        int int6 = comboLeg0.m_openClose;
        java.lang.String str7 = comboLeg0.m_designatedLocation;
        int int8 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_action = "";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        comboLeg0.m_designatedLocation = "hi!";
        com.ib.client.ComboLeg comboLeg10 = new com.ib.client.ComboLeg();
        comboLeg10.m_conId = 100;
        comboLeg10.m_action = "";
        comboLeg10.m_designatedLocation = "";
        comboLeg10.m_exchange = "";
        boolean boolean19 = comboLeg0.equals((java.lang.Object) comboLeg10);
        int int20 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        int int10 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        comboLeg0.m_shortSaleSlot = 100;
        int int15 = comboLeg0.m_ratio;
        comboLeg0.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 10, 52, "", "", (int) (short) 1, 100, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        int int12 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        int int15 = comboLeg0.m_openClose;
        java.lang.String str16 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (byte) 100, (int) (short) 10, "hi!", "", (int) (byte) 10, (int) '4', "");
        java.lang.String str8 = comboLeg7.m_exchange;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (byte) 100, (int) (short) -1, "hi!", "", (int) (short) 100, 1, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_openClose;
        comboLeg0.m_designatedLocation = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        int int7 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_conId = 2;
        comboLeg0.m_designatedLocation = "hi!";
        java.lang.String str12 = comboLeg0.m_designatedLocation;
        java.lang.String str13 = comboLeg0.m_action;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        java.lang.String str6 = comboLeg0.m_designatedLocation;
        comboLeg0.m_action = "hi!";
        comboLeg0.m_exchange = "hi!";
        comboLeg0.m_designatedLocation = "";
        int int13 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        int int5 = comboLeg0.m_conId;
        int int6 = comboLeg0.m_openClose;
        comboLeg0.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_action = "hi!";
        comboLeg0.m_action = "hi!";
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(32, (int) (short) 100, "", "", (int) (byte) -1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_openClose;
        int int10 = comboLeg0.m_ratio;
        comboLeg0.m_exchange = "";
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        java.lang.String str7 = comboLeg0.m_exchange;
        comboLeg0.m_shortSaleSlot = (-1);
        comboLeg0.m_shortSaleSlot = (short) 1;
        java.lang.Class<?> wildcardClass12 = comboLeg0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_openClose;
        int int10 = comboLeg0.m_ratio;
        int int11 = comboLeg0.m_openClose;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        java.lang.String str7 = comboLeg0.m_exchange;
        int int8 = comboLeg0.m_ratio;
        comboLeg0.m_action = "";
        comboLeg0.m_action = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        java.lang.String str1 = comboLeg0.m_exchange;
        int int2 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_ratio = 10;
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg();
        comboLeg5.m_conId = 2;
        comboLeg5.m_shortSaleSlot = (short) -1;
        comboLeg5.m_shortSaleSlot = (-1);
        int int12 = comboLeg5.m_ratio;
        comboLeg5.m_designatedLocation = "hi!";
        java.lang.String str15 = comboLeg5.m_action;
        boolean boolean16 = comboLeg0.equals((java.lang.Object) str15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        int int6 = comboLeg0.m_shortSaleSlot;
        com.ib.client.ComboLeg comboLeg14 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int15 = comboLeg14.m_shortSaleSlot;
        comboLeg14.m_action = "";
        boolean boolean18 = comboLeg0.equals((java.lang.Object) comboLeg14);
        comboLeg14.m_exchange = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(10, (int) ' ', "", "", 2, (int) (byte) -1, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        int int10 = comboLeg0.m_shortSaleSlot;
        java.lang.String str11 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_openClose = 'a';
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        comboLeg0.m_designatedLocation = "hi!";
        comboLeg0.m_action = "";
        comboLeg0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(52, 1, "hi!", "hi!", 3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(2, 52, "", "hi!", 10, (int) (short) 10, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(10, (int) (byte) 100, "", "", (int) (short) 100);
        comboLeg5.m_shortSaleSlot = (byte) 1;
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_shortSaleSlot;
        java.lang.String str5 = comboLeg0.m_exchange;
        int int6 = comboLeg0.m_shortSaleSlot;
        com.ib.client.ComboLeg comboLeg14 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int15 = comboLeg14.m_shortSaleSlot;
        comboLeg14.m_action = "";
        boolean boolean18 = comboLeg0.equals((java.lang.Object) comboLeg14);
        int int19 = comboLeg0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        java.lang.String str3 = comboLeg0.m_exchange;
        comboLeg0.m_action = "";
        int int6 = comboLeg0.m_openClose;
        comboLeg0.m_openClose = 'a';
        int int9 = comboLeg0.m_openClose;
        comboLeg0.m_action = "";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) 'a', 3, "hi!", "hi!", (int) (short) 1, 1, "hi!");
        java.lang.String str8 = comboLeg7.m_exchange;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(1, 0, "", "", (int) (byte) 1);
        comboLeg5.m_action = "hi!";
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        java.lang.String str7 = comboLeg0.m_exchange;
        int int8 = comboLeg0.m_ratio;
        comboLeg0.m_action = "";
        java.lang.String str11 = comboLeg0.m_designatedLocation;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 1, (int) '4', "", "", (int) ' ', (int) (byte) -1, "hi!");
        int int8 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_designatedLocation = "hi!";
        comboLeg7.m_action = "hi!";
        int int13 = comboLeg7.m_shortSaleSlot;
        comboLeg7.m_conId = (byte) 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(97, (int) '4', "", "hi!", 10, (int) (byte) -1, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_shortSaleSlot;
        int int6 = comboLeg0.m_conId;
        java.lang.String str7 = comboLeg0.m_exchange;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg((int) (short) 10, 10, "", "hi!", (int) '#', 0, "");
        java.lang.String str8 = comboLeg7.m_designatedLocation;
        comboLeg7.m_action = "";
        int int11 = comboLeg7.m_ratio;
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.ib.client.ComboLeg comboLeg7 = new com.ib.client.ComboLeg(0, (int) (short) 10, "", "hi!", (int) (short) 0, (int) (short) -1, "");
        int int8 = comboLeg7.m_ratio;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_conId = (-1);
        int int5 = comboLeg0.m_conId;
        comboLeg0.m_shortSaleSlot = '4';
        comboLeg0.m_conId = (-1);
        comboLeg0.m_openClose = 10;
        comboLeg0.m_exchange = "";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        comboLeg0.m_designatedLocation = "hi!";
        int int10 = comboLeg0.m_ratio;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_conId = 0;
        comboLeg0.m_action = "";
        comboLeg0.m_conId = (short) 100;
        java.lang.String str9 = comboLeg0.m_action;
        comboLeg0.m_openClose = 0;
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg((-1), 1, "", "", (int) (short) 100);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.ib.client.ComboLeg comboLeg5 = new com.ib.client.ComboLeg(0, (int) (short) -1, "", "hi!", 100);
        int int6 = comboLeg5.m_openClose;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_openClose;
        java.lang.Class<?> wildcardClass5 = comboLeg0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 2;
        comboLeg0.m_shortSaleSlot = (short) -1;
        comboLeg0.m_shortSaleSlot = (-1);
        int int7 = comboLeg0.m_ratio;
        comboLeg0.m_designatedLocation = "hi!";
        com.ib.client.ComboLeg comboLeg10 = new com.ib.client.ComboLeg();
        comboLeg10.m_conId = 100;
        comboLeg10.m_action = "";
        comboLeg10.m_designatedLocation = "";
        comboLeg10.m_exchange = "";
        boolean boolean19 = comboLeg0.equals((java.lang.Object) comboLeg10);
        java.lang.String str20 = comboLeg10.m_exchange;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_exchange = "hi!";
        int int5 = comboLeg0.m_openClose;
        comboLeg0.m_openClose = 'a';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        comboLeg0.m_openClose = 1;
        comboLeg0.m_ratio = ' ';
        comboLeg0.m_ratio = (byte) 1;
        int int9 = comboLeg0.m_ratio;
        int int10 = comboLeg0.m_shortSaleSlot;
        comboLeg0.m_designatedLocation = "";
        int int13 = comboLeg0.m_conId;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.ib.client.ComboLeg comboLeg0 = new com.ib.client.ComboLeg();
        comboLeg0.m_conId = 100;
        int int3 = comboLeg0.m_openClose;
        int int4 = comboLeg0.m_conId;
        comboLeg0.m_designatedLocation = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }
}

