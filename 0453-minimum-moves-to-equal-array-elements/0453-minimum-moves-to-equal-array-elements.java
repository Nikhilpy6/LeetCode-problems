class Solution {
    public int minMoves(int[] nums) {
        int s=0;
      int min=Arrays.stream(nums).min().getAsInt();
      for(int i=0;i<nums.length;i++){
        s+=(nums[i]!=min ? nums[i]-min :0);
        
      }
      return s;
    }
}