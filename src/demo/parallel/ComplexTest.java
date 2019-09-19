package demo.parallel;

import org.junit.Assert;


public class ComplexTest extends Assert {

    @org.junit.Test
    public void firstSubtractionTest() {
        Complex comp = new Complex(5, 7);
        assertTrue(new Complex(2, 3).equal(comp.sub(new Complex(3, 4))));
    }

    @org.junit.Test
    public void secondSubtractionTest() {
        Complex comp = new Complex(4, 7);
        assertTrue(new Complex(1, -1).equal(comp.sub(new Complex(3, 8))));
    }
    @org.junit.Test
    public void firstDivisionTest(){
        Complex comp = new Complex(5, 7);
        assertTrue(new Complex(2.2, 1.6).equal(comp.div(new Complex(3, 1))));
    }
    @org.junit.Test
    public void secondDivisionTest(){
        Complex comp = new Complex(5, -7);
        assertTrue(new Complex((0.8), (-2.6)).equal(comp.div(new Complex(3, 1))));
    }
    @org.junit.Test
    public void DivisionByZero(){
        try {
            Complex comp = new Complex(5, -7);
            assertTrue(new Complex((0.8), (-2.6)).equal(comp.div(new Complex(0, 0))));
        }catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "Error");
        }

    }

}