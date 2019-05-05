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
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        execution0.m_price = (byte) -1;
        execution0.m_acctNumber = "";
        java.lang.Class<?> wildcardClass5 = execution0.getClass();
        com.ib.client.Execution execution6 = new com.ib.client.Execution();
        execution6.m_price = (byte) -1;
        execution6.m_acctNumber = "";
        java.lang.String str11 = execution6.m_time;
        java.lang.String str12 = execution6.m_execId;
        execution6.m_clientId = (byte) 10;
        boolean boolean15 = execution0.equals((java.lang.Object) execution6);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_side = "hi!";
        com.ib.client.Execution execution10 = new com.ib.client.Execution();
        execution10.m_cumQty = '4';
        int int13 = execution10.m_orderId;
        boolean boolean14 = execution0.equals((java.lang.Object) execution10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.ib.client.Execution execution0 = new com.ib.client.Execution();
        java.lang.String str1 = execution0.m_acctNumber;
        execution0.m_orderId = 100;
        java.lang.String str4 = execution0.m_time;
        execution0.m_permId = 0;
        int int7 = execution0.m_cumQty;
        execution0.m_time = "";
        int int10 = execution0.m_permId;
        com.ib.client.Execution execution24 = new com.ib.client.Execution((int) (byte) 0, 0, "hi!", "", "", "", "", (int) (byte) 1, (double) (byte) 100, (-1), (int) (byte) 0, 0, (double) (-1L));
        java.lang.String str25 = execution24.m_exchange;
        java.lang.String str26 = execution24.m_exchange;
        boolean boolean27 = execution0.equals((java.lang.Object) execution24);
    }
}

