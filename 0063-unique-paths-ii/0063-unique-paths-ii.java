class Solution {
    int mod=(int)(1e9 + 7);
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid[0].length;
        int n=obstacleGrid.length;
        if(obstacleGrid[0][0]==1 || obstacleGrid[n-1][m-1]==1)return 0;
        int dp[][]=new int[n][m];
        for(int i=0;i<m;i++){
            if(obstacleGrid[0][i]==0){
                dp[0][i]=1;
            }
            else
                break;
        }
         for(int j=0;j<n;j++){
            if(obstacleGrid[j][0]==0){
                dp[j][0]=1;
            }
            else
                break;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
               if(obstacleGrid[i][j]==1)
                    dp[i][j]=0;
               
                else {
                   dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
           
        }
         return dp[n-1][m-1];
    }
}