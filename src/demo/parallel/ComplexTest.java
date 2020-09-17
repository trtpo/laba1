package demo.parallel;

import org.junit.*;

import static org.junit.Assert.*;

public class ComplexTest {

    Complex Number_firstTest;
    Complex Number_twoTest;

    @Before
    public void Init() throws Exception {
        this.Number_firstTest = new Complex(1, 3);
        this.Number_twoTest = new Complex(1, 2);
    }

    @After
    public void Broke() throws Exception {
        this.Number_firstTest = null;
        this.Number_twoTest = null;
    }

    @Test
    public void plus() {
        Complex NumberTest = new Complex(2, 5);
        Complex Number = this.Number_firstTest.plus(this.Number_twoTest);
        assertEquals(NumberTest.getReal(), Number.getReal(), 0);
        assertEquals(NumberTest.getImag(), Number.getImag(), 0);
    }

    @Test
    public void minus() {
        Complex NumberTest = new Complex(0, -1);
        Complex Number = this.Number_twoTest.minus(this.Number_firstTest);
        assertEquals(NumberTest.getReal(), Number.getReal(), 0);
        assertEquals(NumberTest.getImag(), Number.getImag(), 0);
    }

    @Test
    public void times() {
        Complex NumberTest = new Complex(-5, 5);
        Complex Number = this.Number_firstTest.times(this.Number_twoTest);
        assertEquals(NumberTest.getReal(), Number.getReal(), 0);
        assertEquals(NumberTest.getImag(), Number.getImag(), 0);
    }

    @Test
    public void divide() {
        Complex NumberTest = new Complex(1.4, 0.2);
        Complex Number = this.Number_firstTest.divide(this.Number_twoTest);
        assertEquals(NumberTest.getReal(), Number.getReal(), 0);
        assertEquals(NumberTest. getImag(), Number.getImag(), 0);
    }

    @Test
    public void conjugate() {
        Complex NumberTest = new Complex(1, 3);
        Complex Number = NumberTest.conjugate();
        assertEquals(NumberTest.getReal(), Number.getReal(), 0);
        assertEquals(-NumberTest. getImag(), Number.getImag(), 0);
    }

    @Test
    public void lengthSQ() {
        assertEquals(10, this.Number_firstTest.lengthSQ(), 0);
        assertEquals(5, this.Number_twoTest.lengthSQ(), 0);
    }
}