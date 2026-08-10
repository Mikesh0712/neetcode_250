class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int [cost.length+2];
        for(int i=cost.length-1;i>=0;i--)
        {
            //current stair ra cost +min of tara next 1 or 2 steps
           dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        //we can start either from 0 or 1 stair as given in question  
        return Math.min(dp[0],dp[1]); 
    }
}