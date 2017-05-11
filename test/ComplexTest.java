import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anna on 11.05.17.
 */
public class ComplexTest {
    @Test
    public void testMinus(){
        Complex a = new Complex(5, 10);
        Complex b = new Complex(2, 7);

        Complex c = a.my_minus(b);

        Complex d = new Complex(3, 3);

        Assert.assertEquals(c, d);
    }
}
