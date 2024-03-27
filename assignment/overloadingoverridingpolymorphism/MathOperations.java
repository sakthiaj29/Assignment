package assignment.overloadingoverridingpolymorphism;

public class MathOperations {

	public static void main(String[] args) {
		MathOperations operation = new MathOperations();
		operation.add(10, 20);
		operation.add(7000L, 8000L);
		operation.add(300.50, 400.50);
		
		operation.subtract(10, 20);
		operation.subtract(7000L, 8000L);
		operation.subtract(300.50, 400.50);
		
		operation.multiply(10, 20);
		operation.multiply(7000L, 8000L);
		operation.multiply(300.50, 400.50);
		
		operation.divide(10, 20);
		operation.divide(7000L, 8000L);
		operation.divide(300.50, 400.50);
		
		operation.modulo(10, 20);
		operation.modulo(7000L, 8000L);
		operation.modulo(300.50, 400.50);

	}

//Add numbers
	void add(int firstNumber, int secondNumber) {
		System.out.println("\nInteger add: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
	}

	void add(long firstNumber, long secondNumber) {
		System.out.println("\nLong add: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
	}

	void add(double firstNumber, double secondNumber) {
		System.out.println("\nDouble add: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
	}

//Subtract numbers
	void subtract(int firstNumber, int secondNumber) {
		System.out.println("\nInteger subtract: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
	}

	void subtract(long firstNumber, long secondNumber) {
		System.out.println("\nLong subtract: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
	}

	void subtract(double firstNumber, double secondNumber) {
		System.out.println(
				"\nDouble subtract: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
	}

//Multiply numbers
	void multiply(int firstNumber, int secondNumber) {
		System.out.println("\nInteger multiply: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
	}

	void multiply(long firstNumber, long secondNumber) {
		System.out.println("\nLong multiply: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
	}

	void multiply(double firstNumber, double secondNumber) {
		System.out.println("\nDouble multiply: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
	}
	
//Divide numbers	
	void divide(int firstNumber, int secondNumber) {
		System.out.println("\nInteger divide: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
	}
	
	void divide(long firstNumber, long secondNumber) {
		System.out.println("\nLong divide: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
	}
	
	void divide(double firstNumber, double secondNumber) {
		System.out.println("\nDouble divide: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
	}
	
//Modulo numbers	
	void modulo(int firstNumber, int secondNumber) {
		System.out.println("\nInteger modulo: " + firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
	}
	
	void modulo(long firstNumber, long secondNumber) {
		System.out.println("\nLong modulo: " + firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
	}
	
	void modulo(double firstNumber, double secondNumber) {
		System.out.println("\nDouble modulo: " + firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
	}

}
