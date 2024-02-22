package Assignment_3;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int number=s.nextInt();
		long factorial=1l;
		for(int i=2;i<=number;i++) {
			factorial*=i;
		}
		System.out.println("Factorial of Given Number is "+factorial);
	}

}
