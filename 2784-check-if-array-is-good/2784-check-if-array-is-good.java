class Solution {
    public boolean isGood(int[] nums) {
       Arrays.sort(nums);
      int n=nums.length;
      
      if(n==1 || nums[n-1]!=nums[n-2])return false;
      
      for(int i=0;i<n-1;i++){
        if(nums[i]!=i+1)return false;
      }
      return true;
    }
}
//n=3
//[1,2,3,3]
//n=4
//[1,2,3,4,4]