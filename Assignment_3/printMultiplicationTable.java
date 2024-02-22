package Assignment_3;

import java.util.Scanner;

public class printMultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a table number:");
		int number=s.nextInt();
		System.out.println("Table: ");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+number+"="+(number*i));
		}
	}

}
