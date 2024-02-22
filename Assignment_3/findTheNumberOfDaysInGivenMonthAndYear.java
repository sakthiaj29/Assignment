package Assignment_3;

import java.util.Scanner;

public class findTheNumberOfDaysInGivenMonthAndYear {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=s.nextInt();
		System.out.println("Enter Month (1 - 12)");
		int month=s.nextInt();
		switch(month) {
			case 1,3,5,7,8,10,12:
				System.out.println("Number of days 31");
				break;
			case 2:
				if((year%4==0 && year%100!=0) || year%400==0) {
					System.out.println("Number of days 29");
				}
				else {
					System.out.println("Nmuber of days 28");
				}
				break;
			case 4,6,9,11:
				System.out.println("Number of days 30");
				break;
			default:
				System.out.println("Is Not Vaild Month");
		}
	}
}
