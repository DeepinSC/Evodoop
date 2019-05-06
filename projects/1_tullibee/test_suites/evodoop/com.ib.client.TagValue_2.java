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
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("", "");
        com.ib.client.TagValue tagValue3 = new com.ib.client.TagValue();
        tagValue3.m_tag = "hi!";
        java.lang.String str6 = tagValue3.m_tag;
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue("hi!", "");
        tagValue9.m_value = "";
        tagValue9.m_tag = "hi!";
        boolean boolean14 = tagValue3.equals((java.lang.Object) tagValue9);
        boolean boolean15 = tagValue2.equals((java.lang.Object) tagValue9);
        java.lang.String str16 = tagValue2.m_value;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue3 and tagValue9", tagValue3.equals(tagValue9) ? tagValue3.hashCode() == tagValue9.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        tagValue18.m_value = "hi!";
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue0 and tagValue6", tagValue0.equals(tagValue6) ? tagValue0.hashCode() == tagValue6.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        java.lang.String str24 = tagValue18.m_tag;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue0 and tagValue6", tagValue0.equals(tagValue6) ? tagValue0.hashCode() == tagValue6.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        java.lang.String str1 = tagValue0.m_value;
        java.lang.String str2 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue5 = new com.ib.client.TagValue("hi!", "hi!");
        boolean boolean6 = tagValue0.equals((java.lang.Object) tagValue5);
        tagValue0.m_value = "hi!";
        com.ib.client.TagValue tagValue9 = new com.ib.client.TagValue();
        java.lang.String str10 = tagValue9.m_value;
        java.lang.String str11 = tagValue9.m_tag;
        com.ib.client.TagValue tagValue14 = new com.ib.client.TagValue("hi!", "hi!");
        boolean boolean15 = tagValue9.equals((java.lang.Object) tagValue14);
        tagValue9.m_value = "hi!";
        java.lang.String str18 = tagValue9.m_tag;
        boolean boolean19 = tagValue0.equals((java.lang.Object) str18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue5 and tagValue14", tagValue5.equals(tagValue14) ? tagValue5.hashCode() == tagValue14.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue16 = new com.ib.client.TagValue();
        java.lang.String str17 = tagValue16.m_value;
        java.lang.String str18 = tagValue16.m_tag;
        java.lang.String str19 = tagValue16.m_value;
        java.lang.String str20 = tagValue16.m_value;
        java.lang.String str21 = tagValue16.m_tag;
        java.lang.String str22 = tagValue16.m_tag;
        tagValue16.m_value = "hi!";
        boolean boolean25 = tagValue0.equals((java.lang.Object) tagValue16);
        tagValue16.m_value = "";
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue0 and tagValue6", tagValue0.equals(tagValue6) ? tagValue0.hashCode() == tagValue6.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.ib.client.TagValue tagValue0 = new com.ib.client.TagValue();
        tagValue0.m_tag = "hi!";
        java.lang.String str3 = tagValue0.m_tag;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue("hi!", "");
        tagValue6.m_value = "";
        tagValue6.m_tag = "hi!";
        boolean boolean11 = tagValue0.equals((java.lang.Object) tagValue6);
        tagValue0.m_value = "";
        java.lang.String str14 = tagValue0.m_value;
        java.lang.String str15 = tagValue0.m_value;
        com.ib.client.TagValue tagValue18 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue18.m_tag = "";
        java.lang.String str21 = tagValue18.m_tag;
        java.lang.String str22 = tagValue18.m_tag;
        boolean boolean23 = tagValue0.equals((java.lang.Object) tagValue18);
        com.ib.client.TagValue tagValue24 = new com.ib.client.TagValue();
        tagValue24.m_tag = "hi!";
        java.lang.String str27 = tagValue24.m_tag;
        java.lang.String str28 = tagValue24.m_value;
        tagValue24.m_value = "";
        java.lang.String str31 = tagValue24.m_tag;
        java.lang.Class<?> wildcardClass32 = tagValue24.getClass();
        boolean boolean33 = tagValue18.equals((java.lang.Object) tagValue24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue0 and tagValue6", tagValue0.equals(tagValue6) ? tagValue0.hashCode() == tagValue6.hashCode() : true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.ib.client.TagValue tagValue2 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue2.m_tag = "hi!";
        java.lang.String str5 = tagValue2.m_value;
        com.ib.client.TagValue tagValue6 = new com.ib.client.TagValue();
        tagValue6.m_tag = "hi!";
        java.lang.String str9 = tagValue6.m_tag;
        com.ib.client.TagValue tagValue12 = new com.ib.client.TagValue("hi!", "");
        tagValue12.m_value = "";
        tagValue12.m_tag = "hi!";
        boolean boolean17 = tagValue6.equals((java.lang.Object) tagValue12);
        tagValue6.m_value = "";
        java.lang.String str20 = tagValue6.m_value;
        java.lang.String str21 = tagValue6.m_value;
        com.ib.client.TagValue tagValue24 = new com.ib.client.TagValue("hi!", "hi!");
        tagValue24.m_tag = "";
        java.lang.String str27 = tagValue24.m_tag;
        java.lang.String str28 = tagValue24.m_tag;
        boolean boolean29 = tagValue6.equals((java.lang.Object) tagValue24);
        java.lang.String str30 = tagValue6.m_tag;
        boolean boolean31 = tagValue2.equals((java.lang.Object) tagValue6);
        java.lang.String str32 = tagValue2.m_value;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tagValue6 and tagValue12", tagValue6.equals(tagValue12) ? tagValue6.hashCode() == tagValue12.hashCode() : true);
    }
}

