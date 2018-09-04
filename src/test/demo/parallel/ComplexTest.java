package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Для тестов использовались готовые примеры по ссылке:
// http://ru.solverbook.com/spravochnik/kompleksnye-chisla/operacii-nad-kompleksnymi-chislami/

class ComplexTest {

    @Test
    void plus() {
        Complex a = new Complex(-1.0, -3.0);
        Complex b = new Complex(3.0, 2.0);
        a.plus(b);
        assertEquals(2.0, a.getRe());
        assertEquals(-1.0, a.getIm());
    }

    @Test
    void minus() {
        Complex a = new Complex(17.0, -35.0);
        Complex b = new Complex(15.0, 5.0);
        a.minus(b);
        assertEquals(2.0, a.getRe());
        assertEquals(-40.0, a.getIm());
    }

    @Test
    void times() {
        Complex a = new Complex(1.0, -5.0);
        Complex b = new Complex(5.0, 2.0);
        a.times(b);
        assertEquals(15.0, a.getRe());
        assertEquals(-23.0, a.getIm());
    }

    @Test
    void divideBy() {
        Complex a = new Complex(2.0, 0.0);
        Complex b = new Complex(1.0, 2.0);
        a.divideBy(b);
        assertEquals(0.4, a.getRe());
        assertEquals(-0.8, a.getIm());
    }
}