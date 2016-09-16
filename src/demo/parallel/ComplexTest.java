package demo.parallel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Admin on 16.09.2016.
 */

public class ComplexTest {
    private Complex a;
    private Complex b;
    private Complex c;

    @Before
    public void setUp() throws Exception {
        a = new Complex(1,0);
        b = new Complex(0,1);
        c = new Complex(1,1);
    }

    @Test
    public void notEqual() throws Exception{
        assertEquals(" not equals ", c, a.plus(b));
    }

    @Test
    public void notNullRe() throws Exception {
        assertNotEquals(0.0, a.getRe());
    }

    @Test
    public void  notNullIm() throws Exception {
        assertNotEquals(0.0, a.getIm());
    }
}