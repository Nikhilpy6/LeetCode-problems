class Solution {
    public int countNegatives(int[][] grid) {
        int ans=0;
        int i=grid.length-1;
        int j=0;
        while(i>=0){
            while(j<grid[0].length && grid[i][j]>=0) j++;
            ans+=grid[0].length - j;
            i--;
        }
        return ans;
    }
}