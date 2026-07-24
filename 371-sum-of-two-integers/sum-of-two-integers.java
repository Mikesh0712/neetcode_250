class Solution {
    public int getSum(int a, int b) {
        //return a+b;
        int sum=0;
        while(b!=0)
        {
            sum=(a&b)<<1;//a and b then left shift by 1 all in binary
            a=a^b;//a xor b in binary
            b=sum;
        }
        return a;
    }
}