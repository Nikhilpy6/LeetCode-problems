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
    }
}
/*
int mid = start + (end -start) / 2;
          if(nums[mid] > nums[end])
          start = mid + 1 ;
          
          if(nums[mid] < nums[end])
          end = mid ;
        }
        return nums[start];
*/