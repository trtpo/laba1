package demo.parallel;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;


public class ComplexTest {

    @Test
    public void powFunctionTest() {
        Complex tester = new Complex(45,3); // MyClass is tested
        tester.pow(0);
        assertEquals(tester.getIm(),0,0.00000001);
        assertEquals(tester.getRe(),1,0.00000001);
        tester = new Complex(3.5, -9.3);
        tester.pow(3);
        assertEquals(tester.getIm(),462.582,0.00000001);
        assertEquals(tester.getRe(),-865.27,0.00000001);
        tester = new Complex(-2, 6);
        tester.pow(-2);
        assertEquals(tester.getIm(),0.015,0.00000001);
        assertEquals(tester.getRe(),-0.02,0.00000001);
    }
}
