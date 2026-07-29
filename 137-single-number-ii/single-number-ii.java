class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        //check for groups of 3
        for(int i=0;i<n-2;i+=3)
        {
            //jadi 1st and 2nd are not equal not then 1st hi single number 
            if (nums[i]!=nums[i + 1]) 
            {
                return nums[i];
            }
            ////jadi 2nd and 3rd are not equal then 2nd number is single number
            if(nums[i+1]!=nums[i+2])
             {
                return nums[i+2];
            }
        }
        //if loop re nahi then last element hi single number 
        return nums[n - 1];
    }
}