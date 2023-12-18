class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int n = grid.length;
      int m =n*n;
      int ans[]=new int[2];
      Set<Integer> s = new  HashSet<>();
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
           if(s.contains(grid[i][j])){
             ans[0]=grid[i][j];
           }
           s.add(grid[i][j]);
         }
       }
      
      for(int i=1;i<=m;i++){
        if(!s.contains(i)){
          ans[1]=i;
          break;
        }
      }
      return ans;
    }
}