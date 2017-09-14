package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComplexTest{
    private Complex startComplex, resultComplex;

    @Test
    public void testSub() throws Exception {
        startComplex = new Complex(5,-6);
        Complex assertComplex = new Complex(8,-8);
        resultComplex = startComplex.sub(new Complex(-3,2));
        assertTrue("Test Context.sub() failed.", assertComplex.equals(resultComplex));
    }

    @Test
    public void testDiv() throws Exception {
        startComplex = new Complex(-2,1);
        Complex assertComplex = new Complex(-1.5,-0.5);
        resultComplex = startComplex.div(new Complex(1, -1));
    }

}