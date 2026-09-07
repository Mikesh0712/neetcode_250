class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int dp[][]=new int[m+1][n+1];
        //if word1 is empty insert all letters of word2 
        for(int j=0;j<=n;j++){
        dp[0][j]=j;
        }

        //if word2 is empty delete all characters of word1
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //characters are same
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];//for every pair of characters
                }
                //characters are different
                else {
                    //remember this 
                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    int replace = dp[i - 1][j - 1];
                    dp[i][j] = 1 + Math.min(delete,
                                  Math.min(insert, replace));
                }
            }
        }

        return dp[m][n];
    }
}