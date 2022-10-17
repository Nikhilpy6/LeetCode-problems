class Solution {
    public int[] runningSum(int[] nums) {
        int csum=nums[0];
        int[]ans=new int[nums.length];
        ans[0]=csum;
        for(int i=1;i<nums.length;i++){
            csum+=nums[i];
            ans[i]=csum;
        }
        return ans;
    }
}