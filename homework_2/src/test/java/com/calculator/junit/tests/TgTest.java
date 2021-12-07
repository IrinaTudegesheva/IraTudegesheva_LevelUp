package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class TgTest extends BaseCalculatorTest {

    @Test
    public void testDoubleSuccessfully() {
        double a =90,b;
        b = calculator.tg(a);
        assertEquals(-1.995, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =30,b;
        b = calculator.tg(a);
        assertNotEquals(0.42, b, 0.1);
    }
}
