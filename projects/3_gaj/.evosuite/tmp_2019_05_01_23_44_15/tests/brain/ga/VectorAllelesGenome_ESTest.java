/*
 * This file was automatically generated by EvoSuite
 * Thu May 02 04:54:00 GMT 2019
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import brain.ga.VectorAllelesGenome;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VectorAllelesGenome_ESTest extends VectorAllelesGenome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VectorAllelesGenome vectorAllelesGenome0 = new VectorAllelesGenome();
      assertEquals(0, vectorAllelesGenome0.getGenesCount());
  }
}