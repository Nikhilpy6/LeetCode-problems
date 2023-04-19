class Solution {
    public int arrayPairSum(int[] nums) {
      Arrays.sort(nums);
      //System.out.print(nums[0]+" "+ nums[1]);
      int ans=0;
      for(int i=1;i<nums.length;i+=2){
        ans+=nums[i-1];
      }
      return ans;
    }
}