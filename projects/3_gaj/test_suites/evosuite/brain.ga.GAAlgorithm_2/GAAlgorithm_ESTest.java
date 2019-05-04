/*
 * This file was automatically generated by EvoSuite
 * Sat May 04 05:49:00 GMT 2019
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.GAAlgorithm;
import brain.ga.Mutator;
import brain.ga.Population;
import brain.ga.RankSelector;
import brain.ga.SectMutator;
import brain.ga.Selector;
import brain.ga.SexualCrossover;
import brain.ga.UniformCrossover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GAAlgorithm_ESTest extends GAAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Population population0 = new Population();
      RankSelector rankSelector0 = new RankSelector();
      gAAlgorithm0.population = population0;
      gAAlgorithm0.setSelector(rankSelector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Population population0 = new Population();
      gAAlgorithm0.population = population0;
      gAAlgorithm0.setEvaluator((Evaluator) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      RankSelector rankSelector0 = new RankSelector();
      gAAlgorithm0.selector = (Selector) rankSelector0;
      Selector selector0 = gAAlgorithm0.getSelector();
      assertSame(selector0, rankSelector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      SectMutator sectMutator0 = new SectMutator();
      gAAlgorithm0.setMutator(sectMutator0);
      Mutator mutator0 = gAAlgorithm0.getMutator();
      assertSame(mutator0, sectMutator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      gAAlgorithm0.setCrossoverOperator(uniformCrossover0);
      SexualCrossover sexualCrossover0 = gAAlgorithm0.getCrossoverOperator();
      assertSame(sexualCrossover0, uniformCrossover0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      boolean boolean0 = gAAlgorithm0.done();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Mutator mutator0 = gAAlgorithm0.getMutator();
      assertNull(mutator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Selector selector0 = gAAlgorithm0.getSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      // Undeclared exception!
      try { 
        gAAlgorithm0.setEvaluator((Evaluator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.GAAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.step();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.evolve();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Evaluator evaluator0 = gAAlgorithm0.getEvaluator();
      assertNull(evaluator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      // Undeclared exception!
      try { 
        gAAlgorithm0.setSelector((Selector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.GAAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.initialize();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      SexualCrossover sexualCrossover0 = gAAlgorithm0.getCrossoverOperator();
      assertNull(sexualCrossover0);
  }
}
