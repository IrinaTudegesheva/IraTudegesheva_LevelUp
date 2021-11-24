package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class MultiplicationTest {
    Calculator calculator=new Calculator();
    @Test
    public void testLongSuccessfully() {
        long a =5,b=7, c;
        c = calculator.mult(a,b);
        Assert.assertEquals(35,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =4,b=10, c;
        c = calculator.mult(a,b);
        Assert.assertNotEquals(3,c);
    }
    @Test
    public void testDoubleSuccessfully() {
        double a =12.2,b=6.4, c;
        c = calculator.mult(a,b);
        Assert.assertEquals(78.08,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =5,b=10, c;
        c = calculator.mult(a,b);
        Assert.assertNotEquals(14.2,c,0);
    }
}
