package firstmonth0;

import java.util.Scanner;

public class FindSeatPosition {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("\tflight seat has number: 1 - 103");
		System.out.println("\tThe seating arrangement of flight will be as shown in the bellow");
		System.out.println("\n\t|WS MS AS       AS MS WS|");
		System.out.println("\t|-----------------------|");
		System.out.println("\t|1  2  3         4  5  6|");
		System.out.println("\t|12 11 10        9  8  7|");
		System.out.println("\t|                    ...|");
		System.out.print("\nEnter seat number: ");
		int seatNumber=scanner.nextInt();
		
		System.out.println("\nSeat Position: "+ findPosition(seatNumber));
		
	}

	private static String findPosition(int seatNumber) {
		int comp=seatNumber%6;
		switch(comp) {
			case 0,1:
				return "WS";
			case 2,5:
				return "MS";
			case 3,4:
				return "AS";
		}
		return "";
	}

}
