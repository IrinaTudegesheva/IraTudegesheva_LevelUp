package com.calculator.junit.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdditionTest extends BaseCalculatorTest {

        @Test
        public void testLongSuccessfully() {
                long a =5,b=10, c;
                c = calculator.sum(a,b);
                assertEquals(15,c);
        }
        @Test
        public void testLongUnsuccessfully() {
                long a =5,b=10, c;
                c = calculator.sum(a,b);
                assertNotEquals(10,c);
        }
        @Test
        public void testDoubleSuccessfully() {
                double a =5.2,b=10.7, c;
                c = calculator.sum(a,b);
                assertEquals(15.89,c,0.1);
        }
        @Test
        public void testDoubleUnsuccessfully() {
                double a =8.5,b=4.8, c;
                c = calculator.sum(a,b);
                assertNotEquals(18.2,c,0);
        }
        }
