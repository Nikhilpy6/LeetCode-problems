class Solution {
    public int lcs(String s1,String s2,int n,int m,int[][] dp){
      if(m==0 || n==0){
        dp[n][m]=0;
      return dp[n][m];
      }
      if(dp[n][m]!=-1)
        return dp[n][m];
      if(s1.charAt(n-1)==s2.charAt(m-1))
      {
        dp[n][m]=1+ lcs(s1,s2,n-1,m-1,dp);
        return dp[n][m];
      }
      else{
        dp[n][m]=Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));
        return dp[n][m];
      }
      
    }
  
    public int longestCommonSubsequence(String text1, String text2) {
      int n=text1.length();
      int m=text2.length();
      int dp[][]=new int[n+1][m+1];
      for(int []a:dp){
        Arrays.fill(a,-1);
      }
        return lcs(text1,text2,n,m,dp);
    }
}