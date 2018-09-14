package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void real() {
        Complex testComplex = new Complex(1, 2);
        assertEquals(1, testComplex.real(), "get real part test");
    }

    @org.junit.jupiter.api.Test
    void imag() {
        Complex testComplex = new Complex(1, 2);
        assertEquals(2, testComplex.imag(), "get imag part test");
    }

    @org.junit.jupiter.api.Test
    void mod() {
        Complex complex_a = new Complex(1, 2);
        assertEquals(Math.sqrt(5), complex_a.mod(), "mod common test");

        Complex complex_b = new Complex(0, 0);
        assertEquals(Math.sqrt(0), complex_b.mod(), "mod zero test");

        Complex complex_c = new Complex(-1, -2);
        assertEquals(Math.sqrt(5), complex_c.mod(), "mod negative test");
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex complex_a = new Complex(1, 2);
        Complex complex_b = new Complex(2, 1);
        Complex complex_must_result = new Complex(0.8, 0.6);

        Complex result = complex_a.div(complex_b);
        result.round();

        assertEquals(complex_must_result.mod(), result.mod(), "div common case test");

        complex_a = new Complex(0, 0);
        complex_b = new Complex(1, 1);
        complex_must_result = new Complex(0, 0);

        result = complex_a.div(complex_b);


        assertEquals(complex_must_result.mod(), result.mod(), "div zero case test");


        assertThrows(IllegalArgumentException.class, ()-> {
            final Complex a = new Complex(1, 1);
            final Complex b = new Complex(0, 0);

            a.div(b);
        }, "Exception test");
    }

    @org.junit.jupiter.api.Test
    void sin() {
        Complex complex_a = new Complex(1, 2);
        Complex result = new Complex(3.16, 1.95);
        assertEquals(Utility.round(complex_a.cos().mod()), Utility.round(complex_a.cos().mod()), "sin common case test");

        Complex complex_b = new Complex(0, 0);
        Complex result_b = new Complex(0, 0);
        assertEquals(Utility.round(result_b.mod()), Utility.round(complex_b.sin().mod()), "sin zero case test");
    }

    @org.junit.jupiter.api.Test
    void cos() {
        Complex complex_a = new Complex(1, 2);
        Complex result_a = new Complex(2.1, -3);
        assertEquals(Utility.round(result_a.mod()), Utility.round(complex_a.cos().mod()), "cos common case test");

        Complex complex_b = new Complex(0, 0);
        Complex result_b = new Complex(1, 0);
        assertEquals(Utility.round(result_b.mod()), Utility.round(complex_b.cos().mod()), "cos zero case test");
    }

    @org.junit.jupiter.api.Test
    void tan() {
        Complex complex_a = new Complex(1, 2);
        Complex result_a = new Complex(0, 1);
        assertEquals(Utility.round(result_a.mod()), Utility.round(complex_a.tan().mod()), "tan common case test");

        Complex complex_b = new Complex(0, 0);
        Complex result_b = new Complex(0, 0);
        assertEquals(Utility.round(result_b.mod()), Utility.round(complex_b.tan().mod()), "tan zero case test");
    }

    @org.junit.jupiter.api.Test
    void exp() {
        Complex complex_a = new Complex(1, 1);
        Complex result_a = new Complex(1.5, 2.3);
        assertEquals(Utility.round(result_a.mod()), Utility.round(complex_a.exp().mod()), "tan common case test");

        Complex complex_b = new Complex(0, 0);
        Complex result_b = new Complex(1, 0);
        assertEquals(Utility.round(result_b.mod()), Utility.round(complex_b.exp().mod()), "tan zero case test");
    }
}