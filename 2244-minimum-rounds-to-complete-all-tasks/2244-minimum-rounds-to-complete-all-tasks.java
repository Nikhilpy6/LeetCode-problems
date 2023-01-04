class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm =new HashMap<>();
      for(int i=0;i<tasks.length;i++){
        hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
      }
      int ans=0;
      
        for(int k:hm.keySet()){
          int v=hm.get(k);
         if(v==1)
           return -1;
        
         ans+=v/3;
          
         if(v%3!=0)
           ans++;
          }
      
      return ans;
      
    }
}