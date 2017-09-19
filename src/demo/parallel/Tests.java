package demo.parallel;

import static org.junit.Assert.assertEquals;

class Tests {
    @org.junit.jupiter.api.Test
    void equals() {
        double ReA = 2.6, ImA = 3, ReB = 1.4, ImB = -5.2;
        Complex a = new Complex(ReA, ImA);
        Complex b = new Complex(ReB, ImB);
        assertEquals(true, a.equals(a));
        assertEquals(false, a.equals(b));
    }

    @org.junit.jupiter.api.Test
    void plus() {
        double ReA = 2.6, ImA = 3, ReB = 1.4, ImB = -5.2, ReC = ReA + ReB, ImC = ImA + ImB;
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