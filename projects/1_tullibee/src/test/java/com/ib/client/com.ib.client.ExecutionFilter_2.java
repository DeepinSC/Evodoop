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
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        com.ib.client.ExecutionFilter executionFilter5 = new com.ib.client.ExecutionFilter();
        boolean boolean6 = executionFilter0.equals((java.lang.Object) executionFilter5);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        java.lang.String str5 = executionFilter0.m_symbol;
        java.lang.String str6 = executionFilter0.m_secType;
        java.lang.String str7 = executionFilter0.m_exchange;
        com.ib.client.ExecutionFilter executionFilter8 = new com.ib.client.ExecutionFilter();
        executionFilter8.m_secType = "";
        executionFilter8.m_exchange = "";
        executionFilter8.m_acctCode = "hi!";
        executionFilter8.m_time = "";
        executionFilter8.m_secType = "hi!";
        executionFilter8.m_side = "hi!";
        boolean boolean21 = executionFilter0.equals((java.lang.Object) executionFilter8);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "hi!";
        com.ib.client.ExecutionFilter executionFilter3 = new com.ib.client.ExecutionFilter();
        executionFilter3.m_secType = "";
        executionFilter3.m_exchange = "";
        java.lang.String str8 = executionFilter3.m_time;
        boolean boolean9 = executionFilter0.equals((java.lang.Object) executionFilter3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_secType = "";
        executionFilter0.m_exchange = "";
        int int5 = executionFilter0.m_clientId;
        executionFilter0.m_clientId = 35;
        com.ib.client.ExecutionFilter executionFilter8 = new com.ib.client.ExecutionFilter();
        executionFilter8.m_clientId = '#';
        executionFilter8.m_secType = "";
        java.lang.String str13 = executionFilter8.m_time;
        executionFilter8.m_acctCode = "hi!";
        boolean boolean16 = executionFilter0.equals((java.lang.Object) executionFilter8);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_clientId = '#';
        java.lang.String str3 = executionFilter0.m_time;
        executionFilter0.m_time = "hi!";
        executionFilter0.m_side = "hi!";
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_exchange = "hi!";
        com.ib.client.ExecutionFilter executionFilter12 = new com.ib.client.ExecutionFilter();
        executionFilter12.m_clientId = '#';
        java.lang.String str15 = executionFilter12.m_time;
        java.lang.String str16 = executionFilter12.m_acctCode;
        java.lang.String str17 = executionFilter12.m_exchange;
        java.lang.String str18 = executionFilter12.m_side;
        java.lang.String str19 = executionFilter12.m_symbol;
        boolean boolean20 = executionFilter0.equals((java.lang.Object) executionFilter12);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.ib.client.ExecutionFilter executionFilter0 = new com.ib.client.ExecutionFilter();
        executionFilter0.m_symbol = "hi!";
        executionFilter0.m_exchange = "";
        com.ib.client.ExecutionFilter executionFilter5 = new com.ib.client.ExecutionFilter();
        executionFilter5.m_symbol = "hi!";
        executionFilter5.m_secType = "hi!";
        int int10 = executionFilter5.m_clientId;
        boolean boolean11 = executionFilter0.equals((java.lang.Object) executionFilter5);
    }
}

