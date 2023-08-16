class Solution {
  int dp[];
    int solve(int n){
      if(n<4)return n;
      if(dp[n]!=-1)return dp[n];
      int ans=n;
      for(int i=1;i*i<=n;i++){
        int sq=i*i;
        ans=Math.min(ans,1+solve(n-sq));
      }
      return dp[n]=ans;
    }
    
  
    public int numSquares(int n) {
      dp=new int[n+1];
      Arrays.fill(dp,-1);
      return solve(n);
    }
}