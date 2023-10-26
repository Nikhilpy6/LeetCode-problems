class Solution {
  int t[];
    int rec(int []nums,int idx){
      if(idx>=nums.length)return 0;
      if(t[idx]!=-1)return t[idx];
      int take = nums[idx] + rec(nums,idx+2);
      // System.out.println("take"+take);
      int notake = rec(nums,idx+1);
      // System.out.println("ntake"+notake);
      
      return t[idx] = Math.max(take , notake) ;
    }
  
    public int rob(int[] nums) {
      t = new int[nums.length+1];
      Arrays.fill(t,-1);
        return rec(nums,0);
        
    }
}