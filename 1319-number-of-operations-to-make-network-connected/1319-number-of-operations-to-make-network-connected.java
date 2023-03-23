class Solution {
    
    private int dfs(int i,List<List<Integer>>adjlis,boolean vis[]){
      if(vis[i]==true)return 0;
        vis[i]=true;
      for(int ngh:adjlis.get(i)){
        dfs(ngh,adjlis,vis);
      }
      
      return 1;
    }
    public int makeConnected(int n, int[][] connections) {
      if(connections.length<n-1)return -1;
      boolean []vis=new boolean[n];
        int sum=0;
      List<List<Integer>> adjlis=new ArrayList<>();
      for(int i=0;i<n;i++){
        adjlis.add(new ArrayList<>());
      }
      for(int i=0;i<connections.length;i++){
        int u=connections[i][0];
        int v=connections[i][1];
        adjlis.get(u).add(v);
        adjlis.get(v).add(u);
      }
      
      for(int no=0;no<n;no++){
        sum+=dfs(no,adjlis,vis);
      }
      return sum-1;
    }
}