package demo.parallel;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by Андрей on 12.09.2016.
 */
public class TestComplex {
    private Complex num;

    @Before
    public void setUp() throws Exception {
        num = new Complex(3, 4);
    }


    @Test
    public void min() throws Exception {
        assertEquals(-1, num.min(new Complex(4, 2)).getRe(), 0.00001);
        assertEquals(5, num.min(new Complex(4, -3)).getIm(), 0.00001);

    }
}