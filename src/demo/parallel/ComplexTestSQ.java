package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTestSQ {
    @Test
    public void lengthSQ() {
        Complex testNum1 = new Complex(0,0);
        double length = testNum1.lengthSQ();
        if(length == 0)
            System.out.println("square == 0");
        else
            System.out.println("Right square");
    }
}