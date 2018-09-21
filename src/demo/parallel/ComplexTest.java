package demo.parallel;

import static org.junit.Assert.*;
import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {


    final Complex a=new Complex(-1, 4);
    final Complex b=new Complex(1, 2);
    private static double DELTA = 0.01;


    @org.junit.Test
    public void plus() {
        final Complex c= a.plus(b);
        final String errorMessage = "Expected and result values are different";
        Assert.assertEquals(errorMessage, c.getImag(), 6,DELTA);

    }

    @org.junit.Test
    public void times() {

        final Complex c= a.times(b);
        final String errorMessage = "Expected and result values are different";
        Assert.assertEquals(errorMessage, c.getImag(), 2,DELTA);
        Assert.assertEquals(errorMessage, c.getReal(), -9,DELTA);
    }


}