package firstmonth;

import java.util.Arrays;

//Q: 17

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		
		int[] array= {9,2,0,4,3,0,2,0};
		
		array=moveAllZeroAtEnd(array);
		 
		System.out.println(Arrays.toString(array));
		
	}

	private static int[] moveAllZeroAtEnd(int[] array) {
		int nonZeroIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }
		
		 while(nonZeroIndex<array.length){
	            array[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }
		return array;
	}
}
