package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static org.junit.Assert.assertEquals;

/**
 * Created by iliag on 12.09.2016.
 */

public class ComplexUnitTest {
    private Complex numSin;
    private Complex numCos;

    @Before
    public void setUp() throws Exception {
        numSin = new Complex(3, 4).sin();
        numCos = new Complex(3, 4).cos();
    }

    @Test
    public void testSinAndCos() throws Exception {
        assertEquals(-27.0168132580039, numSin.getIm(), 0.0001);
        assertEquals(-27.0349456030, numCos.getRe(), 0.0001);
    }

    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(ComplexUnitTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}



