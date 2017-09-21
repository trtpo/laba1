package demo.parallel;

/**
 * Created by Алексей Кузьменко on 22.09.2017.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {
    private Complex Num;

    @Before
    public void init() throws Exception {
        Num = new Complex(-5,10);
    }
    @Test
    public void getRe() throws Exception {
        assertEquals(Num.getRe(), -5, 0);
    }
    @Test
    public void getIm() throws Exception {
        assertEquals(Num.getIm(), 10, 0);
    }
    @Test
    public void plus() throws Exception {
        Num.plus(new Complex(5,-10));
        assertEquals(Num.getRe(),0,0);
        assertEquals(Num.getIm(),0,0);
    }
    @Test
    public void times() throws Exception {
        Num.times(new Complex(2,1));
        assertEquals(Num.getRe(),-20,0);
        assertEquals(Num.getIm(),15,0);
    }
    @Test
    public void sub() throws Exception {
        Num.sub(new Complex(2,2));
        assertEquals(Num.getRe(),-7,0);
        assertEquals(Num.getIm(),8,0);
    }
    @Test
    public void divide() throws Exception {
        Num.div(new Complex(-5,10));
        assertEquals(Num.getRe(),1,0.01);
        assertEquals(Num.getIm(),0,0.01);
    }
}
