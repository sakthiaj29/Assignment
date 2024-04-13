package assignment.arraylist.dataaccesspatterns;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomVsSequential {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		long start=0,end=0;
		ArrayList<Integer> arrayList=new ArrayList<>();
		System.out.println("Enter number Between (1-1000)");
		int num=scanner.nextInt();
		
		for(int i=1;i<=1000;i++) {
			arrayList.add(i);
		}
		
		start=System.nanoTime();
		for(Integer number:arrayList) {
			if(number==num) {
				break;
			}
		}
		end=System.nanoTime();
		System.out.println("Sequential access time(for-each): "+(end-start));
		
		start=System.nanoTime();
		for(int i=0;i<arrayList.size();i++) {
			if(arrayList.get(i)==num) {
				break;
			}
		}
		end=System.nanoTime();
		System.out.println("Random access time(for-loop): "+(end-start));
		scanner.close();
	}

}
