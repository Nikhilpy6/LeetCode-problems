class Solution {
    int dp[][];
    
    public int solve(int idx,int coins[],int amnt){
      if(amnt==0){
        return 1;
      }
      
      if(idx==coins.length)return 0;
      
      if(dp[idx][amnt]!=-1)return dp[idx][amnt];
      
      if(coins[idx]>amnt)
        return dp[idx][amnt]=solve(idx+1,coins,amnt);
      
      dp[idx][amnt]=solve(idx,coins,amnt-coins[idx]) + solve(idx+1,coins,amnt);
      return dp[idx][amnt];
    }
  
  
  
    public int change(int amount, int[] coins) {
       dp=new int[coins.length][amount+1];
      for(int []i:dp){
        Arrays.fill(i,-1);
      }
      // List<Integer> res=new ArrayList<>();
       return solve(0,coins,amount);
        
    }
}