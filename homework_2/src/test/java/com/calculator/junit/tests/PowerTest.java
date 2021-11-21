package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class PowerTest {
    @Test
    public void testDoubleSuccessfully() {
        double a =9.2,b=2.1, c;
        Calculator calculator=new Calculator();
        c = calculator.pow(a,b);
        Assert.assertEquals(84.6,c,0.1);
    }
    @Test
    public void testDoubleUnsuccessfully() {
        double a =3.5,b=2.8, c;
        Calculator calculator=new Calculator();
        c = calculator.pow(a,b);
        Assert.assertNotEquals(108.2,c,0);
    }
}
