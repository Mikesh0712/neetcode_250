class Solution {
    public int[] countBits(int n) {
        int []ans=new int[n+1];
        ans[0]=0;//as 0's binary is always 0
        for(int i=1;i<=n;i++)
        {
            ans[i]=ans[i/2]+i%2;//i/2 helps as it is already calculated and i%2 checks for last digit is 1 or 0 (remember this)
        } 
        return ans;
    }
}



//Dry Run
// i = 1
// ans[1] = ans[0] +1= 0 + 1= 1

// i = 2
// ans[2] = ans[1] + 0= 1

// i = 3
// ans[3] = ans[1] + 1= 2

// i = 4
// ans[4] = ans[2] + 0= 1

// i = 5
// ans[5] = ans[2] + 1= 2