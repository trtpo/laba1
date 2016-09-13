package demo.parallel;

import static org.junit.Assert.*;

/**
 * Created by Alla on 12.09.2016.
 */
public class TestB {
    @org.junit.Test
    public void times() throws Exception {
        try {
            Complex a = new Complex(1.0, 0.0);
            Complex b = new Complex(7.87, -21.24);
        } catch(Exception e) {
            System.out.println("Error in calc() in Complex (line 85).\n");
        } finally {
            System.out.println("TestB successfully run.\n");
        }
    }

}