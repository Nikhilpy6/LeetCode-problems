class Solution {
    public int minOperations(int[] nums, int x) {
        int j=0,sum=0;
      int n=nums.length;
      for(int v:nums)sum+=v;
      int target=sum-x;
      if(target<0)return -1;
      if(target==0)return n;
      int cursum=0;
      int min=Integer.MAX_VALUE;
      
      for(int i=0;i<n;i++){
        cursum+=nums[i];
        while(cursum>target && j<n){
          cursum-=nums[j];
          j++;
        }
        if(cursum==target){
          min=Math.min(min,n-(i-j+1));
        }
      }
      return min==Integer.MAX_VALUE ? -1 : min;
    }
}