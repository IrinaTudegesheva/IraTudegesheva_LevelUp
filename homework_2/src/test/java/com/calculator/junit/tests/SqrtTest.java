package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class SqrtTest extends BaseCalculatorTest {

    @Test
    public void testDoubleSuccessfully() {
        double a =144.6,b;
        b = calculator.sqrt(a);
        assertEquals(12.02, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =144.6,b;
        b = calculator.sqrt(a);
        assertNotEquals(22.02, b, 0.1);
    }
}
