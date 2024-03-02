package Assignment_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NPersonsWeightsUsingListArray {
	
	public static int findMinWeight(List<Integer>[] personsWeights,int person) {
		
		List<Integer> list=personsWeights[person];
		
		if(list.size()>=1) {
			
			Collections.sort(list);
			return list.get(0);
		}
		return -1;
	}
	public static void main(String[] args) {
		
		 Scanner S=new Scanner(System.in);
		 
		 System.out.println("enter how many person(s) add");
		 int personsCount=S.nextInt();
		 
		 List<Integer>[] personsWeights=new List[personsCount];
		 
		 for(int i=0;i<personsCount;i++) {
			 personsWeights[i]=new ArrayList<Integer>();
		 }
		 
		 boolean flag=true;
		 int person=-1, weight=-1, weightCnt=0;
		 
		 while(flag) {
			 
			 System.out.println(" 1)enter a person who weights add\n 2)find the nth person weights\n 3)Exit");
			 int option=S.nextInt();
			 	if(option==1) {
			 		
			 		System.out.println("enter a person who  weights add");
			 		person=S.nextInt();
			 		
			 		if(person>0 && person<=personsCount) {
			 			System.out.println("enter how many weight add");
			 			weightCnt=S.nextInt();
			 			
			 				for(int i=0;i<weightCnt;i++) {
			 					
			 					System.out.println("Enter weight");
			 					weight=S.nextInt();
			 					
			 					personsWeights[(person-1)].add(weight);
			 				}
			 				weight=-1;
			 		}
			 		else {
			 			System.out.println("Can't find person");
			 		}
			 	}
			 	else if(option==2) {
			 		
			 		System.out.println("find the nth person weights");
			 		person=S.nextInt();
			 		
			 		weight=findMinWeight(personsWeights,(person-1));
			 		
			 		if(weight!=-1) {
			 			System.out.println("person"+person+" min weight ="+weight);
			 		}
			 		
			 		else {
			 			System.out.println("fist add some weight and find min weight");
			 		}
			 	}
			 	else {
			 		flag=false;
			 	}
		 }
	}
}
