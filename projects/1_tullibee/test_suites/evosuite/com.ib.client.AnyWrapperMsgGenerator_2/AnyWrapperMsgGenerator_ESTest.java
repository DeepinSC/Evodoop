/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 03:16:38 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.AnyWrapperMsgGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnyWrapperMsgGenerator_ESTest extends AnyWrapperMsgGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error((-1), 0, "Error - ");
      assertEquals("-1 | 0 | Error - ", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockException mockException0 = new MockException("");
      String string0 = AnyWrapperMsgGenerator.error((Exception) mockException0);
      assertEquals("Error - org.evosuite.runtime.mock.java.lang.MockThrowable: ", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.connectionClosed();
      assertEquals("Connection Closed", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AnyWrapperMsgGenerator anyWrapperMsgGenerator0 = new AnyWrapperMsgGenerator();
      assertEquals("Connection Closed", anyWrapperMsgGenerator0.connectionClosed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockException mockException0 = new MockException("Connection Closed");
      String string0 = AnyWrapperMsgGenerator.ioError(mockException0);
      assertEquals("Error - org.evosuite.runtime.mock.java.lang.MockThrowable: Connection Closed", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error("-2299 | -2299 | ");
      assertEquals("-2299 | -2299 | ", string0);
  }
}