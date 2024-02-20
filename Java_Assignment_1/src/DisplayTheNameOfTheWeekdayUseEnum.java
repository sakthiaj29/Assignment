import java.util.Scanner;

public class DisplayTheNameOfTheWeekdayUseEnum {

	public enum WeekDays{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number (0-6)");
		int day=s.nextInt();
		if(day>=0 && day<=6) {
			System.out.println(WeekDays.values()[day]);
		}
		else {
			System.out.println("Not Vaild Number");
		}
	}

}
