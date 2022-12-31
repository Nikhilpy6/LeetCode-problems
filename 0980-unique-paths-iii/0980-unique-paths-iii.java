class Solution {
    int m; //number of rows in grid
    int n; //number of columns in grid
    int openSquares; //number of open cells in grid
    int numPaths; //number of valid paths from the starting point to the ending point
    public int uniquePathsIII(int[][] grid) {
        int startRow = 0;
        int startCol = 0;
        int count = 0;
        
        m = grid.length;
        n = grid[0].length;
        
        //find the starting point and count the number of open cells
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){ //found the starting point, which is also an open cell
                    startRow = i;
                    startCol = j;
                    openSquares++;
                }else if(grid[i][j] == 0){ //found an open cell
                    openSquares++;
                }        
            }
        }
        //note: the reason we do not consider the end point as an open cell is because we terminate our 
        //      search at that point and don't increase our counter
        
        dfs(startRow, startCol, grid, 0);
        return numPaths;
    }
    
    private void dfs(int row, int col, int[][] grid, int count){
        //base case --> if [row][col] is outside of grid, is an obstacle cell or has been visited
        //              (means the same as an obstacle), we stop our DFS and return to the previous recursive call
        if(row < 0 || row > m-1 || col < 0 || col > n-1 || grid[row][col] == -1){
            return;
        }
        
        //base case --> if we reached our endpoint, and we have visited all open cells, we increment numPaths before
        //              returning, otherwise, we just return since the path was invalid
        if(grid[row][col] == 2){
            if(count == openSquares){
                numPaths++;
            }
            return;
        }
        
        //mark the current cell as visited by essentially placing an obstacle there
        grid[row][col] = -1;
        
        //call the dfs on all 4 adjacent cells, passing in count + 1 since we visited a new cell
        dfs(row-1, col, grid, count + 1);
        dfs(row+1, col, grid, count + 1);
        dfs(row, col-1, grid, count + 1);
        dfs(row, col+1, grid, count + 1);
        
        //unmark the current cell by essentially removing the obstacle
        grid[row][col] = 0;
    }
}