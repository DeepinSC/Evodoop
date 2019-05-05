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
        int int0 = com.ib.client.Order.AUCTION_TRANSPARENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        char char0 = com.ib.client.Order.OPT_BROKER_DEALER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'b' + "'", char0 == 'b');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = com.ib.client.Order.EMPTY_STR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        char char0 = com.ib.client.Order.OPT_FARMM;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'n' + "'", char0 == 'n');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = com.ib.client.Order.CUSTOMER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.ib.client.Order.AUCTION_IMPROVEMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = com.ib.client.Order.FIRM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        char char0 = com.ib.client.Order.OPT_UNKNOWN;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '?' + "'", char0 == '?');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        double double6 = order0.m_nbboPriceCap;
        order0.m_triggerMethod = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        order0.m_blockOrder = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        char char0 = com.ib.client.Order.OPT_FIRM;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'f' + "'", char0 == 'f');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_auctionStrategy = '?';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        char char0 = com.ib.client.Order.OPT_SPECIALIST;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'y' + "'", char0 == 'y');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        char char0 = com.ib.client.Order.OPT_ISEMM;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'm' + "'", char0 == 'm');
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_triggerMethod = (byte) 100;
        order0.m_deltaNeutralAuxPrice = 'y';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_goodTillDate = "hi!";
        java.lang.String str4 = order0.m_designatedLocation;
        order0.m_scaleInitLevelSize = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        int int6 = order0.m_clientId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        order0.m_faPercentage = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        double double5 = order0.m_discretionaryAmt;
        order0.m_basisPoints = (byte) 0;
        double double8 = order0.m_nbboPriceCap;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_goodAfterTime;
        order0.m_hidden = false;
        order0.m_settlingFirm = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_deltaNeutralOrderType;
        order0.m_outsideRth = true;
        double double8 = order0.m_trailStopPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_firmQuoteOnly;
        boolean boolean10 = order0.m_outsideRth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_designatedLocation = "hi!";
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        order0.m_displaySize = 'b';
        int int8 = order0.m_triggerMethod;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        order0.m_basisPoints = 0.0d;
        int int6 = order0.m_basisPointsType;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_goodAfterTime;
        order0.m_orderType = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        double double6 = order0.m_nbboPriceCap;
        order0.m_account = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        double double6 = order0.m_nbboPriceCap;
        order0.m_settlingFirm = "hi!";
        double double9 = order0.m_nbboPriceCap;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_notHeld = false;
        order0.m_auxPrice = (short) 100;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = com.ib.client.Order.AUCTION_MATCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_rule80A;
        order0.m_continuousUpdate = ' ';
        java.lang.String str8 = order0.m_orderType;
        java.lang.Class<?> wildcardClass9 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_firmQuoteOnly;
        double double10 = order0.m_delta;
        double double11 = order0.m_auxPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_allOrNone = true;
        java.lang.String str9 = order0.m_faProfile;
        order0.m_algoStrategy = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        order0.m_referencePriceType = 'y';
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        order0.m_eTradeOnly = true;
        order0.m_orderRef = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_firmQuoteOnly;
        int int5 = order0.m_triggerMethod;
        int int6 = order0.m_basisPointsType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_faPercentage = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_stockRefPrice = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_allOrNone = true;
        java.lang.String str9 = order0.m_faProfile;
        java.lang.String str10 = order0.m_openClose;
        order0.m_deltaNeutralAuxPrice = (-1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "O" + "'", str10.equals("O"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        int int5 = order0.m_basisPointsType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        order0.m_ocaGroup = "hi!";
        order0.m_eTradeOnly = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        int int2 = order0.m_triggerMethod;
        order0.m_basisPointsType = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        java.lang.String str7 = order0.m_deltaNeutralOrderType;
        order0.m_startingPrice = 'a';
        int int10 = order0.m_parentId;
        double double11 = order0.m_stockRangeUpper;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_firmQuoteOnly;
        order0.m_displaySize = 'y';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        int int4 = order0.m_triggerMethod;
        java.util.Vector vector5 = null;
        order0.m_algoParams = vector5;
        order0.m_permId = 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        order0.m_algoStrategy = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        order0.m_permId = (-1);
        int int8 = order0.m_minQty;
        order0.m_clearingIntent = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        double double7 = order0.m_lmtPrice;
        order0.m_ocaGroup = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        order0.m_sweepToFill = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        int int3 = order0.m_triggerMethod;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        order0.m_faPercentage = "";
        double double5 = order0.m_lmtPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_ocaGroup = "";
        java.lang.String str9 = order0.m_faGroup;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        int int2 = order0.m_triggerMethod;
        boolean boolean3 = order0.m_notHeld;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_faPercentage = "hi!";
        order0.m_clientId = (byte) -1;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_firmQuoteOnly;
        int int5 = order0.m_triggerMethod;
        order0.m_basisPointsType = 2147483647;
        java.lang.String str8 = order0.m_rule80A;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        order0.m_volatilityType = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_notHeld = false;
        boolean boolean4 = order0.m_transmit;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_action = "hi!";
        order0.m_orderId = (short) 1;
        order0.m_scaleSubsLevelSize = 2147483647;
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        double double2 = order0.m_auxPrice;
        double double3 = order0.m_stockRangeLower;
        order0.m_clearingAccount = "hi!";
        order0.m_firmQuoteOnly = false;
        order0.m_firmQuoteOnly = true;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_action = "";
        double double4 = order0.m_volatility;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_stockRangeUpper = (byte) 100;
        double double9 = order0.m_trailStopPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        java.lang.String str5 = order0.m_openClose;
        java.lang.String str6 = order0.m_faPercentage;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O" + "'", str5.equals("O"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_faPercentage = "hi!";
        order0.m_startingPrice = 1.0f;
        double double6 = order0.m_startingPrice;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        order0.m_orderRef = "";
        java.lang.String str9 = order0.m_tif;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_minQty;
        order0.m_origin = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_deltaNeutralOrderType;
        order0.m_outsideRth = true;
        java.lang.String str8 = order0.m_action;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_goodAfterTime;
        order0.m_hidden = false;
        double double5 = order0.m_discretionaryAmt;
        java.lang.Class<?> wildcardClass6 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        int int4 = order0.m_triggerMethod;
        int int5 = order0.m_origin;
        boolean boolean6 = order0.m_eTradeOnly;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_ocaType;
        int int2 = order0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_stockRefPrice = (-1.0d);
        order0.m_algoStrategy = "O";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        int int4 = order0.m_triggerMethod;
        java.util.Vector vector5 = null;
        order0.m_algoParams = vector5;
        order0.m_transmit = false;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        order0.m_ocaGroup = "hi!";
        order0.m_action = "O";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        java.lang.String str7 = order0.m_deltaNeutralOrderType;
        order0.m_stockRangeLower = 0;
        order0.m_stockRefPrice = 'b';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        boolean boolean2 = order0.m_notHeld;
        double double3 = order0.m_trailStopPrice;
        java.lang.String str4 = order0.m_openClose;
        order0.m_settlingFirm = "O";
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O" + "'", str4.equals("O"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        order0.m_totalQuantity = (short) 10;
        order0.m_permId = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_algoStrategy;
        int int3 = order0.m_ocaType;
        order0.m_goodAfterTime = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        int int2 = order0.m_triggerMethod;
        order0.m_scaleInitLevelSize = 'b';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_triggerMethod = (byte) 100;
        order0.m_clientId = 'f';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_triggerMethod = (byte) 100;
        boolean boolean4 = order0.m_whatIf;
        int int5 = order0.m_parentId;
        java.lang.String str6 = order0.m_faMethod;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        boolean boolean6 = order0.m_sweepToFill;
        java.lang.String str7 = order0.m_faMethod;
        order0.m_referencePriceType = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_allOrNone = true;
        java.lang.String str9 = order0.m_openClose;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "O" + "'", str9.equals("O"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_openClose = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        char char0 = com.ib.client.Order.OPT_CUSTOMER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'c' + "'", char0 == 'c');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        boolean boolean7 = order0.m_hidden;
        int int8 = order0.m_scaleInitLevelSize;
        double double9 = order0.m_deltaNeutralAuxPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_goodAfterTime;
        double double3 = order0.m_discretionaryAmt;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        boolean boolean3 = order0.m_sweepToFill;
        order0.m_basisPointsType = 'm';
        order0.m_delta = 1.0d;
        double double8 = order0.m_deltaNeutralAuxPrice;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_goodTillDate = "hi!";
        order0.m_firmQuoteOnly = true;
        java.lang.String str6 = order0.m_action;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        order0.m_basisPoints = 0.0d;
        int int6 = order0.m_parentId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        order0.m_orderType = "";
        java.lang.String str6 = order0.m_action;
        order0.m_parentId = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_firmQuoteOnly;
        int int5 = order0.m_triggerMethod;
        order0.m_basisPointsType = 2147483647;
        order0.m_action = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_faPercentage = "hi!";
        order0.m_whatIf = true;
        double double6 = order0.m_auxPrice;
        java.lang.String str7 = order0.m_orderType;
        order0.m_eTradeOnly = false;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_goodAfterTime;
        order0.m_hidden = false;
        boolean boolean5 = order0.m_blockOrder;
        boolean boolean6 = order0.m_blockOrder;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_algoStrategy;
        double double3 = order0.m_delta;
        int int4 = order0.m_volatilityType;
        order0.m_stockRangeUpper = 2147483647;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        double double5 = order0.m_discretionaryAmt;
        double double6 = order0.m_lmtPrice;
        order0.m_hidden = false;
        boolean boolean9 = order0.m_whatIf;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        order0.m_orderRef = "";
        int int9 = order0.m_orderId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        order0.m_permId = (-1);
        int int8 = order0.m_minQty;
        order0.m_eTradeOnly = true;
        int int11 = order0.m_volatilityType;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_rule80A;
        order0.m_continuousUpdate = ' ';
        int int8 = order0.m_displaySize;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        order0.m_notHeld = false;
        order0.m_ocaGroup = "";
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_algoStrategy;
        double double3 = order0.m_delta;
        int int4 = order0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        order0.m_faPercentage = "";
        order0.m_startingPrice = (byte) 1;
        java.lang.String str7 = order0.m_orderRef;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        double double5 = order0.m_deltaNeutralAuxPrice;
        java.lang.String str6 = order0.m_clearingAccount;
        order0.m_stockRangeUpper = (-1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        boolean boolean3 = order0.m_sweepToFill;
        boolean boolean4 = order0.m_sweepToFill;
        double double5 = order0.m_delta;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        boolean boolean3 = order0.m_sweepToFill;
        order0.m_basisPointsType = 'm';
        order0.m_deltaNeutralOrderType = "O";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        order0.m_scaleInitLevelSize = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        order0.m_totalQuantity = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_deltaNeutralOrderType;
        order0.m_outsideRth = true;
        order0.m_allOrNone = true;
        double double10 = order0.m_trailStopPrice;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        double double2 = order0.m_auxPrice;
        int int3 = order0.m_basisPointsType;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_firmQuoteOnly;
        int int5 = order0.m_triggerMethod;
        java.lang.String str6 = order0.m_ocaGroup;
        int int7 = order0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_deltaNeutralOrderType;
        order0.m_outsideRth = true;
        order0.m_deltaNeutralOrderType = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_firmQuoteOnly;
        order0.m_outsideRth = false;
        order0.m_clearingAccount = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        order0.m_permId = (-1);
        int int8 = order0.m_minQty;
        order0.m_displaySize = '?';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_deltaNeutralOrderType;
        order0.m_whatIf = false;
        order0.m_triggerMethod = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        boolean boolean3 = order0.m_sweepToFill;
        boolean boolean4 = order0.m_sweepToFill;
        java.util.Vector vector5 = null;
        order0.m_algoParams = vector5;
        double double7 = order0.m_discretionaryAmt;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_firmQuoteOnly;
        boolean boolean5 = order0.m_eTradeOnly;
        int int6 = order0.m_auctionStrategy;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        order0.m_scaleInitLevelSize = '?';
        java.lang.String str7 = order0.m_action;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        boolean boolean4 = order0.m_transmit;
        order0.m_notHeld = false;
        int int7 = order0.m_shortSaleSlot;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        double double5 = order0.m_deltaNeutralAuxPrice;
        int int6 = order0.m_permId;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_hidden;
        order0.m_blockOrder = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        double double2 = order0.m_stockRangeUpper;
        java.lang.String str3 = order0.m_faMethod;
        double double4 = order0.m_stockRefPrice;
        int int5 = order0.m_ocaType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_stockRangeUpper = (byte) 100;
        order0.m_percentOffset = 'y';
        order0.m_orderRef = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        java.lang.String str2 = order0.m_algoStrategy;
        double double3 = order0.m_delta;
        int int4 = order0.m_volatilityType;
        java.lang.String str5 = order0.m_clearingAccount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        order0.m_orderType = "";
        order0.m_nbboPriceCap = 100.0f;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        double double5 = order0.m_discretionaryAmt;
        order0.m_clientId = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        boolean boolean7 = order0.m_hidden;
        order0.m_ocaType = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        boolean boolean2 = order0.m_notHeld;
        boolean boolean3 = order0.m_outsideRth;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        java.lang.String str5 = order0.m_openClose;
        java.lang.String str6 = order0.m_clearingAccount;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O" + "'", str5.equals("O"));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_startingPrice = 'm';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        double double5 = order0.m_deltaNeutralAuxPrice;
        order0.m_permId = 0;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        order0.m_whatIf = false;
        boolean boolean6 = order0.m_outsideRth;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_action = "hi!";
        order0.m_startingPrice = 'y';
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        order0.m_auxPrice = 0.0d;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_firmQuoteOnly;
        boolean boolean10 = order0.m_eTradeOnly;
        int int11 = order0.m_scaleSubsLevelSize;
        order0.m_rule80A = "O";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_rule80A;
        order0.m_continuousUpdate = ' ';
        java.lang.String str8 = order0.m_orderType;
        order0.m_nbboPriceCap = 100.0f;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        order0.m_permId = (-1);
        int int8 = order0.m_minQty;
        order0.m_eTradeOnly = true;
        double double11 = order0.m_stockRefPrice;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_ocaType;
        order0.m_algoStrategy = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_hidden;
        double double6 = order0.m_delta;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        java.lang.String str5 = order0.m_openClose;
        order0.m_faPercentage = "";
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O" + "'", str5.equals("O"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        int int5 = order0.m_volatilityType;
        int int6 = order0.m_minQty;
        java.lang.String str7 = order0.m_deltaNeutralOrderType;
        boolean boolean8 = order0.m_blockOrder;
        order0.m_designatedLocation = "hi!";
        order0.m_delta = 0L;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        order0.m_ocaGroup = "";
        int int9 = order0.m_orderId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        int int4 = order0.m_triggerMethod;
        java.util.Vector vector5 = null;
        order0.m_algoParams = vector5;
        java.lang.String str7 = order0.m_openClose;
        order0.m_scaleInitLevelSize = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O" + "'", str7.equals("O"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        double double6 = order0.m_nbboPriceCap;
        order0.m_settlingFirm = "hi!";
        order0.m_openClose = "";
        boolean boolean11 = order0.m_overridePercentageConstraints;
        boolean boolean12 = order0.m_blockOrder;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        java.lang.String str5 = order0.m_orderType;
        java.lang.String str6 = order0.m_goodTillDate;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_permId;
        order0.m_triggerMethod = 0;
        double double6 = order0.m_startingPrice;
        order0.m_ocaGroup = "";
        order0.m_deltaNeutralOrderType = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.Order order0 = new com.ib.client.Order();
        boolean boolean1 = order0.m_whatIf;
        order0.m_triggerMethod = (byte) 100;
        order0.m_tif = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        order0.m_hidden = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_referencePriceType = (byte) 100;
        order0.m_basisPoints = (short) 100;
        order0.m_displaySize = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        java.lang.String str5 = order0.m_rule80A;
        order0.m_continuousUpdate = ' ';
        java.lang.String str8 = order0.m_orderType;
        order0.m_volatility = 98;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        order0.m_permId = 'b';
        boolean boolean4 = order0.m_whatIf;
        double double5 = order0.m_deltaNeutralAuxPrice;
        order0.m_scalePriceIncrement = ' ';
        order0.m_auxPrice = 100L;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_action = "";
        order0.m_trailStopPrice = (byte) 0;
        order0.m_auctionStrategy = (short) 0;
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        order0.m_notHeld = false;
        java.lang.String str11 = order0.m_goodTillDate;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        boolean boolean5 = order0.m_outsideRth;
        java.lang.String str6 = order0.m_faGroup;
        order0.m_allOrNone = true;
        order0.m_faMethod = "O";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        int int4 = order0.m_continuousUpdate;
        order0.m_origin = (-1);
        order0.m_orderId = 2147483647;
        boolean boolean9 = order0.m_overridePercentageConstraints;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.Order order0 = new com.ib.client.Order();
        order0.m_goodAfterTime = "hi!";
        int int3 = order0.m_totalQuantity;
        int int4 = order0.m_triggerMethod;
        java.util.Vector vector5 = null;
        order0.m_algoParams = vector5;
        java.lang.String str7 = order0.m_openClose;
        order0.m_orderRef = "hi!";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O" + "'", str7.equals("O"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.Order order0 = new com.ib.client.Order();
        java.lang.String str1 = order0.m_designatedLocation;
        order0.m_notHeld = false;
        order0.m_account = "";
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.Order order0 = new com.ib.client.Order();
        double double1 = order0.m_lmtPrice;
        double double2 = order0.m_auxPrice;
        double double3 = order0.m_stockRangeLower;
        order0.m_clearingAccount = "hi!";
        order0.m_volatility = 1;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.Order order0 = new com.ib.client.Order();
        int int1 = order0.m_totalQuantity;
        int int2 = order0.m_volatilityType;
        int int3 = order0.m_ocaType;
        boolean boolean4 = order0.m_eTradeOnly;
        java.lang.String str5 = order0.m_openClose;
        order0.m_auxPrice = 0.0f;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O" + "'", str5.equals("O"));
    }
}

