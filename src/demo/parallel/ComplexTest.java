package demo.parallel;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ComplexTest {
    private Complex a;
    private Complex b;
    private Complex c;

    @Before
    public void setStartParametres() {
         a = new Complex(3, 4);
         b = new Complex(2, 7);
         c = new Complex(-5, 0);
    }

    @Test
    public void testMinus() throws Exception {
        Complex result = a.minus(b);
        assertTrue(result.getRe() == 1.0);
        assertTrue(result.getIm() == -3.0);
    }

    @Test
    public void divisionOfTwoComplex1()  {
            Complex resultComplex = a.dividedInto(b);
            Double real = resultComplex.getRe();
            Double image = resultComplex.getIm();
            assertEquals("Validation of the real part(division)", real.toString().substring(0, 6) ,"0.6415");
            assertEquals("Validation of the imag part(division)", image.toString().substring(0, 6), "-0.245");
    }

    @Test
    public void divisionOfTwoComplex2()  {
        Complex resultComplex = a.dividedInto(c);
        Double real = resultComplex.getRe();
        Double image = resultComplex.getIm();
        assertEquals("Validation of the real part(division)", real.toString().substring(0, 4) ,"-0.6");
        assertEquals("Validation of the imag part(division)", image.toString().substring(0, 4), "-0.8");
    }
}