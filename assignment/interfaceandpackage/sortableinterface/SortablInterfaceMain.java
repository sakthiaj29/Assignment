package assignment.interfaceandpackage.sortableinterface;

import java.util.Arrays;
import java.util.Scanner;

public class SortablInterfaceMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int[] array= {1,6,8,3,4,5,10};
		Sortable sortable;
		
		System.out.println("\n 1 -> Bubble Sort\n 2 -> Quick Sort\n 3 -> Merge Sort\n ");
		System.out.print("enter your option: ");
		int option =scanner.nextInt();
		
		System.out.println("\n Given Array: "+Arrays.toString(array));
		
		if(option==1) {
			sortable=new BubbleSort();
			array=sortable.sort(array);
		}
		else if(option==2) {
			sortable=new QuickSort();
			array=sortable.sort(array);
		}
		else if(option==3) {
			sortable=new MergeSort();
			array=sortable.sort(array);
		}

		System.out.println("\n Sorted Array: "+Arrays.toString(array));
		scanner.close();
	}

}
