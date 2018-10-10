
package demo.parallel;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.Before;



public class JTest {
    private Complex complex;
    private Complex complex1;
    private static final double DELTA = 1e-15;
    @Before
    public void init(){
        complex = new Complex(1,1);
        complex1 = new Complex(2,2);
    }


    @org.junit.Test
    public void substract() {
        Assert.assertEquals(0,complex.substract(complex).get_im(),DELTA);
        Assert.assertEquals(0,complex.get_re(),DELTA);
    }


}