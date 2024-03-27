class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int end=0,cnt=0;
        int max = 0;
      while(end<nums.length){
        int cur = nums[end];
        
        if(cur==1){
          
         cnt++;
        }
        else{
          cnt=0;
        }
        
        max =Math.max(max,cnt);
        end++;
      }
      return max;
    }
}