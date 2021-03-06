/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.share.hero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.share.hero.Talent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TalentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Talent talent0 = new Talent("1H'eITMY~u3'WH~", 359, "1H'eITMY~u3'WH~");
      assertNotNull(talent0);
      
      String string0 = talent0.getName();
      assertNotNull(string0);
      assertEquals("1H'eITMY~u3'WH~ ('eITMY~) 359", talent0.toString());
      assertEquals(359, talent0.getValue());
  }

  @Test
  public void test1()  throws Throwable  {
      Talent talent0 = new Talent("1H'eITMY~u3'WH~", 359, "1H'eITMY~u3'WH~");
      assertNotNull(talent0);
      
      String string0 = talent0.toString();
      assertEquals("1H'eITMY~u3'WH~ ('eITMY~) 359", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Talent talent0 = new Talent("1H'eITMY~u3'WH~", 359, "1H'eITMY~u3'WH~");
      assertNotNull(talent0);
      
      int int0 = talent0.getValue();
      assertEquals(359, int0);
      assertEquals("1H'eITMY~u3'WH~ ('eITMY~) 359", talent0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Talent talent0 = new Talent("1H'eITMY~u3'WH~", 359, "1H'eITMY~u3'WH~");
      assertNotNull(talent0);
      
      String string0 = talent0.getChallenge();
      assertEquals("1H'eITMY~u3'WH~ ('eITMY~) 359", talent0.toString());
      assertNotNull(string0);
      assertEquals("'eITMY~", string0);
  }
}
