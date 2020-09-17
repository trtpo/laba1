package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private Complex a, b;

    @Before
    public void init() {
        a = new Complex(3, 2);
        b = new Complex(8, 5);
    }

    @Test
    public void minus() {
        assertEquals(34.0, a.minus(b).lengthSQ(), 0);
    }

}
