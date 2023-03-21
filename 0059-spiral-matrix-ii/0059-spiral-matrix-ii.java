class Solution {
     
    public int[][] generateMatrix(int n) {
      int [][]ans= new int[n][n];
        int rs=0;
        int cs=0;
        int re=n-1;
        int ce=n-1;
        int val=1;
      while(rs<=re && cs<=ce){
        for(int i=cs;i<=ce;i++){
          ans[rs][i]=val;
          val++;
        }
        rs++;
        for(int i=rs;i<=re;i++){
          ans[i][ce]=val;
          val++;
        }
        ce--;
        for(int i=ce;i>=cs;i--){
          if(rs<=re)
            ans[re][i]=val++;
        }
        re--;
        for(int i=re;i>=rs;i--){
          if(cs<=ce)
            ans[i][cs]=val++;
        }
        cs++;
      }
      
      return ans;
    }
}
 
    