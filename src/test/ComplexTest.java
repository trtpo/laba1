package test;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void sub() throws Exception {
        Complex subtrahend = new Complex(10, 10);
        Complex[] expectedArray = {new Complex(0, 0), new Complex(-10, -10), new Complex(0, -20)};
        Complex[] startArray = {new Complex(10, 10), new Complex(0, 0), new Complex(10, -10)};
        for(int i = 0; i < startArray.length; i++)
            assertTrue(expectedArray[i].equals(startArray[i].sub(subtrahend)));
    }

    @Test
    public void div() throws Exception {
        Complex divident = new Complex(10, 10);
        Complex[] expectedArray = {new Complex(10, 10), new Complex(-6, 2), new Complex(6, -2)};
        Complex[] startArray = {new Complex(1, 0), new Complex(-1, -2), new Complex(1, 2)};
        for(int i = 0; i < startArray.length; i++)
            assertTrue(expectedArray[i].equals(divident.div(startArray[i])));
    }

    @Test(expected = ArithmeticException.class)
    public void divByZero() throws ArithmeticException {
        Complex divident = new Complex(1, 1);
        Complex divider = new Complex(0, 0);
        divident.div(divider);
    }

    @Test
    public void getConjugateComplexNum() throws Exception {
        Complex[] expectedArray = {new Complex(1, 2), new Complex(1, -2), new Complex(1, 0)};
        Complex[] startArray = {new Complex(1, -2), new Complex(1, 2), new Complex(1, 0)};
        for(int i = 0; i < startArray.length; i++)
            assertTrue(expectedArray[i].equals(startArray[i].getConjugateComplexNum()));
    }

}
