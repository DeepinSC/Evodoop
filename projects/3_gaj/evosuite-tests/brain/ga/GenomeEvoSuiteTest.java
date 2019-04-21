/*
 * This file was automatically generated by EvoSuite
 */

package brain.ga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import brain.ga.Evaluator;
import brain.ga.Genome;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GenomeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Genome genome0 = new Genome();
      Evaluator evaluator0 = genome0.getEvaluator();
      assertNull(evaluator0);
  }

  @Test
  public void test1()  throws Throwable  {
      Genome genome0 = new Genome();
      genome0.initialize();
  }

  @Test
  public void test2()  throws Throwable  {
      Genome genome0 = new Genome();
      // Undeclared exception!
      try {
        genome0.getScore();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
