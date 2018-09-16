package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex result = new Complex(5,5).minus(new Complex(2,4));
        assertEquals(result, new Complex(3,1));
    }

    @org.junit.jupiter.api.Test
    void dividedBy() {
        Complex result = new Complex(5,6).dividedBy(new Complex(0,0));
        assertTrue(result.isNaN());
        result = new Complex(5,6).dividedBy(new Complex(1,1));
        assertEquals(result, new Complex(5.5,0.5));
    }
}