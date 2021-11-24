package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class CtgTest {
    Calculator calculator=new Calculator();
    @Test
    public void testDoubleSuccessfully() {
        double a =50,b;
        b = calculator.ctg(a);
        Assert.assertEquals(0.83, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =50,b;
        b = calculator.ctg(a);
        Assert.assertNotEquals(0.11, b, 0.1);
    }
}
