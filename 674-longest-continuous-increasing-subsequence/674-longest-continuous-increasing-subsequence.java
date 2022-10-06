class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
      int s=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
          max=Math.max(max,i-s+1);
        }
       
        else{
          s=i;
        }
      }
    if(max==0)
      return 1;
    else 
      return max;
    }
}