class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap<>();
      for(int a:nums){
        hm.put(a,hm.getOrDefault(a,0)+1);
      }
      for(Integer k:hm.keySet()){
        if(hm.get(k)==1)return k;
      }
      return -1;
    }
}