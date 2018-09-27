package demo.parallel;
import org.junit.internal.builders.JUnit3Builder;
import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

import java.lang.reflect.Executable;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask {
    @Test
    public void minusTest(){
        Complex com1 = new Complex(5,5);
        Complex com2 = new Complex(1, 1);
        Complex expect = new Complex(4,4 );
        Complex result = com1.minus(com2);

        assertEquals(expect.getRe(),result.getRe());
        assertEquals(expect.getIm(),result.getIm());
    }

    @Test
    public void zeroDivide(){
        Complex com1 = new Complex(10,10);
        Complex com2 = new Complex(0,0);

        assertThrows(InvalidParameterException.class,() -> {com1.divide(com2);});
    }

    @Test
    public void divideTest(){
        Complex com1 = new Complex(2,2);
        Complex com2 = new Complex(2,2);
        Complex expect = new Complex(1,1);
        Complex result = com1.divide(com2);

        assertEquals(expect.getRe(),result.getRe());
        assertEquals(expect.getIm(),result.getIm());

    }
}
