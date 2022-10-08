class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int st=i+1;
            int end=nums.length-1;
            while(st<end){
                if(first+nums[st]+nums[end]==target)
                    return target;
                else if(Math.abs(first+nums[st]+nums[end]-target)<diff){
                    diff=Math.abs(first+nums[st]+nums[end]-target);
                    ans=first+nums[st]+nums[end];
                }
                if(first+nums[st]+nums[end]>target)end--;
                else st++;
            }
        }
        return ans;
    }
}