class Solution {
    public int maxProfit(int[] prices) {
        int buy_stock = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            buy_stock = Math.min(buy_stock, prices[i]); // Update buy_stock using min function
            int curr_profit = prices[i] - buy_stock;
            profit = Math.max(profit, curr_profit);
        } 
        return profit;
        
    }
}