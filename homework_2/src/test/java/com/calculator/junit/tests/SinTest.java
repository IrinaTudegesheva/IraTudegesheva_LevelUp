package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SinTest {
    Calculator calculator=new Calculator();
    @Test
    public void testDoubleSuccessfully() {
        double a =90,b;
        b = calculator.sin(a);
        Assert.assertEquals(1.0, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =60,b;
        b = calculator.sin(a);
        Assert.assertNotEquals(0.25, b, 0.1);
    }
}
