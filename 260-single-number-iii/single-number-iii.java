class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor^=nums[i];
        }
        //jo 3 aau 5 achanti so tankara kou bit ra difference seita bahar kariba
        int diff=xor&(-xor);
        int a=0,b=0;
        //numbers jaka 2 ta grp re divide karo on the basis of their bits
        for(int num:nums){
            if((num & diff)==0)//& karile jouta same achi seita 0 and different ta 1 
            a^=num;//xor in each grp
            else
            b^=num;
        }
        return new int[]{a,b};
    }
}