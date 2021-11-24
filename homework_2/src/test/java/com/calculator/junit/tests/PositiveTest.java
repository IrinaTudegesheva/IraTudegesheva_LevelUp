package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class PositiveTest {
    Calculator calculator=new Calculator();
    @Test
    public void testLongSuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isPositive(a);
        Assert.assertEquals(true,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isPositive(a);
        Assert.assertNotEquals(false,c);
    }
}
