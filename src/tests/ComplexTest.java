package tests;

import demo.parallel.Complex;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void plus() {
        Complex co = new Complex(2,2);

        List<Double> expected = new ArrayList<>();

        co = co.plus(co);

        expected.add(co.lengthSQ());

        List<Double> actual = new ArrayList<>();
        Complex c = new Complex(4,4);

        actual.add(c.lengthSQ());

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Complex co = new Complex(20,20);
        Complex a = new Complex(5,5);
        List<Double> expected = new ArrayList<>();

        co = co.minus(a);

        expected.add(co.lengthSQ());

        List<Double> actual = new ArrayList<>();
        Complex c = new Complex(15,15);

        actual.add(c.lengthSQ());

        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void sin() {
        Complex co = new Complex(20,20);

        co = co.sin(co);

        List<Double> expected = new ArrayList<>();

        expected.add(co.lengthSQ());

        double real = Math.sin(20) * Math.cosh(20);
        double imag = Math.cos(20) * Math.sinh(20);
        double res = real * real + imag * imag;

        List<Double> actual = new ArrayList<>();

        actual.add(res);

        Assert.assertEquals(expected,actual);
    }
}