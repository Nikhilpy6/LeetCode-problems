class Solution {
    public int[] findErrorNums(int[] nums) {
      int ans[]=new int[2];
		for (int i = 0; i < nums.length; i++) {
			int abs_val = Math.abs(nums[i]);
			if (nums[abs_val - 1] > 0)
				nums[abs_val - 1] = -nums[abs_val - 1];
			else
				ans[0]=abs_val;
		}

		//System.out.print("And the missing element is ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				 ans[1]=i + 1;
		}
      return ans;
    }
}