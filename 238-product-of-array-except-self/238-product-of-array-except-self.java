class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
      res[0]=nums[0];
       for(int i=1;i<res.length;i++){
         res[i]=nums[i]*res[i-1];
       }
      int product=1;
      for(int i=res.length-1;i>=0;i--){
       
        if(i==0){
          res[i]=product;
        }
        else{
          res[i]=res[i-1]*product;
        }
        product*=nums[i];
      }
      return res;
    }
}