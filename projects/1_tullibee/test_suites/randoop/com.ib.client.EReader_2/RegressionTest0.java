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
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) 'a');
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 10);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 100);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 10);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        java.lang.Class<?> wildcardClass11 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 1);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 0);
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 10);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 10);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) 'a');
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 10);
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 1);
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 100);
        eReader3.stop();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass11 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        java.lang.Class<?> wildcardClass11 = eReader3.getClass();
        java.lang.Class<?> wildcardClass12 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 10);
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '4');
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass12 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        java.lang.Class<?> wildcardClass11 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 0);
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass13 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass8 = eReader3.getClass();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass11 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 100);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (byte) 10);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass7 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (-1));
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        eReader3.stop();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) '#');
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 10);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        eReader3.stop();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = eReader3.getClass();
        java.lang.Class<?> wildcardClass5 = eReader3.getClass();
        java.lang.Class<?> wildcardClass6 = eReader3.getClass();
        eReader3.stop();
        eReader3.stop();
        java.lang.Class<?> wildcardClass9 = eReader3.getClass();
        java.lang.Class<?> wildcardClass10 = eReader3.getClass();
        eReader3.stop();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.DataInputStream dataInputStream0 = null;
        com.ib.client.EWrapper eWrapper1 = null;
        com.ib.client.EReader eReader3 = new com.ib.client.EReader(dataInputStream0, eWrapper1, 0);
        eReader3.stop();
        try {
            eReader3.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

