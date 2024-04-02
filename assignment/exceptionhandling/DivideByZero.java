package assignment.exceptionhandling;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int ans=0;
		System.out.println("Enter dividend");
		int dividend=scanner.nextInt();
		
		System.out.println("Enter divisor");
		int divisor=scanner.nextInt();
		
		try {
			ans=dividend/divisor;
		}
		
		catch(ArithmeticException e) {
			System.err.println("\tArithmeticException Found");
		}
		
		System.out.println(dividend+" / "+divisor+" = "+0);
		scanner.close();
	}

}
