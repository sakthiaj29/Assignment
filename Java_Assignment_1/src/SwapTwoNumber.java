
public class SwapTwoNumber {

	public static void main(String[] args) {
		int numberOne=10;
		int numberTwo=35;
		System.out.println("Number One="+numberOne+" , Number Two="+numberTwo);
		
		//swap two number using another number
		int temp=numberOne;
		numberOne=numberTwo;
		numberTwo=temp;
		
		//swap two number without another number
		System.out.println("Number One="+numberOne+" , Number Two="+numberTwo);
		numberOne=numberOne*numberTwo;
		numberTwo=numberOne/numberTwo;
		numberOne=numberOne/numberTwo;
		System.out.println("Number One="+numberOne+" , Number Two="+numberTwo);
	}

}
