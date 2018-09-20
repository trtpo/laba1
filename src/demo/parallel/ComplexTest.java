package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ComplexTest {

    @org.junit.jupiter.api.Test
    void subsract() {
        Complex a = new Complex(17,-35);
        Complex b = new Complex(15,5);
        assertEquals(true,a.subsract(b).equal(new Complex(2,-40)));
    }

    @org.junit.jupiter.api.Test
    void devide_one() {
        Complex a = new Complex(17,-35);
        Complex b = new Complex(1,0);
        assertEquals(true,a.devide(b).equal(new Complex(17,-35)));
    }

    @org.junit.jupiter.api.Test
    void devide_zero() {
        Complex a = new Complex(17,-35);
        Complex b = new Complex(0,0);
        assertEquals(true,a.devide(b).equal(new Complex(17,-35)));
    }

    @org.junit.jupiter.api.Test
    void devide_equal() {
        Complex a = new Complex(17,-35);
        Complex b = new Complex(17,-35);
        assertEquals(true,a.devide(b).equal(new Complex(1,0)));
    }

    @org.junit.jupiter.api.Test
    void devide_standart() {
        Complex a = new Complex(-1,3);
        Complex b = new Complex(1,2);
        assertEquals(true,a.devide(b).equal(new Complex(1,1)));
    }
}