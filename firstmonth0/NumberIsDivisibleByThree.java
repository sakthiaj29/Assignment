package firstmonth0;

import java.util.Scanner;

public class NumberIsDivisibleByThree {

	static boolean isDivisibleByThree(String input) {
		int sum=0;
		for(int i=0;i<input.length();i++) {
			sum+=input.charAt(i)-'0';
		}
		if(sum%3!=0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String number=scanner.nextLine();
		
		if(isDivisibleByThree(number)) {
			System.out.println(number+" is divisible by 3");
		}
		else {
			System.out.println(number+" is not divisible by 3");
		}
	}

}
