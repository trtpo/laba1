package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void real() {
        Complex testComplex = new Complex(1, 2);
        assertEquals(1, testComplex.real(), "must be 1");
    }

    @org.junit.jupiter.api.Test
    void imag() {
        Complex testComplex = new Complex(1, 2);
        assertEquals(2, testComplex.imag(), "must be 2");
    }

    @org.junit.jupiter.api.Test
    void mod() {
    }

    @org.junit.jupiter.api.Test
    void div() {
        Complex complex_a = new Complex(1, 2);
        Complex complex_b = new Complex(2, 1);
        Complex complex_must_result = new Complex(0.8, 0.6);
        Complex result;

        result = complex_a.div(complex_b);
        result.round();
        assertEquals(complex_must_result.real(), result.real(), "Complex_a / Complex_b test real");
        assertEquals(complex_must_result.imag(), result.imag(), "Complex_a / Complex_b test imag");
    }

    @org.junit.jupiter.api.Test
    void sin() {
    }

    @org.junit.jupiter.api.Test
    void cos() {
    }

    @org.junit.jupiter.api.Test
    void tan() {
    }
}