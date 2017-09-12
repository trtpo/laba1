package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test of new operations with complex numbers
 */
public class ComplexTest {

    /**
     * Testing division operation
     */
    @Test
    public void divisionComplexOperation() {
        Complex comp = new Complex(3, 4);
        comp.divisionComplexOperation(new Complex(2, 1));
        assertEquals(2, comp.getRe(), 0.01);
        assertEquals(1, comp.getIm(), 0.01);
    }

    /**
     * Testing subtraction operation
     */
    @org.testng.annotations.Test
    public void subtractionComplexOperation() {
        Complex comp = new Complex(3, -9);
        comp.subtractionComplexOperation(new Complex(7, 1));
        assertEquals(-4, comp.getRe(), 0.01);
        assertEquals(-10, comp.getIm(), 0.01);
    }

}