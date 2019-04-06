package test.operations;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.operations.Multiplication;
import calculator.operations.Operation;

public class MultiplicationTest {
	Multiplication obj = new Multiplication();
	
	@Test
	public void testGetName() {
		assertEquals("multiplication", obj.getName());
	}

	@Test
	public void testGetOperator() {
		assertEquals(obj.getOperator(),"*");
	}
	
	@Test
	public void testSetNumbers() {
		obj.setNumbers(1, 1);
	}

	@Test
	public void testCalc() {
		obj.setNumbers(1, 1);
		Double n = obj.calc();
		assertEquals((Double) 1.0,n);
	}

	@Test
	public void testParseOperator() {
		String s = "*";
		Operation obj1 = Operation.parseOperator(s);
		assertTrue(obj1 instanceof Multiplication); 
	}

}
