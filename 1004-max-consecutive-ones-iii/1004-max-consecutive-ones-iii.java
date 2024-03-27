class Solution {
    public int longestOnes(int[] nums, int k) {
        int st =0,end=0;
      int ans=0,win=0;
      while(end<nums.length){
        win +=nums[end];
        
        while(win+k < end-st+1){
          win-=nums[st];
          st++;
          
        }
        ans = Math.max(ans,end-st+1);
        end++;
        
      }
      return ans;
    }
}