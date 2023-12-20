class Solution {
    public int buyChoco(int[] nums, int money) {
        Arrays.sort(nums);
      if(nums[0]+nums[1]>money)return money;
      
      return money - nums[0]-nums[1];
    }
}