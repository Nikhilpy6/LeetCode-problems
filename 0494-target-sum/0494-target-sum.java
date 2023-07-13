class Solution {
   int dp[][];
  int total;
    public int solve(int idx,int[] nums,int target,int sum){
      
      if(idx==nums.length){
        if(target==sum)return 1;
        else 
          return 0;
      }
      if(dp[idx][sum+total]!=Integer.MIN_VALUE)return dp[idx][sum+total];
      int ad=solve(idx+1,nums,target,sum+nums[idx]);
      int su=solve(idx+1,nums,target,sum-nums[idx]);
      
      return dp[idx][sum+total]=ad+su;
    }
    public int findTargetSumWays(int[] nums, int target) {
     total=Arrays.stream(nums).sum();
      
      dp=new int[nums.length][2*total+1];
      for(int i=0;i<nums.length;i++){
        Arrays.fill(dp[i],Integer.MIN_VALUE);
      }
       return solve(0,nums,target,0);
             
    }
}