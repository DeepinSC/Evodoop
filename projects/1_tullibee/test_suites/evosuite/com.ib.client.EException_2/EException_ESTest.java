/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 03:15:35 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.EClientErrors;
import com.ib.client.EException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EException_ESTest extends EException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EException eException0 = new EException(0, 0, "");
      int int0 = eException0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EException eException0 = new EException("IWl(!");
      int int0 = eException0.getId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EException eException0 = new EException((-974), (-1610), "yk LEA-G(s7|U%I@+j");
      int int0 = eException0.getErrorCode();
      assertEquals((-1610), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EException eException0 = null;
      try {
        eException0 = new EException(0, (EClientErrors.CodeMsgPair) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EException eException0 = new EException(0, 0, "");
      int int0 = eException0.getErrorCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EClientErrors.CodeMsgPair eClientErrors_CodeMsgPair0 = new EClientErrors.CodeMsgPair(475, "Request Open Order Sending Error -");
      EException eException0 = new EException(475, eClientErrors_CodeMsgPair0);
      String string0 = eException0.getMessage();
      assertEquals("Request Open Order Sending Error - [id = 475, errorCode = 475]", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EClientErrors.CodeMsgPair eClientErrors_CodeMsgPair0 = new EClientErrors.CodeMsgPair(475, "Request Open Order Sending Error -");
      EException eException0 = new EException(475, eClientErrors_CodeMsgPair0);
      int int0 = eException0.getErrorCode();
      assertEquals(475, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EClientErrors.CodeMsgPair eClientErrors_CodeMsgPair0 = new EClientErrors.CodeMsgPair(475, "Request Open Order Sending Error -");
      EException eException0 = new EException(475, eClientErrors_CodeMsgPair0);
      int int0 = eException0.getId();
      assertEquals(475, int0);
  }
}
