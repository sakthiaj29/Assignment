package secondmonth;

public class PositiveLargestContinuousSum {

	public static void main(String[] args) {

		PositiveLargestContinuousSum continuousSum = new PositiveLargestContinuousSum();

		int[] array = { 2, 5, 7, -1, -3, 2, 9, 7 };

		continuousSum.findPositiveLargestContinuousSum(array);
	}

	public void findPositiveLargestContinuousSum(int[] array) {

		int left = 0, right = 1, currSum = 0, sum = 0;
		int start = 0, end = 0;
		if (array[0] > 0) {
			currSum = array[0];
		}
		while (right < array.length) {
			if (array[right] >= 0) {
				currSum += array[right];
			} else {
				if (sum < currSum) {
					start = left;
					end = right;
					sum = currSum;
				}
				currSum = 0;
				left = right;
			}
			right++;
		}
		if (sum < currSum) {
			start = left + 1;
			end = right - 1;
			sum = currSum;
		}

		System.out.println("Sum: " + sum);
		System.out.print("Elements: ");
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
