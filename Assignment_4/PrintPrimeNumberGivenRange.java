package Assignment_4;

import java.util.Scanner;

public class PrintPrimeNumberGivenRange {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start Number");
		int start=s.nextInt();
		System.out.println("Enter end Number");
		int end=s.nextInt();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
