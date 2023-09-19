package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Unit {
    @Test
    public void TestMinus()
    {
        Complex exp = new Complex(1, 1);
        Complex real = new Complex(2, 3).minus(new Complex(1,2));
        assertEquals(exp, real);
    }



}
