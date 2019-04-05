package calculator.operations;

public class Subtraction extends Operation {

	@Override
	public String getName() {
		return "subtraction";
	}

	@Override
	public String getOperator() {
		return "-";
	}

	@Override
	public double calc() {
		return a-b;
	}

}
