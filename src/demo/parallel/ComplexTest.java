package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diego on 08.09.2016.
 */
public class ComplexTest {
    private Complex numSin;
    private Complex numCos;

    @Before
    public void setUp() throws Exception {
        numSin = new Complex(3, 4).sin();
        numCos = new Complex(3, 4).cos();
    }

    @Test
    public void testSinAndCos() throws Exception {
        assertEquals(new Complex(3, 4).sin().getIm(), numSin.getIm(), 0.0001);
        assertEquals(new Complex(3,4).cos().getRe(), numCos.getRe(), 0.0001);
    }

}