
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
    
    int[][] dp = new int[satisfaction.length+1][satisfaction.length+3];
    for(int[] a : dp) {
        Arrays.fill(a,-1);
    }


     int[] s = new int[satisfaction.length];
     Arrays.sort(satisfaction);
     for(int i = satisfaction.length-1;i>=0;i--) {
         s[satisfaction.length-1-i] = satisfaction[i];
     }

    for(int i = 0;i<=satisfaction.length;i++) {
        for(int j = 0;j<=satisfaction.length+1;j++) {
            if(i == 0) {
                dp[i][j] = 0;
                }
            else{
            int left = dp[i-1][j];
            int right = j*s[i-1] + dp[i-1][j+1];
            dp[i][j] = Math.max(left, right);
            }
            
        }
    }
     return dp[satisfaction.length][1];
    }
}