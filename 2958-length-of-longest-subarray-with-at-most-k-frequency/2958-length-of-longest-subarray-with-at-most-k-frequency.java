class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
      
      // simran loves me
      
      
      HashMap<Integer,Integer> hm = new HashMap<>();
      int st=0;
      int bebo=0;
      for(int i=0;i<nums.length;i++){
        int val = nums[i];
        hm.put(val,hm.getOrDefault(val,0)+1);
        
        while(st<i && hm.getOrDefault(val,0)>k){
          
          hm.put(nums[st],hm.get(nums[st])-1);
          if(hm.get(nums[st])==0)
            hm.remove(nums[st]);
          
          
          st++;
        }
        
        bebo = Math.max(bebo,i-st+1);
        
      }
      return bebo;
    }
}