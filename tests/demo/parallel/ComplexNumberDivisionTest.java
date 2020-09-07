package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberDivisionTest {

    Complex a = new Complex(56,7);
    Complex b = new Complex(4,-3);

    @Test
    public void DivisionResultShouldBeCorrect() {

        a.by(b);
        assertArrayEquals(new double[] {8.12, 7.84}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }
}
