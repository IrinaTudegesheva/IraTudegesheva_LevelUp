package com.calculator.junit.parametrized;

import com.calculator.junit.tests.BaseCalculatorTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AdditionTest extends BaseCalculatorTest {

    @ParameterizedTest(name = "#{index} - Тест с параметрами with a={0},  b={1},  c={2}, delta={3}")
    @CsvSource({"5.2, 10.7, 15.9, 0.1"," 2.0, 8.7, 10.9, 0.3","5.0, 10.7, 15.9, 0.2"})
    public void test (double a,double b,double expected,double delta) {

        double actual = calculator.sum(a,b);

        Assertions.assertEquals(expected, actual, delta);
    }
}