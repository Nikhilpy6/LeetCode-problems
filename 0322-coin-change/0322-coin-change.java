class Solution {
    public int func(int[] coins,int amount,int ind,int [][]dp){
      if(ind==0){
        if(amount%coins[0]==0)
          return amount/coins[0];
        return (int)1e9;
      }
      if(dp[ind][amount]!=-1)return dp[ind][amount];
      int nottake= func(coins,amount,ind-1,dp);
      int take=Integer.MAX_VALUE;
      if(coins[ind]<=amount)
        take = 1+ func(coins,amount-coins[ind],ind,dp);
      return dp[ind][amount]= Math.min(nottake,take);
    }
  
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[coins.length][amount+1];
        for(int []a:dp){
         Arrays.fill(a,-1);
        }
     int ans= func(coins,amount,n-1,dp);
     if(ans >= (int)1e9)return -1;
      return ans;
    }
}