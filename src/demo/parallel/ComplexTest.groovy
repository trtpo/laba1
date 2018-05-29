package demo.parallel

class ComplexTest {
     void testMinus() throws Exception {
        Complex a = new Complex(-22, 6);
        Complex b = new Complex(-23, 3);
        assertTrue(a.minus(b).test(new Complex(1, 3)));
    }
}
