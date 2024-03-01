package Assignment_6;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWordInSentence {
	public static String capitalizeFirstLetter(String str) {
		String result="";
		String[] array=str.split(" ");
		for(int i=0;i<array.length;i++) {
			result+=( array[i].substring(0, 1).toUpperCase() )+( array[i].substring(1) )+" ";
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String sentence=s.nextLine();
		System.out.println("\n"+capitalizeFirstLetter(sentence));
		s.close();
	}

}
