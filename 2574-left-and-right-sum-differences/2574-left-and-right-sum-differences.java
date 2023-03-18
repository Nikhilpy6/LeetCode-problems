class Solution {
    public int[] leftRigthDifference(int[] nums) {
     
        int ans[]=new int[nums.length];
       if(nums.length==1)return ans;
      int left[]=new int[nums.length];
      left[1]=nums[0];
      int right[]=new int[nums.length];
      int n=nums.length;
      right[nums.length-2]=nums[nums.length-1];
        for(int i=2;i<nums.length;i++){
          left[i]=left[i-1]+nums[i-1];
          right[n-1-i]=right[n-i]+nums[n-i];
        }
      for(int i=0;i<n;i++){
         ans[i]=Math.abs(left[i]-right[i]);
        // System.out.println(left[i]+ " ** "+right[i]);
      }
      return ans;
    }
}