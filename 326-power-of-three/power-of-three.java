class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        return false;

        while(n%3==0){//jab tak 3 se divide ho raha hai karte raho 
            n=n/3;
        }
        return n==1;//agar last mai 1 mila toh power of 3 
    }
}