package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by u on 08.09.2016.
 */
public class ComplexTest {
    private Complex num;
    @Before
    public void setUp() throws Exception {
        num = new Complex(4, 5);
    }

    @Test
    public void func() throws Exception {
        assertEquals(-1, num.func(new Complex(5, 4)).getReal(), 0.00001);
        assertEquals(3, num.func(new Complex(5, -2)).getImage(), 0.00001);
    }
}