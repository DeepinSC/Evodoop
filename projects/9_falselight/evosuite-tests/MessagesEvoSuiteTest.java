/*
 * This file was automatically generated by EvoSuite
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MessagesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Messages.send("", "", "", "", "");
  }

  @Test
  public void test1()  throws Throwable  {
      Messages messages0 = new Messages();
      assertNotNull(messages0);
  }
}
