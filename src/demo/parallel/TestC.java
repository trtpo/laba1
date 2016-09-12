package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alla on 12.09.2016.
 */
public class TestC {
    @org.junit.Test
    public void minus() throws Exception {
        try {
            Complex a = new Complex(32.0, 0.23);
            Complex b = new Complex(7.87, -21.24);
            b.setReal(b.getReal() - a.getReal());
            b.setImaginary(b.getImaginary() - a.getImaginary());
        } catch(Exception e) {
            System.out.println("Error in minus() in Complex (line 74).\n");
        } finally {
            System.out.println("TestC successfully run.\n");
        }
    }

}