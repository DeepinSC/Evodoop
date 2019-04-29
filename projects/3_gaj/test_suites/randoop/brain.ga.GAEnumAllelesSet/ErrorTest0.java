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
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Object obj1 = gAEnumAllelesSet0.allele();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.lang.Object obj3 = gAEnumAllelesSet0.allele((int) 'a');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        int int2 = gAEnumAllelesSet0.size();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        int int1 = gAEnumAllelesSet0.size();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.lang.Object obj2 = gAEnumAllelesSet0.allele();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Object obj2 = gAEnumAllelesSet0.allele((-1));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass2 = gAEnumAllelesSet0.getClass();
        java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) '#');
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass2 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass3 = gAEnumAllelesSet0.getClass();
        java.lang.Object obj4 = gAEnumAllelesSet0.allele();
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        brain.ga.GAEnumAllelesSet gAEnumAllelesSet0 = new brain.ga.GAEnumAllelesSet();
        java.lang.Class<?> wildcardClass1 = gAEnumAllelesSet0.getClass();
        java.lang.Class<?> wildcardClass2 = gAEnumAllelesSet0.getClass();
        java.lang.Object obj4 = gAEnumAllelesSet0.allele((int) (short) 0);
    }
}

