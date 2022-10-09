class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      int n=triangle.size();
       // int dp[][]=new int[n][n];
      int prev[]=new int[n];
      for(int j=0;j<n;j++){
        prev[j]=triangle.get(n-1).get(j);
      }
      for(int i=n-2;i>=0;i--){
        int curr[]=new int[n];
        for(int j=i;j>=0;j--){
          int val=triangle.get(i).get(j);
          int down=val+prev[j];
          int diag=val+prev[j+1];
          curr[j]=Math.min(down,diag);
        }
        prev=curr;
      }
      return prev[0];
    }
}