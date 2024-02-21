package Assignment_2;

import java.util.Scanner;

public class SecoundOrder_PolynomialEquationRoots {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Format of Secound Order Polynomial Equation is");
		System.out.println("*** aX^2+bX+C=0 and a!=0***\n");
		System.out.println("Enter a");
		a=s.nextInt();
		if(a==0) {
			System.out.println("Not valid");
		}
		System.out.println("Enter b");
		b=s.nextInt();
		System.out.println("Enter c");
		c=s.nextInt();
		System.out.println("Your Equation is "+a+"X^2+"+b+"X+"+c+"=0");
		double sqrts,root1,root2;
		if(b*b-4*a*c>0) {
			sqrts=Math.sqrt(b*b-4*a*c);
			root1=((-b)+sqrts)/(2*a);
			root2=((-b)-sqrts)/(2*a);
			System.out.println("Roots are "+root1+" ,"+root2);
		}
		else if(b*b-4*a*c==0) {
			root1=-b/(2*a);
			System.out.println("Root  "+root1);	
		}
		else {
			System.out.println("This equation have no real roots");
		}
		
	}

}
