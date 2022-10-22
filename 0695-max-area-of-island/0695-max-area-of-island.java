class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int count=1;
                if(grid[i][j]==1){
                  max=Math.max(max, count_isLand(grid,i,j));
                     } 
                    
            }       
        }
        return max;
    }
    int count_isLand(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j]!=1 )
            return 0 ;
        
        grid[i][j]=2;
       return (1+ count_isLand(grid,i-1,j) + count_isLand(grid,i+1,j) + count_isLand(grid,i,j-1) + count_isLand(grid,i,j+1) );
            
    }
}