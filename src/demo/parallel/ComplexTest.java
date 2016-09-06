package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ComplexTest {
    private final Map<Complex, Complex> dataSubtract = new HashMap<>();
    private final Map<Complex, Complex> dataDivide = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        dataSubtract.put(new Complex(10.0, 6.0), new Complex(6.0, 4.0));
        dataSubtract.put(new Complex(-4.0, 0.0), new Complex(-8.0, -2.0));
        dataSubtract.put(new Complex(13.4, 2.7), new Complex(9.4, 0.7));
        dataSubtract.put(new Complex(0.0, 0.0), new Complex(-4.0, -2.0));
        dataSubtract.put(new Complex(2.7, 0.7), new Complex(-1.3, -1.3));
        dataSubtract.put(new Complex(57.0, 43.2), new Complex(53.0, 41.2));

        dataDivide.put(new Complex(10.0, 5.0), new Complex(2.0, -1.5));
        dataDivide.put(new Complex(-2.0, 8.0), new Complex(1.4, 1.2));
        dataDivide.put(new Complex(5.0, -3.0), new Complex(-0.1, -1.3));
        dataDivide.put(new Complex(-8.0, -9.0), new Complex(-2.6, 0.7));
        dataDivide.put(new Complex(4.0, 4.0), new Complex(1.2, -0.4));
        dataDivide.put(new Complex(0.0, 0.0), new Complex(0.0, 0.0));
    }

    @After
    public void clear() throws Exception {
        dataSubtract.clear();
        dataDivide.clear();
    }

    @Test
    public void minus() throws Exception {
        for (Map.Entry<Complex, Complex> entry : dataSubtract.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.minus(new Complex(4.0, 2.0));
            assertEquals(expected, actual);
        }
    }

    @Test
    public void div() throws Exception {
        for (Map.Entry<Complex, Complex> entry : dataDivide.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.div(new Complex(2.0, 4.0));
            assertEquals(expected, actual);
        }
    }
}
