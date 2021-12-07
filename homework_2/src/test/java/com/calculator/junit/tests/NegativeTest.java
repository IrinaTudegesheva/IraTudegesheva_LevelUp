package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class NegativeTest extends BaseCalculatorTest {

    @Test
    public void testLongSuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isNegative(a);
        assertNotEquals(true,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =984;
        boolean c;
        c = calculator.isNegative(a);
        assertFalse(c);

    }
}
