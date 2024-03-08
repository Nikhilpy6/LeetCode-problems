class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max=0,ans=0;
        for(int i:nums){
          hm.put(i,hm.getOrDefault(i,0)+1);
          max = Math.max(hm.get(i),max);
        }
        
        for(int c:hm.keySet()){
          if(hm.get(c)==max){
            ans+=hm.get(c);
          }
        }
      
      return ans;
    }
}