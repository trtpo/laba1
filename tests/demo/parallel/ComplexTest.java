package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void div() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(1,2);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
        assertEquals(0.0, result.getImag(), 0.1);
    }

    @Test
    void divNeg() {
        // Arrange
        Complex a = new Complex(2,-4);
        Complex b = new Complex(-1,-3);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
        assertEquals(1.0, result.getImag(), 0.1);
    }

    @Test
    void divZero() {
        // Arrange
        Complex a = new Complex(0,-4);
        Complex b = new Complex(-1,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(0.0, result.getReal(), 0.1);
        assertEquals(4.0, result.getImag(), 0.1);
    }

    @Test
    void divZeroZero() {
        // Arrange
        Complex a = new Complex(3,-4);
        Complex b = new Complex(0,0);

        // Act
        Complex result = a.div(b);

        // Assert
        assertEquals(Double.POSITIVE_INFINITY, result.getReal(), 0.1);
        assertEquals(Double.NEGATIVE_INFINITY, result.getImag(), 0.1);
    }

    @Test
    void sub() {
    }
}