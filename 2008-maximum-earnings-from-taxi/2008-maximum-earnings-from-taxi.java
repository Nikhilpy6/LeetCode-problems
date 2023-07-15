class Solution {
    long t[];
    public long solve(int[][] rides, int idx, int n ){
      if(idx==rides.length)return 0;
      if(t[idx]!=-1l)return t[idx];
      long skip=solve(rides,idx+1,n);
      
      long val=rides[idx][1]-rides[idx][0]+rides[idx][2];
      int i=idx+1;
      for(;i<rides.length;i++){
        if(rides[idx][1]<=rides[i][0])
          break;
        
      }
      long take=val + solve(rides,i,rides[idx][1]);
      
      return t[idx]=Math.max(take,skip);
      
    }
  
  
    public long maxTaxiEarnings(int n, int[][] rides) {
       t=new long[rides.length];
      Arrays.fill(t,-1l);
      
        Arrays.sort(rides, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        return solve(rides,0,n);
      
    }
}