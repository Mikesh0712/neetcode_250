class Solution {
    public int maxSubArray(int[] nums) {
        //brute force approach making subarrays for all elements 
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum=sum+nums[j];
        //         max=Math.max(sum,max);
        //     }
        // }
        // return max;

        //kadanse algorithm 
        int sum=0,max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                max=Math.max(sum,max);
                if(sum<0)//current sum is negative then make sum =0 and leave that element and go to next element and start from its subarray 
                sum=0;
            }
        return max;
    }
}