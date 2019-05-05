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
}

