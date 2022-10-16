class Solution {
    public void moveZeroes(int[] nums) {
      int sb=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0)
            sb++;
          else if(sb>0){
            nums[i-sb]=nums[i];
            nums[i]=0;
          }
        }
      
    }
}