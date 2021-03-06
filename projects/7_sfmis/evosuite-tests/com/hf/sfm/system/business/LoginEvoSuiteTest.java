/*
 * This file was automatically generated by EvoSuite
 */

package com.hf.sfm.system.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.hf.sfm.system.business.Login;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LoginEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Login login0 = new Login();
      login0.init();
      assertEquals("", login0.getServletInfo());
  }

  @Test
  public void test1()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try {
        login0.doGet((HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Login login0 = new Login();
      login0.destroy();
      assertEquals("", login0.getServletInfo());
  }
}
