package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex z1 = new Complex(2, 5);
        Complex z2 = new Complex(-3, 4);
        Complex zResult = z1.minus(z2);

        assertEquals(zResult.lengthSQ(), new Complex(5, 1).lengthSQ());
    }
}