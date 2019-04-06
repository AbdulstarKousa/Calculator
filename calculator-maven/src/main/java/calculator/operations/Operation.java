package calculator.operations;

public abstract class Operation {
	protected double a,b;
	
	
	/**
	 * gets the name of the operation 
	 * 
	 * @return The name
	 */
	public abstract String getName();
	
	
	/**
	 * gets the operator needed to trigger the operation
	 * 
	 * @return the operator
	 */
	public abstract String getOperator();
	
	
	/**
	 * performs the actual computation an return the result
	 * 
	 *@return the result off the operation
	 */
	public abstract double calc();
	
	/**
	 * sets the two numbers to perform the operation 
	 * 
	 * @param a first number
	 * @param b second number
	 */
	public void setNumbers(double a, double b) {
		this.a = a;
		this.b = b; 
	}

	
	public static Operation parseOperator(String o) {
		
		Operation[] ops = new Operation[] {new Addition(), new Multiplication(), new Subtraction()};
		for (Operation op : ops) {
			if(o.equals(op.getOperator())) {
				return op;
			}
		}
		return null;
	} 
	
}
