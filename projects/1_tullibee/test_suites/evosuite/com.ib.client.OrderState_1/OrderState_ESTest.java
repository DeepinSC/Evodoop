/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 02:49:53 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.OrderState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OrderState_ESTest extends OrderState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_commissionCurrency = "Y:NfTcM%i@rn";
      OrderState orderState1 = new OrderState();
      orderState0.equals(orderState1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OrderState orderState0 = new OrderState("", "", "", "Iz.Tl*IYyIUX&", 0.0, 0.0, 0.0, "", "");
      OrderState orderState1 = new OrderState();
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertFalse(boolean0);
      assertFalse(orderState1.equals((Object)orderState0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_commissionCurrency = "";
      OrderState orderState1 = new OrderState((String) null, "", (String) null, (String) null, 0.0, 0.0, 0.0, "", (String) null);
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_maintMargin = "com.ib.client.OrderState";
      OrderState orderState1 = new OrderState();
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(orderState1.equals((Object)orderState0));
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_status = "";
      OrderState orderState1 = new OrderState((String) null, "", (String) null, (String) null, 0.0, 0.0, 0.0, (String) null, (String) null);
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, orderState1.m_commission, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState();
      assertTrue(orderState1.equals((Object)orderState0));
      
      orderState1.m_status = "";
      orderState1.m_status = "T~kpggDi-@*";
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(orderState1.equals((Object)orderState0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState("id/El\"/y5AI&Q~FRn", "~wKo", "", "~wKo", 0.0, 0.0, 0.0, "", "");
      boolean boolean0 = orderState1.equals(orderState0);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertEquals(0.0, orderState1.m_commission, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState("", "com.ib.client.OrderState", "", "5U)z5E", 0.0, (-1063.0), 1071.552, "", (String) null);
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertEquals((-1063.0), orderState1.m_minCommission, 0.01);
      assertFalse(boolean0);
      assertEquals(1071.552, orderState1.m_maxCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OrderState orderState0 = new OrderState("on;*%!`-A@}", "on;*%!`-A@}", "on;*%!`-A@}", "on;*%!`-A@}", 328.3932908750155, 328.3932908750155, 328.3932908750155, "on;*%!`-A@}", (String) null);
      OrderState orderState1 = new OrderState();
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(328.3932908750155, orderState0.m_maxCommission, 0.01);
      assertEquals(328.3932908750155, orderState0.m_commission, 0.01);
      assertEquals(328.3932908750155, orderState0.m_minCommission, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      assertEquals(0.0, orderState0.m_maxCommission, 0.01);
      
      orderState0.m_maxCommission = (-598.853180532098);
      OrderState orderState1 = new OrderState("id/El\"/y5AI&Q~FRn", "~wKo", "", "~wKo", 0.0, 0.0, 0.0, "", "");
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      boolean boolean0 = orderState0.equals(orderState0);
      assertEquals(0.0, orderState0.m_commission, 0.01);
      assertEquals(0.0, orderState0.m_minCommission, 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, orderState0.m_maxCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState(")DksVzT*hp_:)RW,", "", (String) null, "YGfs>GYiXIox?='4", 0.0, 0.0, 0.0, ";qTg@S<!A*ao", "![Q'P");
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      orderState0.m_minCommission = (-2267.7965871146);
      OrderState orderState1 = new OrderState("", "", "4<@)+Q?6Z?7Lc.", (String) null, 0.0, 0.0, 0.0, (String) null, (String) null);
      orderState1.m_minCommission = (-2267.7965871146);
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertFalse(orderState1.equals((Object)orderState0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState("\"p6-/M", "yXopj", (String) null, "", 0.0, 0.0, 0.0, "yXopj", "{<-");
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState();
      assertTrue(orderState1.equals((Object)orderState0));
      
      orderState0.m_status = "com.ib.client.Util";
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(orderState1.equals((Object)orderState0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState((String) null, (String) null, (String) null, "com.ib.client.OrderState", 0.0, 0.0, (-28.14), "com.ib.client.OrderState", ":rcmb59ea?3<DT4f!");
      boolean boolean0 = orderState0.equals(orderState1);
      assertEquals(0.0, orderState1.m_commission, 0.01);
      assertEquals((-28.14), orderState1.m_maxCommission, 0.01);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      assertEquals(0.0, orderState0.m_minCommission, 0.01);
      
      orderState0.m_minCommission = (-2267.7965871146);
      OrderState orderState1 = new OrderState("", "", "4<@)+Q?6Z?7Lc.", (String) null, 0.0, 0.0, 0.0, (String) null, (String) null);
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState("", (String) null, "YE'?Akpe}gnA.v:", (String) null, 1431.97, 0.0, 0.0, "", "B3,>");
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(boolean0);
      assertEquals(0.0, orderState1.m_minCommission, 0.01);
      assertEquals(0.0, orderState1.m_maxCommission, 0.01);
      assertEquals(1431.97, orderState1.m_commission, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      boolean boolean0 = orderState0.equals((Object) null);
      assertEquals(0.0, orderState0.m_minCommission, 0.01);
      assertEquals(0.0, orderState0.m_maxCommission, 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, orderState0.m_commission, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        orderState0.equals(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to com.ib.client.OrderState
         //
         verifyException("com.ib.client.OrderState", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      OrderState orderState1 = new OrderState();
      assertTrue(orderState1.equals((Object)orderState0));
      
      orderState1.m_commissionCurrency = null;
      orderState1.m_commissionCurrency = "K}&X m`hV5:_%\"JU";
      boolean boolean0 = orderState0.equals(orderState1);
      assertFalse(orderState1.equals((Object)orderState0));
      assertFalse(boolean0);
  }
}
