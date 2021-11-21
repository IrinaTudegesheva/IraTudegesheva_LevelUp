package com.calculator.junit.suites;

import com.calculator.junit.tests.AdditionTest;
import com.calculator.junit.tests.MultiplicationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AdditionTest.class})
public class AdditionMultiplicationSuite {
}
