package demo.parallel;

import org.junit.Before;
import static org.junit.Assert.*;

/**
* Created by Anton Skorbilin
 */

public class ComplexTest {
    private Complex testObjA;
    private Complex testObjB;

    @Before
    public void setUp(){
        testObjA = new Complex(20, 20);
        testObjB = new Complex(5, 5);
    }

    @org.junit.Test
    public void testDivides(){
        testObjA.divides(testObjB);
        assertEquals(4,testObjA.getRe(),0.001);
        assertEquals(4,testObjA.getIm(),0.001);
    }

    @org.junit.Test
    public void testReciprocal(){
        testObjA.reciprocal();
        assertEquals(1/20,testObjA.getRe(),0.001);
        assertEquals(1/20,testObjB.getIm(),0.001);
    }
}
