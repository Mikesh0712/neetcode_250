class Solution {
    public int reverseBits(int n) {
        return Integer.reverse(n);//built in function
        // int ans=0;
        // for(int i=0;i<32;i++){
        //     ans<<=1;
        //     ans|==(n&1);
        //     n>>>=1;
        // }
        // return ans;
        
    }
}