class Solution {
    public int solve(int nums[] ,int k){
      HashMap<Integer , Integer> hm =new HashMap<>();
      int diff=0;
      int j=0,total=0;
      for(int i=0;i<nums.length;i++){
        if(!hm.containsKey(nums[i])){
          hm.put(nums[i],1);
          diff+=1;
        }
        else{
          hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        if(diff<=k){
          total+=(i-j+1);
        }
        else{
          while(j<=i && diff>k){
            hm.put(nums[j],hm.get(nums[j])-1);
            if(hm.get(nums[j])==0){
              hm.remove(nums[j]);
              diff--;
            }
            j++;
            
          }       
           total+=(i-j+1);
          
        }
        
      }
      return total;
      
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
      return solve(nums,k)-solve(nums,k-1);
      
    }
}