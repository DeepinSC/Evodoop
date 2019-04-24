/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.share;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.share.ChallReq;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ChallReqEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ChallReq challReq0 = new ChallReq((Object) "", 405, "", "");
      String string0 = (String)challReq0.getCh();
      assertNotNull(string0);
      assertEquals(405, challReq0.getMod());
  }

  @Test
  public void test1()  throws Throwable  {
      ChallReq challReq0 = new ChallReq((Object) "", 405, "", "");
      String string0 = challReq0.getResponseTo();
      assertNotNull(string0);
      assertEquals(405, challReq0.getMod());
  }

  @Test
  public void test2()  throws Throwable  {
      ChallReq challReq0 = new ChallReq((Object) "", 405, "", "");
      int int0 = challReq0.getMod();
      assertEquals(405, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      ChallReq challReq0 = new ChallReq((Object) "", 405, "", "");
      String string0 = challReq0.getTo();
      assertNotNull(string0);
      assertEquals(405, challReq0.getMod());
  }
}
