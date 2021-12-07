package com.calculator.junit.tests;

import org.junit.jupiter.api.BeforeAll;
import ru.levelup.qa.at.calculator.Calculator;

public class BaseCalculatorTest {
    protected static Calculator calculator;
    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }
}
