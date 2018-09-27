package demo.parallel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComplexTests {
    @Test
    public void divide_correctCase_actualAssertExpected() {
        Complex a = new Complex(4, 3);
        Complex b = new Complex(2, -2);
        Complex expect = new Complex(0.25,1.75);
        //Act
        Complex actual = a.divide(b);
        //Assert
        assertEquals(expect.getRealPart(),actual.getRealPart());
        assertEquals(expect.getImaginaryPart(),actual.getImaginaryPart());
    }
    @Test
    public void minus_correctCase_actualAssertExpected() {
        Complex a = new Complex(4, 3);
        Complex b = new Complex(2, -2);
        Complex expect = new Complex(2,5);
        //Act
        Complex actual = a.minus(b);
        //Assert
        assertEquals(expect.getRealPart(), actual.getRealPart());
        assertEquals(expect.getImaginaryPart(), actual.getImaginaryPart());
    }
}
