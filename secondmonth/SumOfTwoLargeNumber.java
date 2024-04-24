package secondmonth;

public class SumOfTwoLargeNumber {

	public static void main(String[] args) {

		SumOfTwoLargeNumber sumOfNumber = new SumOfTwoLargeNumber();
		int[] number1 = { 9, 8, 7 };
		int[] number2 = { 9, 2 };
		sumOfNumber.sum(number1, number2);
	}

	public void sum(int[] number1, int[] number2) {

		int len = (number1.length >= number2.length) ? number1.length : number2.length;

		if (number2[0] == 9 && number1[0] == 9) {
			len += 1;
		}

		int[] sum = new int[len];
		int cary = 0, s = 0;
		int length1 = number1.length - 1, length2 = number2.length - 1;

		for (int i = len - 1; i >= 0; i--) {
			if (length1 >= 0 && length2 >= 0) {
				s = (number1[length1] + number2[length2] + cary);
			} else if (length1 >= 0) {
				s = number1[length1] + cary;
			} else if (length2 >= 0) {
				s = number2[length2] + cary;
			} else {
				s = cary;
			}
			sum[i] = s % 10;
			cary = s / 10;
			length1--;
			length2--;
		}

		print(sum);
	}

	public void print(int[] sum) {

		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i]);
		}
	}

}
