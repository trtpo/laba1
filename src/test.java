/**
 * Created by kames on 14.09.2017.
 *
 */
import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class test {
    private Complex Num;

    @Before
    public void init() throws Exception {
        Num = new Complex(10,17);
    }
    @Test
    public void getReal() throws Exception {
        assertEquals(Num.getReal(), 10, 0);
    }
    @Test
    public void getImag() throws Exception {
        assertEquals(Num.getImag(), 17, 0);
    }
    @Test
    public void plus() throws Exception {
        Num.plus(new Complex(5,8));
        assertEquals(Num.getReal(),15,0);
        assertEquals(Num.getImag(),25,0);
    }
    @Test
    public void times() throws Exception {
        Num.times(new Complex(3,3));
        assertEquals(Num.getReal(),-21,0);
        assertEquals(Num.getImag(),81,0);
    }
    @Test
    public void substr() throws Exception {
        Num.substr(new Complex(6,10));
        assertEquals(Num.getReal(),4,0);
        assertEquals(Num.getImag(),7,0);
    }
    @Test
    public void divide() throws Exception {
        Num.div(new Complex(2,2));
        assertEquals(Num.getReal(),6.75,0.01);
        assertEquals(Num.getImag(),1.75,0.01);
    }
}
