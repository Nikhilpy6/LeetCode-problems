class Solution {
    public int minMoves2(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      int sum=0;
        for(int i=0;i<nums.length/2;i++){
          int diff = (nums[n-i-1]-nums[i]);
          sum+=diff;
        }
      
      return sum;
    }
}