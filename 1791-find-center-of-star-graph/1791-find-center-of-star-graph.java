class Solution {
    public int findCenter(int[][] edges) {
        int a1=edges[0][0],a2=edges[0][1];
        if(edges[1][0]==a1 || edges[1][1]==a1)return a1;
        else
          return a2;
      
      
    }
}