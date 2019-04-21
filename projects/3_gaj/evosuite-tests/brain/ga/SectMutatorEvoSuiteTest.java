/*
 * This file was automatically generated by EvoSuite
 */

package brain.ga;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import brain.ga.Evaluator;
import brain.ga.GAEnumAllelesSet;
import brain.ga.Genome;
import brain.ga.SectMutator;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SectMutatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      sectMutator0.setAllelesSet((GAEnumAllelesSet) null);
  }

  @Test
  public void test1()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      VectorGenome vectorGenome0 = new VectorGenome();
      int int0 = sectMutator0.mutate((Genome) vectorGenome0, (-0.009802801872989764));
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      SectMutator sectMutator0 = new SectMutator();
      Vector<VectorGenome> vector0 = new Vector<VectorGenome>();
      VectorGenome vectorGenome0 = new VectorGenome();
      vector0.add(vectorGenome0);
      VectorGenome vectorGenome1 = new VectorGenome((Vector) vector0, (Evaluator) null);
      // Undeclared exception!
      try {
        sectMutator0.mutate((Genome) vectorGenome1, (double) 0);
        fail("Expecting exception: NoSuchMethodError");
      } catch(NoSuchMethodError e) {
        /*
         * org.evosuite.runtime.Random.nextDouble()D
         */
      }
  }
}
