package test;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by lexvenim on 9/8/2016.
 */
public class ComplexTest {
    private Complex testNum;

    @Before
    public void init() throws Exception {
       testNum = new Complex(11,11);
    }

    @Test
    public void getRe() throws Exception {
        assertEquals(testNum.getRe(), 11, 0);
    }

    @Test
    public void getIm() throws Exception {
        assertEquals(testNum.getIm(), 11, 0);
    }

    @Test
    public void minus() throws Exception {
        testNum.minus(new Complex(10,10));
        assertEquals(testNum.getRe(),1,0);
        assertEquals(testNum.getIm(),1,0);
    }

    @Test
    public void divide() throws Exception {
        testNum.divide(new Complex(2,6));
        assertEquals(testNum.getRe(),2.2,0.1);
        assertEquals(testNum.getIm(),-1.1,0.1);
    }

}