class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]=new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int cur=q.poll();
            visited[cur]=true;
            for(int v:rooms.get(cur)){
                if(!visited[v]){
                    q.add(v);
                }
            }
        }
        
        for(boolean ans:visited){
            if(ans!=true)
                return false;
        }
        return true;
    }
}