class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        // Topological sorting
        // graph problem
      
      int indegree[] = new int[n];
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }
      
      int maxTime[] = new int[n];
      
      for(int i=0;i<relations.length;i++){ //inegree of each node
        
        int u = relations[i][0]-1; // taking 0th based
        int v = relations[i][1]-1;
        
        adj.get(u).add(v);
        indegree[v]++;
        
      }
      
      
      Queue<Integer> qu = new LinkedList<>();
      for(int i=0;i<n;i++){
        if(indegree[i]==0){
          qu.add(i);
          maxTime[i]=time[i];
        }
      }
      
      while(!qu.isEmpty()){
        
        int cu =  qu.peek();
        qu.poll();
        
        for(int i:adj.get(cu)){
          indegree[i]--;
          
          maxTime[i] = Math.max(maxTime[i] , maxTime[cu] + time[i]);
          if(indegree[i]==0)qu.add(i);
          
        }
        
        
      }
      
      return Arrays.stream(maxTime).max().getAsInt();
      
      
      
      
      
    }
}