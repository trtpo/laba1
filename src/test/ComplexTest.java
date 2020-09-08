package test;

import demo.parallel.Complex;
import org.junit.*;

import static org.junit.Assert.*;

public class ComplexTest {

    Complex firstNumber;
    Complex secondNumber;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before ComplexTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After ComplexTest.class");
    }

    @Before
    public void setUp() throws Exception {
        this.firstNumber = new Complex(3, 4);
        this.secondNumber = new Complex(6, 8);
    }

    @After
    public void tearDown() throws Exception {
        this.firstNumber = null;
        this.secondNumber = null;
    }

    @Test
    public void getRe() {
        assertEquals(3, firstNumber.getRe(), 0);
        assertEquals(6, secondNumber.getRe(), 0);
    }

    @Test
    public void getIm() {
        assertEquals(4, firstNumber.getIm(), 0);
        assertEquals(8, secondNumber.getIm(), 0);
    }

    @Test
    public void plus() {
        Complex expectedNumber = new Complex(9, 12);
        Complex actualNumber = this.firstNumber.plus(this.secondNumber);
        assertEquals(expectedNumber.getRe(), actualNumber.getRe(), 0);
        assertEquals(expectedNumber.getIm(), actualNumber.getIm(), 0);
    }

    @Test
    public void minus() {
        Complex expectedNumber = new Complex(3, 4);
        Complex actualNumber = this.secondNumber.minus(this.firstNumber);
        assertEquals(expectedNumber.getRe(), actualNumber.getRe(), 0);
        assertEquals(expectedNumber.getIm(), actualNumber.getIm(), 0);
    }

    @Test
    public void divide() {
        Complex expectedNumber = new Complex(0.5, 0);
        Complex actualNumber = this.firstNumber.divide(this.secondNumber);
        assertEquals(expectedNumber.getRe(), actualNumber.getRe(), 0);
        assertEquals(expectedNumber. getIm(), actualNumber.getIm(), 0);
    }

    @Test
    public void times() {
        Complex expectedNumber = new Complex(-14, 48);
        Complex actualNumber = this.firstNumber.times(this.secondNumber);
        assertEquals(expectedNumber.getRe(), actualNumber.getRe(), 0);
        assertEquals(expectedNumber.getIm(), actualNumber.getIm(), 0);
    }

    @Test
    public void lengthSQ() {
        assertEquals(25, this.firstNumber.lengthSQ(), 0);
        assertEquals(100, this.secondNumber.lengthSQ(), 0);
    }
}