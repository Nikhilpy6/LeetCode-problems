class Solution {
  
    void dfs(int src,int []vis,List<List<Integer>>adjlist){
      vis[src]=1;
      for(int ngh:adjlist.get(src) ){
        if(vis[ngh]==0){
          dfs(ngh,vis,adjlist);
        }
      }
    }
  
  
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adjlist= new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
          adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
          for(int j=0;j<isConnected[0].length;j++){
            if(isConnected[i][j]==1 && i!=j){
              adjlist.get(i).add(j);
              adjlist.get(j).add(i);
            }
          }
        }
      int cnt=0;
      int n=isConnected.length;
      int vis[]=new int[n];
      for(int i=0;i<n;i++){
        if(vis[i]==0){
          dfs(i,vis,adjlist);
          cnt++;
        }
      }
      return cnt;
        
    }
}