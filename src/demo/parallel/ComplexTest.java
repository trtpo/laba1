package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ComplexTest {
    private Complex a, b;


    @Before
    public void init() throws Exception {
        a = new Complex(1, 2);
        b = new Complex(10, -12);
    }


    @Test
    public void subtractTest() throws Exception {
        a.subtract(b);
        assertTrue("Error in subtract method",  a.getRe() == -9 && a.getIm() == 14 );

    }

    @Test
    public void divide() throws Exception {
        a.divide(b);
        assertTrue("Error in divide method, 97  string in Complex file",  a.getRe() == -0.05737704918032787 && a.getIm() == 0.13114754098360656  );

    }



}