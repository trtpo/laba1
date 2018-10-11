package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class ComplexTests {
    
     @Test
    public void divideByZeroTest() {
         Complex a = new Complex(12, 5);
         Complex zero = new Complex(0, 0);
         a.divide(zero);
         assertTrue(a.isNaN());
    }
     @Test
    public void divideTest() {
         Complex a = new Complex(12, -3);
         Complex b = new Complex(3, 3);
         a.divide(b);
         assertTrue(a.equal(new Complex(1.5, -2.5)));
    }
     @Test
    public void minusTest() {
         Complex a = new Complex(12, 9);
         Complex b = new Complex(18, -1);
         Complex c = new Complex(0, -10);
         Complex subtrahend = new Complex(12, -7);
         a.minus(subtrahend);
         b.minus(subtrahend);
         c.minus(subtrahend);
         assertTrue(a.equal(new Complex(0, 16)));
         assertTrue(b.equal(new Complex(6, 6)));
         assertTrue(c.equal(new Complex(-12, -3)));
    }
