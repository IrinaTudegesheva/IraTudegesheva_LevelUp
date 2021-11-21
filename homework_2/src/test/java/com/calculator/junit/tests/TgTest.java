package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TgTest {
    Calculator calculator=new Calculator();
    @Test
    public void testDoubleSuccessfully() {
        double a =90,b;
        b = calculator.tg(a);
        Assert.assertEquals(-1.995, b, 0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =30,b;
        b = calculator.tg(a);
        Assert.assertNotEquals(0.42, b, 0.1);
    }
}
