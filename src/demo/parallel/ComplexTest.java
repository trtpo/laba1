package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by pashaevsaev on 02.09.15.
 */
public class ComplexTest {

    @Test
    public void minusTest () {

        Complex c1;
        Complex c2;

        for(int i = 0; i < 100; i++) {

            double r1 = Math.random() % 10;
            double r2 = Math.random() % 10;

            double im1 = Math.random() % 10;
            double im2 = Math.random() % 10;

            c1 = new Complex(r1, im1);
            c2 = new Complex(r2, im2);

            if(Math.random()%2 == 1) {
                assertEquals(c1.minus(c2).real(), r1 - r2, Double.MIN_VALUE);
            } else {
                assertEquals(c1.minus(c2).imaginary(), im1 - im2, Double.MIN_VALUE);
            }
        }
    }

    @Test
    public void sinTest () {

        Complex c = new Complex(1,0);
        assertEquals(Complex.sin(c).real(),0, Double.MIN_VALUE);
    }

}
