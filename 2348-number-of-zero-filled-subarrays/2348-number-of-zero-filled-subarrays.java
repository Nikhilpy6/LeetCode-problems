class Solution {
    public long zeroFilledSubarray(int[] nums) {
        Long ans=0l;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
            cnt++;
            
          }
          else{
            cnt=0;
          }
          ans+=cnt;
        }
     return ans;
    }
}