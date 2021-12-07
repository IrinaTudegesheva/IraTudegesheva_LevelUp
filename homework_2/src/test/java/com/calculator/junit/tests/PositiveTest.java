package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class PositiveTest extends BaseCalculatorTest {

    @Test
    public void testLongSuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isPositive(a);
        assertEquals(true,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isPositive(a);
        assertNotEquals(false,c);
    }
}
