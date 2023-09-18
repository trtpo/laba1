package test;

import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComplexTest {

    @Test
    public void MinusReturnOk(){
        Complex expect = new Complex(1, 1);
        Complex real = new Complex(2, 3).minus(new Complex(1, 2));
        assertEquals(expect, real);
    }

    @Test
    public void DivideReturnOk(){
        Complex expect = new Complex(3, 0);
        Complex real = new Complex(6, 3).divide(new Complex(2, 1));
        assertEquals(expect, real);
    }

    @Test(expected = ArithmeticException.class)
    public void DivideReturnException(){
        Complex division = new Complex(4, 3);
        Complex divider = new Complex(0, 0);
        division.divide(divider);
    }

}
