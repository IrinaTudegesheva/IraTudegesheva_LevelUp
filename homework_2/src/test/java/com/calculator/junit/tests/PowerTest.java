package com.calculator.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class PowerTest extends BaseCalculatorTest {
    @Test
    public void testDoubleSuccessfully() {
        double a =9.2,b=2.1, c;
        Calculator calculator=new Calculator();
        c = calculator.pow(a,b);
        assertEquals(84.6,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =3.5,b=2.8, c;
        Calculator calculator=new Calculator();
        c = calculator.pow(a,b);
        assertNotEquals(108.2,c,0);
    }
}
