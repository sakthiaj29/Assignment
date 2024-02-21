package Assignment_2;

import java.util.Scanner;

public class convertTimeSecondsToHH_MM_SSFormat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Secounts");
		int secounds=s.nextInt();
		int hours=0,remHours=0,minutes=0,remMinutes=0,secound;
		hours=secounds/3600;
		remHours=secounds%3600;
		minutes=remHours/60;
		secound=remMinutes%60;
		System.out.println(hours+" hour(s): "+minutes+" minute(s): "+secound+" secound(s)");
	}

}
