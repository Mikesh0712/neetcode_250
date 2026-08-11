class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        //skip the 1st house 
        int prev2=0,prev1=0;
        for(int i=1;i<n;i++)
        {
            int take=nums[i]+prev2;
            int skip=prev1;
            int current=Math.max(take,skip);
            prev2=prev1;
            prev1=current;
        }
        int case1=prev1;
        //skip the second house
        prev2=0;prev1=0;
        for(int i=0;i<n-1;i++)
        {
            int take=nums[i]+prev2;
            int skip=prev1;
            int current=Math.max(take,skip);
            prev2=prev1;
            prev1=current;
        }
        int case2=prev1;
        return Math.max(case1,case2);
        
    }
}