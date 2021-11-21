package com.calculator.junit.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class AdditionTest {
        Calculator calculator=new Calculator();
        @Test
        public void testLongSuccessfully() {
                long a =5,b=10, c;
                c = calculator.sum(a,b);
                Assert.assertEquals(15,c);
        }
        @Test
        public void testLongUnsuccessfully() {
                long a =5,b=10, c;
                c = calculator.sum(a,b);
                Assert.assertNotEquals(10,c);
        }
        @Test
        public void testDoubleSuccessfully() {
                double a =5.2,b=10.7, c;
                c = calculator.sum(a,b);
                Assert.assertEquals(15.89,c,0.1);
        }
        @Test
        public void testDoubleUnsuccessfully() {
                double a =8.5,b=4.8, c;
                c = calculator.sum(a,b);
                Assert.assertNotEquals(18.2,c,0);
        }
        }
