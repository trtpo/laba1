package demo.parallel;

import junit.framework.Assert;
import org.junit.jupiter.api.*;


public class ComplexTest {

    Complex actual;

    @BeforeEach
    void setUp() {
        actual = new Complex(1,2);
    }

    @Test
    void sin() {
        Complex expected = new Complex(0.8414709848078965,3.626860407847019);
        Assert.assertTrue(expected.equals(actual.sin()));
    }
}
