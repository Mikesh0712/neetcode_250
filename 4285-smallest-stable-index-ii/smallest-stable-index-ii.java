class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int n=nums.length;
       int[] minRight=new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) 
        {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        } 
        //maximum from 0 to i 
        int maxLeft = nums[0];
        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            if (maxLeft - minRight[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}
//brute force
// for(int i=0;i<nums.length;i++)
//         {
//             int min=Integer.MAX_VALUE;
//             int max=Integer.MIN_VALUE;
//             for(int j=0;j<=i;j++)
//             {
//                 max=Math.max(max,nums[j]);
//             }
//             for(int j=i;j<nums.length;j++)
//             {
//                 min=Math.min(min,nums[j]);
//             }
//             if(max-min<=k)
//             return i;
//         }
//         return -1;