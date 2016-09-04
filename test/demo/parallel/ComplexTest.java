package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Artsiom on 04.09.2016.
 */
public class ComplexTest {
    private final Map<Complex, Complex> toSubtractData = new HashMap<Complex, Complex>();
    private final Map<Double, Complex> toScaleData = new HashMap<Double, Complex>();


    @Before
    public void setUp() throws Exception {
        toSubtractData.put(new Complex(0, 1), new Complex(1, 0));
        toSubtractData.put(new Complex(1, -2), new Complex(0, 3));
        toSubtractData.put(new Complex(2, 3), new Complex(-1, -2));

        toScaleData.put(2.5, new Complex(2.5, 2.5));
        toScaleData.put(-3.99, new Complex(-3.99, -3.99));
        toScaleData.put(7.0, new Complex(7.0, 7.0));
    }

    @After
    public void tearDown() throws Exception {
        toSubtractData.clear();
        toScaleData.clear();
    }

    @Test
    public void minus() throws Exception {
        for (Map.Entry<Complex, Complex> entry : toSubtractData.entrySet()) {
            final Complex testData = entry.getKey();
            final Complex expected = entry.getValue();
            Complex comp = new Complex(1, 1);
            final Complex actual = comp.minus(testData);
            assertEquals(expected.toString(), actual.toString());
        }
    }

    @Test
    public void scale() throws Exception {
        for (Map.Entry<Double, Complex> entry : toScaleData.entrySet()) {
            final Double testData = entry.getKey();
            final Complex expected = entry.getValue();
            Complex comp = new Complex(1, 1);
            final Complex actual = comp.scale(testData);
            assertEquals(expected.toString(), actual.toString());
        }
    }

}