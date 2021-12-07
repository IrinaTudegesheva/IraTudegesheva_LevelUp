package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class SubtractionTest extends BaseCalculatorTest {

    @Test
    public void testLongSuccessfully() {
        long a =105,b=20, c;
        c = calculator.sub(a,b);
        assertEquals(85,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =80,b=13, c;
        c = calculator.sub(a,b);
        assertNotEquals(54,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =14.8,b=10.3, c;
        c = calculator.sub(a,b);
        assertEquals(4.5,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =61.5,b=4.4, c;
        c = calculator.sub(a,b);
        assertNotEquals(28.2,c,0);
    }
}
