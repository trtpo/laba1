package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberMultiplicationTest {

    Complex a = new Complex(1, 4);
    Complex b = new Complex(2, 3);

    @Test
    public void multiplicationResultShouldBeCorrect() {

        a.times(b);
        assertArrayEquals(new double[] {-10, 11}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }

}