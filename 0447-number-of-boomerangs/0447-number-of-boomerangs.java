class Solution {
    public int numberOfBoomerangs(int[][] points) {
       HashMap<Integer,Integer> hm =new HashMap<>();
       int ans=0;
      for(int p1[]:points){
        for(int p2[]:points){
      
          int dis = (p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
          
          hm.put(dis,hm.getOrDefault(dis,0)+1);
          }
         
          for(int k:hm.values())
            ans+=(k*(k-1));        
          hm.clear();
      }
      return ans;
    }
}


