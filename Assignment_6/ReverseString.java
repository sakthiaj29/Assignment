package Assignment_6;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String input=s.nextLine();
		System.out.println("\nReversed String");
		System.out.println(reverse(input));
		s.close();
	}

}
