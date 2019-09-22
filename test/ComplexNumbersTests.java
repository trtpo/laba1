import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumbersTests {

    @Test
    public void testSubstraction()
    {
        Complex a = new Complex(234.19, 748.46);
        Complex b = new Complex(-728.3, 65.75);
        Complex c = a.minus(b);
        Complex result = new Complex(962.49, 682.71);

        assertEquals(c, result);
    }

    @Test
    public void testSubstractionWithZero()
    {
        Complex a = new Complex(234.19, 748.46);
        Complex b = new Complex(0, 0);
        Complex c = a.minus(b);
        Complex result = new Complex(234.19, 748.46);

        assertEquals(c, result);
    }


    @Test
    public void testDivision()
    {
        Complex a = new Complex(1.2, 3.4);
        Complex b = new Complex(-5.6, 7.8);
        Complex c = a.divide(b);
        Complex result = new Complex(0.214751,  -0.308026);

        assertEquals(c, result);
    }

    @Test
    public void testDivisionByZero()
    {
        Complex a = new Complex(24.19, 78.46);
        Complex b = new Complex(0, 0);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            Complex c = a.divide(b);
        });
    }

    @Test
    public void testDivisionByOne()
    {
        Complex a = new Complex(24.19, 78.46);
        Complex b = new Complex(1, 0);
        Complex c = a.divide(b);
        Complex result = new Complex(24.19, 78.46);

        assertEquals(c, result);
    }

    @Test
    public void testExp()
    {
        Complex a = new Complex(1.3, 2.1);
        Complex c = a.exp();
        Complex result = new Complex(-1.85243,  3.16737);

        assertEquals(c, result);
    }

    @Test
    public void testLog()
    {
        Complex a = new Complex(-2.3, 1.1);
        Complex c = a.log();
        Complex result = new Complex(0.935901,  2.69549 );

        assertEquals(c, result);
    }

    @Test
    public void testLogOfZero()
    {
        Complex a = new Complex(0, 0);

        Assertions.assertThrows(ArithmeticException.class, () -> {
            Complex c = a.log();
        });
    }

    @Test
    public void testLogOfExp()
    {
        Complex a = new Complex(3.2, -2.7);
        Complex c = a.exp().log();
        Complex result = new Complex(3.2, -2.7);

        assertEquals(c, result);
    }

    @Test
    public void testSine()
    {
        Complex a = new Complex(2.65, -5.42);
        Complex c = a.sin();
        Complex result = new Complex(53.3120, 99.5636 );

        assertEquals(c, result);
    }

    @Test
    public void testArcsin()
    {
        Complex a = new Complex(-1.34, -1.75);
        Complex c = a.asin();
        Complex result = new Complex(-0.606068, -1.49998  );

        assertEquals(c, result);
    }

    @Test
    public void testArcsinOfSine()
    {
        Complex a = new Complex(-3.2, -4.1);
        Complex c = a.asin().sin();
        Complex result = new Complex(-3.2, -4.1);

        assertEquals(c, result);
    }

    @Test
    public void testСosine()
    {
        Complex a = new Complex(-1.5, -2.4);
        Complex c = a.cos();
        Complex result = new Complex(0.393083, -5.45254);

        assertEquals(c, result);
    }

    @Test
    public void testArccos()
    {
        Complex a = new Complex(1.3, -4.3);
        Complex c = a.acos();
        Complex result = new Complex(1.28386,  2.20572);

        assertEquals(c, result);
    }

    @Test
    public void testArccosOfCosine()
    {
        Complex a = new Complex(-2.1, 3.1);
        Complex c = a.acos().cos();
        Complex result = new Complex(-2.1, 3.1);

        assertEquals(c, result);
    }

    @Test
    public void testGeometricalIdentity()
    {
        double re = 1.23;
        double im = -0.345;

        Complex a = new Complex(re, im).sin();
        a = a.times(a);
        Complex b = new Complex(re, im).cos();
        b = b.times(b);
        Complex c = a.plus(b);
        Complex result = new Complex(1, 0);

        assertEquals(result, c);
    }

    @Test
    public void testSqrt()
    {
        Complex a = new Complex(-1.7, -2.2);
        Complex c = a.acos();
        Complex result = new Complex(2.1982283,  1.72514);

        assertEquals(c, result);
    }



}
