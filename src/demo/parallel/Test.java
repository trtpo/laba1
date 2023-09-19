package demo.parallel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class Test {
    @org.junit.jupiter.api.Test
    public void testMinus(){
        Complex a = new Complex(3, 5);
        Complex b = new Complex(1,2);

        Complex result =a.minus(b);

        assertEquals(2, result.getRe());
        assertEquals(3, result.getIm());
    }

}
