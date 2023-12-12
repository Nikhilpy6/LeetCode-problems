class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
      
      for(int val :nums){
        if(val>=max1){
          max2 = max1;
          max1=val;
          
        }
        else{
          max2 = Math.max(max2,val);
        }
        
        
      }
      return (max1-1)*(max2-1);
    }
}