package demo.parallel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ComplexTest {
    private final Map<Complex, Complex> subtractTestMap = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        subtractTestMap.put(new Complex(10.0, 6.0), new Complex(6.0, 4.0));
        subtractTestMap.put(new Complex(-4.0, 0.0), new Complex(-8.0, -2.0));
        subtractTestMap.put(new Complex(13.4, 2.7), new Complex(9.4, 0.7));
        subtractTestMap.put(new Complex(0.0, 0.0), new Complex(-4.0, -2.0));
        subtractTestMap.put(new Complex(2.7, 0.7), new Complex(-1.3, -1.3));
    }

    @After
    public void clean() throws Exception {
        subtractTestMap.clear();
    }

    @Test
    public void minusTest() throws Exception {
        for (Map.Entry<Complex, Complex> entry : subtractTestMap.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.minus(new Complex(4.0, 2.0));
            assertEquals(expected, actual);
        }
    }
}
