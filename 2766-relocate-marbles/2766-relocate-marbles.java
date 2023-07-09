class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        HashMap<Integer,Integer> hm =new HashMap<>();
      for(int n:nums){
        hm.put(n,hm.getOrDefault(n,0)+1);
      }
       List<Integer> ans=new ArrayList<>();
      for(int i=0;i<moveFrom.length;i++){
        
        int frm=moveFrom[i];
        int to=moveTo[i];
        
        int a=hm.get(frm);
        hm.remove(frm);
        hm.put(to,hm.getOrDefault(to,0)+1);
        
      }
      
      for(int k:hm.keySet()){
        ans.add(k);
      }
      Collections.sort(ans);
      return ans;
    }
}