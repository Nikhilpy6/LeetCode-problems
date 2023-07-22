class Solution {
    int dir[][]={{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,-1},{-2,1}};
  double[][][] map;
    int N;
    public double solve(int r,int c,int k){
      if(r<0 || r>=N || c<0 || c>=N )
        return 0;
      
      if(k==0)
        return 1;
      
      String key=Integer.toString(k)+"_"+Integer.toString(r)+"_"+Integer.toString(c);
      
      if(map[k][r][c]!=0){
        return map[k][r][c];
      }
      double ans=0;
      for(int d[]:dir){
        int nr=r+d[0];
        int nc=c+d[1];
        
        ans+=(double)(solve(nr,nc,k-1));
        
      }
      
      return map[k][r][c]=(ans/(8.0));
      
      
      
    }
   
    public double knightProbability(int n, int k, int row, int column) {
      N=n;
      map =new double[k+1][n][n];
        return solve(row,column,k);
    }
}