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
			temp=array[0];
			for(int index=1;index<Length;index++) {
				array[index-1]=array[index];
			}
			array[Length-1]=temp;
		}
		System.out.println("\nArray after change ");
		for(int index=0;index<Length;index++) {
			System.out.print(array[index]+" ");
		}
		s.close();
	}

}
