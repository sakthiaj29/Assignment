package Assignment_5;

import java.util.Scanner;

public class RightRottateElementArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int Length=s.nextInt();
		int[] array=new int[Length];
		System.out.println("Enter elements");
		for(int index=0;index<Length;index++) {
			array[index]=s.nextInt();
		}
		System.out.println("Array is");
		for(int index=0;index<Length;index++) {
			System.out.print(array[index]+" ");
		}
		System.out.println("\n\nEnter rotate count");
		int count=s.nextInt();
		int temp=0;
		for(int C=0;C<count;C++) {
			temp=array[Length-1];
			for(int index=Length-1;index>0;index--) {
				array[index]=array[index-1];
			}
			array[0]=temp;
		}
		System.out.println("\nArray after change ");
		for(int index=0;index<Length;index++) {
			System.out.print(array[index]+" ");
		}
		s.close();
	}

}
