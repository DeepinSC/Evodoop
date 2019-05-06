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
        int int0 = com.ib.client.EException.NO_VALID_CODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (byte) 1, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(0, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.ib.client.EException eException3 = new com.ib.client.EException(52, 10, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException12.getSuppressed();
        java.lang.Class<?> wildcardClass17 = throwableArray16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        int int5 = eException3.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = throwableArray13.getClass();
        java.lang.Class<?> wildcardClass15 = throwableArray13.getClass();
        java.lang.Class<?> wildcardClass16 = throwableArray13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 0, "");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 0, "");
        int int4 = eException3.getErrorCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 100, 100, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) 'a', codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        int int10 = eException8.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass11 = eException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (byte) 100, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.String str11 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str11.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (short) 1, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray14 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (short) 0, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        int int4 = eException3.getErrorCode();
        int int5 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray6 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (short) 100, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException12.getSuppressed();
        java.lang.Throwable throwable17 = null;
        try {
            eException12.addSuppressed(throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.String str16 = eException12.toString();
        java.lang.String str17 = eException12.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str16.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str17.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 100, "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((-1), codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        java.lang.String str15 = eException3.toString();
        java.lang.Throwable[] throwableArray16 = eException3.getSuppressed();
        int int17 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str15.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        int int16 = eException3.getErrorCode();
        int int17 = eException3.getId();
        int int18 = eException3.getId();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (byte) -1, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(10, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Class<?> wildcardClass14 = eException7.getClass();
        java.lang.Throwable[] throwableArray15 = eException7.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException7.getSuppressed();
        java.lang.Throwable[] throwableArray17 = eException7.getSuppressed();
        java.lang.Class<?> wildcardClass18 = eException7.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException7);
        java.lang.String str20 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = -1]" + "'", str20.equals("com.ib.client.EException: hi! [id = 10, errorCode = -1]"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        int int2 = eException1.getId();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        java.lang.String str2 = eException1.toString();
        java.lang.Throwable[] throwableArray3 = eException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]" + "'", str2.equals("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]"));
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.ib.client.EException eException3 = new com.ib.client.EException((-1), (int) (short) -1, "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        com.ib.client.EException eException18 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass19 = eException18.getClass();
        com.ib.client.EException eException23 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException18.addSuppressed((java.lang.Throwable) eException23);
        java.lang.Class<?> wildcardClass25 = eException18.getClass();
        java.lang.Throwable[] throwableArray26 = eException18.getSuppressed();
        eException3.addSuppressed((java.lang.Throwable) eException18);
        java.lang.Throwable[] throwableArray28 = eException18.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 1, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        int int4 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        int int6 = eException3.getErrorCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getId();
        com.ib.client.EException eException20 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException24 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass25 = eException24.getClass();
        com.ib.client.EException eException29 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException24.addSuppressed((java.lang.Throwable) eException29);
        eException20.addSuppressed((java.lang.Throwable) eException29);
        int int32 = eException29.getErrorCode();
        eException12.addSuppressed((java.lang.Throwable) eException29);
        java.lang.Class<?> wildcardClass34 = eException29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) '#', codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        int int16 = eException12.getId();
        java.lang.String str17 = eException12.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str17.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        int int6 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getErrorCode();
        int int5 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getId();
        java.lang.Class<?> wildcardClass17 = eException12.getClass();
        int int18 = eException12.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.String str5 = eException3.toString();
        com.ib.client.EException eException9 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException9);
        int int11 = eException9.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        com.ib.client.EException eException14 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = eException14.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException14);
        com.ib.client.EException eException20 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass21 = eException20.getClass();
        com.ib.client.EException eException25 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException20.addSuppressed((java.lang.Throwable) eException25);
        java.lang.Class<?> wildcardClass27 = eException20.getClass();
        java.lang.Throwable[] throwableArray28 = eException20.getSuppressed();
        java.lang.Throwable[] throwableArray29 = eException20.getSuppressed();
        java.lang.Throwable[] throwableArray30 = eException20.getSuppressed();
        java.lang.Class<?> wildcardClass31 = eException20.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException20);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.ib.client.EException eException3 = new com.ib.client.EException(100, (int) (short) 10, "");
        java.lang.String str4 = eException3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException:  [id = 100, errorCode = 10]" + "'", str4.equals("com.ib.client.EException:  [id = 100, errorCode = 10]"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        int int4 = eException3.getErrorCode();
        int int5 = eException3.getErrorCode();
        int int6 = eException3.getId();
        com.ib.client.EException eException8 = new com.ib.client.EException("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException8.getSuppressed();
        com.ib.client.EException eException12 = new com.ib.client.EException("hi!");
        eException8.addSuppressed((java.lang.Throwable) eException12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = eException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(52, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.ib.client.EException eException3 = new com.ib.client.EException(52, (int) '#', "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException8.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(100, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '#', (int) (byte) 0, "hi!");
        int int4 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.ib.client.EException eException3 = new com.ib.client.EException(32, (int) (byte) 1, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        int int3 = eException1.getErrorCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException12.toString();
        com.ib.client.EException eException19 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException23 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass24 = eException23.getClass();
        com.ib.client.EException eException28 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException23.addSuppressed((java.lang.Throwable) eException28);
        eException19.addSuppressed((java.lang.Throwable) eException28);
        java.lang.String str31 = eException19.toString();
        int int32 = eException19.getErrorCode();
        int int33 = eException19.getId();
        eException12.addSuppressed((java.lang.Throwable) eException19);
        int int35 = eException19.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str15.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str31.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException12.getSuppressed();
        java.lang.String str17 = eException12.toString();
        int int18 = eException12.getId();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str17.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) 'a', (int) (short) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getId();
        com.ib.client.EException eException20 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException24 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass25 = eException24.getClass();
        com.ib.client.EException eException29 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException24.addSuppressed((java.lang.Throwable) eException29);
        eException20.addSuppressed((java.lang.Throwable) eException29);
        int int32 = eException29.getErrorCode();
        eException12.addSuppressed((java.lang.Throwable) eException29);
        int int34 = eException29.getErrorCode();
        java.lang.String str35 = eException29.toString();
        int int36 = eException29.getId();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str35.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = eException3.getSuppressed();
        java.lang.String str7 = eException3.toString();
        java.lang.Throwable[] throwableArray8 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str7.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException3.getSuppressed();
        java.lang.String str11 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str11.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getErrorCode();
        int int17 = eException12.getErrorCode();
        int int18 = eException12.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getErrorCode();
        int int17 = eException12.getId();
        java.lang.Throwable[] throwableArray18 = eException12.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        com.ib.client.EException eException15 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        int int16 = eException15.getErrorCode();
        int int17 = eException15.getErrorCode();
        int int18 = eException15.getId();
        com.ib.client.EException eException20 = new com.ib.client.EException("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
        eException15.addSuppressed((java.lang.Throwable) eException20);
        java.lang.Throwable[] throwableArray22 = eException20.getSuppressed();
        java.lang.Throwable[] throwableArray23 = eException20.getSuppressed();
        eException3.addSuppressed((java.lang.Throwable) eException20);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException:  [id = 100, errorCode = 10]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        int int12 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getErrorCode();
        int int17 = eException12.getErrorCode();
        java.lang.Class<?> wildcardClass18 = eException12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 100, 10, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        int int5 = eException3.getErrorCode();
        int int6 = eException3.getId();
        java.lang.Class<?> wildcardClass7 = eException3.getClass();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 100, 10, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) 'a', (int) (byte) -1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        java.lang.String str5 = eException3.toString();
        com.ib.client.EException eException9 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass10 = eException9.getClass();
        com.ib.client.EException eException14 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException9.addSuppressed((java.lang.Throwable) eException14);
        java.lang.Class<?> wildcardClass16 = eException9.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException9);
        java.lang.String str18 = eException9.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = eException3.getClass();
        java.lang.String str6 = eException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str6.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) (byte) 10, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        int int4 = eException3.getId();
        int int5 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.String str14 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str14.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        int int4 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException((int) '4', codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        int int16 = eException3.getErrorCode();
        int int17 = eException3.getId();
        com.ib.client.EException eException21 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass22 = eException21.getClass();
        java.lang.Throwable[] throwableArray23 = eException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = eException21.getSuppressed();
        java.lang.String str25 = eException21.toString();
        eException3.addSuppressed((java.lang.Throwable) eException21);
        int int27 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str25.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 0, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getErrorCode();
        int int17 = eException12.getErrorCode();
        java.lang.String str18 = eException12.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.ib.client.EException eException1 = new com.ib.client.EException("");
        com.ib.client.EException eException5 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass6 = eException5.getClass();
        com.ib.client.EException eException10 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException5.addSuppressed((java.lang.Throwable) eException10);
        java.lang.Throwable[] throwableArray12 = eException5.getSuppressed();
        com.ib.client.EException eException16 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException20 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass21 = eException20.getClass();
        com.ib.client.EException eException25 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException20.addSuppressed((java.lang.Throwable) eException25);
        eException16.addSuppressed((java.lang.Throwable) eException25);
        java.lang.Throwable[] throwableArray28 = eException25.getSuppressed();
        com.ib.client.EException eException30 = new com.ib.client.EException("hi!");
        eException25.addSuppressed((java.lang.Throwable) eException30);
        eException5.addSuppressed((java.lang.Throwable) eException25);
        java.lang.String str33 = eException5.toString();
        eException1.addSuppressed((java.lang.Throwable) eException5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str33.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 10, errorCode = -1]");
        int int2 = eException1.getErrorCode();
        java.lang.Class<?> wildcardClass3 = eException1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException12.getSuppressed();
        int int17 = eException12.getId();
        java.lang.Class<?> wildcardClass18 = eException12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.ib.client.EException eException3 = new com.ib.client.EException(100, (int) (short) 10, "");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.String str5 = eException3.toString();
        com.ib.client.EException eException9 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException9);
        java.lang.Throwable[] throwableArray11 = eException9.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.String str5 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str5.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.ib.client.EException eException3 = new com.ib.client.EException(100, (int) (short) 10, "com.ib.client.EException:  [id = 100, errorCode = 10]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.ib.client.EException eException3 = new com.ib.client.EException((-1), 1, "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.ib.client.EException eException3 = new com.ib.client.EException(100, (int) ' ', "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = 100, errorCode = 10]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 10, errorCode = -1]");
        int int2 = eException1.getErrorCode();
        int int3 = eException1.getErrorCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        com.ib.client.EException eException18 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass19 = eException18.getClass();
        com.ib.client.EException eException23 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException18.addSuppressed((java.lang.Throwable) eException23);
        java.lang.Class<?> wildcardClass25 = eException18.getClass();
        java.lang.Throwable[] throwableArray26 = eException18.getSuppressed();
        eException3.addSuppressed((java.lang.Throwable) eException18);
        int int28 = eException3.getErrorCode();
        com.ib.client.EException eException32 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException36 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass37 = eException36.getClass();
        com.ib.client.EException eException41 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException36.addSuppressed((java.lang.Throwable) eException41);
        eException32.addSuppressed((java.lang.Throwable) eException41);
        java.lang.Throwable[] throwableArray44 = eException41.getSuppressed();
        com.ib.client.EException eException46 = new com.ib.client.EException("hi!");
        eException41.addSuppressed((java.lang.Throwable) eException46);
        java.lang.Class<?> wildcardClass48 = eException41.getClass();
        int int49 = eException41.getId();
        eException3.addSuppressed((java.lang.Throwable) eException41);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 1, 0, "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        java.lang.String str5 = eException3.toString();
        com.ib.client.EException eException9 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass10 = eException9.getClass();
        com.ib.client.EException eException14 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException9.addSuppressed((java.lang.Throwable) eException14);
        int int16 = eException14.getErrorCode();
        eException3.addSuppressed((java.lang.Throwable) eException14);
        java.lang.Throwable[] throwableArray18 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass6 = throwableArray5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 100, (int) (short) 10, "");
        java.lang.String str4 = eException3.toString();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException:  [id = 100, errorCode = 10]" + "'", str4.equals("com.ib.client.EException:  [id = 100, errorCode = 10]"));
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        int int4 = eException3.getErrorCode();
        java.lang.String str5 = eException3.toString();
        java.lang.String str6 = eException3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str6.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        int int5 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.ib.client.EException eException3 = new com.ib.client.EException(1, 10, "");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.String str16 = eException12.toString();
        java.lang.Throwable[] throwableArray17 = eException12.getSuppressed();
        java.lang.String str18 = eException12.toString();
        int int19 = eException12.getErrorCode();
        java.lang.Class<?> wildcardClass20 = eException12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str16.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '#', (int) (byte) 100, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        java.lang.String str15 = eException3.toString();
        java.lang.Throwable[] throwableArray16 = eException3.getSuppressed();
        java.lang.String str17 = eException3.toString();
        java.lang.String str18 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str15.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str17.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.String str16 = eException12.toString();
        java.lang.Throwable[] throwableArray17 = eException12.getSuppressed();
        java.lang.String str18 = eException12.toString();
        int int19 = eException12.getErrorCode();
        int int20 = eException12.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str16.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        int int11 = eException3.getId();
        int int12 = eException3.getErrorCode();
        com.ib.client.EException eException14 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 10, errorCode = -1]");
        eException3.addSuppressed((java.lang.Throwable) eException14);
        java.lang.Throwable[] throwableArray16 = eException14.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException3.getSuppressed();
        com.ib.client.EException eException14 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException18 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass19 = eException18.getClass();
        com.ib.client.EException eException23 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException18.addSuppressed((java.lang.Throwable) eException23);
        eException14.addSuppressed((java.lang.Throwable) eException23);
        java.lang.Throwable[] throwableArray26 = eException23.getSuppressed();
        com.ib.client.EException eException28 = new com.ib.client.EException("hi!");
        eException23.addSuppressed((java.lang.Throwable) eException28);
        eException3.addSuppressed((java.lang.Throwable) eException23);
        java.lang.Throwable[] throwableArray31 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        int int16 = eException3.getErrorCode();
        java.lang.Class<?> wildcardClass17 = eException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.String str5 = eException3.toString();
        int int6 = eException3.getId();
        java.lang.Class<?> wildcardClass7 = eException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str5.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        java.lang.Class<?> wildcardClass15 = eException3.getClass();
        int int16 = eException3.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.ib.client.EException eException3 = new com.ib.client.EException(1, 52, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 0, "");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException7);
        java.lang.String str10 = eException3.toString();
        java.lang.String str11 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "com.ib.client.EException:  [id = 32, errorCode = 0]" + "'", str10.equals("com.ib.client.EException:  [id = 32, errorCode = 0]"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.ib.client.EException:  [id = 32, errorCode = 0]" + "'", str11.equals("com.ib.client.EException:  [id = 32, errorCode = 0]"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.ib.client.EException eException3 = new com.ib.client.EException(35, (int) (short) 0, "com.ib.client.EException:  [id = 32, errorCode = 0]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Throwable[] throwableArray4 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(1, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 10, (-1), "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 100, (int) (short) -1, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        int int6 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        java.lang.String str4 = eException3.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = -1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 10, errorCode = -1]"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException12.getSuppressed();
        int int17 = eException12.getId();
        int int18 = eException12.getId();
        java.lang.Throwable[] throwableArray19 = eException12.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.ib.client.EException eException1 = new com.ib.client.EException("hi!");
        com.ib.client.EException eException5 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.Throwable[] throwableArray6 = eException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = eException5.getClass();
        eException1.addSuppressed((java.lang.Throwable) eException5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 10, (int) (byte) 1, "com.ib.client.EException: hi! [id = 10, errorCode = -1]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Class<?> wildcardClass14 = eException7.getClass();
        java.lang.Throwable[] throwableArray15 = eException7.getSuppressed();
        java.lang.Throwable[] throwableArray16 = eException7.getSuppressed();
        java.lang.Throwable[] throwableArray17 = eException7.getSuppressed();
        java.lang.Class<?> wildcardClass18 = eException7.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException7);
        java.lang.Class<?> wildcardClass20 = eException7.getClass();
        java.lang.Class<?> wildcardClass21 = eException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '#', (-1), "");
        int int4 = eException3.getErrorCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        int int16 = eException3.getErrorCode();
        int int17 = eException3.getId();
        com.ib.client.EException eException21 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass22 = eException21.getClass();
        java.lang.Throwable[] throwableArray23 = eException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = eException21.getSuppressed();
        java.lang.String str25 = eException21.toString();
        eException3.addSuppressed((java.lang.Throwable) eException21);
        java.lang.Class<?> wildcardClass27 = eException21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str25.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        int int3 = eException1.getErrorCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getId();
        java.lang.Class<?> wildcardClass17 = eException12.getClass();
        java.lang.String str18 = eException12.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str18.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        int int5 = eException3.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        int int15 = eException12.getErrorCode();
        int int16 = eException12.getErrorCode();
        int int17 = eException12.getId();
        int int18 = eException12.getId();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 10, errorCode = 0]");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (byte) 1, 10, "com.ib.client.EException: hi! [id = 10, errorCode = -1]");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.ib.client.EClientErrors.CodeMsgPair codeMsgPair1 = null;
        try {
            com.ib.client.EException eException2 = new com.ib.client.EException(35, codeMsgPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.ib.client.EException eException1 = new com.ib.client.EException("");
        java.lang.String str2 = eException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.ib.client.EException:  [id = -1, errorCode = -1]" + "'", str2.equals("com.ib.client.EException:  [id = -1, errorCode = -1]"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.ib.client.EException eException3 = new com.ib.client.EException(0, (int) (byte) 10, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) -1, (int) (short) -1, "com.ib.client.EException: hi! [id = 10, errorCode = -1]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '#', "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        int int5 = eException3.getErrorCode();
        int int6 = eException3.getId();
        int int7 = eException3.getErrorCode();
        int int8 = eException3.getId();
        java.lang.Throwable[] throwableArray9 = eException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 1, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        int int4 = eException3.getErrorCode();
        com.ib.client.EException eException8 = new com.ib.client.EException(1, (int) (short) -1, "hi!");
        int int9 = eException8.getErrorCode();
        com.ib.client.EException eException13 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass14 = eException13.getClass();
        eException8.addSuppressed((java.lang.Throwable) eException13);
        eException3.addSuppressed((java.lang.Throwable) eException13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 1, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        int int4 = eException3.getErrorCode();
        com.ib.client.EException eException8 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass9 = eException8.getClass();
        java.lang.Throwable[] throwableArray10 = eException8.getSuppressed();
        com.ib.client.EException eException14 = new com.ib.client.EException((int) (short) 1, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        eException8.addSuppressed((java.lang.Throwable) eException14);
        eException3.addSuppressed((java.lang.Throwable) eException8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException3.getSuppressed();
        int int11 = eException3.getId();
        java.lang.String str12 = eException3.toString();
        com.ib.client.EException eException16 = new com.ib.client.EException((int) (short) 1, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        int int17 = eException16.getErrorCode();
        java.lang.Throwable[] throwableArray18 = eException16.getSuppressed();
        eException3.addSuppressed((java.lang.Throwable) eException16);
        int int20 = eException16.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "com.ib.client.EException: hi! [id = 0, errorCode = 52]" + "'", str12.equals("com.ib.client.EException: hi! [id = 0, errorCode = 52]"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.ib.client.EException eException3 = new com.ib.client.EException(1, (int) (short) -1, "hi!");
        int int4 = eException3.getErrorCode();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass9 = eException8.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException8);
        int int11 = eException3.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        int int4 = eException3.getId();
        int int5 = eException3.getErrorCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray12 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass14 = eException3.getClass();
        com.ib.client.EException eException18 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass19 = eException18.getClass();
        com.ib.client.EException eException23 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException18.addSuppressed((java.lang.Throwable) eException23);
        java.lang.Class<?> wildcardClass25 = eException18.getClass();
        java.lang.Throwable[] throwableArray26 = eException18.getSuppressed();
        eException3.addSuppressed((java.lang.Throwable) eException18);
        int int28 = eException3.getId();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        java.lang.Throwable[] throwableArray16 = eException3.getSuppressed();
        int int17 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray18 = eException3.getSuppressed();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        java.lang.String str4 = eException3.toString();
        int int5 = eException3.getErrorCode();
        java.lang.Throwable[] throwableArray6 = eException3.getSuppressed();
        com.ib.client.EException eException10 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass11 = eException10.getClass();
        com.ib.client.EException eException15 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException10.addSuppressed((java.lang.Throwable) eException15);
        java.lang.Class<?> wildcardClass17 = eException10.getClass();
        int int18 = eException10.getId();
        int int19 = eException10.getErrorCode();
        eException3.addSuppressed((java.lang.Throwable) eException10);
        int int21 = eException10.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str4.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        java.lang.String str6 = eException3.toString();
        com.ib.client.EException eException10 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        com.ib.client.EException eException14 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass15 = eException14.getClass();
        com.ib.client.EException eException19 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException14.addSuppressed((java.lang.Throwable) eException19);
        java.lang.Class<?> wildcardClass21 = eException14.getClass();
        java.lang.Throwable[] throwableArray22 = eException14.getSuppressed();
        java.lang.Throwable[] throwableArray23 = eException14.getSuppressed();
        java.lang.Throwable[] throwableArray24 = eException14.getSuppressed();
        java.lang.Class<?> wildcardClass25 = eException14.getClass();
        eException10.addSuppressed((java.lang.Throwable) eException14);
        eException3.addSuppressed((java.lang.Throwable) eException10);
        int int28 = eException10.getId();
        java.lang.Class<?> wildcardClass29 = eException10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str6.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.Throwable[] throwableArray15 = eException12.getSuppressed();
        com.ib.client.EException eException17 = new com.ib.client.EException("hi!");
        eException12.addSuppressed((java.lang.Throwable) eException17);
        com.ib.client.EException eException22 = new com.ib.client.EException((int) (short) 0, (int) (byte) 1, "");
        java.lang.Throwable[] throwableArray23 = eException22.getSuppressed();
        com.ib.client.EException eException27 = new com.ib.client.EException((int) (byte) 10, (-1), "hi!");
        com.ib.client.EException eException31 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass32 = eException31.getClass();
        com.ib.client.EException eException36 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException31.addSuppressed((java.lang.Throwable) eException36);
        java.lang.Class<?> wildcardClass38 = eException31.getClass();
        java.lang.Throwable[] throwableArray39 = eException31.getSuppressed();
        java.lang.Throwable[] throwableArray40 = eException31.getSuppressed();
        java.lang.Throwable[] throwableArray41 = eException31.getSuppressed();
        java.lang.Class<?> wildcardClass42 = eException31.getClass();
        eException27.addSuppressed((java.lang.Throwable) eException31);
        java.lang.Class<?> wildcardClass44 = eException31.getClass();
        eException22.addSuppressed((java.lang.Throwable) eException31);
        eException12.addSuppressed((java.lang.Throwable) eException31);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 100, 10, "com.ib.client.EException: hi! [id = 0, errorCode = 52]");
        java.lang.String str4 = eException3.toString();
        int int5 = eException3.getId();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = 100, errorCode = 10]" + "'", str4.equals("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = 100, errorCode = 10]"));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = eException3.getSuppressed();
        int int7 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) ' ', (int) (byte) 0, "");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        eException3.addSuppressed((java.lang.Throwable) eException7);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.String str11 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.ib.client.EException:  [id = 32, errorCode = 0]" + "'", str11.equals("com.ib.client.EException:  [id = 32, errorCode = 0]"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        int int4 = eException3.getErrorCode();
        int int5 = eException3.getErrorCode();
        int int6 = eException3.getId();
        com.ib.client.EException eException8 = new com.ib.client.EException("com.ib.client.EException: com.ib.client.EException: hi! [id = 0, errorCode = 52] [id = -1, errorCode = -1]");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Throwable[] throwableArray10 = eException8.getSuppressed();
        int int11 = eException8.getId();
        int int12 = eException8.getId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.ib.client.EException eException3 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        java.lang.Throwable[] throwableArray5 = eException3.getSuppressed();
        com.ib.client.EException eException9 = new com.ib.client.EException((int) (short) 1, (int) (byte) 100, "com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        eException3.addSuppressed((java.lang.Throwable) eException9);
        java.lang.String str11 = eException3.toString();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str11.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass4 = eException3.getClass();
        com.ib.client.EException eException8 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException3.addSuppressed((java.lang.Throwable) eException8);
        java.lang.Class<?> wildcardClass10 = eException3.getClass();
        java.lang.Throwable[] throwableArray11 = eException3.getSuppressed();
        java.lang.Class<?> wildcardClass12 = eException3.getClass();
        int int13 = eException3.getErrorCode();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ib.client.EException eException1 = new com.ib.client.EException("");
        java.lang.Throwable[] throwableArray2 = eException1.getSuppressed();
        int int3 = eException1.getId();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.ib.client.EException eException1 = new com.ib.client.EException("com.ib.client.EException:  [id = 32, errorCode = 0]");
        java.lang.String str2 = eException1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "com.ib.client.EException: com.ib.client.EException:  [id = 32, errorCode = 0] [id = -1, errorCode = -1]" + "'", str2.equals("com.ib.client.EException: com.ib.client.EException:  [id = 32, errorCode = 0] [id = -1, errorCode = -1]"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.ib.client.EException eException3 = new com.ib.client.EException((int) '4', (int) (byte) 1, "hi!");
        com.ib.client.EException eException7 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass8 = eException7.getClass();
        com.ib.client.EException eException12 = new com.ib.client.EException((int) (short) 0, (int) '4', "hi!");
        eException7.addSuppressed((java.lang.Throwable) eException12);
        eException3.addSuppressed((java.lang.Throwable) eException12);
        java.lang.String str15 = eException3.toString();
        int int16 = eException3.getErrorCode();
        int int17 = eException3.getId();
        com.ib.client.EException eException21 = new com.ib.client.EException(10, 0, "hi!");
        java.lang.Class<?> wildcardClass22 = eException21.getClass();
        java.lang.Throwable[] throwableArray23 = eException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = eException21.getSuppressed();
        java.lang.String str25 = eException21.toString();
        eException3.addSuppressed((java.lang.Throwable) eException21);
        java.lang.String str27 = eException21.toString();
        com.ib.client.EException eException29 = new com.ib.client.EException("com.ib.client.EException: hi! [id = 52, errorCode = 1]");
        eException21.addSuppressed((java.lang.Throwable) eException29);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "com.ib.client.EException: hi! [id = 52, errorCode = 1]" + "'", str15.equals("com.ib.client.EException: hi! [id = 52, errorCode = 1]"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str25.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "com.ib.client.EException: hi! [id = 10, errorCode = 0]" + "'", str27.equals("com.ib.client.EException: hi! [id = 10, errorCode = 0]"));
    }
}

