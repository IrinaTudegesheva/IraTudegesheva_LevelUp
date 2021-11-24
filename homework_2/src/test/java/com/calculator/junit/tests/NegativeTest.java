package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class NegativeTest {
    Calculator calculator=new Calculator();
    @Test
    public void testLongSuccessfully() {
        long a =5;
        boolean c;
        c = calculator.isNegative(a);
        Assert.assertNotEquals(true,c);
    }
    @Test
    public void testLongUnsuccessfully() {
        long a =984;
        boolean c;
        c = calculator.isNegative(a);
        Assert.assertFalse(c);
    }
}
