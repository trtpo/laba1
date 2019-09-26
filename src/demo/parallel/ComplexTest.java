package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {

    @org.junit.Test
    public void minus() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(5, 5);

        double real = 1;
        double imag = 1;

        for (long i = 0; i < 30000; i++) {
            assertNotEquals(a.lengthSQ(), Math.sqrt(real * real + imag * imag));
            a.minus(b);
            real -= 5;
            imag -= 5;
        }
    }

    @org.junit.Test
    public void divide() {
            Complex a = new Complex(1,0);
            Complex b = new Complex(2, 0);
            assertNotEquals(1.0, a.divide(b).lengthSQ());
    }
}