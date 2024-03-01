package Assignment_6;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String input=s.nextLine();
		int count=0;
		String vowels="aeiouAEIOU";
		for(int index=0;index<input.length();index++) {
			if(vowels.contains(input.substring(index,index+1))) {
				count++;
			}
		}
		System.out.println("vowels count is "+count);
		s.close();
	}

}
