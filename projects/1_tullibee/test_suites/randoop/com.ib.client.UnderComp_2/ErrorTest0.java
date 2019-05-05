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
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        com.ib.client.UnderComp underComp4 = new com.ib.client.UnderComp();
        underComp4.m_price = (-1.0d);
        com.ib.client.UnderComp underComp7 = new com.ib.client.UnderComp();
        underComp7.m_price = (-1.0d);
        boolean boolean10 = underComp4.equals((java.lang.Object) underComp7);
        java.lang.Class<?> wildcardClass11 = underComp4.getClass();
        boolean boolean12 = underComp0.equals((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on underComp4 and underComp7", underComp4.equals(underComp7) ? underComp4.hashCode() == underComp7.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        underComp0.m_price = (-1.0d);
        boolean boolean4 = underComp0.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass5 = underComp0.getClass();
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = (-1.0d);
        com.ib.client.UnderComp underComp9 = new com.ib.client.UnderComp();
        underComp9.m_price = (-1.0d);
        boolean boolean12 = underComp6.equals((java.lang.Object) underComp9);
        underComp6.m_conId = 0;
        boolean boolean15 = underComp0.equals((java.lang.Object) underComp6);
        int int16 = underComp0.m_conId;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on underComp6 and underComp9", underComp6.equals(underComp9) ? underComp6.hashCode() == underComp9.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.ib.client.UnderComp underComp0 = new com.ib.client.UnderComp();
        double double1 = underComp0.m_price;
        java.lang.Object obj2 = null;
        boolean boolean3 = underComp0.equals(obj2);
        underComp0.m_price = (-1.0f);
        com.ib.client.UnderComp underComp6 = new com.ib.client.UnderComp();
        underComp6.m_price = 100.0d;
        boolean boolean9 = underComp0.equals((java.lang.Object) underComp6);
        double double10 = underComp6.m_delta;
        underComp6.m_conId = (byte) 0;
        com.ib.client.UnderComp underComp13 = new com.ib.client.UnderComp();
        underComp13.m_price = 100.0d;
        double double16 = underComp13.m_price;
        underComp13.m_conId = 100;
        com.ib.client.UnderComp underComp19 = new com.ib.client.UnderComp();
        underComp19.m_price = (-1.0d);
        underComp19.m_conId = 'a';
        double double24 = underComp19.m_delta;
        underComp19.m_conId = '4';
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Class<?> wildcardClass29 = obj27.getClass();
        boolean boolean30 = underComp19.equals((java.lang.Object) wildcardClass29);
        com.ib.client.UnderComp underComp31 = new com.ib.client.UnderComp();
        underComp31.m_price = (-1.0d);
        boolean boolean34 = underComp19.equals((java.lang.Object) underComp31);
        boolean boolean35 = underComp13.equals((java.lang.Object) underComp19);
        com.ib.client.UnderComp underComp36 = new com.ib.client.UnderComp();
        double double37 = underComp36.m_price;
        java.lang.Object obj38 = null;
        boolean boolean39 = underComp36.equals(obj38);
        double double40 = underComp36.m_delta;
        boolean boolean42 = underComp36.equals((java.lang.Object) "hi!");
        boolean boolean43 = underComp13.equals((java.lang.Object) underComp36);
        boolean boolean44 = underComp6.equals((java.lang.Object) underComp36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on underComp0 and underComp31", underComp0.equals(underComp31) ? underComp0.hashCode() == underComp31.hashCode() : true);
    }
}

