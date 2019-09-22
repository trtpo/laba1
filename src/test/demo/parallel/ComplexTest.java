package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    Complex number, result;

    @Before
    public void init() {
        number = new Complex(4, 4);
        result = null;
    }

    @Test
    public void subtract() {
        Complex subtrahend = new Complex(4,0);

        result = number.subtract(subtrahend);

        assertEquals("Check subtraction correct result", result, new Complex(0, 4));
    }

    @Test
    public void calcComplexСonjugate() {
        result = number.calcComplexСonjugate();

        assertEquals("Check complex-conjugate correct result", result, new Complex(4, -4));
    }
}
