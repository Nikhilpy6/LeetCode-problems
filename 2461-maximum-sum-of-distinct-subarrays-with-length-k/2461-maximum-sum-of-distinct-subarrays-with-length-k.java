class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
      long sum=0;
      int i=0;
      long ans = 0;
      for(int j=0;j<nums.length;j++){
        sum+=nums[j];
        set.put(nums[j],set.getOrDefault(nums[j],0)+1);
      
        while(j-i+1>k){
          sum-=nums[i];
          
          if(set.get(nums[i])>1)
            set.put(nums[i],set.get(nums[i])-1);
          else
            set.remove(nums[i]);
          i++;
        }
        
        
        if(j-i+1 ==k && set.size()==k){
          ans = Math.max(ans,sum);
          
        }
        
        
      }
      return ans;
    }
}