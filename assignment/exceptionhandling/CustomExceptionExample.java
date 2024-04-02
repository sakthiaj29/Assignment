package assignment.exceptionhandling;

import java.util.Scanner;

class CustomException extends Exception{
	
	CustomException(String message){
		super(message);
	}
	
}
public class CustomExceptionExample {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
			System.out.println("Enter a number ");
			int number=scanner.nextInt(); 
			if(number>0) {
				System.out.println("Welcome!");
			}
			else {
				try {
					throw new CustomException("Oops!, Invalid Input Exception");
				}
				catch(CustomException e) {
					System.err.println( e.getMessage() +" has found");
				}
			}
	}

}
