package tests;
import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class FractalUnitTests {
    @Test
    void minus() {
        Complex number1 = new Complex(4, 7);
        Complex number2 = new Complex(2, 1);
        assertEquals(40, number1.minus(number2).lengthSQ(),0);
    }
    void divide(){
        Complex number1=new Complex(5,8);
        Complex number2 = new Complex(2,1);
        assertNotEquals("Error to Divide",0,number1.plus(number2).lengthSQ());

    }

}
