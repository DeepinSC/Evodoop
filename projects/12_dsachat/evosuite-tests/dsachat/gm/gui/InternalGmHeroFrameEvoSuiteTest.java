/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.gm.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.gm.gui.GmFrame;
import dsachat.gm.gui.InternalGmHeroFrame;
import dsachat.share.hero.Hero;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InternalGmHeroFrameEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Vector<Hero> vector0 = new Vector<Hero>();
      InternalGmHeroFrame internalGmHeroFrame0 = null;
      try {
        internalGmHeroFrame0 = new InternalGmHeroFrame((GmFrame) null, vector0, "Heros");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Vector<Hero> vector0 = new Vector<Hero>();
      InternalGmHeroFrame internalGmHeroFrame0 = null;
      try {
        internalGmHeroFrame0 = new InternalGmHeroFrame((GmFrame) null, vector0, "mdWJ6*8CR'");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
