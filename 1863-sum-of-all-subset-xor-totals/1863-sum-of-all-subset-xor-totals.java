class Solution {
    private int backtrack(int nums[],int index, int xor){
      if(index==nums.length)return xor;
      int take=backtrack(nums,index+1,xor^nums[index]);
      int notake=backtrack(nums,index+1,xor);
      return take+notake;
    }
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
}