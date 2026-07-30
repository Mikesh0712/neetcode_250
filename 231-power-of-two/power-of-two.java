class Solution {
    public boolean isPowerOfTwo(int n) {

        return n>0 && (n&(n-1))==0;//if number 2 ra power heithiba taku ta just gote takla number saha and kariki check kara if =0 then power of two as seita prove karideba n re gote hi matra set bit achi (if set bit>1 then never power of 2)        
    }
}