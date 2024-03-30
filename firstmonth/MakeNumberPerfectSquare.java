package firstmonth;
import java.util.ArrayList;
import java.util.List;

//Q :13

public class MakeNumberPerfectSquare {

	static List<String> subSeq = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println(findPerfectSquare(831));
		
	}
	
	private static String findPerfectSquare(int number){
		int num = 0;
		int maxNumber = -1, count = 0;
		String string = "" + number;

		findSubSequences(string, "");

		for (String str : subSeq) {
			if (str.length() != 0) {
				num = Integer.parseInt(str);
				if (Math.sqrt(num) == (int) Math.sqrt(num)) {
					if (num > maxNumber) {
						maxNumber = num;
						count = string.length() - str.length();
					}
				}
			}

		}
		if (maxNumber != -1) {
			return maxNumber + " " + count;
		} else {
			return ""+-1;
		}
	}

	private static void findSubSequences(String str, String ans) {
	
		if (str.length() == 0) {
			subSeq.add(ans);
			System.out.println(ans);
			return;
		}
		
		findSubSequences(str.substring(1), ans + str.charAt(0));
		
		findSubSequences(str.substring(1), ans);
	}
}
