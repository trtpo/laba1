import demo.parallel.Complex;
import org.junit.*;

public class OperationsTest {
    @Test
    public void minusTest() {
        Complex a = new Complex(5, 2);
        Complex b = new Complex(7, 1);

        Complex c = new Complex(-2, 1);
        Assert.assertTrue(c.equals(a.minus(b)));
    }

    @Test
    public void divisionTest() {
        Complex a = new Complex(3, 5);
        Complex b = new Complex(4, 2);

        Complex c = new Complex(1.1, 0.7);
        Complex result = a.divided(b);

        Assert.assertTrue(c.equals(result));
    }
}
