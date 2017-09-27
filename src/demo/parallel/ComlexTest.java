package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ComlexTest{
    private Complex startComplex, resultComplex;

    @Test
    public void testSub() throws Exception {
        startComplex = new Complex(5,-6);
        Complex assertComplex = new Complex(8,-8);
        resultComplex = startComplex.sub(new Complex(-3,2));
        assertTrue("Test Context.div() failed.", assertComplex.equals(resultComplex));
    }


}