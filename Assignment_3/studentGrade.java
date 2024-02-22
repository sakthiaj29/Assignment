package Assignment_3;

import java.util.Scanner;

public class studentGrade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your score");
		int score=s.nextInt();
		System.out.println(findGrade(score));
	}
	static String findGrade(int score) {
		if(score<100)
			return "Grade: E";
		else if(score<200)
			return "Grade: D";
		else if(score<300)
			return "Grade: C";
		else if(score<400)
			return "Grade: B";
		else if(score<500)
			return "Grade: A";
		else 
			return "Invalid Score";
	}
}
