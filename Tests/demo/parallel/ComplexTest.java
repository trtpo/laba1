package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void minus() {
        // Arrange
        Complex a = new Complex(4,6);
        Complex b = new Complex(2,1);

        // Act
        Complex result = a.minus(b);

        // Assert
        assertEquals(2.0, result.getReal(), 0.1);
        assertEquals(5.0, result.getImage(), 0.1);
    }

    @Test
    void minusZero() {
        // Arrange
        Complex a = new Complex(4,0);
        Complex b = new Complex(0,1);

        // Act
        Complex result = a.minus(b);

        // Assert
        assertEquals(4.0, result.getReal(), 0.1);
        assertEquals(-1.0, result.getImage(), 0.1);
    }

    @Test
    void minusNeg() {
        // Arrange
        Complex a = new Complex(3,-8);
        Complex b = new Complex(-7,-2);

        // Act
        Complex result = a.minus(b);

        // Assert
        assertEquals(10.0, result.getReal(), 0.1);
        assertEquals(-6.0, result.getImage(), 0.1);
    }

    @Test
    void minusInf() {
        // Arrange
        Complex a = new Complex(4,Double.NEGATIVE_INFINITY);
        Complex b = new Complex(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.minus(b);

        // Assert
        assertEquals(Double.NEGATIVE_INFINITY, result.getReal(), 0.1);
        assertEquals(Double.NEGATIVE_INFINITY, result.getImage(), 0.1);
    }

    @Test
    void divide() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(1,2);

        // Act
        Complex result = a.divide(b);

        // Assert
        assertEquals(1.0, result.getReal(), 0.1);
        assertEquals(0.0, result.getImage(), 0.1);
    }

    @Test
    void divideNeg() {
        // Arrange
        Complex a = new Complex(-1,2);
        Complex b = new Complex(1,-2);

        // Act
        Complex result = a.divide(b);

        // Assert
        assertEquals(-1.0, result.getReal(), 0.1);
        assertEquals(0.0, result.getImage(), 0.1);
    }

    @Test
    void divideZero() {
        // Arrange
        Complex a = new Complex(0,2);
        Complex b = new Complex(1,0);

        // Act
        Complex result = a.divide(b);

        // Assert
        assertEquals(0.0, result.getReal(), 0.1);
        assertEquals(2.0, result.getImage(), 0.1);
    }

    @Test
    void divideInf() {
        // Arrange
        Complex a = new Complex(Double.POSITIVE_INFINITY,2);
        Complex b = new Complex(Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);

        // Act
        Complex result = a.divide(b);

        // Assert
        assertEquals(Double.NaN, result.getReal(), 0.1);
        assertEquals(Double.NaN, result.getImage(), 0.1);
    }

}