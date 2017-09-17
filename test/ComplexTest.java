import demo.parallel.Complex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex max, min, zero, one_two;

    @Before
    public void setUp() throws Exception {
        max = new Complex(Double.MAX_VALUE, Double.MAX_VALUE);
        min = new Complex(Double.MIN_VALUE, Double.MIN_VALUE);
        zero = new Complex(0,0);
        one_two = new Complex(1, 2);
    }

    @After
    public void tearDown() throws Exception {
        max = null;
        min = null;
        zero = null;
        one_two = null;
    }

    @Test
    public void not_MaxValue() throws Exception {
        max.not();
        assertEquals("negation operation test real part in not function Complex class. Input data: Double.MAX_VALUE, expectation: Double.MAX_VALUE", max.getReal(), Double.MAX_VALUE, 0);
        assertEquals("negation operation test imaginary part in not function Complex class. Input data: Double.MAX_VALUE, expectation: Double.MAX_VALUE * (-1)", max.getImag(), Double.MAX_VALUE * (-1), 0);
    }

    @Test
    public void not_MinValue() throws Exception {
        min.not();
        assertEquals("negation operation test real part in not function Complex class. Input data: Double.MIN_VALUE, expectation: Double.MIN_VALUE", min.getReal(), Double.MIN_VALUE, 0);
        assertEquals("negation operation test imaginary part in not function Complex class. Input data: Double.MIN_VALUE, expectation: Double.MIN_VALUE * (-1)", min.getImag(), Double.MIN_VALUE * (-1), 0);
    }

    @Test
    public void not_Zero() throws Exception {
        zero.not();
        assertEquals("negation operation test real part in not function Complex class. Input data: 0, expectation: 0", zero.getReal(), 0, 0);
        assertEquals("negation operation test imaginary part in not function Complex class. Input data: 0, expectation: 0", zero.getImag(), 0, 0);
    }

    @Test
    public void not_OneTwo() throws Exception {
        one_two.not();
        assertEquals("negation operation test real part in not function Complex class. Input data: 1, expectation: 1", one_two.getReal(), 1, 0);
        assertEquals("negation operation test imaginary part in not function Complex class. Input data: 2, expectation: -2", one_two.getImag(), -2, 0);
    }
}