package assignment.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionForPhoneNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		long phoneNumber=0;
		try {
			System.out.println("Enter your phone number");
			phoneNumber=scanner.nextLong();
			
		}
		catch(InputMismatchException e) {
			System.err.println("\nInputMismatchException has found");
		}
		System.out.println("\nNumber is "+phoneNumber);
	}

}
