class Solution {
    public int maxFrequency(int[] nums, int k) {
      Arrays.sort(nums);
      int j=0;
      long total=0,ans=0;
        for(int i=0;i<nums.length;i++){
         total+=nums[i];
          
          while((total+k)<(nums[i]*(i-j+1))){
            total -=nums[j];
            j++;
            
          }
          ans =Math.max(ans,i-j+1);
        }
      return (int)ans;
      
    }
}

