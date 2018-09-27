package demo.parallel;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Executable;
import java.security.InvalidParameterException;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTests {
    @Test
    public void div_dividerIsZero_functionTest() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);
        assertThrows(InvalidParameterException.class,() -> {a.div(b);});
    }
    @Test
    public void div_functionTest() {
        Complex a = new Complex(-17, 1);
        Complex b = new Complex(8, -5);
        Complex expect = new Complex(-1.5842696629213484,-0.8651685393258427);
        Complex actual = a.div(b);
        assertEquals(expect.getRealPart(),actual.getRealPart());
        assertEquals(expect.getImaginaryPart(),actual.getImaginaryPart());
    }
    @Test
    public void minus_functionTest() {
        Complex a = new Complex(-7, 12);
        Complex b = new Complex(9, -61);
        Complex expect = new Complex(-16,73);
        Complex actual = a.minus(b);
        assertEquals(expect.getRealPart(), actual.getRealPart());
        assertEquals(expect.getImaginaryPart(), actual.getImaginaryPart());
    }
}