class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
      while(i<j){
        int mid = i +(j-i)/2;
        if(nums[mid]>nums[j])
          i=mid+1;
        if(nums[mid]<nums[j])
          j=mid;
      }
      return nums[i];
      
      
// for max element in sorted array      
    // while(i<j){
    //     int mid = i +(j-i)/2;
    //     if(nums[mid]>nums[j])
    //       j=mid;
    //     if(nums[mid]<nums[j])
    //       i=mid+1;
    //   }
    //   return nums[j];
    }
}

