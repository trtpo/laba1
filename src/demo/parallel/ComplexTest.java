package demo.parallel;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Created by ERICK on 08.09.2016.
 */
public class ComplexTest {

    Complex testObj;

    @Before public void setUp(){
        testObj = new Complex(3, 4);
    }

    @org.junit.Test
    public void test_plus_result() throws Exception {
        testObj.plus(new Complex(2, 3));
        assertEquals(5, testObj.getRe(), 0.0001);
        assertEquals(7, testObj.getIm(), 0.0001);
    }

    @org.junit.Test
    public void test_minus_result() throws Exception {
        testObj.minus(new Complex(2, 3));
        assertEquals(1, testObj.getRe(), 0.0001);
        assertEquals(1, testObj.getIm(), 0.0001);
    }

    @org.junit.Test
    public void test_times_result() throws Exception {
        testObj.times(new Complex(2, 3));
        assertEquals(-6, testObj.getRe(), 0.001);
        assertEquals(17, testObj.getIm(), 0.001);
    }

    @org.junit.Test
    public void test_divis_result() throws Exception {
        testObj.divis(new Complex(2, 3));
        assertEquals(1.38, testObj.getRe(), 0.1);
        assertEquals(-0.08, testObj.getIm(), 0.1);
    }

}