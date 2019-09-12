import demo.parallel.Complex;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex a = new Complex(12.23,312.32);
        a=a.minus(new Complex(-0.88,2.12));
        assertEquals(a.getRe(),13.2,0.1);
        assertEquals(a.getIm(),310.2,0.1);
    }

    @org.junit.jupiter.api.Test
    void division() {
        Complex a = new Complex(12.23,312.32);
        a=a.division(new Complex(3,2.12));
        assertEquals(a.getRe(),51.78,0.1);
        assertEquals(a.getIm(),67.5   ,0.1);
    }

    @org.junit.jupiter.api.Test
    void divisionException() {
        try {
            Complex a = new Complex(12.23, 312.32);
            a.division(new Complex(0, 0));
            assertEquals(1,2);
        }
        catch(ArithmeticException e) {
            assertEquals("Incorrect division", e.getMessage());
        }
    }
}