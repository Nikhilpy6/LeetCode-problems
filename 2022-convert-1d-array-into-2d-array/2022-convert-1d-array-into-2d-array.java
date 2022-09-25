class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][] = new int[m][n];
      int row=0;
      int col=0;
      if(original.length>n*m || original.length<m*n)return new int[0][0];
      for(int i=0;i<original.length;i++){
         ans[row][col]=original[i];
        col+=1;
        
        if(col==n ){
          row+=1;
          col=0;
        }
       
        
          
      }
      return ans;
    }
}