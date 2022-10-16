class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
          nums[i]=nums[i]*nums[i];
        }
      int s=0;
      int e=nums.length-1;
      int ans[]=new int[nums.length];
      for(int i=nums.length-1;i>=0;i--){
        if(nums[s]>nums[e]){
          ans[i]=nums[s];
          s++;
        }
        else{
          ans[i]=nums[e];
          e--;
        }
      }
      return ans;
       
          
    }
}