package demo.parallel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {



    private Complex firstNumber;
    private Complex secondNumber;

    @BeforeEach
    void init()
    {

        firstNumber = new Complex(10,2);
        secondNumber = new Complex(10,2);

    }

    @Test
    void plus() {
        Complex expectedNumber = new Complex(9, 12);
        Complex actualNumber = this.firstNumber.plus(this.secondNumber);
        assertEquals(expectedNumber.re(), actualNumber.re(), 0);
        assertEquals(expectedNumber.im(), actualNumber.im(), 0);
    }

    @Test
    void magic() {
        Complex expectedNumber = new Complex(0, 0);
        Complex actualNumber = this.secondNumber.magic(this.firstNumber);
        assertEquals(expectedNumber.re(), actualNumber.re(), 0);
        assertEquals(expectedNumber.re(), actualNumber.re(), 0);
    }


}