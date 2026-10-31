// class Solution {
//     public int uniquePaths(int m, int n) {
//        int[][] dp = new int[m][n];
//       for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             dp[i][j] = -1;      }
//       }
//        return paths(0,0,m,n,dp);
//     }

//     private int paths(int row,int col,Integer m,Integer n,int[][] dp){ 
//         // Integer = obj of int means it is pass by reference
//         if(row>=m  || col>=n) return 0;
//         if(row==m-1 && col==n-1) return 1;
//         if(dp[row][col] != -1) return dp[row][col];
//         int  rightWays = paths(row,col+1,m,n,dp);
//         int downWays = paths(row+1,col,m,n,dp);
//         return dp[row][col] = rightWays + downWays;
//     }
// }






// another space optimization solution

class Solution{
   public int uniquePaths(int m, int n) {
        int [][] dp = new int[2][n];

        for(int j=0;j<n;j++){
            dp[0][j] = 1;
            dp[1][j] = 1;;
        }
         for(int i=1;i<=m-1;i++){
            if(i%2==1){
                for(int j=1;j<n;j++){
                    dp[1][j]  = dp[1][j-1]+dp[0][j];
                }
            }

            else{
                for(int j=1;j<n;j++){

                    dp[0][j] = dp[0][j-1]+dp[1][j];
                }
            }
        }

        return Math.max(dp[1][n-1],dp[0][n-1]);
    }
}