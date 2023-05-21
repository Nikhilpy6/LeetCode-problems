class Solution { 
    //cycle detect
    boolean dfs(int node,int[] vis,int[] pathvis,int[][] graph){
      vis[node]=1;
      pathvis[node]=1;
      // check[node]=0;
        
        for(int ngh:graph[node]){
          if(vis[ngh]==0){
            if(dfs(ngh,vis,pathvis,graph)==true){
              // check[ngh]=0;
              return true;
            }
          }
          else if(pathvis[ngh]==1)
            return true;
        }
      
      // check[node]=1;
      pathvis[node]=0;
      return false;
    }
  
  
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans =new ArrayList<>();
       int vis[]=new int[graph.length];
      // int check[]=new int [graph.length];
       int pathvis[]=new int[graph.length];  //for detecting cycle
      for(int i=0;i<graph.length;i++){
        if(vis[i]==0){
          dfs(i,vis,pathvis,graph);
        }
      }
      for(int i=0;i<graph.length;i++){
        if(pathvis[i]==0)ans.add(i);
      }
      return ans;
      
    }
}