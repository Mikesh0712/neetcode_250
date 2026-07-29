class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i+=3) 
        {
            if (nums[i]!=nums[i + 1]) 
            {
                return nums[i];
            }
            if(nums[i+1]!=nums[i+2])
             {
                return nums[i+2];
            }
        }
        return nums[n - 1];
    }
}