package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by gardi on 05.09.2016.
 */
public class ComplexTest {

    private Complex complex;

    @org.junit.Before
    public void setUp() {
        complex = new Complex(0,0);
    }
    @org.junit.Test
    public void cos() throws Exception {
        assertEquals(1,complex.cos(new Complex(0,0)).getRe(),1);
        assertEquals(1.97,complex.cos(new Complex(10,2)).getIm(),0.01);
    }

}