package demo.parallel;
import static org.junit.Assert.assertEquals;

public class ComplexTest {
    @org.junit.Test

    public void minus1() throws Exception {

        Complex a = new Complex(23, 18);
        Complex b = new Complex(22, -3);
        a.minus1(b);
        assertEquals((double) 1, a.Re(), 0.0);
        assertEquals((double) 21, a.Im(), 0.0);
    }

    @org.junit.Test
    public void devide1() throws Exception {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(2, 3);
        double real = (4.0 * 2.0 + 5.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        double imag = (2.0 * 5.0 - 4.0 * 3.0) / (2.0 * 2.0 + 3.0 * 3.0);
        a.devide1(b);
        assertEquals(real, a.Re(), 0.0);
        assertEquals(imag, a.Im(), 0.0);
    }
}

