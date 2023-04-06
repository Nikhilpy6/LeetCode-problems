class Solution {
   
    private boolean dfs(int[][] grid ,int i,int j){
      int rows = grid.length, cols = grid[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols) {
            return false;
        }
        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1; // mark as visited
        boolean left = dfs(grid,i, j-1), right = dfs(grid,i, j+1);
        boolean up = dfs(grid,i-1, j), down = dfs(grid,i+1, j);
        return left && right && up && down;
    }
  
  
    public int closedIsland(int[][] grid) {
   
      int cnt=0;
      boolean closed;
        for(int i=1;i<grid.length;i++){
          for(int j=1;j<grid[0].length;j++){
            if(grid[i][j]==0 && dfs(grid,i,j))
                cnt++;              
            }
          }
        
      return cnt;
    }
}