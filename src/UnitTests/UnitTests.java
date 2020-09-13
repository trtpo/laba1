package UnitTests;

import demo.parallel.Complex;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class UnitTests {
    Complex FirstComplex;
    Complex SecondComplex;

    @Before
    public void InstalationComplex() throws Exception {
        this.FirstComplex = new Complex(1, 2);
        this.SecondComplex = new Complex(3, 4);
    }

    @After
    public void DeinstalationComplex() throws Exception {
        this.FirstComplex = null;
        this.SecondComplex = null;
    }

    @Test
    public void GetReal() {
        assertNotNull(this.FirstComplex);
        assertNotNull(this.SecondComplex);
        assertTrue(this.FirstComplex.GetReal() == 1);
        assertFalse(this.FirstComplex.GetReal() == 2);
        assertEquals(3,this.SecondComplex.GetReal(),0);
    }

    @Test
    public void GetImag() {
        assertNotNull(this.FirstComplex);
        assertNotNull(this.SecondComplex);
        assertTrue(this.FirstComplex.GetImag() == 2);
        assertFalse(this.FirstComplex.GetImag() == 5);
        assertEquals(4,this.SecondComplex.GetImag(),0);
    }

    @Test
    public void plus() {
        Complex testComplex = new Complex(4, 6);
        Complex existingComplex = this.FirstComplex.plus(this.SecondComplex);
        assertTrue(testComplex.GetReal() == existingComplex.GetReal());
        assertTrue(testComplex.GetImag() == existingComplex.GetImag());
    }

    @Test
    public void minus() {
        Complex testComplex = new Complex(2,2);
        Complex existingComplex = this.SecondComplex.minus(this.FirstComplex);
        assertTrue(testComplex.GetReal() == existingComplex.GetReal());
        assertTrue(testComplex.GetImag() == existingComplex.GetImag());
    }

    @Ignore
    @Test
    public void minus1() {
        Complex testComplex = new Complex(2,2);
        Complex existingComplex = this.SecondComplex.minus(this.FirstComplex);
        assertEquals(testComplex.GetReal(),existingComplex.GetReal(),0);
        assertEquals(testComplex.GetImag(),existingComplex.GetImag(),0);
    }

    @Test
    public void times() {
        Complex testComplex = new Complex(-5, 10);
        Complex existingComplex = this.SecondComplex.times(this.FirstComplex);
        assertEquals(testComplex.GetReal(),existingComplex.GetReal(),0);
        assertEquals(testComplex.GetImag(),existingComplex.GetImag(),0);
    }

    @Test
    public void division() {
        Complex testComplex = new Complex(0.44,0.08);
        Complex existingComplex = this.FirstComplex.division(this.SecondComplex);
        assertTrue(testComplex.GetReal() == existingComplex.GetReal());
        assertTrue(testComplex.GetImag() == existingComplex.GetImag());
    }

    @Test
    public void lengthSQ() {
        assertEquals(5, this.FirstComplex.lengthSQ(),0);
        assertEquals(25, this.SecondComplex.lengthSQ(),0);
    }
}
