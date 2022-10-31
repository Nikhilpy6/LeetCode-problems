class Solution {
  // dp array-2
    /*public int lcs(String s1,String s2,int n,int m,int[][] dp){
      if(m==0 || n==0){
        dp[n][m]=0;
      return dp[n][m];
      }
      if(dp[n][m]!=-1)
        return dp[n][m];
      if(s1.charAt(n-1)==s2.charAt(m-1))
      {
        dp[n][m]=1+ lcs(s1,s2,n-1,m-1,dp);
        //return dp[n][m];
      }
      else{
        dp[n][m]=Math.max(lcs(s1,s2,n-1,m,dp),lcs(s1,s2,n,m-1,dp));
        //return dp[n][m];
      }
      return dp[n][m];
    }
  
    public int longestCommonSubsequence(String text1, String text2) {
      int n=text1.length();
      int m=text2.length();
      int dp[][]=new int[n+1][m+1];
      for(int []a:dp){
        Arrays.fill(a,0);
      }
        return lcs(text1,text2,n,m,dp);
    }*/
  
  
  // Tabiulation method-3
  
   public int lcs(String s1,String s2,int n ,int m,int dp[][]){
     for(int i=0;i<=n;i++){
       for(int j=0;j<=m;j++){
         if(i==0 || j==0){
           dp[i][j]=0;
         }
         else if(s1.charAt(i-1)==s2.charAt(j-1)){
           dp[i][j]=1+dp[i-1][j-1];
         }
         else{
           dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
         }
       }
     }
     return dp[n][m];
   }
   public int longestCommonSubsequence(String text1, String text2) {
      int n=text1.length();
      int m=text2.length();
      int dp[][]=new int[n+1][m+1];
     
        return lcs(text1,text2,n,m,dp);
    }
  
  
  /*Recursion -1
  public int  lcs(String s1,String s2,int n,int m){
    if(m==0 || n==0)return 0;
    if(s1.charAt(n-1)==s2.charAt(m-1))
      return 1+lcs(s1,s2,n-1,m-1);
    else
      return Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
  }
  public int longestCommonSubsequence(String text1, String text2) {
      int n=text1.length();
      int m=text2.length();
      //int dp[][]=new int[n+1][m+1];
     
        return lcs(text1,text2,n,m);
    }*/
  
}