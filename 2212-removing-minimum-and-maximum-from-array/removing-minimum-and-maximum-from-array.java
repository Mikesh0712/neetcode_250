class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {min=nums[i];
            a=i;}
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {max=nums[i];
            b=i;}
        }
        //to get the left and right positions of min and max element
        int left=Math.min(a,b);
        int right=Math.max(a,b);
        //left side deletions
        int fromLeft = right + 1;
        //right side deletions
        int fromRight = nums.length - left;
        //both side deletions
        int bothSides = (left + 1) + (nums.length - right);
        //finally find the minimum number of deletions from each side 
        return Math.min(fromLeft,
               Math.min(fromRight, bothSides));
        
        
    }
}