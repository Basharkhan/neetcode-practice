package best_time_to_buy_and_sell_stock;

public class Solution2 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            minPrice = Math.min(price, minPrice);

            int newProfit = price - minPrice;

            profit = Math.max(profit, newProfit);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // 5
        // int[] prices = {2, 2, 2, 2}; // 0
        // int[] prices = {5, 4, 3, 2}; // 0
        // int[] prices = {7, 6, 4, 3, 1}; // 0

        int maxProfit = maxProfit(prices);
        System.out.println("Max profit: " + maxProfit);
    }
}
