class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        //brute force
        // int sum=left;
        // while(left<=right)
        // {
        //     sum&=left;
        //     left++;
        // }
        // return sum;



        int count=0;
        while(left!=right)
        {
            //remove right side last bit ku hatao
            left=left>>1;
            right=right>>1;
            count++;
        }
        return left<<count;//add the removed bits in the form of zero
    }
}