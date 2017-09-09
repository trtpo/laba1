package demo.parallel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {

    private Complex z1;
    private Complex z2;

    @BeforeEach
    public void init(){
        z1 = new Complex(4, 8);
        z2 = new Complex(- 5, 4);
    }

    @Test
    public void subtraction()
    {
        Complex result = z1.minus(z2);
        assertEquals(result.getReal(), 9.0, "Real part of result in subtraction is wrong");
        assertEquals(result.getImage(), 4.0, "Imaginary part of result in subtraction is wrong");
    }

    @Test
    public void division()
    {
        Complex result = z1.divide(z2);
        assertEquals(result.getReal(), 12.0 / 41.0, "Real part of result in division is wrong");
        assertEquals(result.getImage(), -56.0 / 41.0, "Imaginary part of result in division is wrong");
    }
}
