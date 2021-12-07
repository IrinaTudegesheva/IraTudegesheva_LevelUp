package com.calculator.junit.suites;

import com.calculator.junit.tests.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AdditionTest.class, MultiplicationTest.class, SubtractionTest.class, SubtractionTest.class, CosTest.class, TgTest.class,NegativeTest.class, PositiveTest.class, PowerTest.class, SinTest.class, SqrtTest.class})
public class AllSuite {
}
