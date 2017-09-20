package demo.parallel;

import org.junit.jupiter.api.Test;
import org.omg.IOP.ExceptionDetailMessage;
import org.junit.*;
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @org.junit.jupiter.api.Test void mult() {
        Complex b=new Complex(1,1);
        double c =2;
        b=b.mult(c);
        double real=b.re;
        double imag=b.im;
        try{
            assertEquals(c,real);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("real part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("erron in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }
        try{
            assertEquals(c,imag);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("multiply complex by real value");
            System.out.println("image part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("erron in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }

    }
    @Test
    public void complex_mult_zero(){
        Complex b=new Complex(1,1);
        double c =0;
        b=b.mult(c);
        double real=b.re;
        double imag=b.im;
        try{
            assertEquals(c,real);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("multiply complex by real value");
            System.out.println("real part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("erron in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }
        try{
            assertEquals(c,imag);
        }
        catch (AssertionError ex) {
            ex.fillInStackTrace();
            System.out.println("image part test");
            //System.out.println(ex.getCause());
            System.out.println(ex.getLocalizedMessage());
            System.out.println("erron in line: "+ (ex.getStackTrace()[0].getLineNumber()-3));
            throw (ex);
        }
    }

}
