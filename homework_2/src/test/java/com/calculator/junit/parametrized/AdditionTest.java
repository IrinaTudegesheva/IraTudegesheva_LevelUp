package com.calculator.junit.parametrized;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AdditionTest {
    private double a,b,c,delta;
    public AdditionTest (double a,double b,double c,double delta) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.delta=delta;
    }
    @Parameterized.Parameters
    public static Collection params () {
        return Arrays.asList(new Object [][]{{5.2, 10.7, 15.9, 0.1},{6.4, 15.6, 25.1, 0.1}});
    }
    @Test
    public void test () {
        System.out.println("Параметризированный тест на сложение по входным данным a = "+a + " b=" +b);
        Assert.assertEquals(c, a+b, delta);
    }
}
