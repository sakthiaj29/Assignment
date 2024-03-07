package assignment1;

import java.util.Scanner;

public class AverageWeightOfTenPeople {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float totalWeight=0f;
		
		for(byte index=0;index<10;index++) {
			
			System.out.println("Enter person"+(index+1)+" weight (kg)");
			totalWeight+=scanner.nextFloat();	
		}
		
		System.out.println("Average weight is "+(totalWeight/10)+"kg");
		scanner.close();
	}

}
