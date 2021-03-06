/*
 * This file was automatically generated by EvoSuite
 * Sun May 05 03:15:50 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.ContractDetails;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContractDetails_ESTest extends ContractDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      ContractDetails contractDetails1 = new ContractDetails(contractDetails0.m_summary, "W;eNFG0l", (String) null, 0.0, "+1-W8/!:q6Xv%<", (String) null, 0, (String) null, "5u'69~)~u[F\"5o", (String) null, (String) null, (String) null, (String) null, (String) null, "q/=zLmIedIV-3");
      assertEquals(0.0, contractDetails0.m_minTick, 0.01);
      assertFalse(contractDetails1.m_nextOptionPartial);
      assertEquals(0.0, contractDetails1.m_coupon, 0.01);
  }
}
