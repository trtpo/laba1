package demo.parallel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {
    @Test
    public  void testMinusOperation(Complex a, Complex b, Complex result) {
        assertEquals(a.minus(b).getIm(), result.getIm(), "Error!");
        assertEquals(a.minus(b).getRe(), result.getRe(), "Error!");
    }
}
