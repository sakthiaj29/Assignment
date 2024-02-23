package Assignment_4;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int Length=s.nextInt();
		int[] array=new int[Length];
		System.out.println("Enter array elements");
		for(int i=0;i<Length;i++) {
			array[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<Length;i++) {
			if(array[i]%2!=0)
				continue;
			sum+=array[i];
		}
		System.out.println("Total even numbers sum ="+sum);
	}

}
