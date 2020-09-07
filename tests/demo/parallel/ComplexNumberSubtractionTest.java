package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberSubtractionTest {

    Complex a = new Complex(10, 1);
    Complex b = new Complex(8, 4);

    @Test
    public void subtractionResultShouldBeCorrect() {

        a.minus(b);
        assertArrayEquals(new double[] {2, -3}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }
}
