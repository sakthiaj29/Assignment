package assignment.interfaceandpackage.sortableinterface;

public class BubbleSort implements Sortable {

	public int[] sort(int[] array){
		int temp=0; 
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}
