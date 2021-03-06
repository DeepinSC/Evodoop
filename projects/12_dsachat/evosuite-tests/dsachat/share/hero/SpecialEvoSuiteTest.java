/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.share.hero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.share.hero.Special;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SpecialEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Special special0 = Special.AUSWEICHEN_I;
      String string0 = special0.getName();
      assertEquals("Ausweichen I", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Special special0 = Special.AUSWEICHEN_I;
      int int0 = special0.getBaseMod();
      assertEquals((-3), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Special special0 = Special.AUSWEICHEN_I;
      String string0 = special0.getMode();
      assertEquals("passive", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      Special special0 = new Special("", "", (-3));
      assertEquals(-3, special0.getBaseMod());
  }
}
