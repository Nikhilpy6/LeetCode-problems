class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc =false;
        boolean dec =false;
      
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
          if(dec==true)
            return false;
          else
            inc = true;
          }
        else if(nums[i-1]>nums[i]){
          if(inc==true)
            return false;
          else
            dec = true;
            
        }
        else{
          continue;
        }
        
      }
      return true;
    }
}