/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.server.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.server.Handler;
import dsachat.server.net.SecServer;
import dsachat.share.InputListener;
import java.io.IOException;
import java.net.Socket;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SecServerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      secServer0.getClientPort();
      assertEquals("Thread-3163", secServer0.getName());
      assertEquals(3179L, secServer0.getId());
  }

  @Test
  public void test1()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      Handler handler0 = new Handler();
      secServer0.removeInputListener((InputListener) handler0);
      assertEquals("Thread[Thread-3167,5,Test Execution]", secServer0.toString());
      assertEquals(3183L, secServer0.getId());
  }

  @Test
  public void test2()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      boolean boolean0 = secServer0.isConnected();
      assertEquals("Thread[Thread-3171,5,Test Execution]", secServer0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      Handler handler0 = new Handler();
      secServer0.addInputListener((InputListener) handler0);
      assertEquals("Thread-3175", secServer0.getName());
      assertEquals(false, secServer0.isConnected());
  }

  @Test
  public void test4()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      // Undeclared exception!
      try {
        secServer0.send((Object) "en_CA");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Socket socket0 = new Socket();
      SecServer secServer0 = new SecServer(socket0);
      secServer0.run();
      assertEquals("Thread-3183", secServer0.getName());
      assertEquals(3199L, secServer0.getId());
  }
}