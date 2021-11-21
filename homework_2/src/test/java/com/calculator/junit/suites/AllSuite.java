package com.calculator.junit.suites;

import com.calculator.junit.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({AdditionTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class, CosTest.class, TgTest.class, CtgTest.class, NegativeTest.class, PositiveTest.class, PowerTest.class, SinTest.class, SqrtTest.class})
public class AllSuite {
}
