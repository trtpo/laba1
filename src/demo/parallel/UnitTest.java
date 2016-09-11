package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class UnitTest {

    private Complex test;

    @Before
    public void init(){
        test = new Complex(0,0);
    }

    @After
    public void del() {
        test = null;
    }

    @Test
    public void checkSub() throws Exception {
        Complex res = test.sub(new Complex(2,1));
        assertEquals(-2, res.getRe(), Double.MIN_VALUE);
        assertEquals(-1, res.getIm(), Double.MIN_VALUE);
    }

    @Test
    public void sinTest () throws Exception{
        assertEquals(Complex.sin(test).getIm(),1, Double.MIN_VALUE);
    }
}