package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationTest extends BaseCalculatorTest {

    @Test
    public void testLongSuccessfully() {
        long a =5,b=7, c;
        c = calculator.mult(a,b);
        assertEquals(35,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =4,b=10, c;
        c = calculator.mult(a,b);
        assertNotEquals(3,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =12.2,b=6.4, c;
        c = calculator.mult(a,b);
        assertEquals(78.08,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =5,b=10, c;
        c = calculator.mult(a,b);
        assertNotEquals(14.2,c,0);
    }
}
