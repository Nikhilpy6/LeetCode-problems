class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[0].length-1;
      while(c>=0 && r<=matrix.length-1){
        if(matrix[r][c]==target)return true;
        else if(matrix[r][c]>target)c--;
        else r++;
      }
      return false;
    }
}