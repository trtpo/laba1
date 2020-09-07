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
        assertTrue(new Complex(2.3,-1.6).pow(4).equals(new Complex(-46.7167,-40.1856)), "Test for degree 4.");
        assertTrue(new Complex(3.1,-4.2).pow(5).equals(new Complex(-145.71209,3873.55038)),"Test for degree 5.");
        assertTrue(new Complex(7,-11).pow(0).equals(new Complex(1,0)), "Test for degree 0.");
        assertTrue(new Complex(7.2,-11.6).pow(1).equals(new Complex(7.2,-11.6)), "Test for degree 1.");
    }
}