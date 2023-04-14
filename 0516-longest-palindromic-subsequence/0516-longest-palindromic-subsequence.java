class Solution {
    public int longestPalindromeSubseq(String s) {
        int [][]dp=new int[s.length()+1][s.length()+1];
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        String s2=sb.toString();
      
        for(int i=0;i<=s.length();i++){
          for(int j=0;j<=s.length();j++){
            if(i==0 || j==0)
              dp[i][j]=0;
            else if(s.charAt(i-1)==s2.charAt(j-1)){
              dp[i][j]=1+dp[i-1][j-1];
             // System.out.println(dp[i][j]+"!!");
            }
            else{
              dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
             // System.out.println(dp[i][j]+"%%");
            }
          }
        }
      return dp[s.length()][s.length()];
    }
}