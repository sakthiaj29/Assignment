package Assignment_2;

import java.util.Scanner;

public class convertCelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Celsius:");
		int Celsius = s.nextInt();
		double Fahrenheit = (Celsius * 9/5) + 32;
		System.out.println("Celsius ="+Celsius+" , Fahrenheit ="+Fahrenheit);
	}

}
