package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ComplexTest {
    private final Map<Complex, Complex> dataSubtract = new HashMap<>();
    private final Map<Complex, Complex> dataConjugate = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        dataSubtract.put(new Complex(0, 1), new Complex(-2, -2));
        dataSubtract.put(new Complex(-1, -4), new Complex(-3, -7));
        dataSubtract.put(new Complex(5.2, 6.3), new Complex(3.2, 3.3));
        dataSubtract.put(new Complex(4.2, 5.3), new Complex(2.2, 2.3));
        dataSubtract.put(new Complex(7.5, 2.3), new Complex(5.5, -0.7));
        dataSubtract.put(new Complex(9.1, 7.0), new Complex(7.1, 4.0));
        dataSubtract.put(new Complex(2.4, -7.4), new Complex(0.4, -10.4));
        dataSubtract.put(new Complex(5.2, 8.3), new Complex(2.2, 5.3));
        dataSubtract.put(new Complex(7.4, -3.3), new Complex(5.4, -6.3));
        dataSubtract.put(new Complex(2.6, 100000.3), new Complex(0.6, 99997.3));

        dataConjugate.put(new Complex(4.5, -2.5), new Complex(4.5, 2.5));
        dataConjugate.put(new Complex(-5.4, 6.9), new Complex(-5.4, -6.9));
        dataConjugate.put(new Complex(10.0, 0.0), new Complex(10.0, 0.0));
        dataConjugate.put(new Complex(100.0, 10.0), new Complex(100.0, -10.0));
        dataConjugate.put(new Complex(1000.0, 100.0), new Complex(1000.0, -100.0));
        dataConjugate.put(new Complex(10000.0, 1000.0), new Complex(10000.0, -1000.0));
        dataConjugate.put(new Complex(100000.0, 10000.0), new Complex(100000.0, -10000.0));
        dataConjugate.put(new Complex(1000000.0, 100000.0), new Complex(1000000.0, -100000.0));
        dataConjugate.put(new Complex(10000000.0, 1000000.0), new Complex(10000000.0, -1000000.0));
        dataConjugate.put(new Complex(100000000.0, 10000000.0), new Complex(100000000.0, -10000000.0));
    }

    @After
    public void crear() throws Exception {
        dataSubtract.clear();
        dataConjugate.clear();
    }

    @Test
    public void minus() throws Exception {
        for (Map.Entry<Complex, Complex> entry : dataSubtract.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.minus(new Complex(2, 3));
            assertEquals(expected, actual);
        }
    }

    @Test
    public void conjugate() throws Exception {
        for (Map.Entry<Complex, Complex> entry : dataConjugate.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.conjugate();
            assertEquals(expected, actual);
        }
    }

}
