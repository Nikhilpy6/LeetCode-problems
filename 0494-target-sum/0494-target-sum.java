class Solution {
  
    public int solve(int idx,int[] nums,int target,int sum){
      
      if(idx==nums.length){
        if(target==sum)return 1;
        else 
          return 0;
      }
      
      int ad=solve(idx+1,nums,target,sum+nums[idx]);
      int su=solve(idx+1,nums,target,sum-nums[idx]);
      
      return ad+su;
    }
    public int findTargetSumWays(int[] nums, int target) {
       return solve(0,nums,target,0);
             
    }
}