package demo.parallel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private Complex a;
    private Complex b;

    @Before
    public void createComplex() {
        a = new Complex(18.6, 2);
        b = new Complex(57, 3);
    }

    @Test
    public void subtractionTest(){
        a.subtract(b);
        assertEquals(18.6-57, a.getRe(), 0.0001);
        assertEquals(2-3, a.getIm(), 0.0001);
    }

    @Test
    public void divisionTest() {
        a.division(b);

        assertEquals((double)1777 / 5430, a.getRe(), 0.00001);
        assertEquals((double) 97 / 5430, a.getIm(), 0.00001);
    }
}