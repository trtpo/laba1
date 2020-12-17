package demo.parallel;

import org.junit.jupiter.api.Assertions;
class ComplexTest {

    @org.junit.jupiter.api.Test
    void sqr() {
        Complex actual =new Complex(0, 1);
        Complex expected = new Complex(-1, 0);

        actual.sqr();
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex actual =new Complex(0, 1);
        Complex expected = new Complex(-1, 0);

        actual.minus(new Complex(1, 1));
        Assertions.assertEquals(expected, actual);
    }
}