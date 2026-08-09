class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){//if non zero element taku agaku anaipakao 
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(pos<nums.length)//after all non zero elements agaku anila pare jetiki position banchigala sabu zero fill up karidiya
        {
            nums[pos]=0;
            pos++;
        }
        
    }
}