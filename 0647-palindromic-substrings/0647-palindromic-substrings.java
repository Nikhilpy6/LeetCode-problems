class Solution {
    public int countSubstrings(String s) {
      
      int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;

        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) dp[i][j] = true;
                else if (g == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }
                else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
                
                if (dp[i][j]) count++;
            }
        }

        return count;
      
      
      
      
      
      
      
      
      
      
      
      
      
//         boolean dp[][]=new boolean[s.length()][s.length()];
        
//       for(int i=0;i<s.length();i++)
//         dp[i][i]=true;
      
      
//       int cnt=s.length();
//       for(int i=0;i+1<s.length();i++){
//         if(s.charAt(i)==s.charAt(i+1))
//           dp[i][i+1]=true;
//           cnt++;
//       }
      
//       for(int len=2;len<s.length();len++)
//         for(int i=0;i+len<s.length();i++){
//           int j=len+i;
//           if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
//              dp[i][j]=true;
//               cnt++;
//           }
//         }
        
      
//       return cnt;
      }
}
