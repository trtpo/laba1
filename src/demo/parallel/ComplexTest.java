package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex complex_1 = new Complex(10,10);
        Complex complex_2 = new Complex(5,7);
        Complex complex_3 = new Complex(5,3);
        assertEquals(complex_3.lengthSQ(), (complex_1.minus(complex_2)).lengthSQ(), "Result should be 5 + 3i");
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Complex complex_1 = new Complex(10,10);
        Complex complex_2 = new Complex(5,7);
        Complex complex_3 = new Complex((double)60 / 37,(double)-10 / 37);
        assertEquals(complex_3.lengthSQ(), (complex_1.divide(complex_2)).lengthSQ(), "Result should be (60 - 10i) / 37");
    }
}