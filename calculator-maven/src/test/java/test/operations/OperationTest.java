package test.operations;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.operations.Operation;

public class OperationTest {
	@Test
	public void testParseOperator() {
		String s = "/";
		Operation obj1 = Operation.parseOperator(s);
		assertNull(obj1); 
	}

}
