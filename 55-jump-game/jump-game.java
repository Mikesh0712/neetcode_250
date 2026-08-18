class Solution {
    public boolean canJump(int[] nums) {
        int far=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>far)//if current index pahanchihebani then false
            return false;

            far=Math.max(far,nums[i]+i);//max index that we can reach
            if(far>=nums.length-1)//last index reached
            return true;
        }
        return false;
    }
}


//dry run:{2,3,1,1,4,
//i=0   nums[i]=2   i+nums[i]=2  far=2   
//i=1   nums[i]=3   i+nums[i]=1+3=4  far=4  if(4>=4) true

//dry run:{3,2,1,0,4}
//i=0  nums[i]=3  i+nums[i]=0+3=3  far=3
//i=1  nums[i]=2  i+nums[i]=3  far=3  if(3>=4) false