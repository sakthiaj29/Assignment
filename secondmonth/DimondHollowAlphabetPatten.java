package secondmonth;

public class DimondHollowAlphabetPatten {

	public static void main(String[] args) {
		DimondHollowAlphabetPatten pattern=new DimondHollowAlphabetPatten();
		pattern.dimondPattern('M');
	}
	
	public void dimondPattern(char ch) {
		int n=ch-'A';
		int start=64;
		for(int i=0;i<=2*n;i++) {
			if(i<=n) {
				start++;
			}
			else {
				start--;
			}
			for(int j=0;j<=2*n;j++) {
				if(i+j==n || j-i==n) {
					System.out.print((char)start);
				}
				else if(i-j==n || i+j==3*n) {
					System.out.print((char)(start));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
