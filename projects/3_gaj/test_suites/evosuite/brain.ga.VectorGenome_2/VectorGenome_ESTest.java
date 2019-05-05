/*
 * This file was automatically generated by EvoSuite
 * Sat May 04 05:51:42 GMT 2019
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VectorGenome_ESTest extends VectorGenome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Integer integer0 = new Integer((-1613));
      vector0.add((Object) integer0);
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      vectorGenome0.setGene(0, vector0);
      assertEquals("[(this Collection)]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.add((Object) null);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      int int0 = vectorGenome0.getGenesCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      vector0.add((Object) null);
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Object object0 = vectorGenome0.getGene(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Integer integer0 = new Integer((-1613));
      vector0.add((Object) integer0);
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      Object object0 = vectorGenome0.getGene(0);
      assertEquals((-1613), object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome((Vector) null, evaluator0);
      // Undeclared exception!
      try { 
        vectorGenome0.getGenesCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.VectorGenome", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome((Vector) null, evaluator0);
      // Undeclared exception!
      try { 
        vectorGenome0.getGene(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.VectorGenome", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome(vector0, evaluator0);
      // Undeclared exception!
      try { 
        vectorGenome0.getGene(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      VectorGenome vectorGenome0 = new VectorGenome();
      int int0 = vectorGenome0.getGenesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Evaluator evaluator0 = mock(Evaluator.class, new ViolatedAssumptionAnswer());
      VectorGenome vectorGenome0 = new VectorGenome((Vector) null, evaluator0);
      // Undeclared exception!
      try { 
        vectorGenome0.setGene((-1), (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brain.ga.VectorGenome", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      VectorGenome vectorGenome0 = new VectorGenome();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        vectorGenome0.setGene(731, object0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 731
         //
         verifyException("java.util.Vector", e);
      }
  }
}