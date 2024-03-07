package assignment1;

import java.util.Scanner;

class Person{
	
	String name;
    float weight;
	float height;
	float bmi;
	String remark;
	
	Person( String name, float weight, float height, float bmi, String remark){
		
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.remark = remark;
	}
}

public class PersonsBMICompare {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter the number of persons to compare: ");
		int personCount=scanner.nextInt();
		Person[] persons = new Person[personCount];
		String name = "";
		float weight = 0f;
		float height = 0f;
		float bmi = 0f;
		float meter = 0f;
		String remark = "";
		
		for(int count=1;count<=personCount;count++) {
			
			System.out.print("\nEnter the name of person "+count+": ");
			name=scanner.next();
			System.out.print("Enter weight of person "+count+" in kg: ");
			weight=scanner.nextFloat();
			System.out.print("Enter height of person "+count+" in cm: ");
			height=scanner.nextFloat();
			meter=height/100;
			bmi=(weight/(meter*meter));
			remark=((bmi<=18.4)?"Underweight":(bmi>=18.5 && bmi<=24.9)?"Normal":(bmi>=25.0 && bmi<=29.9)?"Overweight":"Obese");
			
			persons[count-1]=new Person(name, weight, height, bmi, remark);
		}
		Person temp;
		for(int i=0;i<personCount;i++) {
			
			for(int j=i+1;j<personCount;j++) {
				
				if(persons[i].bmi<persons[j].bmi) {
					
					temp=persons[j];
					persons[j]=persons[i];
					persons[i]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.printf("%-15s %-15s %s\n","Name","BMI","Remark");
		System.out.println("---------------------------------------");
		for(int i=0;i<personCount;i++) {
			System.out.printf("%-15s %-15.1f %s", persons[i].name, persons[i].bmi, persons[i].remark);
			System.out.println();
		}
		
		scanner.close();
	}
	
}
