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
        java.lang.String str0 = com.ib.client.AnyWrapperMsgGenerator.connectionClosed();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Connection Closed" + "'", str0.equals("Connection Closed"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd(100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 100 =============== end ===============" + "'", str1.equals("id = 100 =============== end ==============="));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: GROUPS hi!" + "'", str2.equals("FA: GROUPS hi!"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData(0, "hi!", (double) '#', (double) (-1.0f), 0.0d, 1.0d, (int) '4', 1, (double) (short) 100, false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str10.equals("id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str1.equals("Connected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Exception exception0 = null;
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error(exception0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Error - null" + "'", str1.equals("Error - null"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 97" + "'", str1.equals("Next Valid Order ID: 97"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("Error - null", "", "id = 100 =============== end ===============", "Next Valid Order ID: 97");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97" + "'", str4.equals("updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth((int) (byte) 10, (int) (byte) -1, 100, (int) (short) 1, (double) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 10 -1 100 1 10.0 10" + "'", str6.equals("updateMktDepth: 10 -1 100 1 10.0 10"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 100 =============== end ===============" + "'", str1.equals("reqId = 100 =============== end ==============="));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 10 =============== end ===============" + "'", str1.equals("id = 10 =============== end ==============="));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = com.ib.client.EWrapperMsgGenerator.FINANCIAL_ADVISOR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FA:" + "'", str0.equals("FA:"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (byte) 1, (int) (byte) 100, "id = 100 =============== end ===============", "Connection Closed");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str4.equals("MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Exception exception0 = null;
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.ioError(exception0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Error - null" + "'", str1.equals("Error - null"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (short) 10, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 35 (Dec 31, 1969 6:00:35 PM)" + "'", str1.equals("current time = 35 (Dec 31, 1969 6:00:35 PM)"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 32 =============== end ===============" + "'", str1.equals("id = 32 =============== end ==============="));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) (byte) 10, 0, (double) 0, (double) 10.0f, (double) 100, (double) (-1L));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=10  bidSize: vol = 0.0 delta = N/A" + "'", str6.equals("id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar(0, 0L, (double) 0L, (double) 100L, (double) 10L, (double) (short) -1, 1L, 0.0d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0" + "'", str9.equals("id=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) 1, (int) (byte) 100, (double) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=1  unknown=1.0  noAutoExecute" + "'", str4.equals("id=1  unknown=1.0  noAutoExecute"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((-1), "FA:", 100, (int) (short) -1, (double) 10L, (int) ' ', (int) (byte) -1, (double) (byte) -1, (int) (byte) 1, "current time = 35 (Dec 31, 1969 6:00:35 PM)");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=-1 clientId=1 permId=32 status=FA: filled=100 remaining=-1 avgFillPrice=10.0 lastFillPrice=-1.0 parent Id=-1 whyHeld=current time = 35 (Dec 31, 1969 6:00:35 PM)" + "'", str10.equals("order status: orderId=-1 clientId=1 permId=32 status=FA: filled=100 remaining=-1 avgFillPrice=10.0 lastFillPrice=-1.0 parent Id=-1 whyHeld=current time = 35 (Dec 31, 1969 6:00:35 PM)"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 10 (Dec 31, 1969 6:00:10 PM)" + "'", str1.equals("current time = 10 (Dec 31, 1969 6:00:10 PM)"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (byte) 1, (int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  bidSize=35" + "'", str3.equals("id=1  bidSize=35"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("FA: GROUPS hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nFA: GROUPS hi!" + "'", str1.equals("SCANNER PARAMETERS:\nFA: GROUPS hi!"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (short) 1, "id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A" + "'", str2.equals("FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = -1 (Dec 31, 1969 5:59:59 PM)" + "'", str1.equals("current time = -1 (Dec 31, 1969 5:59:59 PM)"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", "FA: GROUPS hi!", "MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", "hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!" + "'", str4.equals("updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 97 =============== end ===============" + "'", str1.equals("reqId = 97 =============== end ==============="));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData(0, "id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str2.equals("id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 1 =============== end ===============" + "'", str1.equals("id = 1 =============== end ==============="));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails(10, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (short) 1, (int) '#', "Next Valid Order ID: 97");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  auctionPrice=Next Valid Order ID: 97" + "'", str3.equals("id=1  auctionPrice=Next Valid Order ID: 97"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) ' ', 10L, (double) 10, 10.0d, (double) '#', (double) (short) 100, (long) (byte) 1, (double) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0" + "'", str9.equals("id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (byte) -1, "id = 1 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = -1 len = 42\nid = 1 =============== end ===============" + "'", str2.equals("id  = -1 len = 42\nid = 1 =============== end ==============="));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails(0, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) 'a', "reqId = 97 =============== end ===============", (int) (short) 100, (int) (short) 100, (double) 1.0f, (int) (short) 1, (int) (short) 10, (double) (short) 10, (int) (byte) 10, "MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str10.equals("order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) '#', contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = -1 =============== end ===============" + "'", str1.equals("reqId = -1 =============== end ==============="));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) '#', "id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null id=10  bidSize: vol = 0.0 delta = N/A" + "'", str2.equals("FA: null id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((-1), (int) (byte) 100, (double) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=-1  unknown=10.0  canAutoExecute" + "'", str4.equals("id=-1  unknown=10.0  canAutoExecute"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) 'a', (-1), "Error - null", "reqId = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null" + "'", str4.equals("MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("SCANNER PARAMETERS:\nFA: GROUPS hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nFA: GROUPS hi!" + "'", str1.equals("SCANNER PARAMETERS:\nFA: GROUPS hi!"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) ' ', 10, "FA: null id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A" + "'", str3.equals("32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) (short) -1, 100, contractDetails2, "id = 32 =============== end ===============", "Next Valid Order ID: 97", "", "id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (short) 100, "Error - null", (int) (byte) 100, 0, (double) 10, (int) '#', 100, (double) (short) 10, (int) (short) 0, "id = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=100 clientId=0 permId=35 status=Error - null filled=100 remaining=0 avgFillPrice=10.0 lastFillPrice=10.0 parent Id=100 whyHeld=id = 10 =============== end ===============" + "'", str10.equals("order status: orderId=100 clientId=0 permId=35 status=Error - null filled=100 remaining=0 avgFillPrice=10.0 lastFillPrice=10.0 parent Id=100 whyHeld=id = 10 =============== end ==============="));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A" + "'", str1.equals("FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) '4', (int) (byte) 10, (double) (-1L), 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=52  bidOptComp=-1.0  noAutoExecute" + "'", str4.equals("id=52  bidOptComp=-1.0  noAutoExecute"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) '4', "id=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 52 len = 80\nid=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0" + "'", str2.equals("id  = 52 len = 80\nid=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("Connection Closed");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [Connection Closed]" + "'", str1.equals("Connected : The list of managed accounts are : [Connection Closed]"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (byte) 100, (int) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  unknown=0.0" + "'", str3.equals("id=100  unknown=0.0"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = com.ib.client.EWrapperMsgGenerator.openOrderEnd();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " =============== end ===============" + "'", str0.equals(" =============== end ==============="));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData((-1), "Connected : The list of managed accounts are : [Connection Closed]", (double) 10.0f, (double) 100.0f, (double) (-1.0f), (double) (short) 10, 1, (int) ' ', (double) 100.0f, false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=-1 date = Connected : The list of managed accounts are : [Connection Closed] open=10.0 high=100.0 low=-1.0 close=10.0 volume=1 count=32 WAP=100.0 hasGaps=false" + "'", str10.equals("id=-1 date = Connected : The list of managed accounts are : [Connection Closed] open=10.0 high=100.0 low=-1.0 close=10.0 volume=1 count=32 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) '4', (int) (short) -1, "id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str3.equals("id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (short) 10, (-1), "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10 | -1 | " + "'", str3.equals("10 | -1 | "));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(100, (int) (short) 1, "id = 10 =============== end ===============", " =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=100 :: MsgType=1 :: Origin= =============== end =============== :: Message=id = 10 =============== end ===============" + "'", str4.equals("MsgId=100 :: MsgType=1 :: Origin= =============== end =============== :: Message=id = 10 =============== end ==============="));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (short) 100, (int) (short) 0, "id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A" + "'", str3.equals("100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("id=100  unknown=0.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: id=100  unknown=0.0" + "'", str1.equals("accountDownloadEnd: id=100  unknown=0.0"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 1 =============== end ===============" + "'", str1.equals("id = 1 =============== end ==============="));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (byte) 1, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  bidPrice=-1" + "'", str3.equals("id=1  bidPrice=-1"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (byte) -1, "current time = 35 (Dec 31, 1969 6:00:35 PM)", (int) (byte) 100, (int) (short) 100, (double) '#', (int) (short) 0, (int) ' ', (double) (short) 10, 1, "current time = 10 (Dec 31, 1969 6:00:10 PM)");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM)" + "'", str10.equals("order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM)"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails(100, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime(10L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 10 (Dec 31, 1969 6:00:10 PM)" + "'", str1.equals("current time = 10 (Dec 31, 1969 6:00:10 PM)"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.tickEFP((int) (byte) -1, (int) ' ', (double) (short) 100, "FA:", (double) (short) 100, (int) (short) 100, "id=-1  unknown=10.0  canAutoExecute", (-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0" + "'", str9.equals("id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) '4', (int) 'a', (double) 10.0f, (double) '4', (double) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=52  unknown: vol = 10.0 delta = N/A" + "'", str6.equals("id=52  unknown: vol = 10.0 delta = N/A"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(10, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) (short) 1, 1, (double) (short) 10, 1.0d, (double) 0L, (double) (-1));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=1  bidPrice: vol = 10.0 delta = 1.0" + "'", str6.equals("id=1  bidPrice: vol = 10.0 delta = 1.0"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (short) 10, (int) (byte) 0, "id=1  bidSize=35", "Connection Closed");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35" + "'", str4.equals("MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((int) (byte) 100, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) (short) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = -1 =============== end ===============" + "'", str1.equals("id = -1 =============== end ==============="));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) '4', 0, (double) 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=52  bidSize=10.0" + "'", str3.equals("id=52  bidSize=10.0"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (byte) 100, 0.0d, (double) ' ', (double) 1L, (double) 1L, (double) 1, "id = 10 =============== end ===============");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.contractDetails((int) (short) -1, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) ' ', contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = com.ib.client.EWrapperMsgGenerator.SCANNER_PARAMETERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SCANNER PARAMETERS:" + "'", str0.equals("SCANNER PARAMETERS:"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 32 =============== end ===============" + "'", str1.equals("reqId = 32 =============== end ==============="));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(100, (int) (byte) 1, "updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97", (int) (byte) -1, (int) (byte) 1, (double) (-1L), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10" + "'", str7.equals("updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (byte) 0, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=0  bidPrice=" + "'", str3.equals("id=0  bidPrice="));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (byte) 10, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(100, (int) ' ', (double) 1L, (double) (byte) 10, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=100  bidExch: vol = 1.0 delta = N/A" + "'", str6.equals("id=100  bidExch: vol = 1.0 delta = N/A"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(0, (int) (short) 0, contractDetails2, "id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false", "updateMktDepth: 10 -1 100 1 10.0 10", "", "order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (short) 0, (int) '4', "10 | -1 | ");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 | 52 | 10 | -1 | " + "'", str3.equals("0 | 52 | 10 | -1 | "));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails(100, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("Connected : The list of managed accounts are : [Connection Closed]", "id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0", "MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35", "MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: Connected : The list of managed accounts are : [Connection Closed] id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35 MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35" + "'", str4.equals("updateAccountValue: Connected : The list of managed accounts are : [Connection Closed] id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35 MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) 'a', "updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!" + "'", str2.equals("FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.tickEFP((int) (short) -1, (-1), 0.0d, "32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A", (double) 100.0f, (int) (short) 1, "updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10", (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1  unknown: basisPoints = 0.0/32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A impliedFuture = 100.0 holdDays = 1 futureExpiry = updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10 dividendImpact = 1.0 dividends to expiry = 0.0" + "'", str9.equals("id=-1  unknown: basisPoints = 0.0/32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A impliedFuture = 100.0 holdDays = 1 futureExpiry = updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10 dividendImpact = 1.0 dividends to expiry = 0.0"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("id  = 52 len = 80\nid=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: id  = 52 len = 80\nid=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0" + "'", str1.equals("updateAccountTime: id  = 52 len = 80\nid=0 time = 0 open=0.0 high=100.0 low=10.0 close=-1.0 volume=1 count=100 WAP=0.0"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str1.equals("updateAccountTime: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) '4', contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str1.equals("SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd((int) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 100 =============== end ===============" + "'", str1.equals("reqId = 100 =============== end ==============="));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((int) (byte) 0, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractMsg(contract0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(10, 0, (double) 0L, (double) (short) 10, (double) 10.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=10  bidSize: vol = 0.0 delta = N/A" + "'", str6.equals("id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((-1L));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = -1 (Dec 31, 1969 5:59:59 PM)" + "'", str1.equals("current time = -1 (Dec 31, 1969 5:59:59 PM)"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (short) -1, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((-1), contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData((int) (short) 1, "id=1  unknown=1.0  noAutoExecute", (double) ' ', (double) '#', (double) 1, (double) 0.0f, (int) (byte) -1, (int) 'a', (double) '#', false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=1 date = id=1  unknown=1.0  noAutoExecute open=32.0 high=35.0 low=1.0 close=0.0 volume=-1 count=97 WAP=35.0 hasGaps=false" + "'", str10.equals("id=1 date = id=1  unknown=1.0  noAutoExecute open=32.0 high=35.0 low=1.0 close=0.0 volume=-1 count=97 WAP=35.0 hasGaps=false"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) 'a', (int) (byte) 0, "id=52  bidSize=10.0", "Connected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0" + "'", str4.equals("MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(100, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  bidSize=100" + "'", str3.equals("id=100  bidSize=100"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(0, (int) (short) 0, (double) 1, (double) 1L, (double) 1, (double) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=0  bidSize: vol = 1.0 delta = 1.0" + "'", str6.equals("id=0  bidSize: vol = 1.0 delta = 1.0"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.contractDetails((int) ' ', contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) ' ', (int) '#', "Next Valid Order ID: 97", (int) (byte) 0, (int) (byte) -1, 1.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1" + "'", str7.equals("updateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (short) 100, "id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str2.equals("FA: null id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (byte) 100, (double) (byte) 10, (double) '#', (double) (byte) -1, (double) 0.0f, (double) 1L, "id=100  unknown=0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 32 =============== end ===============" + "'", str1.equals("reqId = 32 =============== end ==============="));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0" + "'", str1.equals("id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) '4', (int) (byte) 0, contractDetails2, "order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM)", "current time = 10 (Dec 31, 1969 6:00:10 PM)", "", "updateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("FA:", "current time = 10 (Dec 31, 1969 6:00:10 PM)", "MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null", "Connected : The list of managed accounts are : [Connection Closed]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed]" + "'", str4.equals("updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed]"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 32" + "'", str1.equals("Next Valid Order ID: 32"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((int) (short) 100, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("FA: null id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A" + "'", str1.equals("SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97" + "'", str1.equals("updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 0" + "'", str1.equals("Next Valid Order ID: 0"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 35 =============== end ===============" + "'", str1.equals("reqId = 35 =============== end ==============="));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) 'a', (int) (short) 10, (double) (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=97  bidOptComp=-1.0" + "'", str3.equals("id=97  bidOptComp=-1.0"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("id = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 10 =============== end ===============" + "'", str1.equals("id = 10 =============== end ==============="));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) 'a', 0L, (double) (short) 0, (double) (short) -1, (double) '4', (double) 0, 1L, 0.0d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0" + "'", str9.equals("id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.tickEFP((int) '4', (int) 'a', (double) 10, "hi!", (double) (short) 10, 0, "id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0", (double) (short) -1, (double) (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0" + "'", str9.equals("id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=0 =============== end ===============" + "'", str1.equals("id=0 =============== end ==============="));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 97 =============== end ===============" + "'", str1.equals("id = 97 =============== end ==============="));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth((int) (short) 1, 10, (int) 'a', (int) (byte) 0, (double) (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 1 10 97 0 -1.0 100" + "'", str6.equals("updateMktDepth: 1 10 97 0 -1.0 100"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (byte) 10, (int) '4', (double) 10L);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  unknown=10.0" + "'", str3.equals("id=10  unknown=10.0"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) 'a', contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(100, (int) (byte) 0, "id=52  unknown: vol = 10.0 delta = N/A", "id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A" + "'", str4.equals("MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0" + "'", str1.equals("SCANNER PARAMETERS:\nid=32 time = 10 open=10.0 high=10.0 low=35.0 close=100.0 volume=1 count=1 WAP=10.0"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(0, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=1 =============== end ===============" + "'", str1.equals("id=1 =============== end ==============="));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 10 =============== end ===============" + "'", str1.equals("reqId = 10 =============== end ==============="));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (byte) -1, "id=1  bidSize=35");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null id=1  bidSize=35" + "'", str2.equals("FA: null id=1  bidSize=35"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 97 (Dec 31, 1969 6:01:37 PM)" + "'", str1.equals("current time = 97 (Dec 31, 1969 6:01:37 PM)"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("updateMktDepth: 1 10 97 0 -1.0 100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100" + "'", str1.equals("SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error(0, 100, "current time = 10 (Dec 31, 1969 6:00:10 PM)");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 | 100 | current time = 10 (Dec 31, 1969 6:00:10 PM)" + "'", str3.equals("0 | 100 | current time = 10 (Dec 31, 1969 6:00:10 PM)"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) (short) 100, 0, "MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", 0, (int) (byte) -1, (double) 1L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 100 0 MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== 0 -1 1.0 0" + "'", str7.equals("updateMktDepth: 100 0 MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== 0 -1 1.0 0"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (byte) 10, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  bidSize=1" + "'", str3.equals("id=10  bidSize=1"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) 'a', (int) (byte) 100, (double) 100L, (double) '4', (double) 1L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=97  unknown: vol = 100.0 delta = N/A" + "'", str6.equals("id=97  unknown: vol = 100.0 delta = N/A"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData(100, "id=0  bidSize: vol = 1.0 delta = 1.0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0" + "'", str2.equals("id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) (short) 10, (int) (short) 100, contractDetails2, "accountDownloadEnd: id=100  unknown=0.0", "reqId = 10 =============== end ===============", "id=97  unknown: vol = 100.0 delta = N/A", "updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) '4', 0, (double) 1L, 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=52  bidSize=1.0  canAutoExecute" + "'", str4.equals("id=52  bidSize=1.0  canAutoExecute"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) 'a', (int) (byte) 100, contractDetails2, "updateMktDepth: 10 -1 100 1 10.0 10", "order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM)", "order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", "100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (short) 100, (double) 1.0f, (double) (short) 1, (double) 1, (double) 'a', (double) 0, "updateMktDepth: 10 -1 100 1 10.0 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData((int) (short) 100, "updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed]", 0.0d, (double) 0.0f, (double) (short) 100, 100.0d, (int) (short) 0, (int) '#', (double) 10.0f, true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=100 date = updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed] open=0.0 high=0.0 low=100.0 close=100.0 volume=0 count=35 WAP=10.0 hasGaps=true" + "'", str10.equals("id=100 date = updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed] open=0.0 high=0.0 low=100.0 close=100.0 volume=0 count=35 WAP=10.0 hasGaps=true"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) '4', "Next Valid Order ID: 0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 52 len = 22\nNext Valid Order ID: 0" + "'", str2.equals("id  = 52 len = 22\nNext Valid Order ID: 0"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id=0  bidPrice=");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid=0  bidPrice=" + "'", str1.equals("SCANNER PARAMETERS:\nid=0  bidPrice="));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) '#', (long) ' ', (double) ' ', (double) 0, (double) ' ', 0.0d, 0L, 10.0d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0" + "'", str9.equals("id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId(10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 10" + "'", str1.equals("Next Valid Order ID: 10"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("updateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nupdateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1" + "'", str1.equals("SCANNER PARAMETERS:\nupdateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (byte) 1, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation(100, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(100, (int) (byte) -1, contractDetails2, "current time = 10 (Dec 31, 1969 6:00:10 PM)", "current time = 35 (Dec 31, 1969 6:00:35 PM)", "id=10  bidSize=1", "32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (byte) 10, "FA: null id=10  bidSize: vol = 0.0 delta = N/A", (int) (byte) 0, 1, (double) 0.0f, (int) 'a', (int) (short) 100, (double) 100.0f, 10, "100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=10 clientId=10 permId=97 status=FA: null id=10  bidSize: vol = 0.0 delta = N/A filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=100 whyHeld=100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A" + "'", str10.equals("order status: orderId=10 clientId=10 permId=97 status=FA: null id=10  bidSize: vol = 0.0 delta = N/A filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=100 whyHeld=100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (short) -1, (int) (byte) -1, "id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=-1  unknown=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0" + "'", str3.equals("id=-1  unknown=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0"));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("reqId = 97 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: reqId = 97 =============== end ===============" + "'", str1.equals("accountDownloadEnd: reqId = 97 =============== end ==============="));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=0 =============== end ===============" + "'", str1.equals("id=0 =============== end ==============="));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error(100, 1, "SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A" + "'", str3.equals("100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (short) 1, 0, (double) 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  bidSize=10.0" + "'", str3.equals("id=1  bidSize=10.0"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (byte) -1, 0, "SCANNER PARAMETERS:\nFA: GROUPS hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!" + "'", str3.equals("-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false", "Connected : The list of managed accounts are : [Connection Closed]", "id=10  bidSize: vol = 0.0 delta = N/A", "");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A " + "'", str4.equals("updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A "));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) ' ', contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (byte) 1, (int) (byte) 1, "updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10", "SCANNER PARAMETERS:\nid=0  bidPrice=");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=1 :: MsgType=1 :: Origin=SCANNER PARAMETERS:\nid=0  bidPrice= :: Message=updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10" + "'", str4.equals("MsgId=1 :: MsgType=1 :: Origin=SCANNER PARAMETERS:\nid=0  bidPrice= :: Message=updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0" + "'", str1.equals("accountDownloadEnd: MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("id=100  unknown=0.0", "id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0", "", "id=1 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: id=100  unknown=0.0 id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0  id=1 =============== end ===============" + "'", str4.equals("updateAccountValue: id=100  unknown=0.0 id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0  id=1 =============== end ==============="));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (short) 100, "updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97", (int) (byte) -1, (int) '#', (double) 0.0f, (int) (byte) -1, (int) (byte) 10, (double) (byte) 100, (int) (short) 100, "10 | -1 | ");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=100 clientId=100 permId=-1 status=updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 filled=-1 remaining=35 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=10 whyHeld=10 | -1 | " + "'", str10.equals("order status: orderId=100 clientId=100 permId=-1 status=updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 filled=-1 remaining=35 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=10 whyHeld=10 | -1 | "));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 35" + "'", str1.equals("Next Valid Order ID: 35"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder(1, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric(100, (-1), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  unknown=-1.0" + "'", str3.equals("id=100  unknown=-1.0"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("FA: null id=1  bidSize=35");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FA: null id=1  bidSize=35" + "'", str1.equals("FA: null id=1  bidSize=35"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("id=97  bidOptComp=-1.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: id=97  bidOptComp=-1.0" + "'", str1.equals("accountDownloadEnd: id=97  bidOptComp=-1.0"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (short) 0, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA(0, "updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10" + "'", str2.equals("FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (-1), (double) (byte) 10, (double) (-1.0f), 0.0d, (double) (-1L), (double) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (byte) -1, (long) ' ', (double) ' ', (double) 100, (double) 0.0f, (double) 0L, (long) 1, (double) 10.0f, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1 time = 32 open=32.0 high=100.0 low=0.0 close=0.0 volume=1 count=1 WAP=10.0" + "'", str9.equals("id=-1 time = 32 open=32.0 high=100.0 low=0.0 close=0.0 volume=1 count=1 WAP=10.0"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((-1), 1, (double) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=-1  bidPrice=10.0  noAutoExecute" + "'", str4.equals("id=-1  bidPrice=10.0  noAutoExecute"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("id=100  bidExch: vol = 1.0 delta = N/A", "FA: null id=1  bidSize=35", "FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A", "id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0" + "'", str4.equals("updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("hi!", "", "id  = 52 len = 22\nNext Valid Order ID: 0", "");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: hi!  id  = 52 len = 22\nNext Valid Order ID: 0 " + "'", str4.equals("updateAccountValue: hi!  id  = 52 len = 22\nNext Valid Order ID: 0 "));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: id = 100 =============== end ===============" + "'", str1.equals("accountDownloadEnd: id = 100 =============== end ==============="));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("id=-1  unknown=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=-1  unknown=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0" + "'", str1.equals("id=-1  unknown=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A]" + "'", str1.equals("Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A]"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.contractDetails((int) 'a', contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (short) 10, "Next Valid Order ID: 10");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 10 len = 23\nNext Valid Order ID: 10" + "'", str2.equals("id  = 10 len = 23\nNext Valid Order ID: 10"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(100, (-1), (double) 0L, (double) 0L, (-1.0d), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=100  unknown: vol = 0.0 delta = 0.0" + "'", str6.equals("id=100  unknown: vol = 0.0 delta = 0.0"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error(0, (int) (byte) 10, "reqId = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 | 10 | reqId = 100 =============== end ===============" + "'", str3.equals("0 | 10 | reqId = 100 =============== end ==============="));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (byte) 100, (int) ' ', "id=1  unknown=1.0  noAutoExecute", "id = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute" + "'", str4.equals("MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((int) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=0 =============== end ===============" + "'", str1.equals("id=0 =============== end ==============="));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric(0, (int) (byte) 1, (double) 10L);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=0  bidPrice=10.0" + "'", str3.equals("id=0  bidPrice=10.0"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((-1), "Connected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str2.equals("id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime(100L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 100 (Dec 31, 1969 6:01:40 PM)" + "'", str1.equals("current time = 100 (Dec 31, 1969 6:01:40 PM)"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData((int) '#', "", (double) (byte) 1, 0.0d, (double) 1L, (double) 1.0f, (int) (byte) 0, (int) (short) -1, 100.0d, true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=35 date =  open=1.0 high=0.0 low=1.0 close=1.0 volume=0 count=-1 WAP=100.0 hasGaps=true" + "'", str10.equals("id=35 date =  open=1.0 high=0.0 low=1.0 close=1.0 volume=0 count=-1 WAP=100.0 hasGaps=true"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("reqId = -1 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [reqId = -1 =============== end ===============]" + "'", str1.equals("Connected : The list of managed accounts are : [reqId = -1 =============== end ===============]"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (short) -1, 10L, (double) 10, (double) 0, (double) (byte) -1, (double) 0, (long) (short) 0, (double) 100L, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0" + "'", str9.equals("id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (short) 0, (int) (byte) -1, "id=100  bidSize=100", "id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100" + "'", str4.equals("MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar(1, (long) (byte) 10, (double) (byte) 0, (double) (-1), (double) 10L, 1.0d, (long) (short) 10, (double) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=1 time = 10 open=0.0 high=-1.0 low=10.0 close=1.0 volume=10 count=10 WAP=100.0" + "'", str9.equals("id=1 time = 10 open=0.0 high=-1.0 low=10.0 close=1.0 volume=10 count=10 WAP=100.0"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (short) -1, (double) ' ', (double) 0, (double) (short) 100, (double) 10L, (double) 100L, "id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice(10, (int) 'a', (double) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=10  unknown=52.0  canAutoExecute" + "'", str4.equals("id=10  unknown=52.0  canAutoExecute"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 0 =============== end ===============" + "'", str1.equals("reqId = 0 =============== end ==============="));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100" + "'", str1.equals("accountDownloadEnd: MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (byte) 1, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails(10, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((-1));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=-1 =============== end ===============" + "'", str1.equals("id=-1 =============== end ==============="));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(10, (int) (byte) 100, "reqId = 35 =============== end ===============", "MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ===============" + "'", str4.equals("MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ==============="));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error(10, (-1), "-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10 | -1 | -1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!" + "'", str3.equals("10 | -1 | -1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (byte) 100, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (byte) 10, (int) '4', (-1.0d));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  unknown=-1.0" + "'", str3.equals("id=10  unknown=-1.0"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (short) 10, 0, "Next Valid Order ID: 0");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  bidSize=Next Valid Order ID: 0" + "'", str3.equals("id=10  bidSize=Next Valid Order ID: 0"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("id  = 52 len = 22\nNext Valid Order ID: 0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: id  = 52 len = 22\nNext Valid Order ID: 0" + "'", str1.equals("updateAccountTime: id  = 52 len = 22\nNext Valid Order ID: 0"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("id=52  bidOptComp=-1.0  noAutoExecute");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: id=52  bidOptComp=-1.0  noAutoExecute" + "'", str1.equals("accountDownloadEnd: id=52  bidOptComp=-1.0  noAutoExecute"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId(100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 100" + "'", str1.equals("Next Valid Order ID: 100"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0" + "'", str1.equals("id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) (byte) 100, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str1.equals("SCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]" + "'", str1.equals("Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (short) 10, "", (int) '#', (int) ' ', (double) 1, (int) (byte) 1, (int) (byte) 0, (double) (short) 1, (int) (short) 100, "SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=10 clientId=100 permId=1 status= filled=35 remaining=32 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=0 whyHeld=SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100" + "'", str10.equals("order status: orderId=10 clientId=100 permId=1 status= filled=35 remaining=32 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=0 whyHeld=SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) '#', (int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=35  unknown=100" + "'", str3.equals("id=35  unknown=100"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error(100, 1, "MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100 | 1 | MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute" + "'", str3.equals("100 | 1 | MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(0, (int) '#', contractDetails2, "id = 97 =============== end ===============", "id=1 time = 10 open=0.0 high=-1.0 low=10.0 close=1.0 volume=10 count=10 WAP=100.0", "100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A", "id=100 date = updateAccountValue: FA: current time = 10 (Dec 31, 1969 6:00:10 PM) MsgId=97 :: MsgType=-1 :: Origin=reqId = 100 =============== end =============== :: Message=Error - null Connected : The list of managed accounts are : [Connection Closed] open=0.0 high=0.0 low=100.0 close=100.0 volume=0 count=35 WAP=10.0 hasGaps=true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData(10, "updateAccountValue: hi!  id  = 52 len = 22\nNext Valid Order ID: 0 ");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 10 len = 66\nupdateAccountValue: hi!  id  = 52 len = 22\nNext Valid Order ID: 0 " + "'", str2.equals("id  = 10 len = 66\nupdateAccountValue: hi!  id  = 52 len = 22\nNext Valid Order ID: 0 "));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.tickEFP(0, (int) (short) 1, (double) (short) -1, "updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0", (double) '#', (int) (byte) -1, "id=35  unknown=100", (double) 1L, (double) 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=0  bidPrice: basisPoints = -1.0/updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0 impliedFuture = 35.0 holdDays = -1 futureExpiry = id=35  unknown=100 dividendImpact = 1.0 dividends to expiry = 10.0" + "'", str9.equals("id=0  bidPrice: basisPoints = -1.0/updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0 impliedFuture = 35.0 holdDays = -1 futureExpiry = id=35  unknown=100 dividendImpact = 1.0 dividends to expiry = 10.0"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (byte) 0, "id=-1 =============== end ===============", (int) (byte) 100, (int) (byte) 10, (double) 'a', (int) (byte) 0, (int) (short) 1, (double) 1.0f, 100, "FA: GROUPS hi!");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=0 clientId=100 permId=0 status=id=-1 =============== end =============== filled=100 remaining=10 avgFillPrice=97.0 lastFillPrice=1.0 parent Id=1 whyHeld=FA: GROUPS hi!" + "'", str10.equals("order status: orderId=0 clientId=100 permId=0 status=id=-1 =============== end =============== filled=100 remaining=10 avgFillPrice=97.0 lastFillPrice=1.0 parent Id=1 whyHeld=FA: GROUPS hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(100, (int) (byte) 0, contractDetails2, "updateAccountTime: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false", "updateMktDepth: 32 35 Next Valid Order ID: 97 0 -1 1.0 1", "id=35  unknown=100", "0 | 52 | 10 | -1 | ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(1, 100, "accountDownloadEnd: reqId = 97 =============== end ===============", "accountDownloadEnd: id=97  bidOptComp=-1.0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=1 :: MsgType=100 :: Origin=accountDownloadEnd: id=97  bidOptComp=-1.0 :: Message=accountDownloadEnd: reqId = 97 =============== end ===============" + "'", str4.equals("MsgId=1 :: MsgType=100 :: Origin=accountDownloadEnd: id=97  bidOptComp=-1.0 :: Message=accountDownloadEnd: reqId = 97 =============== end ==============="));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (short) 10, (-1), 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  unknown=10" + "'", str3.equals("id=10  unknown=10"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, 1, (double) (byte) 0, (double) '4', (double) (byte) 10, (-1.0d), (double) (-1.0f), "FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, 1, 0.0d, 0.0d, 100.0d, (double) (short) 100, (-1.0d), "id=1 date = id=1  unknown=1.0  noAutoExecute open=32.0 high=35.0 low=1.0 close=0.0 volume=-1 count=97 WAP=35.0 hasGaps=false");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) ' ', (int) (short) 10, 0.0d, (double) 100L, (double) 0.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=32  bidOptComp: vol = 0.0 delta = N/A" + "'", str6.equals("id=32  bidOptComp: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails(0, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str1.equals("updateAccountTime: id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = 1 =============== end ===============" + "'", str1.equals("id = 1 =============== end ==============="));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) ' ', (int) (byte) 1, "id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0", (int) (byte) 0, (int) (byte) 10, (double) '4', 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 32 1 id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0 0 10 52.0 1" + "'", str7.equals("updateMktDepth: 32 1 id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0 0 10 52.0 1"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus(0, "id=52  bidSize=1.0  canAutoExecute", 1, (int) (short) -1, (double) ' ', (int) (short) 1, (int) (byte) -1, (double) 1, (int) '4', "100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=0 clientId=52 permId=1 status=id=52  bidSize=1.0  canAutoExecute filled=1 remaining=-1 avgFillPrice=32.0 lastFillPrice=1.0 parent Id=-1 whyHeld=100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A" + "'", str10.equals("order status: orderId=0 clientId=52 permId=1 status=id=52  bidSize=1.0  canAutoExecute filled=1 remaining=-1 avgFillPrice=32.0 lastFillPrice=1.0 parent Id=-1 whyHeld=100 | 1 | SCANNER PARAMETERS:\nFA: null id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("MsgId=1 :: MsgType=100 :: Origin=accountDownloadEnd: id=97  bidOptComp=-1.0 :: Message=accountDownloadEnd: reqId = 97 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [MsgId=1 :: MsgType=100 :: Origin=accountDownloadEnd: id=97  bidOptComp=-1.0 :: Message=accountDownloadEnd: reqId = 97 =============== end ===============]" + "'", str1.equals("Connected : The list of managed accounts are : [MsgId=1 :: MsgType=100 :: Origin=accountDownloadEnd: id=97  bidOptComp=-1.0 :: Message=accountDownloadEnd: reqId = 97 =============== end ===============]"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A " + "'", str1.equals("updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A "));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) (byte) 0, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((int) (short) 0, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((-1), (long) (short) -1, (double) 100, (double) (-1), 10.0d, (double) (byte) 0, 0L, (double) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1 time = -1 open=100.0 high=-1.0 low=10.0 close=0.0 volume=0 count=52 WAP=-1.0" + "'", str9.equals("id=-1 time = -1 open=100.0 high=-1.0 low=10.0 close=0.0 volume=0 count=52 WAP=-1.0"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) (byte) 100, (int) (short) 0, "Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A]", (int) (byte) 100, (int) (short) -1, (double) 1, (-1));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 100 0 Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A] 100 -1 1.0 -1" + "'", str7.equals("updateMktDepth: 100 0 Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A] 100 -1 1.0 -1"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (byte) 1, (long) 10, (double) ' ', (double) (-1), 1.0d, (double) 10, (long) '#', (-1.0d), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=1 time = 10 open=32.0 high=-1.0 low=1.0 close=10.0 volume=35 count=1 WAP=-1.0" + "'", str9.equals("id=1 time = 10 open=32.0 high=-1.0 low=1.0 close=10.0 volume=35 count=1 WAP=-1.0"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("reqId = 35 =============== end ===============", "32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A", "", "id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: reqId = 35 =============== end =============== 32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A  id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0" + "'", str4.equals("updateAccountValue: reqId = 35 =============== end =============== 32 | 10 | FA: null id=10  bidSize: vol = 0.0 delta = N/A  id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (short) -1, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) (short) 100, (int) (byte) 1, (double) (short) 100, (double) 100, (double) (byte) -1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=100  bidPrice: vol = 100.0 delta = N/A" + "'", str6.equals("id=100  bidPrice: vol = 100.0 delta = N/A"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 10" + "'", str1.equals("Next Valid Order ID: 10"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) '#', 10, "id=10  bidSize=1", "reqId = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=35 :: MsgType=10 :: Origin=reqId = 100 =============== end =============== :: Message=id=10  bidSize=1" + "'", str4.equals("MsgId=35 :: MsgType=10 :: Origin=reqId = 100 =============== end =============== :: Message=id=10  bidSize=1"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) 10, 0, 100.0d, 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=10  bidSize=100.0  canAutoExecute" + "'", str4.equals("id=10  bidSize=100.0  canAutoExecute"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (byte) 0, "Next Valid Order ID: 0", 100, (int) (short) 100, (double) 100.0f, (int) (short) 0, (-1), (double) 100L, (-1), "MsgId=100 :: MsgType=1 :: Origin= =============== end =============== :: Message=id = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=0 clientId=-1 permId=0 status=Next Valid Order ID: 0 filled=100 remaining=100 avgFillPrice=100.0 lastFillPrice=100.0 parent Id=-1 whyHeld=MsgId=100 :: MsgType=1 :: Origin= =============== end =============== :: Message=id = 10 =============== end ===============" + "'", str10.equals("order status: orderId=0 clientId=-1 permId=0 status=Next Valid Order ID: 0 filled=100 remaining=100 avgFillPrice=100.0 lastFillPrice=100.0 parent Id=-1 whyHeld=MsgId=100 :: MsgType=1 :: Origin= =============== end =============== :: Message=id = 10 =============== end ==============="));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.historicalData((int) (byte) 10, "accountDownloadEnd: MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0", (double) 10, 100.0d, (double) (short) 0, (double) (-1), 1, 0, (double) 1, false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "id=10 date = accountDownloadEnd: MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0 open=10.0 high=100.0 low=0.0 close=-1.0 volume=1 count=0 WAP=1.0 hasGaps=false" + "'", str10.equals("id=10 date = accountDownloadEnd: MsgId=97 :: MsgType=0 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=id=52  bidSize=10.0 open=10.0 high=100.0 low=0.0 close=-1.0 volume=1 count=0 WAP=1.0 hasGaps=false"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (short) 10, (double) 1, (double) 0.0f, 0.0d, (double) 10, (double) 100, "id = 1 =============== end ===============");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(0, 10, "id  = 52 len = 22\nNext Valid Order ID: 0", "Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=0 :: MsgType=10 :: Origin=Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0] :: Message=id  = 52 len = 22\nNext Valid Order ID: 0" + "'", str4.equals("MsgId=0 :: MsgType=10 :: Origin=Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0] :: Message=id  = 52 len = 22\nNext Valid Order ID: 0"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10]" + "'", str1.equals("Connected : The list of managed accounts are : [FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10]"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=-1 =============== end ===============" + "'", str1.equals("id=-1 =============== end ==============="));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=10  unknown=35" + "'", str3.equals("id=10  unknown=35"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(100, 0, contractDetails2, "id=32  bidOptComp: vol = 0.0 delta = N/A", "MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35", "id=1  bidSize=10.0", "accountDownloadEnd: id=100  unknown=0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("SCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str1.equals("SCANNER PARAMETERS:\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ===============" + "'", str1.equals("MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ==============="));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("reqId = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 10 =============== end ===============" + "'", str1.equals("reqId = 10 =============== end ==============="));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) 1, (int) '#', (double) (-1.0f), (int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=1  auctionPrice=-1.0  canAutoExecute" + "'", str4.equals("id=1  auctionPrice=-1.0  canAutoExecute"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id=1  unknown=1.0  noAutoExecute");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid=1  unknown=1.0  noAutoExecute" + "'", str1.equals("SCANNER PARAMETERS:\nid=1  unknown=1.0  noAutoExecute"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str1.equals("updateAccountTime: SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (short) 0, 10, "order status: orderId=10 clientId=10 permId=97 status=FA: null id=10  bidSize: vol = 0.0 delta = N/A filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=100 whyHeld=100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 | 10 | order status: orderId=10 clientId=10 permId=97 status=FA: null id=10  bidSize: vol = 0.0 delta = N/A filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=100 whyHeld=100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A" + "'", str3.equals("0 | 10 | order status: orderId=10 clientId=10 permId=97 status=FA: null id=10  bidSize: vol = 0.0 delta = N/A filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=100.0 parent Id=100 whyHeld=100 | 0 | id=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (short) 10, (int) (byte) -1, "-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!", "updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A ");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=10 :: MsgType=-1 :: Origin=updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A  :: Message=-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!" + "'", str4.equals("MsgId=10 :: MsgType=-1 :: Origin=updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A  :: Message=-1 | 0 | SCANNER PARAMETERS:\nFA: GROUPS hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) 'a', contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=1 =============== end ===============" + "'", str1.equals("id=1 =============== end ==============="));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (short) 10, (int) (short) 10, (double) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=10  bidOptComp=0.0  canAutoExecute" + "'", str4.equals("id=10  bidOptComp=0.0  canAutoExecute"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) '#', contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id=10  bidSize: vol = 0.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid=10  bidSize: vol = 0.0 delta = N/A" + "'", str1.equals("SCANNER PARAMETERS:\nid=10  bidSize: vol = 0.0 delta = N/A"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (byte) -1, (long) ' ', (double) (short) -1, (double) 0L, (double) (short) 0, (double) 0L, (long) (byte) 0, (double) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1 time = 32 open=-1.0 high=0.0 low=0.0 close=0.0 volume=0 count=1 WAP=10.0" + "'", str9.equals("id=-1 time = 32 open=-1.0 high=0.0 low=0.0 close=0.0 volume=0 count=1 WAP=10.0"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("Next Valid Order ID: 35");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 35" + "'", str1.equals("Next Valid Order ID: 35"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(100, 100, (double) '#', (double) 10.0f, (double) 10L, 0.0d);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=100  unknown: vol = 35.0 delta = N/A" + "'", str6.equals("id=100  unknown: vol = 35.0 delta = N/A"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.ib.client.EWrapperMsgGenerator eWrapperMsgGenerator0 = new com.ib.client.EWrapperMsgGenerator();
        java.lang.Class<?> wildcardClass1 = eWrapperMsgGenerator0.getClass();
        java.lang.Class<?> wildcardClass2 = eWrapperMsgGenerator0.getClass();
        java.lang.Class<?> wildcardClass3 = eWrapperMsgGenerator0.getClass();
        java.lang.Class<?> wildcardClass4 = eWrapperMsgGenerator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 0 (Dec 31, 1969 6:00:00 PM)" + "'", str1.equals("current time = 0 (Dec 31, 1969 6:00:00 PM)"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData(1, 100, contractDetails2, "order status: orderId=10 clientId=100 permId=1 status= filled=35 remaining=32 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=0 whyHeld=SCANNER PARAMETERS:\nupdateMktDepth: 1 10 97 0 -1.0 100", "FA: GROUPS hi!", "MsgId=10 :: MsgType=100 :: Origin=MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute :: Message=reqId = 35 =============== end ===============", "id=10  bidSize: vol = 0.0 delta = N/A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (byte) -1, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (short) 10, "SCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 10 len = 131\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str2.equals("id  = 10 len = 131\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 1 =============== end ===============" + "'", str1.equals("reqId = 1 =============== end ==============="));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (short) -1, "updateMktDepth: 100 0 Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A] 100 -1 1.0 -1");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null updateMktDepth: 100 0 Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A] 100 -1 1.0 -1" + "'", str2.equals("FA: null updateMktDepth: 100 0 Connected : The list of managed accounts are : [MsgId=100 :: MsgType=0 :: Origin=id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=52  unknown: vol = 10.0 delta = N/A] 100 -1 1.0 -1"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (short) -1, "id=100  unknown=-1.0", (int) ' ', (int) (short) 10, (double) 100, 10, (int) ' ', (double) 10, (int) '#', "id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=-1 clientId=35 permId=10 status=id=100  unknown=-1.0 filled=32 remaining=10 avgFillPrice=100.0 lastFillPrice=10.0 parent Id=32 whyHeld=id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0" + "'", str10.equals("order status: orderId=-1 clientId=35 permId=10 status=id=100  unknown=-1.0 filled=32 remaining=10 avgFillPrice=100.0 lastFillPrice=10.0 parent Id=32 whyHeld=id=52  unknown: basisPoints = 10.0/hi! impliedFuture = 10.0 holdDays = 0 futureExpiry = id=-1  bidExch: basisPoints = 100.0/FA: impliedFuture = 100.0 holdDays = 100 futureExpiry = id=-1  unknown=10.0  canAutoExecute dividendImpact = -1.0 dividends to expiry = 0.0 dividendImpact = -1.0 dividends to expiry = -1.0"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("order status: orderId=100 clientId=0 permId=35 status=Error - null filled=100 remaining=0 avgFillPrice=10.0 lastFillPrice=10.0 parent Id=100 whyHeld=id = 10 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\norder status: orderId=100 clientId=0 permId=35 status=Error - null filled=100 remaining=0 avgFillPrice=10.0 lastFillPrice=10.0 parent Id=100 whyHeld=id = 10 =============== end ===============" + "'", str1.equals("SCANNER PARAMETERS:\norder status: orderId=100 clientId=0 permId=35 status=Error - null filled=100 remaining=0 avgFillPrice=10.0 lastFillPrice=10.0 parent Id=100 whyHeld=id = 10 =============== end ==============="));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth((int) (short) 100, 0, 100, (int) (short) 1, (double) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 100 0 100 1 0.0 10" + "'", str6.equals("updateMktDepth: 100 0 100 1 0.0 10"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("updateAccountTime: id  = 52 len = 22\nNext Valid Order ID: 0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [updateAccountTime: id  = 52 len = 22\nNext Valid Order ID: 0]" + "'", str1.equals("Connected : The list of managed accounts are : [updateAccountTime: id  = 52 len = 22\nNext Valid Order ID: 0]"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((-1), underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (byte) 0, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=0  bidSize=-1" + "'", str3.equals("id=0  bidSize=-1"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) (short) 10, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) '#', (int) (byte) 1, "SCANNER PARAMETERS:\nid=0  bidPrice=", "reqId = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=35 :: MsgType=1 :: Origin=reqId = 100 =============== end =============== :: Message=SCANNER PARAMETERS:\nid=0  bidPrice=" + "'", str4.equals("MsgId=35 :: MsgType=1 :: Origin=reqId = 100 =============== end =============== :: Message=SCANNER PARAMETERS:\nid=0  bidPrice="));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder(100, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  bidExch=0" + "'", str3.equals("id=1  bidExch=0"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("reqId = 100 =============== end ===============", "id  = -1 len = 42\nid = 1 =============== end ===============", "id=-1 time = 32 open=-1.0 high=0.0 low=0.0 close=0.0 volume=0 count=1 WAP=10.0", "Next Valid Order ID: 35");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: reqId = 100 =============== end =============== id  = -1 len = 42\nid = 1 =============== end =============== id=-1 time = 32 open=-1.0 high=0.0 low=0.0 close=0.0 volume=0 count=1 WAP=10.0 Next Valid Order ID: 35" + "'", str4.equals("updateAccountValue: reqId = 100 =============== end =============== id  = -1 len = 42\nid = 1 =============== end =============== id=-1 time = 32 open=-1.0 high=0.0 low=0.0 close=0.0 volume=0 count=1 WAP=10.0 Next Valid Order ID: 35"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus(100, "reqId = 10 =============== end ===============", (int) (byte) 0, 1, (double) (byte) 1, (int) 'a', (int) (short) 10, (double) 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=" + "'", str10.equals("order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld="));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) 'a', "SCANNER PARAMETERS:\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]", (int) (short) 10, (int) (byte) 10, 0.0d, (-1), (int) (short) -1, 10.0d, (int) (short) 10, "Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=97 clientId=10 permId=-1 status=SCANNER PARAMETERS:\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============] filled=10 remaining=10 avgFillPrice=0.0 lastFillPrice=10.0 parent Id=-1 whyHeld=Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]" + "'", str10.equals("order status: orderId=97 clientId=10 permId=-1 status=SCANNER PARAMETERS:\nSCANNER PARAMETERS:\nid  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============] filled=10 remaining=10 avgFillPrice=0.0 lastFillPrice=10.0 parent Id=-1 whyHeld=Connected : The list of managed accounts are : [updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0]"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (byte) 0, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateAccountValue("id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0", "id=100  unknown: vol = 0.0 delta = 0.0", "Next Valid Order ID: 97", "updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "updateAccountValue: id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0 id=100  unknown: vol = 0.0 delta = 0.0 Next Valid Order ID: 97 updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!" + "'", str4.equals("updateAccountValue: id=-1 time = 10 open=10.0 high=0.0 low=-1.0 close=0.0 volume=0 count=100 WAP=100.0 id=100  unknown: vol = 0.0 delta = 0.0 Next Valid Order ID: 97 updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(100, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  bidPrice=1" + "'", str3.equals("id=100  bidPrice=1"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth(1, (-1), (int) 'a', (int) (short) 100, 0.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 1 -1 97 100 0.0 1" + "'", str6.equals("updateMktDepth: 1 -1 97 100 0.0 1"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd(0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 0 =============== end ===============" + "'", str1.equals("reqId = 0 =============== end ==============="));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (short) 100, 10, "id=100  unknown=0.0", "current time = 0 (Dec 31, 1969 6:00:00 PM)");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=100 :: MsgType=10 :: Origin=current time = 0 (Dec 31, 1969 6:00:00 PM) :: Message=id=100  unknown=0.0" + "'", str4.equals("MsgId=100 :: MsgType=10 :: Origin=current time = 0 (Dec 31, 1969 6:00:00 PM) :: Message=id=100  unknown=0.0"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!" + "'", str1.equals("FA: null updateAccountValue: MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== FA: GROUPS hi! MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== hi!"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin(0, (int) (short) -1, "order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", "current time = 10 (Dec 31, 1969 6:00:10 PM)");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=0 :: MsgType=-1 :: Origin=current time = 10 (Dec 31, 1969 6:00:10 PM) :: Message=order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str4.equals("MsgId=0 :: MsgType=-1 :: Origin=current time = 10 (Dec 31, 1969 6:00:10 PM) :: Message=order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation(1, (int) (byte) 100, 0.0d, (double) 0L, (double) (byte) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=1  unknown: vol = 0.0 delta = 0.0" + "'", str6.equals("id=1  unknown: vol = 0.0 delta = 0.0"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar(10, (long) ' ', (double) (byte) 10, 100.0d, (double) 10L, (double) 1.0f, 100L, (double) 0.0f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=10 time = 32 open=10.0 high=100.0 low=10.0 close=1.0 volume=100 count=100 WAP=0.0" + "'", str9.equals("id=10 time = 32 open=10.0 high=100.0 low=10.0 close=1.0 volume=100 count=100 WAP=0.0"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("reqId = 0 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: reqId = 0 =============== end ===============" + "'", str1.equals("updateAccountTime: reqId = 0 =============== end ==============="));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=" + "'", str1.equals("updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld="));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth(1, (int) (short) 1, (-1), 1, (double) 10L, 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 1 1 -1 1 10.0 10" + "'", str6.equals("updateMktDepth: 1 1 -1 1 10.0 10"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (byte) 10, (int) (short) 100, "SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", "Connected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=10 :: MsgType=100 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str4.equals("MsgId=10 :: MsgType=100 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) '4', (int) (byte) 10, "current time = 35 (Dec 31, 1969 6:00:35 PM)");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=52  bidOptComp=current time = 35 (Dec 31, 1969 6:00:35 PM)" + "'", str3.equals("id=52  bidOptComp=current time = 35 (Dec 31, 1969 6:00:35 PM)"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) ' ', 1.0d, (double) (byte) 100, 10.0d, (double) 100, (double) (byte) 0, "id=1  bidPrice=-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("Connected : The list of managed accounts are : [FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10]" + "'", str1.equals("Connected : The list of managed accounts are : [FA: null updateMktDepth: 100 1 updateAccountValue: Error - null  id = 100 =============== end =============== Next Valid Order ID: 97 -1 1 -1.0 10]"));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 100 =============== end ===============" + "'", str1.equals("reqId = 100 =============== end ==============="));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Order order2 = null;
        com.ib.client.OrderState orderState3 = null;
        try {
            java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.openOrder((int) (short) 0, contract1, order2, orderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.currentTime((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "current time = 0 (Dec 31, 1969 6:00:00 PM)" + "'", str1.equals("current time = 0 (Dec 31, 1969 6:00:00 PM)"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) 10, 0, (double) 10L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=10  bidSize=10.0  noAutoExecute" + "'", str4.equals("id=10  bidSize=10.0  noAutoExecute"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 1 =============== end ===============" + "'", str1.equals("reqId = 1 =============== end ==============="));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth((int) (short) 10, (int) (byte) 10, (int) '4', (int) (short) 1, (double) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 10 10 52 1 97.0 35" + "'", str6.equals("updateMktDepth: 10 10 52 1 97.0 35"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 52" + "'", str1.equals("Next Valid Order ID: 52"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.tickSnapshotEnd((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id=10 =============== end ===============" + "'", str1.equals("id=10 =============== end ==============="));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.contractDetails((int) (short) 1, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.updateMktDepth((int) (short) 1, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (double) 10L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "updateMktDepth: 1 0 0 10 10.0 0" + "'", str6.equals("updateMktDepth: 1 0 0 10 10.0 0"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric(100, (int) (byte) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  bidOptComp=1.0" + "'", str3.equals("id=100  bidOptComp=1.0"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0" + "'", str1.equals("accountDownloadEnd: updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0"));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (byte) 10, "id=10  bidSize=100.0  canAutoExecute");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 10 len = 36\nid=10  bidSize=100.0  canAutoExecute" + "'", str2.equals("id  = 10 len = 36\nid=10  bidSize=100.0  canAutoExecute"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerParameters("id=0  bidPrice=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SCANNER PARAMETERS:\nid=0  bidPrice=10.0" + "'", str1.equals("SCANNER PARAMETERS:\nid=0  bidPrice=10.0"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar(10, (long) (byte) 0, (double) 0.0f, 0.0d, (double) (short) 10, 100.0d, (long) (short) 0, (double) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=10 time = 0 open=0.0 high=0.0 low=10.0 close=100.0 volume=0 count=0 WAP=-1.0" + "'", str9.equals("id=10 time = 0 open=0.0 high=0.0 low=10.0 close=100.0 volume=0 count=0 WAP=-1.0"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) (byte) 10, (int) (short) 0, (double) (-1), (double) (short) 100, (double) 0.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=10  bidSize: vol = N/A delta = N/A" + "'", str6.equals("id=10  bidSize: vol = N/A delta = N/A"));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35" + "'", str1.equals("updateAccountTime: MsgId=10 :: MsgType=0 :: Origin=Connection Closed :: Message=id=1  bidSize=35"));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 0" + "'", str1.equals("Next Valid Order ID: 0"));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (short) 0, 10L, (double) (-1.0f), (double) 10L, (double) (-1L), (double) '4', (-1L), (double) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=0 time = 10 open=-1.0 high=10.0 low=-1.0 close=52.0 volume=-1 count=10 WAP=-1.0" + "'", str9.equals("id=0 time = 10 open=-1.0 high=10.0 low=-1.0 close=52.0 volume=-1 count=10 WAP=-1.0"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (byte) 100, (int) (byte) -1, "id=100  unknown: vol = 35.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  unknown=id=100  unknown: vol = 35.0 delta = N/A" + "'", str3.equals("id=100  unknown=id=100  unknown: vol = 35.0 delta = N/A"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (byte) 0, "id=10  bidSize: vol = N/A delta = N/A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 0 len = 37\nid=10  bidSize: vol = N/A delta = N/A" + "'", str2.equals("id  = 0 len = 37\nid=10  bidSize: vol = N/A delta = N/A"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (byte) -1, "Connection Closed");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = -1 len = 17\nConnection Closed" + "'", str2.equals("id  = -1 len = 17\nConnection Closed"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.ib.client.Contract contract0 = null;
        try {
            java.lang.String str8 = com.ib.client.EWrapperMsgGenerator.updatePortfolio(contract0, (int) (short) 0, 0.0d, (double) (-1.0f), (-1.0d), (double) (byte) 0, (double) 'a', "id=10  bidOptComp=0.0  canAutoExecute");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("updateAccountTime: id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: updateAccountTime: id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false" + "'", str1.equals("updateAccountTime: updateAccountTime: id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false"));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (byte) 10, (int) '4', "id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10 | 52 | id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str3.equals("10 | 52 | id  = -1 len = 93\nConnected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2(100, 0, "order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM)", (int) (short) 0, (int) (byte) 10, (double) 0, 10);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 100 0 order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM) 0 10 0.0 10" + "'", str7.equals("updateMktDepth: 100 0 order status: orderId=-1 clientId=1 permId=0 status=current time = 35 (Dec 31, 1969 6:00:35 PM) filled=100 remaining=100 avgFillPrice=35.0 lastFillPrice=10.0 parent Id=32 whyHeld=current time = 10 (Dec 31, 1969 6:00:10 PM) 0 10 0.0 10"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A ");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A " + "'", str1.equals("updateAccountTime: updateAccountValue: id=52  unknown=id  = 0 len = 95\nid=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false Connected : The list of managed accounts are : [Connection Closed] id=10  bidSize: vol = 0.0 delta = N/A "));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("Connected : The list of managed accounts are : [id = 100 =============== end ===============]");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: Connected : The list of managed accounts are : [id = 100 =============== end ===============]" + "'", str1.equals("updateAccountTime: Connected : The list of managed accounts are : [id = 100 =============== end ===============]"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) ' ', (int) '#', contractDetails2, "MsgId=0 :: MsgType=-1 :: Origin=id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false :: Message=id=100  bidSize=100", "id=1  auctionPrice=-1.0  canAutoExecute", "id=0  bidPrice=", "id=100  bidPrice=1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA(100, "updateMktDepth: 10 10 52 1 97.0 35");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null updateMktDepth: 10 10 52 1 97.0 35" + "'", str2.equals("FA: null updateMktDepth: 10 10 52 1 97.0 35"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (short) -1, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=-1  bidPrice=" + "'", str3.equals("id=-1  bidPrice="));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.contractDetailsEnd((int) '4');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = 52 =============== end ===============" + "'", str1.equals("reqId = 52 =============== end ==============="));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.updateNewsBulletin((int) (byte) -1, (int) (short) -1, "updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=", "id=1  auctionPrice=-1.0  canAutoExecute");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MsgId=-1 :: MsgType=-1 :: Origin=id=1  auctionPrice=-1.0  canAutoExecute :: Message=updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=" + "'", str4.equals("MsgId=-1 :: MsgType=-1 :: Origin=id=1  auctionPrice=-1.0  canAutoExecute :: Message=updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld="));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=0  bidOptComp=0" + "'", str3.equals("id=0  bidOptComp=0"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.contractDetails(0, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (byte) -1, "current time = 35 (Dec 31, 1969 6:00:35 PM)");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null current time = 35 (Dec 31, 1969 6:00:35 PM)" + "'", str2.equals("FA: null current time = 35 (Dec 31, 1969 6:00:35 PM)"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.scannerDataEnd((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "id = -1 =============== end ===============" + "'", str1.equals("id = -1 =============== end ==============="));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickString((int) (short) 1, (int) (short) 0, "id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=1  bidSize=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0" + "'", str3.equals("id=1  bidSize=id  = 100 len = 36\nid=0  bidSize: vol = 1.0 delta = 1.0"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((-1), (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=-1  unknown=1" + "'", str3.equals("id=-1  unknown=1"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("Next Valid Order ID: 10");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: Next Valid Order ID: 10" + "'", str1.equals("updateAccountTime: Next Valid Order ID: 10"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((-1), "reqId = 52 =============== end ===============", (int) (byte) 0, (int) (short) 1, (double) 100.0f, (int) 'a', (int) (byte) 100, 10.0d, (int) (short) 100, "Next Valid Order ID: 32");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=-1 clientId=100 permId=97 status=reqId = 52 =============== end =============== filled=0 remaining=1 avgFillPrice=100.0 lastFillPrice=10.0 parent Id=100 whyHeld=Next Valid Order ID: 32" + "'", str10.equals("order status: orderId=-1 clientId=100 permId=97 status=reqId = 52 =============== end =============== filled=0 remaining=1 avgFillPrice=100.0 lastFillPrice=10.0 parent Id=100 whyHeld=Next Valid Order ID: 32"));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.ib.client.UnderComp underComp1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.deltaNeutralValidation((int) (short) -1, underComp1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("id=-1 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [id=-1 =============== end ===============]" + "'", str1.equals("Connected : The list of managed accounts are : [id=-1 =============== end ===============]"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (byte) 0, (int) (short) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=0  unknown=-1.0" + "'", str3.equals("id=0  unknown=-1.0"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric(100, (int) (byte) 0, 10.0d);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  bidSize=10.0" + "'", str3.equals("id=100  bidSize=10.0"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) -1, 1, (double) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=-1  bidPrice=10.0  noAutoExecute" + "'", str4.equals("id=-1  bidPrice=10.0  noAutoExecute"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.ib.client.ContractDetails contractDetails2 = null;
        try {
            java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.scannerData((int) (byte) 100, (int) (short) 100, contractDetails2, "SCANNER PARAMETERS:\nFA: GROUPS hi!", "updateMktDepth: 10 10 52 1 97.0 35", "SCANNER PARAMETERS:\nid=0  bidPrice=", "Connection Closed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.tickEFP(100, (-1), (double) (byte) 100, "MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute", (double) (byte) 100, 100, "id=0  bidPrice=", (double) (short) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=100  unknown: basisPoints = 100.0/MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute impliedFuture = 100.0 holdDays = 100 futureExpiry = id=0  bidPrice= dividendImpact = 100.0 dividends to expiry = 10.0" + "'", str9.equals("id=100  unknown: basisPoints = 100.0/MsgId=100 :: MsgType=32 :: Origin=id = 10 =============== end =============== :: Message=id=1  unknown=1.0  noAutoExecute impliedFuture = 100.0 holdDays = 100 futureExpiry = id=0  bidPrice= dividendImpact = 100.0 dividends to expiry = 10.0"));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize(100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=100  unknown=-1" + "'", str3.equals("id=100  unknown=-1"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) '#', 100L, 0.0d, (double) (short) -1, (double) 0L, (double) '4', (long) 100, (double) 100.0f, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=35 time = 100 open=0.0 high=-1.0 low=0.0 close=52.0 volume=100 count=10 WAP=100.0" + "'", str9.equals("id=35 time = 100 open=0.0 high=-1.0 low=0.0 close=52.0 volume=100 count=10 WAP=100.0"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.ib.client.ContractDetails contractDetails1 = null;
        try {
            java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.bondContractDetails((int) (byte) 10, contractDetails1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickSize((int) (short) -1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=-1  bidSize=100" + "'", str3.equals("id=-1  bidSize=100"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) 'a', 10, "id = 10 =============== end ===============", (int) ' ', 100, (double) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 97 10 id = 10 =============== end =============== 32 100 0.0 100" + "'", str7.equals("updateMktDepth: 97 10 id = 10 =============== end =============== 32 100 0.0 100"));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.accountDownloadEnd("accountDownloadEnd: reqId = 97 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "accountDownloadEnd: accountDownloadEnd: reqId = 97 =============== end ===============" + "'", str1.equals("accountDownloadEnd: accountDownloadEnd: reqId = 97 =============== end ==============="));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.tickGeneric((int) (byte) -1, (int) '4', (double) ' ');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "id=-1  unknown=32.0" + "'", str3.equals("id=-1  unknown=32.0"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.nextValidId((int) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Next Valid Order ID: 1" + "'", str1.equals("Next Valid Order ID: 1"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.String str3 = com.ib.client.AnyWrapperMsgGenerator.error((int) (byte) 0, 0, "reqId = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 | 0 | reqId = 100 =============== end ===============" + "'", str3.equals("0 | 0 | reqId = 100 =============== end ==============="));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) 'a', "id=97  unknown: vol = 100.0 delta = N/A");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 97 len = 39\nid=97  unknown: vol = 100.0 delta = N/A" + "'", str2.equals("id  = 97 len = 39\nid=97  unknown: vol = 100.0 delta = N/A"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.updateAccountTime("updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0" + "'", str1.equals("updateAccountTime: updateAccountValue: id=100  bidExch: vol = 1.0 delta = N/A FA: null id=1  bidSize=35 FA: GROUPS id=10  bidSize: vol = 0.0 delta = N/A id=35 time = 32 open=32.0 high=0.0 low=32.0 close=0.0 volume=0 count=1 WAP=10.0"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.lang.String str10 = com.ib.client.EWrapperMsgGenerator.orderStatus((int) (byte) -1, "id=10  unknown=-1.0", (int) (short) 100, (int) (short) 0, (double) 0.0f, (int) (short) 0, (int) (short) 1, (double) 1L, (int) (short) 10, "Next Valid Order ID: 35");
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "order status: orderId=-1 clientId=10 permId=0 status=id=10  unknown=-1.0 filled=100 remaining=0 avgFillPrice=0.0 lastFillPrice=1.0 parent Id=1 whyHeld=Next Valid Order ID: 35" + "'", str10.equals("order status: orderId=-1 clientId=10 permId=0 status=id=10  unknown=-1.0 filled=100 remaining=0 avgFillPrice=0.0 lastFillPrice=1.0 parent Id=1 whyHeld=Next Valid Order ID: 35"));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (byte) 100, "accountDownloadEnd: accountDownloadEnd: reqId = 97 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null accountDownloadEnd: accountDownloadEnd: reqId = 97 =============== end ===============" + "'", str2.equals("FA: null accountDownloadEnd: accountDownloadEnd: reqId = 97 =============== end ==============="));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str6 = com.ib.client.EWrapperMsgGenerator.tickOptionComputation((int) (short) 1, (int) (byte) 0, (double) 10.0f, (double) 100, (double) 0L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "id=1  bidSize: vol = 10.0 delta = N/A" + "'", str6.equals("id=1  bidSize: vol = 10.0 delta = N/A"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String str1 = com.ib.client.AnyWrapperMsgGenerator.error("updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld=" + "'", str1.equals("updateAccountTime: order status: orderId=100 clientId=0 permId=97 status=reqId = 10 =============== end =============== filled=0 remaining=1 avgFillPrice=1.0 lastFillPrice=1.0 parent Id=10 whyHeld="));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (byte) 10, "reqId = 0 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = 10 len = 45\nreqId = 0 =============== end ===============" + "'", str2.equals("id  = 10 len = 45\nreqId = 0 =============== end ==============="));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) (byte) 0, (int) (byte) 10, 0.0d, 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=0  bidOptComp=0.0  canAutoExecute" + "'", str4.equals("id=0  bidOptComp=0.0  canAutoExecute"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str9 = com.ib.client.EWrapperMsgGenerator.realtimeBar((int) (short) -1, (long) (byte) 1, (double) 100.0f, (double) (-1.0f), (double) (byte) 100, (double) (byte) 100, 10L, (double) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "id=-1 time = 1 open=100.0 high=-1.0 low=100.0 close=100.0 volume=10 count=1 WAP=10.0" + "'", str9.equals("id=-1 time = 1 open=100.0 high=-1.0 low=100.0 close=100.0 volume=10 count=1 WAP=10.0"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.ib.client.Contract contract1 = null;
        com.ib.client.Execution execution2 = null;
        try {
            java.lang.String str3 = com.ib.client.EWrapperMsgGenerator.execDetails((int) (byte) -1, contract1, execution2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.fundamentalData((int) (short) -1, "id=10  unknown=-1.0");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "id  = -1 len = 19\nid=10  unknown=-1.0" + "'", str2.equals("id  = -1 len = 19\nid=10  unknown=-1.0"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false]" + "'", str1.equals("Connected : The list of managed accounts are : [id=0 date = hi! open=35.0 high=-1.0 low=0.0 close=1.0 volume=52 count=1 WAP=100.0 hasGaps=false]"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.String str7 = com.ib.client.EWrapperMsgGenerator.updateMktDepthL2((int) '#', 1, "MsgId=10 :: MsgType=100 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============", (int) (byte) 100, 0, (double) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "updateMktDepth: 35 1 MsgId=10 :: MsgType=100 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== 100 0 100.0 32" + "'", str7.equals("updateMktDepth: 35 1 MsgId=10 :: MsgType=100 :: Origin=Connected : The list of managed accounts are : [id = 100 =============== end ===============] :: Message=SCANNER PARAMETERS:\nMsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end =============== 100 0 100.0 32"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String str4 = com.ib.client.EWrapperMsgGenerator.tickPrice((int) '4', (int) (short) 0, (double) 100L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "id=52  bidSize=100.0  canAutoExecute" + "'", str4.equals("id=52  bidSize=100.0  canAutoExecute"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.execDetailsEnd((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "reqId = -1 =============== end ===============" + "'", str1.equals("reqId = -1 =============== end ==============="));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.String str1 = com.ib.client.EWrapperMsgGenerator.managedAccounts("id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Connected : The list of managed accounts are : [id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0]" + "'", str1.equals("Connected : The list of managed accounts are : [id=97 time = 0 open=0.0 high=-1.0 low=52.0 close=0.0 volume=1 count=0 WAP=0.0]"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String str2 = com.ib.client.EWrapperMsgGenerator.receiveFA((int) (byte) 10, "MsgId=0 :: MsgType=-1 :: Origin=current time = 10 (Dec 31, 1969 6:00:10 PM) :: Message=order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FA: null MsgId=0 :: MsgType=-1 :: Origin=current time = 10 (Dec 31, 1969 6:00:10 PM) :: Message=order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ===============" + "'", str2.equals("FA: null MsgId=0 :: MsgType=-1 :: Origin=current time = 10 (Dec 31, 1969 6:00:10 PM) :: Message=order status: orderId=97 clientId=10 permId=1 status=reqId = 97 =============== end =============== filled=100 remaining=100 avgFillPrice=1.0 lastFillPrice=10.0 parent Id=10 whyHeld=MsgId=1 :: MsgType=100 :: Origin=Connection Closed :: Message=id = 100 =============== end ==============="));
    }
}

