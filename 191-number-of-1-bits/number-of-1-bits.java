class Solution {
    public int hammingWeight(int n) {
        int count=0;
       // return Integer.bitCount(n);
       while(n!=0)
       {
        n=n&(n-1);//to remove set bit like 13(1101) & 12(1100)=1100 then 1100&1011=1000 then 1000&0111=0000 similarly for others
        count++;
       }
        return count;
    }
}