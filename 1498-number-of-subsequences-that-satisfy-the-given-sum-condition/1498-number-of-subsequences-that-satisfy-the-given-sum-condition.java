class Solution {
    public int numSubseq(int[] nums, int target) {
      Arrays.sort(nums);
      int mod=(int)1e9+7;
      int exp[]=new int[nums.length];
      exp[0]=1;
      for(int i=1;i<nums.length;i++){
        exp[i]=(exp[i-1]*2)%mod;
        // System.out.println(exp[i]);
      }
      int ans=0;
      int i=0,j=nums.length-1;
      while(i<=j){
        if(nums[i]+nums[j]>target)
          j--;
        else{
          ans=(ans+exp[j-i])%mod;
          i++;
        }
      }
      return ans;
    }
}
