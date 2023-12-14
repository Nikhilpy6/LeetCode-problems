class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
      
      int ro[] = new int[n];
      int co[] = new int[m];
      
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(grid[i][j]==1){
            ro[i]++;
            co[j]++;
          }
        }
      }
      int res[][]=new int[n][m];
      int t = m+n;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          res[i][j] = 2*ro[i]+ 2*co[j] -t ;
        }
      }
      return res;
    }
}