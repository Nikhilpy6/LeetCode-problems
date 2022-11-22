class Solution {
   public static int recursion(int []dp,int n){
     if(n<4)return n;
     if(dp[n]!=0)return dp[n];
     int ans=n;
     for(int j=1;j*j<=n;j++){
       int sq=j*j;
       ans=Math.min(ans,1+recursion(dp,n-sq));
     }
     return dp[n]=ans;
   }
    public int numSquares(int n) {
        int dp[]=new int[n+1];
       // Arrays.fill(dp,0);
       int a=recursion(dp,n);
      return a;
    }
}