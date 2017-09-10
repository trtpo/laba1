package Tests;

import demo.parallel.Complex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

public class ComplexTest extends Assert {

    private HashMap<String, Double> testValues = new HashMap<>();
    private Complex number, number1, number2;
    private double testReal, testImage;
    private final double testPresicion = 0.0001;

    @Before
    public void initTestValues() {
        Random val = new Random(1000);
        testValues.put("real1", val.nextDouble());
        testValues.put("real2", val.nextDouble());
        testValues.put("image1", val.nextDouble());
        testValues.put("image2", val.nextDouble());
        number1 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number2 = new Complex(testValues.get("real2"), testValues.get("image2"));
        number = number1;
    }

    @Test
    public void getReal() throws Exception {
        assertEquals(testValues.get("real1"), number.getReal(), testPresicion);
    }

    @Test
    public void getImage() throws Exception {
        assertEquals(testValues.get("image1"), number.getImage(), testPresicion);
    }

    @Test
    public void negative() throws Exception {
        number.negative();
        assertEquals(-testValues.get("real1"), number.getReal(), testPresicion);
        assertEquals(-testValues.get("image1"), number.getImage(), testPresicion);
    }

    @Test
    public void minus() throws Exception {
        number1.minus(number2);
        assertEquals(testValues.get("real1") - testValues.get("real2"), number1.getReal(), testPresicion);
        assertEquals(testValues.get("image1") - testValues.get("image2"), number1.getImage(), testPresicion);
    }

    @Test
    public void minusItSelf() throws Exception {
        number.minus(number);
        assertEquals(0.0, number.getReal(), testPresicion);
        assertEquals(0.0, number.getImage(), testPresicion);
    }

    @Test
    public void divide() throws Exception {
        number1.divide(number2);
        divideCalculate();
        assertEquals(testReal, number1.getReal(), testPresicion);
        assertEquals(testImage, number1.getImage(), testPresicion);
    }

    private void divideCalculate() {
        double div = testValues.get("real2") * testValues.get("real2") + testValues.get("image2") * testValues.get("image2");
        testReal = (testValues.get("real1") * testValues.get("real2") + testValues.get("image1") * testValues.get("image2")) / div;
        testImage = (testValues.get("real2") * testValues.get("image1") - testValues.get("real1") * testValues.get("image2")) / div;
    }

    @Test
    public void exp() throws Exception {
        number.exp();
        expCalculate();
        assertEquals(testReal, number.getReal(), testPresicion);
        assertEquals(testImage, number.getImage(), testPresicion);
    }

    private void expCalculate() {
        testReal = Math.exp(testValues.get("real1")) * Math.cos(testValues.get("image1"));
        testImage = Math.exp(testValues.get("real1")) * Math.sin(testValues.get("image1"));
    }

    @Test
    public void sin() throws Exception {
        number.sin();
        sinCalculate();
        assertEquals(testReal, number.getReal(), testPresicion);
        assertEquals(testImage, number.getImage(), testPresicion);
    }

    private void sinCalculate() {
        testReal = Math.sin(testValues.get("real1")) * Math.cosh(testValues.get("image1"));
        testImage = Math.cos(testValues.get("real1")) * Math.sinh(testValues.get("image1"));
    }

    @Test
    public void cos() throws Exception {
        number.cos();
        cosCalculate();
        assertEquals(testReal, number.getReal(), testPresicion);
        assertEquals(testImage, number.getImage(), testPresicion);
    }

    private void cosCalculate() {
        testReal = Math.cos(testValues.get("real1")) * Math.cosh(testValues.get("image1"));
        testImage = -Math.sin(testValues.get("real1")) * Math.sinh(testValues.get("image1"));
    }

    @Test
    public void tg() throws Exception {
        number.tg();
        number1 = tgCalculate();
        assertEquals(number1.getReal(), number.getReal(), testPresicion);
        assertEquals(number1.getImage(), number.getImage(), testPresicion);
    }

    private Complex tgCalculate() {
        number1 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number2 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number1.sin();
        number2.cos();
        return number1.divide(number2);
    }

    @Test
    public void ctg() throws Exception {
        number.ctg();
        number1 = ctgCalculate();
        assertEquals(number1.getReal(), number.getReal(), testPresicion);
        assertEquals(number1.getImage(), number.getImage(), testPresicion);
    }

    private Complex ctgCalculate() {
        number1 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number2 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number1.cos();
        number2.sin();
        return number1.divide(number2);
    }

}