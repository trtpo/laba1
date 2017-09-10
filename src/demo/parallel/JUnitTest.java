package demo.parallel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    private Complex testNum;

    @Before
    public void setTestNum() throws Exception {
        testNum = new Complex(7,7);
    }

    @Test
    public void getRe() throws Exception {
        assertEquals(testNum.getRe(), 7, 0);
    }

    @Test
    public void getIm() throws Exception {
        assertEquals(testNum.getIm(), 7, 0);
    }

    @Test
    public void plus() throws Exception {
        testNum.plus(new Complex(10,10));
        assertEquals(testNum.getRe(),17,0);
        assertEquals(testNum.getIm(),17,0);
    }

    @Test
    public void minus() throws Exception {
        testNum.minus(new Complex(10,10));
        assertEquals(testNum.getRe(),-3,0);
        assertEquals(testNum.getIm(),-3,0);
    }
}
