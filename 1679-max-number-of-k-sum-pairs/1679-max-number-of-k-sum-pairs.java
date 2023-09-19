class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        //for(int i:nums)hm.put(i,hm.getOrDefault(i,0)+1);
      int op=0;
      for(int i:nums){
        int rem=k-i;
        if(hm.containsKey(rem)){
          if(hm.get(rem)>1)hm.put(rem,hm.get(rem)-1);
          else{
            hm.remove(rem);
          }
          op+=1;
        }
        else{
          hm.put(i,hm.getOrDefault(i,0)+1);
        }
      }
      return op;
    }
}