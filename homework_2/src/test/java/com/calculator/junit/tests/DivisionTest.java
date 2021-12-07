package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class DivisionTest extends BaseCalculatorTest {

    @Test
    public void testLongSuccessfully() {
        long a =36,b=6, c;
        c = calculator.div(a,b);
        assertEquals(6,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =25,b=5, c;
        c = calculator.div(a,b);
        assertNotEquals(7,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =18.6,b=2.4, c;
        c = calculator.div(a,b);
        assertEquals(7.75,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =28.9,b=5.3, c;
        c = calculator.div(a,b);
        assertNotEquals(1.4,c,0);
    }
}
