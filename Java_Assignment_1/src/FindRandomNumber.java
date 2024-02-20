import java.util.Scanner;

public class FindRandomNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" 1) 0-1\n 2) 0-99\n 3) 0-999\n 4) 0-9999");
		int num=s.nextInt();
		switch(num) {
			case 1:
				System.out.println(Math.random());
				break;
			case 2:
				System.out.println((int)(Math.random()*10));
				break;
			case 3:
				System.out.println((int)(Math.random()*100));
				break;
			case 4:
				System.out.println((int)(Math.random()*1000));
				break;
		}
		
	}

}
