package test.demo.parallel;

import static org.junit.Assert.*;
import org.junit.*;
import demo.parallel.Complex;

public class ComplexTest {
    private Complex a, b;
    private double DELTA = 0.01;

    @Before
    public void setUp() {
        a = new Complex(1, 3);
        b = new Complex(5, -4);
    }

    @Test
    public void sub() throws Exception {
        Complex result = a.sub(b);
        assertEquals("Subtract operation failed in method 'sub' of class demo.parallel.Complex. Wrong real part of the result.",
                -4, result.getRe(), 0);
        assertEquals("Subtract operation failed in method 'sub' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                7, result.getIm(), 0);
    }

    @Test
    public void div() throws Exception {
        Complex result = a.div(b);
        assertEquals("Division operation failed in method 'div' of class demo.parallel.Complex. Wrong real part of the result.",
                -0.17, result.getRe(), DELTA);
        assertEquals("Division operation failed in method 'div' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                0.34, result.getIm(), DELTA);
    }

    @Test
    public void sinA() throws Exception {
        Complex result = a.sin();
        assertEquals("Sin operation failed in method 'sin' of class demo.parallel.Complex. Wrong real part of the result.",
                8.47, result.getRe(), DELTA);
        assertEquals("Sin operation failed in method 'sin' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                -5.8, result.getIm(), DELTA);
    }

    @Test
    public void sinB() throws Exception {
        Complex result = b.sin();
        assertEquals("Sin operation failed in method 'sin' of class demo.parallel.Complex. Wrong real part of the result.",
                -26.18, result.getRe(), DELTA);
        assertEquals("Sin operation failed in method 'sin' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                -13.48, result.getIm(), DELTA);
    }

    @Test
    public void cosA() throws Exception {
        Complex result = a.cos();
        assertEquals("Cos operation failed in method 'cos' of class demo.parallel.Complex. Wrong real part of the result.",
                5.43, result.getRe(), DELTA);
        assertEquals("Cos operation failed in method 'cos' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                7.48, result.getIm(), DELTA);
    }

    @Test
    public void cosB() throws Exception {
        Complex result = b.cos();
        assertEquals("Cos operation failed in method 'cos' of class demo.parallel.Complex. Wrong real part of the result.",
                7.74, result.getRe(), DELTA);
        assertEquals("Cos operation failed in method 'cos' of class demo.parallel.Complex. Wrong imaginary part of the result.",
                27.13, result.getIm(), DELTA);
    }

}