package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    private final double DELTA = 1e-15;

   @Test
   public void testDeMoivres() throws Exception {
       Complex c;

       c = new Complex(1, 1).deMoivres(2);
       assertEquals(c.getRe(), 0, DELTA);
       assertEquals(c.getIm(), 2, DELTA);

       c = new Complex(3, 4).deMoivres(3);
       assertEquals(c.getRe(), Math.pow(5, 3) * Math.cos(3 * Math.atan2(4, 3)), DELTA);
       assertEquals(c.getIm(), Math.pow(5, 3) * Math.sin(3 * Math.atan2(4, 3)), DELTA);
   }
}