package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest_subs {
    @Test void subs() {
        Complex b=new Complex(11,11);
        Complex c =new Complex(5,5);
        Complex d =new Complex(b.re,b.im);
        b=b.subs(c);
        double real=b.re;
        double imag=b.im;
        try{
            assertEquals(d.re,real+c.re);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("subs real part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("error in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }
        try{
            assertEquals(d.im,imag+c.im);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("subs imag part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("error in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }
    }

}
