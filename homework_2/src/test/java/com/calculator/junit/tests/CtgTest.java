package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class CtgTest extends BaseCalculatorTest {

    @Test
    public void testDoubleSuccessfully() {
        double a =50,b;
        b = calculator.ctg(a);
        assertEquals(0.83, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =50,b;
        b = calculator.ctg(a);
        assertNotEquals(0.11, b, 0.1);
    }
}
