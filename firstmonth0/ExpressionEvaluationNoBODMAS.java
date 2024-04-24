package firstmonth0;

public class ExpressionEvaluationNoBODMAS {

	static int evaluateExpression(String str) {
		
		if( Character.isDigit(str.charAt(0)) && str.length()>2) {
			char spl=' ',count=0;
			int operant2=-1, operant1=str.charAt(0)-'0';
			
			for(int i=1;i<str.length();i++) {
				if( Character.isDigit(str.charAt(i)) ) {
					operant2=str.charAt(i)-'0';
					operant1=calculate(operant1, operant2, spl);
					//System.out.println(operant1);
					count=0;
				}
				else {
					if(count!=0) {
						return -1;
					}
					spl=str.charAt(i);
					count++;
				}
			}
			return operant1;
		}
		
		return -1;
	}
	private static int calculate(int operant1, int operant2, char ch) {
		if (ch == '+') {
			return operant1 + operant2;
		} else if (ch == '-') {
			return operant1 - operant2;
		} else if (ch == '*') {
			return operant1 * operant2;
		} else if (ch == '/') {
			return operant1 / operant2;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		System.out.println( evaluateExpression("4-2+6*3") );
	}

}
