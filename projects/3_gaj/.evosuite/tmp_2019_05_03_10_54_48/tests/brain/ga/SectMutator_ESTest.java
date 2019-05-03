/*
 * This file was automatically generated by EvoSuite
 * Fri May 03 15:58:32 GMT 2019
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.GAEnumAllelesSet;
import brain.ga.Genome;
import brain.ga.SectMutator;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SectMutator_ESTest extends SectMutator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Object object0 = new Object();
      vector0.add(object0);
      // Undeclared exception!
      try { 
        sectMutator0.mutate(vectorGenome0, 849.19295167);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.SectMutator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Genome genome0 = new Genome();
      // Undeclared exception!
      try { 
        sectMutator0.mutate(genome0, 304.0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // brain.ga.Genome cannot be cast to brain.ga.VectorGenome
         //
         verifyException("brain.ga.SectMutator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<VectorGenome> vector0 = new Vector<VectorGenome>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      vector0.add(vectorGenome0);
      sectMutator0.setAllelesSet(gAEnumAllelesSet0);
      Vector<VectorGenome> vector1 = new Vector<VectorGenome>();
      gAEnumAllelesSet0.setAlleles(vector1);
      // Undeclared exception!
      try { 
        sectMutator0.mutate(vectorGenome0, 0.0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<VectorGenome> vector0 = new Vector<VectorGenome>();
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      vector0.add(vectorGenome0);
      sectMutator0.setAllelesSet(gAEnumAllelesSet0);
      gAEnumAllelesSet0.setAlleles(vector0);
      sectMutator0.mutate(vectorGenome0, 0.0);
      int int0 = sectMutator0.mutate(vectorGenome0, 0.0);
      assertEquals(0, int0);
  }
}