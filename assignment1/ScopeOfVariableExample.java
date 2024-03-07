package assignment1;

public class ScopeOfVariableExample {

	public static void main(String[] args) {
		
		 int number1=10;
		 
		 if(number1>5) {
			 
			 int number2=20;
			 System.out.println(number1);
			 System.out.println(number2);
		 }
		 
		 System.out.println(number1);
		 System.out.println(number2); //number2 cannot be resolved to a variable
		 
		 
	}

}
