package demo.parallel;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ComplexTest {

    private List<Double> listReal1 = Arrays.asList(4.0, 0.0, 7.0, 2.0, 2.56, 0.0);
    private List<Double> listImag1 = Arrays.asList(2.0, 2.56, 0.0, 4.0, 0.0, 7.0);

    private List<Double> listReal2 = Arrays.asList(0.0, 3.0, 6.0, 2.0, 0.0, 1.1);
    private List<Double> listImag2 = Arrays.asList(2.0, 0.0, 1.1, 0.0, 3.0, 6.0);

    private Complex a;
    private Complex b;

    private Iterator<Double> itReal1 = listReal1.iterator();
    private Iterator<Double> itImag1 = listImag1.iterator();
    private Iterator<Double> itReal2 = listReal2.iterator();
    private Iterator<Double> itImag2 = listImag2.iterator();

    @Test
    public void division() {
        while(itReal1.hasNext() && itImag1.hasNext() && itReal2.hasNext() && itImag2.hasNext())
        {
            a = new Complex(itReal1.next(),itImag1.next());
            b = new Complex(itReal2.next(),itImag2.next());
            Complex expected = a.division(b);
            Complex actual = new Complex((a.re * b.re + a.im * b.im) / (b.re * b.re + b.im * b.im),
                    (a.re * b.im - a.im * b.re) / (b.re * b.re + b.im * b.im));
            assertEquals(actual,expected);
        }
    }
    @Test
    public void sin() {
        while(itReal1.hasNext() && itImag1.hasNext())
        {
            a = new Complex(itReal1.next(),itImag1.next());
            Complex expected = a.sin();
            Complex actual = new Complex(Math.sin(a.re) * Math.cosh(a.im), Math.cos(a.re) * Math.sinh(a.im));
            assertEquals(actual,expected);
        }
    }

    @Test
    public void cos() {
        while(itReal1.hasNext() && itImag1.hasNext())
        {
            a = new Complex(itReal1.next(),itImag1.next());
            Complex expected = a.cos();
            Complex actual = new Complex(Math.cos(a.re) * Math.cosh(a.im), -(Math.sin(a.re) * Math.sinh(a.im)));
            assertEquals(actual,expected);
        }
    }

    @Test
    public void tg() {
        while(itReal1.hasNext() && itImag1.hasNext())
        {
            a = new Complex(itReal1.next(),itImag1.next());
            Complex expected = a.tg();
            Complex actual = a.sin().division(a.cos());
            assertEquals(actual,expected);
        }
    }

    @Test
    public void ctg() {
        while(itReal1.hasNext() && itImag1.hasNext())
        {
            a = new Complex(itReal1.next(),itImag1.next());
            Complex expected = a.ctg();
            Complex actual = a.cos().division(a.sin());
            assertEquals(actual,expected);
        }
    }
}