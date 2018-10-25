package Test;

import demo.parallel.Complex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class ComplexTest  {


    @Test
    public void minus() {
        double realA = 4.8;
        double imageA =6.9;
        double realB = 5.8;
        double imageB = 9.4;

        Complex minuend = new Complex(realA,imageA);
        Complex subtrahend = new Complex(realB,imageB);
        Complex result = new Complex(realA - realB, imageA - imageB);

        assertTrue("Test minus() is failed",result.equal(minuend.minus(subtrahend)));


    }



    @Test
    public void division() {

        double realA = 7.8;
        double imageA = 9.9;
        double realB = 1.8;
        double imageB = 3.4;


        Complex divider = new Complex(realA,imageA);
        Complex dividend = new Complex(realB,imageB);
        Complex result = new Complex((realA * realB + imageA * imageB)/(realA * realB + imageA * imageB),
                (realB * imageA - realA * imageB)/(realA * realB + imageA * imageB));

        assertTrue("Test division() is failed",result.equal( divider.division(dividend)));

    }
}