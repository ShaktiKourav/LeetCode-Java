class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        // start 
        if(obstacleGrid[0][0] == 1){
            return 0;
        }

        dp[0][0] = 1; /// one way
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                //obstacle
                if(obstacleGrid[i][j] == 1){
                    dp[i][j]=0;
                }else
                if(i==0 && j==0){
                    continue;
                }else{
                    int up = 0;
                    int left = 0;
                    
                    if(i>0){
                        up = dp[i-1][j];
                    }
                    if(j>0){
                        left =  dp[i][j-1];
                    }

                    dp[i][j] = up+left;
                }
            }
        }

        return dp[m-1][n-1];
    }
}