package Assignment_4;

import java.util.Scanner;

public class SecondOccurrenceOfNumber {
	public static int findSecondOccurrence(int[] array,int target) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				count++;
			}
			if(count==2) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length");
		int Length=s.nextInt();
		int[] array=new int[Length];
		System.out.println("Enter array elements");
		for(int i=0;i<Length;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Enter a number");
		int target=s.nextInt();
		System.out.println(findSecondOccurrence(array,target));
	}

}
