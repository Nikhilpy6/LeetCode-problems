/*class Solution {
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
}*/




class Solution {
   
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[coins.length][amount+1];
       for(int T=0;T<=amount;T++){
         if(T%coins[0]==0)dp[0][T]=T/coins[0];
         else dp[0][T]=(int)1e9;
       }
      
      for(int ind=1;ind<n;ind++){
        for(int T =0;T<=amount;T++){
          int nottake= dp[ind-1][T];
        int take=Integer.MAX_VALUE;
        if(coins[ind]<=T){
          take =1 + dp[ind][T-coins[ind]];
        }
          dp[ind][T]=Math.min(take,nottake);
        }
      }
     int ans=dp[n-1][amount];
     if(ans >= (int)1e9)return -1;
      return ans;
    }
}

