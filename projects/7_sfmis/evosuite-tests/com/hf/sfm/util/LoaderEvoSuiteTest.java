/*
 * This file was automatically generated by EvoSuite
 */

package com.hf.sfm.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.hf.sfm.util.BasePara;
import com.hf.sfm.util.ListRange;
import com.hf.sfm.util.Loader;
import java.util.List;
import org.dom4j.DocumentFactory;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.bean.BeanElement;
import org.dom4j.tree.NamespaceStack;
import org.dom4j.util.IndexedElement;
import org.dom4j.util.NonLazyElement;
import org.dom4j.util.UserDataAttribute;
import org.dom4j.util.UserDataElement;
import org.hibernate.Query;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LoaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Loader loader0 = new Loader();
      // Undeclared exception!
      try {
        loader0.collectToMap();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Loader loader0 = new Loader();
      IndexedElement indexedElement0 = new IndexedElement("Ln+!SG;T9;5CXO7^p~");
      QName qName0 = indexedElement0.getQName("Ln+!SG;T9;5CXO7^p~");
      NonLazyElement nonLazyElement0 = new NonLazyElement(qName0, 3773);
      List<Object> list0 = nonLazyElement0.elements(qName0);
      loader0.setRs(list0);
      loader0.collectToMap("Ln+!SG;T9;5CXO7^p~");
      assertEquals(0, loader0.getTotalCount());
  }

  @Test
  public void test2()  throws Throwable  {
      Loader loader0 = new Loader();
      loader0.setRange((ListRange) null);
      assertEquals(0, loader0.getTotalCount());
  }

  @Test
  public void test3()  throws Throwable  {
      Loader loader0 = new Loader();
      String[] stringArray0 = new String[2];
      loader0.setColNames(stringArray0);
      UserDataElement userDataElement0 = new UserDataElement("");
      List<Object> list0 = userDataElement0.content();
      loader0.setRs(list0);
      userDataElement0.addElement("");
      // Undeclared exception!
      try {
        loader0.collectToMap("");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.dom4j.tree.DefaultElement cannot be cast to [Ljava.lang.Object;
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Loader loader0 = new Loader();
      loader0.setTotalCount(7);
      assertEquals(7, loader0.getTotalCount());
  }

  @Test
  public void test5()  throws Throwable  {
      Loader loader0 = new Loader();
      ListRange listRange0 = loader0.getRange();
      assertNull(listRange0);
  }

  @Test
  public void test6()  throws Throwable  {
      Loader loader0 = new Loader();
      BasePara basePara0 = new BasePara();
      basePara0.setPaging(true);
      // Undeclared exception!
      try {
        loader0.run(basePara0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Loader loader0 = new Loader();
      BasePara basePara0 = new BasePara();
      basePara0.setSqlpath("");
      // Undeclared exception!
      try {
        loader0.run(basePara0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Loader loader0 = new Loader();
      BasePara basePara0 = new BasePara();
      basePara0.setSqlpath("2Q");
      basePara0.setQuerySql("2Q");
      // Undeclared exception!
      try {
        loader0.run(basePara0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      Loader loader0 = new Loader();
      Query query0 = loader0.getParams((Query) null, (String[][]) null);
      assertNull(query0);
  }

  @Test
  public void test10()  throws Throwable  {
      Loader loader0 = new Loader();
      String[][] stringArray0 = new String[3][8];
      String[] stringArray1 = new String[5];
      stringArray1[0] = "9SdPv.;";
      stringArray1[1] = "9SdPv.;";
      stringArray1[2] = "9SdPv.;";
      stringArray1[3] = "9SdPv.;";
      stringArray1[4] = "Date";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      Query query0 = loader0.getParams((Query) null, stringArray0);
      assertNull(query0);
  }

  @Test
  public void test11()  throws Throwable  {
      Loader loader0 = new Loader();
      String[][] stringArray0 = new String[2][6];
      String[] stringArray1 = new String[10];
      stringArray1[0] = "Long";
      stringArray0[1] = stringArray1;
      // Undeclared exception!
      try {
        loader0.getParams((Query) null, stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Loader loader0 = new Loader();
      String[][] stringArray0 = new String[6][4];
      String[] stringArray1 = new String[9];
      stringArray0[1] = stringArray1;
      stringArray1[0] = "Double";
      // Undeclared exception!
      try {
        loader0.getParams((Query) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Loader loader0 = new Loader();
      NamespaceStack namespaceStack0 = new NamespaceStack();
      DocumentFactory documentFactory0 = namespaceStack0.getDocumentFactory();
      QName qName0 = documentFactory0.createQName("^R1K2 o", "^R1K2 o", "^R1K2 o");
      UserDataAttribute userDataAttribute0 = new UserDataAttribute(qName0, "^R1K2 o");
      Namespace namespace0 = userDataAttribute0.getNamespace();
      BeanElement beanElement0 = new BeanElement("^R1K2 o", namespace0, (Object) "create table");
      List<Object> list0 = beanElement0.attributes();
      loader0.setRs(list0);
      // Undeclared exception!
      try {
        loader0.getArrayResults();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.dom4j.bean.BeanAttribute cannot be cast to [Ljava.lang.Object;
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Loader loader0 = new Loader();
      UserDataElement userDataElement0 = new UserDataElement("q(zi|");
      List<Object> list0 = userDataElement0.content();
      loader0.setRs(list0);
      String string0 = loader0.getArrayResults();
      assertEquals("", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      Loader loader0 = new Loader();
      // Undeclared exception!
      try {
        loader0.collectToMap("combo");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Loader loader0 = new Loader();
      UserDataElement userDataElement0 = new UserDataElement("inyboo");
      List<Object> list0 = userDataElement0.content();
      loader0.setRs(list0);
      String[] stringArray0 = new String[1];
      loader0.setColNames(stringArray0);
      userDataElement0.addElement("inyboo");
      loader0.collectToMap("inyboo");
      assertEquals(0, loader0.getTotalCount());
  }
}
