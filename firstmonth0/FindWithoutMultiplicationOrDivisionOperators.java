package firstmonth0;

public class FindWithoutMultiplicationOrDivisionOperators {

	static int multiplyBy15(int n) {
		int total=0;
		for(int i=1;i<=n;i++) {
			total+=15;
		}
		return total;
	}
	
	static int multiplyBy15DividedBy16(int n) {
		int total=multiplyBy15(n);
		int count=0;
		while(total>=16) {
			total-=16;
			count++;
		}
		return count;
	}
	
	static int dividedBy7AndHalf(int n){
		int total=n>>1;
		for(int i=1;i<=n;i++) {
			total+=7;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println( multiplyBy15(8) );
		
		System.out.println( multiplyBy15DividedBy16(10) );
		
		System.out.println( dividedBy7AndHalf(20) );
	}

}
