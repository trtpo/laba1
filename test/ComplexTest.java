import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ComplexTest {
    private Complex a;
    private Complex b;

    @BeforeEach
    void NewComplex() {
        a = new Complex(7.98, 12);
        b = new Complex(19.2, 3.4);
    }

    @Test
    public void subtraction_test() {
        Complex test = a;
        test.subtraction(b);
        Assertions.assertEquals(7.98 - 19.2, test.getRe(), 0.001);
        Assertions.assertEquals(12 - 3.4, test.getIm(), 0.001);
    }

    @Test
    public void division_test() {
        Complex test = a;
        test.division(b);
        Assertions.assertEquals(194.016/380.2, test.getRe(), 0.000001);
        Assertions.assertEquals(203.268/380.2, test.getIm(), 0.000001);
    }

}
