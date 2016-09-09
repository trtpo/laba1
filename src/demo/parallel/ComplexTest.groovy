package demo.parallel
import org.junit.Test;

class ComplexTest extends groovy.util.GroovyTestCase {

    @Test
    public void test() {
        Complex a = new Complex(1,3);
        Complex b = new Complex(1,0);
        Complex c = new Complex(0,3);
        Complex d = new Complex(1,-3);
        System.out.print("Testing new operations. Result: ")
        assertTrue(a.equal(b.plus(c)))
        assertTrue(a.equal(d.conjugation()))
    }
}