package demo.parallel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTest {
    @Test
    public void firstCustomOperationTest() throws Exception {
        assertTrue(new Complex(8, 1)
                .equals(new Complex(2,1).firstCustomOperation(new Complex(4, 0))));
    }

    @Test
    public void secondCustomOperationTest() throws Exception {
        assertTrue(new Complex(2, 2)
                .equals(new Complex(2,1).secondCustomOperation(new Complex(4, 0))));
    }

}