class Solution {
    int f(int[][] dp, String word1, String word2, int m, int n){
        if(n == 0 || m == 0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        if(word1.charAt(m-1) == word2.charAt(n-1)){
            return dp[m][n] = 1 + f(dp, word1, word2, m-1, n-1);
        }

        return dp[m][n] = Math.max(f(dp, word1, word2, m-1, n), f(dp, word1, word2, m, n-1));
    }


    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i], -1);
        }

        int lcs = f(dp, word1, word2, m, n);
        return m - lcs + n - lcs;
    }
}