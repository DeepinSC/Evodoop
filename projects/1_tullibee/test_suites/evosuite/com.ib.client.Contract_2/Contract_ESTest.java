/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 03:11:21 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Contract_ESTest extends Contract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      contract0.m_expiry = "com.ib.client.Util";
      contract0.equals(contract1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_comboLegsDescrip = "";
      Object object0 = contract0.clone();
      contract0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_strike = 1.0;
      Contract contract1 = new Contract();
      contract1.equals(contract0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_currency = "$5/+$6h\"8+qGlH`Pe";
      Contract contract1 = new Contract();
      contract1.equals(contract0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      contract0.m_primaryExch = "aFJYy:F+,BsIzp5yi";
      contract0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      contract0.m_exchange = "com.ib.client.Contract";
      contract0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, "]mO`/oyLobo", (String) null, (String) null, 0.0, "BOND", "", (String) null, (String) null, (String) null, contract0.m_comboLegs, "", false, "DsoQZ`k*S9;b", "jftxSLuFBP;*1OD");
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_secType = "EyZr_";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-1858), (String) null, "?.=a@/kY'Aa@`7fKoO", (String) null, 0, (String) null, (String) null, (String) null, "^", "Ws_\"c@AOF;x=JZq@", contract0.m_comboLegs, (String) null, false, "-u-QrB", "m?");
      Contract contract2 = (Contract)contract1.clone();
      contract0.equals(contract2);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertTrue(contract2.equals((Object)contract1));
      assertEquals((-1858), contract2.m_conId);
      assertFalse(contract0.m_includeExpired);
      assertFalse(contract2.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      vector0.add((Integer) null);
      Contract contract0 = new Contract((-2379), "com.ib.client.UnderComp", "com.ib.client.Contract", (String) null, 0.0, "com.ib.client.UnderComp", "com.ib.client.UnderComp", "com.ib.client.Contract", "com.ib.client.UnderComp", "com.ib.client.Contract", vector0, "com.ib.client.UnderComp", false, "com.ib.client.UnderComp", (String) null);
      Object object0 = contract0.clone();
      // Undeclared exception!
      try { 
        contract0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Contract contract0 = new Contract(0, "jU #qmoXWG#B)+e+@c", "", "lkILk8jEld$Bz", 0, "gN5}p=?i{<", "", "BOND", "B[", (String) null, (Vector) null, "wZ ?", false, "gN5}p=?i{<", "");
      // Undeclared exception!
      try { 
        contract0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.Contract", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      object0.equals(contract0);
      assertEquals(0.0, contract0.m_strike, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<Integer> vector0 = new Vector<Integer>();
      Vector<Contract> vector1 = new Vector<Contract>();
      contract0.m_comboLegs = vector1;
      contract0.m_comboLegs = vector0;
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      vector0.add((Integer) 0);
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_secId = "0S[sWt9:{n-2UDLg$";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_secIdType = "GF&4.Nx0";
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
      assertEquals(0, contract1.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_localSymbol = "uAA+cwzb3Rw5g";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_multiplier = "uAA+cwzb3Rw5g";
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_right = "0bnCQ`b3t!S!=";
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.m_includeExpired);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = (Contract)contract0.clone();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_expiry = "lt";
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0.0, contract0.m_strike, 0.01);
      
      contract0.m_strike = 1.0;
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector<Contract> vector0 = new Vector<Contract>();
      Contract contract0 = new Contract(183, "com.ib.client.UnderComp", "BOND", "}GFSiyl\"", 183, "com.ib.client.UnderComp", "", (String) null, "5L'S!dQwAt", "1$fFT93qIB|e&=Pv4T", vector0, "7Z}", false, "BOND", "");
      Contract contract1 = (Contract)contract0.clone();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(contract1.m_includeExpired);
      assertTrue(boolean0);
      assertEquals(183, contract1.m_conId);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_currency = ":";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, (String) null, (String) null, (String) null, 0.0, "\")/", (String) null, "com.ib.client.UnderComp", "\")/", "a[OW~H0O~=25]3L=m\"a", contract0.m_comboLegs, (String) null, false, "ZC4]S,PC", "com.ib.client.Util");
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_symbol = "";
      contract0.m_symbol = "}lE^~vec85QMx";
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
      assertEquals(0, contract1.m_conId);
      assertFalse(contract1.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, (String) null, "BOXD", (String) null, 0, (String) null, "#ybgS66Sp-eP", (String) null, "VQ[&8yGmyFC}Zw2rh", "FU(8WAImb{@7", contract0.m_comboLegs, (String) null, false, ",1nsBT={\"l\"A*", "FU(8WAImb{@7");
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract();
      assertEquals(0, contract0.m_conId);
      
      contract0.m_conId = (-1001);
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = new Object();
      boolean boolean0 = contract0.equals(object0);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(boolean0);
      assertEquals(0, contract0.m_conId);
      assertFalse(contract0.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      boolean boolean0 = contract0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals(0, contract0.m_conId);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Contract contract0 = new Contract();
      boolean boolean0 = contract0.equals(contract0);
      assertTrue(boolean0);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, (String) null, (String) null, (String) null, 0.0, (String) null, (String) null, (String) null, "", (String) null, contract0.m_comboLegs, "k*t.\u0005^>Q1udh}rr", false, (String) null, (String) null);
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.equals((Object)contract0));
      assertFalse(boolean0);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0, contract1.m_conId);
  }
}