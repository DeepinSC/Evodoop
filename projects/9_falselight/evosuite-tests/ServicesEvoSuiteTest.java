/*
 * This file was automatically generated by EvoSuite
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServicesEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      String string0 = services_HTTP_Result0.toString();
      assertNotNull(string0);
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("6+", (-1384));
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : **URL Mal Form\u00E9** (java.net.MalformedURLException: Invalid port number :-1384) **.\n****", services_HTTP_Result0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      Services services0 = new Services();
      assertNotNull(services0);
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 0);
          String string0 = services_SIMPLE_Result0.toString();
          assertNotNull(string0);
          assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : **Erreur : java.lang.SecurityException: Security manager blocks (java.net.SocketPermission 127.0.0.1:0 connect,resolve)\njava.lang.Thread.getStackTrace(Thread.java:1479)\norg.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)\njava.lang.SecurityManager.checkConnect(SecurityManager.java:1034)\njava.net.Socket.connect(Socket.java:524)\njava.net.Socket.connect(Socket.java:478)\njava.net.Socket.<init>(Socket.java:375)\njava.net.Socket.<init>(Socket.java:189)\nServices.testSMTP(Services.java:174)\nsun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\nsun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)\nsun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)\njava.lang.reflect.Method.invoke(Method.java:597)\norg.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)\norg.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)\norg.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)\norg.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)\norg.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)\njava.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)\njava.util.concurrent.FutureTask.run(FutureTask.java:138)\njava.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)\njava.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)\njava.lang.Thread.run(Thread.java:662)\n**.\n****", string0);
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }
}
