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
        int int0 = com.ib.client.EClientSocket.GROUPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = com.ib.client.EClientSocket.faMsgTypeName((-1));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = com.ib.client.EClientSocket.ALIASES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelMktData((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelRealTimeBars((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.ExecutionFilter executionFilter2 = null;
        try {
            eClientSocket0.reqExecutions((int) (short) -1, executionFilter2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqCurrentTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.exerciseOptions(0, contract2, 0, 1, "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        com.ib.client.Order order3 = null;
        try {
            eClientSocket0.placeOrder((int) (short) 1, contract2, order3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelRealTimeBars((int) '4');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.eConnect("", (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqScannerParameters();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        com.ib.client.Order order3 = null;
        try {
            eClientSocket0.placeOrder((int) (byte) 10, contract2, order3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelNewsBulletins();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelScannerSubscription((int) '#');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = com.ib.client.EClientSocket.PROFILES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqFundamentalData((int) (short) 0, contract2, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.ExecutionFilter executionFilter3 = null;
        try {
            eClientSocket0.reqExecutions(0, executionFilter3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelScannerSubscription(0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqHistoricalData((int) (byte) 100, contract3, "", "hi!", "hi!", "", 0, 2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelOrder(10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqRealTimeBars((int) (byte) -1, contract3, 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelOrder(3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            java.io.DataInputStream dataInputStream2 = eClientSocket0.dataInputStream();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqFundamentalData((int) (byte) 1, contract3, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelNewsBulletins();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqContractDetails((int) '4', contract2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.replaceFA((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAutoOpenOrders(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqContractDetails((int) (byte) 0, contract3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelHistoricalData(100);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            java.lang.String str1 = eClientSocket0.TwsConnectionTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqNewsBulletins(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelMktDepth((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelMktData(3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqFundamentalData((int) '4', contract2, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAccountUpdates(false, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelMktData((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelOrder(1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.exerciseOptions(3, contract2, (int) (byte) 10, (int) 'a', "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            java.lang.String str3 = eClientSocket0.TwsConnectionTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.reqContractDetails((int) (byte) -1, contract4);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.ScannerSubscription scannerSubscription3 = null;
        try {
            eClientSocket0.reqScannerSubscription((int) (short) -1, scannerSubscription3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        com.ib.client.Order order3 = null;
        try {
            eClientSocket0.placeOrder((int) (short) 0, contract2, order3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            int int3 = eClientSocket0.serverVersion();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqIds(3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelHistoricalData((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqScannerParameters();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqFundamentalData((int) (short) 10, contract2, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.requestFA((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.ScannerSubscription scannerSubscription2 = null;
        try {
            eClientSocket0.reqScannerSubscription((int) (short) 100, scannerSubscription2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.replaceFA(3, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelNewsBulletins();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelScannerSubscription((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        com.ib.client.ExecutionFilter executionFilter4 = null;
        try {
            eClientSocket0.reqExecutions((int) (byte) -1, executionFilter4);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = com.ib.client.EClientSocket.faMsgTypeName(3);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ALIASES" + "'", str1.equals("ALIASES"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAccountUpdates(true, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqRealTimeBars((-1), contract3, (int) '#', "hi!", false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelFundamentalData(0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqAutoOpenOrders(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract3 = null;
        com.ib.client.Order order4 = null;
        try {
            eClientSocket0.placeOrder((int) (byte) 1, contract3, order4);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqMktData((int) (short) 10, contract3, "ALIASES", true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract3 = null;
        com.ib.client.Order order4 = null;
        try {
            eClientSocket0.placeOrder((int) (short) 1, contract3, order4);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqIds((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqHistoricalData((int) (byte) 10, contract3, "ALIASES", "hi!", "", "ALIASES", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.exerciseOptions((int) (short) 0, contract3, (int) '4', 2, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelRealTimeBars(10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqNewsBulletins(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqAccountUpdates(false, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            int int1 = eClientSocket0.serverVersion();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelMktDepth((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.requestFA((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqNewsBulletins(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqCurrentTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.reqRealTimeBars((int) (byte) 10, contract4, 1, "ALIASES", false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            java.io.DataInputStream dataInputStream3 = eClientSocket0.dataInputStream();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str1 = com.ib.client.EClientSocket.faMsgTypeName(1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GROUPS" + "'", str1.equals("GROUPS"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            java.lang.String str2 = eClientSocket0.TwsConnectionTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelRealTimeBars((-1));
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqMktDepth((int) (byte) -1, contract2, 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqFundamentalData((int) (short) 10, contract2, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelOrder((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelMktDepth((int) '4');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqCurrentTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqFundamentalData((int) 'a', contract3, "ALIASES");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.exerciseOptions((int) (short) 0, contract4, (int) (byte) 10, (int) (short) 1, "", 2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            java.io.DataInputStream dataInputStream4 = eClientSocket0.dataInputStream();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            int int2 = eClientSocket0.serverVersion();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAccountUpdates(false, "GROUPS");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelHistoricalData(3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            int int2 = eClientSocket0.serverVersion();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelHistoricalData((int) '#');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.cancelNewsBulletins();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str1 = com.ib.client.EClientSocket.faMsgTypeName((int) ' ');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            java.io.DataInputStream dataInputStream3 = eClientSocket0.dataInputStream();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqIds((int) 'a');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.reqMktData((int) (byte) 1, contract4, "", false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelFundamentalData((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqHistoricalData((int) 'a', contract3, "hi!", "GROUPS", "", "", (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelMktDepth(2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqIds((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAutoOpenOrders(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqRealTimeBars((int) (byte) 10, contract3, (int) ' ', "ALIASES", false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.reqMktDepth(2, contract4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelRealTimeBars((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        com.ib.client.Contract contract5 = null;
        try {
            eClientSocket0.reqContractDetails((int) (short) 0, contract5);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAccountUpdates(true, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelMktDepth(0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqAccountUpdates(true, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        com.ib.client.ExecutionFilter executionFilter5 = null;
        try {
            eClientSocket0.reqExecutions((int) '#', executionFilter5);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        com.ib.client.Contract contract2 = null;
        try {
            eClientSocket0.reqHistoricalData(0, contract2, "", "hi!", "", "ALIASES", 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        com.ib.client.Contract contract4 = null;
        com.ib.client.Order order5 = null;
        try {
            eClientSocket0.placeOrder(0, contract4, order5);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelHistoricalData((-1));
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqManagedAccts();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAccountUpdates(true, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.eConnect("GROUPS", (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: GROUPS");
        } catch (java.net.UnknownHostException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.replaceFA((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            java.io.DataInputStream dataInputStream3 = eClientSocket0.dataInputStream();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqHistoricalData((int) 'a', contract3, "ALIASES", "hi!", "GROUPS", "", 10, 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelMktData((-1));
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelMktData((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract6 = null;
        try {
            eClientSocket0.reqRealTimeBars((int) (byte) 1, contract6, (int) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        com.ib.client.ScannerSubscription scannerSubscription5 = null;
        try {
            eClientSocket0.reqScannerSubscription((int) (short) -1, scannerSubscription5);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.replaceFA(0, "");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.eConnect("GROUPS", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: GROUPS");
        } catch (java.net.UnknownHostException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqNewsBulletins(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqContractDetails((int) (byte) 100, contract3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelRealTimeBars(0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqNewsBulletins(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract5 = null;
        try {
            eClientSocket0.reqMktDepth((int) (short) 0, contract5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelHistoricalData((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqAutoOpenOrders(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract6 = null;
        com.ib.client.Order order7 = null;
        try {
            eClientSocket0.placeOrder(1, contract6, order7);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelOrder((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelOrder((int) '4');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract5 = null;
        try {
            eClientSocket0.reqMktDepth((int) (short) -1, contract5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelOrder(0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelRealTimeBars((int) '4');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.replaceFA((int) (byte) 100, "ALIASES");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        com.ib.client.ExecutionFilter executionFilter3 = null;
        try {
            eClientSocket0.reqExecutions((int) (byte) 1, executionFilter3);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAllOpenOrders();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        com.ib.client.Contract contract4 = null;
        try {
            eClientSocket0.reqMktDepth((int) (byte) 1, contract4, 2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqIds((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str1 = com.ib.client.EClientSocket.faMsgTypeName((int) '#');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelMktDepth(2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqNewsBulletins(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass4 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqCurrentTime();
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        com.ib.client.Contract contract5 = null;
        try {
            eClientSocket0.exerciseOptions((int) '4', contract5, (int) (byte) 1, 0, "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        com.ib.client.Contract contract6 = null;
        try {
            eClientSocket0.reqFundamentalData((int) (short) -1, contract6, "GROUPS");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelMktDepth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass4 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqNewsBulletins(true);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAccountUpdates(false, "ALIASES");
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqIds((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqIds(2);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.cancelHistoricalData((int) 'a');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass4 = eClientSocket0.getClass();
        try {
            eClientSocket0.cancelOrder((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        com.ib.client.Contract contract3 = null;
        try {
            eClientSocket0.reqMktDepth((int) '#', contract3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        try {
            eClientSocket0.reqIds((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        boolean boolean2 = eClientSocket0.isConnected();
        java.lang.Class<?> wildcardClass3 = eClientSocket0.getClass();
        try {
            eClientSocket0.reqIds((int) ' ');
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        boolean boolean1 = eClientSocket0.isConnected();
        try {
            eClientSocket0.cancelFundamentalData(1);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.eDisconnect();
        eClientSocket0.eDisconnect();
        try {
            eClientSocket0.reqAutoOpenOrders(false);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        boolean boolean3 = eClientSocket0.isConnected();
        try {
            eClientSocket0.reqIds(100);
            org.junit.Assert.fail("Expected exception of type com.ib.client.EException; message: Not connected [id = -1, errorCode = 504]");
        } catch (com.ib.client.EException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.eDisconnect();
        boolean boolean2 = eClientSocket0.isConnected();
        try {
            eClientSocket0.eConnect("ALIASES", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ALIASES");
        } catch (java.net.UnknownHostException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

