/*
 * This file was automatically generated by EvoSuite
 */

package com.ib.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ib.client.TagValue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TagValueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      boolean boolean0 = tagValue0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      TagValue tagValue0 = new TagValue("(XWhx?C/", "(XWhx?C/");
      TagValue tagValue1 = new TagValue();
      boolean boolean0 = tagValue0.equals((Object) tagValue1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      TagValue tagValue0 = new TagValue();
      TagValue tagValue1 = new TagValue();
      boolean boolean0 = tagValue0.equals((Object) tagValue1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      TagValue tagValue0 = new TagValue("]G5/-Y\"\"Ct4A", "]G5/-Y\"\"Ct4A");
      String string0 = "%D$m& s.[FK}\\8mU";
      TagValue tagValue1 = new TagValue("]G5/-Y\"\"Ct4A", string0);
      boolean boolean0 = tagValue0.equals((Object) tagValue1);
      assertFalse(tagValue1.equals(tagValue0));
      assertEquals(false, boolean0);
  }
}
