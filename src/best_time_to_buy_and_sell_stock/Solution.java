package best_time_to_buy_and_sell_stock;

// Best Time to Buy and Sell Stock
public class Solution {
    public static int maxProfit(int[] prices) {
        int profit;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) { // 10, 1, 5, 6, 7, 1
            int buyPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sellPrice = prices[j];

                if (sellPrice > buyPrice) {
                    profit = sellPrice - buyPrice;

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
