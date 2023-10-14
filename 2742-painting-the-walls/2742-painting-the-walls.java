class Solution {
    int t[][];
  public int solve(int idx ,int r,int[] cost,int[] time){
    
    if(r<=0)return 0;
    
    if(idx==cost.length)
      return (int)(1e9);
    
    
    
    
    if(t[idx][r]!=-1)return t[idx][r];
    
    int paid = cost[idx] + solve(idx+1,r-1-time[idx],cost,time);
    int no_paid = solve(idx+1,r,cost,time);
    
    return t[idx][r]= Math.min(paid,no_paid);
    
  }
  
  
    public int paintWalls(int[] cost, int[] time) {
          
      t = new int[501][501];
      for(int a[]:t){
        Arrays.fill(a,-1);
      }
      
      int n = cost.length;
      return solve(0,n,cost,time);
    }
}