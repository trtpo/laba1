package demo.parallel;
import org.testng.annotations.Test;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexTest {
    @org.junit.Test
    public void divide_CorrectIfDividerIsPositive() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        // Act
        Complex result = a.divide(b);
        // Assert
        assertEquals(0.08, result.getImag(), 0.01);
        assertEquals(0.44, result.getReal(), 0.01);
    }
    @Test
    public void divide_CorrectIfDividerIsNegative() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(-3,-4);
        // Act
        Complex result = a.divide(b);
        // Assert
        assertEquals(-0.08, result.getImag(), 0.01);
        assertEquals(-0.44, result.getReal(), 0.01);
    }
    @Test
    public void divide_DivideByItselfEqualsToOne() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.divide(a);
        // Assert
        assertEquals(0, result.getImag(), 0.01);
        assertEquals(1, result.getReal(), 0.01);
    }
    @Test
    public void divide_DivideByOneEqualsToItself() {
        // Arrange
        Complex a = new Complex(3,4);
        Complex b = new Complex(1,0);
        // Act
        Complex result = a.divide(b);
        // Assert
        assertEquals(4, result.getImag(), 0.01);
        assertEquals(3, result.getReal(), 0.01);
    }

    @Test
    public void pow_CorrectIfPowerIsOne() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.pow(1);
        // Assert
        assertEquals(1, result.getReal(), 0.01);
        assertEquals(2, result.getImag(), 0.01);
    }
    @Test
    public void pow_CorrectIfPowerZero() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.pow(0);
        // Assert
        assertEquals(1, result.getReal(), 0.01);
        assertEquals(0, result.getImag(), 0.01);
    }
    @Test
    public void pow_CorrectIfPowerIsNegative() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.pow(-2);
        // Assert
        assertEquals(-0.12, result.getReal(), 0.01);
        assertEquals(-0.16, result.getImag(), 0.01);
    }
    @Test
    public void pow_CorrectIfPowerIsPositive() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.pow(2);
        // Assert
        assertEquals(-3, result.getReal(), 0.01);
        assertEquals(4, result.getImag(), 0.01);
    }
    @Test
    public void minus_SubtractsPositiveCorrectly() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(2,3);
        // Act
        Complex result = a.minus(b);
        // Assert
        assertEquals(-1, result.getReal(), 0.01);
        assertEquals(-1, result.getImag(), 0.01);
    }
    @Test
    public void minus_SubtractsNegativeCorrectly() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(-2,-3);
        // Act
        Complex result = a.minus(b);
        // Assert
        assertEquals(3, result.getReal(), 0.01);
        assertEquals(5, result.getImag(), 0.01);
    }
    @Test
    public void minus_SubtractsItselfEqualsToZero() {
        // Arrange
        Complex a = new Complex(1,2);
        // Act
        Complex result = a.minus(a);
        // Assert
        assertEquals(0, result.getReal(), 0.01);
        assertEquals(0, result.getImag(), 0.01);
    }
    @Test
    public void minus_SubtractsZeroEqualsToItself() {
        // Arrange
        Complex a = new Complex(1,2);
        Complex b = new Complex(0,0);
        // Act
        Complex result = a.minus(b);
        // Assert
        assertEquals(1, result.getReal(), 0.01);
        assertEquals(2, result.getImag(), 0.01);
    }
}