package firstmonth0;

import java.util.Stack;

public class EvaluatePostfixExpression {

	static String findValue(String input) {
		Stack<Integer> stack = new Stack<Integer>();
		int operant1 = 0, operant2 = 0, ans = 0;
		char ch = ' ';
		
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				if (stack.size() > 1) {
					operant1 = stack.pop();
					operant2 = stack.pop();
					ans = calculate(operant2, operant1, ch);
					stack.push(ans);
				} else {
					return null;
				}
			}
		}
		return "" + stack.pop();
	}

	private static int calculate(int operant1, int operant2, char ch) {
		if (ch == '+') {
			return operant1 + operant2;
		} else if (ch == '-') {
			return operant1 - operant2;
		} else if (ch == '*') {
			return operant1 * operant2;
		} else if (ch == '/') {
			return operant1 / operant2;
		}
		return 0;
	}

	public static void main(String[] args) {
		String input = "545*+5/";
		String result = findValue(input);
		
		if (result == null) {
			System.out.println("Invalid input!");
		} else {
			System.out.println("Ans: " + result);
		}
	}

}
