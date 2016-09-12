package test

import demo.parallel.Complex
import org.junit.Test

/**
 * Created by Work on 12.09.2016.
 */
class ComplexTest extends GroovyTestCase {
    @Test
    void testSubstract() {
        Complex a = new Complex(1,1);
        a.substract(new Complex(1,1));
        assertEquals(new Complex(0,0), a);
    }

    @Test
    void testEquals() {
        Complex a = new Complex(1,1);
        Complex b = new Complex(1,1);
        assertEquals(a.getRe(), b.getRe());
        assertEquals(b.getRe(), b.getRe());
    }
}
