package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {
    private Complex complex;

    @Before
    public void init() {
        complex = new Complex(13, 13);
    }

    @After
    public void tearDown() {
        complex = null;
    }

    @Test
    public void minus() {
        complex.minus(new Complex(3, 5));
        assertEquals(10, complex.getRe(), 0.1);
        assertEquals(8, complex.getIm(), 0.1);
    }

    @Test
    public void grade() {
        complex.grade(2);
        assertEquals(0, complex.getRe(), 0.1);
        assertEquals(338, complex.getIm(), 0.1);
    }
}
