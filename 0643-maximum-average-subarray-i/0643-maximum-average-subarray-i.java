class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double ans=Integer.MIN_VALUE;
      int st=0,end=0;
      int sum=0;
      while(end<nums.length){
        sum +=nums[end];
        
        while(end-st+1>k){
          sum-=nums[st];
          st++;
        }
        if(end-st+1==k){
        ans= Math.max(ans,sum/(k*1.0));
          //System.out.println(ans+"&&");
        }
        end++;
      }
    return ans;
    }
}