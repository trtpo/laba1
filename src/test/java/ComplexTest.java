package test.java;

import demo.parallel.Complex;
import junit.framework.TestCase;
import org.junit.Assert;

class ComplexTest extends TestCase {

    @org.junit.jupiter.api.Test
    void Difference_5minus7I_minus_1plus2I_4minus9IReturned() {
        Complex minuend = new Complex(5,-7);
        Complex subtrahend = new Complex(1,2);

        Complex result = minuend.minus(subtrahend);

        Assert.assertEquals(new Complex(4,-9),result);
    }

    @org.junit.jupiter.api.Test
    void Difference_7minus3I_minus_6minus2I_1minusIReturned() {
        Complex minuend = new Complex(7,-3);
        Complex subtrahend = new Complex(6,2);

        Complex result = minuend.minus(subtrahend);

        Assert.assertEquals(new Complex(1,-1),result);
    }

    @org.junit.jupiter.api.Test
    void Division_5minus7I_divide_1plus2I_minus1point8minus3point4IReturned() {
        Complex minuend = new Complex(5,-7);
        Complex subtrahend = new Complex(1,2);

        Complex result = minuend.divide(subtrahend);

        Assert.assertEquals(new Complex(-1.8,-3.4),result);
    }

    @org.junit.jupiter.api.Test
    void Division_7minus3I_divide_6minus2I_1point2minus0point1IReturned() {
        Complex minuend = new Complex(5,-7);
        Complex subtrahend = new Complex(1,2);

        Complex result = minuend.divide(subtrahend);

        Assert.assertEquals(new Complex(1.2,-0.1),result);
    }
}