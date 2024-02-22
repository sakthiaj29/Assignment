package Assignment_3;

import java.util.Scanner;

public class GreatestOfAllThreeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Enter Three Numbers:");
		number1=s.nextInt();
		number2=s.nextInt();
		number3=s.nextInt();
		System.out.println("Greast of all is "+((number1>number2 && number1>number3)?number1:(number2>number3)?number2:number3));
	}

}
