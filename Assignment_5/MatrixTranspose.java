package Assignment_5;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=0,colm=0;
		System.out.println("Matrix Row");
		row=s.nextInt();
		System.out.println("Matrix Column");
		colm=s.nextInt();
		int[][] matrix=new int[row][colm];
		System.out.println("Matrix Elements");
		for(int R=0;R<row;R++) {
			for(int C=0;C<colm;C++) {
				matrix[R][C]=s.nextInt();
			}
		}
		System.out.println("Matrix Is");
		for(int R=0;R<row;R++) {
			for(int C=0;C<colm;C++) {
				System.out.print(matrix[R][C]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix Transpose");
		for(int C=0;C<colm;C++) {
			for(int R=0;R<row;R++) {
				System.out.print(matrix[R][C]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
