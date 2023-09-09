package test;


import org.junit.Assert;
import org.junit.Test;
import demo.parallel.Complex;

public class ComplexNumbersOperationsTest {
    @Test
    public void testDivsion() {
        Complex actual = new Complex(4, 2).div(new Complex(2,0));
        Complex expect = new Complex(2, 1);
        Assert.assertTrue( actual.equals(expect));

        actual = new Complex(4, 2).div(new Complex(2,4));
        expect = new Complex(0.8, -0.6);
        Assert.assertTrue( actual.equals(expect));

    }

    @Test
    public void testSubstitution() {
        Complex actual = new Complex(4, 2).sub(new Complex(2,4));
        Complex expect = new Complex(2, -2);
        Assert.assertTrue( actual.equals(expect));

        actual = new Complex(25, 13).sub(new Complex(44,44));
        expect = new Complex(-19, -31);
        Assert.assertTrue( actual.equals(expect));
    }


}
