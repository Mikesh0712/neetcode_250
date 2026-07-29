class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;

        for(int i=0;i<32;i++){
            int count=0;
            //count set bits at position i
            for(int num:nums){
                if(((num>>i)&1)==1)
                {
                    count++;
                }
            }
            // If remainder is 1, this bit belongs to answer
            if(count%3!=0){
                ans|=(1<<i);
            }
        }
        return ans;
    }
}