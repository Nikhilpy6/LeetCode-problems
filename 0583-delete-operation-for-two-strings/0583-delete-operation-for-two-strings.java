class Solution {
  //DP method
     /*public int steps(String s,String t,int n,int m,int [][]dp){
      if (m==0){
        dp[n][m]=n;
        return dp[n][m];
      }
        
      if (n==0){
        dp[n][m]=m;
        return dp[n][m];
      }
        
      if(dp[n][m]!=-1)return dp[n][m];
      if(s.charAt(n-1)==t.charAt(m-1))
        dp[n][m]= steps(s,t,n-1,m-1,dp);
      else{
        dp[n][m]= 1 + Math.min(steps(s,t,n-1,m,dp),steps(s,t,n,m-1,dp));
      }
      return dp[n][m];
    }
  
  
    public int minDistance(String s, String t) {
      int n=s.length();
      int m=t.length();
        int dp[][]=new int[n+1][m+1];
      for(int []a: dp){
        Arrays.fill(a,-1);
      }
      return steps(s,t,n,m,dp);
    }
    */
  
  //Tabular method
      public int minDistance(String s, String t) {
      int n=s.length();
      int m=t.length();
      int dp[][]=new int[n+1][m+1];
      for(int i=0;i<=n;i++){
        for(int j=0;j<=m;j++){
          if(i==0)
            dp[i][j]=j;
          else if(j==0)
            dp[i][j]=i;
          else if(s.charAt(i-1)==t.charAt(j-1))
            dp[i][j]=dp[i-1][j-1];
          else
            dp[i][j]=1+ Math.min(dp[i][j-1],dp[i-1][j]);
        }
      }
       return dp[n][m];
    }
}