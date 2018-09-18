package demo;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minusWithPositiveNumbers() throws Exception{
        String message = "Minus with positive numbers";
        Complex a = new Complex(2,10);
        Complex b = new Complex(4,8);
        a.minus(b);
        assertTrue(a.equals(new Complex(-2, 2)), message);
    }

    @org.junit.jupiter.api.Test
    void minusWithNegativeNumbers() throws Exception{
        String message = "Minus with negative numbers";
        Complex a = new Complex(-1,-6);
        Complex b = new Complex(-2,-3);
        a.minus(b);
        assertTrue(a.equals(new Complex(1, -3)), message);
    }

    @org.junit.jupiter.api.Test
    void divisionWithNegativeAndPositiveNumbers() throws Exception{
        String message = "Division with negative and positive numbers";
        Complex a = new Complex(1,-1);
        Complex b = new Complex(-1,1);
        a.division(b);
        assertTrue(a.equals(new Complex(-1, 0)), message);
    }

    @org.junit.jupiter.api.Test
    void divisionByZero() throws Exception{
        String message = "Division by zero";
        Complex a = new Complex(1,-1);
        Complex b = new Complex(0,0);
        Complex c = a.division(b);
        assertTrue(c.equals(new Complex(0, 0)), message);
    }

    @org.junit.jupiter.api.Test
    void sinOfZero() throws Exception{
        String message = "Sinus of zero";
        Complex a = new Complex(0, 0);
        assertTrue(a.sin().equals(new Complex(0,0)), message);
    }

    @org.junit.jupiter.api.Test
    void sinOfComplexNumber() throws Exception{
        String message = "Sinus of complex number";
        Complex a = new Complex(-1, 1);
        assertTrue(a.sin().equals(new Complex(-1.2984575814159773, 0.31611116388679444 )), message);
    }

    @org.junit.jupiter.api.Test
    void cosOfZero() throws Exception{
        String message = "Cosinus of zero";
        Complex a = new Complex(0, 0);
        assertTrue(a.cos().equals(new Complex(1,0)), message);
    }

    @org.junit.jupiter.api.Test
    void cosOfComplexNumber() throws Exception{
        String message = "Cosinus of complex number";
        Complex a = new Complex(1, -1);
        assertTrue(a.cos().equals(new Complex(0.8337300251311492,0.8701701265953443)), message);
    }

    @org.junit.jupiter.api.Test
    void tanOfComplexNumber() throws Exception{
        String message = "Tangens of complex number";
        Complex a = new Complex(-2, 3);
        assertTrue(a.tan().equals(new Complex(1,0)), message);
    }

}