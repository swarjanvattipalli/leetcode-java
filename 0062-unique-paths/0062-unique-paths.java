class Solution {
    int f(int m, int n,int[][] dp){
        if(m == 0 && n == 0){
            return 1;
        }

        if(m < 0 || n < 0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int up = f(m-1, n, dp);
        int left = f(m, n-1, dp);

        return dp[m][n] = up+left;
    }


    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // int result =  f(m-1, n-1, dp);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 && j == 0){
                    dp[0][0] = 1;
                    continue;
                }

                int left = 0;
                int up = 0;
                if(i > 0)   left = dp[i-1][j];
                if(j > 0)   up = dp[i][j-1];

                dp[i][j] = left + up;

            }
        }
        return dp[m-1][n-1];
    }
}