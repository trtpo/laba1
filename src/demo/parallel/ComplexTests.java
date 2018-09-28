package demo.parallel;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ComplexTests {

    @Test
    public void divide_dividerIsZero_throwParameterException() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);

        //Assert
        assertEquals(a.minus(b), new Complex(1,1));
    }

    @Test
    public void test_division() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);

        //Assert
        assertEquals(b.division(a), new Complex(0,0));
    }

}