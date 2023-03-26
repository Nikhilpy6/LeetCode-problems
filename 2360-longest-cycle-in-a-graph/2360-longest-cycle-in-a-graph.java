class Solution {
    private int maxi[];
    private int ans=-1;
    private void dfs(int i,int []edges,boolean vis[],int dist,boolean ex[]){
      if(i!=-1){
        if(vis[i]==false){
          vis[i]=true;
          ex[i]=true;
          maxi[i]=dist;
          dfs(edges[i],edges,vis,dist+1,ex);
        }
        else if(ex[i]==true){
          ans=Math.max(ans,dist-maxi[i]);
          
        }
        ex[i]=false;
      }
     
      
    }
    public int longestCycle(int[] edges) {
        
      maxi=new int[edges.length];
      Arrays.fill(maxi,-1);           
      boolean[] vis= new boolean[edges.length];
      boolean []ex = new boolean[edges.length];
      Arrays.fill(maxi,0);
      for(int i=0;i<edges.length;i++){
        //int a=edges[i];
          if(vis[i]==false)
            dfs(i,edges,vis,0,ex);        
      }
      
      return ans;
    }
}