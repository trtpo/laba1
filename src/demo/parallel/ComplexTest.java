package demo.parallel;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
/**
 * Created by VKS on 14.11.2016.
 */
public class ComplexTest {
    private Complex number;

            @Before
    public void before() throws Exception {
                number = new Complex(5, 8);
            }

            @Test
    public void subtractionTest() throws Exception {
                number.sub(new Complex(1, 2));
                assertEquals(4, number.Re(), 1e-15);
                assertEquals(6, number.Im(), 1e-15);
            }
    @Test
    public void plusTest() throws Exception {
                number.plus(new Complex(1, 2));
                assertEquals(6, number.Re(), 1e-15);
                assertEquals(10, number.Im(), 1e-15);
            }
    @Test
    public void multiplyTest() throws Exception {
                number.times(new Complex(1, 2));
                assertEquals(-11, number.Re(), 1e-15);
                assertEquals(18, number.Im(), 1e-15);
            }
    @Test
    public void multipleOperatonsTest() throws Exception {
                number.plus(new Complex(1, 2)).sub(new Complex(2,3));
                assertEquals(4, number.Re(), 1e-15);
                assertEquals(7, number.Im(), 1e-15);
            }
}

