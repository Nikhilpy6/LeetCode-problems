class Solution {
    //private int cnt=0;
    public long countPairs(int n, int[][] edges) {
        int vis[]=new int[n];
        long ans=0;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i[]:edges){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            
            if(vis[i]==0){
                 //cnt=1;
               // vis[i]=1;
                
                int v=dfs(i,adj,vis);
                list.add(v);
            }
        }
        long sum=0;
        for(int a:list){
            sum+=a;
        }
        for(int i:list){
            sum-=i;
            ans+=i*sum;
        }
        return ans;
    }
    int dfs(int i,List<List<Integer>> adj,int vis[]){
        vis[i]=1;
        int cnt=1;
        for(int v:adj.get(i)){
            
            if(vis[v]==0){
                //vis[v]=1;
                
                cnt=cnt+dfs(v,adj,vis);

            }
        }
        return cnt;
    }
}