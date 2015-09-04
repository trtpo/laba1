package demo.parallel;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anton on 04.09.2015.
 */
public class TestComplex {


    @Test
    public void testPlus() throws Exception {
        Complex com1=new Complex(1,1);
        Complex com2=new Complex(2,2);
        com1.plus(com1);
        assertTrue(com1.GetReal()== com2.GetReal());
        assertTrue(com1.GetImaginary() == com2.GetImaginary());
        com1.plus(com2);
        assertFalse(com1.GetReal()== com2.GetReal());
        assertFalse(com1.GetImaginary() == com2.GetImaginary());
    }



    @Test
    public void testMinus () throws Exception{

        Complex comp1;
        Complex comp2;

        for(int i = 0; i < 100; i++) {

            double r1 = Math.random() % 10;
            double r2 = Math.random() % 10;

            double im1 = Math.random() % 10;
            double im2 = Math.random() % 10;

            comp1 = new Complex(r1, im1);
            comp2 = new Complex(r2, im2);

            if(Math.random()%2 == 1) {
                assertEquals(comp1.minus(comp2).GetReal(), r1 - r2, Double.MIN_VALUE);
            } else {
                assertEquals(comp1.minus(comp2).GetImaginary(), im1 - im2, Double.MIN_VALUE);
            }
        }
    }


}
