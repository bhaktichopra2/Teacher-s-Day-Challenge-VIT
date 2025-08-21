public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Example 1): " + solution.maxProfit(prices1)); // Expected: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Example 2): " + solution.maxProfit(prices2)); // Expected: 0

        int[] prices3 = {};
        System.out.println("Max Profit (Example 3): " + solution.maxProfit(prices3)); // Expected: 0
    }
}
