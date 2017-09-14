import org.junit.Test;
import demo.parallel.Complex;

public class ComplexTest {
    @Test
    public void testSubtraction() {
        Complex c1 = new Complex(2,2);
        Complex c2 = new Complex(4,3);

        c1.minus(c2);

        assert((c1.re == -2 && c1.im == -1));
    }

    @Test
    public void testDivision() {
        Complex c1 = new Complex(7,-4);
        Complex c2 = new Complex(3,2);

        c1.div(c2);

        assert((c1.re == 1 && c1.im == -2));
    }

}
