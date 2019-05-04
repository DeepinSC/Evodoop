/*
 * This file was automatically generated by EvoSuite
 * Sat May 04 05:47:47 GMT 2019
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.Genome;
import brain.ga.UniformCrossover;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UniformCrossover_ESTest extends UniformCrossover_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      UniformCrossover uniformCrossover1 = new UniformCrossover();
      Genome genome0 = new Genome();
      Genome genome1 = null;
      // Undeclared exception!
      try { 
        uniformCrossover1.cross((Genome) null, genome0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // brain.ga.Genome cannot be cast to brain.ga.VectorGenome
         //
         verifyException("brain.ga.UniformCrossover", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("");
      vector0.add("");
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(evaluator0).evaluate(any(brain.ga.Genome.class));
      vector0.add("/!V}Sm(");
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      Genome genome1 = uniformCrossover0.cross(genome0, vectorGenome0);
      vectorGenome0.compareTo(genome0);
      uniformCrossover0.cross(genome1, genome0);
      Genome genome2 = uniformCrossover0.cross(genome0, vectorGenome0);
      uniformCrossover0.cross(genome2, genome2);
      uniformCrossover0.cross(genome1, vectorGenome0);
      // Undeclared exception!
      try { 
        uniformCrossover0.cross(genome2, (Genome) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.UniformCrossover", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      VectorGenome vectorGenome1 = new VectorGenome();
      uniformCrossover0.cross(vectorGenome0, vectorGenome1);
      Vector<Object> vector1 = new Vector<Object>();
      Evaluator evaluator1 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      vector1.add(object0);
      VectorGenome vectorGenome2 = new VectorGenome(vector1, evaluator1);
      VectorGenome vectorGenome3 = new VectorGenome();
      vector1.add((Object) vectorGenome3);
      Evaluator evaluator2 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vectorGenome2.evaluator = evaluator2;
      Genome genome0 = uniformCrossover0.cross(vectorGenome2, vectorGenome2);
      // Undeclared exception!
      try { 
        uniformCrossover0.cross(genome0, vectorGenome3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Integer> vector0 = new Vector<Integer>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.setSize(3332);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Integer integer0 = new Integer(3332);
      vector0.add(integer0);
      vectorGenome0.setGene(3332, integer0);
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      Evaluator evaluator1 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vectorGenome0.evaluator = evaluator1;
      uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      // Undeclared exception!
      uniformCrossover0.cross(vectorGenome0, genome0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.add((Object) uniformCrossover0);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      VectorGenome vectorGenome1 = (VectorGenome)uniformCrossover0.cross(genome0, genome0);
      assertEquals(1, vectorGenome1.getGenesCount());
      assertNotSame(vectorGenome1, genome0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      VectorGenome vectorGenome0 = new VectorGenome();
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      assertNotSame(genome0, vectorGenome0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.add((Object) uniformCrossover0);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      VectorGenome vectorGenome1 = (VectorGenome)uniformCrossover0.cross(genome0, genome0);
      assertEquals(1, vectorGenome1.getGenesCount());
      assertNotSame(vectorGenome1, vectorGenome0);
  }
}
