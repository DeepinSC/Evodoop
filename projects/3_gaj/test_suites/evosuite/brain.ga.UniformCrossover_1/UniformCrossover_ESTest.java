/*
 * This file was automatically generated by EvoSuite
 * Sat May 04 05:33:05 GMT 2019
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
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      VectorGenome vectorGenome1 = new VectorGenome();
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome1);
      assertNotSame(genome0, vectorGenome0);
      assertNotSame(genome0, vectorGenome1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Integer> vector0 = new Vector<Integer>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.setSize(3332);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Integer integer0 = new Integer(3332);
      vector0.add(integer0);
      Genome genome0 = uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      uniformCrossover0.cross(vectorGenome0, vectorGenome0);
      // Undeclared exception!
      uniformCrossover0.cross(vectorGenome0, genome0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      // Undeclared exception!
      try { 
        uniformCrossover0.cross((Genome) null, (Genome) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Genome genome0 = new Genome();
      // Undeclared exception!
      try { 
        uniformCrossover0.cross((Genome) null, genome0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UniformCrossover uniformCrossover0 = new UniformCrossover();
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Vector<Object> vector1 = new Vector<Object>();
      Evaluator evaluator1 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      vector1.add(object0);
      VectorGenome vectorGenome1 = new VectorGenome(vector1, evaluator1);
      // Undeclared exception!
      try { 
        uniformCrossover0.cross(vectorGenome1, vectorGenome0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }
}
