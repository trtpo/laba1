package demo.parallel;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class ComplexTest {
    Complex complex;

    @Before
    public void init(){
        complex = new Complex(1,1);

    }
    @Test
    public void minus(){
        Assert.assertEquals(0,complex.minus(complex).getIm(),1e-15);
        Assert.assertEquals(0,complex.getIm(),1e-15);

    }

}
