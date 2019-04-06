
package test.operations;
import static org.junit.Assert.*;
import org.junit.Test;

import calculator.operations.Addition;
import calculator.operations.Operation;
public class AdditionTest {
	
	Addition obj=new Addition();
	
	@Test
	public void testGetName() {
		assertEquals("addition", obj.getName());
	}

	@Test
	public void testGetOperator() {
		assertEquals(obj.getOperator(),"+");
	}
	
	@Test
	public void testSetNumbers() {
		obj.setNumbers(1, 1);
	}

	@Test
	public void testCalc() {
		obj.setNumbers(1, 1);
		Double n = obj.calc();
		assertEquals((Double) 2.0,n);
	}
	
	//need to be implemented
	@Test
	public void testParseOperator() {
		String s = "+";
		Operation obj1 = Operation.parseOperator(s);
		assertTrue(obj1 instanceof Addition); 
	}

}
