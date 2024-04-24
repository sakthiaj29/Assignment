package firstmonth0;

import java.util.Scanner;

public class FindNumberOfSquareInRectangle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Rectangle Length:");
		int length=scanner.nextInt();
		
		System.out.print("\nEnter Rectangle width:");
		int width=scanner.nextInt();
		
		System.out.println("\nNumber of square: "+ findNumberOfSquars(length, width));
	}

	static int findNumberOfSquars(int length, int width) {
		int lcm=1;
		for(int i=2;i<Math.min(length, width);i++) {
			if(length%i==0 && width%i==0) {
				lcm=i;
			}
		}
		return ((length*width)/(lcm*lcm));
	}

}
