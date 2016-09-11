package demo.parallel;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Class that tests operations of Complex class
 */
public class UnitTest {
    @Test
    public void testDivision() {
        Complex complex = new Complex(0,0);
        assertTrue(complex.divide(new Complex(1,1)).isEqual(new Complex(0,0)));
    }

    @Test
    public void testEquality() {
        Complex complex = new Complex(1,2);
        assertTrue(complex.isEqual(new Complex(1,2)));
    }
}
