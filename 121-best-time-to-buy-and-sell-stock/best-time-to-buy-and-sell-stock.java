class Solution {
    public int maxProfit(int[] prices) {
        // Sabse pehla price hi minimum maan lete hai
        int minPrice = prices[0];
        // Initially koi profit nahi
        int maxProfit = 0;
        // Day 2 se start, kyuki Day 1 already minPrice hai
        for (int i = 1; i < prices.length; i++) {
            // Agar aur sasta mila to wahi buy karenge
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Agar aaj beche to kitna profit hoga like day 2 ke liye 0 hoga but for day 3 profit milega=4(5(prices[i]-1(minprice))
            int profit = prices[i] - minPrice;
            // Ab tak ka best profit store karo
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        // Maximum possible profit
        return maxProfit;
    }
}