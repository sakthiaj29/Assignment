package Assignment_5;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row1=0,colm1=0,row2=0,colm2=0;
		System.out.println("Matrix1 Row");
		row1=s.nextInt();
		System.out.println("Matrix1 Column");
		colm1=s.nextInt();
		int[][] matrix1=new int[row1][colm1];
		System.out.println("Matrix1 Elements");
		for(int R=0;R<row1;R++) {
			for(int C=0;C<colm1;C++) {
				matrix1[R][C]=s.nextInt();
			}
		}
		System.out.println("Matrix2 Row");
		row2=s.nextInt();
		System.out.println("Matrix2 Column");
		colm2=s.nextInt();
		int[][] matrix2=new int[row2][colm2];
		System.out.println("Matrix1 Elements");
		for(int R=0;R<row2;R++) {
			for(int C=0;C<colm2;C++) {
				matrix2[R][C]=s.nextInt();
			}
		}
		System.out.println("Matrix 1:");
		for(int R=0;R<row1;R++) {
			System.out.print("\t");
			for(int C=0;C<colm1;C++) {
				System.out.print(matrix1[R][C]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for(int R=0;R<row2;R++) {
			System.out.print("\t");
			for(int C=0;C<colm2;C++) {
				System.out.print(matrix2[R][C]+" ");
			}
			System.out.println();
		}
		if(colm1!=row2) {
			System.out.println("Invalis two matrixs");
		}
		else {
			int[][] multiplicationMatrix=new int[row1][colm2];
			int sum=0;
			for(int R=0;R<row1;R++) {
				for(int C=0;C<colm2;C++) {
					sum=0;
					for(int K=0;K<colm1;K++) {
						sum+=matrix1[R][K]*matrix2[K][C];
					}
					multiplicationMatrix[R][C]=sum;
				}
			}
			System.out.println("Multiplication Matrix :");
			for(int R=0;R<row1;R++) {
				System.out.print("\t");
				for(int C=0;C<colm2;C++) {
					System.out.print(multiplicationMatrix[R][C]+" ");
				}
				System.out.println();
			}
		}
		s.close();
	}

}
