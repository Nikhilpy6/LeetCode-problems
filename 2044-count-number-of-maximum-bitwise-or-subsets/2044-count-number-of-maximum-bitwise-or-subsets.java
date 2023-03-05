class Solution {
    private void backtrack(int nums[],int start,int maxor,int curror){
      if(curror==maxor){
        ans++;
        
      }
      for(int i=start;i<nums.length;i++){
        backtrack(nums,i+1,maxor,curror | nums[i]);
      }
      
    }
  private int ans=0;
    public int countMaxOrSubsets(int[] nums) {
        int max=0;
      
      for(int a:nums)max|=a;
      backtrack(nums,0,max,0);
      return ans;
    }
}