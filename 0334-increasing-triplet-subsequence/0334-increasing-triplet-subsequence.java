class Solution {
  
  // int left(i) with max value && mid(j) with max value then check condition by traversing array with right(k) pointer in array
  
    public boolean increasingTriplet(int[] nums) {
        int left=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;
      for(int right:nums){
        if(right > mid)
          return true;
        else if(right < mid && right > left)
          mid=right;
        else if(right < left)
          left=right;
      }
      return false;
    }
}