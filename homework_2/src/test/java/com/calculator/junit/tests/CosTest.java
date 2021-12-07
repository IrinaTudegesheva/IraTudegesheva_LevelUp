package com.calculator.junit.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class CosTest extends BaseCalculatorTest {

    @Test
    public void testDoubleSuccessfully() {
        double a =Math.PI/2,b;
        b = calculator.cos(a);
        assertEquals(0, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =60,b;
        b = calculator.cos(a);
        assertNotEquals(1.0, b, 0.1);
    }
}
