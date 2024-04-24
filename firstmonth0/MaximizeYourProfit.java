package firstmonth0;

public class MaximizeYourProfit {

	static int findMaxProfit(int[] prices) {
		
		int minPrice = prices[0], maxPrice = 0;
		int index = -1;
		for (int i = 0; i < prices.length; i++) {
			if (minPrice >= prices[i]) {
				minPrice = prices[i];
				index = i;
			}
		}
		maxPrice = prices[index];
		for (int i = index; i < prices.length; i++) {
			if (maxPrice < prices[i]) {
				maxPrice = prices[i];
			}
		}

		return (maxPrice - minPrice);
		
	}
	public static void main(String[] args) {
		
		int[] prices = { 3, 2, 1, 4, 5, 6 };

		System.out.println(findMaxProfit(prices));
	}

}
