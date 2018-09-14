package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @Test
    void round() {

        assertEquals(0.2, Utility.round(0.19), "common case test");
        assertEquals(-0.2, Utility.round(-0.19), "neg case test");
        assertEquals(0.0, Utility.round(0.0001123123), "zero case test");
    }
}