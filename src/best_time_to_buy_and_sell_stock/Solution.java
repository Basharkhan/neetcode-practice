package best_time_to_buy_and_sell_stock;

// Best Time to Buy and Sell Stock
public class Solution {
    public static int maxProfit(int[] prices) {
        int profit;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];

            if (buyPrice < minPrice) {
                minPrice = buyPrice;
            }

            for (int j = i + 1; j < prices.length; j++) {
                int sellPrice = prices[j];

                if (sellPrice > minPrice) {
                    profit = sellPrice - minPrice;
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {10, 1, 5, 6, 7, 1}; // i will buy from 1 and sell from 7 making profit 6

        int profit = maxProfit(prices);
         System.out.println(profit);
    }
}
