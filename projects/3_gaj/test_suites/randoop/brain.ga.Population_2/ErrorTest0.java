import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        brain.ga.Genome genome2 = population0.selectNextGenome();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        brain.ga.Population population0 = new brain.ga.Population();
        java.lang.Class<?> wildcardClass1 = population0.getClass();
        brain.ga.Genome genome2 = population0.selectNextGenome();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        brain.ga.Population population0 = new brain.ga.Population();
        java.util.List list1 = population0.genoms;
        population0.sort();
        brain.ga.Evaluator evaluator3 = population0.getEvaluator();
        brain.ga.Genome genome4 = population0.selectNextGenome();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        brain.ga.Population population0 = new brain.ga.Population();
        int int1 = population0.getGenomeSize();
        population0.setGenomeSize((int) (byte) 10);
        brain.ga.Selector selector4 = population0.getSelector();
        brain.ga.Genome genome5 = population0.selectNextGenome();
    }
}

