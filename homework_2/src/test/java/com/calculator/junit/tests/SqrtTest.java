package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SqrtTest {

    @Test
    public void testDoubleSuccessfully() {
        double a =144.6,b;
        Calculator calculator=new Calculator();
        b = calculator.sqrt(a);
        Assert.assertEquals(12.02, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =144.6,b;
        Calculator calculator=new Calculator();
        b = calculator.sqrt(a);
        Assert.assertNotEquals(22.02, b, 0.1);
    }
}
