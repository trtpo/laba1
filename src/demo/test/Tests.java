package demo.test;

import demo.parallel.Complex;
import static org.junit.Assert.assertTrue;

public class Tests {
    @org.junit.Test
    public void minus() throws Exception {
        Complex Number = new Complex(5,2);
        Complex Number2 = new Complex(3,1);
        Complex actual = Number.minus(Number2);
        Complex expected = new Complex(2,1);
        assertTrue("Test minus failed in method minus of class demo.parallel.Complex., in imaginary part.  5 - 3. Expected: 2", actual.GetIm() == expected.GetIm());
        assertTrue("Test minus failed in method minus of class demo.parallel.Complex., in real part. 2i - i. Expected: i", actual.GetRe() == expected.GetRe());




    }

    @org.junit.Test
    public void exp() throws Exception {
        Complex Number = new Complex(5,2);
        Complex Number2 = new Complex(5,2);
        double real = Math.exp(Number.GetRe()) * Math.cos(Number.GetIm());
        double imag = Math.exp(Number.GetRe()) * Math.sin(Number.GetIm());
        Number.SetRe(real);
        Number.SetIm(imag);
        Number2.exp();
        assertTrue("Test exp failed in method exp of class demo.parallel.Complex., in real part", Number.GetRe() == Number2.GetRe());
        assertTrue("Test exp failed in method exp of class demo.parallel.Complex., in imaginary part", Number.GetIm() == Number2.GetIm());
    }

}
