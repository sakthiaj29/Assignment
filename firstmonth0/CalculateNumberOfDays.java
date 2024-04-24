package firstmonth0;

public class CalculateNumberOfDays {

	static int calculateDays(int[] dt1, int[] dt2) {
		int ans=0;
		ans=(dt2[2]-dt1[2])*365+(dt2[1]-dt1[1])*28+(dt2[0]-dt1[0]);
		return ans;
	}
	public static void main(String[] args) {
		
		int[] dt1 = {1, 2, 2000}, dt2 = {1, 2, 2004};
		
		System.out.println( calculateDays(dt1, dt2) );
		
	}

}
