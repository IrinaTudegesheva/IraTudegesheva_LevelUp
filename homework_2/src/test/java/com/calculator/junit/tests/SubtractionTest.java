package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class SubtractionTest {
    Calculator calculator=new Calculator();
    @Test
    public void testLongSuccessfully() {
        long a =105,b=20, c;
        c = calculator.sub(a,b);
        Assert.assertEquals(85,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =80,b=13, c;
        c = calculator.sub(a,b);
        Assert.assertNotEquals(54,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =14.8,b=10.3, c;
        c = calculator.sub(a,b);
        Assert.assertEquals(4.5,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =61.5,b=4.4, c;
        c = calculator.sub(a,b);
        Assert.assertNotEquals(28.2,c,0);
    }
}
