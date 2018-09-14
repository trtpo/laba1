package demo.parallel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
    private Complex complex;
    private Complex complex1;
    private static final double DELTA = 1e-15;
    @Before
    public void init(){
        complex = new Complex(1,1);
        complex1 = new Complex(2,2);
    }



    @Test
    public void multiplication() {
        Assert.assertEquals(complex1.get_im(),complex.multiplication(2.0).get_im(),DELTA);
        Assert.assertEquals(complex1.get_re(),complex.get_re(),DELTA);
    }

    @Test
    public void minus() {
        Assert.assertEquals(0,complex.minus(complex).get_im(),DELTA);
        Assert.assertEquals(0,complex.get_re(),DELTA);
    }
}
