/*
 * This file was automatically generated by EvoSuite
 */

package dsachat.gm.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dsachat.gm.gui.MultiHeroTreeModel;
import dsachat.gm.gui.ValueHolder;
import dsachat.share.hero.Hero;
import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.metal.MetalTreeUI;
import javax.swing.tree.TreePath;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.dom.DOMElement;
import org.dom4j.tree.DefaultDocument;
import org.evosuite.testcase.CodeUnderTestException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MultiHeroTreeModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      MetalTreeUI metalTreeUI0 = new MetalTreeUI();
      BasicTreeUI.TreeModelHandler basicTreeUI_TreeModelHandler0 = metalTreeUI0.new TreeModelHandler();
      multiHeroTreeModel0.removeTreeModelListener((TreeModelListener) basicTreeUI_TreeModelHandler0);
  }

  @Test
  public void test1()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("5[=tO;PP4-xOLsV=");
      String string0 = (String)multiHeroTreeModel0.getRoot();
      assertEquals("5[=tO;PP4-xOLsV=", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("5[=tO;PP4-xOLsV=");
      MetalTreeUI metalTreeUI0 = new MetalTreeUI();
      BasicTreeUI.TreeModelHandler basicTreeUI_TreeModelHandler0 = metalTreeUI0.new TreeModelHandler();
      multiHeroTreeModel0.addTreeModelListener((TreeModelListener) basicTreeUI_TreeModelHandler0);
  }

  @Test
  public void test3()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
  }

  @Test
  public void test4()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      multiHeroTreeModel0.valueForPathChanged((TreePath) null, (Object) "Sklaventod");
  }

  @Test
  public void test5()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      Namespace namespace0 = Namespace.get("Sklaventod");
      DOMElement dOMElement0 = new DOMElement("Sklaventod", namespace0);
      DefaultDocument defaultDocument0 = new DefaultDocument((Element) dOMElement0);
      Hero hero0 = new Hero((Document) defaultDocument0);
      ValueHolder valueHolder0 = new ValueHolder("Sklaventod", hero0);
      Object object0 = multiHeroTreeModel0.getChild((Object) valueHolder0.parent, 109);
      assertNull(object0);
  }

  @Test
  public void test6()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      // Undeclared exception!
      try {
        multiHeroTreeModel0.getChild((Object) "Sklaventod", 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0 >= 0
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      Object object0 = multiHeroTreeModel0.getChild((Object) "Dialog", 109);
      assertNull(object0);
  }

  @Test
  public void test8()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      JTree jTree0 = new JTree(multiHeroTreeModel0.heros);
      int int0 = multiHeroTreeModel0.getChildCount((Object) jTree0);
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("5[=tO;PP4-xOLsV=");
      int int0 = multiHeroTreeModel0.getChildCount((Object) "5[=tO;PP4-xOLsV=");
      assertEquals(0, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("cB8");
      int int0 = multiHeroTreeModel0.getChildCount((Object) "300");
      assertEquals(0, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      int int0 = multiHeroTreeModel0.getIndexOfChild((Object) "North", (Object) "Sklaventod");
      assertEquals((-1), int0);
  }

  @Test
  public void test12()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      int int0 = multiHeroTreeModel0.getIndexOfChild((Object) "Sklaventod", (Object) "Sklaventod");
      assertEquals((-1), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("Sklaventod");
      boolean boolean0 = multiHeroTreeModel0.isLeaf((Object) "Dialog");
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      MultiHeroTreeModel multiHeroTreeModel0 = new MultiHeroTreeModel("5[=tO;PP4-xOLsV=");
      boolean boolean0 = multiHeroTreeModel0.isLeaf((Object) "5[=tO;PP4-xOLsV=");
      assertEquals(false, boolean0);
  }
}
