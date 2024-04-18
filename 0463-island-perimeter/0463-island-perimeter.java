class Solution {
    
    int ans = 0;
  
    public void dfs(int[][] grid,int i,int j){
      if(i<0 || i>=grid.length || j<0 ||j>=grid[0].length || grid[i][j]==0){
        ans++;
        return;
      }
      
      if(grid[i][j]==-1){
        return ; //visited
      }
      
      grid[i][j]=-1; //mark visited
      
      dfs(grid,i+1,j);
      dfs(grid,i-1,j);
      dfs(grid,i,j+1);
      dfs(grid,i,j-1);
      
    }
    
    public int islandPerimeter(int[][] grid) {
        // return 8;
      
      int m = grid.length;
      int n = grid[0].length;
      
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          if(grid[i][j]==1){
            
            dfs(grid,i,j);
            return ans;
          }
          
        }
      }
      return -1;
    }
}