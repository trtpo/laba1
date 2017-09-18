package tests;

import demo.parallel.Complex;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

public class ComplexTest extends Assert {

    private HashMap<String, Double> testValues = new HashMap<>();
    private Complex number, number1, number2;
    private double testReal, testImage;
    private final double testPrecision = 1e-8;

    @Before
    public void initTestValues() {
        Random val = new Random();
        final int baseVal = 100;
        testValues.put("real1", val.nextDouble() + val.nextInt(baseVal) - baseVal / 2);
        testValues.put("real2", val.nextDouble() + val.nextInt(baseVal) - baseVal / 2);
        testValues.put("image1", val.nextDouble() + val.nextInt(baseVal) - baseVal / 2);
        testValues.put("image2", val.nextDouble() + val.nextInt(baseVal) - baseVal / 2);
        number = number1 = new Complex(testValues.get("real1"), testValues.get("image1"));
        number2 = new Complex(testValues.get("real2"), testValues.get("image2"));
    }

    @After
    public void clearTestValues() {
        testValues.clear();
    }

    @Test
    public void getReal() throws Exception {
        assertEquals("The expected and obtained real part of the complex number do not coincide. " +
                        "There is mistake in constructor of Complex() class, or in getReal() method.",
                testValues.get("real1"), number.getReal(), testPrecision);
    }

    @Test
    public void getImage() throws Exception {
        assertEquals("The expected and obtained image part of the complex number do not coincide. " +
                        "There is mistake in constructor of Complex() class, or in getImage() method.",
                testValues.get("image1"), number.getImage(), testPrecision);
    }

    @Test
    public void negative() throws Exception {
        number.negative();
        assertEquals("Error in negative() method of Complex() class. Real part have to be negative.",
                -testValues.get("real1"), number.getReal(), testPrecision);
        assertEquals("Error in negative() method of Complex() class. Image part have to be negative.",
                -testValues.get("image1"), number.getImage(), testPrecision);
    }

    @Test
    public void minus() throws Exception {
        number1.minus(number2);
        assertEquals("Error in minus() method of Complex() class. Mistake in real1-real2 calculation.",
                testValues.get("real1") - testValues.get("real2"), number1.getReal(), testPrecision);
        assertEquals("Error in minus() method of Complex() class. Mistake in image1-image2 calculation.",
                testValues.get("image1") - testValues.get("image2"), number1.getImage(), testPrecision);
    }

    @Test
    public void minusItSelf() throws Exception {
        number.minus(number);
        assertEquals("Error in minus() method of Complex() class. real1-real1 should be zero.",
                0.0, number.getReal(), testPrecision);
        assertEquals("Error in minus() method of Complex() class. image1-image1 should be zero.",
                0.0, number.getImage(), testPrecision);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() throws Exception {
        number.divide(new Complex(0, 0));
        System.out.println("Error in divide() method of Complex class. " +
                "Double(z)/Double(0)=Double.NaN but ArithmeticException is expected.");
    }

    @Test
    public void divide() throws Exception {
        number1.divide(number2);
        divideCalculate();
        assertEquals("Error in divide() method of Complex class. " +
                "Error in real part calculation.", testReal, number1.getReal(), testPrecision);
        assertEquals("Error in divide() method of Complex class. " +
                "Error in image part calculation.", testImage, number1.getImage(), testPrecision);
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
        assertEquals("Error in exp() method of Complex class. " +
                "Error in real part calculation.", testReal, number.getReal(), testPrecision);
        assertEquals("Error in exp() method of Complex class. " +
                "Error in image part calculation.", testImage, number.getImage(), testPrecision);
    }

    private void expCalculate() {
        testReal = Math.exp(testValues.get("real1")) * Math.cos(testValues.get("image1"));
        testImage = Math.exp(testValues.get("real1")) * Math.sin(testValues.get("image1"));
    }

    @Test
    public void sin() throws Exception {
        number.sin();
        sinCalculate();
        assertEquals("Error in sin() method of Complex class. " +
                "Error in real part calculation.", testReal, number.getReal(), testPrecision);
        assertEquals("Error in sin() method of Complex class. " +
                "Error in image part calculation.", testImage, number.getImage(), testPrecision);
    }

    private void sinCalculate() {
        testReal = Math.sin(testValues.get("real1")) * Math.cosh(testValues.get("image1"));
        testImage = Math.cos(testValues.get("real1")) * Math.sinh(testValues.get("image1"));
    }

    @Test
    public void cos() throws Exception {
        number.cos();
        cosCalculate();
        assertEquals("Error in cos() method of Complex class. " +
                "Error in real part calculation.", testReal, number.getReal(), testPrecision);
        assertEquals("Error in cos() method of Complex class. " +
                "Error in image part calculation.", testImage, number.getImage(), testPrecision);
    }

    private void cosCalculate() {
        testReal = Math.cos(testValues.get("real1")) * Math.cosh(testValues.get("image1"));
        testImage = -Math.sin(testValues.get("real1")) * Math.sinh(testValues.get("image1"));
    }

    @Test
    public void tg() throws Exception {
        number = new Complex(testValues.get("real1"), testValues.get("image1"));
        number.tg();
        number1 = tgCalculate();
        assertEquals("Error in tg() method of Complex class. " +
                "Error in real part calculation.", number1.getReal(), number.getReal(), getPower(number.getReal()));
        assertEquals("Error in tg() method of Complex class. " +
                "Error in image part calculation.", number1.getImage(), number.getImage(), getPower(number.getImage()));
    }

    private Complex tgCalculate() {
        double real = Math.sin(2 * testValues.get("real1")) / (Math.cos(2 * testValues.get("real1")) + Math.cosh(2 * testValues.get("image1")));
        double imag = Math.sinh(2 * testValues.get("image1")) / (Math.cos(2 * testValues.get("real1")) + Math.cosh(2 * testValues.get("image1")));
        return new Complex(real, imag);
    }

    private Double getPower(Double num) {
        String powStr = Double.toString(num);
        int pos = powStr.indexOf("E");
        if (pos == -1) return testPrecision;
        powStr = powStr.substring(pos + 1);
        return Math.pow(10, Double.parseDouble(powStr));
    }

    @Test
    public void ctg() throws Exception {
        number = new Complex(testValues.get("real1"), testValues.get("image1"));
        number.ctg();
        number1 = ctgCalculate();
        assertEquals("Error in ctg() method of Complex class. " +
                "Error in real part calculation.", number1.getReal(), number.getReal(), getPower(number.getReal()));
        assertEquals("Error in ctg() method of Complex class. " +
                "Error in image part calculation.", number1.getImage(), number.getImage(), getPower(number.getImage()));
    }

    private Complex ctgCalculate() {
        double real = -Math.sin(2 * testValues.get("real1")) / (Math.cos(2 * testValues.get("real1")) - Math.cosh(2 * testValues.get("image1")));
        double imag = Math.sinh(2 * testValues.get("image1")) / (Math.cos(2 * testValues.get("real1")) - Math.cosh(2 * testValues.get("image1")));
        return new Complex(real, imag);
    }

}