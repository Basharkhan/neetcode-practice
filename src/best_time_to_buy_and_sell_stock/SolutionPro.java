package best_time_to_buy_and_sell_stock;

// Best Time to Buy and Sell Stock
public class SolutionPro {
    public static int maxProfit(int[] prices) {
        // 10, 1, 5, 6, 7, 1
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            int buyPrice = prices[l];
            int sellPrice = prices[r];

            if (sellPrice > buyPrice) {
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }

            r++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {30, 20, 10, 5, 100, 200, 1, 300}; // i will buy from 1 and sell from 7 making profit 6

        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
