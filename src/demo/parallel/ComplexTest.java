
package sample;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void divide() {
        Complex a = new Complex(55.5, 1.5);
        Complex b = new Complex(10.2, -2.5);
        a.divide(b);

        assertEquals(5.09, a.getRealPart(), 0.01);
        assertEquals(1.39, a.getImaginaryPart(), 0.01);
    }

    @Test
    void cube() {
        Complex a = new Complex(1.1, 1.2);
        a.cube();
        assertEquals(-3.42, a.getRealPart(), 0.01);
        assertEquals(2.62, a.getImaginaryPart(), 0.01);
    }
}
