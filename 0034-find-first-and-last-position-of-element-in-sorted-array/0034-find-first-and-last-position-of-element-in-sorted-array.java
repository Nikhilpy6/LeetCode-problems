class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=binarySearch(nums,target,true);
        int right=binarySearch(nums,target,false);
        return new int[]{left,right};
    }
    public int binarySearch(int []nums,int target,boolean leftbias){
        int i=0;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(target<nums[mid])
                j=mid-1;
            else if(target>nums[mid])
                i=mid+1;
            else{
                res=mid;
                if(leftbias)
                    j=mid-1;
                else
                    i=mid+1;
            }
        }
        return res;
            
    }
}