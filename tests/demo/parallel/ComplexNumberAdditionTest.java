package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberAdditionTest {

    Complex a = new Complex(7, 4);
    Complex b = new Complex(-2, 1);

    @Test
    public void additionResultShouldBeCorrect() {

        a.plus(b);
        assertArrayEquals(new double[] {5, 5}, new double[] {a.getRe(), a.getIm()}, 0.001);
    }
}
