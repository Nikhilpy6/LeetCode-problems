class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer,ArrayList<Integer>> hm =new HashMap<>();
      for(int i=0;i<routes.length;i++){
        for(int j=0;j<routes[i].length;j++){
          int v=routes[i][j];
          ArrayList<Integer> list =hm.getOrDefault(v,new ArrayList<Integer>());
          list.add(i);
          hm.put(v,list);
        }
      }
      int ans=0;
      HashSet<Integer>nodevis=new HashSet<>();
      HashSet<Integer>busstopvis=new HashSet<>();
      
      Queue<Integer> q =new LinkedList<>();
      q.offer(source);
      while(!q.isEmpty()){
        int s=q.size();
        while(s-->0){
          int cur=q.poll();
          if(cur==target)return ans;
          ArrayList<Integer> li=hm.get(cur);
          for(int bus:li){
            if(!nodevis.contains(bus)){
              nodevis.add(bus);
              int ar[]=routes[bus];
              for(int i:ar){
                q.add(i);
                busstopvis.add(i);
                
              }
            }
          }
        }
        ans+=1;
      }
      return -1;
    }
}