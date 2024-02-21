package Assignment_2;

import java.util.Scanner;

public class calculateBodyMassIndex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("*** BMI Calculator ***");
		System.out.println(" Select\n 1)Metric (kilograms, meters)\n 2)Imperial (pounds, inches)");
		int select=s.nextInt();
		if(select==1) {
			System.out.println("Enter Weight (kilograms)");
			int weight=s.nextInt();
			System.out.println("Enter Height (meters)");
			double	height=s.nextDouble();
			System.out.print("Body Mass : ");
			System.out.printf("%.2f",weight/(height*height));
		}
		else if(select==2) {
			System.out.println("Enter Weight (pounds)");
			int weight=s.nextInt();
			System.out.println("Enter Height (inches)");
			double	height=s.nextDouble();
			System.out.print("Body Mass : ");
			System.out.printf("%.2f", 703*(weight/(height*height)));
		}
		else {
			System.out.println("Is Not Valid Number");
		}
		
	}

}
