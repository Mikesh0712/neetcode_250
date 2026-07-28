class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Agar aaj ka price jyada hai
            if (prices[i] > prices[i - 1]) {
                // Profit add kar lo
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}