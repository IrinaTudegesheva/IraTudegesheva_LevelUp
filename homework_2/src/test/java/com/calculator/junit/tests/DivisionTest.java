package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class DivisionTest {
    Calculator calculator=new Calculator();
    @Test
    public void testLongSuccessfully() {
        long a =36,b=6, c;
        c = calculator.div(a,b);
        Assert.assertEquals(6,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =25,b=5, c;
        c = calculator.div(a,b);
        Assert.assertNotEquals(7,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =18.6,b=2.4, c;
        c = calculator.div(a,b);
        Assert.assertEquals(7.75,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =28.9,b=5.3, c;
        c = calculator.div(a,b);
        Assert.assertNotEquals(1.4,c,0);
    }
}
