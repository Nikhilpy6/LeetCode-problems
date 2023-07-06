class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal==0)return true;
        int s=maxChoosableInteger*(maxChoosableInteger+1)/2;
        if(s< desiredTotal)return false;
         int[] dp = new int[1 << maxChoosableInteger];
        return dfs(dp, 0, maxChoosableInteger, desiredTotal);
    }
    
    public boolean dfs(int[] dp, int chs, int max, int target) {
        // targer <= 0 means the prior one wins
        if (target <= 0) return false;
        if (dp[chs] != 0) return dp[chs] == 1;
        boolean win = false;
        for (int i = 0; i < max; i++) {
            // i + 1 not use
            if ((chs & (1 << i)) == 0) {
                // thers is a trick: short circuit, when win is true, the next dfs won't be invoke
                win = win || !dfs(dp, chs ^ (1 << i), max, target - i - 1);
            }
        }
        dp[chs] = win ? 1 : -1;
        return win;
    }
}