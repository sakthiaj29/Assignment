package secondmonth;

public class DescendingFrequencySort {

	public static void main(String[] args) {

		DescendingFrequencySort sort = new DescendingFrequencySort();

		int[] array = { 4, 1, 2, 3, 1, 2, 5, 2 };

		sort.arrangeArray(array);
	}

	public void arrangeArray(int[] array) {

		int length = array.length;
		int[] frequency = new int[length];

		for (int i = 0; i < length; i++) {
			frequency[i] = 1;
		}

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j]) {
					frequency[i] += 1;
					frequency[j] += 1;
				}
			}
		}
		int num = 0, freq = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (frequency[i] < frequency[j]) {

					num = array[i];
					array[i] = array[j];
					array[j] = num;

					freq = frequency[i];
					frequency[i] = frequency[j];
					frequency[j] = freq;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i]);
		}

	}
}
