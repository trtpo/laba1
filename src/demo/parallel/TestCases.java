package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;
import demo.parallel.Complex;

public class TestCases {

    @Test
    public void testSubstitution() {
        Complex subj1 = new Complex(82, 14);
        Complex subj2 = new Complex(32, 10);
        Complex result = subj1.minus(subj2);
        assertTrue(new Complex(50,4).equals(result, 0.f));
    }

    @Test
    public void testDivision() {
        Complex subj1 = new Complex(82, 14);
        Complex subj2 = new Complex(2, 7);
        Complex result = subj1.divide(subj2);
        assertTrue(new Complex(39,18.714).equals(result, 0.001f));
    }

    @Test
    public void testTransposition() {
        Complex subj1 = new Complex(82, 14);
        Complex result = subj1.transpose();
        assertTrue(new Complex(14,82).equals(result, 0.f));
    }
}