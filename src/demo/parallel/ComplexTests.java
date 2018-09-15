package demo.parallel;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTests {
    @Test
    public void divide_dividerIsZero_throwParameterException() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);

        //Assert
        assertThrows(InvalidParameterException.class,() -> {a.divide(b);});
    }
    @Test
    public void divide_correctCase_actualAssertExpected() {
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, -1);
        Complex expect = new Complex(-1.5,-0.5);

        //Act
        Complex actual = a.divide(b);

        //Assert
        assertEquals(expect.getRealPart(),actual.getRealPart());
        assertEquals(expect.getImaginaryPart(),actual.getImaginaryPart());
    }

    @Test
    public void minus_correctCase_actualAssertExpected() {
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, -1);
        Complex expect = new Complex(-3,2);

        //Act
        Complex actual = a.minus(b);

        //Assert
        assertEquals(expect.getRealPart(), actual.getRealPart());
        assertEquals(expect.getImaginaryPart(), actual.getImaginaryPart());
    }

}
