package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by andreysavich on 9/5/15.
 */
public class ComplexTest {

    static final int iterationsCount = 100;

    @org.junit.Test
    public void testCos() throws Exception {

        Complex testComplexValue = new Complex(1,0);
        assertEquals(Complex.cos(testComplexValue).getReal(),0,Double.MIN_VALUE);
    }

    @org.junit.Test
    public void testMinus() throws Exception {

        Complex firstComplex;
        Complex secondComplex;

        for (int i = 0;i < iterationsCount; i++) {

            double firstReal = Math.random() % 10;
            double secondReal = Math.random() % 10;

            double firstImage = Math.random() % 10;
            double secondImage = Math.random() % 10;

            firstComplex = new Complex(firstReal, firstImage);
            secondComplex = new Complex(secondReal, secondImage);

            if (Math.random()%2 == 1){
                assertEquals(firstComplex.minus(secondComplex).getReal(), firstReal - secondReal, Double.MIN_VALUE);
            }
            else {
                assertEquals(firstComplex.minus(secondComplex).getImage(), firstImage - secondImage, Double.MIN_VALUE);
            }

        }
    }
}