package Assignment_2;

import java.util.Scanner;

public class BitwiseOperatorsExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		
        System.out.println("enter number1");
        a=s.nextInt();
        
        System.out.println("enter number2");
        b=s.nextInt(); 
        
        System.out.println("Bitwise AND: "+(a&b));
        
        System.out.println("Bitwise OR: "+(a|b));
     
        System.out.println("Bitwise XOR: "+(a^b));
        
        System.out.println("Bitwise NOT of a: "+(~a));
        
        System.out.println("Left shift of a: "+(a<<1));
        
        System.out.println("Right shift of a: "+(a>>1));
        
        System.out.println("Unsigned Right shift of a: "+(a>>>1));
	}

}
