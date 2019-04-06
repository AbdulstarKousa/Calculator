package calculator;

import java.util.Scanner;

import calculator.operations.Operation;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("insert first number: ");
		Double a = s.nextDouble(); s.nextLine();
		System.out.println("insert the operator: ");
		String op = s.nextLine();
		System.out.println("insert second number: ");
		Double b = s.nextDouble();
		
		Operation o = Operation.parseOperator(op);
		if(op==null) {
			System.out.println("Operator non recognized!");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of " + o.getName() +" is " + o.calc() );
		}
		s.close();
	}
}
