package demo.parallel;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Lexanni on 19.09.2017.
 */
class ComplexTest {

    @org.junit.jupiter.api.Test
    void equals() {
        double ReA = 2.5;
        double ImA = 3.1;
        double ReB = 1.1;
        double ImB = -5.4;

        Complex a = new Complex(ReA, ImA);
        Complex b = new Complex(ReB, ImB);

        assertEquals(true, a.equals(a));
        assertEquals(false, a.equals(b));

    }

    @org.junit.jupiter.api.Test
    void plus() {
        double ReA = 2.5;
        double ImA = 3.1;
        double ReB = 1.1;
        double ImB = -5.4;
        double ReC = ReA + ReB;
        double ImC = ImA + ImB;

        Complex a = new Complex(ReA, ImA);
        Complex b = new Complex(ReB, ImB);
        Complex c = a.plus(b);

        assertEquals(true, c.equals(new Complex(ReC, ImC)));
        assertEquals(false, a.equals(b));
    }

    @org.junit.jupiter.api.Test
    void cos() {
        assertEquals(true, (new Complex(0,0)).cos().equals(new Complex(1, 0)));
        assertEquals(true, (new Complex(Math.PI, 0)).cos().equals(new Complex(-1,0)));
    }

}