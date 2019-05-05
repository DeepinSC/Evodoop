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
        int int0 = com.ib.client.TickType.LAST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = com.ib.client.TickType.LAST_OPTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = com.ib.client.TickType.getField(100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = com.ib.client.TickType.AUCTION_VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34 + "'", int0 == 34);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = com.ib.client.TickType.ASK_OPTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = com.ib.client.TickType.HIGH_52_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 20 + "'", int0 == 20);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = com.ib.client.TickType.VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = com.ib.client.TickType.AUCTION_PRICE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = com.ib.client.TickType.LAST_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = com.ib.client.TickType.HIGH_26_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 18 + "'", int0 == 18);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = com.ib.client.TickType.OPTION_PUT_OPEN_INTEREST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 28 + "'", int0 == 28);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = com.ib.client.TickType.OPTION_HISTORICAL_VOL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 23 + "'", int0 == 23);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = com.ib.client.TickType.LOW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = com.ib.client.TickType.BID_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = com.ib.client.TickType.LOW_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = com.ib.client.TickType.ASK_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 39 + "'", int0 == 39);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = com.ib.client.TickType.FUNDAMENTAL_RATIOS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 47 + "'", int0 == 47);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = com.ib.client.TickType.LOW_26_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = com.ib.client.TickType.OPTION_PUT_VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30 + "'", int0 == 30);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = com.ib.client.TickType.MARK_PRICE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 37 + "'", int0 == 37);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str1 = com.ib.client.TickType.getField(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidPrice" + "'", str1.equals("bidPrice"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = com.ib.client.TickType.HIGH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = com.ib.client.TickType.ASK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = com.ib.client.TickType.OPTION_IMPLIED_VOL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24 + "'", int0 == 24);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int0 = com.ib.client.TickType.LOW_52_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 19 + "'", int0 == 19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = com.ib.client.TickType.MODEL_OPTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = com.ib.client.TickType.BID_EXCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int0 = com.ib.client.TickType.OPEN_INTEREST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = com.ib.client.TickType.OPTION_CALL_OPEN_INTEREST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27 + "'", int0 == 27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = com.ib.client.TickType.AVG_VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = com.ib.client.TickType.HIGH_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 42 + "'", int0 == 42);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = com.ib.client.TickType.ASK_EXCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 33 + "'", int0 == 33);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int0 = com.ib.client.TickType.HIGH_13_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str1 = com.ib.client.TickType.getField(8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "volume" + "'", str1.equals("volume"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int0 = com.ib.client.TickType.OPTION_BID_EXCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 25 + "'", int0 == 25);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int0 = com.ib.client.TickType.OPTION_ASK_EXCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 26 + "'", int0 == 26);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int0 = com.ib.client.TickType.BID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int0 = com.ib.client.TickType.LOW_13_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = com.ib.client.TickType.HALTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 49 + "'", int0 == 49);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int0 = com.ib.client.TickType.SHORTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 46 + "'", int0 == 46);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = com.ib.client.TickType.RT_VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int int0 = com.ib.client.TickType.INDEX_FUTURE_PREMIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 31 + "'", int0 == 31);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = com.ib.client.TickType.BID_OPTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int0 = com.ib.client.TickType.CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int0 = com.ib.client.TickType.CLOSE_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 44 + "'", int0 == 44);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = com.ib.client.TickType.getField((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidExch" + "'", str1.equals("bidExch"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int0 = com.ib.client.TickType.OPTION_CALL_VOLUME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29 + "'", int0 == 29);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str1 = com.ib.client.TickType.getField(26);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionAskExchStr" + "'", str1.equals("OptionAskExchStr"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int0 = com.ib.client.TickType.OPEN_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 41 + "'", int0 == 41);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int0 = com.ib.client.TickType.AUCTION_IMBALANCE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 36 + "'", int0 == 36);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str1 = com.ib.client.TickType.getField(25);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionBidExchStr" + "'", str1.equals("OptionBidExchStr"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int0 = com.ib.client.TickType.ASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int0 = com.ib.client.TickType.LAST_TIMESTAMP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 45 + "'", int0 == 45);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int0 = com.ib.client.TickType.BID_EFP_COMPUTATION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 38 + "'", int0 == 38);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = com.ib.client.TickType.OPEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int0 = com.ib.client.TickType.LAST_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = com.ib.client.TickType.getField(23);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionHistoricalVolatility" + "'", str1.equals("OptionHistoricalVolatility"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidPrice" + "'", str1.equals("bidPrice"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str1 = com.ib.client.TickType.getField(44);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "closeEFP" + "'", str1.equals("closeEFP"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = com.ib.client.TickType.getField(15);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13WeekLow" + "'", str1.equals("13WeekLow"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str1 = com.ib.client.TickType.getField(18);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26WeekHigh" + "'", str1.equals("26WeekHigh"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = com.ib.client.TickType.getField(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidSize" + "'", str1.equals("bidSize"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str1 = com.ib.client.TickType.getField(30);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionPutVolume" + "'", str1.equals("OptionPutVolume"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str1 = com.ib.client.TickType.getField(31);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "IndexFuturePremium" + "'", str1.equals("IndexFuturePremium"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = com.ib.client.TickType.getField(40);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lastEFP" + "'", str1.equals("lastEFP"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str1 = com.ib.client.TickType.getField(47);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "fundamentals" + "'", str1.equals("fundamentals"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str1 = com.ib.client.TickType.getField(7);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "low" + "'", str1.equals("low"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str1 = com.ib.client.TickType.getField(41);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "openEFP" + "'", str1.equals("openEFP"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str1 = com.ib.client.TickType.getField(42);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "highEFP" + "'", str1.equals("highEFP"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str1 = com.ib.client.TickType.getField(13);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "modelOptComp" + "'", str1.equals("modelOptComp"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str1 = com.ib.client.TickType.getField(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidOptComp" + "'", str1.equals("bidOptComp"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str1 = com.ib.client.TickType.getField(16);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "13WeekHigh" + "'", str1.equals("13WeekHigh"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str1 = com.ib.client.TickType.getField(22);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OpenInterest" + "'", str1.equals("OpenInterest"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str1 = com.ib.client.TickType.getField((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = com.ib.client.TickType.getField((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str1 = com.ib.client.TickType.getField(27);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionCallOpenInterest" + "'", str1.equals("OptionCallOpenInterest"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str1 = com.ib.client.TickType.getField(9);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "close" + "'", str1.equals("close"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str1 = com.ib.client.TickType.getField(39);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "askEFP" + "'", str1.equals("askEFP"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str1 = com.ib.client.TickType.getField(28);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionPutOpenInterest" + "'", str1.equals("OptionPutOpenInterest"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str1 = com.ib.client.TickType.getField(33);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "askExch" + "'", str1.equals("askExch"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str1 = com.ib.client.TickType.getField(36);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "auctionImbalance" + "'", str1.equals("auctionImbalance"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str1 = com.ib.client.TickType.getField(4);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lastPrice" + "'", str1.equals("lastPrice"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str1 = com.ib.client.TickType.getField(38);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidEFP" + "'", str1.equals("bidEFP"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str1 = com.ib.client.TickType.getField(5);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lastSize" + "'", str1.equals("lastSize"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = com.ib.client.TickType.getField(14);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "open" + "'", str1.equals("open"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str1 = com.ib.client.TickType.getField(35);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "auctionPrice" + "'", str1.equals("auctionPrice"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = com.ib.client.TickType.getField(11);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "askOptComp" + "'", str1.equals("askOptComp"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str1 = com.ib.client.TickType.getField(34);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "auctionVolume" + "'", str1.equals("auctionVolume"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidSize" + "'", str1.equals("bidSize"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str1 = com.ib.client.TickType.getField(48);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RTVolume" + "'", str1.equals("RTVolume"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str1 = com.ib.client.TickType.getField(37);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "markPrice" + "'", str1.equals("markPrice"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = com.ib.client.TickType.getField(21);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AvgVolume" + "'", str1.equals("AvgVolume"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str1 = com.ib.client.TickType.getField(6);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "high" + "'", str1.equals("high"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str1 = com.ib.client.TickType.getField(17);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "26WeekLow" + "'", str1.equals("26WeekLow"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str1 = com.ib.client.TickType.getField(43);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lowEFP" + "'", str1.equals("lowEFP"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str1 = com.ib.client.TickType.getField((-1));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "unknown" + "'", str1.equals("unknown"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = com.ib.client.TickType.getField(46);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "shortable" + "'", str1.equals("shortable"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidSize" + "'", str1.equals("bidSize"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str1 = com.ib.client.TickType.getField(19);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52WeekLow" + "'", str1.equals("52WeekLow"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidOptComp" + "'", str1.equals("bidOptComp"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str1 = com.ib.client.TickType.getField(24);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionImpliedVolatility" + "'", str1.equals("OptionImpliedVolatility"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = com.ib.client.TickType.getField(32);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidExch" + "'", str1.equals("bidExch"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidPrice" + "'", str1.equals("bidPrice"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str1 = com.ib.client.TickType.getField(2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "askPrice" + "'", str1.equals("askPrice"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str1 = com.ib.client.TickType.getField(20);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "52WeekHigh" + "'", str1.equals("52WeekHigh"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str1 = com.ib.client.TickType.getField(45);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lastTimestamp" + "'", str1.equals("lastTimestamp"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str1 = com.ib.client.TickType.getField(3);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "askSize" + "'", str1.equals("askSize"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str1 = com.ib.client.TickType.getField(49);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "halted" + "'", str1.equals("halted"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str1 = com.ib.client.TickType.getField((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "bidOptComp" + "'", str1.equals("bidOptComp"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = com.ib.client.TickType.getField((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "auctionPrice" + "'", str1.equals("auctionPrice"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str1 = com.ib.client.TickType.getField(29);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "OptionCallVolume" + "'", str1.equals("OptionCallVolume"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str1 = com.ib.client.TickType.getField(12);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lastOptComp" + "'", str1.equals("lastOptComp"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Class<?> wildcardClass7 = obj0.getClass();
        java.lang.Class<?> wildcardClass8 = obj0.getClass();
        java.lang.Class<?> wildcardClass9 = obj0.getClass();
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        java.lang.Class<?> wildcardClass14 = obj0.getClass();
        java.lang.Class<?> wildcardClass15 = obj0.getClass();
        java.lang.Class<?> wildcardClass16 = obj0.getClass();
        java.lang.Class<?> wildcardClass17 = obj0.getClass();
        java.lang.Class<?> wildcardClass18 = obj0.getClass();
        java.lang.Class<?> wildcardClass19 = obj0.getClass();
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        java.lang.Class<?> wildcardClass21 = obj0.getClass();
        java.lang.Class<?> wildcardClass22 = obj0.getClass();
        java.lang.Class<?> wildcardClass23 = obj0.getClass();
        java.lang.Class<?> wildcardClass24 = obj0.getClass();
        java.lang.Class<?> wildcardClass25 = obj0.getClass();
        java.lang.Class<?> wildcardClass26 = obj0.getClass();
        java.lang.Class<?> wildcardClass27 = obj0.getClass();
        java.lang.Class<?> wildcardClass28 = obj0.getClass();
        java.lang.Class<?> wildcardClass29 = obj0.getClass();
        java.lang.Class<?> wildcardClass30 = obj0.getClass();
        java.lang.Class<?> wildcardClass31 = obj0.getClass();
        java.lang.Class<?> wildcardClass32 = obj0.getClass();
        java.lang.Class<?> wildcardClass33 = obj0.getClass();
        java.lang.Class<?> wildcardClass34 = obj0.getClass();
        java.lang.Class<?> wildcardClass35 = obj0.getClass();
        java.lang.Class<?> wildcardClass36 = obj0.getClass();
        java.lang.Class<?> wildcardClass37 = obj0.getClass();
        java.lang.Class<?> wildcardClass38 = obj0.getClass();
        java.lang.Class<?> wildcardClass39 = obj0.getClass();
        java.lang.Class<?> wildcardClass40 = obj0.getClass();
        java.lang.Class<?> wildcardClass41 = obj0.getClass();
        java.lang.Class<?> wildcardClass42 = obj0.getClass();
        java.lang.Class<?> wildcardClass43 = obj0.getClass();
        java.lang.Class<?> wildcardClass44 = obj0.getClass();
        java.lang.Class<?> wildcardClass45 = obj0.getClass();
        java.lang.Class<?> wildcardClass46 = obj0.getClass();
        java.lang.Class<?> wildcardClass47 = obj0.getClass();
        java.lang.Class<?> wildcardClass48 = obj0.getClass();
        java.lang.Class<?> wildcardClass49 = obj0.getClass();
        java.lang.Class<?> wildcardClass50 = obj0.getClass();
        java.lang.Class<?> wildcardClass51 = obj0.getClass();
        java.lang.Class<?> wildcardClass52 = obj0.getClass();
        java.lang.Class<?> wildcardClass53 = obj0.getClass();
        java.lang.Class<?> wildcardClass54 = obj0.getClass();
        java.lang.Class<?> wildcardClass55 = obj0.getClass();
        java.lang.Class<?> wildcardClass56 = obj0.getClass();
        java.lang.Class<?> wildcardClass57 = obj0.getClass();
        java.lang.Class<?> wildcardClass58 = obj0.getClass();
        java.lang.Class<?> wildcardClass59 = obj0.getClass();
        java.lang.Class<?> wildcardClass60 = obj0.getClass();
        java.lang.Class<?> wildcardClass61 = obj0.getClass();
        java.lang.Class<?> wildcardClass62 = obj0.getClass();
        java.lang.Class<?> wildcardClass63 = obj0.getClass();
        java.lang.Class<?> wildcardClass64 = obj0.getClass();
        java.lang.Class<?> wildcardClass65 = obj0.getClass();
        java.lang.Class<?> wildcardClass66 = obj0.getClass();
        java.lang.Class<?> wildcardClass67 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.TickType tickType0 = new com.ib.client.TickType();
        java.lang.Class<?> wildcardClass1 = tickType0.getClass();
        java.lang.Class<?> wildcardClass2 = tickType0.getClass();
        java.lang.Class<?> wildcardClass3 = tickType0.getClass();
        java.lang.Class<?> wildcardClass4 = tickType0.getClass();
        java.lang.Class<?> wildcardClass5 = tickType0.getClass();
        java.lang.Class<?> wildcardClass6 = tickType0.getClass();
        java.lang.Class<?> wildcardClass7 = tickType0.getClass();
        java.lang.Class<?> wildcardClass8 = tickType0.getClass();
        java.lang.Class<?> wildcardClass9 = tickType0.getClass();
        java.lang.Class<?> wildcardClass10 = tickType0.getClass();
        java.lang.Class<?> wildcardClass11 = tickType0.getClass();
        java.lang.Class<?> wildcardClass12 = tickType0.getClass();
        java.lang.Class<?> wildcardClass13 = tickType0.getClass();
        java.lang.Class<?> wildcardClass14 = tickType0.getClass();
        java.lang.Class<?> wildcardClass15 = tickType0.getClass();
        java.lang.Class<?> wildcardClass16 = tickType0.getClass();
        java.lang.Class<?> wildcardClass17 = tickType0.getClass();
        java.lang.Class<?> wildcardClass18 = tickType0.getClass();
        java.lang.Class<?> wildcardClass19 = tickType0.getClass();
        java.lang.Class<?> wildcardClass20 = tickType0.getClass();
        java.lang.Class<?> wildcardClass21 = tickType0.getClass();
        java.lang.Class<?> wildcardClass22 = tickType0.getClass();
        java.lang.Class<?> wildcardClass23 = tickType0.getClass();
        java.lang.Class<?> wildcardClass24 = tickType0.getClass();
        java.lang.Class<?> wildcardClass25 = tickType0.getClass();
        java.lang.Class<?> wildcardClass26 = tickType0.getClass();
        java.lang.Class<?> wildcardClass27 = tickType0.getClass();
        java.lang.Class<?> wildcardClass28 = tickType0.getClass();
        java.lang.Class<?> wildcardClass29 = tickType0.getClass();
        java.lang.Class<?> wildcardClass30 = tickType0.getClass();
        java.lang.Class<?> wildcardClass31 = tickType0.getClass();
        java.lang.Class<?> wildcardClass32 = tickType0.getClass();
        java.lang.Class<?> wildcardClass33 = tickType0.getClass();
        java.lang.Class<?> wildcardClass34 = tickType0.getClass();
        java.lang.Class<?> wildcardClass35 = tickType0.getClass();
        java.lang.Class<?> wildcardClass36 = tickType0.getClass();
        java.lang.Class<?> wildcardClass37 = tickType0.getClass();
        java.lang.Class<?> wildcardClass38 = tickType0.getClass();
        java.lang.Class<?> wildcardClass39 = tickType0.getClass();
        java.lang.Class<?> wildcardClass40 = tickType0.getClass();
        java.lang.Class<?> wildcardClass41 = tickType0.getClass();
        java.lang.Class<?> wildcardClass42 = tickType0.getClass();
        java.lang.Class<?> wildcardClass43 = tickType0.getClass();
        java.lang.Class<?> wildcardClass44 = tickType0.getClass();
        java.lang.Class<?> wildcardClass45 = tickType0.getClass();
        java.lang.Class<?> wildcardClass46 = tickType0.getClass();
        java.lang.Class<?> wildcardClass47 = tickType0.getClass();
        java.lang.Class<?> wildcardClass48 = tickType0.getClass();
        java.lang.Class<?> wildcardClass49 = tickType0.getClass();
        java.lang.Class<?> wildcardClass50 = tickType0.getClass();
        java.lang.Class<?> wildcardClass51 = tickType0.getClass();
        java.lang.Class<?> wildcardClass52 = tickType0.getClass();
        java.lang.Class<?> wildcardClass53 = tickType0.getClass();
        java.lang.Class<?> wildcardClass54 = tickType0.getClass();
        java.lang.Class<?> wildcardClass55 = tickType0.getClass();
        java.lang.Class<?> wildcardClass56 = tickType0.getClass();
        java.lang.Class<?> wildcardClass57 = tickType0.getClass();
        java.lang.Class<?> wildcardClass58 = tickType0.getClass();
        java.lang.Class<?> wildcardClass59 = tickType0.getClass();
        java.lang.Class<?> wildcardClass60 = tickType0.getClass();
        java.lang.Class<?> wildcardClass61 = tickType0.getClass();
        java.lang.Class<?> wildcardClass62 = tickType0.getClass();
        java.lang.Class<?> wildcardClass63 = tickType0.getClass();
        java.lang.Class<?> wildcardClass64 = tickType0.getClass();
        java.lang.Class<?> wildcardClass65 = tickType0.getClass();
        java.lang.Class<?> wildcardClass66 = tickType0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }
}

