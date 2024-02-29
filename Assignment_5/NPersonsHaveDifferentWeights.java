package Assignment_5;

import java.util.Scanner;

public class NPersonsHaveDifferentWeights {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter persons count");
		int row=s.nextInt();
		
		int[][] personsWeights=new int[row][];
		int[] personMinsWeights=new int[row];
		int weightCount=0,minWeight=0;
		
		for(int i=0;i<row;i++) {
			System.out.println("Enter  person"+(i+1)+" weights count");
			weightCount=s.nextInt();
			
			personsWeights[i]=new int[weightCount];
			
			System.out.println("Enter person"+(i+1)+" weights");
			personsWeights[i][0]=s.nextInt();
			
			minWeight=personsWeights[i][0];
			
			for(int j=1;j<weightCount;j++) {
				personsWeights[i][j]=s.nextInt();
				minWeight=Math.min(personsWeights[i][j], minWeight);
				}
			
			personMinsWeights[i]=minWeight;
		}
		System.out.println("\nenter person");
		int person=s.nextInt();
		if((person-1)<personMinsWeights.length) {
			System.out.println(person+"person minimum weight="+personMinsWeights[(person-1)]);
		}
		else {
			System.out.println("person not found");
		}
		s.close();
	}

}
