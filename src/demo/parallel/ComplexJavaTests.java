package demo.parallel;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Executable;
import java.security.InvalidParameterException;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexJavaTests {
    @Test
    public void divide_dividerIsZero_throwParameterException() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);
        //Assert
        assertThrows(InvalidParameterException.class,() -> {a.div(b);});
    }
    @Test
    public void divide_correctCase_actualAssertExpected() {
        Complex a = new Complex(-2, 1);
        Complex b = new Complex(1, -1);
        Complex expect = new Complex(-1.5,-0.5);
        //Act
        Complex actual = a.div(b);
        //Assert
        assertEquals(expect.getRealPart(),actual.getRealPart());
        assertEquals(expect.getImaginaryPart(),actual.getImaginaryPart());
    }
    @Test
     void minus_correctCase_actualAssertExpected() {
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