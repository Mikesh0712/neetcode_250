class Solution {
    public int numDecodings(String s) {
       int n=s.length();
       int dp[]=new int[n+1];//no of ways to decode from index i
       dp[n]=1;//string completed
       for(int i=n-1;i>=0;i--)//right to left traversal
       {
        if(s.charAt(i)=='0')//we cannot decode 0 alone 
        dp[i]=0;
        else
        {
            dp[i]=dp[i+1];//ek digit ko decode karo
            if(i+1<n)//duita decode karne ki koshish
            {
                int num=Integer.parseInt(s.substring(i,i+2));
                if(num>=10 && num<=26)//10 to 26 decode karipariba
                {
                    dp[i]+=dp[i+2];
                }
            }
        }
       }
       return dp[0];
    }
}