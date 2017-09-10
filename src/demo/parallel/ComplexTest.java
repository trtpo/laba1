package demo.parallel;

import static org.junit.Assert.*;

public class ComplexTest {
    
    @org.junit.Test
    public void TestForSubtraction() throws Exception {
        Complex numberForTest = new Complex(7, 9);
        assertTrue(new Complex(2, 3).equal(numberForTest.minus(new Complex(5, 6))));
    }

    @org.junit.Test
    public void SecondTestForSubtraction() throws Exception {
        Complex numberForTest = new Complex(78, 9);
        assertTrue(new Complex(8, 9).equal(numberForTest.minus(new Complex(70, 0))));
    }

    @org.junit.Test
    public void ThirdTestForSubtraction() throws Exception {
        Complex numberForTest = new Complex(12, 3);
        assertTrue(new Complex(1, 1).equal(numberForTest.minus(new Complex(11, 2))));
    }
}
