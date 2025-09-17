package best_time_to_buy_and_sell_stock;

// Best Time to Buy and Sell Stock
// submitted
public class SolutionOptimized {
    public static int maxProfit(int[] prices) {
        int profit;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length - 1; i++) {
            int buyPrice = prices[i];
            int sellPrice = prices[i + 1];

            if (buyPrice < minPrice) {
                minPrice = buyPrice;
            }

            profit = sellPrice - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {2 , 1, 4}; // i will buy from 1 and sell from 7 making profit 6

        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
