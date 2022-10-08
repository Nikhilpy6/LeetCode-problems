class Solution {
    public static int totalcost(int []dp,int cost[],int n){
      if(n==0)return cost[0];
      if(n==1)return cost[1];
      
      
      if(dp[n]!=-1)return dp[n];
      dp[n]=cost[n]+ Math.min(totalcost(dp,cost,n-1),totalcost(dp,cost,n-2));
      return dp[n];
      }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
      int n=cost.length;
      int ans=Math.min(totalcost(dp,cost,n-1),totalcost(dp,cost,n-2));
      return ans;
      
    }
}