package tests;

import demo.parallel.Complex;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class JUnitTests {
    private Complex complexNumberOne;
    private Complex complexNumberTwo;

    @Before
    public void setStartParametres() {
        complexNumberOne = new Complex(1, 3);
        complexNumberTwo = new Complex(2,4);
    }

    @Test
    public void  divisionByZero() {
        Complex resultComplex = complexNumberOne.division(new Complex(0,0));
        assertEquals("Impossible division by zero", resultComplex, null);
    }

    @Test
    public void divisionOfTwoComplex()  {
        Complex resultComplex = complexNumberOne.division(complexNumberTwo);
        Double real = resultComplex.getRealPart();
        Double imag = resultComplex.getImagPart();
        assertEquals( "Validation of the real part(division)", real.toString().substring(0, 3) ,"0.7");
        assertEquals("Validation of the imag part(division)", imag.toString().substring(0, 3), "0.1");
    }

    @Test
    public void divisionByZeroObject() {
        Complex resultComplex = complexNumberOne.division(null);
        assertEquals("Check division by zero object", resultComplex, null);
    }

    @Test
    public void tangentOfNormalNumber() {
        Complex resultComplex = complexNumberOne.tg();
        Double real = resultComplex.getRealPart();
        Double imag = resultComplex.getImagPart();
        assertEquals( "Validation of the real part(tangent)", real.toString().substring(0, 6), "0.0045");
        assertEquals("Validation of the imag part(tangent)", imag.toString().substring(0, 6), "1.0020");
    }
}
