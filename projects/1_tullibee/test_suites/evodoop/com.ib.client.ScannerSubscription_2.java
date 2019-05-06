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
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        scannerSubscription0.marketCapAbove((double) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        java.lang.String str9 = scannerSubscription0.scanCode();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.moodyRatingBelow("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = com.ib.client.ScannerSubscription.NO_ROW_NUMBER_SPECIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.excludeConvertible();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        java.lang.String str5 = scannerSubscription0.moodyRatingAbove();
        double double6 = scannerSubscription0.couponRateBelow();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.numberOfRows((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.stockTypeFilter();
        double double5 = scannerSubscription0.couponRateAbove();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        scannerSubscription0.scannerSettingPairs("hi!");
        java.lang.String str5 = scannerSubscription0.instrument();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.stockTypeFilter();
        double double4 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        int int7 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        scannerSubscription0.marketCapAbove((double) '4');
        int int8 = scannerSubscription0.averageOptionVolumeAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        int int4 = scannerSubscription0.numberOfRows();
        scannerSubscription0.stockTypeFilter("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.scanCode("");
        java.lang.String str10 = scannerSubscription0.moodyRatingBelow();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.excludeConvertible("hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        int int10 = scannerSubscription0.numberOfRows();
        scannerSubscription0.maturityDateAbove("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.instrument("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        int int4 = scannerSubscription0.averageOptionVolumeAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        double double7 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.belowPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        java.lang.String str8 = scannerSubscription0.moodyRatingAbove();
        scannerSubscription0.averageOptionVolumeAbove(100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.instrument();
        scannerSubscription0.aboveVolume(10);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.stockTypeFilter("hi!");
        java.lang.String str6 = scannerSubscription0.spRatingAbove();
        java.lang.String str7 = scannerSubscription0.instrument();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        double double6 = scannerSubscription0.marketCapBelow();
        java.lang.String str7 = scannerSubscription0.maturityDateAbove();
        scannerSubscription0.locationCode("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        scannerSubscription0.marketCapAbove((double) '4');
        double double8 = scannerSubscription0.marketCapBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.locationCode();
        scannerSubscription0.instrument("");
        int int8 = scannerSubscription0.averageOptionVolumeAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.excludeConvertible("");
        java.lang.String str10 = scannerSubscription0.scannerSettingPairs();
        scannerSubscription0.marketCapAbove(0.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        double double6 = scannerSubscription0.couponRateBelow();
        java.lang.String str7 = scannerSubscription0.maturityDateBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.stockTypeFilter();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.maturityDateBelow("");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.marketCapBelow((double) '4');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scannerSettingPairs("hi!");
        scannerSubscription0.moodyRatingBelow("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.maturityDateAbove();
        scannerSubscription0.spRatingAbove("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        java.lang.String str9 = scannerSubscription0.scanCode();
        scannerSubscription0.couponRateBelow((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        double double7 = scannerSubscription0.marketCapAbove();
        scannerSubscription0.numberOfRows((int) (byte) 1);
        java.lang.String str10 = scannerSubscription0.stockTypeFilter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        java.lang.String str5 = scannerSubscription0.moodyRatingAbove();
        scannerSubscription0.marketCapAbove((double) ' ');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.stockTypeFilter("hi!");
        java.lang.Class<?> wildcardClass6 = scannerSubscription0.getClass();
        double double7 = scannerSubscription0.couponRateBelow();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        java.lang.String str3 = scannerSubscription0.spRatingBelow();
        scannerSubscription0.maturityDateAbove("hi!");
        java.lang.String str6 = scannerSubscription0.locationCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        java.lang.Class<?> wildcardClass9 = scannerSubscription0.getClass();
        scannerSubscription0.locationCode("hi!");
        java.lang.String str12 = scannerSubscription0.scanCode();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.scanCode("");
        java.lang.String str10 = scannerSubscription0.scannerSettingPairs();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        int int12 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.moodyRatingBelow("");
        scannerSubscription0.spRatingBelow("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.averageOptionVolumeAbove((int) (byte) 0);
        scannerSubscription0.marketCapBelow((double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        scannerSubscription0.excludeConvertible("");
        int int6 = scannerSubscription0.numberOfRows();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        double double7 = scannerSubscription0.marketCapAbove();
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        int int9 = scannerSubscription0.aboveVolume();
        java.lang.String str10 = scannerSubscription0.maturityDateAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.stockTypeFilter();
        double double5 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        scannerSubscription0.marketCapAbove((double) '4');
        java.lang.Class<?> wildcardClass8 = scannerSubscription0.getClass();
        java.lang.String str9 = scannerSubscription0.spRatingBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.locationCode();
        java.lang.String str6 = scannerSubscription0.locationCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.scanCode("hi!");
        int int7 = scannerSubscription0.numberOfRows();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.aboveVolume(2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        java.lang.String str6 = scannerSubscription0.spRatingBelow();
        scannerSubscription0.marketCapAbove((double) 100);
        scannerSubscription0.stockTypeFilter("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scannerSettingPairs("hi!");
        scannerSubscription0.averageOptionVolumeAbove((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        scannerSubscription0.averageOptionVolumeAbove((int) (byte) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        double double8 = scannerSubscription0.abovePrice();
        scannerSubscription0.stockTypeFilter("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        int int7 = scannerSubscription0.averageOptionVolumeAbove();
        int int8 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        double double7 = scannerSubscription0.belowPrice();
        scannerSubscription0.marketCapBelow(0.0d);
        scannerSubscription0.scanCode("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        java.lang.String str8 = scannerSubscription0.moodyRatingAbove();
        scannerSubscription0.maturityDateAbove("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        java.lang.String str9 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.belowPrice(1.7976931348623157E308d);
        double double12 = scannerSubscription0.marketCapBelow();
        java.lang.String str13 = scannerSubscription0.locationCode();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.aboveVolume((int) (byte) 1);
        double double8 = scannerSubscription0.marketCapAbove();
        double double9 = scannerSubscription0.couponRateAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        scannerSubscription0.moodyRatingAbove("");
        java.lang.String str9 = scannerSubscription0.spRatingBelow();
        scannerSubscription0.belowPrice((double) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        scannerSubscription0.marketCapAbove((double) '4');
        java.lang.Class<?> wildcardClass8 = scannerSubscription0.getClass();
        scannerSubscription0.abovePrice((double) 10L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        int int7 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.moodyRatingAbove("hi!");
        scannerSubscription0.scanCode("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.scanCode("");
        scannerSubscription0.moodyRatingAbove("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.belowPrice();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.belowPrice((double) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.instrument("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        java.lang.String str6 = scannerSubscription0.instrument();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        scannerSubscription0.abovePrice(100.0d);
        double double8 = scannerSubscription0.marketCapAbove();
        scannerSubscription0.couponRateAbove((double) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        java.lang.String str9 = scannerSubscription0.scanCode();
        java.lang.Class<?> wildcardClass10 = scannerSubscription0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        int int7 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.belowPrice((double) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.stockTypeFilter("hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.maturityDateBelow();
        scannerSubscription0.spRatingAbove("");
        java.lang.String str6 = scannerSubscription0.scannerSettingPairs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.marketCapBelow((double) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        int int4 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        java.lang.String str9 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.belowPrice(1.7976931348623157E308d);
        double double12 = scannerSubscription0.marketCapBelow();
        java.lang.String str13 = scannerSubscription0.spRatingBelow();
        int int14 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        int int12 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.excludeConvertible("hi!");
        scannerSubscription0.instrument("hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        java.lang.String str12 = scannerSubscription0.instrument();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.belowPrice((double) 0.0f);
        scannerSubscription0.couponRateAbove((double) (short) 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.locationCode();
        java.lang.String str6 = scannerSubscription0.excludeConvertible();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        java.lang.String str5 = scannerSubscription0.moodyRatingAbove();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str8 = scannerSubscription0.scanCode();
        java.lang.String str9 = scannerSubscription0.spRatingAbove();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.couponRateAbove(0.0d);
        scannerSubscription0.scannerSettingPairs("");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.belowPrice();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.instrument("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.stockTypeFilter("hi!");
        java.lang.Class<?> wildcardClass6 = scannerSubscription0.getClass();
        double double7 = scannerSubscription0.belowPrice();
        int int8 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.stockTypeFilter();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.moodyRatingAbove("hi!");
        scannerSubscription0.averageOptionVolumeAbove(10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.stockTypeFilter("hi!");
        java.lang.String str6 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.abovePrice((double) (short) 0);
        scannerSubscription0.marketCapBelow(100.0d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.aboveVolume((int) (byte) 1);
        double double8 = scannerSubscription0.marketCapAbove();
        java.lang.String str9 = scannerSubscription0.spRatingBelow();
        java.lang.String str10 = scannerSubscription0.maturityDateAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.averageOptionVolumeAbove((int) 'a');
        scannerSubscription0.maturityDateAbove("");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        java.lang.String str8 = scannerSubscription0.moodyRatingAbove();
        double double9 = scannerSubscription0.couponRateBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.couponRateBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        java.lang.String str6 = scannerSubscription0.stockTypeFilter();
        java.lang.String str7 = scannerSubscription0.stockTypeFilter();
        int int8 = scannerSubscription0.numberOfRows();
        scannerSubscription0.averageOptionVolumeAbove((int) (short) 1);
        scannerSubscription0.moodyRatingAbove("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.averageOptionVolumeAbove((int) (byte) 0);
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.marketCapBelow(100.0d);
        scannerSubscription0.excludeConvertible("hi!");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        int int12 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.moodyRatingBelow("");
        java.lang.Class<?> wildcardClass15 = scannerSubscription0.getClass();
        scannerSubscription0.marketCapAbove((double) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        java.lang.String str9 = scannerSubscription0.scanCode();
        java.lang.String str10 = scannerSubscription0.spRatingBelow();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.averageOptionVolumeAbove((int) (byte) 0);
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.maturityDateBelow("");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        java.lang.String str6 = scannerSubscription0.stockTypeFilter();
        java.lang.String str7 = scannerSubscription0.stockTypeFilter();
        int int8 = scannerSubscription0.numberOfRows();
        scannerSubscription0.averageOptionVolumeAbove((int) (short) 1);
        int int11 = scannerSubscription0.numberOfRows();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.aboveVolume((int) (byte) 1);
        double double8 = scannerSubscription0.marketCapAbove();
        double double9 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.7976931348623157E308d + "'", double9 == 1.7976931348623157E308d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.maturityDateBelow("hi!");
        java.lang.String str12 = scannerSubscription0.scanCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        java.lang.String str6 = scannerSubscription0.stockTypeFilter();
        double double7 = scannerSubscription0.belowPrice();
        double double8 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.averageOptionVolumeAbove((int) (byte) 0);
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.marketCapBelow(100.0d);
        double double9 = scannerSubscription0.abovePrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.maturityDateAbove("");
        java.lang.String str5 = scannerSubscription0.instrument();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        int int4 = scannerSubscription0.numberOfRows();
        int int5 = scannerSubscription0.numberOfRows();
        java.lang.String str6 = scannerSubscription0.scannerSettingPairs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.averageOptionVolumeAbove(1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        double double6 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingAbove("");
        scannerSubscription0.stockTypeFilter("hi!");
        int int11 = scannerSubscription0.aboveVolume();
        int int12 = scannerSubscription0.averageOptionVolumeAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.scanCode();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        double double6 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingAbove("");
        scannerSubscription0.couponRateBelow((double) (short) 0);
        scannerSubscription0.couponRateAbove((double) 10.0f);
        java.lang.String str13 = scannerSubscription0.scanCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        scannerSubscription0.moodyRatingBelow("");
        java.lang.String str9 = scannerSubscription0.maturityDateAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        double double6 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingAbove("");
        scannerSubscription0.stockTypeFilter("hi!");
        double double11 = scannerSubscription0.belowPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.scannerSettingPairs();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.numberOfRows((int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        java.lang.String str5 = scannerSubscription0.spRatingAbove();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        java.lang.String str6 = scannerSubscription0.stockTypeFilter();
        double double7 = scannerSubscription0.belowPrice();
        scannerSubscription0.couponRateBelow((-1.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.moodyRatingBelow("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.maturityDateAbove("");
        java.lang.String str5 = scannerSubscription0.maturityDateBelow();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        scannerSubscription0.aboveVolume(0);
        scannerSubscription0.spRatingBelow("");
        double double11 = scannerSubscription0.marketCapBelow();
        java.lang.String str12 = scannerSubscription0.maturityDateAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.7976931348623157E308d + "'", double11 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        double double7 = scannerSubscription0.belowPrice();
        scannerSubscription0.marketCapBelow(0.0d);
        scannerSubscription0.moodyRatingAbove("");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        double double7 = scannerSubscription0.marketCapAbove();
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.maturityDateBelow("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.belowPrice();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.couponRateAbove((double) 0.0f);
        double double8 = scannerSubscription0.couponRateBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.maturityDateAbove("");
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.maturityDateAbove("hi!");
        double double8 = scannerSubscription0.marketCapBelow();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        double double12 = scannerSubscription0.belowPrice();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        scannerSubscription0.maturityDateBelow("hi!");
        java.lang.Class<?> wildcardClass5 = scannerSubscription0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        scannerSubscription0.aboveVolume(0);
        java.lang.Class<?> wildcardClass9 = scannerSubscription0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        int int6 = scannerSubscription0.numberOfRows();
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.excludeConvertible("");
        java.lang.String str10 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str11 = scannerSubscription0.spRatingAbove();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        java.lang.String str5 = scannerSubscription0.moodyRatingBelow();
        double double6 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.marketCapAbove(100.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        java.lang.String str6 = scannerSubscription0.spRatingBelow();
        scannerSubscription0.marketCapAbove((double) 100);
        java.lang.String str9 = scannerSubscription0.locationCode();
        java.lang.String str10 = scannerSubscription0.stockTypeFilter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        int int9 = scannerSubscription0.aboveVolume();
        scannerSubscription0.locationCode("hi!");
        int int12 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.moodyRatingBelow("");
        java.lang.Class<?> wildcardClass15 = scannerSubscription0.getClass();
        java.lang.String str16 = scannerSubscription0.moodyRatingBelow();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        double double7 = scannerSubscription0.marketCapBelow();
        scannerSubscription0.scanCode("");
        scannerSubscription0.spRatingAbove("hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        double double7 = scannerSubscription0.belowPrice();
        scannerSubscription0.marketCapBelow(0.0d);
        java.lang.String str10 = scannerSubscription0.stockTypeFilter();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.stockTypeFilter();
        java.lang.String str6 = scannerSubscription0.spRatingBelow();
        scannerSubscription0.marketCapAbove((double) 100);
        double double9 = scannerSubscription0.belowPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        scannerSubscription0.abovePrice(100.0d);
        double double8 = scannerSubscription0.marketCapAbove();
        scannerSubscription0.couponRateAbove((double) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.7976931348623157E308d + "'", double8 == 1.7976931348623157E308d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.moodyRatingAbove("");
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        scannerSubscription0.moodyRatingAbove("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        java.lang.String str4 = scannerSubscription0.stockTypeFilter();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.stockTypeFilter("hi!");
        scannerSubscription0.locationCode("hi!");
        int int10 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.instrument();
        double double4 = scannerSubscription0.couponRateAbove();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        java.lang.String str7 = scannerSubscription0.spRatingAbove();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        scannerSubscription0.excludeConvertible("");
        scannerSubscription0.couponRateAbove(0.0d);
        double double8 = scannerSubscription0.couponRateAbove();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.String str3 = scannerSubscription0.instrument();
        double double4 = scannerSubscription0.marketCapAbove();
        scannerSubscription0.scanCode("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.scanCode("hi!");
        java.lang.String str7 = scannerSubscription0.moodyRatingBelow();
        scannerSubscription0.moodyRatingAbove("");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.scanCode("hi!");
        java.lang.String str7 = scannerSubscription0.spRatingBelow();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.scanCode("");
        scannerSubscription0.numberOfRows((int) '4');
        java.lang.String str6 = scannerSubscription0.stockTypeFilter();
        scannerSubscription0.maturityDateAbove("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.belowPrice((double) 1);
        scannerSubscription0.moodyRatingBelow("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        java.lang.String str9 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.belowPrice(1.7976931348623157E308d);
        double double12 = scannerSubscription0.marketCapBelow();
        double double13 = scannerSubscription0.marketCapBelow();
        java.lang.String str14 = scannerSubscription0.spRatingAbove();
        double double15 = scannerSubscription0.marketCapBelow();
        double double16 = scannerSubscription0.marketCapAbove();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.7976931348623157E308d + "'", double12 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.7976931348623157E308d + "'", double13 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.7976931348623157E308d + "'", double15 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.marketCapAbove((double) 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        java.lang.String str3 = scannerSubscription0.spRatingBelow();
        java.lang.String str4 = scannerSubscription0.instrument();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.belowPrice();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.couponRateAbove((double) 0.0f);
        java.lang.String str8 = scannerSubscription0.maturityDateBelow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        java.lang.String str3 = scannerSubscription0.scannerSettingPairs();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        scannerSubscription0.aboveVolume(0);
        scannerSubscription0.spRatingBelow("");
        scannerSubscription0.moodyRatingBelow("");
        int int13 = scannerSubscription0.aboveVolume();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        java.lang.String str3 = scannerSubscription0.moodyRatingBelow();
        double double4 = scannerSubscription0.belowPrice();
        int int5 = scannerSubscription0.averageOptionVolumeAbove();
        scannerSubscription0.couponRateAbove((double) 100.0f);
        scannerSubscription0.scannerSettingPairs("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = scannerSubscription0.getClass();
        scannerSubscription0.excludeConvertible("");
        double double6 = scannerSubscription0.couponRateAbove();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.7976931348623157E308d + "'", double6 == 1.7976931348623157E308d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        java.lang.String str1 = scannerSubscription0.stockTypeFilter();
        double double2 = scannerSubscription0.couponRateAbove();
        scannerSubscription0.belowPrice(100.0d);
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.moodyRatingBelow();
        double double7 = scannerSubscription0.marketCapAbove();
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        scannerSubscription0.belowPrice(1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7976931348623157E308d + "'", double2 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.7976931348623157E308d + "'", double7 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        double double3 = scannerSubscription0.marketCapBelow();
        double double4 = scannerSubscription0.couponRateAbove();
        double double5 = scannerSubscription0.couponRateBelow();
        scannerSubscription0.moodyRatingBelow("hi!");
        java.lang.String str8 = scannerSubscription0.spRatingAbove();
        java.lang.String str9 = scannerSubscription0.scanCode();
        double double10 = scannerSubscription0.couponRateAbove();
        java.lang.String str11 = scannerSubscription0.excludeConvertible();
        java.lang.String str12 = scannerSubscription0.excludeConvertible();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7976931348623157E308d + "'", double3 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.7976931348623157E308d + "'", double4 == 1.7976931348623157E308d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.7976931348623157E308d + "'", double5 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.7976931348623157E308d + "'", double10 == 1.7976931348623157E308d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        java.lang.String str5 = scannerSubscription0.moodyRatingAbove();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.averageOptionVolumeAbove((int) ' ');
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.marketCapAbove((double) (byte) 100);
        scannerSubscription0.marketCapAbove((double) 1.0f);
        scannerSubscription0.stockTypeFilter("");
        scannerSubscription0.spRatingBelow("");
        java.lang.String str9 = scannerSubscription0.spRatingAbove();
        double double10 = scannerSubscription0.marketCapAbove();
        java.lang.String str11 = scannerSubscription0.stockTypeFilter();
        java.lang.String str12 = scannerSubscription0.spRatingAbove();
        java.lang.String str13 = scannerSubscription0.excludeConvertible();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.instrument("");
        scannerSubscription0.locationCode("hi!");
        java.lang.String str7 = scannerSubscription0.maturityDateBelow();
        java.lang.String str8 = scannerSubscription0.scanCode();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.abovePrice((double) (short) 100);
        scannerSubscription0.moodyRatingAbove("");
        java.lang.String str5 = scannerSubscription0.scannerSettingPairs();
        java.lang.String str6 = scannerSubscription0.locationCode();
        java.lang.String str7 = scannerSubscription0.excludeConvertible();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.ScannerSubscription scannerSubscription0 = new com.ib.client.ScannerSubscription();
        scannerSubscription0.spRatingAbove("hi!");
        scannerSubscription0.maturityDateBelow("hi!");
        scannerSubscription0.averageOptionVolumeAbove((int) (short) 0);
    }
}

