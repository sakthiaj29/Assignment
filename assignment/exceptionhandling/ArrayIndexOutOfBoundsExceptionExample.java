package assignment.exceptionhandling;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		try {
			
			int[] array= {1,2};
			
			array[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Oops!, ArrayIndexOutOfBoundsException has found");
		}
	
	}

}
