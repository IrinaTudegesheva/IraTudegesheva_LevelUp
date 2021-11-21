package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class CosTest {
    Calculator calculator=new Calculator();
    @Test
    public void testDoubleSuccessfully() {
        double a =60,b;
        b = calculator.cos(a);
        Assert.assertEquals(0.5, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =60,b;
        b = calculator.cos(a);
        Assert.assertNotEquals(1.0, b, 0.1);
    }
}
