class Solution {
    public String longestPalindrome(String s) {
         int [][]dp=new int[s.length()][s.length()];
       String ans="";
      int max=0;
      for(int dif=0;dif<s.length();dif++){
        for(int i=0, j=i+dif;j<s.length();i++,j++){
          if(i==j)
            dp[i][j]=1;
          else if(dif==1){
           if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=2;
           }
          }
          else{
            if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0)
              dp[i][j]=2+dp[i+1][j-1];
          }
          
          if(dp[i][j]>0){
            if(j-i+1>max){
              max=j-i+1;
              ans=s.substring(i,j+1);
            }
          }
        }
      }
      return ans;
      
      
         }
}