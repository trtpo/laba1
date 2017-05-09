package demo.parallel;

import org.junit.Test




class test extends groovy.util.GroovyTestCase {

    @Test
    void testPlus() {
       Complex complex1 = new Complex(0.0d, 0.0d);
       Complex complex2 = complex1.plus(new Complex(15.5d, 10.5d));
        assertEquals("commlex not equal", complex1, complex2);
        }