class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
          graph.add(new ArrayList<>());
        }
        for(int[] edge: edges) {
          graph.get(edge[0]).add(edge[1]);
          graph.get(edge[1]).add(edge[0]);
	}
      int visited[]=new int[n];
        Queue<Integer> qu = new LinkedList<>();
      
      qu.offer(source);
      while(!qu.isEmpty()){
        int cur = qu.poll();
        if(cur==destination)return true;
        visited[cur]=1;
        for(int ne:graph.get(cur)){
          if(visited[ne]!=1)qu.offer(ne);
        }
      }
      return false;
    }
}