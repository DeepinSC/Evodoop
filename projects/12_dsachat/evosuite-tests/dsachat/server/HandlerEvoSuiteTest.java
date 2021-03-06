/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.client.net.SecClient;
import dsachat.server.Handler;
import dsachat.share.ConnectionEndpoint;
import dsachat.share.InputEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Handler handler0 = new Handler();
      SecClient secClient0 = new SecClient();
      handler0.removeConnection((ConnectionEndpoint) secClient0);
      assertEquals("Thread-241", secClient0.getName());
      assertEquals(257L, secClient0.getId());
  }

  @Test
  public void test1()  throws Throwable  {
      Handler handler0 = new Handler();
      SecClient secClient0 = new SecClient();
      InputEvent inputEvent0 = new InputEvent((ConnectionEndpoint) secClient0, (Object) "");
      handler0.handleInput(inputEvent0);
      assertEquals("dsachat.share.InputEvent[source=Thread[Thread-252,5,Test Execution]]", inputEvent0.toString());
      assertEquals("Thread[Thread-252,5,Test Execution]", secClient0.toString());
  }
}
