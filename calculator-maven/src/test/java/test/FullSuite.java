package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.operations.AdditionTest;
import test.operations.MultiplicationTest;
import test.operations.OperationTest;
import test.operations.SubtractionTest;

@RunWith(Suite.class)
@SuiteClasses({
	AdditionTest.class,
	MultiplicationTest.class,
	OperationTest.class,
	SubtractionTest.class	
})
public class FullSuite { }