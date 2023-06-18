class Solution {
    int mod = (int)1e9+7;
    long[][] cache;
    
    public int countPaths(int[][] grid) {
        long sum = 0;
        cache = new long[grid.length][grid[0].length];
		// calculate the paths from each cell as start cell
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                sum += dfs(grid, i, j, 0);
                sum %= mod;
            }
        }
        return (int)sum;
    }
    
    private long dfs(int[][] grid, int row, int col, int prev){
		// the indices are out of range || the cell has been visited || it does not strictly increase
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0 || grid[row][col] <= prev){
            return 0;
        }
		// use cache to get rid of duplicate calculation
        if(cache[row][col] != 0){
            return cache[row][col];
        }
        long sum = 1;
        int temp = grid[row][col];
		// lock the cell
        grid[row][col] = 0;
        sum += dfs(grid, row - 1, col, temp);
        sum += dfs(grid, row + 1, col, temp);
        sum += dfs(grid, row, col + 1, temp);
        sum += dfs(grid, row, col - 1, temp);
		// the answer may be very large
        sum %= mod; 
		// unlock the cell
        grid[row][col] = temp;
		// update the cache
        cache[row][col] = sum;
        return sum;
    }
}