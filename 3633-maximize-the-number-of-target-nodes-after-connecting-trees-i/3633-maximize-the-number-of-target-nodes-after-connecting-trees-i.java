class Solution {
    public int dfs(int i, List<List<Integer>> adj,int k,int parent){
        if(k<0){
            return 0;
        }
        int cnt=1;
        for(int ngh:adj.get(i)){
            if(parent!=ngh)
                cnt+=dfs(ngh,adj,k-1,i);
        }
        return cnt;
    }
    
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        List<List<Integer>> adj1 = new ArrayList<>();
        List<List<Integer>> adj2 = new ArrayList<>();
            
        int n = edges1.length+1;
        int m = edges2.length+1;
        
        for(int i=0;i<n;i++){
            adj1.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            adj2.add(new ArrayList<>());
        }
        for(int e[]:edges1){
            int u = e[0];
            int v = e[1];
            adj1.get(u).add(v);
            adj1.get(v).add(u);
        }
        for(int e[]:edges2){
            int u = e[0];
            int v = e[1];
            adj2.get(u).add(v);
            adj2.get(v).add(u);
        }

        int max=0;
        int res1[] = new int[n];
        for(int i=0;i<n;i++){
            res1[i] = dfs(i,adj1,k,-1);
            
            
        }

        int res2[] = new int[m];
        for(int i=0;i<m;i++){
            res2[i] = dfs(i,adj2,k-1,-1);
            max = Math.max(res2[i],max);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
           ans[i]=res1[i]+max;
        }
        return ans;
    }
}