package test.operations;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.operations.Operation;
import calculator.operations.Subtraction;

public class SubtractionTest {
	
	Subtraction obj = new Subtraction();
	
	@Test
	public void testGetName() {
		assertEquals("subtraction", obj.getName());
	}

	@Test
	public void testGetOperator() {
		assertEquals(obj.getOperator(),"-");
	}

	@Test
	public void testSetNumbers() {
		obj.setNumbers(1, 1);
	}
	
	@Test
	public void testCalc() {
		obj.setNumbers(1, 1);
		Double n = obj.calc();
		assertEquals((Double) 0.0,n);
	}

	@Test
	public void testParseOperator() {
		String s = "-";
		Operation obj1 = Operation.parseOperator(s);
		assertTrue(obj1 instanceof Subtraction); 
	}

}
