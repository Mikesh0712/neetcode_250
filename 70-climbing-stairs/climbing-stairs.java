class Solution {
    public int climbStairs(int n) {
        //fails due to brute force approach
        // if(n<=2)
        // return n;
        // return climbStairs(n-1)+climbStairs(n-2);
        
        //just do like fibonacci number without recursion
        if(n<=2){
            return n;
        }
        int a=1,b=2;
        //for n>2 i.e from 3 to n we will count
        for(int i=3;i<=n;i++){
            int c=a+b;//current stair paen kete ta ways 
            //update the previous values 
            a=b;
            b=c;
        }
        return b;
    }
}