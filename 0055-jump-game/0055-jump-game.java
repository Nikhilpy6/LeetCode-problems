class Solution {
    public boolean canJump(int[] nums) {
        int as=0;
        for(int i=0;i<nums.length;i++){
            if(as<i)
                return false;
            as=Math.max(as,i+nums[i]);
        }
        return true;
        
    }
}