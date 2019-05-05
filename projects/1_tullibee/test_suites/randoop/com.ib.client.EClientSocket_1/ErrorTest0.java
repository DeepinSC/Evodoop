import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        eClientSocket0.setServerLogLevel((int) (byte) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        eClientSocket0.setServerLogLevel((int) (byte) 0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        eClientSocket0.setServerLogLevel((int) 'a');
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        java.lang.Class<?> wildcardClass2 = eClientSocket0.getClass();
        eClientSocket0.setServerLogLevel(1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.ib.client.EClientSocket eClientSocket0 = new com.ib.client.EClientSocket();
        java.lang.Class<?> wildcardClass1 = eClientSocket0.getClass();
        eClientSocket0.setServerLogLevel(3);
    }
}

