package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {



    @Test
    public void subtract() {
        Complex a = new Complex(2,-3);
        Complex b = new Complex(-2,5);

        Complex actualResult = a.subtract(b);
        Complex expectedResult = new Complex(4, -8);
        this.assertComplexEquals(expectedResult, actualResult);
    }

    @Test
    public void divide() {
        Complex a = new Complex(2,-3);
        Complex b = new Complex(-4,6);

        Complex actualResult = a.divide(b);
        Complex expectedResult = new Complex(-0.5, 0);
        this.assertComplexEquals(expectedResult, actualResult);
    }

    public void assertComplexEquals(Complex expectedResult, Complex actualResult){
        assertEquals(expectedResult.getRealPart(),actualResult.getRealPart(),0);
        assertEquals(expectedResult.getImagPart(),actualResult.getImagPart(),0);
    }
}
