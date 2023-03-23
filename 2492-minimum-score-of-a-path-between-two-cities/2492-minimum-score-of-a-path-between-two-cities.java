class Solution{
    List<List<int[]>> adj;
    boolean visit[];
    int dfs(int s,int curr){
        if(visit[s]) return Integer.MAX_VALUE;
        visit[s] = true;
        for(var c:adj.get(s)){
            curr = Math.min(curr,c[1]);
            curr = Math.min(curr,dfs(c[0],curr));
        }
        return curr;
    }
    public int minScore(int n, int[][] roads) {
        adj = new ArrayList<>();
        visit = new boolean[n];
        for(int i = 0;i < n;i++){
            adj.add(new ArrayList<>());
        }
        for(var r:roads){
            adj.get(r[0] - 1).add(new int[]{r[1] - 1,r[2]});
            adj.get(r[1] - 1).add(new int[]{r[0] - 1,r[2]});
        }
        return dfs(0,Integer.MAX_VALUE);
    }
}