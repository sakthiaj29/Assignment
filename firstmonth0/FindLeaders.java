package firstmonth0;

import java.util.Stack;

public class FindLeaders {

	static void findLeadrs(int[] array) {
		Stack<Integer> stack=new Stack<>();
		int leader=-1;
		for(int i=array.length-1;i>=0;i--) {
			if(i==array.length-1) {
				leader=array[i];
				stack.push(leader);
			}
			else if(leader<array[i]) {
				leader=array[i];
				stack.push(leader);
			}
		}
	}
	public static void main(String[] args) {
		
		int[] array={16, 17, 4, 3, 5, 2};
		
		findLeadrs(array);
		
	}

}
