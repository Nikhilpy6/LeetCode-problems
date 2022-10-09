class Solution {
    public static int solution(int grid[][],int [][]dp){
      int m=grid.length;
      int n=grid[0].length;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
         if(i==0 && j==0)
             dp[i][j]=grid[i][j];
         else{
          int up=grid[i][j];
          if(i>0)up+=dp[i-1][j]; 
          else up+=1e9;
          int left=grid[i][j];
          if(j>0) left+=dp[i][j-1];
          else left+=1e9;
          dp[i][j]=Math.min(left,up);

           }
        
          }
      }
      return dp[m-1][n-1];
       
    }
  
  
    public int minPathSum(int[][] grid) {
       int dp[][]=new int[grid.length][grid[0].length];
        int ans=solution(grid,dp);
        return ans;
    }
}