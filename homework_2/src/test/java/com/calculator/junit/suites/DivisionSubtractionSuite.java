package com.calculator.junit.suites;

import com.calculator.junit.tests.DivisionTest;
import com.calculator.junit.tests.SubtractionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({DivisionTest.class, SubtractionTest.class})
public class DivisionSubtractionSuite {
}
