import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        assertTrue(new Complex(10.3,2.1).minus(new Complex(7.9,-4)).equals(new Complex(2.4,6.1)), "Test for simple subtraction #1.");
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }

    @org.junit.jupiter.api.Test
    void getCos() {
        assertTrue(new Complex(Math.PI /6,0).getCos().equals(new Complex(Math.sqrt(3)/2,0)),"Test for simple cos(z) with arg = PI/6");
        assertTrue(new Complex(2*Math.PI/3 ,0).getCos().equals(new Complex(-0.5,0)),"Test for simple cos(z) with arg =2PI/3");
    }

    @org.junit.jupiter.api.Test
    void pow() {
    }
}