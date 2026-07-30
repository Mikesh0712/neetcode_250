class Solution {
    public int reverseBits(int n) {
        //return Integer.reverse(n);//built in function
        int ans=0;
        for(int i=0;i<32;i++){
            ans<<=1;//left shift the ans by 1 bit
            ans|=(n&1);//n ka last bit ko answer mai add karo
            n>>>=1;//n ko unsigned right shift by 1 bit karo
        }
        return ans;
        
    }
}