class Solution {
    long rec(int ind,int[][] questions,long dp[]){
     if(ind>=questions.length)return 0;
     if (dp[ind]!=-1)return dp[ind];
     long take=questions[ind][0] + rec(ind+questions[ind][1]+1,questions,dp);
     long  ntake= rec(ind+1,questions,dp);
     
     return dp[ind]= Math.max(take,ntake);
   }
    public long mostPoints(int[][] questions) {
      long dp[]=new long[questions.length];
      Arrays.fill(dp,-1);
      return rec(0,questions,dp);
    }
}