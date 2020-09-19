package demo.parallel;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class ComplexTest {

    private Complex a;
    private Complex b;

    @Before
    public void initTest() {
        a = new Complex(1,1);
        b = new Complex(2,2);
    }

    @After
    public void afterTest() {
        a = null;
        b = null;
    }

    @org.junit.Test
    public void minus() {
       assertEquals(2, b.minus(a).lengthSQ(), 0);
    }

}