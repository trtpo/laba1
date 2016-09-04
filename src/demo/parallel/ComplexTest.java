package demo.parallel;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ComplexTest {
    private final Map<Complex, Complex> dataSubtract = new HashMap<>();

    @Before
    public void setUp() throws Exception {
        dataSubtract.put(new Complex(2, 3), new Complex(1, 1));
        dataSubtract.put(new Complex(1, 1), new Complex(0, -1));
        dataSubtract.put(new Complex(4, 2), new Complex(3, 0));
    }

    @After
    public void clear() throws Exception {
        dataSubtract.clear();
    }

    @Test
    public void minus() throws Exception {
        for (Map.Entry<Complex, Complex> entry : dataSubtract.entrySet()) {
            Complex testData = entry.getKey();
            Complex expected = entry.getValue();
            Complex actual = testData.minus(new Complex(1, 2));
            assertEquals(expected.toString(), actual.toString());
        }
    }
}
