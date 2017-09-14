package demo.parallel;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testComplex  {
    private Complex a;
    private Complex b;

    @Before
    public void testSetup() throws Exception {
        a = new Complex(10, 4);
        b = new Complex(3, 7);
    }

    @Test
    public void minusTest() throws Exception {
        a.minus(b);
        assertEquals("Wrong complex number after minus operation", 7, a.getReal(), 0.001);
        assertEquals("Wrong complex number after minus operation", -3, a.getImagine(), 0.001);
    }

    @Test
    public void plusTest() throws Exception {
        a.plus(b);
        assertEquals("Wrong complex number after plus operation", 13, a.getReal(), 0.001);
        assertEquals("Wrong complex number after plus operation", 11, a.getImagine(), 0.001);
    }

    @Test
    public void timesTest() throws Exception {
        a.times(b);
        assertEquals("Wrong complex number after times operation", 2, a.getReal(), 0.001);
        assertEquals("Wrong complex number after times operation", 82, a.getImagine(), 0.001);
    }

    @Test
    public void inversionTest() throws Exception {
        a.inversion();
        assertEquals("Wrong complex number after inversion operation", 10, a.getReal(), 0.001);
        assertEquals("Wrong complex number after inversion operation", -4, a.getImagine(), 0.001);
    }
}
