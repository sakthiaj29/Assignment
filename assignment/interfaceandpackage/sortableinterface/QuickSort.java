package assignment.interfaceandpackage.sortableinterface;

public class QuickSort implements Sortable {

	public int[] sort(int[] array) {

		return quickSort(array);
	}

	public int[] quickSort(int[] arr) {
		return quickSort(arr, 0, arr.length - 1);
	}

	private int[] quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		return arr;
	}

	private int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
