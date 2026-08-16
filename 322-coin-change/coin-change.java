class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);//fill the array with the impossible amount initaially
        dp[0]=0;//for amt=0 we have taken this base condition
        for(int i=0;i<=amount;i++)//calculate each amount
        {
        for(int coin:coins)//try each coin
        {
            if(coin<=i)//if current coin amt se <= hai then 
            {
                dp[i]=Math.min(dp[i],dp[i-coin]+1);//use the coin and remaining=i(current amt)-coin
            }
        } 
        }
        if(dp[amount]==amount+1)//if amount not possible
        return -1;
        return dp[amount];

        
    }
}