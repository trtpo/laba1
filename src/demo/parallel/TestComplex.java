package demo.parallel;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestComplex {


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
