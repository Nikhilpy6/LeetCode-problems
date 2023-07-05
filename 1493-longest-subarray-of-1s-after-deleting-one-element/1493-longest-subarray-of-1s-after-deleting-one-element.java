class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
      int max=0;
      int ar[]=new int[2];
        for(int r=0;r<nums.length;r++){
          ar[nums[r]]++;
          while(ar[0]>1 && l<nums.length && l<r){
            ar[nums[l]]--;
            l++;
            
          }
          int s=r-l+1;
          if(s==ar[1]){
          max=Math.max(ar[1],max)-1;
          }
          else{
           max=Math.max(ar[1],max); 
          }
          
        }
      return max;
      
    }
}