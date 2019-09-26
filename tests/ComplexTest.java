import demo.parallel.Complex;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexAddTest {
    @Test
    public void adding() {
        Complex number1 = new Complex(1, 1),
                number2 = new Complex(3, 4);
        number2.plus(number1);
        assertEquals(number2.getReal(), 4);
        assertEquals(number2.getImaginary(), 5);
    }
}
