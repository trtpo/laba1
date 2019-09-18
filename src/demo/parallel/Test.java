package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void divide() {
        Complex operationResult = new Complex(5, -5).divide(new Complex(15, 10));
        assertEquals(operationResult.getRe(), (double)(5*15 + -5*10) / (15*15 + 10*10));
        assertEquals(operationResult.getIm(), (double)(-5*15 - 5*10) / (15*15 + 10*10));

        operationResult = new Complex(5, -5).divide(new Complex(1, 1));
        assertEquals(operationResult.getRe(), (double)(5 + -5) / (1 + 1));
        assertEquals(operationResult.getIm(), (double)(-5 - 5) / (1 + 1));

        operationResult = new Complex(0, 0).divide(new Complex(15, 10));
        assertEquals(operationResult.getRe(), 0);
        assertEquals(operationResult.getIm(), 0);
    }

    @org.junit.jupiter.api.Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class,
            ()->{new Complex(1, -1).divide(new Complex(0, 0));} );
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex operationResult = new Complex(5, 10).minus(new Complex(15, -2));
        assertEquals(operationResult.getRe(), 5 - 15);
        assertEquals(operationResult.getIm(), 10 - -2);

        operationResult = new Complex(0, 0).minus(new Complex(1, -2));
        assertEquals(operationResult.getRe(), 0 - 1);
        assertEquals(operationResult.getIm(), 0 - -2);

        operationResult = new Complex(1, -2).minus(new Complex(0, 0));
        assertEquals(operationResult.getRe(), 1);
        assertEquals(operationResult.getIm(), -2);

        operationResult = new Complex(12345, 54321).minus(new Complex(-6789, 9876));
        assertEquals(operationResult.getRe(), 12345 - -6789);
        assertEquals(operationResult.getIm(), 54321 - 9876);
    }
}