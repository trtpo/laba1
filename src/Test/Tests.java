package Test;

import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests
{
    @Test
    public void minus()
    {
        Complex complex1=new Complex(16,14);
        Complex complex2=new Complex(8,2);
        Complex complex3=new Complex(8,12);
        Assertions.assertEquals(complex1.minus(complex2),complex3);
    }
    @Test
    public void plus()
    {
        Complex complex1=new Complex(7,3);
        Complex complex2=new Complex(9,7);
        Complex complex3=new Complex(16,10);
        Assertions.assertEquals(complex1.plus(complex2),complex3);
    }
}
