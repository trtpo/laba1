import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void divides() {
        demo.parallel.Complex a = new demo.parallel.Complex(10, 4);
        demo.parallel.Complex b = new demo.parallel.Complex(5, 2);
        demo.parallel.Complex c = new demo.parallel.Complex(2, 0);
        demo.parallel.Complex d = a.divides(b);
        assertEquals("Проверка реальной части",c.re,d.re,0);
        assertEquals("Проверка мнимой части",c.im,d.im,0);
    }

    @Test
    public void minus() {
        demo.parallel.Complex a = new demo.parallel.Complex(10, 4);
        demo.parallel.Complex b = new demo.parallel.Complex(5, 2);
        demo.parallel.Complex c = new demo.parallel.Complex(5, 2);
        demo.parallel.Complex d = a.minus(b);
        assertEquals("Проверка реальной части",c.re,d.re,0);
        assertEquals("Проверка мнимой части",c.im,d.im,0);
    }

    @Test
    public void cos() {
        demo.parallel.Complex a = new demo.parallel.Complex(10, 4);
        demo.parallel.Complex c = new demo.parallel.Complex(-22, 14);
        demo.parallel.Complex d = a.cos();
        assertEquals("Проверка реальной части",c.re,d.re,1);
        assertEquals("Проверка мнимой части",c.im,d.im,1);
    }
}