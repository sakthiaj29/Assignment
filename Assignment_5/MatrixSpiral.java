package Assignment_5;

import java.util.Scanner;

public class MatrixSpiral {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter input");
		int len=s.nextInt();
		int[][] matrix=new int[len][len];
		
		int left=0,top=0,right=len-1,bottam=len-1;
		int start=1,i=0,j=0,count=0;
		
		while(start<=(len*len)) {
			matrix[i][j]=start++;
			if(i<=bottam && count==0) {
				if(i==bottam) {
					left++;
					count++;
					j++;
				}
				else i++;
			}
			else if(j<=right && count==1) {
				if(j==right) {
					bottam--;
					count++;
					i--;
				}
				else j++;
			}
			else if(i>=top && count==2) {
				if(i==top) {
					right--;
					count++;
					j--;
				}
				else i--;
			}
			else if(j>=left && count==3){
				if(j==left) {
					count=0;
					top++;
					i++;
				}
				else j--;
			}
		}
		for(int R=0;R<len;R++) {
			for(int C=0;C<len;C++) {
				System.out.print(matrix[R][C]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}


//kmjhdcgvgvhsajnkbhgxtydjwkjshydteyb
