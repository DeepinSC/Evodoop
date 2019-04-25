/*
 * This file was automatically generated by EvoSuite
 */

package com.hf.sfm.system.pdo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.hf.sfm.system.pdo.AGroup;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AGroupEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      aGroup0.setMark((String) null);
      assertNull(aGroup0.getMark());
  }

  @Test
  public void test1()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      String string0 = aGroup0.getMark();
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      String string0 = aGroup0.getIdno();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      String string0 = aGroup0.getName();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      aGroup0.setIdno((String) null);
      assertNull(aGroup0.getName());
  }

  @Test
  public void test5()  throws Throwable  {
      AGroup aGroup0 = new AGroup();
      aGroup0.setName((String) null);
      assertNull(aGroup0.getName());
  }

  @Test
  public void test6()  throws Throwable  {
      AGroup aGroup0 = new AGroup((String) null, (String) null);
      assertNull(aGroup0.getIdno());
  }
}