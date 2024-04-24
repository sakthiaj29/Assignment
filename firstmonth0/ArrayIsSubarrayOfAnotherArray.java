package firstmonth0;

public class ArrayIsSubarrayOfAnotherArray {

	static boolean isSubarrayOrNot(int[] array, int[] subArray) {
		int count = 0;
		for (int i = 0; i < subArray.length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (subArray[i] == array[j]) {
					count++;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] array = { 11, 1, 13, 21, 3, 7 };
		int[] subArray = { 11, 3, 7 };
		
		if (isSubarrayOrNot(array, subArray)) {
			System.out.println("arr2[] is a subset of arr1[]");
		} else {
			System.out.println("arr2[] is not subset of arr1[]");
		}
	}

}
