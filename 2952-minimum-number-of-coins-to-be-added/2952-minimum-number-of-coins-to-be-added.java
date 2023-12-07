class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        int ans=0;
        int sum=0;
        int i=0;
        Arrays.sort(coins);
        while(sum<target){
          if(i<coins.length && coins[i]<=sum+1)
          {
            sum +=coins[i];
              i++;
          }
          else{
            sum +=sum+1;
            ans++;
          }
        }
      return ans;
    }
}