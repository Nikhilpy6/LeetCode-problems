class Solution {
    public int minSizeSubarray(int[] nums, int target) {
      long s=0;
        for(int i:nums){
          s+=i;
        }
      int n = nums.length;
      int count = 0;
      int mini=Integer.MAX_VALUE;
       if(target > s){
            count = (int)(target / s)*n;
            target = target % (int)s;
        }
      int i=0;
      long cs=0;
      boolean possible = false;
      for(int j=0;j<2*n;j++){
        cs +=nums[j%n];;
        
        while(cs>target && i<=j){
          cs -=nums[i%n];
          i++;
          
        }
        
        if(cs==target){
          possible = true;
          mini = Math.min(j-i+1,mini);
        }
        
      }
      return possible == true ? mini+count : -1;
    }
}