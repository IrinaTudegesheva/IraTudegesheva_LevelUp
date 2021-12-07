package com.calculator.junit.suites;

import com.calculator.junit.tests.AdditionTest;
import com.calculator.junit.tests.SubtractionTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({AdditionTest.class, SubtractionTest.class})
public class DivisionSubtractionSuite {
}