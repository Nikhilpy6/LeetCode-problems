class Solution {
 
  
  public boolean solve(int nums[],int i,Boolean t[]){
      if(i==nums.length)return true;
      
      if(t[i] != null)return t[i];
      
      //rule 1
      boolean result=false;
      if((i+1)< nums.length && (nums[i] == nums[i+1])){
        result|=solve(nums,i+2,t);
        
      }
      //rule 2
      if((i+2) < nums.length && (nums[i]==nums[i+1] && nums[i+1]==nums[i+2])){
        result|=solve(nums,i+3,t);
      }
      //rule 3
      if((i+2) < nums.length &&( nums[i]+1==nums[i+1]) && (nums[i]+2==nums[i+2])){
        result|=solve(nums,i+3,t);
      }
      
      return t[i]=result;
    }
  
    public boolean validPartition(int[] nums) {
        // this.nums=nums;
      int n=nums.length;
      return solve(nums,0,new Boolean[n]);
    }
}