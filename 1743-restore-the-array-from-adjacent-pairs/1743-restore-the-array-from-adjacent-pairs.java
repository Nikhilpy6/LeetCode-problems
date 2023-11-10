class Solution {
    void dfs(int i,int first,HashMap<Integer,List<Integer>> graph,int prev,int []ans){
      ans[i]=first;
      
      for(int ngh:graph.get(first)){
        if(ngh!=prev){
          dfs(i+1,ngh,graph,first,ans);
        }
        
      }
      
    }
  
    public int[] restoreArray(int[][] adjacentPairs) {
        
      
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int i=0;i<adjacentPairs.length;i++){
          int u=adjacentPairs[i][0];
          int v=adjacentPairs[i][1];
          
          if (!graph.containsKey(u)) {
                graph.put(u, new ArrayList());
            }
            
            if (!graph.containsKey(v)) {
                graph.put(v, new ArrayList());
            }
            
            graph.get(u).add(v);
            graph.get(v).add(u);
          
        }
      int first = 0;
        for (int num : graph.keySet()) {
            if (graph.get(num).size() == 1) {
                first = num;
                break;
            }
        }
      int ans[]=new int[graph.size()];
      dfs(0,first,graph,Integer.MAX_VALUE,ans);
      return ans;
    }
}