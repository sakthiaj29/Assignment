package Assignment_6;

import java.util.Scanner;

public class ReverseSentence {
	public static String reverseSentence(String sentence) {
		String result="";
		String[] array=sentence.split(" ");
		for(int i=array.length-1;i>=0;i--) {
			result+=array[i]+" ";
		}
		return result;
	}
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter sentence");
		 String sentence=s.nextLine();
		 System.out.println("\nReversed Sentence");
		 System.out.println(reverseSentence(sentence));
		 s.close();
	}

}
