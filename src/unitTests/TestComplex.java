package unitTests;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestComplex {

    @Test
    public void testSubtract() {
        Complex complex=new Complex(2,2);
        complex.subtract(new Complex(2,1));
        assertEquals(0,complex.getRe());
        assertEquals(1,complex.getIm());
    }

    @Test
    public void testDivide() {
        Complex complex=new Complex(2,2);
        complex.divide(new Complex(2,1));
        assertEquals(1.2,complex.getRe(),0.1);
        assertEquals(0.4,complex.getIm(),0.1);
    }

}
